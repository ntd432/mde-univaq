/**
 */
package Healthcare;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Employee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Healthcare.Employee#getSpecialty <em>Specialty</em>}</li>
 *   <li>{@link Healthcare.Employee#getQualification <em>Qualification</em>}</li>
 * </ul>
 *
 * @see Healthcare.HealthcarePackage#getEmployee()
 * @model
 * @generated
 */
public interface Employee extends Person {
	/**
	 * Returns the value of the '<em><b>Specialty</b></em>' attribute list.
	 * The list contents are of type {@link Healthcare.EmployeeSpecialty}.
	 * The literals are from the enumeration {@link Healthcare.EmployeeSpecialty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialty</em>' attribute list.
	 * @see Healthcare.EmployeeSpecialty
	 * @see Healthcare.HealthcarePackage#getEmployee_Specialty()
	 * @model
	 * @generated
	 */
	EList<EmployeeSpecialty> getSpecialty();

	/**
	 * Returns the value of the '<em><b>Qualification</b></em>' reference list.
	 * The list contents are of type {@link Healthcare.Qualification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualification</em>' reference list.
	 * @see Healthcare.HealthcarePackage#getEmployee_Qualification()
	 * @model
	 * @generated
	 */
	EList<Qualification> getQualification();

} // Employee
