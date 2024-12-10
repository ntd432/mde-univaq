/**
 */
package Healthcare;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Healthcare.HealthcarePackage
 * @generated
 */
public interface HealthcareFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HealthcareFactory eINSTANCE = Healthcare.impl.HealthcareFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition</em>'.
	 * @generated
	 */
	Condition createCondition();

	/**
	 * Returns a new object of class '<em>Educational Institute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Educational Institute</em>'.
	 * @generated
	 */
	EducationalInstitute createEducationalInstitute();

	/**
	 * Returns a new object of class '<em>Department</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Department</em>'.
	 * @generated
	 */
	Department createDepartment();

	/**
	 * Returns a new object of class '<em>Hospital</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hospital</em>'.
	 * @generated
	 */
	Hospital createHospital();

	/**
	 * Returns a new object of class '<em>Patient</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Patient</em>'.
	 * @generated
	 */
	Patient createPatient();

	/**
	 * Returns a new object of class '<em>Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Observation</em>'.
	 * @generated
	 */
	Observation createObservation();

	/**
	 * Returns a new object of class '<em>Employee</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Employee</em>'.
	 * @generated
	 */
	Employee createEmployee();

	/**
	 * Returns a new object of class '<em>Qualification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Qualification</em>'.
	 * @generated
	 */
	Qualification createQualification();

	/**
	 * Returns a new object of class '<em>Employee Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Employee Role</em>'.
	 * @generated
	 */
	EmployeeRole createEmployeeRole();

	/**
	 * Returns a new object of class '<em>Appointment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Appointment</em>'.
	 * @generated
	 */
	Appointment createAppointment();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	HealthcarePackage getHealthcarePackage();

} //HealthcareFactory
