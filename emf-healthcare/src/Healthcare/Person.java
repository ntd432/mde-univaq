/**
 */
package Healthcare;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Healthcare.Person#isGender <em>Gender</em>}</li>
 * </ul>
 *
 * @see Healthcare.HealthcarePackage#getPerson()
 * @model abstract="true"
 * @generated
 */
public interface Person extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Gender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gender</em>' attribute.
	 * @see #setGender(boolean)
	 * @see Healthcare.HealthcarePackage#getPerson_Gender()
	 * @model
	 * @generated
	 */
	boolean isGender();

	/**
	 * Sets the value of the '{@link Healthcare.Person#isGender <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gender</em>' attribute.
	 * @see #isGender()
	 * @generated
	 */
	void setGender(boolean value);

} // Person
