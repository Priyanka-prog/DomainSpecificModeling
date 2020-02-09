/*
 * 
 */
package myShoppingMall.diagram.part;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

/**
 * @generated
 */
public class MyShoppingMallCreationWizard extends Wizard implements INewWizard {

	/**
	* @generated
	*/
	private IWorkbench workbench;

	/**
	* @generated
	*/
	protected IStructuredSelection selection;

	/**
	* @generated
	*/
	protected myShoppingMall.diagram.part.MyShoppingMallCreationWizardPage diagramModelFilePage;

	/**
	* @generated
	*/
	protected myShoppingMall.diagram.part.MyShoppingMallCreationWizardPage domainModelFilePage;

	/**
	* @generated
	*/
	protected Resource diagram;

	/**
	* @generated
	*/
	private boolean openNewlyCreatedDiagramEditor = true;

	/**
	* @generated
	*/
	public IWorkbench getWorkbench() {
		return workbench;
	}

	/**
	* @generated
	*/
	public IStructuredSelection getSelection() {
		return selection;
	}

	/**
	* @generated
	*/
	public final Resource getDiagram() {
		return diagram;
	}

	/**
	* @generated
	*/
	public final boolean isOpenNewlyCreatedDiagramEditor() {
		return openNewlyCreatedDiagramEditor;
	}

	/**
	* @generated
	*/
	public void setOpenNewlyCreatedDiagramEditor(boolean openNewlyCreatedDiagramEditor) {
		this.openNewlyCreatedDiagramEditor = openNewlyCreatedDiagramEditor;
	}

	/**
	* @generated
	*/
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(myShoppingMall.diagram.part.Messages.MyShoppingMallCreationWizardTitle);
		setDefaultPageImageDescriptor(myShoppingMall.diagram.part.MyShoppingMallDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewMyShoppingMallWizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	/**
	* @generated
	*/
	public void addPages() {
		diagramModelFilePage = new myShoppingMall.diagram.part.MyShoppingMallCreationWizardPage("DiagramModelFile", //$NON-NLS-1$
				getSelection(), "mmd"); //$NON-NLS-1$
		diagramModelFilePage
				.setTitle(myShoppingMall.diagram.part.Messages.MyShoppingMallCreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage.setDescription(
				myShoppingMall.diagram.part.Messages.MyShoppingMallCreationWizard_DiagramModelFilePageDescription);
		addPage(diagramModelFilePage);

		domainModelFilePage = new myShoppingMall.diagram.part.MyShoppingMallCreationWizardPage("DomainModelFile", //$NON-NLS-1$
				getSelection(), "mm") { //$NON-NLS-1$

			public void setVisible(boolean visible) {
				if (visible) {
					String fileName = diagramModelFilePage.getFileName();
					fileName = fileName.substring(0, fileName.length() - ".mmd".length()); //$NON-NLS-1$
					setFileName(myShoppingMall.diagram.part.MyShoppingMallDiagramEditorUtil
							.getUniqueFileName(getContainerFullPath(), fileName, "mm")); //$NON-NLS-1$
				}
				super.setVisible(visible);
			}
		};
		domainModelFilePage
				.setTitle(myShoppingMall.diagram.part.Messages.MyShoppingMallCreationWizard_DomainModelFilePageTitle);
		domainModelFilePage.setDescription(
				myShoppingMall.diagram.part.Messages.MyShoppingMallCreationWizard_DomainModelFilePageDescription);
		addPage(domainModelFilePage);
	}

	/**
	* @generated
	*/
	public boolean performFinish() {
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			protected void execute(IProgressMonitor monitor) throws CoreException, InterruptedException {
				diagram = myShoppingMall.diagram.part.MyShoppingMallDiagramEditorUtil
						.createDiagram(diagramModelFilePage.getURI(), domainModelFilePage.getURI(), monitor);
				if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
					try {
						myShoppingMall.diagram.part.MyShoppingMallDiagramEditorUtil.openDiagram(diagram);
					} catch (PartInitException e) {
						ErrorDialog.openError(getContainer().getShell(),
								myShoppingMall.diagram.part.Messages.MyShoppingMallCreationWizardOpenEditorError, null,
								e.getStatus());
					}
				}
			}
		};
		try {
			getContainer().run(false, true, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			if (e.getTargetException() instanceof CoreException) {
				ErrorDialog.openError(getContainer().getShell(),
						myShoppingMall.diagram.part.Messages.MyShoppingMallCreationWizardCreationError, null,
						((CoreException) e.getTargetException()).getStatus());
			} else {
				myShoppingMall.diagram.part.MyShoppingMallDiagramEditorPlugin.getInstance()
						.logError("Error creating diagram", e.getTargetException()); //$NON-NLS-1$
			}
			return false;
		}
		return diagram != null;
	}
}
