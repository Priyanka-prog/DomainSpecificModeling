/*
* 
*/
package myShoppingMall.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class MyShoppingMallNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		myShoppingMall.diagram.part.MyShoppingMallDiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		myShoppingMall.diagram.part.MyShoppingMallDiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof myShoppingMall.diagram.navigator.MyShoppingMallNavigatorItem
				&& !isOwnView(((myShoppingMall.diagram.navigator.MyShoppingMallNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof myShoppingMall.diagram.navigator.MyShoppingMallNavigatorGroup) {
			myShoppingMall.diagram.navigator.MyShoppingMallNavigatorGroup group = (myShoppingMall.diagram.navigator.MyShoppingMallNavigatorGroup) element;
			return myShoppingMall.diagram.part.MyShoppingMallDiagramEditorPlugin.getInstance()
					.getBundledImage(group.getIcon());
		}

		if (element instanceof myShoppingMall.diagram.navigator.MyShoppingMallNavigatorItem) {
			myShoppingMall.diagram.navigator.MyShoppingMallNavigatorItem navigatorItem = (myShoppingMall.diagram.navigator.MyShoppingMallNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (myShoppingMall.diagram.part.MyShoppingMallVisualIDRegistry.getVisualID(view)) {
		case myShoppingMall.diagram.edit.parts.MallEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http://www.myshoppingmall.com/1.0?Mall", //$NON-NLS-1$
					myShoppingMall.diagram.providers.MyShoppingMallElementTypes.Mall_1000);
		case myShoppingMall.diagram.edit.parts.EmployeeEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.myshoppingmall.com/1.0?Employee", //$NON-NLS-1$
					myShoppingMall.diagram.providers.MyShoppingMallElementTypes.Employee_2004);
		case myShoppingMall.diagram.edit.parts.BrandedEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.myshoppingmall.com/1.0?Branded", //$NON-NLS-1$
					myShoppingMall.diagram.providers.MyShoppingMallElementTypes.Branded_2005);
		case myShoppingMall.diagram.edit.parts.SpecialisticEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.myshoppingmall.com/1.0?Specialistic", //$NON-NLS-1$
					myShoppingMall.diagram.providers.MyShoppingMallElementTypes.Specialistic_2006);
		case myShoppingMall.diagram.edit.parts.ShopsEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.myshoppingmall.com/1.0?Shops", //$NON-NLS-1$
					myShoppingMall.diagram.providers.MyShoppingMallElementTypes.Shops_2007);
		case myShoppingMall.diagram.edit.parts.StorageEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.myshoppingmall.com/1.0?Storage", //$NON-NLS-1$
					myShoppingMall.diagram.providers.MyShoppingMallElementTypes.Storage_3002);
		case myShoppingMall.diagram.edit.parts.ItemEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.myshoppingmall.com/1.0?Item", //$NON-NLS-1$
					myShoppingMall.diagram.providers.MyShoppingMallElementTypes.Item_3003);
		case myShoppingMall.diagram.edit.parts.CategoryEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.myshoppingmall.com/1.0?Category", //$NON-NLS-1$
					myShoppingMall.diagram.providers.MyShoppingMallElementTypes.Category_3004);
		case myShoppingMall.diagram.edit.parts.SubCategoryEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.myshoppingmall.com/1.0?SubCategory", //$NON-NLS-1$
					myShoppingMall.diagram.providers.MyShoppingMallElementTypes.SubCategory_3005);
		case myShoppingMall.diagram.edit.parts.Employee2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.myshoppingmall.com/1.0?Employee", //$NON-NLS-1$
					myShoppingMall.diagram.providers.MyShoppingMallElementTypes.Employee_3006);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = myShoppingMall.diagram.part.MyShoppingMallDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& myShoppingMall.diagram.providers.MyShoppingMallElementTypes.isKnownElementType(elementType)) {
			image = myShoppingMall.diagram.providers.MyShoppingMallElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof myShoppingMall.diagram.navigator.MyShoppingMallNavigatorGroup) {
			myShoppingMall.diagram.navigator.MyShoppingMallNavigatorGroup group = (myShoppingMall.diagram.navigator.MyShoppingMallNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof myShoppingMall.diagram.navigator.MyShoppingMallNavigatorItem) {
			myShoppingMall.diagram.navigator.MyShoppingMallNavigatorItem navigatorItem = (myShoppingMall.diagram.navigator.MyShoppingMallNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (myShoppingMall.diagram.part.MyShoppingMallVisualIDRegistry.getVisualID(view)) {
		case myShoppingMall.diagram.edit.parts.MallEditPart.VISUAL_ID:
			return getMall_1000Text(view);
		case myShoppingMall.diagram.edit.parts.EmployeeEditPart.VISUAL_ID:
			return getEmployee_2004Text(view);
		case myShoppingMall.diagram.edit.parts.BrandedEditPart.VISUAL_ID:
			return getBranded_2005Text(view);
		case myShoppingMall.diagram.edit.parts.SpecialisticEditPart.VISUAL_ID:
			return getSpecialistic_2006Text(view);
		case myShoppingMall.diagram.edit.parts.ShopsEditPart.VISUAL_ID:
			return getShops_2007Text(view);
		case myShoppingMall.diagram.edit.parts.StorageEditPart.VISUAL_ID:
			return getStorage_3002Text(view);
		case myShoppingMall.diagram.edit.parts.ItemEditPart.VISUAL_ID:
			return getItem_3003Text(view);
		case myShoppingMall.diagram.edit.parts.CategoryEditPart.VISUAL_ID:
			return getCategory_3004Text(view);
		case myShoppingMall.diagram.edit.parts.SubCategoryEditPart.VISUAL_ID:
			return getSubCategory_3005Text(view);
		case myShoppingMall.diagram.edit.parts.Employee2EditPart.VISUAL_ID:
			return getEmployee_3006Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getMall_1000Text(View view) {
		myShoppingMall.Mall domainModelElement = (myShoppingMall.Mall) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			myShoppingMall.diagram.part.MyShoppingMallDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEmployee_2004Text(View view) {
		IParser parser = myShoppingMall.diagram.providers.MyShoppingMallParserProvider.getParser(
				myShoppingMall.diagram.providers.MyShoppingMallElementTypes.Employee_2004,
				view.getElement() != null ? view.getElement() : view,
				myShoppingMall.diagram.part.MyShoppingMallVisualIDRegistry
						.getType(myShoppingMall.diagram.edit.parts.EmployeeEmployeeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			myShoppingMall.diagram.part.MyShoppingMallDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getBranded_2005Text(View view) {
		IParser parser = myShoppingMall.diagram.providers.MyShoppingMallParserProvider.getParser(
				myShoppingMall.diagram.providers.MyShoppingMallElementTypes.Branded_2005,
				view.getElement() != null ? view.getElement() : view,
				myShoppingMall.diagram.part.MyShoppingMallVisualIDRegistry
						.getType(myShoppingMall.diagram.edit.parts.BrandedBNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			myShoppingMall.diagram.part.MyShoppingMallDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSpecialistic_2006Text(View view) {
		IParser parser = myShoppingMall.diagram.providers.MyShoppingMallParserProvider.getParser(
				myShoppingMall.diagram.providers.MyShoppingMallElementTypes.Specialistic_2006,
				view.getElement() != null ? view.getElement() : view,
				myShoppingMall.diagram.part.MyShoppingMallVisualIDRegistry
						.getType(myShoppingMall.diagram.edit.parts.SpecialisticTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			myShoppingMall.diagram.part.MyShoppingMallDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getShops_2007Text(View view) {
		IParser parser = myShoppingMall.diagram.providers.MyShoppingMallParserProvider.getParser(
				myShoppingMall.diagram.providers.MyShoppingMallElementTypes.Shops_2007,
				view.getElement() != null ? view.getElement() : view,
				myShoppingMall.diagram.part.MyShoppingMallVisualIDRegistry
						.getType(myShoppingMall.diagram.edit.parts.ShopsShopNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			myShoppingMall.diagram.part.MyShoppingMallDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getStorage_3002Text(View view) {
		IParser parser = myShoppingMall.diagram.providers.MyShoppingMallParserProvider.getParser(
				myShoppingMall.diagram.providers.MyShoppingMallElementTypes.Storage_3002,
				view.getElement() != null ? view.getElement() : view,
				myShoppingMall.diagram.part.MyShoppingMallVisualIDRegistry
						.getType(myShoppingMall.diagram.edit.parts.StoragePositionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			myShoppingMall.diagram.part.MyShoppingMallDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getItem_3003Text(View view) {
		IParser parser = myShoppingMall.diagram.providers.MyShoppingMallParserProvider.getParser(
				myShoppingMall.diagram.providers.MyShoppingMallElementTypes.Item_3003,
				view.getElement() != null ? view.getElement() : view,
				myShoppingMall.diagram.part.MyShoppingMallVisualIDRegistry
						.getType(myShoppingMall.diagram.edit.parts.ItemItemNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			myShoppingMall.diagram.part.MyShoppingMallDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCategory_3004Text(View view) {
		IParser parser = myShoppingMall.diagram.providers.MyShoppingMallParserProvider.getParser(
				myShoppingMall.diagram.providers.MyShoppingMallElementTypes.Category_3004,
				view.getElement() != null ? view.getElement() : view,
				myShoppingMall.diagram.part.MyShoppingMallVisualIDRegistry
						.getType(myShoppingMall.diagram.edit.parts.CategoryCategoryNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			myShoppingMall.diagram.part.MyShoppingMallDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSubCategory_3005Text(View view) {
		IParser parser = myShoppingMall.diagram.providers.MyShoppingMallParserProvider.getParser(
				myShoppingMall.diagram.providers.MyShoppingMallElementTypes.SubCategory_3005,
				view.getElement() != null ? view.getElement() : view,
				myShoppingMall.diagram.part.MyShoppingMallVisualIDRegistry
						.getType(myShoppingMall.diagram.edit.parts.SubCategorySubCategoryNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			myShoppingMall.diagram.part.MyShoppingMallDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEmployee_3006Text(View view) {
		IParser parser = myShoppingMall.diagram.providers.MyShoppingMallParserProvider.getParser(
				myShoppingMall.diagram.providers.MyShoppingMallElementTypes.Employee_3006,
				view.getElement() != null ? view.getElement() : view,
				myShoppingMall.diagram.part.MyShoppingMallVisualIDRegistry
						.getType(myShoppingMall.diagram.edit.parts.EmployeeEmployeeName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			myShoppingMall.diagram.part.MyShoppingMallDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return myShoppingMall.diagram.edit.parts.MallEditPart.MODEL_ID
				.equals(myShoppingMall.diagram.part.MyShoppingMallVisualIDRegistry.getModelID(view));
	}

}
