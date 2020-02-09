/*
* 
*/
package myShoppingMall.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class MyShoppingMallVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "myShoppingMall.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (myShoppingMall.diagram.edit.parts.MallEditPart.MODEL_ID.equals(view.getType())) {
				return myShoppingMall.diagram.edit.parts.MallEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return myShoppingMall.diagram.part.MyShoppingMallVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				myShoppingMall.diagram.part.MyShoppingMallDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (myShoppingMall.MyShoppingMallPackage.eINSTANCE.getMall().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((myShoppingMall.Mall) domainElement)) {
			return myShoppingMall.diagram.edit.parts.MallEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = myShoppingMall.diagram.part.MyShoppingMallVisualIDRegistry.getModelID(containerView);
		if (!myShoppingMall.diagram.edit.parts.MallEditPart.MODEL_ID.equals(containerModelID)
				&& !"mm".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (myShoppingMall.diagram.edit.parts.MallEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = myShoppingMall.diagram.part.MyShoppingMallVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = myShoppingMall.diagram.edit.parts.MallEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case myShoppingMall.diagram.edit.parts.MallEditPart.VISUAL_ID:
			if (myShoppingMall.MyShoppingMallPackage.eINSTANCE.getBranded().isSuperTypeOf(domainElement.eClass())) {
				return myShoppingMall.diagram.edit.parts.BrandedEditPart.VISUAL_ID;
			}
			if (myShoppingMall.MyShoppingMallPackage.eINSTANCE.getSpecialistic()
					.isSuperTypeOf(domainElement.eClass())) {
				return myShoppingMall.diagram.edit.parts.SpecialisticEditPart.VISUAL_ID;
			}
			if (myShoppingMall.MyShoppingMallPackage.eINSTANCE.getShops().isSuperTypeOf(domainElement.eClass())) {
				return myShoppingMall.diagram.edit.parts.ShopsEditPart.VISUAL_ID;
			}
			if (myShoppingMall.MyShoppingMallPackage.eINSTANCE.getEmployee().isSuperTypeOf(domainElement.eClass())) {
				return myShoppingMall.diagram.edit.parts.EmployeeEditPart.VISUAL_ID;
			}
			break;
		case myShoppingMall.diagram.edit.parts.BrandedBrandedEmployeesCompartmentEditPart.VISUAL_ID:
			if (myShoppingMall.MyShoppingMallPackage.eINSTANCE.getEmployee().isSuperTypeOf(domainElement.eClass())) {
				return myShoppingMall.diagram.edit.parts.Employee2EditPart.VISUAL_ID;
			}
			break;
		case myShoppingMall.diagram.edit.parts.BrandedBrandedStoragesCompartmentEditPart.VISUAL_ID:
			if (myShoppingMall.MyShoppingMallPackage.eINSTANCE.getStorage().isSuperTypeOf(domainElement.eClass())) {
				return myShoppingMall.diagram.edit.parts.StorageEditPart.VISUAL_ID;
			}
			break;
		case myShoppingMall.diagram.edit.parts.StorageStorageItemsCompartmentEditPart.VISUAL_ID:
			if (myShoppingMall.MyShoppingMallPackage.eINSTANCE.getItem().isSuperTypeOf(domainElement.eClass())) {
				return myShoppingMall.diagram.edit.parts.ItemEditPart.VISUAL_ID;
			}
			break;
		case myShoppingMall.diagram.edit.parts.ItemItemItemsCompartmentEditPart.VISUAL_ID:
			if (myShoppingMall.MyShoppingMallPackage.eINSTANCE.getCategory().isSuperTypeOf(domainElement.eClass())) {
				return myShoppingMall.diagram.edit.parts.CategoryEditPart.VISUAL_ID;
			}
			break;
		case myShoppingMall.diagram.edit.parts.CategoryCategoryContainsCompartmentEditPart.VISUAL_ID:
			if (myShoppingMall.MyShoppingMallPackage.eINSTANCE.getSubCategory().isSuperTypeOf(domainElement.eClass())) {
				return myShoppingMall.diagram.edit.parts.SubCategoryEditPart.VISUAL_ID;
			}
			break;
		case myShoppingMall.diagram.edit.parts.SpecialisticSpecialisticEmployeesCompartmentEditPart.VISUAL_ID:
			if (myShoppingMall.MyShoppingMallPackage.eINSTANCE.getEmployee().isSuperTypeOf(domainElement.eClass())) {
				return myShoppingMall.diagram.edit.parts.Employee2EditPart.VISUAL_ID;
			}
			break;
		case myShoppingMall.diagram.edit.parts.SpecialisticSpecialisticStoragesCompartmentEditPart.VISUAL_ID:
			if (myShoppingMall.MyShoppingMallPackage.eINSTANCE.getStorage().isSuperTypeOf(domainElement.eClass())) {
				return myShoppingMall.diagram.edit.parts.StorageEditPart.VISUAL_ID;
			}
			break;
		case myShoppingMall.diagram.edit.parts.ShopsShopsEmployeesCompartmentEditPart.VISUAL_ID:
			if (myShoppingMall.MyShoppingMallPackage.eINSTANCE.getEmployee().isSuperTypeOf(domainElement.eClass())) {
				return myShoppingMall.diagram.edit.parts.Employee2EditPart.VISUAL_ID;
			}
			break;
		case myShoppingMall.diagram.edit.parts.ShopsShopsStoragesCompartmentEditPart.VISUAL_ID:
			if (myShoppingMall.MyShoppingMallPackage.eINSTANCE.getStorage().isSuperTypeOf(domainElement.eClass())) {
				return myShoppingMall.diagram.edit.parts.StorageEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = myShoppingMall.diagram.part.MyShoppingMallVisualIDRegistry.getModelID(containerView);
		if (!myShoppingMall.diagram.edit.parts.MallEditPart.MODEL_ID.equals(containerModelID)
				&& !"mm".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (myShoppingMall.diagram.edit.parts.MallEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = myShoppingMall.diagram.part.MyShoppingMallVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = myShoppingMall.diagram.edit.parts.MallEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case myShoppingMall.diagram.edit.parts.MallEditPart.VISUAL_ID:
			if (myShoppingMall.diagram.edit.parts.BrandedEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (myShoppingMall.diagram.edit.parts.SpecialisticEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (myShoppingMall.diagram.edit.parts.ShopsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (myShoppingMall.diagram.edit.parts.EmployeeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case myShoppingMall.diagram.edit.parts.BrandedEditPart.VISUAL_ID:
			if (myShoppingMall.diagram.edit.parts.BrandedBNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (myShoppingMall.diagram.edit.parts.BrandedBrandedEmployeesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (myShoppingMall.diagram.edit.parts.BrandedBrandedStoragesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case myShoppingMall.diagram.edit.parts.SpecialisticEditPart.VISUAL_ID:
			if (myShoppingMall.diagram.edit.parts.SpecialisticTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (myShoppingMall.diagram.edit.parts.SpecialisticSpecialisticEmployeesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (myShoppingMall.diagram.edit.parts.SpecialisticSpecialisticStoragesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case myShoppingMall.diagram.edit.parts.ShopsEditPart.VISUAL_ID:
			if (myShoppingMall.diagram.edit.parts.ShopsShopNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (myShoppingMall.diagram.edit.parts.ShopsShopsEmployeesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (myShoppingMall.diagram.edit.parts.ShopsShopsStoragesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case myShoppingMall.diagram.edit.parts.EmployeeEditPart.VISUAL_ID:
			if (myShoppingMall.diagram.edit.parts.EmployeeEmployeeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case myShoppingMall.diagram.edit.parts.Employee2EditPart.VISUAL_ID:
			if (myShoppingMall.diagram.edit.parts.EmployeeEmployeeName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case myShoppingMall.diagram.edit.parts.StorageEditPart.VISUAL_ID:
			if (myShoppingMall.diagram.edit.parts.StoragePositionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (myShoppingMall.diagram.edit.parts.StorageStorageItemsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case myShoppingMall.diagram.edit.parts.ItemEditPart.VISUAL_ID:
			if (myShoppingMall.diagram.edit.parts.ItemItemNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (myShoppingMall.diagram.edit.parts.ItemItemItemsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case myShoppingMall.diagram.edit.parts.CategoryEditPart.VISUAL_ID:
			if (myShoppingMall.diagram.edit.parts.CategoryCategoryNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (myShoppingMall.diagram.edit.parts.CategoryCategoryContainsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case myShoppingMall.diagram.edit.parts.SubCategoryEditPart.VISUAL_ID:
			if (myShoppingMall.diagram.edit.parts.SubCategorySubCategoryNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case myShoppingMall.diagram.edit.parts.BrandedBrandedEmployeesCompartmentEditPart.VISUAL_ID:
			if (myShoppingMall.diagram.edit.parts.Employee2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case myShoppingMall.diagram.edit.parts.BrandedBrandedStoragesCompartmentEditPart.VISUAL_ID:
			if (myShoppingMall.diagram.edit.parts.StorageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case myShoppingMall.diagram.edit.parts.StorageStorageItemsCompartmentEditPart.VISUAL_ID:
			if (myShoppingMall.diagram.edit.parts.ItemEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case myShoppingMall.diagram.edit.parts.ItemItemItemsCompartmentEditPart.VISUAL_ID:
			if (myShoppingMall.diagram.edit.parts.CategoryEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case myShoppingMall.diagram.edit.parts.CategoryCategoryContainsCompartmentEditPart.VISUAL_ID:
			if (myShoppingMall.diagram.edit.parts.SubCategoryEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case myShoppingMall.diagram.edit.parts.SpecialisticSpecialisticEmployeesCompartmentEditPart.VISUAL_ID:
			if (myShoppingMall.diagram.edit.parts.Employee2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case myShoppingMall.diagram.edit.parts.SpecialisticSpecialisticStoragesCompartmentEditPart.VISUAL_ID:
			if (myShoppingMall.diagram.edit.parts.StorageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case myShoppingMall.diagram.edit.parts.ShopsShopsEmployeesCompartmentEditPart.VISUAL_ID:
			if (myShoppingMall.diagram.edit.parts.Employee2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case myShoppingMall.diagram.edit.parts.ShopsShopsStoragesCompartmentEditPart.VISUAL_ID:
			if (myShoppingMall.diagram.edit.parts.StorageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(myShoppingMall.Mall element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case myShoppingMall.diagram.edit.parts.BrandedBrandedEmployeesCompartmentEditPart.VISUAL_ID:
		case myShoppingMall.diagram.edit.parts.BrandedBrandedStoragesCompartmentEditPart.VISUAL_ID:
		case myShoppingMall.diagram.edit.parts.StorageStorageItemsCompartmentEditPart.VISUAL_ID:
		case myShoppingMall.diagram.edit.parts.ItemItemItemsCompartmentEditPart.VISUAL_ID:
		case myShoppingMall.diagram.edit.parts.CategoryCategoryContainsCompartmentEditPart.VISUAL_ID:
		case myShoppingMall.diagram.edit.parts.SpecialisticSpecialisticEmployeesCompartmentEditPart.VISUAL_ID:
		case myShoppingMall.diagram.edit.parts.SpecialisticSpecialisticStoragesCompartmentEditPart.VISUAL_ID:
		case myShoppingMall.diagram.edit.parts.ShopsShopsEmployeesCompartmentEditPart.VISUAL_ID:
		case myShoppingMall.diagram.edit.parts.ShopsShopsStoragesCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case myShoppingMall.diagram.edit.parts.MallEditPart.VISUAL_ID:
			return false;
		case myShoppingMall.diagram.edit.parts.EmployeeEditPart.VISUAL_ID:
		case myShoppingMall.diagram.edit.parts.SubCategoryEditPart.VISUAL_ID:
		case myShoppingMall.diagram.edit.parts.Employee2EditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return myShoppingMall.diagram.part.MyShoppingMallVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return myShoppingMall.diagram.part.MyShoppingMallVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return myShoppingMall.diagram.part.MyShoppingMallVisualIDRegistry.getNodeVisualID(containerView,
					domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return myShoppingMall.diagram.part.MyShoppingMallVisualIDRegistry.checkNodeVisualID(containerView,
					domainElement, candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return myShoppingMall.diagram.part.MyShoppingMallVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return myShoppingMall.diagram.part.MyShoppingMallVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
