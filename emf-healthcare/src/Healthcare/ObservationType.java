/**
 */
package Healthcare;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Observation Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Healthcare.HealthcarePackage#getObservationType()
 * @model
 * @generated
 */
public enum ObservationType implements Enumerator {
	/**
	 * The '<em><b>Sp O2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SP_O2_VALUE
	 * @generated
	 * @ordered
	 */
	SP_O2(0, "SpO2", "SpO2"),

	/**
	 * The '<em><b>Blood Pressure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLOOD_PRESSURE_VALUE
	 * @generated
	 * @ordered
	 */
	BLOOD_PRESSURE(1, "BloodPressure", "BloodPressure"),

	/**
	 * The '<em><b>Heart Rate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEART_RATE_VALUE
	 * @generated
	 * @ordered
	 */
	HEART_RATE(2, "HeartRate", "HeartRate"),

	/**
	 * The '<em><b>XRay</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XRAY_VALUE
	 * @generated
	 * @ordered
	 */
	XRAY(3, "XRay", "XRay");

	/**
	 * The '<em><b>Sp O2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SP_O2
	 * @model name="SpO2"
	 * @generated
	 * @ordered
	 */
	public static final int SP_O2_VALUE = 0;

	/**
	 * The '<em><b>Blood Pressure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLOOD_PRESSURE
	 * @model name="BloodPressure"
	 * @generated
	 * @ordered
	 */
	public static final int BLOOD_PRESSURE_VALUE = 1;

	/**
	 * The '<em><b>Heart Rate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEART_RATE
	 * @model name="HeartRate"
	 * @generated
	 * @ordered
	 */
	public static final int HEART_RATE_VALUE = 2;

	/**
	 * The '<em><b>XRay</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XRAY
	 * @model name="XRay"
	 * @generated
	 * @ordered
	 */
	public static final int XRAY_VALUE = 3;

	/**
	 * An array of all the '<em><b>Observation Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ObservationType[] VALUES_ARRAY =
		new ObservationType[] {
			SP_O2,
			BLOOD_PRESSURE,
			HEART_RATE,
			XRAY,
		};

	/**
	 * A public read-only list of all the '<em><b>Observation Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ObservationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Observation Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ObservationType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ObservationType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Observation Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ObservationType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ObservationType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Observation Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ObservationType get(int value) {
		switch (value) {
			case SP_O2_VALUE: return SP_O2;
			case BLOOD_PRESSURE_VALUE: return BLOOD_PRESSURE;
			case HEART_RATE_VALUE: return HEART_RATE;
			case XRAY_VALUE: return XRAY;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ObservationType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ObservationType
