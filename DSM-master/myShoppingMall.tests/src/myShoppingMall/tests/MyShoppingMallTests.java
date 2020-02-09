/**
 */
package myShoppingMall.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>myShoppingMall</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyShoppingMallTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new MyShoppingMallTests("myShoppingMall Tests");
		suite.addTestSuite(MallTest.class);
		suite.addTestSuite(ShopsTest.class);
		suite.addTestSuite(BrandedTest.class);
		suite.addTestSuite(SpecialisticTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyShoppingMallTests(String name) {
		super(name);
	}

} //MyShoppingMallTests
