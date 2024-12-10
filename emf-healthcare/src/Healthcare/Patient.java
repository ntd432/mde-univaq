/**
 */
package Healthcare;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Patient</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Healthcare.Patient#getCondition <em>Condition</em>}</li>
 *   <li>{@link Healthcare.Patient#getObservation <em>Observation</em>}</li>
 * </ul>
 *
 * @see Healthcare.HealthcarePackage#getPatient()
 * @model
 * @generated
 */
public interface Patient extends Person {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' reference list.
	 * The list contents are of type {@link Healthcare.Condition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' reference list.
	 * @see Healthcare.HealthcarePackage#getPatient_Condition()
	 * @model
	 * @generated
	 */
	EList<Condition> getCondition();

	/**
	 * Returns the value of the '<em><b>Observation</b></em>' reference list.
	 * The list contents are of type {@link Healthcare.Observation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observation</em>' reference list.
	 * @see Healthcare.HealthcarePackage#getPatient_Observation()
	 * @model
	 * @generated
	 */
	EList<Observation> getObservation();

} // Patient
