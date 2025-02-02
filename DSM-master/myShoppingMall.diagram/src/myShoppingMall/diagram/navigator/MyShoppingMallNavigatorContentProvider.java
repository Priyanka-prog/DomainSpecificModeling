/*
* 
*/
package myShoppingMall.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

/**
 * @generated
 */
public class MyShoppingMallNavigatorContentProvider implements ICommonContentProvider {

	/**
	* @generated
	*/
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	* @generated
	*/
	private Viewer myViewer;

	/**
	* @generated
	*/
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	* @generated
	*/
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	* @generated
	*/
	private Runnable myViewerRefreshRunnable;

	/**
	* @generated
	*/
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public MyShoppingMallNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain, new WorkspaceSynchronizer.Delegate() {
			public void dispose() {
			}

			public boolean handleResourceChanged(final Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceDeleted(Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceMoved(Resource resource, final URI newURI) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}
		});
	}

	/**
	* @generated
	*/
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	* @generated
	*/
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	* @generated
	*/
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet().getResources()) {
			nextResource.unload();
		}
	}

	/**
	* @generated
	*/
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay().asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	* @generated
	*/
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
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
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(fileURI, true);
			ArrayList<myShoppingMall.diagram.navigator.MyShoppingMallNavigatorItem> result = new ArrayList<myShoppingMall.diagram.navigator.MyShoppingMallNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(topViews, myShoppingMall.diagram.edit.parts.MallEditPart.MODEL_ID), file, false));
			return result.toArray();
		}

		if (parentElement instanceof myShoppingMall.diagram.navigator.MyShoppingMallNavigatorGroup) {
			myShoppingMall.diagram.navigator.MyShoppingMallNavigatorGroup group = (myShoppingMall.diagram.navigator.MyShoppingMallNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof myShoppingMall.diagram.navigator.MyShoppingMallNavigatorItem) {
			myShoppingMall.diagram.navigator.MyShoppingMallNavigatorItem navigatorItem = (myShoppingMall.diagram.navigator.MyShoppingMallNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		/*
		* Due to plugin.xml restrictions this code will be called only for views representing
		* shortcuts to this diagram elements created on other diagrams. 
		*/
		if (parentElement instanceof IAdaptable) {
			View view = (View) ((IAdaptable) parentElement).getAdapter(View.class);
			if (view != null) {
				return getViewChildren(view, parentElement);
			}
		}

		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (myShoppingMall.diagram.part.MyShoppingMallVisualIDRegistry.getVisualID(view)) {

		case myShoppingMall.diagram.edit.parts.MallEditPart.VISUAL_ID: {
			LinkedList<myShoppingMall.diagram.navigator.MyShoppingMallAbstractNavigatorItem> result = new LinkedList<myShoppingMall.diagram.navigator.MyShoppingMallAbstractNavigatorItem>();
			result.addAll(getForeignShortcuts((Diagram) view, parentElement));
			Diagram sv = (Diagram) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					myShoppingMall.diagram.part.MyShoppingMallVisualIDRegistry
							.getType(myShoppingMall.diagram.edit.parts.BrandedEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					myShoppingMall.diagram.part.MyShoppingMallVisualIDRegistry
							.getType(myShoppingMall.diagram.edit.parts.SpecialisticEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					myShoppingMall.diagram.part.MyShoppingMallVisualIDRegistry
							.getType(myShoppingMall.diagram.edit.parts.ShopsEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					myShoppingMall.diagram.part.MyShoppingMallVisualIDRegistry
							.getType(myShoppingMall.diagram.edit.parts.EmployeeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case myShoppingMall.diagram.edit.parts.BrandedEditPart.VISUAL_ID: {
			LinkedList<myShoppingMall.diagram.navigator.MyShoppingMallAbstractNavigatorItem> result = new LinkedList<myShoppingMall.diagram.navigator.MyShoppingMallAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					myShoppingMall.diagram.part.MyShoppingMallVisualIDRegistry.getType(
							myShoppingMall.diagram.edit.parts.BrandedBrandedEmployeesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					myShoppingMall.diagram.part.MyShoppingMallVisualIDRegistry
							.getType(myShoppingMall.diagram.edit.parts.Employee2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					myShoppingMall.diagram.part.MyShoppingMallVisualIDRegistry.getType(
							myShoppingMall.diagram.edit.parts.BrandedBrandedStoragesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					myShoppingMall.diagram.part.MyShoppingMallVisualIDRegistry
							.getType(myShoppingMall.diagram.edit.parts.StorageEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case myShoppingMall.diagram.edit.parts.SpecialisticEditPart.VISUAL_ID: {
			LinkedList<myShoppingMall.diagram.navigator.MyShoppingMallAbstractNavigatorItem> result = new LinkedList<myShoppingMall.diagram.navigator.MyShoppingMallAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					myShoppingMall.diagram.part.MyShoppingMallVisualIDRegistry.getType(
							myShoppingMall.diagram.edit.parts.SpecialisticSpecialisticEmployeesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					myShoppingMall.diagram.part.MyShoppingMallVisualIDRegistry
							.getType(myShoppingMall.diagram.edit.parts.Employee2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					myShoppingMall.diagram.part.MyShoppingMallVisualIDRegistry.getType(
							myShoppingMall.diagram.edit.parts.SpecialisticSpecialisticStoragesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					myShoppingMall.diagram.part.MyShoppingMallVisualIDRegistry
							.getType(myShoppingMall.diagram.edit.parts.StorageEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case myShoppingMall.diagram.edit.parts.ShopsEditPart.VISUAL_ID: {
			LinkedList<myShoppingMall.diagram.navigator.MyShoppingMallAbstractNavigatorItem> result = new LinkedList<myShoppingMall.diagram.navigator.MyShoppingMallAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					myShoppingMall.diagram.part.MyShoppingMallVisualIDRegistry.getType(
							myShoppingMall.diagram.edit.parts.ShopsShopsEmployeesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					myShoppingMall.diagram.part.MyShoppingMallVisualIDRegistry
							.getType(myShoppingMall.diagram.edit.parts.Employee2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					myShoppingMall.diagram.part.MyShoppingMallVisualIDRegistry.getType(
							myShoppingMall.diagram.edit.parts.ShopsShopsStoragesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					myShoppingMall.diagram.part.MyShoppingMallVisualIDRegistry
							.getType(myShoppingMall.diagram.edit.parts.StorageEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case myShoppingMall.diagram.edit.parts.StorageEditPart.VISUAL_ID: {
			LinkedList<myShoppingMall.diagram.navigator.MyShoppingMallAbstractNavigatorItem> result = new LinkedList<myShoppingMall.diagram.navigator.MyShoppingMallAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					myShoppingMall.diagram.part.MyShoppingMallVisualIDRegistry.getType(
							myShoppingMall.diagram.edit.parts.StorageStorageItemsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					myShoppingMall.diagram.part.MyShoppingMallVisualIDRegistry
							.getType(myShoppingMall.diagram.edit.parts.ItemEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case myShoppingMall.diagram.edit.parts.ItemEditPart.VISUAL_ID: {
			LinkedList<myShoppingMall.diagram.navigator.MyShoppingMallAbstractNavigatorItem> result = new LinkedList<myShoppingMall.diagram.navigator.MyShoppingMallAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					myShoppingMall.diagram.part.MyShoppingMallVisualIDRegistry
							.getType(myShoppingMall.diagram.edit.parts.ItemItemItemsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					myShoppingMall.diagram.part.MyShoppingMallVisualIDRegistry
							.getType(myShoppingMall.diagram.edit.parts.CategoryEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case myShoppingMall.diagram.edit.parts.CategoryEditPart.VISUAL_ID: {
			LinkedList<myShoppingMall.diagram.navigator.MyShoppingMallAbstractNavigatorItem> result = new LinkedList<myShoppingMall.diagram.navigator.MyShoppingMallAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					myShoppingMall.diagram.part.MyShoppingMallVisualIDRegistry.getType(
							myShoppingMall.diagram.edit.parts.CategoryCategoryContainsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					myShoppingMall.diagram.part.MyShoppingMallVisualIDRegistry
							.getType(myShoppingMall.diagram.edit.parts.SubCategoryEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Collection<View> getLinksSourceByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType()) && isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType()) && isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return myShoppingMall.diagram.edit.parts.MallEditPart.MODEL_ID
				.equals(myShoppingMall.diagram.part.MyShoppingMallVisualIDRegistry.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<myShoppingMall.diagram.navigator.MyShoppingMallNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<myShoppingMall.diagram.navigator.MyShoppingMallNavigatorItem> result = new ArrayList<myShoppingMall.diagram.navigator.MyShoppingMallNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new myShoppingMall.diagram.navigator.MyShoppingMallNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<myShoppingMall.diagram.navigator.MyShoppingMallNavigatorItem> getForeignShortcuts(
			Diagram diagram, Object parent) {
		LinkedList<View> result = new LinkedList<View>();
		for (Iterator<View> it = diagram.getChildren().iterator(); it.hasNext();) {
			View nextView = it.next();
			if (!isOwnView(nextView) && nextView.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				result.add(nextView);
			}
		}
		return createNavigatorItems(result, parent, false);
	}

	/**
	* @generated
	*/
	public Object getParent(Object element) {
		if (element instanceof myShoppingMall.diagram.navigator.MyShoppingMallAbstractNavigatorItem) {
			myShoppingMall.diagram.navigator.MyShoppingMallAbstractNavigatorItem abstractNavigatorItem = (myShoppingMall.diagram.navigator.MyShoppingMallAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
