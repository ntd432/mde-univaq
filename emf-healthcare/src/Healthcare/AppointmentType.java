/**
 */
package Healthcare;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Appointment Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Healthcare.HealthcarePackage#getAppointmentType()
 * @model
 * @generated
 */
public enum AppointmentType implements Enumerator {
	/**
	 * The '<em><b>Routine</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROUTINE_VALUE
	 * @generated
	 * @ordered
	 */
	ROUTINE(0, "Routine", "Routine"),

	/**
	 * The '<em><b>Walking</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WALKING_VALUE
	 * @generated
	 * @ordered
	 */
	WALKING(1, "Walking", "Walking"),

	/**
	 * The '<em><b>Checkup</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHECKUP_VALUE
	 * @generated
	 * @ordered
	 */
	CHECKUP(2, "Checkup", "Checkup"),

	/**
	 * The '<em><b>Followup</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FOLLOWUP_VALUE
	 * @generated
	 * @ordered
	 */
	FOLLOWUP(3, "Followup", "Followup"),

	/**
	 * The '<em><b>Emergency</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMERGENCY_VALUE
	 * @generated
	 * @ordered
	 */
	EMERGENCY(4, "Emergency", "Emergency");

	/**
	 * The '<em><b>Routine</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROUTINE
	 * @model name="Routine"
	 * @generated
	 * @ordered
	 */
	public static final int ROUTINE_VALUE = 0;

	/**
	 * The '<em><b>Walking</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WALKING
	 * @model name="Walking"
	 * @generated
	 * @ordered
	 */
	public static final int WALKING_VALUE = 1;

	/**
	 * The '<em><b>Checkup</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHECKUP
	 * @model name="Checkup"
	 * @generated
	 * @ordered
	 */
	public static final int CHECKUP_VALUE = 2;

	/**
	 * The '<em><b>Followup</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FOLLOWUP
	 * @model name="Followup"
	 * @generated
	 * @ordered
	 */
	public static final int FOLLOWUP_VALUE = 3;

	/**
	 * The '<em><b>Emergency</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMERGENCY
	 * @model name="Emergency"
	 * @generated
	 * @ordered
	 */
	public static final int EMERGENCY_VALUE = 4;

	/**
	 * An array of all the '<em><b>Appointment Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AppointmentType[] VALUES_ARRAY =
		new AppointmentType[] {
			ROUTINE,
			WALKING,
			CHECKUP,
			FOLLOWUP,
			EMERGENCY,
		};

	/**
	 * A public read-only list of all the '<em><b>Appointment Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AppointmentType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Appointment Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AppointmentType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AppointmentType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Appointment Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AppointmentType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AppointmentType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Appointment Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AppointmentType get(int value) {
		switch (value) {
			case ROUTINE_VALUE: return ROUTINE;
			case WALKING_VALUE: return WALKING;
			case CHECKUP_VALUE: return CHECKUP;
			case FOLLOWUP_VALUE: return FOLLOWUP;
			case EMERGENCY_VALUE: return EMERGENCY;
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
	private AppointmentType(int value, String name, String literal) {
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
	
} //AppointmentType
