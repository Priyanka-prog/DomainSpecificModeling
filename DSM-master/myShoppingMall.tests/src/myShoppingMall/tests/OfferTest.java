/**
 */
package myShoppingMall.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import myShoppingMall.MyShoppingMallFactory;
import myShoppingMall.Offer;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Offer</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OfferTest extends TestCase {

	/**
	 * The fixture for this Offer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Offer fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OfferTest.class);
	}

	/**
	 * Constructs a new Offer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OfferTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Offer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Offer fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Offer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Offer getFixture() {
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
		setFixture(MyShoppingMallFactory.eINSTANCE.createOffer());
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

} //OfferTest
