/**
 */
package Healthcare.impl;

import Healthcare.EmployeeRole;
import Healthcare.HealthcarePackage;
import Healthcare.Hospital;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hospital</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Healthcare.impl.HospitalImpl#getStaff <em>Staff</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HospitalImpl extends NamedElementImpl implements Hospital {
	/**
	 * The cached value of the '{@link #getStaff() <em>Staff</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaff()
	 * @generated
	 * @ordered
	 */
	protected EList<EmployeeRole> staff;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HospitalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HealthcarePackage.Literals.HOSPITAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EmployeeRole> getStaff() {
		if (staff == null) {
			staff = new EObjectResolvingEList<EmployeeRole>(EmployeeRole.class, this, HealthcarePackage.HOSPITAL__STAFF);
		}
		return staff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HealthcarePackage.HOSPITAL__STAFF:
				return getStaff();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HealthcarePackage.HOSPITAL__STAFF:
				getStaff().clear();
				getStaff().addAll((Collection<? extends EmployeeRole>)newValue);
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
			case HealthcarePackage.HOSPITAL__STAFF:
				getStaff().clear();
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
			case HealthcarePackage.HOSPITAL__STAFF:
				return staff != null && !staff.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HospitalImpl
