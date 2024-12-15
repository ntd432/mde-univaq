/**
 */
package Healthcare;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Department</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Healthcare.Department#getStaff <em>Staff</em>}</li>
 * </ul>
 *
 * @see Healthcare.HealthcarePackage#getDepartment()
 * @model
 * @generated
 */
public interface Department extends NamedElement {

	/**
	 * Returns the value of the '<em><b>Staff</b></em>' containment reference list.
	 * The list contents are of type {@link Healthcare.EmployeeRole}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Staff</em>' containment reference list.
	 * @see Healthcare.HealthcarePackage#getDepartment_Staff()
	 * @model containment="true"
	 * @generated
	 */
	EList<EmployeeRole> getStaff();
} // Department
