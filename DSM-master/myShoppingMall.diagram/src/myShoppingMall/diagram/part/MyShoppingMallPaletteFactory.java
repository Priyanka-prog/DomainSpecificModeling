
/*
 * 
 */
package myShoppingMall.diagram.part;

import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

/**
 * @generated
 */
public class MyShoppingMallPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
	}

	/**
	* Creates "Objects" palette tool group
	* @generated
	*/
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(myShoppingMall.diagram.part.Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createBranded1CreationTool());
		paletteContainer.add(createCategory2CreationTool());
		paletteContainer.add(createEmployee3CreationTool());
		paletteContainer.add(createItem4CreationTool());
		paletteContainer.add(createOffer5CreationTool());
		paletteContainer.add(createShops6CreationTool());
		paletteContainer.add(createSpecialistic7CreationTool());
		paletteContainer.add(createStorage8CreationTool());
		paletteContainer.add(createSubCategory9CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createBranded1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				myShoppingMall.diagram.part.Messages.Branded1CreationTool_title,
				myShoppingMall.diagram.part.Messages.Branded1CreationTool_desc,
				Collections.singletonList(myShoppingMall.diagram.providers.MyShoppingMallElementTypes.Branded_2005));
		entry.setId("createBranded1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(myShoppingMall.diagram.providers.MyShoppingMallElementTypes
				.getImageDescriptor(myShoppingMall.diagram.providers.MyShoppingMallElementTypes.Branded_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCategory2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				myShoppingMall.diagram.part.Messages.Category2CreationTool_title,
				myShoppingMall.diagram.part.Messages.Category2CreationTool_desc,
				Collections.singletonList(myShoppingMall.diagram.providers.MyShoppingMallElementTypes.Category_3004));
		entry.setId("createCategory2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(myShoppingMall.diagram.providers.MyShoppingMallElementTypes
				.getImageDescriptor(myShoppingMall.diagram.providers.MyShoppingMallElementTypes.Category_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createEmployee3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(myShoppingMall.diagram.providers.MyShoppingMallElementTypes.Employee_3006);
		types.add(myShoppingMall.diagram.providers.MyShoppingMallElementTypes.Employee_2004);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				myShoppingMall.diagram.part.Messages.Employee3CreationTool_title,
				myShoppingMall.diagram.part.Messages.Employee3CreationTool_desc, types);
		entry.setId("createEmployee3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(myShoppingMall.diagram.providers.MyShoppingMallElementTypes
				.getImageDescriptor(myShoppingMall.diagram.providers.MyShoppingMallElementTypes.Employee_3006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createItem4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				myShoppingMall.diagram.part.Messages.Item4CreationTool_title,
				myShoppingMall.diagram.part.Messages.Item4CreationTool_desc,
				Collections.singletonList(myShoppingMall.diagram.providers.MyShoppingMallElementTypes.Item_3003));
		entry.setId("createItem4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(myShoppingMall.diagram.providers.MyShoppingMallElementTypes
				.getImageDescriptor(myShoppingMall.diagram.providers.MyShoppingMallElementTypes.Item_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createOffer5CreationTool() {
		ToolEntry entry = new ToolEntry(myShoppingMall.diagram.part.Messages.Offer5CreationTool_title,
				myShoppingMall.diagram.part.Messages.Offer5CreationTool_desc, null, null) {
		};
		entry.setId("createOffer5CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createShops6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				myShoppingMall.diagram.part.Messages.Shops6CreationTool_title,
				myShoppingMall.diagram.part.Messages.Shops6CreationTool_desc,
				Collections.singletonList(myShoppingMall.diagram.providers.MyShoppingMallElementTypes.Shops_2007));
		entry.setId("createShops6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(myShoppingMall.diagram.providers.MyShoppingMallElementTypes
				.getImageDescriptor(myShoppingMall.diagram.providers.MyShoppingMallElementTypes.Shops_2007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSpecialistic7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				myShoppingMall.diagram.part.Messages.Specialistic7CreationTool_title,
				myShoppingMall.diagram.part.Messages.Specialistic7CreationTool_desc, Collections
						.singletonList(myShoppingMall.diagram.providers.MyShoppingMallElementTypes.Specialistic_2006));
		entry.setId("createSpecialistic7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(myShoppingMall.diagram.providers.MyShoppingMallElementTypes
				.getImageDescriptor(myShoppingMall.diagram.providers.MyShoppingMallElementTypes.Specialistic_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createStorage8CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				myShoppingMall.diagram.part.Messages.Storage8CreationTool_title,
				myShoppingMall.diagram.part.Messages.Storage8CreationTool_desc,
				Collections.singletonList(myShoppingMall.diagram.providers.MyShoppingMallElementTypes.Storage_3002));
		entry.setId("createStorage8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(myShoppingMall.diagram.providers.MyShoppingMallElementTypes
				.getImageDescriptor(myShoppingMall.diagram.providers.MyShoppingMallElementTypes.Storage_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSubCategory9CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				myShoppingMall.diagram.part.Messages.SubCategory9CreationTool_title,
				myShoppingMall.diagram.part.Messages.SubCategory9CreationTool_desc, Collections
						.singletonList(myShoppingMall.diagram.providers.MyShoppingMallElementTypes.SubCategory_3005));
		entry.setId("createSubCategory9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(myShoppingMall.diagram.providers.MyShoppingMallElementTypes
				.getImageDescriptor(myShoppingMall.diagram.providers.MyShoppingMallElementTypes.SubCategory_3005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
