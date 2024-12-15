/**
 */
package Healthcare;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hospital</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Healthcare.Hospital#getDepartments <em>Departments</em>}</li>
 * </ul>
 *
 * @see Healthcare.HealthcarePackage#getHospital()
 * @model
 * @generated
 */
public interface Hospital extends Organization {
	/**
	 * Returns the value of the '<em><b>Departments</b></em>' containment reference list.
	 * The list contents are of type {@link Healthcare.Department}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Departments</em>' containment reference list.
	 * @see Healthcare.HealthcarePackage#getHospital_Departments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Department> getDepartments();

} // Hospital
