/*
* 
*/
package myShoppingMall.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class MyShoppingMallDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<myShoppingMall.diagram.part.MyShoppingMallNodeDescriptor> getSemanticChildren(View view) {
		switch (myShoppingMall.diagram.part.MyShoppingMallVisualIDRegistry.getVisualID(view)) {
		case myShoppingMall.diagram.edit.parts.MallEditPart.VISUAL_ID:
			return getMall_1000SemanticChildren(view);
		case myShoppingMall.diagram.edit.parts.BrandedBrandedEmployeesCompartmentEditPart.VISUAL_ID:
			return getBrandedBrandedEmployeesCompartment_7004SemanticChildren(view);
		case myShoppingMall.diagram.edit.parts.BrandedBrandedStoragesCompartmentEditPart.VISUAL_ID:
			return getBrandedBrandedStoragesCompartment_7010SemanticChildren(view);
		case myShoppingMall.diagram.edit.parts.StorageStorageItemsCompartmentEditPart.VISUAL_ID:
			return getStorageStorageItemsCompartment_7007SemanticChildren(view);
		case myShoppingMall.diagram.edit.parts.ItemItemItemsCompartmentEditPart.VISUAL_ID:
			return getItemItemItemsCompartment_7008SemanticChildren(view);
		case myShoppingMall.diagram.edit.parts.CategoryCategoryContainsCompartmentEditPart.VISUAL_ID:
			return getCategoryCategoryContainsCompartment_7009SemanticChildren(view);
		case myShoppingMall.diagram.edit.parts.SpecialisticSpecialisticEmployeesCompartmentEditPart.VISUAL_ID:
			return getSpecialisticSpecialisticEmployeesCompartment_7005SemanticChildren(view);
		case myShoppingMall.diagram.edit.parts.SpecialisticSpecialisticStoragesCompartmentEditPart.VISUAL_ID:
			return getSpecialisticSpecialisticStoragesCompartment_7011SemanticChildren(view);
		case myShoppingMall.diagram.edit.parts.ShopsShopsEmployeesCompartmentEditPart.VISUAL_ID:
			return getShopsShopsEmployeesCompartment_7006SemanticChildren(view);
		case myShoppingMall.diagram.edit.parts.ShopsShopsStoragesCompartmentEditPart.VISUAL_ID:
			return getShopsShopsStoragesCompartment_7012SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<myShoppingMall.diagram.part.MyShoppingMallNodeDescriptor> getMall_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		myShoppingMall.Mall modelElement = (myShoppingMall.Mall) view.getElement();
		LinkedList<myShoppingMall.diagram.part.MyShoppingMallNodeDescriptor> result = new LinkedList<myShoppingMall.diagram.part.MyShoppingMallNodeDescriptor>();
		for (Iterator<?> it = modelElement.getShops().iterator(); it.hasNext();) {
			myShoppingMall.Shops childElement = (myShoppingMall.Shops) it.next();
			int visualID = myShoppingMall.diagram.part.MyShoppingMallVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == myShoppingMall.diagram.edit.parts.BrandedEditPart.VISUAL_ID) {
				result.add(new myShoppingMall.diagram.part.MyShoppingMallNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == myShoppingMall.diagram.edit.parts.SpecialisticEditPart.VISUAL_ID) {
				result.add(new myShoppingMall.diagram.part.MyShoppingMallNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == myShoppingMall.diagram.edit.parts.ShopsEditPart.VISUAL_ID) {
				result.add(new myShoppingMall.diagram.part.MyShoppingMallNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getEmployees().iterator(); it.hasNext();) {
			myShoppingMall.Employee childElement = (myShoppingMall.Employee) it.next();
			int visualID = myShoppingMall.diagram.part.MyShoppingMallVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == myShoppingMall.diagram.edit.parts.EmployeeEditPart.VISUAL_ID) {
				result.add(new myShoppingMall.diagram.part.MyShoppingMallNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<myShoppingMall.diagram.part.MyShoppingMallNodeDescriptor> getBrandedBrandedEmployeesCompartment_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		myShoppingMall.Branded modelElement = (myShoppingMall.Branded) containerView.getElement();
		LinkedList<myShoppingMall.diagram.part.MyShoppingMallNodeDescriptor> result = new LinkedList<myShoppingMall.diagram.part.MyShoppingMallNodeDescriptor>();
		for (Iterator<?> it = modelElement.getEmployees().iterator(); it.hasNext();) {
			myShoppingMall.Employee childElement = (myShoppingMall.Employee) it.next();
			int visualID = myShoppingMall.diagram.part.MyShoppingMallVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == myShoppingMall.diagram.edit.parts.Employee2EditPart.VISUAL_ID) {
				result.add(new myShoppingMall.diagram.part.MyShoppingMallNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<myShoppingMall.diagram.part.MyShoppingMallNodeDescriptor> getBrandedBrandedStoragesCompartment_7010SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		myShoppingMall.Branded modelElement = (myShoppingMall.Branded) containerView.getElement();
		LinkedList<myShoppingMall.diagram.part.MyShoppingMallNodeDescriptor> result = new LinkedList<myShoppingMall.diagram.part.MyShoppingMallNodeDescriptor>();
		for (Iterator<?> it = modelElement.getStorages().iterator(); it.hasNext();) {
			myShoppingMall.Storage childElement = (myShoppingMall.Storage) it.next();
			int visualID = myShoppingMall.diagram.part.MyShoppingMallVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == myShoppingMall.diagram.edit.parts.StorageEditPart.VISUAL_ID) {
				result.add(new myShoppingMall.diagram.part.MyShoppingMallNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<myShoppingMall.diagram.part.MyShoppingMallNodeDescriptor> getStorageStorageItemsCompartment_7007SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		myShoppingMall.Storage modelElement = (myShoppingMall.Storage) containerView.getElement();
		LinkedList<myShoppingMall.diagram.part.MyShoppingMallNodeDescriptor> result = new LinkedList<myShoppingMall.diagram.part.MyShoppingMallNodeDescriptor>();
		for (Iterator<?> it = modelElement.getItems().iterator(); it.hasNext();) {
			myShoppingMall.Item childElement = (myShoppingMall.Item) it.next();
			int visualID = myShoppingMall.diagram.part.MyShoppingMallVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == myShoppingMall.diagram.edit.parts.ItemEditPart.VISUAL_ID) {
				result.add(new myShoppingMall.diagram.part.MyShoppingMallNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<myShoppingMall.diagram.part.MyShoppingMallNodeDescriptor> getItemItemItemsCompartment_7008SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		myShoppingMall.Item modelElement = (myShoppingMall.Item) containerView.getElement();
		LinkedList<myShoppingMall.diagram.part.MyShoppingMallNodeDescriptor> result = new LinkedList<myShoppingMall.diagram.part.MyShoppingMallNodeDescriptor>();
		{
			myShoppingMall.Category childElement = modelElement.getItems();
			int visualID = myShoppingMall.diagram.part.MyShoppingMallVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == myShoppingMall.diagram.edit.parts.CategoryEditPart.VISUAL_ID) {
				result.add(new myShoppingMall.diagram.part.MyShoppingMallNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<myShoppingMall.diagram.part.MyShoppingMallNodeDescriptor> getCategoryCategoryContainsCompartment_7009SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		myShoppingMall.Category modelElement = (myShoppingMall.Category) containerView.getElement();
		LinkedList<myShoppingMall.diagram.part.MyShoppingMallNodeDescriptor> result = new LinkedList<myShoppingMall.diagram.part.MyShoppingMallNodeDescriptor>();
		for (Iterator<?> it = modelElement.getContains().iterator(); it.hasNext();) {
			myShoppingMall.SubCategory childElement = (myShoppingMall.SubCategory) it.next();
			int visualID = myShoppingMall.diagram.part.MyShoppingMallVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == myShoppingMall.diagram.edit.parts.SubCategoryEditPart.VISUAL_ID) {
				result.add(new myShoppingMall.diagram.part.MyShoppingMallNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<myShoppingMall.diagram.part.MyShoppingMallNodeDescriptor> getSpecialisticSpecialisticEmployeesCompartment_7005SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		myShoppingMall.Specialistic modelElement = (myShoppingMall.Specialistic) containerView.getElement();
		LinkedList<myShoppingMall.diagram.part.MyShoppingMallNodeDescriptor> result = new LinkedList<myShoppingMall.diagram.part.MyShoppingMallNodeDescriptor>();
		for (Iterator<?> it = modelElement.getEmployees().iterator(); it.hasNext();) {
			myShoppingMall.Employee childElement = (myShoppingMall.Employee) it.next();
			int visualID = myShoppingMall.diagram.part.MyShoppingMallVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == myShoppingMall.diagram.edit.parts.Employee2EditPart.VISUAL_ID) {
				result.add(new myShoppingMall.diagram.part.MyShoppingMallNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<myShoppingMall.diagram.part.MyShoppingMallNodeDescriptor> getSpecialisticSpecialisticStoragesCompartment_7011SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		myShoppingMall.Specialistic modelElement = (myShoppingMall.Specialistic) containerView.getElement();
		LinkedList<myShoppingMall.diagram.part.MyShoppingMallNodeDescriptor> result = new LinkedList<myShoppingMall.diagram.part.MyShoppingMallNodeDescriptor>();
		for (Iterator<?> it = modelElement.getStorages().iterator(); it.hasNext();) {
			myShoppingMall.Storage childElement = (myShoppingMall.Storage) it.next();
			int visualID = myShoppingMall.diagram.part.MyShoppingMallVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == myShoppingMall.diagram.edit.parts.StorageEditPart.VISUAL_ID) {
				result.add(new myShoppingMall.diagram.part.MyShoppingMallNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<myShoppingMall.diagram.part.MyShoppingMallNodeDescriptor> getShopsShopsEmployeesCompartment_7006SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		myShoppingMall.Shops modelElement = (myShoppingMall.Shops) containerView.getElement();
		LinkedList<myShoppingMall.diagram.part.MyShoppingMallNodeDescriptor> result = new LinkedList<myShoppingMall.diagram.part.MyShoppingMallNodeDescriptor>();
		for (Iterator<?> it = modelElement.getEmployees().iterator(); it.hasNext();) {
			myShoppingMall.Employee childElement = (myShoppingMall.Employee) it.next();
			int visualID = myShoppingMall.diagram.part.MyShoppingMallVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == myShoppingMall.diagram.edit.parts.Employee2EditPart.VISUAL_ID) {
				result.add(new myShoppingMall.diagram.part.MyShoppingMallNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<myShoppingMall.diagram.part.MyShoppingMallNodeDescriptor> getShopsShopsStoragesCompartment_7012SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		myShoppingMall.Shops modelElement = (myShoppingMall.Shops) containerView.getElement();
		LinkedList<myShoppingMall.diagram.part.MyShoppingMallNodeDescriptor> result = new LinkedList<myShoppingMall.diagram.part.MyShoppingMallNodeDescriptor>();
		for (Iterator<?> it = modelElement.getStorages().iterator(); it.hasNext();) {
			myShoppingMall.Storage childElement = (myShoppingMall.Storage) it.next();
			int visualID = myShoppingMall.diagram.part.MyShoppingMallVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == myShoppingMall.diagram.edit.parts.StorageEditPart.VISUAL_ID) {
				result.add(new myShoppingMall.diagram.part.MyShoppingMallNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<myShoppingMall.diagram.part.MyShoppingMallLinkDescriptor> getContainedLinks(View view) {
		switch (myShoppingMall.diagram.part.MyShoppingMallVisualIDRegistry.getVisualID(view)) {
		case myShoppingMall.diagram.edit.parts.MallEditPart.VISUAL_ID:
			return getMall_1000ContainedLinks(view);
		case myShoppingMall.diagram.edit.parts.BrandedEditPart.VISUAL_ID:
			return getBranded_2005ContainedLinks(view);
		case myShoppingMall.diagram.edit.parts.SpecialisticEditPart.VISUAL_ID:
			return getSpecialistic_2006ContainedLinks(view);
		case myShoppingMall.diagram.edit.parts.ShopsEditPart.VISUAL_ID:
			return getShops_2007ContainedLinks(view);
		case myShoppingMall.diagram.edit.parts.EmployeeEditPart.VISUAL_ID:
			return getEmployee_2004ContainedLinks(view);
		case myShoppingMall.diagram.edit.parts.Employee2EditPart.VISUAL_ID:
			return getEmployee_3006ContainedLinks(view);
		case myShoppingMall.diagram.edit.parts.StorageEditPart.VISUAL_ID:
			return getStorage_3002ContainedLinks(view);
		case myShoppingMall.diagram.edit.parts.ItemEditPart.VISUAL_ID:
			return getItem_3003ContainedLinks(view);
		case myShoppingMall.diagram.edit.parts.CategoryEditPart.VISUAL_ID:
			return getCategory_3004ContainedLinks(view);
		case myShoppingMall.diagram.edit.parts.SubCategoryEditPart.VISUAL_ID:
			return getSubCategory_3005ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<myShoppingMall.diagram.part.MyShoppingMallLinkDescriptor> getIncomingLinks(View view) {
		switch (myShoppingMall.diagram.part.MyShoppingMallVisualIDRegistry.getVisualID(view)) {
		case myShoppingMall.diagram.edit.parts.BrandedEditPart.VISUAL_ID:
			return getBranded_2005IncomingLinks(view);
		case myShoppingMall.diagram.edit.parts.SpecialisticEditPart.VISUAL_ID:
			return getSpecialistic_2006IncomingLinks(view);
		case myShoppingMall.diagram.edit.parts.ShopsEditPart.VISUAL_ID:
			return getShops_2007IncomingLinks(view);
		case myShoppingMall.diagram.edit.parts.EmployeeEditPart.VISUAL_ID:
			return getEmployee_2004IncomingLinks(view);
		case myShoppingMall.diagram.edit.parts.Employee2EditPart.VISUAL_ID:
			return getEmployee_3006IncomingLinks(view);
		case myShoppingMall.diagram.edit.parts.StorageEditPart.VISUAL_ID:
			return getStorage_3002IncomingLinks(view);
		case myShoppingMall.diagram.edit.parts.ItemEditPart.VISUAL_ID:
			return getItem_3003IncomingLinks(view);
		case myShoppingMall.diagram.edit.parts.CategoryEditPart.VISUAL_ID:
			return getCategory_3004IncomingLinks(view);
		case myShoppingMall.diagram.edit.parts.SubCategoryEditPart.VISUAL_ID:
			return getSubCategory_3005IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<myShoppingMall.diagram.part.MyShoppingMallLinkDescriptor> getOutgoingLinks(View view) {
		switch (myShoppingMall.diagram.part.MyShoppingMallVisualIDRegistry.getVisualID(view)) {
		case myShoppingMall.diagram.edit.parts.BrandedEditPart.VISUAL_ID:
			return getBranded_2005OutgoingLinks(view);
		case myShoppingMall.diagram.edit.parts.SpecialisticEditPart.VISUAL_ID:
			return getSpecialistic_2006OutgoingLinks(view);
		case myShoppingMall.diagram.edit.parts.ShopsEditPart.VISUAL_ID:
			return getShops_2007OutgoingLinks(view);
		case myShoppingMall.diagram.edit.parts.EmployeeEditPart.VISUAL_ID:
			return getEmployee_2004OutgoingLinks(view);
		case myShoppingMall.diagram.edit.parts.Employee2EditPart.VISUAL_ID:
			return getEmployee_3006OutgoingLinks(view);
		case myShoppingMall.diagram.edit.parts.StorageEditPart.VISUAL_ID:
			return getStorage_3002OutgoingLinks(view);
		case myShoppingMall.diagram.edit.parts.ItemEditPart.VISUAL_ID:
			return getItem_3003OutgoingLinks(view);
		case myShoppingMall.diagram.edit.parts.CategoryEditPart.VISUAL_ID:
			return getCategory_3004OutgoingLinks(view);
		case myShoppingMall.diagram.edit.parts.SubCategoryEditPart.VISUAL_ID:
			return getSubCategory_3005OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<myShoppingMall.diagram.part.MyShoppingMallLinkDescriptor> getMall_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<myShoppingMall.diagram.part.MyShoppingMallLinkDescriptor> getBranded_2005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<myShoppingMall.diagram.part.MyShoppingMallLinkDescriptor> getSpecialistic_2006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<myShoppingMall.diagram.part.MyShoppingMallLinkDescriptor> getShops_2007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<myShoppingMall.diagram.part.MyShoppingMallLinkDescriptor> getEmployee_2004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<myShoppingMall.diagram.part.MyShoppingMallLinkDescriptor> getEmployee_3006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<myShoppingMall.diagram.part.MyShoppingMallLinkDescriptor> getStorage_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<myShoppingMall.diagram.part.MyShoppingMallLinkDescriptor> getItem_3003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<myShoppingMall.diagram.part.MyShoppingMallLinkDescriptor> getCategory_3004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<myShoppingMall.diagram.part.MyShoppingMallLinkDescriptor> getSubCategory_3005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<myShoppingMall.diagram.part.MyShoppingMallLinkDescriptor> getBranded_2005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<myShoppingMall.diagram.part.MyShoppingMallLinkDescriptor> getSpecialistic_2006IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<myShoppingMall.diagram.part.MyShoppingMallLinkDescriptor> getShops_2007IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<myShoppingMall.diagram.part.MyShoppingMallLinkDescriptor> getEmployee_2004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<myShoppingMall.diagram.part.MyShoppingMallLinkDescriptor> getEmployee_3006IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<myShoppingMall.diagram.part.MyShoppingMallLinkDescriptor> getStorage_3002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<myShoppingMall.diagram.part.MyShoppingMallLinkDescriptor> getItem_3003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<myShoppingMall.diagram.part.MyShoppingMallLinkDescriptor> getCategory_3004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<myShoppingMall.diagram.part.MyShoppingMallLinkDescriptor> getSubCategory_3005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<myShoppingMall.diagram.part.MyShoppingMallLinkDescriptor> getBranded_2005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<myShoppingMall.diagram.part.MyShoppingMallLinkDescriptor> getSpecialistic_2006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<myShoppingMall.diagram.part.MyShoppingMallLinkDescriptor> getShops_2007OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<myShoppingMall.diagram.part.MyShoppingMallLinkDescriptor> getEmployee_2004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<myShoppingMall.diagram.part.MyShoppingMallLinkDescriptor> getEmployee_3006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<myShoppingMall.diagram.part.MyShoppingMallLinkDescriptor> getStorage_3002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<myShoppingMall.diagram.part.MyShoppingMallLinkDescriptor> getItem_3003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<myShoppingMall.diagram.part.MyShoppingMallLinkDescriptor> getCategory_3004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<myShoppingMall.diagram.part.MyShoppingMallLinkDescriptor> getSubCategory_3005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<myShoppingMall.diagram.part.MyShoppingMallNodeDescriptor> getSemanticChildren(View view) {
			return MyShoppingMallDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<myShoppingMall.diagram.part.MyShoppingMallLinkDescriptor> getContainedLinks(View view) {
			return MyShoppingMallDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<myShoppingMall.diagram.part.MyShoppingMallLinkDescriptor> getIncomingLinks(View view) {
			return MyShoppingMallDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<myShoppingMall.diagram.part.MyShoppingMallLinkDescriptor> getOutgoingLinks(View view) {
			return MyShoppingMallDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
