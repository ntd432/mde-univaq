/**
 */
package Healthcare.impl;

import Healthcare.Appointment;
import Healthcare.AppointmentStatus;
import Healthcare.AppointmentType;
import Healthcare.Employee;
import Healthcare.HealthcarePackage;
import Healthcare.Patient;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Appointment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Healthcare.impl.AppointmentImpl#getStart <em>Start</em>}</li>
 *   <li>{@link Healthcare.impl.AppointmentImpl#getEnd <em>End</em>}</li>
 *   <li>{@link Healthcare.impl.AppointmentImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link Healthcare.impl.AppointmentImpl#getType <em>Type</em>}</li>
 *   <li>{@link Healthcare.impl.AppointmentImpl#getPractitioner <em>Practitioner</em>}</li>
 *   <li>{@link Healthcare.impl.AppointmentImpl#getPatient <em>Patient</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AppointmentImpl extends MinimalEObjectImpl.Container implements Appointment {
	/**
	 * The default value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected Date start = START_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected Date end = END_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final AppointmentStatus STATUS_EDEFAULT = AppointmentStatus.BOOKED;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected AppointmentStatus status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final AppointmentType TYPE_EDEFAULT = AppointmentType.ROUTINE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected AppointmentType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPractitioner() <em>Practitioner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPractitioner()
	 * @generated
	 * @ordered
	 */
	protected Employee practitioner;

	/**
	 * The cached value of the '{@link #getPatient() <em>Patient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatient()
	 * @generated
	 * @ordered
	 */
	protected Patient patient;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AppointmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HealthcarePackage.Literals.APPOINTMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStart(Date newStart) {
		Date oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HealthcarePackage.APPOINTMENT__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnd(Date newEnd) {
		Date oldEnd = end;
		end = newEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HealthcarePackage.APPOINTMENT__END, oldEnd, end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AppointmentStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(AppointmentStatus newStatus) {
		AppointmentStatus oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HealthcarePackage.APPOINTMENT__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AppointmentType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(AppointmentType newType) {
		AppointmentType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HealthcarePackage.APPOINTMENT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Employee getPractitioner() {
		if (practitioner != null && practitioner.eIsProxy()) {
			InternalEObject oldPractitioner = (InternalEObject)practitioner;
			practitioner = (Employee)eResolveProxy(oldPractitioner);
			if (practitioner != oldPractitioner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HealthcarePackage.APPOINTMENT__PRACTITIONER, oldPractitioner, practitioner));
			}
		}
		return practitioner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Employee basicGetPractitioner() {
		return practitioner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPractitioner(Employee newPractitioner) {
		Employee oldPractitioner = practitioner;
		practitioner = newPractitioner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HealthcarePackage.APPOINTMENT__PRACTITIONER, oldPractitioner, practitioner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Patient getPatient() {
		if (patient != null && patient.eIsProxy()) {
			InternalEObject oldPatient = (InternalEObject)patient;
			patient = (Patient)eResolveProxy(oldPatient);
			if (patient != oldPatient) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HealthcarePackage.APPOINTMENT__PATIENT, oldPatient, patient));
			}
		}
		return patient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Patient basicGetPatient() {
		return patient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPatient(Patient newPatient) {
		Patient oldPatient = patient;
		patient = newPatient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HealthcarePackage.APPOINTMENT__PATIENT, oldPatient, patient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HealthcarePackage.APPOINTMENT__START:
				return getStart();
			case HealthcarePackage.APPOINTMENT__END:
				return getEnd();
			case HealthcarePackage.APPOINTMENT__STATUS:
				return getStatus();
			case HealthcarePackage.APPOINTMENT__TYPE:
				return getType();
			case HealthcarePackage.APPOINTMENT__PRACTITIONER:
				if (resolve) return getPractitioner();
				return basicGetPractitioner();
			case HealthcarePackage.APPOINTMENT__PATIENT:
				if (resolve) return getPatient();
				return basicGetPatient();
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
			case HealthcarePackage.APPOINTMENT__START:
				setStart((Date)newValue);
				return;
			case HealthcarePackage.APPOINTMENT__END:
				setEnd((Date)newValue);
				return;
			case HealthcarePackage.APPOINTMENT__STATUS:
				setStatus((AppointmentStatus)newValue);
				return;
			case HealthcarePackage.APPOINTMENT__TYPE:
				setType((AppointmentType)newValue);
				return;
			case HealthcarePackage.APPOINTMENT__PRACTITIONER:
				setPractitioner((Employee)newValue);
				return;
			case HealthcarePackage.APPOINTMENT__PATIENT:
				setPatient((Patient)newValue);
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
			case HealthcarePackage.APPOINTMENT__START:
				setStart(START_EDEFAULT);
				return;
			case HealthcarePackage.APPOINTMENT__END:
				setEnd(END_EDEFAULT);
				return;
			case HealthcarePackage.APPOINTMENT__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case HealthcarePackage.APPOINTMENT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case HealthcarePackage.APPOINTMENT__PRACTITIONER:
				setPractitioner((Employee)null);
				return;
			case HealthcarePackage.APPOINTMENT__PATIENT:
				setPatient((Patient)null);
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
			case HealthcarePackage.APPOINTMENT__START:
				return START_EDEFAULT == null ? start != null : !START_EDEFAULT.equals(start);
			case HealthcarePackage.APPOINTMENT__END:
				return END_EDEFAULT == null ? end != null : !END_EDEFAULT.equals(end);
			case HealthcarePackage.APPOINTMENT__STATUS:
				return status != STATUS_EDEFAULT;
			case HealthcarePackage.APPOINTMENT__TYPE:
				return type != TYPE_EDEFAULT;
			case HealthcarePackage.APPOINTMENT__PRACTITIONER:
				return practitioner != null;
			case HealthcarePackage.APPOINTMENT__PATIENT:
				return patient != null;
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
		result.append(" (start: ");
		result.append(start);
		result.append(", end: ");
		result.append(end);
		result.append(", status: ");
		result.append(status);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //AppointmentImpl
