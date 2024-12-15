/**
 */
package Healthcare.tests;

import Healthcare.EmployeeRole;
import Healthcare.HealthcareFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Employee Role</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EmployeeRoleTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EmployeeRoleTest.class);
	}

	/**
	 * Constructs a new Employee Role test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmployeeRoleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Employee Role test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EmployeeRole getFixture() {
		return (EmployeeRole)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(HealthcareFactory.eINSTANCE.createEmployeeRole());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //EmployeeRoleTest
