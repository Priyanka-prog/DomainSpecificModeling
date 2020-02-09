/**
 */
package myShoppingMall.impl;

import java.util.Collection;

import myShoppingMall.Item;
import myShoppingMall.MyShoppingMallPackage;
import myShoppingMall.Storage;
import myShoppingMall.StorageType;

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
 * An implementation of the model object '<em><b>Storage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link myShoppingMall.impl.StorageImpl#getType <em>Type</em>}</li>
 *   <li>{@link myShoppingMall.impl.StorageImpl#getNumberOfLayers <em>Number Of Layers</em>}</li>
 *   <li>{@link myShoppingMall.impl.StorageImpl#getSize <em>Size</em>}</li>
 *   <li>{@link myShoppingMall.impl.StorageImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link myShoppingMall.impl.StorageImpl#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StorageImpl extends EObjectImpl implements Storage {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final StorageType TYPE_EDEFAULT = StorageType.TABLE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected StorageType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfLayers() <em>Number Of Layers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfLayers()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_LAYERS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfLayers() <em>Number Of Layers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfLayers()
	 * @generated
	 * @ordered
	 */
	protected int numberOfLayers = NUMBER_OF_LAYERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final int SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected int size = SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected static final String POSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected String position = POSITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected EList<Item> items;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StorageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyShoppingMallPackage.Literals.STORAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StorageType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(StorageType newType) {
		StorageType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyShoppingMallPackage.STORAGE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfLayers() {
		return numberOfLayers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfLayers(int newNumberOfLayers) {
		int oldNumberOfLayers = numberOfLayers;
		numberOfLayers = newNumberOfLayers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyShoppingMallPackage.STORAGE__NUMBER_OF_LAYERS, oldNumberOfLayers, numberOfLayers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(int newSize) {
		int oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyShoppingMallPackage.STORAGE__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(String newPosition) {
		String oldPosition = position;
		position = newPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyShoppingMallPackage.STORAGE__POSITION, oldPosition, position));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Item> getItems() {
		if (items == null) {
			items = new EObjectContainmentEList<Item>(Item.class, this, MyShoppingMallPackage.STORAGE__ITEMS);
		}
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MyShoppingMallPackage.STORAGE__ITEMS:
				return ((InternalEList<?>)getItems()).basicRemove(otherEnd, msgs);
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
			case MyShoppingMallPackage.STORAGE__TYPE:
				return getType();
			case MyShoppingMallPackage.STORAGE__NUMBER_OF_LAYERS:
				return getNumberOfLayers();
			case MyShoppingMallPackage.STORAGE__SIZE:
				return getSize();
			case MyShoppingMallPackage.STORAGE__POSITION:
				return getPosition();
			case MyShoppingMallPackage.STORAGE__ITEMS:
				return getItems();
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
			case MyShoppingMallPackage.STORAGE__TYPE:
				setType((StorageType)newValue);
				return;
			case MyShoppingMallPackage.STORAGE__NUMBER_OF_LAYERS:
				setNumberOfLayers((Integer)newValue);
				return;
			case MyShoppingMallPackage.STORAGE__SIZE:
				setSize((Integer)newValue);
				return;
			case MyShoppingMallPackage.STORAGE__POSITION:
				setPosition((String)newValue);
				return;
			case MyShoppingMallPackage.STORAGE__ITEMS:
				getItems().clear();
				getItems().addAll((Collection<? extends Item>)newValue);
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
			case MyShoppingMallPackage.STORAGE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case MyShoppingMallPackage.STORAGE__NUMBER_OF_LAYERS:
				setNumberOfLayers(NUMBER_OF_LAYERS_EDEFAULT);
				return;
			case MyShoppingMallPackage.STORAGE__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case MyShoppingMallPackage.STORAGE__POSITION:
				setPosition(POSITION_EDEFAULT);
				return;
			case MyShoppingMallPackage.STORAGE__ITEMS:
				getItems().clear();
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
			case MyShoppingMallPackage.STORAGE__TYPE:
				return type != TYPE_EDEFAULT;
			case MyShoppingMallPackage.STORAGE__NUMBER_OF_LAYERS:
				return numberOfLayers != NUMBER_OF_LAYERS_EDEFAULT;
			case MyShoppingMallPackage.STORAGE__SIZE:
				return size != SIZE_EDEFAULT;
			case MyShoppingMallPackage.STORAGE__POSITION:
				return POSITION_EDEFAULT == null ? position != null : !POSITION_EDEFAULT.equals(position);
			case MyShoppingMallPackage.STORAGE__ITEMS:
				return items != null && !items.isEmpty();
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
		result.append(" (Type: ");
		result.append(type);
		result.append(", NumberOfLayers: ");
		result.append(numberOfLayers);
		result.append(", Size: ");
		result.append(size);
		result.append(", Position: ");
		result.append(position);
		result.append(')');
		return result.toString();
	}

} //StorageImpl
