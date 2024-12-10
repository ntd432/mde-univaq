/**
 */
package Healthcare.impl;

import Healthcare.Condition;
import Healthcare.HealthcarePackage;
import Healthcare.Observation;
import Healthcare.Patient;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Patient</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Healthcare.impl.PatientImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link Healthcare.impl.PatientImpl#getObservation <em>Observation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PatientImpl extends PersonImpl implements Patient {
	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected EList<Condition> condition;

	/**
	 * The cached value of the '{@link #getObservation() <em>Observation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservation()
	 * @generated
	 * @ordered
	 */
	protected EList<Observation> observation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HealthcarePackage.Literals.PATIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Condition> getCondition() {
		if (condition == null) {
			condition = new EObjectResolvingEList<Condition>(Condition.class, this, HealthcarePackage.PATIENT__CONDITION);
		}
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Observation> getObservation() {
		if (observation == null) {
			observation = new EObjectResolvingEList<Observation>(Observation.class, this, HealthcarePackage.PATIENT__OBSERVATION);
		}
		return observation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HealthcarePackage.PATIENT__CONDITION:
				return getCondition();
			case HealthcarePackage.PATIENT__OBSERVATION:
				return getObservation();
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
			case HealthcarePackage.PATIENT__CONDITION:
				getCondition().clear();
				getCondition().addAll((Collection<? extends Condition>)newValue);
				return;
			case HealthcarePackage.PATIENT__OBSERVATION:
				getObservation().clear();
				getObservation().addAll((Collection<? extends Observation>)newValue);
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
			case HealthcarePackage.PATIENT__CONDITION:
				getCondition().clear();
				return;
			case HealthcarePackage.PATIENT__OBSERVATION:
				getObservation().clear();
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
			case HealthcarePackage.PATIENT__CONDITION:
				return condition != null && !condition.isEmpty();
			case HealthcarePackage.PATIENT__OBSERVATION:
				return observation != null && !observation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PatientImpl
