/**
 */
package myShoppingMall.impl;

import myShoppingMall.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyShoppingMallFactoryImpl extends EFactoryImpl implements MyShoppingMallFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MyShoppingMallFactory init() {
		try {
			MyShoppingMallFactory theMyShoppingMallFactory = (MyShoppingMallFactory)EPackage.Registry.INSTANCE.getEFactory(MyShoppingMallPackage.eNS_URI);
			if (theMyShoppingMallFactory != null) {
				return theMyShoppingMallFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MyShoppingMallFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyShoppingMallFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MyShoppingMallPackage.MALL: return createMall();
			case MyShoppingMallPackage.SHOPS: return createShops();
			case MyShoppingMallPackage.STORAGE: return createStorage();
			case MyShoppingMallPackage.ITEM: return createItem();
			case MyShoppingMallPackage.OFFER: return createOffer();
			case MyShoppingMallPackage.CATEGORY: return createCategory();
			case MyShoppingMallPackage.SUB_CATEGORY: return createSubCategory();
			case MyShoppingMallPackage.SCHEDULE: return createSchedule();
			case MyShoppingMallPackage.EMPLOYEE: return createEmployee();
			case MyShoppingMallPackage.BRANDED: return createBranded();
			case MyShoppingMallPackage.SPECIALISTIC: return createSpecialistic();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case MyShoppingMallPackage.STORAGE_TYPE:
				return createStorageTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case MyShoppingMallPackage.STORAGE_TYPE:
				return convertStorageTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mall createMall() {
		MallImpl mall = new MallImpl();
		return mall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shops createShops() {
		ShopsImpl shops = new ShopsImpl();
		return shops;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Storage createStorage() {
		StorageImpl storage = new StorageImpl();
		return storage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Item createItem() {
		ItemImpl item = new ItemImpl();
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Offer createOffer() {
		OfferImpl offer = new OfferImpl();
		return offer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category createCategory() {
		CategoryImpl category = new CategoryImpl();
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubCategory createSubCategory() {
		SubCategoryImpl subCategory = new SubCategoryImpl();
		return subCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schedule createSchedule() {
		ScheduleImpl schedule = new ScheduleImpl();
		return schedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Employee createEmployee() {
		EmployeeImpl employee = new EmployeeImpl();
		return employee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Branded createBranded() {
		BrandedImpl branded = new BrandedImpl();
		return branded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specialistic createSpecialistic() {
		SpecialisticImpl specialistic = new SpecialisticImpl();
		return specialistic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StorageType createStorageTypeFromString(EDataType eDataType, String initialValue) {
		StorageType result = StorageType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStorageTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyShoppingMallPackage getMyShoppingMallPackage() {
		return (MyShoppingMallPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MyShoppingMallPackage getPackage() {
		return MyShoppingMallPackage.eINSTANCE;
	}

} //MyShoppingMallFactoryImpl
