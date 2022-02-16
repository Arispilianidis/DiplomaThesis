/**
 */
package ezProcess.provider;

import ezProcess.EzProcessFactory;
import ezProcess.EzProcessPackage;
import ezProcess.Page;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ezProcess.Page} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PageItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addFinalPropertyDescriptor(object);
			addFirstPropertyDescriptor(object);
			addHeaderPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Final feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFinalPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Page_final_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Page_final_feature", "_UI_Page_type"),
						EzProcessPackage.Literals.PAGE__FINAL, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the First feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFirstPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Page_first_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Page_first_feature", "_UI_Page_type"),
						EzProcessPackage.Literals.PAGE__FIRST, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Header feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHeaderPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Page_header_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Page_header_feature", "_UI_Page_type"),
						EzProcessPackage.Literals.PAGE__HEADER, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Page_description_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Page_description_feature",
								"_UI_Page_type"),
						EzProcessPackage.Literals.PAGE__DESCRIPTION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(EzProcessPackage.Literals.PAGE__HAS_INITIALVALUE);
			childrenFeatures.add(EzProcessPackage.Literals.PAGE__HAS_QUESTION);
			childrenFeatures.add(EzProcessPackage.Literals.PAGE__HAS_ONBOARDING_TASK);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Page.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Page"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Page page = (Page) object;
		return getString("_UI_Page_type") + " " + page.isFinal();
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Page.class)) {
		case EzProcessPackage.PAGE__FINAL:
		case EzProcessPackage.PAGE__FIRST:
		case EzProcessPackage.PAGE__HEADER:
		case EzProcessPackage.PAGE__DESCRIPTION:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case EzProcessPackage.PAGE__HAS_INITIALVALUE:
		case EzProcessPackage.PAGE__HAS_QUESTION:
		case EzProcessPackage.PAGE__HAS_ONBOARDING_TASK:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(EzProcessPackage.Literals.PAGE__HAS_INITIALVALUE,
				EzProcessFactory.eINSTANCE.createFreeTextArea()));

		newChildDescriptors.add(createChildParameter(EzProcessPackage.Literals.PAGE__HAS_INITIALVALUE,
				EzProcessFactory.eINSTANCE.createTextField()));

		newChildDescriptors.add(createChildParameter(EzProcessPackage.Literals.PAGE__HAS_INITIALVALUE,
				EzProcessFactory.eINSTANCE.createCandidateTextField()));

		newChildDescriptors.add(createChildParameter(EzProcessPackage.Literals.PAGE__HAS_INITIALVALUE,
				EzProcessFactory.eINSTANCE.createSingleChoiceFromList()));

		newChildDescriptors.add(createChildParameter(EzProcessPackage.Literals.PAGE__HAS_INITIALVALUE,
				EzProcessFactory.eINSTANCE.createMultipleChoiceFromList()));

		newChildDescriptors.add(createChildParameter(EzProcessPackage.Literals.PAGE__HAS_INITIALVALUE,
				EzProcessFactory.eINSTANCE.createSingleChoiceFromDropDownList()));

		newChildDescriptors.add(createChildParameter(EzProcessPackage.Literals.PAGE__HAS_INITIALVALUE,
				EzProcessFactory.eINSTANCE.createNumberField()));

		newChildDescriptors.add(createChildParameter(EzProcessPackage.Literals.PAGE__HAS_INITIALVALUE,
				EzProcessFactory.eINSTANCE.createDate()));

		newChildDescriptors.add(createChildParameter(EzProcessPackage.Literals.PAGE__HAS_INITIALVALUE,
				EzProcessFactory.eINSTANCE.createEmailField()));

		newChildDescriptors.add(createChildParameter(EzProcessPackage.Literals.PAGE__HAS_INITIALVALUE,
				EzProcessFactory.eINSTANCE.createFileField()));

		newChildDescriptors.add(createChildParameter(EzProcessPackage.Literals.PAGE__HAS_INITIALVALUE,
				EzProcessFactory.eINSTANCE.createCandidateEmailField()));

		newChildDescriptors.add(createChildParameter(EzProcessPackage.Literals.PAGE__HAS_QUESTION,
				EzProcessFactory.eINSTANCE.createQuestion()));

		newChildDescriptors.add(createChildParameter(EzProcessPackage.Literals.PAGE__HAS_ONBOARDING_TASK,
				EzProcessFactory.eINSTANCE.createOnboardingTrainingTask()));

		newChildDescriptors.add(createChildParameter(EzProcessPackage.Literals.PAGE__HAS_ONBOARDING_TASK,
				EzProcessFactory.eINSTANCE.createOnboardingSetupTask()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return EzProcessEditPlugin.INSTANCE;
	}

}
