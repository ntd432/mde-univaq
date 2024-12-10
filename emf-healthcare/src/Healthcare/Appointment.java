/**
 */
package Healthcare;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Appointment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Healthcare.Appointment#getStart <em>Start</em>}</li>
 *   <li>{@link Healthcare.Appointment#getEnd <em>End</em>}</li>
 *   <li>{@link Healthcare.Appointment#getStatus <em>Status</em>}</li>
 *   <li>{@link Healthcare.Appointment#getType <em>Type</em>}</li>
 *   <li>{@link Healthcare.Appointment#getPractitioner <em>Practitioner</em>}</li>
 *   <li>{@link Healthcare.Appointment#getPatient <em>Patient</em>}</li>
 * </ul>
 *
 * @see Healthcare.HealthcarePackage#getAppointment()
 * @model
 * @generated
 */
public interface Appointment extends EObject {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(Date)
	 * @see Healthcare.HealthcarePackage#getAppointment_Start()
	 * @model
	 * @generated
	 */
	Date getStart();

	/**
	 * Sets the value of the '{@link Healthcare.Appointment#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Date value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see #setEnd(Date)
	 * @see Healthcare.HealthcarePackage#getAppointment_End()
	 * @model
	 * @generated
	 */
	Date getEnd();

	/**
	 * Sets the value of the '{@link Healthcare.Appointment#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Date value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link Healthcare.AppointmentStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see Healthcare.AppointmentStatus
	 * @see #setStatus(AppointmentStatus)
	 * @see Healthcare.HealthcarePackage#getAppointment_Status()
	 * @model required="true"
	 * @generated
	 */
	AppointmentStatus getStatus();

	/**
	 * Sets the value of the '{@link Healthcare.Appointment#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see Healthcare.AppointmentStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(AppointmentStatus value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link Healthcare.AppointmentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see Healthcare.AppointmentType
	 * @see #setType(AppointmentType)
	 * @see Healthcare.HealthcarePackage#getAppointment_Type()
	 * @model
	 * @generated
	 */
	AppointmentType getType();

	/**
	 * Sets the value of the '{@link Healthcare.Appointment#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see Healthcare.AppointmentType
	 * @see #getType()
	 * @generated
	 */
	void setType(AppointmentType value);

	/**
	 * Returns the value of the '<em><b>Practitioner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Practitioner</em>' reference.
	 * @see #setPractitioner(Employee)
	 * @see Healthcare.HealthcarePackage#getAppointment_Practitioner()
	 * @model required="true"
	 * @generated
	 */
	Employee getPractitioner();

	/**
	 * Sets the value of the '{@link Healthcare.Appointment#getPractitioner <em>Practitioner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Practitioner</em>' reference.
	 * @see #getPractitioner()
	 * @generated
	 */
	void setPractitioner(Employee value);

	/**
	 * Returns the value of the '<em><b>Patient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patient</em>' reference.
	 * @see #setPatient(Patient)
	 * @see Healthcare.HealthcarePackage#getAppointment_Patient()
	 * @model required="true"
	 * @generated
	 */
	Patient getPatient();

	/**
	 * Sets the value of the '{@link Healthcare.Appointment#getPatient <em>Patient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient</em>' reference.
	 * @see #getPatient()
	 * @generated
	 */
	void setPatient(Patient value);

} // Appointment
