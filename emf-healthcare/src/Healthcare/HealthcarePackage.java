/**
 */
package Healthcare;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Healthcare.HealthcareFactory
 * @model kind="package"
 * @generated
 */
public interface HealthcarePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Healthcare";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://it.univaq.disim.it";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "H";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HealthcarePackage eINSTANCE = Healthcare.impl.HealthcarePackageImpl.init();

	/**
	 * The meta object id for the '{@link Healthcare.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Healthcare.impl.NamedElementImpl
	 * @see Healthcare.impl.HealthcarePackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Healthcare.impl.OrganizationImpl <em>Organization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Healthcare.impl.OrganizationImpl
	 * @see Healthcare.impl.HealthcarePackageImpl#getOrganization()
	 * @generated
	 */
	int ORGANIZATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Healthcare.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Healthcare.impl.ConditionImpl
	 * @see Healthcare.impl.HealthcarePackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__STATUS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__SEVERITY = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Healthcare.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Healthcare.impl.PersonImpl
	 * @see Healthcare.impl.HealthcarePackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Gender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__GENDER = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Healthcare.impl.EducationalInstituteImpl <em>Educational Institute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Healthcare.impl.EducationalInstituteImpl
	 * @see Healthcare.impl.HealthcarePackageImpl#getEducationalInstitute()
	 * @generated
	 */
	int EDUCATIONAL_INSTITUTE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATIONAL_INSTITUTE__NAME = ORGANIZATION__NAME;

	/**
	 * The number of structural features of the '<em>Educational Institute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATIONAL_INSTITUTE_FEATURE_COUNT = ORGANIZATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Educational Institute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATIONAL_INSTITUTE_OPERATION_COUNT = ORGANIZATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Healthcare.impl.DepartmentImpl <em>Department</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Healthcare.impl.DepartmentImpl
	 * @see Healthcare.impl.HealthcarePackageImpl#getDepartment()
	 * @generated
	 */
	int DEPARTMENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Department</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Department</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Healthcare.impl.HospitalImpl <em>Hospital</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Healthcare.impl.HospitalImpl
	 * @see Healthcare.impl.HealthcarePackageImpl#getHospital()
	 * @generated
	 */
	int HOSPITAL = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Staff</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL__STAFF = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hospital</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Hospital</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Healthcare.impl.PatientImpl <em>Patient</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Healthcare.impl.PatientImpl
	 * @see Healthcare.impl.HealthcarePackageImpl#getPatient()
	 * @generated
	 */
	int PATIENT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__NAME = PERSON__NAME;

	/**
	 * The feature id for the '<em><b>Gender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__GENDER = PERSON__GENDER;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__CONDITION = PERSON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Observation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__OBSERVATION = PERSON_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Patient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_FEATURE_COUNT = PERSON_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Patient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Healthcare.impl.ObservationImpl <em>Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Healthcare.impl.ObservationImpl
	 * @see Healthcare.impl.HealthcarePackageImpl#getObservation()
	 * @generated
	 */
	int OBSERVATION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__VALUE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Healthcare.impl.EmployeeImpl <em>Employee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Healthcare.impl.EmployeeImpl
	 * @see Healthcare.impl.HealthcarePackageImpl#getEmployee()
	 * @generated
	 */
	int EMPLOYEE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__NAME = PERSON__NAME;

	/**
	 * The feature id for the '<em><b>Gender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__GENDER = PERSON__GENDER;

	/**
	 * The feature id for the '<em><b>Specialty</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__SPECIALTY = PERSON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Qualification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__QUALIFICATION = PERSON_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_FEATURE_COUNT = PERSON_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Healthcare.impl.QualificationImpl <em>Qualification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Healthcare.impl.QualificationImpl
	 * @see Healthcare.impl.HealthcarePackageImpl#getQualification()
	 * @generated
	 */
	int QUALIFICATION = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFICATION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Issue Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFICATION__ISSUE_DATE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Issuer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFICATION__ISSUER = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Qualification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFICATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Qualification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFICATION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Healthcare.impl.EmployeeRoleImpl <em>Employee Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Healthcare.impl.EmployeeRoleImpl
	 * @see Healthcare.impl.HealthcarePackageImpl#getEmployeeRole()
	 * @generated
	 */
	int EMPLOYEE_ROLE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_ROLE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_ROLE__ROLE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Employee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_ROLE__EMPLOYEE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Employee Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_ROLE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Employee Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_ROLE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Healthcare.impl.AppointmentImpl <em>Appointment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Healthcare.impl.AppointmentImpl
	 * @see Healthcare.impl.HealthcarePackageImpl#getAppointment()
	 * @generated
	 */
	int APPOINTMENT = 12;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPOINTMENT__START = 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPOINTMENT__END = 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPOINTMENT__STATUS = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPOINTMENT__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Practitioner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPOINTMENT__PRACTITIONER = 4;

	/**
	 * The feature id for the '<em><b>Patient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPOINTMENT__PATIENT = 5;

	/**
	 * The number of structural features of the '<em>Appointment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPOINTMENT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Appointment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPOINTMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Healthcare.ConditionStatus <em>Condition Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Healthcare.ConditionStatus
	 * @see Healthcare.impl.HealthcarePackageImpl#getConditionStatus()
	 * @generated
	 */
	int CONDITION_STATUS = 13;

	/**
	 * The meta object id for the '{@link Healthcare.ConditionSeverity <em>Condition Severity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Healthcare.ConditionSeverity
	 * @see Healthcare.impl.HealthcarePackageImpl#getConditionSeverity()
	 * @generated
	 */
	int CONDITION_SEVERITY = 14;

	/**
	 * The meta object id for the '{@link Healthcare.ObservationType <em>Observation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Healthcare.ObservationType
	 * @see Healthcare.impl.HealthcarePackageImpl#getObservationType()
	 * @generated
	 */
	int OBSERVATION_TYPE = 15;

	/**
	 * The meta object id for the '{@link Healthcare.AppointmentType <em>Appointment Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Healthcare.AppointmentType
	 * @see Healthcare.impl.HealthcarePackageImpl#getAppointmentType()
	 * @generated
	 */
	int APPOINTMENT_TYPE = 16;

	/**
	 * The meta object id for the '{@link Healthcare.EmployeeSpecialty <em>Employee Specialty</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Healthcare.EmployeeSpecialty
	 * @see Healthcare.impl.HealthcarePackageImpl#getEmployeeSpecialty()
	 * @generated
	 */
	int EMPLOYEE_SPECIALTY = 17;

	/**
	 * The meta object id for the '{@link Healthcare.AppointmentStatus <em>Appointment Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Healthcare.AppointmentStatus
	 * @see Healthcare.impl.HealthcarePackageImpl#getAppointmentStatus()
	 * @generated
	 */
	int APPOINTMENT_STATUS = 18;

	/**
	 * The meta object id for the '{@link Healthcare.Role <em>Role</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Healthcare.Role
	 * @see Healthcare.impl.HealthcarePackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 19;


	/**
	 * Returns the meta object for class '{@link Healthcare.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see Healthcare.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link Healthcare.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Healthcare.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link Healthcare.Organization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organization</em>'.
	 * @see Healthcare.Organization
	 * @generated
	 */
	EClass getOrganization();

	/**
	 * Returns the meta object for class '{@link Healthcare.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see Healthcare.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the attribute '{@link Healthcare.Condition#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see Healthcare.Condition#getStatus()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Status();

	/**
	 * Returns the meta object for the attribute '{@link Healthcare.Condition#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see Healthcare.Condition#getSeverity()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Severity();

	/**
	 * Returns the meta object for class '{@link Healthcare.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see Healthcare.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link Healthcare.Person#isGender <em>Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gender</em>'.
	 * @see Healthcare.Person#isGender()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Gender();

	/**
	 * Returns the meta object for class '{@link Healthcare.EducationalInstitute <em>Educational Institute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Educational Institute</em>'.
	 * @see Healthcare.EducationalInstitute
	 * @generated
	 */
	EClass getEducationalInstitute();

	/**
	 * Returns the meta object for class '{@link Healthcare.Department <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Department</em>'.
	 * @see Healthcare.Department
	 * @generated
	 */
	EClass getDepartment();

	/**
	 * Returns the meta object for class '{@link Healthcare.Hospital <em>Hospital</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hospital</em>'.
	 * @see Healthcare.Hospital
	 * @generated
	 */
	EClass getHospital();

	/**
	 * Returns the meta object for the reference list '{@link Healthcare.Hospital#getStaff <em>Staff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Staff</em>'.
	 * @see Healthcare.Hospital#getStaff()
	 * @see #getHospital()
	 * @generated
	 */
	EReference getHospital_Staff();

	/**
	 * Returns the meta object for class '{@link Healthcare.Patient <em>Patient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Patient</em>'.
	 * @see Healthcare.Patient
	 * @generated
	 */
	EClass getPatient();

	/**
	 * Returns the meta object for the reference list '{@link Healthcare.Patient#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Condition</em>'.
	 * @see Healthcare.Patient#getCondition()
	 * @see #getPatient()
	 * @generated
	 */
	EReference getPatient_Condition();

	/**
	 * Returns the meta object for the reference list '{@link Healthcare.Patient#getObservation <em>Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Observation</em>'.
	 * @see Healthcare.Patient#getObservation()
	 * @see #getPatient()
	 * @generated
	 */
	EReference getPatient_Observation();

	/**
	 * Returns the meta object for class '{@link Healthcare.Observation <em>Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Observation</em>'.
	 * @see Healthcare.Observation
	 * @generated
	 */
	EClass getObservation();

	/**
	 * Returns the meta object for the attribute '{@link Healthcare.Observation#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see Healthcare.Observation#getValue()
	 * @see #getObservation()
	 * @generated
	 */
	EAttribute getObservation_Value();

	/**
	 * Returns the meta object for the attribute '{@link Healthcare.Observation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see Healthcare.Observation#getType()
	 * @see #getObservation()
	 * @generated
	 */
	EAttribute getObservation_Type();

	/**
	 * Returns the meta object for class '{@link Healthcare.Employee <em>Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Employee</em>'.
	 * @see Healthcare.Employee
	 * @generated
	 */
	EClass getEmployee();

	/**
	 * Returns the meta object for the attribute list '{@link Healthcare.Employee#getSpecialty <em>Specialty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Specialty</em>'.
	 * @see Healthcare.Employee#getSpecialty()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_Specialty();

	/**
	 * Returns the meta object for the reference list '{@link Healthcare.Employee#getQualification <em>Qualification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Qualification</em>'.
	 * @see Healthcare.Employee#getQualification()
	 * @see #getEmployee()
	 * @generated
	 */
	EReference getEmployee_Qualification();

	/**
	 * Returns the meta object for class '{@link Healthcare.Qualification <em>Qualification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qualification</em>'.
	 * @see Healthcare.Qualification
	 * @generated
	 */
	EClass getQualification();

	/**
	 * Returns the meta object for the attribute '{@link Healthcare.Qualification#getIssueDate <em>Issue Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issue Date</em>'.
	 * @see Healthcare.Qualification#getIssueDate()
	 * @see #getQualification()
	 * @generated
	 */
	EAttribute getQualification_IssueDate();

	/**
	 * Returns the meta object for the reference '{@link Healthcare.Qualification#getIssuer <em>Issuer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Issuer</em>'.
	 * @see Healthcare.Qualification#getIssuer()
	 * @see #getQualification()
	 * @generated
	 */
	EReference getQualification_Issuer();

	/**
	 * Returns the meta object for class '{@link Healthcare.EmployeeRole <em>Employee Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Employee Role</em>'.
	 * @see Healthcare.EmployeeRole
	 * @generated
	 */
	EClass getEmployeeRole();

	/**
	 * Returns the meta object for the attribute '{@link Healthcare.EmployeeRole#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see Healthcare.EmployeeRole#getRole()
	 * @see #getEmployeeRole()
	 * @generated
	 */
	EAttribute getEmployeeRole_Role();

	/**
	 * Returns the meta object for the reference '{@link Healthcare.EmployeeRole#getEmployee <em>Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Employee</em>'.
	 * @see Healthcare.EmployeeRole#getEmployee()
	 * @see #getEmployeeRole()
	 * @generated
	 */
	EReference getEmployeeRole_Employee();

	/**
	 * Returns the meta object for class '{@link Healthcare.Appointment <em>Appointment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Appointment</em>'.
	 * @see Healthcare.Appointment
	 * @generated
	 */
	EClass getAppointment();

	/**
	 * Returns the meta object for the attribute '{@link Healthcare.Appointment#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see Healthcare.Appointment#getStart()
	 * @see #getAppointment()
	 * @generated
	 */
	EAttribute getAppointment_Start();

	/**
	 * Returns the meta object for the attribute '{@link Healthcare.Appointment#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see Healthcare.Appointment#getEnd()
	 * @see #getAppointment()
	 * @generated
	 */
	EAttribute getAppointment_End();

	/**
	 * Returns the meta object for the attribute '{@link Healthcare.Appointment#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see Healthcare.Appointment#getStatus()
	 * @see #getAppointment()
	 * @generated
	 */
	EAttribute getAppointment_Status();

	/**
	 * Returns the meta object for the attribute '{@link Healthcare.Appointment#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see Healthcare.Appointment#getType()
	 * @see #getAppointment()
	 * @generated
	 */
	EAttribute getAppointment_Type();

	/**
	 * Returns the meta object for the reference '{@link Healthcare.Appointment#getPractitioner <em>Practitioner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Practitioner</em>'.
	 * @see Healthcare.Appointment#getPractitioner()
	 * @see #getAppointment()
	 * @generated
	 */
	EReference getAppointment_Practitioner();

	/**
	 * Returns the meta object for the reference '{@link Healthcare.Appointment#getPatient <em>Patient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Patient</em>'.
	 * @see Healthcare.Appointment#getPatient()
	 * @see #getAppointment()
	 * @generated
	 */
	EReference getAppointment_Patient();

	/**
	 * Returns the meta object for enum '{@link Healthcare.ConditionStatus <em>Condition Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Condition Status</em>'.
	 * @see Healthcare.ConditionStatus
	 * @generated
	 */
	EEnum getConditionStatus();

	/**
	 * Returns the meta object for enum '{@link Healthcare.ConditionSeverity <em>Condition Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Condition Severity</em>'.
	 * @see Healthcare.ConditionSeverity
	 * @generated
	 */
	EEnum getConditionSeverity();

	/**
	 * Returns the meta object for enum '{@link Healthcare.ObservationType <em>Observation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Observation Type</em>'.
	 * @see Healthcare.ObservationType
	 * @generated
	 */
	EEnum getObservationType();

	/**
	 * Returns the meta object for enum '{@link Healthcare.AppointmentType <em>Appointment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Appointment Type</em>'.
	 * @see Healthcare.AppointmentType
	 * @generated
	 */
	EEnum getAppointmentType();

	/**
	 * Returns the meta object for enum '{@link Healthcare.EmployeeSpecialty <em>Employee Specialty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Employee Specialty</em>'.
	 * @see Healthcare.EmployeeSpecialty
	 * @generated
	 */
	EEnum getEmployeeSpecialty();

	/**
	 * Returns the meta object for enum '{@link Healthcare.AppointmentStatus <em>Appointment Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Appointment Status</em>'.
	 * @see Healthcare.AppointmentStatus
	 * @generated
	 */
	EEnum getAppointmentStatus();

	/**
	 * Returns the meta object for enum '{@link Healthcare.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Role</em>'.
	 * @see Healthcare.Role
	 * @generated
	 */
	EEnum getRole();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HealthcareFactory getHealthcareFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Healthcare.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Healthcare.impl.NamedElementImpl
		 * @see Healthcare.impl.HealthcarePackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link Healthcare.impl.OrganizationImpl <em>Organization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Healthcare.impl.OrganizationImpl
		 * @see Healthcare.impl.HealthcarePackageImpl#getOrganization()
		 * @generated
		 */
		EClass ORGANIZATION = eINSTANCE.getOrganization();

		/**
		 * The meta object literal for the '{@link Healthcare.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Healthcare.impl.ConditionImpl
		 * @see Healthcare.impl.HealthcarePackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__STATUS = eINSTANCE.getCondition_Status();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__SEVERITY = eINSTANCE.getCondition_Severity();

		/**
		 * The meta object literal for the '{@link Healthcare.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Healthcare.impl.PersonImpl
		 * @see Healthcare.impl.HealthcarePackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Gender</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__GENDER = eINSTANCE.getPerson_Gender();

		/**
		 * The meta object literal for the '{@link Healthcare.impl.EducationalInstituteImpl <em>Educational Institute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Healthcare.impl.EducationalInstituteImpl
		 * @see Healthcare.impl.HealthcarePackageImpl#getEducationalInstitute()
		 * @generated
		 */
		EClass EDUCATIONAL_INSTITUTE = eINSTANCE.getEducationalInstitute();

		/**
		 * The meta object literal for the '{@link Healthcare.impl.DepartmentImpl <em>Department</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Healthcare.impl.DepartmentImpl
		 * @see Healthcare.impl.HealthcarePackageImpl#getDepartment()
		 * @generated
		 */
		EClass DEPARTMENT = eINSTANCE.getDepartment();

		/**
		 * The meta object literal for the '{@link Healthcare.impl.HospitalImpl <em>Hospital</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Healthcare.impl.HospitalImpl
		 * @see Healthcare.impl.HealthcarePackageImpl#getHospital()
		 * @generated
		 */
		EClass HOSPITAL = eINSTANCE.getHospital();

		/**
		 * The meta object literal for the '<em><b>Staff</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOSPITAL__STAFF = eINSTANCE.getHospital_Staff();

		/**
		 * The meta object literal for the '{@link Healthcare.impl.PatientImpl <em>Patient</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Healthcare.impl.PatientImpl
		 * @see Healthcare.impl.HealthcarePackageImpl#getPatient()
		 * @generated
		 */
		EClass PATIENT = eINSTANCE.getPatient();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT__CONDITION = eINSTANCE.getPatient_Condition();

		/**
		 * The meta object literal for the '<em><b>Observation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT__OBSERVATION = eINSTANCE.getPatient_Observation();

		/**
		 * The meta object literal for the '{@link Healthcare.impl.ObservationImpl <em>Observation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Healthcare.impl.ObservationImpl
		 * @see Healthcare.impl.HealthcarePackageImpl#getObservation()
		 * @generated
		 */
		EClass OBSERVATION = eINSTANCE.getObservation();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBSERVATION__VALUE = eINSTANCE.getObservation_Value();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBSERVATION__TYPE = eINSTANCE.getObservation_Type();

		/**
		 * The meta object literal for the '{@link Healthcare.impl.EmployeeImpl <em>Employee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Healthcare.impl.EmployeeImpl
		 * @see Healthcare.impl.HealthcarePackageImpl#getEmployee()
		 * @generated
		 */
		EClass EMPLOYEE = eINSTANCE.getEmployee();

		/**
		 * The meta object literal for the '<em><b>Specialty</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__SPECIALTY = eINSTANCE.getEmployee_Specialty();

		/**
		 * The meta object literal for the '<em><b>Qualification</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYEE__QUALIFICATION = eINSTANCE.getEmployee_Qualification();

		/**
		 * The meta object literal for the '{@link Healthcare.impl.QualificationImpl <em>Qualification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Healthcare.impl.QualificationImpl
		 * @see Healthcare.impl.HealthcarePackageImpl#getQualification()
		 * @generated
		 */
		EClass QUALIFICATION = eINSTANCE.getQualification();

		/**
		 * The meta object literal for the '<em><b>Issue Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALIFICATION__ISSUE_DATE = eINSTANCE.getQualification_IssueDate();

		/**
		 * The meta object literal for the '<em><b>Issuer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALIFICATION__ISSUER = eINSTANCE.getQualification_Issuer();

		/**
		 * The meta object literal for the '{@link Healthcare.impl.EmployeeRoleImpl <em>Employee Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Healthcare.impl.EmployeeRoleImpl
		 * @see Healthcare.impl.HealthcarePackageImpl#getEmployeeRole()
		 * @generated
		 */
		EClass EMPLOYEE_ROLE = eINSTANCE.getEmployeeRole();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE_ROLE__ROLE = eINSTANCE.getEmployeeRole_Role();

		/**
		 * The meta object literal for the '<em><b>Employee</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYEE_ROLE__EMPLOYEE = eINSTANCE.getEmployeeRole_Employee();

		/**
		 * The meta object literal for the '{@link Healthcare.impl.AppointmentImpl <em>Appointment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Healthcare.impl.AppointmentImpl
		 * @see Healthcare.impl.HealthcarePackageImpl#getAppointment()
		 * @generated
		 */
		EClass APPOINTMENT = eINSTANCE.getAppointment();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPOINTMENT__START = eINSTANCE.getAppointment_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPOINTMENT__END = eINSTANCE.getAppointment_End();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPOINTMENT__STATUS = eINSTANCE.getAppointment_Status();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPOINTMENT__TYPE = eINSTANCE.getAppointment_Type();

		/**
		 * The meta object literal for the '<em><b>Practitioner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPOINTMENT__PRACTITIONER = eINSTANCE.getAppointment_Practitioner();

		/**
		 * The meta object literal for the '<em><b>Patient</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPOINTMENT__PATIENT = eINSTANCE.getAppointment_Patient();

		/**
		 * The meta object literal for the '{@link Healthcare.ConditionStatus <em>Condition Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Healthcare.ConditionStatus
		 * @see Healthcare.impl.HealthcarePackageImpl#getConditionStatus()
		 * @generated
		 */
		EEnum CONDITION_STATUS = eINSTANCE.getConditionStatus();

		/**
		 * The meta object literal for the '{@link Healthcare.ConditionSeverity <em>Condition Severity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Healthcare.ConditionSeverity
		 * @see Healthcare.impl.HealthcarePackageImpl#getConditionSeverity()
		 * @generated
		 */
		EEnum CONDITION_SEVERITY = eINSTANCE.getConditionSeverity();

		/**
		 * The meta object literal for the '{@link Healthcare.ObservationType <em>Observation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Healthcare.ObservationType
		 * @see Healthcare.impl.HealthcarePackageImpl#getObservationType()
		 * @generated
		 */
		EEnum OBSERVATION_TYPE = eINSTANCE.getObservationType();

		/**
		 * The meta object literal for the '{@link Healthcare.AppointmentType <em>Appointment Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Healthcare.AppointmentType
		 * @see Healthcare.impl.HealthcarePackageImpl#getAppointmentType()
		 * @generated
		 */
		EEnum APPOINTMENT_TYPE = eINSTANCE.getAppointmentType();

		/**
		 * The meta object literal for the '{@link Healthcare.EmployeeSpecialty <em>Employee Specialty</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Healthcare.EmployeeSpecialty
		 * @see Healthcare.impl.HealthcarePackageImpl#getEmployeeSpecialty()
		 * @generated
		 */
		EEnum EMPLOYEE_SPECIALTY = eINSTANCE.getEmployeeSpecialty();

		/**
		 * The meta object literal for the '{@link Healthcare.AppointmentStatus <em>Appointment Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Healthcare.AppointmentStatus
		 * @see Healthcare.impl.HealthcarePackageImpl#getAppointmentStatus()
		 * @generated
		 */
		EEnum APPOINTMENT_STATUS = eINSTANCE.getAppointmentStatus();

		/**
		 * The meta object literal for the '{@link Healthcare.Role <em>Role</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Healthcare.Role
		 * @see Healthcare.impl.HealthcarePackageImpl#getRole()
		 * @generated
		 */
		EEnum ROLE = eINSTANCE.getRole();

	}

} //HealthcarePackage
