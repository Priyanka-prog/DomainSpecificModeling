/*
 * 
 */
package myShoppingMall.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	* @generated
	*/
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		myShoppingMall.diagram.preferences.DiagramGeneralPreferencePage.initDefaults(store);
		myShoppingMall.diagram.preferences.DiagramAppearancePreferencePage.initDefaults(store);
		myShoppingMall.diagram.preferences.DiagramConnectionsPreferencePage.initDefaults(store);
		myShoppingMall.diagram.preferences.DiagramPrintingPreferencePage.initDefaults(store);
		myShoppingMall.diagram.preferences.DiagramRulersAndGridPreferencePage.initDefaults(store);

	}

	/**
	* @generated
	*/
	protected IPreferenceStore getPreferenceStore() {
		return myShoppingMall.diagram.part.MyShoppingMallDiagramEditorPlugin.getInstance().getPreferenceStore();
	}
}
