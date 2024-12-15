/**
 */
package Healthcare.tests;

import Healthcare.EducationalInstitute;
import Healthcare.HealthcareFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Educational Institute</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EducationalInstituteTest extends OrganizationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EducationalInstituteTest.class);
	}

	/**
	 * Constructs a new Educational Institute test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EducationalInstituteTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Educational Institute test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EducationalInstitute getFixture() {
		return (EducationalInstitute)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(HealthcareFactory.eINSTANCE.createEducationalInstitute());
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

} //EducationalInstituteTest
