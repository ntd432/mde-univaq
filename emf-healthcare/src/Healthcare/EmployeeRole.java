/**
 */
package Healthcare;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Employee Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Healthcare.EmployeeRole#getRole <em>Role</em>}</li>
 *   <li>{@link Healthcare.EmployeeRole#getEmployee <em>Employee</em>}</li>
 * </ul>
 *
 * @see Healthcare.HealthcarePackage#getEmployeeRole()
 * @model
 * @generated
 */
public interface EmployeeRole extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * The literals are from the enumeration {@link Healthcare.Role}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see Healthcare.Role
	 * @see #setRole(Role)
	 * @see Healthcare.HealthcarePackage#getEmployeeRole_Role()
	 * @model
	 * @generated
	 */
	Role getRole();

	/**
	 * Sets the value of the '{@link Healthcare.EmployeeRole#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see Healthcare.Role
	 * @see #getRole()
	 * @generated
	 */
	void setRole(Role value);

	/**
	 * Returns the value of the '<em><b>Employee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employee</em>' reference.
	 * @see #setEmployee(Employee)
	 * @see Healthcare.HealthcarePackage#getEmployeeRole_Employee()
	 * @model
	 * @generated
	 */
	Employee getEmployee();

	/**
	 * Sets the value of the '{@link Healthcare.EmployeeRole#getEmployee <em>Employee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Employee</em>' reference.
	 * @see #getEmployee()
	 * @generated
	 */
	void setEmployee(Employee value);

} // EmployeeRole
