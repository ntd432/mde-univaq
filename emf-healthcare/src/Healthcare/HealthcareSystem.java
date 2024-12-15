/**
 */
package Healthcare;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Healthcare.HealthcareSystem#getOrganizations <em>Organizations</em>}</li>
 *   <li>{@link Healthcare.HealthcareSystem#getPeople <em>People</em>}</li>
 *   <li>{@link Healthcare.HealthcareSystem#getAppointments <em>Appointments</em>}</li>
 * </ul>
 *
 * @see Healthcare.HealthcarePackage#getHealthcareSystem()
 * @model
 * @generated
 */
public interface HealthcareSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Organizations</b></em>' containment reference list.
	 * The list contents are of type {@link Healthcare.Organization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organizations</em>' containment reference list.
	 * @see Healthcare.HealthcarePackage#getHealthcareSystem_Organizations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Organization> getOrganizations();

	/**
	 * Returns the value of the '<em><b>People</b></em>' containment reference list.
	 * The list contents are of type {@link Healthcare.Person}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>People</em>' containment reference list.
	 * @see Healthcare.HealthcarePackage#getHealthcareSystem_People()
	 * @model containment="true"
	 * @generated
	 */
	EList<Person> getPeople();

	/**
	 * Returns the value of the '<em><b>Appointments</b></em>' containment reference list.
	 * The list contents are of type {@link Healthcare.Appointment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Appointments</em>' containment reference list.
	 * @see Healthcare.HealthcarePackage#getHealthcareSystem_Appointments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Appointment> getAppointments();

} // HealthcareSystem
