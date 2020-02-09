/*
* 
*/
package myShoppingMall.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class CategoryCategoryContainsCompartmentItemSemanticEditPolicy
		extends myShoppingMall.diagram.edit.policies.MyShoppingMallBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public CategoryCategoryContainsCompartmentItemSemanticEditPolicy() {
		super(myShoppingMall.diagram.providers.MyShoppingMallElementTypes.Category_3004);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (myShoppingMall.diagram.providers.MyShoppingMallElementTypes.SubCategory_3005 == req.getElementType()) {
			return getGEFWrapper(new myShoppingMall.diagram.edit.commands.SubCategoryCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
