/**
 */
package Healthcare.impl;

import Healthcare.Employee;
import Healthcare.EmployeeRole;
import Healthcare.HealthcarePackage;
import Healthcare.Role;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Employee Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Healthcare.impl.EmployeeRoleImpl#getRole <em>Role</em>}</li>
 *   <li>{@link Healthcare.impl.EmployeeRoleImpl#getEmployee <em>Employee</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmployeeRoleImpl extends NamedElementImpl implements EmployeeRole {
	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final Role ROLE_EDEFAULT = Role.DOCTOR;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected Role role = ROLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEmployee() <em>Employee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployee()
	 * @generated
	 * @ordered
	 */
	protected Employee employee;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmployeeRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HealthcarePackage.Literals.EMPLOYEE_ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Role getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRole(Role newRole) {
		Role oldRole = role;
		role = newRole == null ? ROLE_EDEFAULT : newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HealthcarePackage.EMPLOYEE_ROLE__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Employee getEmployee() {
		if (employee != null && employee.eIsProxy()) {
			InternalEObject oldEmployee = (InternalEObject)employee;
			employee = (Employee)eResolveProxy(oldEmployee);
			if (employee != oldEmployee) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HealthcarePackage.EMPLOYEE_ROLE__EMPLOYEE, oldEmployee, employee));
			}
		}
		return employee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Employee basicGetEmployee() {
		return employee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmployee(Employee newEmployee) {
		Employee oldEmployee = employee;
		employee = newEmployee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HealthcarePackage.EMPLOYEE_ROLE__EMPLOYEE, oldEmployee, employee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HealthcarePackage.EMPLOYEE_ROLE__ROLE:
				return getRole();
			case HealthcarePackage.EMPLOYEE_ROLE__EMPLOYEE:
				if (resolve) return getEmployee();
				return basicGetEmployee();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HealthcarePackage.EMPLOYEE_ROLE__ROLE:
				setRole((Role)newValue);
				return;
			case HealthcarePackage.EMPLOYEE_ROLE__EMPLOYEE:
				setEmployee((Employee)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case HealthcarePackage.EMPLOYEE_ROLE__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case HealthcarePackage.EMPLOYEE_ROLE__EMPLOYEE:
				setEmployee((Employee)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case HealthcarePackage.EMPLOYEE_ROLE__ROLE:
				return role != ROLE_EDEFAULT;
			case HealthcarePackage.EMPLOYEE_ROLE__EMPLOYEE:
				return employee != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (role: ");
		result.append(role);
		result.append(')');
		return result.toString();
	}

} //EmployeeRoleImpl
