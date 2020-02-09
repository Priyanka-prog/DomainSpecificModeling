/**
 */
package myShoppingMall;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shops</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link myShoppingMall.Shops#getShopName <em>Shop Name</em>}</li>
 *   <li>{@link myShoppingMall.Shops#getFloor <em>Floor</em>}</li>
 *   <li>{@link myShoppingMall.Shops#getAddress <em>Address</em>}</li>
 *   <li>{@link myShoppingMall.Shops#getPhotos <em>Photos</em>}</li>
 *   <li>{@link myShoppingMall.Shops#getEmployees <em>Employees</em>}</li>
 *   <li>{@link myShoppingMall.Shops#getStorages <em>Storages</em>}</li>
 *   <li>{@link myShoppingMall.Shops#getSchedule <em>Schedule</em>}</li>
 * </ul>
 *
 * @see myShoppingMall.MyShoppingMallPackage#getShops()
 * @model annotation="gmf.node label='ShopName' figure='rectangle'"
 * @generated
 */
public interface Shops extends EObject {
	/**
	 * Returns the value of the '<em><b>Shop Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shop Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shop Name</em>' attribute.
	 * @see #setShopName(String)
	 * @see myShoppingMall.MyShoppingMallPackage#getShops_ShopName()
	 * @model
	 * @generated
	 */
	String getShopName();

	/**
	 * Sets the value of the '{@link myShoppingMall.Shops#getShopName <em>Shop Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shop Name</em>' attribute.
	 * @see #getShopName()
	 * @generated
	 */
	void setShopName(String value);

	/**
	 * Returns the value of the '<em><b>Floor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Floor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Floor</em>' attribute.
	 * @see #setFloor(int)
	 * @see myShoppingMall.MyShoppingMallPackage#getShops_Floor()
	 * @model
	 * @generated
	 */
	int getFloor();

	/**
	 * Sets the value of the '{@link myShoppingMall.Shops#getFloor <em>Floor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Floor</em>' attribute.
	 * @see #getFloor()
	 * @generated
	 */
	void setFloor(int value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see myShoppingMall.MyShoppingMallPackage#getShops_Address()
	 * @model
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link myShoppingMall.Shops#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

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
	 * @see myShoppingMall.MyShoppingMallPackage#getShops_Photos()
	 * @model
	 * @generated
	 */
	String getPhotos();

	/**
	 * Sets the value of the '{@link myShoppingMall.Shops#getPhotos <em>Photos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Photos</em>' attribute.
	 * @see #getPhotos()
	 * @generated
	 */
	void setPhotos(String value);

	/**
	 * Returns the value of the '<em><b>Employees</b></em>' containment reference list.
	 * The list contents are of type {@link myShoppingMall.Employee}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Employees</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employees</em>' containment reference list.
	 * @see myShoppingMall.MyShoppingMallPackage#getShops_Employees()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment collapsible='true'"
	 * @generated
	 */
	EList<Employee> getEmployees();

	/**
	 * Returns the value of the '<em><b>Storages</b></em>' containment reference list.
	 * The list contents are of type {@link myShoppingMall.Storage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Storages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storages</em>' containment reference list.
	 * @see myShoppingMall.MyShoppingMallPackage#getShops_Storages()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment collapsible='true'"
	 * @generated
	 */
	EList<Storage> getStorages();

	/**
	 * Returns the value of the '<em><b>Schedule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedule</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedule</em>' containment reference.
	 * @see #setSchedule(Schedule)
	 * @see myShoppingMall.MyShoppingMallPackage#getShops_Schedule()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Schedule getSchedule();

	/**
	 * Sets the value of the '{@link myShoppingMall.Shops#getSchedule <em>Schedule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedule</em>' containment reference.
	 * @see #getSchedule()
	 * @generated
	 */
	void setSchedule(Schedule value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean IsShopOpen();

} // Shops
