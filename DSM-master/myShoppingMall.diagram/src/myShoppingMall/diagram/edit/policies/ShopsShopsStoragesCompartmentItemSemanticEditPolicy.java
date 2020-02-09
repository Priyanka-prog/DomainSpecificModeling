/*
* 
*/
package myShoppingMall.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ShopsShopsStoragesCompartmentItemSemanticEditPolicy
		extends myShoppingMall.diagram.edit.policies.MyShoppingMallBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ShopsShopsStoragesCompartmentItemSemanticEditPolicy() {
		super(myShoppingMall.diagram.providers.MyShoppingMallElementTypes.Shops_2007);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (myShoppingMall.diagram.providers.MyShoppingMallElementTypes.Storage_3002 == req.getElementType()) {
			return getGEFWrapper(new myShoppingMall.diagram.edit.commands.StorageCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
