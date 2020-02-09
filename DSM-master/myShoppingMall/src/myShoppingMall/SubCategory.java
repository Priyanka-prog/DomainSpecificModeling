/**
 */
package myShoppingMall;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link myShoppingMall.SubCategory#getSubCategoryName <em>Sub Category Name</em>}</li>
 * </ul>
 *
 * @see myShoppingMall.MyShoppingMallPackage#getSubCategory()
 * @model annotation="gmf.node label='SubCategoryName' figure='ellipse'"
 * @generated
 */
public interface SubCategory extends EObject {
	/**
	 * Returns the value of the '<em><b>Sub Category Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Category Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Category Name</em>' attribute.
	 * @see #setSubCategoryName(String)
	 * @see myShoppingMall.MyShoppingMallPackage#getSubCategory_SubCategoryName()
	 * @model
	 * @generated
	 */
	String getSubCategoryName();

	/**
	 * Sets the value of the '{@link myShoppingMall.SubCategory#getSubCategoryName <em>Sub Category Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Category Name</em>' attribute.
	 * @see #getSubCategoryName()
	 * @generated
	 */
	void setSubCategoryName(String value);

} // SubCategory
