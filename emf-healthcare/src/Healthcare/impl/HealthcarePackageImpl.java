/**
 */
package Healthcare.impl;

import Healthcare.Appointment;
import Healthcare.AppointmentStatus;
import Healthcare.AppointmentType;
import Healthcare.Condition;
import Healthcare.ConditionSeverity;
import Healthcare.ConditionStatus;
import Healthcare.Department;
import Healthcare.EducationalInstitute;
import Healthcare.Employee;
import Healthcare.EmployeeRole;
import Healthcare.EmployeeSpecialty;
import Healthcare.HealthcareFactory;
import Healthcare.HealthcarePackage;
import Healthcare.HealthcareSystem;
import Healthcare.Hospital;
import Healthcare.NamedElement;
import Healthcare.Observation;
import Healthcare.ObservationType;
import Healthcare.Organization;
import Healthcare.Patient;
import Healthcare.Person;
import Healthcare.Qualification;
import Healthcare.Role;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HealthcarePackageImpl extends EPackageImpl implements HealthcarePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass healthcareSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass educationalInstituteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass departmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hospitalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass observationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass employeeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass employeeRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appointmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum conditionStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum conditionSeverityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum observationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum appointmentTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum employeeSpecialtyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum appointmentStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum roleEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see Healthcare.HealthcarePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HealthcarePackageImpl() {
		super(eNS_URI, HealthcareFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link HealthcarePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HealthcarePackage init() {
		if (isInited) return (HealthcarePackage)EPackage.Registry.INSTANCE.getEPackage(HealthcarePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredHealthcarePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		HealthcarePackageImpl theHealthcarePackage = registeredHealthcarePackage instanceof HealthcarePackageImpl ? (HealthcarePackageImpl)registeredHealthcarePackage : new HealthcarePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theHealthcarePackage.createPackageContents();

		// Initialize created meta-data
		theHealthcarePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theHealthcarePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(HealthcarePackage.eNS_URI, theHealthcarePackage);
		return theHealthcarePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHealthcareSystem() {
		return healthcareSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHealthcareSystem_Organizations() {
		return (EReference)healthcareSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHealthcareSystem_People() {
		return (EReference)healthcareSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHealthcareSystem_Appointments() {
		return (EReference)healthcareSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrganization() {
		return organizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCondition_Status() {
		return (EAttribute)conditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCondition_Severity() {
		return (EAttribute)conditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPerson() {
		return personEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_Gender() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEducationalInstitute() {
		return educationalInstituteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDepartment() {
		return departmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDepartment_Staff() {
		return (EReference)departmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHospital() {
		return hospitalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHospital_Departments() {
		return (EReference)hospitalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPatient() {
		return patientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPatient_Condition() {
		return (EReference)patientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPatient_Observation() {
		return (EReference)patientEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getObservation() {
		return observationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getObservation_Value() {
		return (EAttribute)observationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getObservation_Type() {
		return (EAttribute)observationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEmployee() {
		return employeeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmployee_Specialty() {
		return (EAttribute)employeeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEmployee_Qualification() {
		return (EReference)employeeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQualification() {
		return qualificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQualification_IssueDate() {
		return (EAttribute)qualificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQualification_Issuer() {
		return (EReference)qualificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEmployeeRole() {
		return employeeRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmployeeRole_Role() {
		return (EAttribute)employeeRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEmployeeRole_Employee() {
		return (EReference)employeeRoleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAppointment() {
		return appointmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAppointment_Start() {
		return (EAttribute)appointmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAppointment_End() {
		return (EAttribute)appointmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAppointment_Status() {
		return (EAttribute)appointmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAppointment_Type() {
		return (EAttribute)appointmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAppointment_Practitioner() {
		return (EReference)appointmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAppointment_Patient() {
		return (EReference)appointmentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getConditionStatus() {
		return conditionStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getConditionSeverity() {
		return conditionSeverityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getObservationType() {
		return observationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAppointmentType() {
		return appointmentTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEmployeeSpecialty() {
		return employeeSpecialtyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAppointmentStatus() {
		return appointmentStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRole() {
		return roleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HealthcareFactory getHealthcareFactory() {
		return (HealthcareFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		healthcareSystemEClass = createEClass(HEALTHCARE_SYSTEM);
		createEReference(healthcareSystemEClass, HEALTHCARE_SYSTEM__ORGANIZATIONS);
		createEReference(healthcareSystemEClass, HEALTHCARE_SYSTEM__PEOPLE);
		createEReference(healthcareSystemEClass, HEALTHCARE_SYSTEM__APPOINTMENTS);

		organizationEClass = createEClass(ORGANIZATION);

		conditionEClass = createEClass(CONDITION);
		createEAttribute(conditionEClass, CONDITION__STATUS);
		createEAttribute(conditionEClass, CONDITION__SEVERITY);

		personEClass = createEClass(PERSON);
		createEAttribute(personEClass, PERSON__GENDER);

		educationalInstituteEClass = createEClass(EDUCATIONAL_INSTITUTE);

		departmentEClass = createEClass(DEPARTMENT);
		createEReference(departmentEClass, DEPARTMENT__STAFF);

		hospitalEClass = createEClass(HOSPITAL);
		createEReference(hospitalEClass, HOSPITAL__DEPARTMENTS);

		patientEClass = createEClass(PATIENT);
		createEReference(patientEClass, PATIENT__CONDITION);
		createEReference(patientEClass, PATIENT__OBSERVATION);

		observationEClass = createEClass(OBSERVATION);
		createEAttribute(observationEClass, OBSERVATION__VALUE);
		createEAttribute(observationEClass, OBSERVATION__TYPE);

		employeeEClass = createEClass(EMPLOYEE);
		createEAttribute(employeeEClass, EMPLOYEE__SPECIALTY);
		createEReference(employeeEClass, EMPLOYEE__QUALIFICATION);

		qualificationEClass = createEClass(QUALIFICATION);
		createEAttribute(qualificationEClass, QUALIFICATION__ISSUE_DATE);
		createEReference(qualificationEClass, QUALIFICATION__ISSUER);

		employeeRoleEClass = createEClass(EMPLOYEE_ROLE);
		createEAttribute(employeeRoleEClass, EMPLOYEE_ROLE__ROLE);
		createEReference(employeeRoleEClass, EMPLOYEE_ROLE__EMPLOYEE);

		appointmentEClass = createEClass(APPOINTMENT);
		createEAttribute(appointmentEClass, APPOINTMENT__START);
		createEAttribute(appointmentEClass, APPOINTMENT__END);
		createEAttribute(appointmentEClass, APPOINTMENT__STATUS);
		createEAttribute(appointmentEClass, APPOINTMENT__TYPE);
		createEReference(appointmentEClass, APPOINTMENT__PRACTITIONER);
		createEReference(appointmentEClass, APPOINTMENT__PATIENT);

		// Create enums
		conditionStatusEEnum = createEEnum(CONDITION_STATUS);
		conditionSeverityEEnum = createEEnum(CONDITION_SEVERITY);
		observationTypeEEnum = createEEnum(OBSERVATION_TYPE);
		appointmentTypeEEnum = createEEnum(APPOINTMENT_TYPE);
		employeeSpecialtyEEnum = createEEnum(EMPLOYEE_SPECIALTY);
		appointmentStatusEEnum = createEEnum(APPOINTMENT_STATUS);
		roleEEnum = createEEnum(ROLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		organizationEClass.getESuperTypes().add(this.getNamedElement());
		conditionEClass.getESuperTypes().add(this.getNamedElement());
		personEClass.getESuperTypes().add(this.getNamedElement());
		educationalInstituteEClass.getESuperTypes().add(this.getOrganization());
		departmentEClass.getESuperTypes().add(this.getNamedElement());
		hospitalEClass.getESuperTypes().add(this.getOrganization());
		patientEClass.getESuperTypes().add(this.getPerson());
		observationEClass.getESuperTypes().add(this.getNamedElement());
		employeeEClass.getESuperTypes().add(this.getPerson());
		qualificationEClass.getESuperTypes().add(this.getNamedElement());
		employeeRoleEClass.getESuperTypes().add(this.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(healthcareSystemEClass, HealthcareSystem.class, "HealthcareSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHealthcareSystem_Organizations(), this.getOrganization(), null, "organizations", null, 0, -1, HealthcareSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHealthcareSystem_People(), this.getPerson(), null, "people", null, 0, -1, HealthcareSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHealthcareSystem_Appointments(), this.getAppointment(), null, "appointments", null, 0, -1, HealthcareSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(organizationEClass, Organization.class, "Organization", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conditionEClass, Condition.class, "Condition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCondition_Status(), this.getConditionStatus(), "status", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCondition_Severity(), this.getConditionSeverity(), "severity", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personEClass, Person.class, "Person", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerson_Gender(), ecorePackage.getEBoolean(), "gender", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(educationalInstituteEClass, EducationalInstitute.class, "EducationalInstitute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(departmentEClass, Department.class, "Department", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDepartment_Staff(), this.getEmployeeRole(), null, "staff", null, 0, -1, Department.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hospitalEClass, Hospital.class, "Hospital", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHospital_Departments(), this.getDepartment(), null, "departments", null, 0, -1, Hospital.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(patientEClass, Patient.class, "Patient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPatient_Condition(), this.getCondition(), null, "condition", null, 0, -1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatient_Observation(), this.getObservation(), null, "observation", null, 0, -1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(observationEClass, Observation.class, "Observation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObservation_Value(), ecorePackage.getEString(), "value", null, 0, 1, Observation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObservation_Type(), this.getObservationType(), "type", null, 0, 1, Observation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(employeeEClass, Employee.class, "Employee", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmployee_Specialty(), this.getEmployeeSpecialty(), "specialty", null, 0, -1, Employee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEmployee_Qualification(), this.getQualification(), null, "qualification", null, 0, -1, Employee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qualificationEClass, Qualification.class, "Qualification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQualification_IssueDate(), ecorePackage.getEDate(), "issueDate", null, 0, 1, Qualification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQualification_Issuer(), this.getEducationalInstitute(), null, "issuer", null, 0, 1, Qualification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(employeeRoleEClass, EmployeeRole.class, "EmployeeRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmployeeRole_Role(), this.getRole(), "role", null, 0, 1, EmployeeRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEmployeeRole_Employee(), this.getEmployee(), null, "employee", null, 0, 1, EmployeeRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(appointmentEClass, Appointment.class, "Appointment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAppointment_Start(), ecorePackage.getEDate(), "start", null, 0, 1, Appointment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppointment_End(), ecorePackage.getEDate(), "end", null, 0, 1, Appointment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppointment_Status(), this.getAppointmentStatus(), "status", null, 1, 1, Appointment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppointment_Type(), this.getAppointmentType(), "type", null, 0, 1, Appointment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAppointment_Practitioner(), this.getEmployee(), null, "practitioner", null, 1, 1, Appointment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAppointment_Patient(), this.getPatient(), null, "patient", null, 1, 1, Appointment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(conditionStatusEEnum, ConditionStatus.class, "ConditionStatus");
		addEEnumLiteral(conditionStatusEEnum, ConditionStatus.ACTIVE);
		addEEnumLiteral(conditionStatusEEnum, ConditionStatus.RECURRENCE);
		addEEnumLiteral(conditionStatusEEnum, ConditionStatus.INACTIVE);
		addEEnumLiteral(conditionStatusEEnum, ConditionStatus.RESOLVED);

		initEEnum(conditionSeverityEEnum, ConditionSeverity.class, "ConditionSeverity");
		addEEnumLiteral(conditionSeverityEEnum, ConditionSeverity.SEVERE);
		addEEnumLiteral(conditionSeverityEEnum, ConditionSeverity.MODERATE);
		addEEnumLiteral(conditionSeverityEEnum, ConditionSeverity.MILD);

		initEEnum(observationTypeEEnum, ObservationType.class, "ObservationType");
		addEEnumLiteral(observationTypeEEnum, ObservationType.SP_O2);
		addEEnumLiteral(observationTypeEEnum, ObservationType.BLOOD_PRESSURE);
		addEEnumLiteral(observationTypeEEnum, ObservationType.HEART_RATE);
		addEEnumLiteral(observationTypeEEnum, ObservationType.XRAY);

		initEEnum(appointmentTypeEEnum, AppointmentType.class, "AppointmentType");
		addEEnumLiteral(appointmentTypeEEnum, AppointmentType.ROUTINE);
		addEEnumLiteral(appointmentTypeEEnum, AppointmentType.WALKING);
		addEEnumLiteral(appointmentTypeEEnum, AppointmentType.CHECKUP);
		addEEnumLiteral(appointmentTypeEEnum, AppointmentType.FOLLOWUP);
		addEEnumLiteral(appointmentTypeEEnum, AppointmentType.EMERGENCY);

		initEEnum(employeeSpecialtyEEnum, EmployeeSpecialty.class, "EmployeeSpecialty");
		addEEnumLiteral(employeeSpecialtyEEnum, EmployeeSpecialty.CARDIOLOGY);
		addEEnumLiteral(employeeSpecialtyEEnum, EmployeeSpecialty.DERMATOLOGY);
		addEEnumLiteral(employeeSpecialtyEEnum, EmployeeSpecialty.NEUROLOGY);
		addEEnumLiteral(employeeSpecialtyEEnum, EmployeeSpecialty.PEDIATRY);

		initEEnum(appointmentStatusEEnum, AppointmentStatus.class, "AppointmentStatus");
		addEEnumLiteral(appointmentStatusEEnum, AppointmentStatus.BOOKED);
		addEEnumLiteral(appointmentStatusEEnum, AppointmentStatus.ARRIVED);
		addEEnumLiteral(appointmentStatusEEnum, AppointmentStatus.FULFILLED);
		addEEnumLiteral(appointmentStatusEEnum, AppointmentStatus.CANCELLED);
		addEEnumLiteral(appointmentStatusEEnum, AppointmentStatus.NO_SHOW);

		initEEnum(roleEEnum, Role.class, "Role");
		addEEnumLiteral(roleEEnum, Role.DOCTOR);
		addEEnumLiteral(roleEEnum, Role.NURSE);
		addEEnumLiteral(roleEEnum, Role.PHARMACIST);
		addEEnumLiteral(roleEEnum, Role.HOSPITAL_MANAGER);
		addEEnumLiteral(roleEEnum, Role.JANITOR);
		addEEnumLiteral(roleEEnum, Role.INTERN);

		// Create resource
		createResource(eNS_URI);
	}

} //HealthcarePackageImpl
