/**
 */
package myShoppingMall.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import myShoppingMall.Mall;
import myShoppingMall.MyShoppingMallFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Mall</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link myShoppingMall.Mall#IsOpen() <em>Is Open</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class MallTest extends TestCase {

	/**
	 * The fixture for this Mall test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Mall fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MallTest.class);
	}

	/**
	 * Constructs a new Mall test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MallTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Mall test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Mall fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Mall test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Mall getFixture() {
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
		setFixture(MyShoppingMallFactory.eINSTANCE.createMall());
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

	/**
	 * Tests the '{@link myShoppingMall.Mall#IsOpen() <em>Is Open</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see myShoppingMall.Mall#IsOpen()
	 * @generated
	 */
	public void testIsOpen() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //MallTest
