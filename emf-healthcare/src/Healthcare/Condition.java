/**
 */
package Healthcare;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Healthcare.Condition#getStatus <em>Status</em>}</li>
 *   <li>{@link Healthcare.Condition#getSeverity <em>Severity</em>}</li>
 * </ul>
 *
 * @see Healthcare.HealthcarePackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link Healthcare.ConditionStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see Healthcare.ConditionStatus
	 * @see #setStatus(ConditionStatus)
	 * @see Healthcare.HealthcarePackage#getCondition_Status()
	 * @model
	 * @generated
	 */
	ConditionStatus getStatus();

	/**
	 * Sets the value of the '{@link Healthcare.Condition#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see Healthcare.ConditionStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(ConditionStatus value);

	/**
	 * Returns the value of the '<em><b>Severity</b></em>' attribute.
	 * The literals are from the enumeration {@link Healthcare.ConditionSeverity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Severity</em>' attribute.
	 * @see Healthcare.ConditionSeverity
	 * @see #setSeverity(ConditionSeverity)
	 * @see Healthcare.HealthcarePackage#getCondition_Severity()
	 * @model
	 * @generated
	 */
	ConditionSeverity getSeverity();

	/**
	 * Sets the value of the '{@link Healthcare.Condition#getSeverity <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' attribute.
	 * @see Healthcare.ConditionSeverity
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(ConditionSeverity value);

} // Condition
