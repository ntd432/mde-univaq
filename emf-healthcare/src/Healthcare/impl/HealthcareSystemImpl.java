/**
 */
package Healthcare.impl;

import Healthcare.Appointment;
import Healthcare.HealthcarePackage;
import Healthcare.HealthcareSystem;
import Healthcare.Organization;
import Healthcare.Person;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Healthcare.impl.HealthcareSystemImpl#getOrganizations <em>Organizations</em>}</li>
 *   <li>{@link Healthcare.impl.HealthcareSystemImpl#getPeople <em>People</em>}</li>
 *   <li>{@link Healthcare.impl.HealthcareSystemImpl#getAppointments <em>Appointments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HealthcareSystemImpl extends MinimalEObjectImpl.Container implements HealthcareSystem {
	/**
	 * The cached value of the '{@link #getOrganizations() <em>Organizations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizations()
	 * @generated
	 * @ordered
	 */
	protected EList<Organization> organizations;

	/**
	 * The cached value of the '{@link #getPeople() <em>People</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeople()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> people;

	/**
	 * The cached value of the '{@link #getAppointments() <em>Appointments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppointments()
	 * @generated
	 * @ordered
	 */
	protected EList<Appointment> appointments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HealthcareSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HealthcarePackage.Literals.HEALTHCARE_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Organization> getOrganizations() {
		if (organizations == null) {
			organizations = new EObjectContainmentEList<Organization>(Organization.class, this, HealthcarePackage.HEALTHCARE_SYSTEM__ORGANIZATIONS);
		}
		return organizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Person> getPeople() {
		if (people == null) {
			people = new EObjectContainmentEList<Person>(Person.class, this, HealthcarePackage.HEALTHCARE_SYSTEM__PEOPLE);
		}
		return people;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Appointment> getAppointments() {
		if (appointments == null) {
			appointments = new EObjectContainmentEList<Appointment>(Appointment.class, this, HealthcarePackage.HEALTHCARE_SYSTEM__APPOINTMENTS);
		}
		return appointments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HealthcarePackage.HEALTHCARE_SYSTEM__ORGANIZATIONS:
				return ((InternalEList<?>)getOrganizations()).basicRemove(otherEnd, msgs);
			case HealthcarePackage.HEALTHCARE_SYSTEM__PEOPLE:
				return ((InternalEList<?>)getPeople()).basicRemove(otherEnd, msgs);
			case HealthcarePackage.HEALTHCARE_SYSTEM__APPOINTMENTS:
				return ((InternalEList<?>)getAppointments()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HealthcarePackage.HEALTHCARE_SYSTEM__ORGANIZATIONS:
				return getOrganizations();
			case HealthcarePackage.HEALTHCARE_SYSTEM__PEOPLE:
				return getPeople();
			case HealthcarePackage.HEALTHCARE_SYSTEM__APPOINTMENTS:
				return getAppointments();
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
			case HealthcarePackage.HEALTHCARE_SYSTEM__ORGANIZATIONS:
				getOrganizations().clear();
				getOrganizations().addAll((Collection<? extends Organization>)newValue);
				return;
			case HealthcarePackage.HEALTHCARE_SYSTEM__PEOPLE:
				getPeople().clear();
				getPeople().addAll((Collection<? extends Person>)newValue);
				return;
			case HealthcarePackage.HEALTHCARE_SYSTEM__APPOINTMENTS:
				getAppointments().clear();
				getAppointments().addAll((Collection<? extends Appointment>)newValue);
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
			case HealthcarePackage.HEALTHCARE_SYSTEM__ORGANIZATIONS:
				getOrganizations().clear();
				return;
			case HealthcarePackage.HEALTHCARE_SYSTEM__PEOPLE:
				getPeople().clear();
				return;
			case HealthcarePackage.HEALTHCARE_SYSTEM__APPOINTMENTS:
				getAppointments().clear();
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
			case HealthcarePackage.HEALTHCARE_SYSTEM__ORGANIZATIONS:
				return organizations != null && !organizations.isEmpty();
			case HealthcarePackage.HEALTHCARE_SYSTEM__PEOPLE:
				return people != null && !people.isEmpty();
			case HealthcarePackage.HEALTHCARE_SYSTEM__APPOINTMENTS:
				return appointments != null && !appointments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HealthcareSystemImpl
