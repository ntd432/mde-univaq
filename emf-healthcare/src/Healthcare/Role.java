/**
 */
package Healthcare;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Role</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Healthcare.HealthcarePackage#getRole()
 * @model
 * @generated
 */
public enum Role implements Enumerator {
	/**
	 * The '<em><b>Doctor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOCTOR_VALUE
	 * @generated
	 * @ordered
	 */
	DOCTOR(0, "Doctor", "Doctor"),

	/**
	 * The '<em><b>Nurse</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NURSE_VALUE
	 * @generated
	 * @ordered
	 */
	NURSE(1, "Nurse", "Nurse"),

	/**
	 * The '<em><b>Pharmacist</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHARMACIST_VALUE
	 * @generated
	 * @ordered
	 */
	PHARMACIST(2, "Pharmacist", "Pharmacist"),

	/**
	 * The '<em><b>Hospital Manager</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOSPITAL_MANAGER_VALUE
	 * @generated
	 * @ordered
	 */
	HOSPITAL_MANAGER(3, "HospitalManager", "HospitalManager"),

	/**
	 * The '<em><b>Janitor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JANITOR_VALUE
	 * @generated
	 * @ordered
	 */
	JANITOR(4, "Janitor", "Janitor"),

	/**
	 * The '<em><b>Intern</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERN_VALUE
	 * @generated
	 * @ordered
	 */
	INTERN(5, "Intern", "Intern");

	/**
	 * The '<em><b>Doctor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOCTOR
	 * @model name="Doctor"
	 * @generated
	 * @ordered
	 */
	public static final int DOCTOR_VALUE = 0;

	/**
	 * The '<em><b>Nurse</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NURSE
	 * @model name="Nurse"
	 * @generated
	 * @ordered
	 */
	public static final int NURSE_VALUE = 1;

	/**
	 * The '<em><b>Pharmacist</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHARMACIST
	 * @model name="Pharmacist"
	 * @generated
	 * @ordered
	 */
	public static final int PHARMACIST_VALUE = 2;

	/**
	 * The '<em><b>Hospital Manager</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOSPITAL_MANAGER
	 * @model name="HospitalManager"
	 * @generated
	 * @ordered
	 */
	public static final int HOSPITAL_MANAGER_VALUE = 3;

	/**
	 * The '<em><b>Janitor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JANITOR
	 * @model name="Janitor"
	 * @generated
	 * @ordered
	 */
	public static final int JANITOR_VALUE = 4;

	/**
	 * The '<em><b>Intern</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERN
	 * @model name="Intern"
	 * @generated
	 * @ordered
	 */
	public static final int INTERN_VALUE = 5;

	/**
	 * An array of all the '<em><b>Role</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Role[] VALUES_ARRAY =
		new Role[] {
			DOCTOR,
			NURSE,
			PHARMACIST,
			HOSPITAL_MANAGER,
			JANITOR,
			INTERN,
		};

	/**
	 * A public read-only list of all the '<em><b>Role</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Role> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Role</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Role get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Role result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Role</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Role getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Role result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Role</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Role get(int value) {
		switch (value) {
			case DOCTOR_VALUE: return DOCTOR;
			case NURSE_VALUE: return NURSE;
			case PHARMACIST_VALUE: return PHARMACIST;
			case HOSPITAL_MANAGER_VALUE: return HOSPITAL_MANAGER;
			case JANITOR_VALUE: return JANITOR;
			case INTERN_VALUE: return INTERN;
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
	private Role(int value, String name, String literal) {
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
	
} //Role
