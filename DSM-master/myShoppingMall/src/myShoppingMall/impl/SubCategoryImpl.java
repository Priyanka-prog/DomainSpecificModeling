/**
 */
package myShoppingMall.impl;

import myShoppingMall.MyShoppingMallPackage;
import myShoppingMall.SubCategory;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link myShoppingMall.impl.SubCategoryImpl#getSubCategoryName <em>Sub Category Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubCategoryImpl extends EObjectImpl implements SubCategory {
	/**
	 * The default value of the '{@link #getSubCategoryName() <em>Sub Category Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubCategoryName()
	 * @generated
	 * @ordered
	 */
	protected static final String SUB_CATEGORY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubCategoryName() <em>Sub Category Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubCategoryName()
	 * @generated
	 * @ordered
	 */
	protected String subCategoryName = SUB_CATEGORY_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubCategoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyShoppingMallPackage.Literals.SUB_CATEGORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubCategoryName() {
		return subCategoryName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubCategoryName(String newSubCategoryName) {
		String oldSubCategoryName = subCategoryName;
		subCategoryName = newSubCategoryName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyShoppingMallPackage.SUB_CATEGORY__SUB_CATEGORY_NAME, oldSubCategoryName, subCategoryName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MyShoppingMallPackage.SUB_CATEGORY__SUB_CATEGORY_NAME:
				return getSubCategoryName();
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
			case MyShoppingMallPackage.SUB_CATEGORY__SUB_CATEGORY_NAME:
				setSubCategoryName((String)newValue);
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
			case MyShoppingMallPackage.SUB_CATEGORY__SUB_CATEGORY_NAME:
				setSubCategoryName(SUB_CATEGORY_NAME_EDEFAULT);
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
			case MyShoppingMallPackage.SUB_CATEGORY__SUB_CATEGORY_NAME:
				return SUB_CATEGORY_NAME_EDEFAULT == null ? subCategoryName != null : !SUB_CATEGORY_NAME_EDEFAULT.equals(subCategoryName);
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
		result.append(" (SubCategoryName: ");
		result.append(subCategoryName);
		result.append(')');
		return result.toString();
	}

} //SubCategoryImpl
