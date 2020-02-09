/**
 */
package myShoppingMall.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import myShoppingMall.MyShoppingMallFactory;
import myShoppingMall.SubCategory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sub Category</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubCategoryTest extends TestCase {

	/**
	 * The fixture for this Sub Category test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubCategory fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SubCategoryTest.class);
	}

	/**
	 * Constructs a new Sub Category test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubCategoryTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Sub Category test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SubCategory fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Sub Category test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubCategory getFixture() {
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
		setFixture(MyShoppingMallFactory.eINSTANCE.createSubCategory());
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

} //SubCategoryTest
