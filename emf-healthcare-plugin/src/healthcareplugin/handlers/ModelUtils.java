package healthcareplugin.handlers;

import Healthcare.Appointment;
import Healthcare.AppointmentStatus;
import Healthcare.HealthcareFactory;
import Healthcare.HealthcarePackage;
import Healthcare.AppointmentType;
import Healthcare.Patient;
import Healthcare.Employee;

import java.io.IOException;
import java.time.Duration;
import java.util.Collections;
import java.util.Date;
import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class ModelUtils {
	public final static String FILENAME = "testModelUtils.xmi";
	
    public static Appointment create(Date startDate, Date endDate, AppointmentStatus status, 
    		AppointmentType type, Patient patient, Employee practitioner){
        Appointment apt = HealthcareFactory.eINSTANCE.createAppointment();
        apt.setStart(startDate);
        apt.setEnd(endDate);
        apt.setStatus(status);
        apt.setType(type);
        apt.setPatient(patient);
        apt.setPractitioner(practitioner);
        return apt;
    }
    
    public static void serializeModel(Appointment apt, String filename) {
    	Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
    	Map<String, Object> map = reg.getExtensionToFactoryMap();
    	map.put("xmi", new XMIResourceFactoryImpl());
    	
    	ResourceSet set = new ResourceSetImpl();
    	Resource resource = set.createResource(URI.createURI(filename));
    	resource.getContents().add(apt);
    	
    	try {
    		resource.save(Collections.EMPTY_MAP);
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
    }
    
    public static Appointment load(String fileName) {
		EPackage.Registry.INSTANCE.put(HealthcarePackage.eNS_URI, HealthcarePackage.eINSTANCE);
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.getResource(URI.createURI(fileName), true);
		
		Appointment apt = (Appointment) resource.getContents().get(0);
		System.out.println(apt);
		return apt;
	}
    
    public static Diagnostic validate(Appointment apt) {
    	return Diagnostician.INSTANCE.validate(apt);
    }
    
    public static void main(String[] args) {
        Date startDate = new Date();
        Date endDate = Date.from(startDate.toInstant().plus(Duration.ofHours(2)));
        Patient patient = HealthcareFactory.eINSTANCE.createPatient();
        Employee practitioner = HealthcareFactory.eINSTANCE.createEmployee();
        
        Appointment apt = create(startDate, endDate, AppointmentStatus.BOOKED,
        		AppointmentType.ROUTINE, patient, practitioner);
        serializeModel(apt, FILENAME);
        Appointment loadedApt = load(FILENAME);
        
        Diagnostic diagnostic = validate(loadedApt);
        if (diagnostic.getSeverity() != Diagnostic.ERROR) {
        	System.out.println("The loaded appointment model is valid");
        } else {
        	System.out.println("The loaded appointment model has error");
        }
        System.out.println("Patient:" + apt.getPatient().getName());
        System.out.println("Practitioner:" + apt.getPractitioner().getName());
    }
}
