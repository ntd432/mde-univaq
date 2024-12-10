/**
 */
package Healthcare.impl;

import Healthcare.Employee;
import Healthcare.EmployeeSpecialty;
import Healthcare.HealthcarePackage;
import Healthcare.Qualification;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Employee</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Healthcare.impl.EmployeeImpl#getSpecialty <em>Specialty</em>}</li>
 *   <li>{@link Healthcare.impl.EmployeeImpl#getQualification <em>Qualification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmployeeImpl extends PersonImpl implements Employee {
	/**
	 * The cached value of the '{@link #getSpecialty() <em>Specialty</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialty()
	 * @generated
	 * @ordered
	 */
	protected EList<EmployeeSpecialty> specialty;

	/**
	 * The cached value of the '{@link #getQualification() <em>Qualification</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualification()
	 * @generated
	 * @ordered
	 */
	protected EList<Qualification> qualification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmployeeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HealthcarePackage.Literals.EMPLOYEE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EmployeeSpecialty> getSpecialty() {
		if (specialty == null) {
			specialty = new EDataTypeUniqueEList<EmployeeSpecialty>(EmployeeSpecialty.class, this, HealthcarePackage.EMPLOYEE__SPECIALTY);
		}
		return specialty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Qualification> getQualification() {
		if (qualification == null) {
			qualification = new EObjectResolvingEList<Qualification>(Qualification.class, this, HealthcarePackage.EMPLOYEE__QUALIFICATION);
		}
		return qualification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HealthcarePackage.EMPLOYEE__SPECIALTY:
				return getSpecialty();
			case HealthcarePackage.EMPLOYEE__QUALIFICATION:
				return getQualification();
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
			case HealthcarePackage.EMPLOYEE__SPECIALTY:
				getSpecialty().clear();
				getSpecialty().addAll((Collection<? extends EmployeeSpecialty>)newValue);
				return;
			case HealthcarePackage.EMPLOYEE__QUALIFICATION:
				getQualification().clear();
				getQualification().addAll((Collection<? extends Qualification>)newValue);
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
			case HealthcarePackage.EMPLOYEE__SPECIALTY:
				getSpecialty().clear();
				return;
			case HealthcarePackage.EMPLOYEE__QUALIFICATION:
				getQualification().clear();
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
			case HealthcarePackage.EMPLOYEE__SPECIALTY:
				return specialty != null && !specialty.isEmpty();
			case HealthcarePackage.EMPLOYEE__QUALIFICATION:
				return qualification != null && !qualification.isEmpty();
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
		result.append(" (specialty: ");
		result.append(specialty);
		result.append(')');
		return result.toString();
	}

} //EmployeeImpl
