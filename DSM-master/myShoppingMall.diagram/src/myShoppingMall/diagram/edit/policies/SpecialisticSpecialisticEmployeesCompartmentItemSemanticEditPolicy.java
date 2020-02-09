/*
* 
*/
package myShoppingMall.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class SpecialisticSpecialisticEmployeesCompartmentItemSemanticEditPolicy
		extends myShoppingMall.diagram.edit.policies.MyShoppingMallBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public SpecialisticSpecialisticEmployeesCompartmentItemSemanticEditPolicy() {
		super(myShoppingMall.diagram.providers.MyShoppingMallElementTypes.Specialistic_2006);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (myShoppingMall.diagram.providers.MyShoppingMallElementTypes.Employee_3006 == req.getElementType()) {
			return getGEFWrapper(new myShoppingMall.diagram.edit.commands.Employee2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
