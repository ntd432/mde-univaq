/**
 */
package Healthcare;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qualification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Healthcare.Qualification#getIssueDate <em>Issue Date</em>}</li>
 *   <li>{@link Healthcare.Qualification#getIssuer <em>Issuer</em>}</li>
 * </ul>
 *
 * @see Healthcare.HealthcarePackage#getQualification()
 * @model
 * @generated
 */
public interface Qualification extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Issue Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issue Date</em>' attribute.
	 * @see #setIssueDate(Date)
	 * @see Healthcare.HealthcarePackage#getQualification_IssueDate()
	 * @model
	 * @generated
	 */
	Date getIssueDate();

	/**
	 * Sets the value of the '{@link Healthcare.Qualification#getIssueDate <em>Issue Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue Date</em>' attribute.
	 * @see #getIssueDate()
	 * @generated
	 */
	void setIssueDate(Date value);

	/**
	 * Returns the value of the '<em><b>Issuer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issuer</em>' reference.
	 * @see #setIssuer(EducationalInstitute)
	 * @see Healthcare.HealthcarePackage#getQualification_Issuer()
	 * @model
	 * @generated
	 */
	EducationalInstitute getIssuer();

	/**
	 * Sets the value of the '{@link Healthcare.Qualification#getIssuer <em>Issuer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issuer</em>' reference.
	 * @see #getIssuer()
	 * @generated
	 */
	void setIssuer(EducationalInstitute value);

} // Qualification
