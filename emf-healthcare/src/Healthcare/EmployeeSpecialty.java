/**
 */
package Healthcare;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Employee Specialty</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Healthcare.HealthcarePackage#getEmployeeSpecialty()
 * @model
 * @generated
 */
public enum EmployeeSpecialty implements Enumerator {
	/**
	 * The '<em><b>Cardiology</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CARDIOLOGY_VALUE
	 * @generated
	 * @ordered
	 */
	CARDIOLOGY(0, "Cardiology", "Cardiology"),

	/**
	 * The '<em><b>Dermatology</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DERMATOLOGY_VALUE
	 * @generated
	 * @ordered
	 */
	DERMATOLOGY(1, "Dermatology", "Dermatology"),

	/**
	 * The '<em><b>Neurology</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEUROLOGY_VALUE
	 * @generated
	 * @ordered
	 */
	NEUROLOGY(2, "Neurology", "Neurology"),

	/**
	 * The '<em><b>Pediatry</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PEDIATRY_VALUE
	 * @generated
	 * @ordered
	 */
	PEDIATRY(3, "Pediatry", "Pediatry");

	/**
	 * The '<em><b>Cardiology</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CARDIOLOGY
	 * @model name="Cardiology"
	 * @generated
	 * @ordered
	 */
	public static final int CARDIOLOGY_VALUE = 0;

	/**
	 * The '<em><b>Dermatology</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DERMATOLOGY
	 * @model name="Dermatology"
	 * @generated
	 * @ordered
	 */
	public static final int DERMATOLOGY_VALUE = 1;

	/**
	 * The '<em><b>Neurology</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEUROLOGY
	 * @model name="Neurology"
	 * @generated
	 * @ordered
	 */
	public static final int NEUROLOGY_VALUE = 2;

	/**
	 * The '<em><b>Pediatry</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PEDIATRY
	 * @model name="Pediatry"
	 * @generated
	 * @ordered
	 */
	public static final int PEDIATRY_VALUE = 3;

	/**
	 * An array of all the '<em><b>Employee Specialty</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EmployeeSpecialty[] VALUES_ARRAY =
		new EmployeeSpecialty[] {
			CARDIOLOGY,
			DERMATOLOGY,
			NEUROLOGY,
			PEDIATRY,
		};

	/**
	 * A public read-only list of all the '<em><b>Employee Specialty</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EmployeeSpecialty> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Employee Specialty</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EmployeeSpecialty get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EmployeeSpecialty result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Employee Specialty</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EmployeeSpecialty getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EmployeeSpecialty result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Employee Specialty</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EmployeeSpecialty get(int value) {
		switch (value) {
			case CARDIOLOGY_VALUE: return CARDIOLOGY;
			case DERMATOLOGY_VALUE: return DERMATOLOGY;
			case NEUROLOGY_VALUE: return NEUROLOGY;
			case PEDIATRY_VALUE: return PEDIATRY;
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
	private EmployeeSpecialty(int value, String name, String literal) {
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
	
} //EmployeeSpecialty
