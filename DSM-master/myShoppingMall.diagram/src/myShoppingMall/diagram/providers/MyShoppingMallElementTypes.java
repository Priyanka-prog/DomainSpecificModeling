/*
 * 
 */
package myShoppingMall.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class MyShoppingMallElementTypes {

	/**
	* @generated
	*/
	private MyShoppingMallElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			myShoppingMall.diagram.part.MyShoppingMallDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType Mall_1000 = getElementType("myShoppingMall.diagram.Mall_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Branded_2005 = getElementType("myShoppingMall.diagram.Branded_2005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Specialistic_2006 = getElementType("myShoppingMall.diagram.Specialistic_2006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Shops_2007 = getElementType("myShoppingMall.diagram.Shops_2007"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Employee_2004 = getElementType("myShoppingMall.diagram.Employee_2004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Employee_3006 = getElementType("myShoppingMall.diagram.Employee_3006"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Storage_3002 = getElementType("myShoppingMall.diagram.Storage_3002"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Item_3003 = getElementType("myShoppingMall.diagram.Item_3003"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Category_3004 = getElementType("myShoppingMall.diagram.Category_3004"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType SubCategory_3005 = getElementType("myShoppingMall.diagram.SubCategory_3005"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Mall_1000, myShoppingMall.MyShoppingMallPackage.eINSTANCE.getMall());

			elements.put(Branded_2005, myShoppingMall.MyShoppingMallPackage.eINSTANCE.getBranded());

			elements.put(Specialistic_2006, myShoppingMall.MyShoppingMallPackage.eINSTANCE.getSpecialistic());

			elements.put(Shops_2007, myShoppingMall.MyShoppingMallPackage.eINSTANCE.getShops());

			elements.put(Employee_2004, myShoppingMall.MyShoppingMallPackage.eINSTANCE.getEmployee());

			elements.put(Employee_3006, myShoppingMall.MyShoppingMallPackage.eINSTANCE.getEmployee());

			elements.put(Storage_3002, myShoppingMall.MyShoppingMallPackage.eINSTANCE.getStorage());

			elements.put(Item_3003, myShoppingMall.MyShoppingMallPackage.eINSTANCE.getItem());

			elements.put(Category_3004, myShoppingMall.MyShoppingMallPackage.eINSTANCE.getCategory());

			elements.put(SubCategory_3005, myShoppingMall.MyShoppingMallPackage.eINSTANCE.getSubCategory());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Mall_1000);
			KNOWN_ELEMENT_TYPES.add(Branded_2005);
			KNOWN_ELEMENT_TYPES.add(Specialistic_2006);
			KNOWN_ELEMENT_TYPES.add(Shops_2007);
			KNOWN_ELEMENT_TYPES.add(Employee_2004);
			KNOWN_ELEMENT_TYPES.add(Employee_3006);
			KNOWN_ELEMENT_TYPES.add(Storage_3002);
			KNOWN_ELEMENT_TYPES.add(Item_3003);
			KNOWN_ELEMENT_TYPES.add(Category_3004);
			KNOWN_ELEMENT_TYPES.add(SubCategory_3005);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case myShoppingMall.diagram.edit.parts.MallEditPart.VISUAL_ID:
			return Mall_1000;
		case myShoppingMall.diagram.edit.parts.BrandedEditPart.VISUAL_ID:
			return Branded_2005;
		case myShoppingMall.diagram.edit.parts.SpecialisticEditPart.VISUAL_ID:
			return Specialistic_2006;
		case myShoppingMall.diagram.edit.parts.ShopsEditPart.VISUAL_ID:
			return Shops_2007;
		case myShoppingMall.diagram.edit.parts.EmployeeEditPart.VISUAL_ID:
			return Employee_2004;
		case myShoppingMall.diagram.edit.parts.Employee2EditPart.VISUAL_ID:
			return Employee_3006;
		case myShoppingMall.diagram.edit.parts.StorageEditPart.VISUAL_ID:
			return Storage_3002;
		case myShoppingMall.diagram.edit.parts.ItemEditPart.VISUAL_ID:
			return Item_3003;
		case myShoppingMall.diagram.edit.parts.CategoryEditPart.VISUAL_ID:
			return Category_3004;
		case myShoppingMall.diagram.edit.parts.SubCategoryEditPart.VISUAL_ID:
			return SubCategory_3005;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return myShoppingMall.diagram.providers.MyShoppingMallElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return myShoppingMall.diagram.providers.MyShoppingMallElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return myShoppingMall.diagram.providers.MyShoppingMallElementTypes.getElement(elementTypeAdapter);
		}
	};

}
