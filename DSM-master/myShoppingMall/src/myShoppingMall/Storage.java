/**
 */
package myShoppingMall;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Storage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link myShoppingMall.Storage#getType <em>Type</em>}</li>
 *   <li>{@link myShoppingMall.Storage#getNumberOfLayers <em>Number Of Layers</em>}</li>
 *   <li>{@link myShoppingMall.Storage#getSize <em>Size</em>}</li>
 *   <li>{@link myShoppingMall.Storage#getPosition <em>Position</em>}</li>
 *   <li>{@link myShoppingMall.Storage#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see myShoppingMall.MyShoppingMallPackage#getStorage()
 * @model annotation="gmf.node label='Position' figure='rectangle'"
 * @generated
 */
public interface Storage extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link myShoppingMall.StorageType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see myShoppingMall.StorageType
	 * @see #setType(StorageType)
	 * @see myShoppingMall.MyShoppingMallPackage#getStorage_Type()
	 * @model
	 * @generated
	 */
	StorageType getType();

	/**
	 * Sets the value of the '{@link myShoppingMall.Storage#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see myShoppingMall.StorageType
	 * @see #getType()
	 * @generated
	 */
	void setType(StorageType value);

	/**
	 * Returns the value of the '<em><b>Number Of Layers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Layers</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Layers</em>' attribute.
	 * @see #setNumberOfLayers(int)
	 * @see myShoppingMall.MyShoppingMallPackage#getStorage_NumberOfLayers()
	 * @model
	 * @generated
	 */
	int getNumberOfLayers();

	/**
	 * Sets the value of the '{@link myShoppingMall.Storage#getNumberOfLayers <em>Number Of Layers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Layers</em>' attribute.
	 * @see #getNumberOfLayers()
	 * @generated
	 */
	void setNumberOfLayers(int value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see myShoppingMall.MyShoppingMallPackage#getStorage_Size()
	 * @model
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link myShoppingMall.Storage#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see #setPosition(String)
	 * @see myShoppingMall.MyShoppingMallPackage#getStorage_Position()
	 * @model
	 * @generated
	 */
	String getPosition();

	/**
	 * Sets the value of the '{@link myShoppingMall.Storage#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(String value);

	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link myShoppingMall.Item}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see myShoppingMall.MyShoppingMallPackage#getStorage_Items()
	 * @model containment="true"
	 *        annotation="gmf.compartment collapsible='true'"
	 * @generated
	 */
	EList<Item> getItems();

} // Storage
