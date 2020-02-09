/**
 */
package myShoppingMall.impl;

import java.util.Collection;

import myShoppingMall.Employee;
import myShoppingMall.MyShoppingMallPackage;
import myShoppingMall.Schedule;
import myShoppingMall.Shops;
import myShoppingMall.Storage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shops</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link myShoppingMall.impl.ShopsImpl#getShopName <em>Shop Name</em>}</li>
 *   <li>{@link myShoppingMall.impl.ShopsImpl#getFloor <em>Floor</em>}</li>
 *   <li>{@link myShoppingMall.impl.ShopsImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link myShoppingMall.impl.ShopsImpl#getPhotos <em>Photos</em>}</li>
 *   <li>{@link myShoppingMall.impl.ShopsImpl#getEmployees <em>Employees</em>}</li>
 *   <li>{@link myShoppingMall.impl.ShopsImpl#getStorages <em>Storages</em>}</li>
 *   <li>{@link myShoppingMall.impl.ShopsImpl#getSchedule <em>Schedule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShopsImpl extends EObjectImpl implements Shops {
	/**
	 * The default value of the '{@link #getShopName() <em>Shop Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShopName()
	 * @generated
	 * @ordered
	 */
	protected static final String SHOP_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShopName() <em>Shop Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShopName()
	 * @generated
	 * @ordered
	 */
	protected String shopName = SHOP_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFloor() <em>Floor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloor()
	 * @generated
	 * @ordered
	 */
	protected static final int FLOOR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFloor() <em>Floor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloor()
	 * @generated
	 * @ordered
	 */
	protected int floor = FLOOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected String address = ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhotos() <em>Photos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhotos()
	 * @generated
	 * @ordered
	 */
	protected static final String PHOTOS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhotos() <em>Photos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhotos()
	 * @generated
	 * @ordered
	 */
	protected String photos = PHOTOS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEmployees() <em>Employees</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployees()
	 * @generated
	 * @ordered
	 */
	protected EList<Employee> employees;

	/**
	 * The cached value of the '{@link #getStorages() <em>Storages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorages()
	 * @generated
	 * @ordered
	 */
	protected EList<Storage> storages;

	/**
	 * The cached value of the '{@link #getSchedule() <em>Schedule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedule()
	 * @generated
	 * @ordered
	 */
	protected Schedule schedule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShopsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyShoppingMallPackage.Literals.SHOPS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShopName() {
		return shopName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShopName(String newShopName) {
		String oldShopName = shopName;
		shopName = newShopName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyShoppingMallPackage.SHOPS__SHOP_NAME, oldShopName, shopName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFloor() {
		return floor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFloor(int newFloor) {
		int oldFloor = floor;
		floor = newFloor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyShoppingMallPackage.SHOPS__FLOOR, oldFloor, floor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(String newAddress) {
		String oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyShoppingMallPackage.SHOPS__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhotos() {
		return photos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhotos(String newPhotos) {
		String oldPhotos = photos;
		photos = newPhotos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyShoppingMallPackage.SHOPS__PHOTOS, oldPhotos, photos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Employee> getEmployees() {
		if (employees == null) {
			employees = new EObjectContainmentEList<Employee>(Employee.class, this, MyShoppingMallPackage.SHOPS__EMPLOYEES);
		}
		return employees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Storage> getStorages() {
		if (storages == null) {
			storages = new EObjectContainmentEList<Storage>(Storage.class, this, MyShoppingMallPackage.SHOPS__STORAGES);
		}
		return storages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schedule getSchedule() {
		return schedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchedule(Schedule newSchedule, NotificationChain msgs) {
		Schedule oldSchedule = schedule;
		schedule = newSchedule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyShoppingMallPackage.SHOPS__SCHEDULE, oldSchedule, newSchedule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchedule(Schedule newSchedule) {
		if (newSchedule != schedule) {
			NotificationChain msgs = null;
			if (schedule != null)
				msgs = ((InternalEObject)schedule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyShoppingMallPackage.SHOPS__SCHEDULE, null, msgs);
			if (newSchedule != null)
				msgs = ((InternalEObject)newSchedule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyShoppingMallPackage.SHOPS__SCHEDULE, null, msgs);
			msgs = basicSetSchedule(newSchedule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyShoppingMallPackage.SHOPS__SCHEDULE, newSchedule, newSchedule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean IsShopOpen() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MyShoppingMallPackage.SHOPS__EMPLOYEES:
				return ((InternalEList<?>)getEmployees()).basicRemove(otherEnd, msgs);
			case MyShoppingMallPackage.SHOPS__STORAGES:
				return ((InternalEList<?>)getStorages()).basicRemove(otherEnd, msgs);
			case MyShoppingMallPackage.SHOPS__SCHEDULE:
				return basicSetSchedule(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MyShoppingMallPackage.SHOPS__SHOP_NAME:
				return getShopName();
			case MyShoppingMallPackage.SHOPS__FLOOR:
				return getFloor();
			case MyShoppingMallPackage.SHOPS__ADDRESS:
				return getAddress();
			case MyShoppingMallPackage.SHOPS__PHOTOS:
				return getPhotos();
			case MyShoppingMallPackage.SHOPS__EMPLOYEES:
				return getEmployees();
			case MyShoppingMallPackage.SHOPS__STORAGES:
				return getStorages();
			case MyShoppingMallPackage.SHOPS__SCHEDULE:
				return getSchedule();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MyShoppingMallPackage.SHOPS__SHOP_NAME:
				setShopName((String)newValue);
				return;
			case MyShoppingMallPackage.SHOPS__FLOOR:
				setFloor((Integer)newValue);
				return;
			case MyShoppingMallPackage.SHOPS__ADDRESS:
				setAddress((String)newValue);
				return;
			case MyShoppingMallPackage.SHOPS__PHOTOS:
				setPhotos((String)newValue);
				return;
			case MyShoppingMallPackage.SHOPS__EMPLOYEES:
				getEmployees().clear();
				getEmployees().addAll((Collection<? extends Employee>)newValue);
				return;
			case MyShoppingMallPackage.SHOPS__STORAGES:
				getStorages().clear();
				getStorages().addAll((Collection<? extends Storage>)newValue);
				return;
			case MyShoppingMallPackage.SHOPS__SCHEDULE:
				setSchedule((Schedule)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MyShoppingMallPackage.SHOPS__SHOP_NAME:
				setShopName(SHOP_NAME_EDEFAULT);
				return;
			case MyShoppingMallPackage.SHOPS__FLOOR:
				setFloor(FLOOR_EDEFAULT);
				return;
			case MyShoppingMallPackage.SHOPS__ADDRESS:
				setAddress(ADDRESS_EDEFAULT);
				return;
			case MyShoppingMallPackage.SHOPS__PHOTOS:
				setPhotos(PHOTOS_EDEFAULT);
				return;
			case MyShoppingMallPackage.SHOPS__EMPLOYEES:
				getEmployees().clear();
				return;
			case MyShoppingMallPackage.SHOPS__STORAGES:
				getStorages().clear();
				return;
			case MyShoppingMallPackage.SHOPS__SCHEDULE:
				setSchedule((Schedule)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MyShoppingMallPackage.SHOPS__SHOP_NAME:
				return SHOP_NAME_EDEFAULT == null ? shopName != null : !SHOP_NAME_EDEFAULT.equals(shopName);
			case MyShoppingMallPackage.SHOPS__FLOOR:
				return floor != FLOOR_EDEFAULT;
			case MyShoppingMallPackage.SHOPS__ADDRESS:
				return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
			case MyShoppingMallPackage.SHOPS__PHOTOS:
				return PHOTOS_EDEFAULT == null ? photos != null : !PHOTOS_EDEFAULT.equals(photos);
			case MyShoppingMallPackage.SHOPS__EMPLOYEES:
				return employees != null && !employees.isEmpty();
			case MyShoppingMallPackage.SHOPS__STORAGES:
				return storages != null && !storages.isEmpty();
			case MyShoppingMallPackage.SHOPS__SCHEDULE:
				return schedule != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (ShopName: ");
		result.append(shopName);
		result.append(", Floor: ");
		result.append(floor);
		result.append(", Address: ");
		result.append(address);
		result.append(", Photos: ");
		result.append(photos);
		result.append(')');
		return result.toString();
	}

} //ShopsImpl
