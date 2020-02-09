/**
 */
package myShoppingMall.impl;

import myShoppingMall.Branded;
import myShoppingMall.Category;
import myShoppingMall.Employee;
import myShoppingMall.Item;
import myShoppingMall.Mall;
import myShoppingMall.MyShoppingMallFactory;
import myShoppingMall.MyShoppingMallPackage;
import myShoppingMall.Offer;
import myShoppingMall.Schedule;
import myShoppingMall.Shops;
import myShoppingMall.Specialistic;
import myShoppingMall.Storage;
import myShoppingMall.StorageType;
import myShoppingMall.SubCategory;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyShoppingMallPackageImpl extends EPackageImpl implements MyShoppingMallPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shopsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass offerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subCategoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scheduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass employeeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass brandedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specialisticEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum storageTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see myShoppingMall.MyShoppingMallPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MyShoppingMallPackageImpl() {
		super(eNS_URI, MyShoppingMallFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link MyShoppingMallPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MyShoppingMallPackage init() {
		if (isInited) return (MyShoppingMallPackage)EPackage.Registry.INSTANCE.getEPackage(MyShoppingMallPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMyShoppingMallPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MyShoppingMallPackageImpl theMyShoppingMallPackage = registeredMyShoppingMallPackage instanceof MyShoppingMallPackageImpl ? (MyShoppingMallPackageImpl)registeredMyShoppingMallPackage : new MyShoppingMallPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theMyShoppingMallPackage.createPackageContents();

		// Initialize created meta-data
		theMyShoppingMallPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMyShoppingMallPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MyShoppingMallPackage.eNS_URI, theMyShoppingMallPackage);
		return theMyShoppingMallPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMall() {
		return mallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMall_Name() {
		return (EAttribute)mallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMall_Location() {
		return (EAttribute)mallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMall_Shops() {
		return (EReference)mallEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMall_Employees() {
		return (EReference)mallEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMall_Schedule() {
		return (EReference)mallEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShops() {
		return shopsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShops_ShopName() {
		return (EAttribute)shopsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShops_Floor() {
		return (EAttribute)shopsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShops_Address() {
		return (EAttribute)shopsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShops_Photos() {
		return (EAttribute)shopsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShops_Employees() {
		return (EReference)shopsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShops_Storages() {
		return (EReference)shopsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShops_Schedule() {
		return (EReference)shopsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStorage() {
		return storageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStorage_Type() {
		return (EAttribute)storageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStorage_NumberOfLayers() {
		return (EAttribute)storageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStorage_Size() {
		return (EAttribute)storageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStorage_Position() {
		return (EAttribute)storageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStorage_Items() {
		return (EReference)storageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItem() {
		return itemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_ItemName() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_BName() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_Color() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_Model() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_Size() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_Position() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_Price() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItem_Items() {
		return (EReference)itemEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItem_Offer() {
		return (EReference)itemEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOffer() {
		return offerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOffer_StartDate() {
		return (EAttribute)offerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOffer_EndDate() {
		return (EAttribute)offerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOffer_Discount() {
		return (EAttribute)offerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOffer_Photos() {
		return (EAttribute)offerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOffer_Type() {
		return (EAttribute)offerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOffer_IsValid() {
		return (EAttribute)offerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCategory() {
		return categoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCategory_CategoryName() {
		return (EAttribute)categoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategory_Contains() {
		return (EReference)categoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubCategory() {
		return subCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubCategory_SubCategoryName() {
		return (EAttribute)subCategoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchedule() {
		return scheduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchedule_StartTime() {
		return (EAttribute)scheduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchedule_EndTime() {
		return (EAttribute)scheduleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmployee() {
		return employeeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmployee_EmployeeName() {
		return (EAttribute)employeeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmployee_ID() {
		return (EAttribute)employeeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmployee_DateOfBirth() {
		return (EAttribute)employeeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmployee_Designation() {
		return (EAttribute)employeeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmployee_FiscalCode() {
		return (EAttribute)employeeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmployee_Shifts() {
		return (EAttribute)employeeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEmployee_Schedule() {
		return (EReference)employeeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBranded() {
		return brandedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBranded_BName() {
		return (EAttribute)brandedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecialistic() {
		return specialisticEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecialistic_Type() {
		return (EAttribute)specialisticEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStorageType() {
		return storageTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyShoppingMallFactory getMyShoppingMallFactory() {
		return (MyShoppingMallFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		mallEClass = createEClass(MALL);
		createEAttribute(mallEClass, MALL__NAME);
		createEAttribute(mallEClass, MALL__LOCATION);
		createEReference(mallEClass, MALL__SHOPS);
		createEReference(mallEClass, MALL__EMPLOYEES);
		createEReference(mallEClass, MALL__SCHEDULE);

		shopsEClass = createEClass(SHOPS);
		createEAttribute(shopsEClass, SHOPS__SHOP_NAME);
		createEAttribute(shopsEClass, SHOPS__FLOOR);
		createEAttribute(shopsEClass, SHOPS__ADDRESS);
		createEAttribute(shopsEClass, SHOPS__PHOTOS);
		createEReference(shopsEClass, SHOPS__EMPLOYEES);
		createEReference(shopsEClass, SHOPS__STORAGES);
		createEReference(shopsEClass, SHOPS__SCHEDULE);

		storageEClass = createEClass(STORAGE);
		createEAttribute(storageEClass, STORAGE__TYPE);
		createEAttribute(storageEClass, STORAGE__NUMBER_OF_LAYERS);
		createEAttribute(storageEClass, STORAGE__SIZE);
		createEAttribute(storageEClass, STORAGE__POSITION);
		createEReference(storageEClass, STORAGE__ITEMS);

		itemEClass = createEClass(ITEM);
		createEAttribute(itemEClass, ITEM__ITEM_NAME);
		createEAttribute(itemEClass, ITEM__BNAME);
		createEAttribute(itemEClass, ITEM__COLOR);
		createEAttribute(itemEClass, ITEM__MODEL);
		createEAttribute(itemEClass, ITEM__SIZE);
		createEAttribute(itemEClass, ITEM__POSITION);
		createEAttribute(itemEClass, ITEM__PRICE);
		createEReference(itemEClass, ITEM__ITEMS);
		createEReference(itemEClass, ITEM__OFFER);

		offerEClass = createEClass(OFFER);
		createEAttribute(offerEClass, OFFER__START_DATE);
		createEAttribute(offerEClass, OFFER__END_DATE);
		createEAttribute(offerEClass, OFFER__DISCOUNT);
		createEAttribute(offerEClass, OFFER__PHOTOS);
		createEAttribute(offerEClass, OFFER__TYPE);
		createEAttribute(offerEClass, OFFER__IS_VALID);

		categoryEClass = createEClass(CATEGORY);
		createEAttribute(categoryEClass, CATEGORY__CATEGORY_NAME);
		createEReference(categoryEClass, CATEGORY__CONTAINS);

		subCategoryEClass = createEClass(SUB_CATEGORY);
		createEAttribute(subCategoryEClass, SUB_CATEGORY__SUB_CATEGORY_NAME);

		scheduleEClass = createEClass(SCHEDULE);
		createEAttribute(scheduleEClass, SCHEDULE__START_TIME);
		createEAttribute(scheduleEClass, SCHEDULE__END_TIME);

		employeeEClass = createEClass(EMPLOYEE);
		createEAttribute(employeeEClass, EMPLOYEE__EMPLOYEE_NAME);
		createEAttribute(employeeEClass, EMPLOYEE__ID);
		createEAttribute(employeeEClass, EMPLOYEE__DATE_OF_BIRTH);
		createEAttribute(employeeEClass, EMPLOYEE__DESIGNATION);
		createEAttribute(employeeEClass, EMPLOYEE__FISCAL_CODE);
		createEAttribute(employeeEClass, EMPLOYEE__SHIFTS);
		createEReference(employeeEClass, EMPLOYEE__SCHEDULE);

		brandedEClass = createEClass(BRANDED);
		createEAttribute(brandedEClass, BRANDED__BNAME);

		specialisticEClass = createEClass(SPECIALISTIC);
		createEAttribute(specialisticEClass, SPECIALISTIC__TYPE);

		// Create enums
		storageTypeEEnum = createEEnum(STORAGE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		brandedEClass.getESuperTypes().add(this.getShops());
		specialisticEClass.getESuperTypes().add(this.getShops());

		// Initialize classes and features; add operations and parameters
		initEClass(mallEClass, Mall.class, "Mall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMall_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Mall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMall_Location(), ecorePackage.getEString(), "Location", null, 0, 1, Mall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMall_Shops(), this.getShops(), null, "shops", null, 1, -1, Mall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMall_Employees(), this.getEmployee(), null, "employees", null, 1, -1, Mall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMall_Schedule(), this.getSchedule(), null, "schedule", null, 1, 1, Mall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(mallEClass, ecorePackage.getEBoolean(), "IsOpen", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(shopsEClass, Shops.class, "Shops", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShops_ShopName(), ecorePackage.getEString(), "ShopName", null, 0, 1, Shops.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShops_Floor(), ecorePackage.getEInt(), "Floor", null, 0, 1, Shops.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShops_Address(), ecorePackage.getEString(), "Address", null, 0, 1, Shops.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShops_Photos(), ecorePackage.getEString(), "Photos", null, 0, 1, Shops.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShops_Employees(), this.getEmployee(), null, "employees", null, 1, -1, Shops.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShops_Storages(), this.getStorage(), null, "storages", null, 1, -1, Shops.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShops_Schedule(), this.getSchedule(), null, "schedule", null, 1, 1, Shops.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(shopsEClass, ecorePackage.getEBoolean(), "IsShopOpen", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(storageEClass, Storage.class, "Storage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStorage_Type(), this.getStorageType(), "Type", null, 0, 1, Storage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStorage_NumberOfLayers(), ecorePackage.getEInt(), "NumberOfLayers", null, 0, 1, Storage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStorage_Size(), ecorePackage.getEInt(), "Size", null, 0, 1, Storage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStorage_Position(), ecorePackage.getEString(), "Position", null, 0, 1, Storage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStorage_Items(), this.getItem(), null, "items", null, 0, -1, Storage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(itemEClass, Item.class, "Item", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getItem_ItemName(), ecorePackage.getEString(), "ItemName", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_BName(), ecorePackage.getEString(), "BName", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_Color(), ecorePackage.getEString(), "Color", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_Model(), ecorePackage.getEString(), "Model", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_Size(), ecorePackage.getEInt(), "Size", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_Position(), ecorePackage.getEString(), "Position", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_Price(), ecorePackage.getEFloat(), "Price", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItem_Items(), this.getCategory(), null, "items", null, 1, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItem_Offer(), this.getOffer(), null, "offer", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(offerEClass, Offer.class, "Offer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOffer_StartDate(), ecorePackage.getEDate(), "StartDate", null, 0, 1, Offer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOffer_EndDate(), ecorePackage.getEDate(), "EndDate", null, 0, 1, Offer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOffer_Discount(), ecorePackage.getEString(), "Discount", null, 0, 1, Offer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOffer_Photos(), ecorePackage.getEString(), "Photos", null, 0, 1, Offer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOffer_Type(), ecorePackage.getEString(), "Type", null, 0, 1, Offer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOffer_IsValid(), ecorePackage.getEBoolean(), "IsValid", null, 0, 1, Offer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(categoryEClass, Category.class, "Category", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCategory_CategoryName(), ecorePackage.getEString(), "CategoryName", null, 0, 1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCategory_Contains(), this.getSubCategory(), null, "contains", null, 0, -1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subCategoryEClass, SubCategory.class, "SubCategory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubCategory_SubCategoryName(), ecorePackage.getEString(), "SubCategoryName", null, 0, 1, SubCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scheduleEClass, Schedule.class, "Schedule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSchedule_StartTime(), ecorePackage.getEDate(), "StartTime", null, 0, 1, Schedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchedule_EndTime(), ecorePackage.getEDate(), "EndTime", null, 0, 1, Schedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(employeeEClass, Employee.class, "Employee", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmployee_EmployeeName(), ecorePackage.getEString(), "EmployeeName", null, 0, 1, Employee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmployee_ID(), ecorePackage.getEInt(), "ID", null, 0, 1, Employee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmployee_DateOfBirth(), ecorePackage.getEDate(), "DateOfBirth", null, 0, 1, Employee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmployee_Designation(), ecorePackage.getEString(), "Designation", null, 0, 1, Employee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmployee_FiscalCode(), ecorePackage.getEString(), "FiscalCode", null, 0, 1, Employee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmployee_Shifts(), ecorePackage.getEString(), "Shifts", null, 0, 1, Employee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEmployee_Schedule(), this.getSchedule(), null, "schedule", null, 1, 1, Employee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(brandedEClass, Branded.class, "Branded", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBranded_BName(), ecorePackage.getEString(), "BName", null, 0, 1, Branded.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specialisticEClass, Specialistic.class, "Specialistic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpecialistic_Type(), ecorePackage.getEString(), "Type", null, 0, 1, Specialistic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(storageTypeEEnum, StorageType.class, "StorageType");
		addEEnumLiteral(storageTypeEEnum, StorageType.TABLE);
		addEEnumLiteral(storageTypeEEnum, StorageType.FRIDGE);
		addEEnumLiteral(storageTypeEEnum, StorageType.SHELVES);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf.diagram
		createGmfAnnotations();
		// gmf.node
		createGmf_1Annotations();
		// gmf.compartment
		createGmf_2Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf.diagram";
		addAnnotation
		  (mallEClass,
		   source,
		   new String[] {
			   "model.extension", "mm",
			   "diagram.extension", "mmd"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.node";
		addAnnotation
		  (shopsEClass,
		   source,
		   new String[] {
			   "label", "ShopName",
			   "figure", "rectangle"
		   });
		addAnnotation
		  (storageEClass,
		   source,
		   new String[] {
			   "label", "Position",
			   "figure", "rectangle"
		   });
		addAnnotation
		  (itemEClass,
		   source,
		   new String[] {
			   "label", "ItemName",
			   "figure", "ellipse"
		   });
		addAnnotation
		  (offerEClass,
		   source,
		   new String[] {
			   "label", "Discount",
			   "figure", "ellipse"
		   });
		addAnnotation
		  (categoryEClass,
		   source,
		   new String[] {
			   "label", "CategoryName",
			   "figure", "rectangle"
		   });
		addAnnotation
		  (subCategoryEClass,
		   source,
		   new String[] {
			   "label", "SubCategoryName",
			   "figure", "ellipse"
		   });
		addAnnotation
		  (employeeEClass,
		   source,
		   new String[] {
			   "label", "EmployeeName",
			   "figure", "ellipse"
		   });
		addAnnotation
		  (brandedEClass,
		   source,
		   new String[] {
			   "label", "BName",
			   "figure", "ellipse"
		   });
		addAnnotation
		  (specialisticEClass,
		   source,
		   new String[] {
			   "label", "Type",
			   "figure", "ellipse"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.compartment";
		addAnnotation
		  (getShops_Employees(),
		   source,
		   new String[] {
			   "collapsible", "true"
		   });
		addAnnotation
		  (getShops_Storages(),
		   source,
		   new String[] {
			   "collapsible", "true"
		   });
		addAnnotation
		  (getStorage_Items(),
		   source,
		   new String[] {
			   "collapsible", "true"
		   });
		addAnnotation
		  (getItem_Items(),
		   source,
		   new String[] {
			   "collapsible", "true"
		   });
		addAnnotation
		  (getCategory_Contains(),
		   source,
		   new String[] {
			   "collapsible", "true"
		   });
	}

} //MyShoppingMallPackageImpl
