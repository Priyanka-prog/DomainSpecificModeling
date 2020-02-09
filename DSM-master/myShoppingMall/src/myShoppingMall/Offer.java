/**
 */
package myShoppingMall;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Offer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link myShoppingMall.Offer#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link myShoppingMall.Offer#getEndDate <em>End Date</em>}</li>
 *   <li>{@link myShoppingMall.Offer#getDiscount <em>Discount</em>}</li>
 *   <li>{@link myShoppingMall.Offer#getPhotos <em>Photos</em>}</li>
 *   <li>{@link myShoppingMall.Offer#getType <em>Type</em>}</li>
 *   <li>{@link myShoppingMall.Offer#isIsValid <em>Is Valid</em>}</li>
 * </ul>
 *
 * @see myShoppingMall.MyShoppingMallPackage#getOffer()
 * @model annotation="gmf.node label='Discount' figure='ellipse'"
 * @generated
 */
public interface Offer extends EObject {
	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(Date)
	 * @see myShoppingMall.MyShoppingMallPackage#getOffer_StartDate()
	 * @model
	 * @generated
	 */
	Date getStartDate();

	/**
	 * Sets the value of the '{@link myShoppingMall.Offer#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #setEndDate(Date)
	 * @see myShoppingMall.MyShoppingMallPackage#getOffer_EndDate()
	 * @model
	 * @generated
	 */
	Date getEndDate();

	/**
	 * Sets the value of the '{@link myShoppingMall.Offer#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(Date value);

	/**
	 * Returns the value of the '<em><b>Discount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discount</em>' attribute.
	 * @see #setDiscount(String)
	 * @see myShoppingMall.MyShoppingMallPackage#getOffer_Discount()
	 * @model
	 * @generated
	 */
	String getDiscount();

	/**
	 * Sets the value of the '{@link myShoppingMall.Offer#getDiscount <em>Discount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discount</em>' attribute.
	 * @see #getDiscount()
	 * @generated
	 */
	void setDiscount(String value);

	/**
	 * Returns the value of the '<em><b>Photos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Photos</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Photos</em>' attribute.
	 * @see #setPhotos(String)
	 * @see myShoppingMall.MyShoppingMallPackage#getOffer_Photos()
	 * @model
	 * @generated
	 */
	String getPhotos();

	/**
	 * Sets the value of the '{@link myShoppingMall.Offer#getPhotos <em>Photos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Photos</em>' attribute.
	 * @see #getPhotos()
	 * @generated
	 */
	void setPhotos(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see myShoppingMall.MyShoppingMallPackage#getOffer_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link myShoppingMall.Offer#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Is Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Valid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Valid</em>' attribute.
	 * @see #setIsValid(boolean)
	 * @see myShoppingMall.MyShoppingMallPackage#getOffer_IsValid()
	 * @model
	 * @generated
	 */
	boolean isIsValid();

	/**
	 * Sets the value of the '{@link myShoppingMall.Offer#isIsValid <em>Is Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Valid</em>' attribute.
	 * @see #isIsValid()
	 * @generated
	 */
	void setIsValid(boolean value);

} // Offer
