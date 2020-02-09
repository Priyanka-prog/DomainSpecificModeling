/**
 */
package myShoppingMall.impl;

import java.util.Date;

import myShoppingMall.MyShoppingMallPackage;
import myShoppingMall.Offer;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Offer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link myShoppingMall.impl.OfferImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link myShoppingMall.impl.OfferImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link myShoppingMall.impl.OfferImpl#getDiscount <em>Discount</em>}</li>
 *   <li>{@link myShoppingMall.impl.OfferImpl#getPhotos <em>Photos</em>}</li>
 *   <li>{@link myShoppingMall.impl.OfferImpl#getType <em>Type</em>}</li>
 *   <li>{@link myShoppingMall.impl.OfferImpl#isIsValid <em>Is Valid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OfferImpl extends EObjectImpl implements Offer {
	/**
	 * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected Date startDate = START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected Date endDate = END_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiscount() <em>Discount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscount()
	 * @generated
	 * @ordered
	 */
	protected static final String DISCOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiscount() <em>Discount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscount()
	 * @generated
	 * @ordered
	 */
	protected String discount = DISCOUNT_EDEFAULT;

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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsValid() <em>Is Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsValid()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_VALID_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsValid() <em>Is Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsValid()
	 * @generated
	 * @ordered
	 */
	protected boolean isValid = IS_VALID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OfferImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyShoppingMallPackage.Literals.OFFER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartDate(Date newStartDate) {
		Date oldStartDate = startDate;
		startDate = newStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyShoppingMallPackage.OFFER__START_DATE, oldStartDate, startDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndDate(Date newEndDate) {
		Date oldEndDate = endDate;
		endDate = newEndDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyShoppingMallPackage.OFFER__END_DATE, oldEndDate, endDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDiscount() {
		return discount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscount(String newDiscount) {
		String oldDiscount = discount;
		discount = newDiscount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyShoppingMallPackage.OFFER__DISCOUNT, oldDiscount, discount));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MyShoppingMallPackage.OFFER__PHOTOS, oldPhotos, photos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyShoppingMallPackage.OFFER__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsValid() {
		return isValid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsValid(boolean newIsValid) {
		boolean oldIsValid = isValid;
		isValid = newIsValid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyShoppingMallPackage.OFFER__IS_VALID, oldIsValid, isValid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MyShoppingMallPackage.OFFER__START_DATE:
				return getStartDate();
			case MyShoppingMallPackage.OFFER__END_DATE:
				return getEndDate();
			case MyShoppingMallPackage.OFFER__DISCOUNT:
				return getDiscount();
			case MyShoppingMallPackage.OFFER__PHOTOS:
				return getPhotos();
			case MyShoppingMallPackage.OFFER__TYPE:
				return getType();
			case MyShoppingMallPackage.OFFER__IS_VALID:
				return isIsValid();
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
			case MyShoppingMallPackage.OFFER__START_DATE:
				setStartDate((Date)newValue);
				return;
			case MyShoppingMallPackage.OFFER__END_DATE:
				setEndDate((Date)newValue);
				return;
			case MyShoppingMallPackage.OFFER__DISCOUNT:
				setDiscount((String)newValue);
				return;
			case MyShoppingMallPackage.OFFER__PHOTOS:
				setPhotos((String)newValue);
				return;
			case MyShoppingMallPackage.OFFER__TYPE:
				setType((String)newValue);
				return;
			case MyShoppingMallPackage.OFFER__IS_VALID:
				setIsValid((Boolean)newValue);
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
			case MyShoppingMallPackage.OFFER__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
				return;
			case MyShoppingMallPackage.OFFER__END_DATE:
				setEndDate(END_DATE_EDEFAULT);
				return;
			case MyShoppingMallPackage.OFFER__DISCOUNT:
				setDiscount(DISCOUNT_EDEFAULT);
				return;
			case MyShoppingMallPackage.OFFER__PHOTOS:
				setPhotos(PHOTOS_EDEFAULT);
				return;
			case MyShoppingMallPackage.OFFER__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case MyShoppingMallPackage.OFFER__IS_VALID:
				setIsValid(IS_VALID_EDEFAULT);
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
			case MyShoppingMallPackage.OFFER__START_DATE:
				return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
			case MyShoppingMallPackage.OFFER__END_DATE:
				return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
			case MyShoppingMallPackage.OFFER__DISCOUNT:
				return DISCOUNT_EDEFAULT == null ? discount != null : !DISCOUNT_EDEFAULT.equals(discount);
			case MyShoppingMallPackage.OFFER__PHOTOS:
				return PHOTOS_EDEFAULT == null ? photos != null : !PHOTOS_EDEFAULT.equals(photos);
			case MyShoppingMallPackage.OFFER__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case MyShoppingMallPackage.OFFER__IS_VALID:
				return isValid != IS_VALID_EDEFAULT;
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
		result.append(" (StartDate: ");
		result.append(startDate);
		result.append(", EndDate: ");
		result.append(endDate);
		result.append(", Discount: ");
		result.append(discount);
		result.append(", Photos: ");
		result.append(photos);
		result.append(", Type: ");
		result.append(type);
		result.append(", IsValid: ");
		result.append(isValid);
		result.append(')');
		return result.toString();
	}

} //OfferImpl
