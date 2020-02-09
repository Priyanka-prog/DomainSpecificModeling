/*
 * 
 */
package myShoppingMall.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class MyShoppingMallModelingAssistantProviderOfMallEditPart
		extends myShoppingMall.diagram.providers.MyShoppingMallModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(4);
		types.add(myShoppingMall.diagram.providers.MyShoppingMallElementTypes.Branded_2005);
		types.add(myShoppingMall.diagram.providers.MyShoppingMallElementTypes.Specialistic_2006);
		types.add(myShoppingMall.diagram.providers.MyShoppingMallElementTypes.Shops_2007);
		types.add(myShoppingMall.diagram.providers.MyShoppingMallElementTypes.Employee_2004);
		return types;
	}

}
