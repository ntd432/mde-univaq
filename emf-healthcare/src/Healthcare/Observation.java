/**
 */
package Healthcare;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Healthcare.Observation#getValue <em>Value</em>}</li>
 *   <li>{@link Healthcare.Observation#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see Healthcare.HealthcarePackage#getObservation()
 * @model
 * @generated
 */
public interface Observation extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(float)
	 * @see Healthcare.HealthcarePackage#getObservation_Value()
	 * @model
	 * @generated
	 */
	float getValue();

	/**
	 * Sets the value of the '{@link Healthcare.Observation#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(float value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link Healthcare.ObservationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see Healthcare.ObservationType
	 * @see #setType(ObservationType)
	 * @see Healthcare.HealthcarePackage#getObservation_Type()
	 * @model
	 * @generated
	 */
	ObservationType getType();

	/**
	 * Sets the value of the '{@link Healthcare.Observation#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see Healthcare.ObservationType
	 * @see #getType()
	 * @generated
	 */
	void setType(ObservationType value);

} // Observation
