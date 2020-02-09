/**
 */
package myShoppingMall.tests;

import junit.textui.TestRunner;

import myShoppingMall.MyShoppingMallFactory;
import myShoppingMall.Specialistic;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Specialistic</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpecialisticTest extends ShopsTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SpecialisticTest.class);
	}

	/**
	 * Constructs a new Specialistic test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecialisticTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Specialistic test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Specialistic getFixture() {
		return (Specialistic)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MyShoppingMallFactory.eINSTANCE.createSpecialistic());
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

} //SpecialisticTest
