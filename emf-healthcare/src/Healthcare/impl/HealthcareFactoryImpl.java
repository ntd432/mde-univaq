/**
 */
package Healthcare.impl;

import Healthcare.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HealthcareFactoryImpl extends EFactoryImpl implements HealthcareFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HealthcareFactory init() {
		try {
			HealthcareFactory theHealthcareFactory = (HealthcareFactory)EPackage.Registry.INSTANCE.getEFactory(HealthcarePackage.eNS_URI);
			if (theHealthcareFactory != null) {
				return theHealthcareFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HealthcareFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthcareFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case HealthcarePackage.HEALTHCARE_SYSTEM: return createHealthcareSystem();
			case HealthcarePackage.CONDITION: return createCondition();
			case HealthcarePackage.EDUCATIONAL_INSTITUTE: return createEducationalInstitute();
			case HealthcarePackage.DEPARTMENT: return createDepartment();
			case HealthcarePackage.HOSPITAL: return createHospital();
			case HealthcarePackage.PATIENT: return createPatient();
			case HealthcarePackage.OBSERVATION: return createObservation();
			case HealthcarePackage.EMPLOYEE: return createEmployee();
			case HealthcarePackage.QUALIFICATION: return createQualification();
			case HealthcarePackage.EMPLOYEE_ROLE: return createEmployeeRole();
			case HealthcarePackage.APPOINTMENT: return createAppointment();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case HealthcarePackage.CONDITION_STATUS:
				return createConditionStatusFromString(eDataType, initialValue);
			case HealthcarePackage.CONDITION_SEVERITY:
				return createConditionSeverityFromString(eDataType, initialValue);
			case HealthcarePackage.OBSERVATION_TYPE:
				return createObservationTypeFromString(eDataType, initialValue);
			case HealthcarePackage.APPOINTMENT_TYPE:
				return createAppointmentTypeFromString(eDataType, initialValue);
			case HealthcarePackage.EMPLOYEE_SPECIALTY:
				return createEmployeeSpecialtyFromString(eDataType, initialValue);
			case HealthcarePackage.APPOINTMENT_STATUS:
				return createAppointmentStatusFromString(eDataType, initialValue);
			case HealthcarePackage.ROLE:
				return createRoleFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case HealthcarePackage.CONDITION_STATUS:
				return convertConditionStatusToString(eDataType, instanceValue);
			case HealthcarePackage.CONDITION_SEVERITY:
				return convertConditionSeverityToString(eDataType, instanceValue);
			case HealthcarePackage.OBSERVATION_TYPE:
				return convertObservationTypeToString(eDataType, instanceValue);
			case HealthcarePackage.APPOINTMENT_TYPE:
				return convertAppointmentTypeToString(eDataType, instanceValue);
			case HealthcarePackage.EMPLOYEE_SPECIALTY:
				return convertEmployeeSpecialtyToString(eDataType, instanceValue);
			case HealthcarePackage.APPOINTMENT_STATUS:
				return convertAppointmentStatusToString(eDataType, instanceValue);
			case HealthcarePackage.ROLE:
				return convertRoleToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HealthcareSystem createHealthcareSystem() {
		HealthcareSystemImpl healthcareSystem = new HealthcareSystemImpl();
		return healthcareSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EducationalInstitute createEducationalInstitute() {
		EducationalInstituteImpl educationalInstitute = new EducationalInstituteImpl();
		return educationalInstitute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Department createDepartment() {
		DepartmentImpl department = new DepartmentImpl();
		return department;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hospital createHospital() {
		HospitalImpl hospital = new HospitalImpl();
		return hospital;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Patient createPatient() {
		PatientImpl patient = new PatientImpl();
		return patient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Observation createObservation() {
		ObservationImpl observation = new ObservationImpl();
		return observation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Employee createEmployee() {
		EmployeeImpl employee = new EmployeeImpl();
		return employee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Qualification createQualification() {
		QualificationImpl qualification = new QualificationImpl();
		return qualification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmployeeRole createEmployeeRole() {
		EmployeeRoleImpl employeeRole = new EmployeeRoleImpl();
		return employeeRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Appointment createAppointment() {
		AppointmentImpl appointment = new AppointmentImpl();
		return appointment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionStatus createConditionStatusFromString(EDataType eDataType, String initialValue) {
		ConditionStatus result = ConditionStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConditionStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionSeverity createConditionSeverityFromString(EDataType eDataType, String initialValue) {
		ConditionSeverity result = ConditionSeverity.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConditionSeverityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationType createObservationTypeFromString(EDataType eDataType, String initialValue) {
		ObservationType result = ObservationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObservationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppointmentType createAppointmentTypeFromString(EDataType eDataType, String initialValue) {
		AppointmentType result = AppointmentType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAppointmentTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmployeeSpecialty createEmployeeSpecialtyFromString(EDataType eDataType, String initialValue) {
		EmployeeSpecialty result = EmployeeSpecialty.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEmployeeSpecialtyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppointmentStatus createAppointmentStatusFromString(EDataType eDataType, String initialValue) {
		AppointmentStatus result = AppointmentStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAppointmentStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role createRoleFromString(EDataType eDataType, String initialValue) {
		Role result = Role.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRoleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HealthcarePackage getHealthcarePackage() {
		return (HealthcarePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HealthcarePackage getPackage() {
		return HealthcarePackage.eINSTANCE;
	}

} //HealthcareFactoryImpl
