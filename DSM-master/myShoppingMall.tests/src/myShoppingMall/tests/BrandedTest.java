/**
 */
package myShoppingMall.tests;

import junit.textui.TestRunner;

import myShoppingMall.Branded;
import myShoppingMall.MyShoppingMallFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Branded</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BrandedTest extends ShopsTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BrandedTest.class);
	}

	/**
	 * Constructs a new Branded test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrandedTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Branded test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Branded getFixture() {
		return (Branded)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MyShoppingMallFactory.eINSTANCE.createBranded());
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

} //BrandedTest
