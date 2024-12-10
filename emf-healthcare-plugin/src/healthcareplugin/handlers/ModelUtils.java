package healthcareplugin.handlers;

import Healthcare.Appointment;
import Healthcare.HealthcareFactory;

public class ModelUtils {
    public static Appointment create(){
        Appointment apt = HealthcareFactory.eINSTANCE.createAppointment();
        apt.setStart(null);
        return apt;
    }
}
