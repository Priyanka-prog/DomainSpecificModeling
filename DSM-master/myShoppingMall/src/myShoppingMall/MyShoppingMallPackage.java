/**
 */
package myShoppingMall;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see myShoppingMall.MyShoppingMallFactory
 * @model kind="package"
 * @generated
 */
public interface MyShoppingMallPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "myShoppingMall";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.myshoppingmall.com/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "MSM";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MyShoppingMallPackage eINSTANCE = myShoppingMall.impl.MyShoppingMallPackageImpl.init();

	/**
	 * The meta object id for the '{@link myShoppingMall.impl.MallImpl <em>Mall</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see myShoppingMall.impl.MallImpl
	 * @see myShoppingMall.impl.MyShoppingMallPackageImpl#getMall()
	 * @generated
	 */
	int MALL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MALL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MALL__LOCATION = 1;

	/**
	 * The feature id for the '<em><b>Shops</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MALL__SHOPS = 2;

	/**
	 * The feature id for the '<em><b>Employees</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MALL__EMPLOYEES = 3;

	/**
	 * The feature id for the '<em><b>Schedule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MALL__SCHEDULE = 4;

	/**
	 * The number of structural features of the '<em>Mall</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MALL_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link myShoppingMall.impl.ShopsImpl <em>Shops</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see myShoppingMall.impl.ShopsImpl
	 * @see myShoppingMall.impl.MyShoppingMallPackageImpl#getShops()
	 * @generated
	 */
	int SHOPS = 1;

	/**
	 * The feature id for the '<em><b>Shop Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPS__SHOP_NAME = 0;

	/**
	 * The feature id for the '<em><b>Floor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPS__FLOOR = 1;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPS__ADDRESS = 2;

	/**
	 * The feature id for the '<em><b>Photos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPS__PHOTOS = 3;

	/**
	 * The feature id for the '<em><b>Employees</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPS__EMPLOYEES = 4;

	/**
	 * The feature id for the '<em><b>Storages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPS__STORAGES = 5;

	/**
	 * The feature id for the '<em><b>Schedule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPS__SCHEDULE = 6;

	/**
	 * The number of structural features of the '<em>Shops</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPS_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link myShoppingMall.impl.StorageImpl <em>Storage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see myShoppingMall.impl.StorageImpl
	 * @see myShoppingMall.impl.MyShoppingMallPackageImpl#getStorage()
	 * @generated
	 */
	int STORAGE = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Number Of Layers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__NUMBER_OF_LAYERS = 1;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__SIZE = 2;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__POSITION = 3;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__ITEMS = 4;

	/**
	 * The number of structural features of the '<em>Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link myShoppingMall.impl.ItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see myShoppingMall.impl.ItemImpl
	 * @see myShoppingMall.impl.MyShoppingMallPackageImpl#getItem()
	 * @generated
	 */
	int ITEM = 3;

	/**
	 * The feature id for the '<em><b>Item Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__ITEM_NAME = 0;

	/**
	 * The feature id for the '<em><b>BName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__BNAME = 1;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__COLOR = 2;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__MODEL = 3;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__SIZE = 4;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__POSITION = 5;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__PRICE = 6;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__ITEMS = 7;

	/**
	 * The feature id for the '<em><b>Offer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__OFFER = 8;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link myShoppingMall.impl.OfferImpl <em>Offer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see myShoppingMall.impl.OfferImpl
	 * @see myShoppingMall.impl.MyShoppingMallPackageImpl#getOffer()
	 * @generated
	 */
	int OFFER = 4;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER__START_DATE = 0;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER__END_DATE = 1;

	/**
	 * The feature id for the '<em><b>Discount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER__DISCOUNT = 2;

	/**
	 * The feature id for the '<em><b>Photos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER__PHOTOS = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER__TYPE = 4;

	/**
	 * The feature id for the '<em><b>Is Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER__IS_VALID = 5;

	/**
	 * The number of structural features of the '<em>Offer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link myShoppingMall.impl.CategoryImpl <em>Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see myShoppingMall.impl.CategoryImpl
	 * @see myShoppingMall.impl.MyShoppingMallPackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 5;

	/**
	 * The feature id for the '<em><b>Category Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__CATEGORY_NAME = 0;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__CONTAINS = 1;

	/**
	 * The number of structural features of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link myShoppingMall.impl.SubCategoryImpl <em>Sub Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see myShoppingMall.impl.SubCategoryImpl
	 * @see myShoppingMall.impl.MyShoppingMallPackageImpl#getSubCategory()
	 * @generated
	 */
	int SUB_CATEGORY = 6;

	/**
	 * The feature id for the '<em><b>Sub Category Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CATEGORY__SUB_CATEGORY_NAME = 0;

	/**
	 * The number of structural features of the '<em>Sub Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CATEGORY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link myShoppingMall.impl.ScheduleImpl <em>Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see myShoppingMall.impl.ScheduleImpl
	 * @see myShoppingMall.impl.MyShoppingMallPackageImpl#getSchedule()
	 * @generated
	 */
	int SCHEDULE = 7;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__START_TIME = 0;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__END_TIME = 1;

	/**
	 * The number of structural features of the '<em>Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link myShoppingMall.impl.EmployeeImpl <em>Employee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see myShoppingMall.impl.EmployeeImpl
	 * @see myShoppingMall.impl.MyShoppingMallPackageImpl#getEmployee()
	 * @generated
	 */
	int EMPLOYEE = 8;

	/**
	 * The feature id for the '<em><b>Employee Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__EMPLOYEE_NAME = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__ID = 1;

	/**
	 * The feature id for the '<em><b>Date Of Birth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__DATE_OF_BIRTH = 2;

	/**
	 * The feature id for the '<em><b>Designation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__DESIGNATION = 3;

	/**
	 * The feature id for the '<em><b>Fiscal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__FISCAL_CODE = 4;

	/**
	 * The feature id for the '<em><b>Shifts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__SHIFTS = 5;

	/**
	 * The feature id for the '<em><b>Schedule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__SCHEDULE = 6;

	/**
	 * The number of structural features of the '<em>Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link myShoppingMall.impl.BrandedImpl <em>Branded</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see myShoppingMall.impl.BrandedImpl
	 * @see myShoppingMall.impl.MyShoppingMallPackageImpl#getBranded()
	 * @generated
	 */
	int BRANDED = 9;

	/**
	 * The feature id for the '<em><b>Shop Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANDED__SHOP_NAME = SHOPS__SHOP_NAME;

	/**
	 * The feature id for the '<em><b>Floor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANDED__FLOOR = SHOPS__FLOOR;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANDED__ADDRESS = SHOPS__ADDRESS;

	/**
	 * The feature id for the '<em><b>Photos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANDED__PHOTOS = SHOPS__PHOTOS;

	/**
	 * The feature id for the '<em><b>Employees</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANDED__EMPLOYEES = SHOPS__EMPLOYEES;

	/**
	 * The feature id for the '<em><b>Storages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANDED__STORAGES = SHOPS__STORAGES;

	/**
	 * The feature id for the '<em><b>Schedule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANDED__SCHEDULE = SHOPS__SCHEDULE;

	/**
	 * The feature id for the '<em><b>BName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANDED__BNAME = SHOPS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Branded</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANDED_FEATURE_COUNT = SHOPS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link myShoppingMall.impl.SpecialisticImpl <em>Specialistic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see myShoppingMall.impl.SpecialisticImpl
	 * @see myShoppingMall.impl.MyShoppingMallPackageImpl#getSpecialistic()
	 * @generated
	 */
	int SPECIALISTIC = 10;

	/**
	 * The feature id for the '<em><b>Shop Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISTIC__SHOP_NAME = SHOPS__SHOP_NAME;

	/**
	 * The feature id for the '<em><b>Floor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISTIC__FLOOR = SHOPS__FLOOR;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISTIC__ADDRESS = SHOPS__ADDRESS;

	/**
	 * The feature id for the '<em><b>Photos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISTIC__PHOTOS = SHOPS__PHOTOS;

	/**
	 * The feature id for the '<em><b>Employees</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISTIC__EMPLOYEES = SHOPS__EMPLOYEES;

	/**
	 * The feature id for the '<em><b>Storages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISTIC__STORAGES = SHOPS__STORAGES;

	/**
	 * The feature id for the '<em><b>Schedule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISTIC__SCHEDULE = SHOPS__SCHEDULE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISTIC__TYPE = SHOPS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Specialistic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISTIC_FEATURE_COUNT = SHOPS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link myShoppingMall.StorageType <em>Storage Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see myShoppingMall.StorageType
	 * @see myShoppingMall.impl.MyShoppingMallPackageImpl#getStorageType()
	 * @generated
	 */
	int STORAGE_TYPE = 11;


	/**
	 * Returns the meta object for class '{@link myShoppingMall.Mall <em>Mall</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mall</em>'.
	 * @see myShoppingMall.Mall
	 * @generated
	 */
	EClass getMall();

	/**
	 * Returns the meta object for the attribute '{@link myShoppingMall.Mall#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see myShoppingMall.Mall#getName()
	 * @see #getMall()
	 * @generated
	 */
	EAttribute getMall_Name();

	/**
	 * Returns the meta object for the attribute '{@link myShoppingMall.Mall#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see myShoppingMall.Mall#getLocation()
	 * @see #getMall()
	 * @generated
	 */
	EAttribute getMall_Location();

	/**
	 * Returns the meta object for the containment reference list '{@link myShoppingMall.Mall#getShops <em>Shops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Shops</em>'.
	 * @see myShoppingMall.Mall#getShops()
	 * @see #getMall()
	 * @generated
	 */
	EReference getMall_Shops();

	/**
	 * Returns the meta object for the containment reference list '{@link myShoppingMall.Mall#getEmployees <em>Employees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Employees</em>'.
	 * @see myShoppingMall.Mall#getEmployees()
	 * @see #getMall()
	 * @generated
	 */
	EReference getMall_Employees();

	/**
	 * Returns the meta object for the containment reference '{@link myShoppingMall.Mall#getSchedule <em>Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Schedule</em>'.
	 * @see myShoppingMall.Mall#getSchedule()
	 * @see #getMall()
	 * @generated
	 */
	EReference getMall_Schedule();

	/**
	 * Returns the meta object for class '{@link myShoppingMall.Shops <em>Shops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shops</em>'.
	 * @see myShoppingMall.Shops
	 * @generated
	 */
	EClass getShops();

	/**
	 * Returns the meta object for the attribute '{@link myShoppingMall.Shops#getShopName <em>Shop Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shop Name</em>'.
	 * @see myShoppingMall.Shops#getShopName()
	 * @see #getShops()
	 * @generated
	 */
	EAttribute getShops_ShopName();

	/**
	 * Returns the meta object for the attribute '{@link myShoppingMall.Shops#getFloor <em>Floor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Floor</em>'.
	 * @see myShoppingMall.Shops#getFloor()
	 * @see #getShops()
	 * @generated
	 */
	EAttribute getShops_Floor();

	/**
	 * Returns the meta object for the attribute '{@link myShoppingMall.Shops#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see myShoppingMall.Shops#getAddress()
	 * @see #getShops()
	 * @generated
	 */
	EAttribute getShops_Address();

	/**
	 * Returns the meta object for the attribute '{@link myShoppingMall.Shops#getPhotos <em>Photos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Photos</em>'.
	 * @see myShoppingMall.Shops#getPhotos()
	 * @see #getShops()
	 * @generated
	 */
	EAttribute getShops_Photos();

	/**
	 * Returns the meta object for the containment reference list '{@link myShoppingMall.Shops#getEmployees <em>Employees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Employees</em>'.
	 * @see myShoppingMall.Shops#getEmployees()
	 * @see #getShops()
	 * @generated
	 */
	EReference getShops_Employees();

	/**
	 * Returns the meta object for the containment reference list '{@link myShoppingMall.Shops#getStorages <em>Storages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Storages</em>'.
	 * @see myShoppingMall.Shops#getStorages()
	 * @see #getShops()
	 * @generated
	 */
	EReference getShops_Storages();

	/**
	 * Returns the meta object for the containment reference '{@link myShoppingMall.Shops#getSchedule <em>Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Schedule</em>'.
	 * @see myShoppingMall.Shops#getSchedule()
	 * @see #getShops()
	 * @generated
	 */
	EReference getShops_Schedule();

	/**
	 * Returns the meta object for class '{@link myShoppingMall.Storage <em>Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storage</em>'.
	 * @see myShoppingMall.Storage
	 * @generated
	 */
	EClass getStorage();

	/**
	 * Returns the meta object for the attribute '{@link myShoppingMall.Storage#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see myShoppingMall.Storage#getType()
	 * @see #getStorage()
	 * @generated
	 */
	EAttribute getStorage_Type();

	/**
	 * Returns the meta object for the attribute '{@link myShoppingMall.Storage#getNumberOfLayers <em>Number Of Layers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Layers</em>'.
	 * @see myShoppingMall.Storage#getNumberOfLayers()
	 * @see #getStorage()
	 * @generated
	 */
	EAttribute getStorage_NumberOfLayers();

	/**
	 * Returns the meta object for the attribute '{@link myShoppingMall.Storage#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see myShoppingMall.Storage#getSize()
	 * @see #getStorage()
	 * @generated
	 */
	EAttribute getStorage_Size();

	/**
	 * Returns the meta object for the attribute '{@link myShoppingMall.Storage#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see myShoppingMall.Storage#getPosition()
	 * @see #getStorage()
	 * @generated
	 */
	EAttribute getStorage_Position();

	/**
	 * Returns the meta object for the containment reference list '{@link myShoppingMall.Storage#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see myShoppingMall.Storage#getItems()
	 * @see #getStorage()
	 * @generated
	 */
	EReference getStorage_Items();

	/**
	 * Returns the meta object for class '{@link myShoppingMall.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see myShoppingMall.Item
	 * @generated
	 */
	EClass getItem();

	/**
	 * Returns the meta object for the attribute '{@link myShoppingMall.Item#getItemName <em>Item Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Item Name</em>'.
	 * @see myShoppingMall.Item#getItemName()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_ItemName();

	/**
	 * Returns the meta object for the attribute '{@link myShoppingMall.Item#getBName <em>BName</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>BName</em>'.
	 * @see myShoppingMall.Item#getBName()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_BName();

	/**
	 * Returns the meta object for the attribute '{@link myShoppingMall.Item#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see myShoppingMall.Item#getColor()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Color();

	/**
	 * Returns the meta object for the attribute '{@link myShoppingMall.Item#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model</em>'.
	 * @see myShoppingMall.Item#getModel()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Model();

	/**
	 * Returns the meta object for the attribute '{@link myShoppingMall.Item#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see myShoppingMall.Item#getSize()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Size();

	/**
	 * Returns the meta object for the attribute '{@link myShoppingMall.Item#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see myShoppingMall.Item#getPosition()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Position();

	/**
	 * Returns the meta object for the attribute '{@link myShoppingMall.Item#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see myShoppingMall.Item#getPrice()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Price();

	/**
	 * Returns the meta object for the containment reference '{@link myShoppingMall.Item#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Items</em>'.
	 * @see myShoppingMall.Item#getItems()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_Items();

	/**
	 * Returns the meta object for the containment reference '{@link myShoppingMall.Item#getOffer <em>Offer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Offer</em>'.
	 * @see myShoppingMall.Item#getOffer()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_Offer();

	/**
	 * Returns the meta object for class '{@link myShoppingMall.Offer <em>Offer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Offer</em>'.
	 * @see myShoppingMall.Offer
	 * @generated
	 */
	EClass getOffer();

	/**
	 * Returns the meta object for the attribute '{@link myShoppingMall.Offer#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see myShoppingMall.Offer#getStartDate()
	 * @see #getOffer()
	 * @generated
	 */
	EAttribute getOffer_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link myShoppingMall.Offer#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see myShoppingMall.Offer#getEndDate()
	 * @see #getOffer()
	 * @generated
	 */
	EAttribute getOffer_EndDate();

	/**
	 * Returns the meta object for the attribute '{@link myShoppingMall.Offer#getDiscount <em>Discount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discount</em>'.
	 * @see myShoppingMall.Offer#getDiscount()
	 * @see #getOffer()
	 * @generated
	 */
	EAttribute getOffer_Discount();

	/**
	 * Returns the meta object for the attribute '{@link myShoppingMall.Offer#getPhotos <em>Photos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Photos</em>'.
	 * @see myShoppingMall.Offer#getPhotos()
	 * @see #getOffer()
	 * @generated
	 */
	EAttribute getOffer_Photos();

	/**
	 * Returns the meta object for the attribute '{@link myShoppingMall.Offer#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see myShoppingMall.Offer#getType()
	 * @see #getOffer()
	 * @generated
	 */
	EAttribute getOffer_Type();

	/**
	 * Returns the meta object for the attribute '{@link myShoppingMall.Offer#isIsValid <em>Is Valid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Valid</em>'.
	 * @see myShoppingMall.Offer#isIsValid()
	 * @see #getOffer()
	 * @generated
	 */
	EAttribute getOffer_IsValid();

	/**
	 * Returns the meta object for class '{@link myShoppingMall.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category</em>'.
	 * @see myShoppingMall.Category
	 * @generated
	 */
	EClass getCategory();

	/**
	 * Returns the meta object for the attribute '{@link myShoppingMall.Category#getCategoryName <em>Category Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category Name</em>'.
	 * @see myShoppingMall.Category#getCategoryName()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_CategoryName();

	/**
	 * Returns the meta object for the containment reference list '{@link myShoppingMall.Category#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains</em>'.
	 * @see myShoppingMall.Category#getContains()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_Contains();

	/**
	 * Returns the meta object for class '{@link myShoppingMall.SubCategory <em>Sub Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Category</em>'.
	 * @see myShoppingMall.SubCategory
	 * @generated
	 */
	EClass getSubCategory();

	/**
	 * Returns the meta object for the attribute '{@link myShoppingMall.SubCategory#getSubCategoryName <em>Sub Category Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Category Name</em>'.
	 * @see myShoppingMall.SubCategory#getSubCategoryName()
	 * @see #getSubCategory()
	 * @generated
	 */
	EAttribute getSubCategory_SubCategoryName();

	/**
	 * Returns the meta object for class '{@link myShoppingMall.Schedule <em>Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schedule</em>'.
	 * @see myShoppingMall.Schedule
	 * @generated
	 */
	EClass getSchedule();

	/**
	 * Returns the meta object for the attribute '{@link myShoppingMall.Schedule#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see myShoppingMall.Schedule#getStartTime()
	 * @see #getSchedule()
	 * @generated
	 */
	EAttribute getSchedule_StartTime();

	/**
	 * Returns the meta object for the attribute '{@link myShoppingMall.Schedule#getEndTime <em>End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Time</em>'.
	 * @see myShoppingMall.Schedule#getEndTime()
	 * @see #getSchedule()
	 * @generated
	 */
	EAttribute getSchedule_EndTime();

	/**
	 * Returns the meta object for class '{@link myShoppingMall.Employee <em>Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Employee</em>'.
	 * @see myShoppingMall.Employee
	 * @generated
	 */
	EClass getEmployee();

	/**
	 * Returns the meta object for the attribute '{@link myShoppingMall.Employee#getEmployeeName <em>Employee Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Employee Name</em>'.
	 * @see myShoppingMall.Employee#getEmployeeName()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_EmployeeName();

	/**
	 * Returns the meta object for the attribute '{@link myShoppingMall.Employee#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see myShoppingMall.Employee#getID()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_ID();

	/**
	 * Returns the meta object for the attribute '{@link myShoppingMall.Employee#getDateOfBirth <em>Date Of Birth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Of Birth</em>'.
	 * @see myShoppingMall.Employee#getDateOfBirth()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_DateOfBirth();

	/**
	 * Returns the meta object for the attribute '{@link myShoppingMall.Employee#getDesignation <em>Designation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Designation</em>'.
	 * @see myShoppingMall.Employee#getDesignation()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_Designation();

	/**
	 * Returns the meta object for the attribute '{@link myShoppingMall.Employee#getFiscalCode <em>Fiscal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fiscal Code</em>'.
	 * @see myShoppingMall.Employee#getFiscalCode()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_FiscalCode();

	/**
	 * Returns the meta object for the attribute '{@link myShoppingMall.Employee#getShifts <em>Shifts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shifts</em>'.
	 * @see myShoppingMall.Employee#getShifts()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_Shifts();

	/**
	 * Returns the meta object for the containment reference '{@link myShoppingMall.Employee#getSchedule <em>Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Schedule</em>'.
	 * @see myShoppingMall.Employee#getSchedule()
	 * @see #getEmployee()
	 * @generated
	 */
	EReference getEmployee_Schedule();

	/**
	 * Returns the meta object for class '{@link myShoppingMall.Branded <em>Branded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Branded</em>'.
	 * @see myShoppingMall.Branded
	 * @generated
	 */
	EClass getBranded();

	/**
	 * Returns the meta object for the attribute '{@link myShoppingMall.Branded#getBName <em>BName</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>BName</em>'.
	 * @see myShoppingMall.Branded#getBName()
	 * @see #getBranded()
	 * @generated
	 */
	EAttribute getBranded_BName();

	/**
	 * Returns the meta object for class '{@link myShoppingMall.Specialistic <em>Specialistic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specialistic</em>'.
	 * @see myShoppingMall.Specialistic
	 * @generated
	 */
	EClass getSpecialistic();

	/**
	 * Returns the meta object for the attribute '{@link myShoppingMall.Specialistic#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see myShoppingMall.Specialistic#getType()
	 * @see #getSpecialistic()
	 * @generated
	 */
	EAttribute getSpecialistic_Type();

	/**
	 * Returns the meta object for enum '{@link myShoppingMall.StorageType <em>Storage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Storage Type</em>'.
	 * @see myShoppingMall.StorageType
	 * @generated
	 */
	EEnum getStorageType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MyShoppingMallFactory getMyShoppingMallFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link myShoppingMall.impl.MallImpl <em>Mall</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see myShoppingMall.impl.MallImpl
		 * @see myShoppingMall.impl.MyShoppingMallPackageImpl#getMall()
		 * @generated
		 */
		EClass MALL = eINSTANCE.getMall();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MALL__NAME = eINSTANCE.getMall_Name();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MALL__LOCATION = eINSTANCE.getMall_Location();

		/**
		 * The meta object literal for the '<em><b>Shops</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MALL__SHOPS = eINSTANCE.getMall_Shops();

		/**
		 * The meta object literal for the '<em><b>Employees</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MALL__EMPLOYEES = eINSTANCE.getMall_Employees();

		/**
		 * The meta object literal for the '<em><b>Schedule</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MALL__SCHEDULE = eINSTANCE.getMall_Schedule();

		/**
		 * The meta object literal for the '{@link myShoppingMall.impl.ShopsImpl <em>Shops</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see myShoppingMall.impl.ShopsImpl
		 * @see myShoppingMall.impl.MyShoppingMallPackageImpl#getShops()
		 * @generated
		 */
		EClass SHOPS = eINSTANCE.getShops();

		/**
		 * The meta object literal for the '<em><b>Shop Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOPS__SHOP_NAME = eINSTANCE.getShops_ShopName();

		/**
		 * The meta object literal for the '<em><b>Floor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOPS__FLOOR = eINSTANCE.getShops_Floor();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOPS__ADDRESS = eINSTANCE.getShops_Address();

		/**
		 * The meta object literal for the '<em><b>Photos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOPS__PHOTOS = eINSTANCE.getShops_Photos();

		/**
		 * The meta object literal for the '<em><b>Employees</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHOPS__EMPLOYEES = eINSTANCE.getShops_Employees();

		/**
		 * The meta object literal for the '<em><b>Storages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHOPS__STORAGES = eINSTANCE.getShops_Storages();

		/**
		 * The meta object literal for the '<em><b>Schedule</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHOPS__SCHEDULE = eINSTANCE.getShops_Schedule();

		/**
		 * The meta object literal for the '{@link myShoppingMall.impl.StorageImpl <em>Storage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see myShoppingMall.impl.StorageImpl
		 * @see myShoppingMall.impl.MyShoppingMallPackageImpl#getStorage()
		 * @generated
		 */
		EClass STORAGE = eINSTANCE.getStorage();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORAGE__TYPE = eINSTANCE.getStorage_Type();

		/**
		 * The meta object literal for the '<em><b>Number Of Layers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORAGE__NUMBER_OF_LAYERS = eINSTANCE.getStorage_NumberOfLayers();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORAGE__SIZE = eINSTANCE.getStorage_Size();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORAGE__POSITION = eINSTANCE.getStorage_Position();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORAGE__ITEMS = eINSTANCE.getStorage_Items();

		/**
		 * The meta object literal for the '{@link myShoppingMall.impl.ItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see myShoppingMall.impl.ItemImpl
		 * @see myShoppingMall.impl.MyShoppingMallPackageImpl#getItem()
		 * @generated
		 */
		EClass ITEM = eINSTANCE.getItem();

		/**
		 * The meta object literal for the '<em><b>Item Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__ITEM_NAME = eINSTANCE.getItem_ItemName();

		/**
		 * The meta object literal for the '<em><b>BName</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__BNAME = eINSTANCE.getItem_BName();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__COLOR = eINSTANCE.getItem_Color();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__MODEL = eINSTANCE.getItem_Model();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__SIZE = eINSTANCE.getItem_Size();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__POSITION = eINSTANCE.getItem_Position();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__PRICE = eINSTANCE.getItem_Price();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__ITEMS = eINSTANCE.getItem_Items();

		/**
		 * The meta object literal for the '<em><b>Offer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__OFFER = eINSTANCE.getItem_Offer();

		/**
		 * The meta object literal for the '{@link myShoppingMall.impl.OfferImpl <em>Offer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see myShoppingMall.impl.OfferImpl
		 * @see myShoppingMall.impl.MyShoppingMallPackageImpl#getOffer()
		 * @generated
		 */
		EClass OFFER = eINSTANCE.getOffer();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OFFER__START_DATE = eINSTANCE.getOffer_StartDate();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OFFER__END_DATE = eINSTANCE.getOffer_EndDate();

		/**
		 * The meta object literal for the '<em><b>Discount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OFFER__DISCOUNT = eINSTANCE.getOffer_Discount();

		/**
		 * The meta object literal for the '<em><b>Photos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OFFER__PHOTOS = eINSTANCE.getOffer_Photos();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OFFER__TYPE = eINSTANCE.getOffer_Type();

		/**
		 * The meta object literal for the '<em><b>Is Valid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OFFER__IS_VALID = eINSTANCE.getOffer_IsValid();

		/**
		 * The meta object literal for the '{@link myShoppingMall.impl.CategoryImpl <em>Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see myShoppingMall.impl.CategoryImpl
		 * @see myShoppingMall.impl.MyShoppingMallPackageImpl#getCategory()
		 * @generated
		 */
		EClass CATEGORY = eINSTANCE.getCategory();

		/**
		 * The meta object literal for the '<em><b>Category Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__CATEGORY_NAME = eINSTANCE.getCategory_CategoryName();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__CONTAINS = eINSTANCE.getCategory_Contains();

		/**
		 * The meta object literal for the '{@link myShoppingMall.impl.SubCategoryImpl <em>Sub Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see myShoppingMall.impl.SubCategoryImpl
		 * @see myShoppingMall.impl.MyShoppingMallPackageImpl#getSubCategory()
		 * @generated
		 */
		EClass SUB_CATEGORY = eINSTANCE.getSubCategory();

		/**
		 * The meta object literal for the '<em><b>Sub Category Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_CATEGORY__SUB_CATEGORY_NAME = eINSTANCE.getSubCategory_SubCategoryName();

		/**
		 * The meta object literal for the '{@link myShoppingMall.impl.ScheduleImpl <em>Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see myShoppingMall.impl.ScheduleImpl
		 * @see myShoppingMall.impl.MyShoppingMallPackageImpl#getSchedule()
		 * @generated
		 */
		EClass SCHEDULE = eINSTANCE.getSchedule();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULE__START_TIME = eINSTANCE.getSchedule_StartTime();

		/**
		 * The meta object literal for the '<em><b>End Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULE__END_TIME = eINSTANCE.getSchedule_EndTime();

		/**
		 * The meta object literal for the '{@link myShoppingMall.impl.EmployeeImpl <em>Employee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see myShoppingMall.impl.EmployeeImpl
		 * @see myShoppingMall.impl.MyShoppingMallPackageImpl#getEmployee()
		 * @generated
		 */
		EClass EMPLOYEE = eINSTANCE.getEmployee();

		/**
		 * The meta object literal for the '<em><b>Employee Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__EMPLOYEE_NAME = eINSTANCE.getEmployee_EmployeeName();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__ID = eINSTANCE.getEmployee_ID();

		/**
		 * The meta object literal for the '<em><b>Date Of Birth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__DATE_OF_BIRTH = eINSTANCE.getEmployee_DateOfBirth();

		/**
		 * The meta object literal for the '<em><b>Designation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__DESIGNATION = eINSTANCE.getEmployee_Designation();

		/**
		 * The meta object literal for the '<em><b>Fiscal Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__FISCAL_CODE = eINSTANCE.getEmployee_FiscalCode();

		/**
		 * The meta object literal for the '<em><b>Shifts</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__SHIFTS = eINSTANCE.getEmployee_Shifts();

		/**
		 * The meta object literal for the '<em><b>Schedule</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYEE__SCHEDULE = eINSTANCE.getEmployee_Schedule();

		/**
		 * The meta object literal for the '{@link myShoppingMall.impl.BrandedImpl <em>Branded</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see myShoppingMall.impl.BrandedImpl
		 * @see myShoppingMall.impl.MyShoppingMallPackageImpl#getBranded()
		 * @generated
		 */
		EClass BRANDED = eINSTANCE.getBranded();

		/**
		 * The meta object literal for the '<em><b>BName</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANDED__BNAME = eINSTANCE.getBranded_BName();

		/**
		 * The meta object literal for the '{@link myShoppingMall.impl.SpecialisticImpl <em>Specialistic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see myShoppingMall.impl.SpecialisticImpl
		 * @see myShoppingMall.impl.MyShoppingMallPackageImpl#getSpecialistic()
		 * @generated
		 */
		EClass SPECIALISTIC = eINSTANCE.getSpecialistic();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIALISTIC__TYPE = eINSTANCE.getSpecialistic_Type();

		/**
		 * The meta object literal for the '{@link myShoppingMall.StorageType <em>Storage Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see myShoppingMall.StorageType
		 * @see myShoppingMall.impl.MyShoppingMallPackageImpl#getStorageType()
		 * @generated
		 */
		EEnum STORAGE_TYPE = eINSTANCE.getStorageType();

	}

} //MyShoppingMallPackage
