/**
 */
package myShoppingMall;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mall</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link myShoppingMall.Mall#getName <em>Name</em>}</li>
 *   <li>{@link myShoppingMall.Mall#getLocation <em>Location</em>}</li>
 *   <li>{@link myShoppingMall.Mall#getShops <em>Shops</em>}</li>
 *   <li>{@link myShoppingMall.Mall#getEmployees <em>Employees</em>}</li>
 *   <li>{@link myShoppingMall.Mall#getSchedule <em>Schedule</em>}</li>
 * </ul>
 *
 * @see myShoppingMall.MyShoppingMallPackage#getMall()
 * @model annotation="gmf.diagram model.extension='mm' diagram.extension='mmd'"
 * @generated
 */
public interface Mall extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see myShoppingMall.MyShoppingMallPackage#getMall_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link myShoppingMall.Mall#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see myShoppingMall.MyShoppingMallPackage#getMall_Location()
	 * @model
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link myShoppingMall.Mall#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Shops</b></em>' containment reference list.
	 * The list contents are of type {@link myShoppingMall.Shops}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shops</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shops</em>' containment reference list.
	 * @see myShoppingMall.MyShoppingMallPackage#getMall_Shops()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Shops> getShops();

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
	 * @see myShoppingMall.MyShoppingMallPackage#getMall_Employees()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Employee> getEmployees();

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
	 * @see myShoppingMall.MyShoppingMallPackage#getMall_Schedule()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Schedule getSchedule();

	/**
	 * Sets the value of the '{@link myShoppingMall.Mall#getSchedule <em>Schedule</em>}' containment reference.
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
	boolean IsOpen();

} // Mall
