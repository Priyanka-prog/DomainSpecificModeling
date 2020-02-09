/*
 * 
 */
package myShoppingMall.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class MyShoppingMallParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser brandedBName_5006Parser;

	/**
	* @generated
	*/
	private IParser getBrandedBName_5006Parser() {
		if (brandedBName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] {
					myShoppingMall.MyShoppingMallPackage.eINSTANCE.getBranded_BName() };
			myShoppingMall.diagram.parsers.MessageFormatParser parser = new myShoppingMall.diagram.parsers.MessageFormatParser(
					features);
			brandedBName_5006Parser = parser;
		}
		return brandedBName_5006Parser;
	}

	/**
	* @generated
	*/
	private IParser specialisticType_5007Parser;

	/**
	* @generated
	*/
	private IParser getSpecialisticType_5007Parser() {
		if (specialisticType_5007Parser == null) {
			EAttribute[] features = new EAttribute[] {
					myShoppingMall.MyShoppingMallPackage.eINSTANCE.getSpecialistic_Type() };
			myShoppingMall.diagram.parsers.MessageFormatParser parser = new myShoppingMall.diagram.parsers.MessageFormatParser(
					features);
			specialisticType_5007Parser = parser;
		}
		return specialisticType_5007Parser;
	}

	/**
	* @generated
	*/
	private IParser shopsShopName_5008Parser;

	/**
	* @generated
	*/
	private IParser getShopsShopName_5008Parser() {
		if (shopsShopName_5008Parser == null) {
			EAttribute[] features = new EAttribute[] {
					myShoppingMall.MyShoppingMallPackage.eINSTANCE.getShops_ShopName() };
			myShoppingMall.diagram.parsers.MessageFormatParser parser = new myShoppingMall.diagram.parsers.MessageFormatParser(
					features);
			shopsShopName_5008Parser = parser;
		}
		return shopsShopName_5008Parser;
	}

	/**
	* @generated
	*/
	private IParser employeeEmployeeName_5005Parser;

	/**
	* @generated
	*/
	private IParser getEmployeeEmployeeName_5005Parser() {
		if (employeeEmployeeName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] {
					myShoppingMall.MyShoppingMallPackage.eINSTANCE.getEmployee_EmployeeName() };
			myShoppingMall.diagram.parsers.MessageFormatParser parser = new myShoppingMall.diagram.parsers.MessageFormatParser(
					features);
			employeeEmployeeName_5005Parser = parser;
		}
		return employeeEmployeeName_5005Parser;
	}

	/**
	* @generated
	*/
	private IParser employeeEmployeeName_5013Parser;

	/**
	* @generated
	*/
	private IParser getEmployeeEmployeeName_5013Parser() {
		if (employeeEmployeeName_5013Parser == null) {
			EAttribute[] features = new EAttribute[] {
					myShoppingMall.MyShoppingMallPackage.eINSTANCE.getEmployee_EmployeeName() };
			myShoppingMall.diagram.parsers.MessageFormatParser parser = new myShoppingMall.diagram.parsers.MessageFormatParser(
					features);
			employeeEmployeeName_5013Parser = parser;
		}
		return employeeEmployeeName_5013Parser;
	}

	/**
	* @generated
	*/
	private IParser storagePosition_5012Parser;

	/**
	* @generated
	*/
	private IParser getStoragePosition_5012Parser() {
		if (storagePosition_5012Parser == null) {
			EAttribute[] features = new EAttribute[] {
					myShoppingMall.MyShoppingMallPackage.eINSTANCE.getStorage_Position() };
			myShoppingMall.diagram.parsers.MessageFormatParser parser = new myShoppingMall.diagram.parsers.MessageFormatParser(
					features);
			storagePosition_5012Parser = parser;
		}
		return storagePosition_5012Parser;
	}

	/**
	* @generated
	*/
	private IParser itemItemName_5011Parser;

	/**
	* @generated
	*/
	private IParser getItemItemName_5011Parser() {
		if (itemItemName_5011Parser == null) {
			EAttribute[] features = new EAttribute[] {
					myShoppingMall.MyShoppingMallPackage.eINSTANCE.getItem_ItemName() };
			myShoppingMall.diagram.parsers.MessageFormatParser parser = new myShoppingMall.diagram.parsers.MessageFormatParser(
					features);
			itemItemName_5011Parser = parser;
		}
		return itemItemName_5011Parser;
	}

	/**
	* @generated
	*/
	private IParser categoryCategoryName_5010Parser;

	/**
	* @generated
	*/
	private IParser getCategoryCategoryName_5010Parser() {
		if (categoryCategoryName_5010Parser == null) {
			EAttribute[] features = new EAttribute[] {
					myShoppingMall.MyShoppingMallPackage.eINSTANCE.getCategory_CategoryName() };
			myShoppingMall.diagram.parsers.MessageFormatParser parser = new myShoppingMall.diagram.parsers.MessageFormatParser(
					features);
			categoryCategoryName_5010Parser = parser;
		}
		return categoryCategoryName_5010Parser;
	}

	/**
	* @generated
	*/
	private IParser subCategorySubCategoryName_5009Parser;

	/**
	* @generated
	*/
	private IParser getSubCategorySubCategoryName_5009Parser() {
		if (subCategorySubCategoryName_5009Parser == null) {
			EAttribute[] features = new EAttribute[] {
					myShoppingMall.MyShoppingMallPackage.eINSTANCE.getSubCategory_SubCategoryName() };
			myShoppingMall.diagram.parsers.MessageFormatParser parser = new myShoppingMall.diagram.parsers.MessageFormatParser(
					features);
			subCategorySubCategoryName_5009Parser = parser;
		}
		return subCategorySubCategoryName_5009Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case myShoppingMall.diagram.edit.parts.BrandedBNameEditPart.VISUAL_ID:
			return getBrandedBName_5006Parser();
		case myShoppingMall.diagram.edit.parts.SpecialisticTypeEditPart.VISUAL_ID:
			return getSpecialisticType_5007Parser();
		case myShoppingMall.diagram.edit.parts.ShopsShopNameEditPart.VISUAL_ID:
			return getShopsShopName_5008Parser();
		case myShoppingMall.diagram.edit.parts.EmployeeEmployeeNameEditPart.VISUAL_ID:
			return getEmployeeEmployeeName_5005Parser();
		case myShoppingMall.diagram.edit.parts.EmployeeEmployeeName2EditPart.VISUAL_ID:
			return getEmployeeEmployeeName_5013Parser();
		case myShoppingMall.diagram.edit.parts.StoragePositionEditPart.VISUAL_ID:
			return getStoragePosition_5012Parser();
		case myShoppingMall.diagram.edit.parts.ItemItemNameEditPart.VISUAL_ID:
			return getItemItemName_5011Parser();
		case myShoppingMall.diagram.edit.parts.CategoryCategoryNameEditPart.VISUAL_ID:
			return getCategoryCategoryName_5010Parser();
		case myShoppingMall.diagram.edit.parts.SubCategorySubCategoryNameEditPart.VISUAL_ID:
			return getSubCategorySubCategoryName_5009Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(myShoppingMall.diagram.part.MyShoppingMallVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(myShoppingMall.diagram.part.MyShoppingMallVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (myShoppingMall.diagram.providers.MyShoppingMallElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
