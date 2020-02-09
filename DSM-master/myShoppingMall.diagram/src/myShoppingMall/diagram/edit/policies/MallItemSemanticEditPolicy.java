/*
* 
*/
package myShoppingMall.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class MallItemSemanticEditPolicy
		extends myShoppingMall.diagram.edit.policies.MyShoppingMallBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public MallItemSemanticEditPolicy() {
		super(myShoppingMall.diagram.providers.MyShoppingMallElementTypes.Mall_1000);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (myShoppingMall.diagram.providers.MyShoppingMallElementTypes.Branded_2005 == req.getElementType()) {
			return getGEFWrapper(new myShoppingMall.diagram.edit.commands.BrandedCreateCommand(req));
		}
		if (myShoppingMall.diagram.providers.MyShoppingMallElementTypes.Specialistic_2006 == req.getElementType()) {
			return getGEFWrapper(new myShoppingMall.diagram.edit.commands.SpecialisticCreateCommand(req));
		}
		if (myShoppingMall.diagram.providers.MyShoppingMallElementTypes.Shops_2007 == req.getElementType()) {
			return getGEFWrapper(new myShoppingMall.diagram.edit.commands.ShopsCreateCommand(req));
		}
		if (myShoppingMall.diagram.providers.MyShoppingMallElementTypes.Employee_2004 == req.getElementType()) {
			return getGEFWrapper(new myShoppingMall.diagram.edit.commands.EmployeeCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	* @generated
	*/
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	* @generated
	*/
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		* @generated
		*/
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}

	}

}
