/**
 */
package ezProcess.provider;

import ezProcess.util.EzProcessAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EzProcessItemProviderAdapterFactory extends EzProcessAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzProcessItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link ezProcess.App} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AppItemProvider appItemProvider;

	/**
	 * This creates an adapter for a {@link ezProcess.App}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAppAdapter() {
		if (appItemProvider == null) {
			appItemProvider = new AppItemProvider(this);
		}

		return appItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ezProcess.Employee} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmployeeItemProvider employeeItemProvider;

	/**
	 * This creates an adapter for a {@link ezProcess.Employee}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEmployeeAdapter() {
		if (employeeItemProvider == null) {
			employeeItemProvider = new EmployeeItemProvider(this);
		}

		return employeeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ezProcess.JobDescription} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JobDescriptionItemProvider jobDescriptionItemProvider;

	/**
	 * This creates an adapter for a {@link ezProcess.JobDescription}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createJobDescriptionAdapter() {
		if (jobDescriptionItemProvider == null) {
			jobDescriptionItemProvider = new JobDescriptionItemProvider(this);
		}

		return jobDescriptionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ezProcess.Screening} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScreeningItemProvider screeningItemProvider;

	/**
	 * This creates an adapter for a {@link ezProcess.Screening}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createScreeningAdapter() {
		if (screeningItemProvider == null) {
			screeningItemProvider = new ScreeningItemProvider(this);
		}

		return screeningItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ezProcess.Onboarding} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OnboardingItemProvider onboardingItemProvider;

	/**
	 * This creates an adapter for a {@link ezProcess.Onboarding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOnboardingAdapter() {
		if (onboardingItemProvider == null) {
			onboardingItemProvider = new OnboardingItemProvider(this);
		}

		return onboardingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ezProcess.Page} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageItemProvider pageItemProvider;

	/**
	 * This creates an adapter for a {@link ezProcess.Page}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPageAdapter() {
		if (pageItemProvider == null) {
			pageItemProvider = new PageItemProvider(this);
		}

		return pageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ezProcess.FreeTextArea} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FreeTextAreaItemProvider freeTextAreaItemProvider;

	/**
	 * This creates an adapter for a {@link ezProcess.FreeTextArea}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFreeTextAreaAdapter() {
		if (freeTextAreaItemProvider == null) {
			freeTextAreaItemProvider = new FreeTextAreaItemProvider(this);
		}

		return freeTextAreaItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ezProcess.CandidateTextField} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CandidateTextFieldItemProvider candidateTextFieldItemProvider;

	/**
	 * This creates an adapter for a {@link ezProcess.CandidateTextField}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCandidateTextFieldAdapter() {
		if (candidateTextFieldItemProvider == null) {
			candidateTextFieldItemProvider = new CandidateTextFieldItemProvider(this);
		}

		return candidateTextFieldItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ezProcess.SingleChoiceFromList} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SingleChoiceFromListItemProvider singleChoiceFromListItemProvider;

	/**
	 * This creates an adapter for a {@link ezProcess.SingleChoiceFromList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSingleChoiceFromListAdapter() {
		if (singleChoiceFromListItemProvider == null) {
			singleChoiceFromListItemProvider = new SingleChoiceFromListItemProvider(this);
		}

		return singleChoiceFromListItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ezProcess.MultipleChoiceFromList} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultipleChoiceFromListItemProvider multipleChoiceFromListItemProvider;

	/**
	 * This creates an adapter for a {@link ezProcess.MultipleChoiceFromList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMultipleChoiceFromListAdapter() {
		if (multipleChoiceFromListItemProvider == null) {
			multipleChoiceFromListItemProvider = new MultipleChoiceFromListItemProvider(this);
		}

		return multipleChoiceFromListItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ezProcess.SingleChoiceFromDropDownList} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SingleChoiceFromDropDownListItemProvider singleChoiceFromDropDownListItemProvider;

	/**
	 * This creates an adapter for a {@link ezProcess.SingleChoiceFromDropDownList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSingleChoiceFromDropDownListAdapter() {
		if (singleChoiceFromDropDownListItemProvider == null) {
			singleChoiceFromDropDownListItemProvider = new SingleChoiceFromDropDownListItemProvider(this);
		}

		return singleChoiceFromDropDownListItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ezProcess.Option} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OptionItemProvider optionItemProvider;

	/**
	 * This creates an adapter for a {@link ezProcess.Option}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOptionAdapter() {
		if (optionItemProvider == null) {
			optionItemProvider = new OptionItemProvider(this);
		}

		return optionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ezProcess.OptionRating} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OptionRatingItemProvider optionRatingItemProvider;

	/**
	 * This creates an adapter for a {@link ezProcess.OptionRating}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOptionRatingAdapter() {
		if (optionRatingItemProvider == null) {
			optionRatingItemProvider = new OptionRatingItemProvider(this);
		}

		return optionRatingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ezProcess.OptionThreshold} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OptionThresholdItemProvider optionThresholdItemProvider;

	/**
	 * This creates an adapter for a {@link ezProcess.OptionThreshold}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOptionThresholdAdapter() {
		if (optionThresholdItemProvider == null) {
			optionThresholdItemProvider = new OptionThresholdItemProvider(this);
		}

		return optionThresholdItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ezProcess.Question} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionItemProvider questionItemProvider;

	/**
	 * This creates an adapter for a {@link ezProcess.Question}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createQuestionAdapter() {
		if (questionItemProvider == null) {
			questionItemProvider = new QuestionItemProvider(this);
		}

		return questionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ezProcess.OnboardingTrainingTask} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OnboardingTrainingTaskItemProvider onboardingTrainingTaskItemProvider;

	/**
	 * This creates an adapter for a {@link ezProcess.OnboardingTrainingTask}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOnboardingTrainingTaskAdapter() {
		if (onboardingTrainingTaskItemProvider == null) {
			onboardingTrainingTaskItemProvider = new OnboardingTrainingTaskItemProvider(this);
		}

		return onboardingTrainingTaskItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ezProcess.OnboardingSetupTask} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OnboardingSetupTaskItemProvider onboardingSetupTaskItemProvider;

	/**
	 * This creates an adapter for a {@link ezProcess.OnboardingSetupTask}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOnboardingSetupTaskAdapter() {
		if (onboardingSetupTaskItemProvider == null) {
			onboardingSetupTaskItemProvider = new OnboardingSetupTaskItemProvider(this);
		}

		return onboardingSetupTaskItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ezProcess.TextField} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextFieldItemProvider textFieldItemProvider;

	/**
	 * This creates an adapter for a {@link ezProcess.TextField}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTextFieldAdapter() {
		if (textFieldItemProvider == null) {
			textFieldItemProvider = new TextFieldItemProvider(this);
		}

		return textFieldItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ezProcess.NumberField} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumberFieldItemProvider numberFieldItemProvider;

	/**
	 * This creates an adapter for a {@link ezProcess.NumberField}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNumberFieldAdapter() {
		if (numberFieldItemProvider == null) {
			numberFieldItemProvider = new NumberFieldItemProvider(this);
		}

		return numberFieldItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ezProcess.Date} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DateItemProvider dateItemProvider;

	/**
	 * This creates an adapter for a {@link ezProcess.Date}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDateAdapter() {
		if (dateItemProvider == null) {
			dateItemProvider = new DateItemProvider(this);
		}

		return dateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ezProcess.EmailField} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmailFieldItemProvider emailFieldItemProvider;

	/**
	 * This creates an adapter for a {@link ezProcess.EmailField}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEmailFieldAdapter() {
		if (emailFieldItemProvider == null) {
			emailFieldItemProvider = new EmailFieldItemProvider(this);
		}

		return emailFieldItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ezProcess.FileField} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileFieldItemProvider fileFieldItemProvider;

	/**
	 * This creates an adapter for a {@link ezProcess.FileField}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFileFieldAdapter() {
		if (fileFieldItemProvider == null) {
			fileFieldItemProvider = new FileFieldItemProvider(this);
		}

		return fileFieldItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ezProcess.Rating} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RatingItemProvider ratingItemProvider;

	/**
	 * This creates an adapter for a {@link ezProcess.Rating}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRatingAdapter() {
		if (ratingItemProvider == null) {
			ratingItemProvider = new RatingItemProvider(this);
		}

		return ratingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ezProcess.CandidateEmailField} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CandidateEmailFieldItemProvider candidateEmailFieldItemProvider;

	/**
	 * This creates an adapter for a {@link ezProcess.CandidateEmailField}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCandidateEmailFieldAdapter() {
		if (candidateEmailFieldItemProvider == null) {
			candidateEmailFieldItemProvider = new CandidateEmailFieldItemProvider(this);
		}

		return candidateEmailFieldItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (appItemProvider != null)
			appItemProvider.dispose();
		if (employeeItemProvider != null)
			employeeItemProvider.dispose();
		if (jobDescriptionItemProvider != null)
			jobDescriptionItemProvider.dispose();
		if (screeningItemProvider != null)
			screeningItemProvider.dispose();
		if (onboardingItemProvider != null)
			onboardingItemProvider.dispose();
		if (pageItemProvider != null)
			pageItemProvider.dispose();
		if (freeTextAreaItemProvider != null)
			freeTextAreaItemProvider.dispose();
		if (candidateTextFieldItemProvider != null)
			candidateTextFieldItemProvider.dispose();
		if (singleChoiceFromListItemProvider != null)
			singleChoiceFromListItemProvider.dispose();
		if (multipleChoiceFromListItemProvider != null)
			multipleChoiceFromListItemProvider.dispose();
		if (singleChoiceFromDropDownListItemProvider != null)
			singleChoiceFromDropDownListItemProvider.dispose();
		if (optionItemProvider != null)
			optionItemProvider.dispose();
		if (optionRatingItemProvider != null)
			optionRatingItemProvider.dispose();
		if (optionThresholdItemProvider != null)
			optionThresholdItemProvider.dispose();
		if (questionItemProvider != null)
			questionItemProvider.dispose();
		if (onboardingTrainingTaskItemProvider != null)
			onboardingTrainingTaskItemProvider.dispose();
		if (onboardingSetupTaskItemProvider != null)
			onboardingSetupTaskItemProvider.dispose();
		if (textFieldItemProvider != null)
			textFieldItemProvider.dispose();
		if (numberFieldItemProvider != null)
			numberFieldItemProvider.dispose();
		if (dateItemProvider != null)
			dateItemProvider.dispose();
		if (emailFieldItemProvider != null)
			emailFieldItemProvider.dispose();
		if (fileFieldItemProvider != null)
			fileFieldItemProvider.dispose();
		if (ratingItemProvider != null)
			ratingItemProvider.dispose();
		if (candidateEmailFieldItemProvider != null)
			candidateEmailFieldItemProvider.dispose();
	}

}
