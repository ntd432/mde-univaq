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
 *   <li>{@link Healthcare.Hospital#getStaff <em>Staff</em>}</li>
 * </ul>
 *
 * @see Healthcare.HealthcarePackage#getHospital()
 * @model
 * @generated
 */
public interface Hospital extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Staff</b></em>' reference list.
	 * The list contents are of type {@link Healthcare.EmployeeRole}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Staff</em>' reference list.
	 * @see Healthcare.HealthcarePackage#getHospital_Staff()
	 * @model
	 * @generated
	 */
	EList<EmployeeRole> getStaff();

} // Hospital
