/**
 */
package myShoppingMall;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link myShoppingMall.Category#getCategoryName <em>Category Name</em>}</li>
 *   <li>{@link myShoppingMall.Category#getContains <em>Contains</em>}</li>
 * </ul>
 *
 * @see myShoppingMall.MyShoppingMallPackage#getCategory()
 * @model annotation="gmf.node label='CategoryName' figure='rectangle'"
 * @generated
 */
public interface Category extends EObject {
	/**
	 * Returns the value of the '<em><b>Category Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category Name</em>' attribute.
	 * @see #setCategoryName(String)
	 * @see myShoppingMall.MyShoppingMallPackage#getCategory_CategoryName()
	 * @model
	 * @generated
	 */
	String getCategoryName();

	/**
	 * Sets the value of the '{@link myShoppingMall.Category#getCategoryName <em>Category Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category Name</em>' attribute.
	 * @see #getCategoryName()
	 * @generated
	 */
	void setCategoryName(String value);

	/**
	 * Returns the value of the '<em><b>Contains</b></em>' containment reference list.
	 * The list contents are of type {@link myShoppingMall.SubCategory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' containment reference list.
	 * @see myShoppingMall.MyShoppingMallPackage#getCategory_Contains()
	 * @model containment="true"
	 *        annotation="gmf.compartment collapsible='true'"
	 * @generated
	 */
	EList<SubCategory> getContains();

} // Category
