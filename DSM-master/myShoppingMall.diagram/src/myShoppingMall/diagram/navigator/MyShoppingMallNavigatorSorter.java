/*
* 
*/
package myShoppingMall.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class MyShoppingMallNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 7014;

	/**
	* @generated
	*/
	private static final int SHORTCUTS_CATEGORY = 7013;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof myShoppingMall.diagram.navigator.MyShoppingMallNavigatorItem) {
			myShoppingMall.diagram.navigator.MyShoppingMallNavigatorItem item = (myShoppingMall.diagram.navigator.MyShoppingMallNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return myShoppingMall.diagram.part.MyShoppingMallVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
