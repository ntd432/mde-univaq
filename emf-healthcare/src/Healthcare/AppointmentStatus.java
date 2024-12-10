/**
 */
package Healthcare;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Appointment Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Healthcare.HealthcarePackage#getAppointmentStatus()
 * @model
 * @generated
 */
public enum AppointmentStatus implements Enumerator {
	/**
	 * The '<em><b>Booked</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOKED_VALUE
	 * @generated
	 * @ordered
	 */
	BOOKED(0, "Booked", "Booked"),

	/**
	 * The '<em><b>Arrived</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARRIVED_VALUE
	 * @generated
	 * @ordered
	 */
	ARRIVED(1, "Arrived", "Arrived"),

	/**
	 * The '<em><b>Fulfilled</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FULFILLED_VALUE
	 * @generated
	 * @ordered
	 */
	FULFILLED(2, "Fulfilled", "Fulfilled"),

	/**
	 * The '<em><b>Cancelled</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CANCELLED_VALUE
	 * @generated
	 * @ordered
	 */
	CANCELLED(3, "Cancelled", "Cancelled"),

	/**
	 * The '<em><b>No Show</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_SHOW_VALUE
	 * @generated
	 * @ordered
	 */
	NO_SHOW(4, "NoShow", "NoShow");

	/**
	 * The '<em><b>Booked</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOKED
	 * @model name="Booked"
	 * @generated
	 * @ordered
	 */
	public static final int BOOKED_VALUE = 0;

	/**
	 * The '<em><b>Arrived</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARRIVED
	 * @model name="Arrived"
	 * @generated
	 * @ordered
	 */
	public static final int ARRIVED_VALUE = 1;

	/**
	 * The '<em><b>Fulfilled</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FULFILLED
	 * @model name="Fulfilled"
	 * @generated
	 * @ordered
	 */
	public static final int FULFILLED_VALUE = 2;

	/**
	 * The '<em><b>Cancelled</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CANCELLED
	 * @model name="Cancelled"
	 * @generated
	 * @ordered
	 */
	public static final int CANCELLED_VALUE = 3;

	/**
	 * The '<em><b>No Show</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_SHOW
	 * @model name="NoShow"
	 * @generated
	 * @ordered
	 */
	public static final int NO_SHOW_VALUE = 4;

	/**
	 * An array of all the '<em><b>Appointment Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AppointmentStatus[] VALUES_ARRAY =
		new AppointmentStatus[] {
			BOOKED,
			ARRIVED,
			FULFILLED,
			CANCELLED,
			NO_SHOW,
		};

	/**
	 * A public read-only list of all the '<em><b>Appointment Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AppointmentStatus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Appointment Status</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AppointmentStatus get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AppointmentStatus result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Appointment Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AppointmentStatus getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AppointmentStatus result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Appointment Status</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AppointmentStatus get(int value) {
		switch (value) {
			case BOOKED_VALUE: return BOOKED;
			case ARRIVED_VALUE: return ARRIVED;
			case FULFILLED_VALUE: return FULFILLED;
			case CANCELLED_VALUE: return CANCELLED;
			case NO_SHOW_VALUE: return NO_SHOW;
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
	private AppointmentStatus(int value, String name, String literal) {
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
	
} //AppointmentStatus
