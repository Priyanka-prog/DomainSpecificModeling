/*
 * 
 */
package myShoppingMall.diagram.providers;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = myShoppingMall.diagram.part.MyShoppingMallDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			myShoppingMall.diagram.part.MyShoppingMallDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
