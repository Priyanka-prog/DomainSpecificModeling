/**
 */
package myShoppingMall.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import myShoppingMall.MyShoppingMallFactory;
import myShoppingMall.Storage;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Storage</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StorageTest extends TestCase {

	/**
	 * The fixture for this Storage test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Storage fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StorageTest.class);
	}

	/**
	 * Constructs a new Storage test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StorageTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Storage test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Storage fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Storage test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Storage getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MyShoppingMallFactory.eINSTANCE.createStorage());
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

} //StorageTest
