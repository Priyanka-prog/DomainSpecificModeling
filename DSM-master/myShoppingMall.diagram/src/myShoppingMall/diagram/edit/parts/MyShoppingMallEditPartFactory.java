/*
 * 
 */
package myShoppingMall.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class MyShoppingMallEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (myShoppingMall.diagram.part.MyShoppingMallVisualIDRegistry.getVisualID(view)) {

			case myShoppingMall.diagram.edit.parts.MallEditPart.VISUAL_ID:
				return new myShoppingMall.diagram.edit.parts.MallEditPart(view);

			case myShoppingMall.diagram.edit.parts.BrandedEditPart.VISUAL_ID:
				return new myShoppingMall.diagram.edit.parts.BrandedEditPart(view);

			case myShoppingMall.diagram.edit.parts.BrandedBNameEditPart.VISUAL_ID:
				return new myShoppingMall.diagram.edit.parts.BrandedBNameEditPart(view);

			case myShoppingMall.diagram.edit.parts.SpecialisticEditPart.VISUAL_ID:
				return new myShoppingMall.diagram.edit.parts.SpecialisticEditPart(view);

			case myShoppingMall.diagram.edit.parts.SpecialisticTypeEditPart.VISUAL_ID:
				return new myShoppingMall.diagram.edit.parts.SpecialisticTypeEditPart(view);

			case myShoppingMall.diagram.edit.parts.ShopsEditPart.VISUAL_ID:
				return new myShoppingMall.diagram.edit.parts.ShopsEditPart(view);

			case myShoppingMall.diagram.edit.parts.ShopsShopNameEditPart.VISUAL_ID:
				return new myShoppingMall.diagram.edit.parts.ShopsShopNameEditPart(view);

			case myShoppingMall.diagram.edit.parts.EmployeeEditPart.VISUAL_ID:
				return new myShoppingMall.diagram.edit.parts.EmployeeEditPart(view);

			case myShoppingMall.diagram.edit.parts.EmployeeEmployeeNameEditPart.VISUAL_ID:
				return new myShoppingMall.diagram.edit.parts.EmployeeEmployeeNameEditPart(view);

			case myShoppingMall.diagram.edit.parts.Employee2EditPart.VISUAL_ID:
				return new myShoppingMall.diagram.edit.parts.Employee2EditPart(view);

			case myShoppingMall.diagram.edit.parts.EmployeeEmployeeName2EditPart.VISUAL_ID:
				return new myShoppingMall.diagram.edit.parts.EmployeeEmployeeName2EditPart(view);

			case myShoppingMall.diagram.edit.parts.StorageEditPart.VISUAL_ID:
				return new myShoppingMall.diagram.edit.parts.StorageEditPart(view);

			case myShoppingMall.diagram.edit.parts.StoragePositionEditPart.VISUAL_ID:
				return new myShoppingMall.diagram.edit.parts.StoragePositionEditPart(view);

			case myShoppingMall.diagram.edit.parts.ItemEditPart.VISUAL_ID:
				return new myShoppingMall.diagram.edit.parts.ItemEditPart(view);

			case myShoppingMall.diagram.edit.parts.ItemItemNameEditPart.VISUAL_ID:
				return new myShoppingMall.diagram.edit.parts.ItemItemNameEditPart(view);

			case myShoppingMall.diagram.edit.parts.CategoryEditPart.VISUAL_ID:
				return new myShoppingMall.diagram.edit.parts.CategoryEditPart(view);

			case myShoppingMall.diagram.edit.parts.CategoryCategoryNameEditPart.VISUAL_ID:
				return new myShoppingMall.diagram.edit.parts.CategoryCategoryNameEditPart(view);

			case myShoppingMall.diagram.edit.parts.SubCategoryEditPart.VISUAL_ID:
				return new myShoppingMall.diagram.edit.parts.SubCategoryEditPart(view);

			case myShoppingMall.diagram.edit.parts.SubCategorySubCategoryNameEditPart.VISUAL_ID:
				return new myShoppingMall.diagram.edit.parts.SubCategorySubCategoryNameEditPart(view);

			case myShoppingMall.diagram.edit.parts.BrandedBrandedEmployeesCompartmentEditPart.VISUAL_ID:
				return new myShoppingMall.diagram.edit.parts.BrandedBrandedEmployeesCompartmentEditPart(view);

			case myShoppingMall.diagram.edit.parts.BrandedBrandedStoragesCompartmentEditPart.VISUAL_ID:
				return new myShoppingMall.diagram.edit.parts.BrandedBrandedStoragesCompartmentEditPart(view);

			case myShoppingMall.diagram.edit.parts.StorageStorageItemsCompartmentEditPart.VISUAL_ID:
				return new myShoppingMall.diagram.edit.parts.StorageStorageItemsCompartmentEditPart(view);

			case myShoppingMall.diagram.edit.parts.ItemItemItemsCompartmentEditPart.VISUAL_ID:
				return new myShoppingMall.diagram.edit.parts.ItemItemItemsCompartmentEditPart(view);

			case myShoppingMall.diagram.edit.parts.CategoryCategoryContainsCompartmentEditPart.VISUAL_ID:
				return new myShoppingMall.diagram.edit.parts.CategoryCategoryContainsCompartmentEditPart(view);

			case myShoppingMall.diagram.edit.parts.SpecialisticSpecialisticEmployeesCompartmentEditPart.VISUAL_ID:
				return new myShoppingMall.diagram.edit.parts.SpecialisticSpecialisticEmployeesCompartmentEditPart(view);

			case myShoppingMall.diagram.edit.parts.SpecialisticSpecialisticStoragesCompartmentEditPart.VISUAL_ID:
				return new myShoppingMall.diagram.edit.parts.SpecialisticSpecialisticStoragesCompartmentEditPart(view);

			case myShoppingMall.diagram.edit.parts.ShopsShopsEmployeesCompartmentEditPart.VISUAL_ID:
				return new myShoppingMall.diagram.edit.parts.ShopsShopsEmployeesCompartmentEditPart(view);

			case myShoppingMall.diagram.edit.parts.ShopsShopsStoragesCompartmentEditPart.VISUAL_ID:
				return new myShoppingMall.diagram.edit.parts.ShopsShopsStoragesCompartmentEditPart(view);
			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
