/**
 */
package myShoppingMall.impl;

import myShoppingMall.Category;
import myShoppingMall.Item;
import myShoppingMall.MyShoppingMallPackage;
import myShoppingMall.Offer;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link myShoppingMall.impl.ItemImpl#getItemName <em>Item Name</em>}</li>
 *   <li>{@link myShoppingMall.impl.ItemImpl#getBName <em>BName</em>}</li>
 *   <li>{@link myShoppingMall.impl.ItemImpl#getColor <em>Color</em>}</li>
 *   <li>{@link myShoppingMall.impl.ItemImpl#getModel <em>Model</em>}</li>
 *   <li>{@link myShoppingMall.impl.ItemImpl#getSize <em>Size</em>}</li>
 *   <li>{@link myShoppingMall.impl.ItemImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link myShoppingMall.impl.ItemImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link myShoppingMall.impl.ItemImpl#getItems <em>Items</em>}</li>
 *   <li>{@link myShoppingMall.impl.ItemImpl#getOffer <em>Offer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ItemImpl extends EObjectImpl implements Item {
	/**
	 * The default value of the '{@link #getItemName() <em>Item Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemName()
	 * @generated
	 * @ordered
	 */
	protected static final String ITEM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getItemName() <em>Item Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemName()
	 * @generated
	 * @ordered
	 */
	protected String itemName = ITEM_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getBName() <em>BName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBName()
	 * @generated
	 * @ordered
	 */
	protected static final String BNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBName() <em>BName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBName()
	 * @generated
	 * @ordered
	 */
	protected String bName = BNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final String COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected String color = COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getModel() <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected String model = MODEL_EDEFAULT;

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
	 * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected static final float PRICE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected float price = PRICE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected Category items;

	/**
	 * The cached value of the '{@link #getOffer() <em>Offer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffer()
	 * @generated
	 * @ordered
	 */
	protected Offer offer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyShoppingMallPackage.Literals.ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getItemName() {
		return itemName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemName(String newItemName) {
		String oldItemName = itemName;
		itemName = newItemName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyShoppingMallPackage.ITEM__ITEM_NAME, oldItemName, itemName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBName() {
		return bName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBName(String newBName) {
		String oldBName = bName;
		bName = newBName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyShoppingMallPackage.ITEM__BNAME, oldBName, bName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(String newColor) {
		String oldColor = color;
		color = newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyShoppingMallPackage.ITEM__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(String newModel) {
		String oldModel = model;
		model = newModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyShoppingMallPackage.ITEM__MODEL, oldModel, model));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MyShoppingMallPackage.ITEM__SIZE, oldSize, size));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MyShoppingMallPackage.ITEM__POSITION, oldPosition, position));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrice(float newPrice) {
		float oldPrice = price;
		price = newPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyShoppingMallPackage.ITEM__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category getItems() {
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItems(Category newItems, NotificationChain msgs) {
		Category oldItems = items;
		items = newItems;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyShoppingMallPackage.ITEM__ITEMS, oldItems, newItems);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItems(Category newItems) {
		if (newItems != items) {
			NotificationChain msgs = null;
			if (items != null)
				msgs = ((InternalEObject)items).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyShoppingMallPackage.ITEM__ITEMS, null, msgs);
			if (newItems != null)
				msgs = ((InternalEObject)newItems).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyShoppingMallPackage.ITEM__ITEMS, null, msgs);
			msgs = basicSetItems(newItems, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyShoppingMallPackage.ITEM__ITEMS, newItems, newItems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Offer getOffer() {
		return offer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOffer(Offer newOffer, NotificationChain msgs) {
		Offer oldOffer = offer;
		offer = newOffer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyShoppingMallPackage.ITEM__OFFER, oldOffer, newOffer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffer(Offer newOffer) {
		if (newOffer != offer) {
			NotificationChain msgs = null;
			if (offer != null)
				msgs = ((InternalEObject)offer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyShoppingMallPackage.ITEM__OFFER, null, msgs);
			if (newOffer != null)
				msgs = ((InternalEObject)newOffer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyShoppingMallPackage.ITEM__OFFER, null, msgs);
			msgs = basicSetOffer(newOffer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyShoppingMallPackage.ITEM__OFFER, newOffer, newOffer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MyShoppingMallPackage.ITEM__ITEMS:
				return basicSetItems(null, msgs);
			case MyShoppingMallPackage.ITEM__OFFER:
				return basicSetOffer(null, msgs);
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
			case MyShoppingMallPackage.ITEM__ITEM_NAME:
				return getItemName();
			case MyShoppingMallPackage.ITEM__BNAME:
				return getBName();
			case MyShoppingMallPackage.ITEM__COLOR:
				return getColor();
			case MyShoppingMallPackage.ITEM__MODEL:
				return getModel();
			case MyShoppingMallPackage.ITEM__SIZE:
				return getSize();
			case MyShoppingMallPackage.ITEM__POSITION:
				return getPosition();
			case MyShoppingMallPackage.ITEM__PRICE:
				return getPrice();
			case MyShoppingMallPackage.ITEM__ITEMS:
				return getItems();
			case MyShoppingMallPackage.ITEM__OFFER:
				return getOffer();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MyShoppingMallPackage.ITEM__ITEM_NAME:
				setItemName((String)newValue);
				return;
			case MyShoppingMallPackage.ITEM__BNAME:
				setBName((String)newValue);
				return;
			case MyShoppingMallPackage.ITEM__COLOR:
				setColor((String)newValue);
				return;
			case MyShoppingMallPackage.ITEM__MODEL:
				setModel((String)newValue);
				return;
			case MyShoppingMallPackage.ITEM__SIZE:
				setSize((Integer)newValue);
				return;
			case MyShoppingMallPackage.ITEM__POSITION:
				setPosition((String)newValue);
				return;
			case MyShoppingMallPackage.ITEM__PRICE:
				setPrice((Float)newValue);
				return;
			case MyShoppingMallPackage.ITEM__ITEMS:
				setItems((Category)newValue);
				return;
			case MyShoppingMallPackage.ITEM__OFFER:
				setOffer((Offer)newValue);
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
			case MyShoppingMallPackage.ITEM__ITEM_NAME:
				setItemName(ITEM_NAME_EDEFAULT);
				return;
			case MyShoppingMallPackage.ITEM__BNAME:
				setBName(BNAME_EDEFAULT);
				return;
			case MyShoppingMallPackage.ITEM__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case MyShoppingMallPackage.ITEM__MODEL:
				setModel(MODEL_EDEFAULT);
				return;
			case MyShoppingMallPackage.ITEM__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case MyShoppingMallPackage.ITEM__POSITION:
				setPosition(POSITION_EDEFAULT);
				return;
			case MyShoppingMallPackage.ITEM__PRICE:
				setPrice(PRICE_EDEFAULT);
				return;
			case MyShoppingMallPackage.ITEM__ITEMS:
				setItems((Category)null);
				return;
			case MyShoppingMallPackage.ITEM__OFFER:
				setOffer((Offer)null);
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
			case MyShoppingMallPackage.ITEM__ITEM_NAME:
				return ITEM_NAME_EDEFAULT == null ? itemName != null : !ITEM_NAME_EDEFAULT.equals(itemName);
			case MyShoppingMallPackage.ITEM__BNAME:
				return BNAME_EDEFAULT == null ? bName != null : !BNAME_EDEFAULT.equals(bName);
			case MyShoppingMallPackage.ITEM__COLOR:
				return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
			case MyShoppingMallPackage.ITEM__MODEL:
				return MODEL_EDEFAULT == null ? model != null : !MODEL_EDEFAULT.equals(model);
			case MyShoppingMallPackage.ITEM__SIZE:
				return size != SIZE_EDEFAULT;
			case MyShoppingMallPackage.ITEM__POSITION:
				return POSITION_EDEFAULT == null ? position != null : !POSITION_EDEFAULT.equals(position);
			case MyShoppingMallPackage.ITEM__PRICE:
				return price != PRICE_EDEFAULT;
			case MyShoppingMallPackage.ITEM__ITEMS:
				return items != null;
			case MyShoppingMallPackage.ITEM__OFFER:
				return offer != null;
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
		result.append(" (ItemName: ");
		result.append(itemName);
		result.append(", BName: ");
		result.append(bName);
		result.append(", Color: ");
		result.append(color);
		result.append(", Model: ");
		result.append(model);
		result.append(", Size: ");
		result.append(size);
		result.append(", Position: ");
		result.append(position);
		result.append(", Price: ");
		result.append(price);
		result.append(')');
		return result.toString();
	}

} //ItemImpl
