/**
 */
package ezProcess.util;

import ezProcess.App;
import ezProcess.CandidateEmailField;
import ezProcess.CandidateTextField;
import ezProcess.Date;
import ezProcess.EmailField;
import ezProcess.Employee;
import ezProcess.EzProcessPackage;
import ezProcess.FileField;
import ezProcess.FreeTextArea;
import ezProcess.InitialValue;
import ezProcess.InputField;
import ezProcess.JobDescription;
import ezProcess.MultipleChoiceFromList;
import ezProcess.MultipleOptions;
import ezProcess.NumberField;
import ezProcess.Onboarding;
import ezProcess.OnboardingSetupTask;
import ezProcess.OnboardingTask;
import ezProcess.OnboardingTrainingTask;
import ezProcess.Option;
import ezProcess.OptionRating;
import ezProcess.OptionThreshold;
import ezProcess.Page;
import ezProcess.Question;
import ezProcess.Rating;
import ezProcess.Screening;
import ezProcess.SingleChoiceFromDropDownList;
import ezProcess.SingleChoiceFromList;
import ezProcess.TextField;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ezProcess.EzProcessPackage
 * @generated
 */
public class EzProcessAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EzProcessPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzProcessAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EzProcessPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EzProcessSwitch<Adapter> modelSwitch = new EzProcessSwitch<Adapter>() {
		@Override
		public Adapter caseApp(App object) {
			return createAppAdapter();
		}

		@Override
		public Adapter caseEmployee(Employee object) {
			return createEmployeeAdapter();
		}

		@Override
		public Adapter caseProcess(ezProcess.Process object) {
			return createProcessAdapter();
		}

		@Override
		public Adapter caseJobDescription(JobDescription object) {
			return createJobDescriptionAdapter();
		}

		@Override
		public Adapter caseScreening(Screening object) {
			return createScreeningAdapter();
		}

		@Override
		public Adapter caseOnboarding(Onboarding object) {
			return createOnboardingAdapter();
		}

		@Override
		public Adapter casePage(Page object) {
			return createPageAdapter();
		}

		@Override
		public Adapter caseInitialValue(InitialValue object) {
			return createInitialValueAdapter();
		}

		@Override
		public Adapter caseFreeTextArea(FreeTextArea object) {
			return createFreeTextAreaAdapter();
		}

		@Override
		public Adapter caseInputField(InputField object) {
			return createInputFieldAdapter();
		}

		@Override
		public Adapter caseCandidateTextField(CandidateTextField object) {
			return createCandidateTextFieldAdapter();
		}

		@Override
		public Adapter caseMultipleOptions(MultipleOptions object) {
			return createMultipleOptionsAdapter();
		}

		@Override
		public Adapter caseSingleChoiceFromList(SingleChoiceFromList object) {
			return createSingleChoiceFromListAdapter();
		}

		@Override
		public Adapter caseMultipleChoiceFromList(MultipleChoiceFromList object) {
			return createMultipleChoiceFromListAdapter();
		}

		@Override
		public Adapter caseSingleChoiceFromDropDownList(SingleChoiceFromDropDownList object) {
			return createSingleChoiceFromDropDownListAdapter();
		}

		@Override
		public Adapter caseOption(Option object) {
			return createOptionAdapter();
		}

		@Override
		public Adapter caseOptionRating(OptionRating object) {
			return createOptionRatingAdapter();
		}

		@Override
		public Adapter caseOptionThreshold(OptionThreshold object) {
			return createOptionThresholdAdapter();
		}

		@Override
		public Adapter caseQuestion(Question object) {
			return createQuestionAdapter();
		}

		@Override
		public Adapter caseOnboardingTrainingTask(OnboardingTrainingTask object) {
			return createOnboardingTrainingTaskAdapter();
		}

		@Override
		public Adapter caseOnboardingSetupTask(OnboardingSetupTask object) {
			return createOnboardingSetupTaskAdapter();
		}

		@Override
		public Adapter caseOnboardingTask(OnboardingTask object) {
			return createOnboardingTaskAdapter();
		}

		@Override
		public Adapter caseTextField(TextField object) {
			return createTextFieldAdapter();
		}

		@Override
		public Adapter caseNumberField(NumberField object) {
			return createNumberFieldAdapter();
		}

		@Override
		public Adapter caseDate(Date object) {
			return createDateAdapter();
		}

		@Override
		public Adapter caseEmailField(EmailField object) {
			return createEmailFieldAdapter();
		}

		@Override
		public Adapter caseFileField(FileField object) {
			return createFileFieldAdapter();
		}

		@Override
		public Adapter caseRating(Rating object) {
			return createRatingAdapter();
		}

		@Override
		public Adapter caseCandidateEmailField(CandidateEmailField object) {
			return createCandidateEmailFieldAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link ezProcess.App <em>App</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ezProcess.App
	 * @generated
	 */
	public Adapter createAppAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ezProcess.Employee <em>Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ezProcess.Employee
	 * @generated
	 */
	public Adapter createEmployeeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ezProcess.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ezProcess.Process
	 * @generated
	 */
	public Adapter createProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ezProcess.JobDescription <em>Job Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ezProcess.JobDescription
	 * @generated
	 */
	public Adapter createJobDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ezProcess.Screening <em>Screening</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ezProcess.Screening
	 * @generated
	 */
	public Adapter createScreeningAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ezProcess.Onboarding <em>Onboarding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ezProcess.Onboarding
	 * @generated
	 */
	public Adapter createOnboardingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ezProcess.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ezProcess.Page
	 * @generated
	 */
	public Adapter createPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ezProcess.InitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ezProcess.InitialValue
	 * @generated
	 */
	public Adapter createInitialValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ezProcess.FreeTextArea <em>Free Text Area</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ezProcess.FreeTextArea
	 * @generated
	 */
	public Adapter createFreeTextAreaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ezProcess.InputField <em>Input Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ezProcess.InputField
	 * @generated
	 */
	public Adapter createInputFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ezProcess.CandidateTextField <em>Candidate Text Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ezProcess.CandidateTextField
	 * @generated
	 */
	public Adapter createCandidateTextFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ezProcess.MultipleOptions <em>Multiple Options</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ezProcess.MultipleOptions
	 * @generated
	 */
	public Adapter createMultipleOptionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ezProcess.SingleChoiceFromList <em>Single Choice From List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ezProcess.SingleChoiceFromList
	 * @generated
	 */
	public Adapter createSingleChoiceFromListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ezProcess.MultipleChoiceFromList <em>Multiple Choice From List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ezProcess.MultipleChoiceFromList
	 * @generated
	 */
	public Adapter createMultipleChoiceFromListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ezProcess.SingleChoiceFromDropDownList <em>Single Choice From Drop Down List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ezProcess.SingleChoiceFromDropDownList
	 * @generated
	 */
	public Adapter createSingleChoiceFromDropDownListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ezProcess.Option <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ezProcess.Option
	 * @generated
	 */
	public Adapter createOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ezProcess.OptionRating <em>Option Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ezProcess.OptionRating
	 * @generated
	 */
	public Adapter createOptionRatingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ezProcess.OptionThreshold <em>Option Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ezProcess.OptionThreshold
	 * @generated
	 */
	public Adapter createOptionThresholdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ezProcess.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ezProcess.Question
	 * @generated
	 */
	public Adapter createQuestionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ezProcess.OnboardingTrainingTask <em>Onboarding Training Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ezProcess.OnboardingTrainingTask
	 * @generated
	 */
	public Adapter createOnboardingTrainingTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ezProcess.OnboardingSetupTask <em>Onboarding Setup Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ezProcess.OnboardingSetupTask
	 * @generated
	 */
	public Adapter createOnboardingSetupTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ezProcess.OnboardingTask <em>Onboarding Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ezProcess.OnboardingTask
	 * @generated
	 */
	public Adapter createOnboardingTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ezProcess.TextField <em>Text Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ezProcess.TextField
	 * @generated
	 */
	public Adapter createTextFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ezProcess.NumberField <em>Number Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ezProcess.NumberField
	 * @generated
	 */
	public Adapter createNumberFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ezProcess.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ezProcess.Date
	 * @generated
	 */
	public Adapter createDateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ezProcess.EmailField <em>Email Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ezProcess.EmailField
	 * @generated
	 */
	public Adapter createEmailFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ezProcess.FileField <em>File Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ezProcess.FileField
	 * @generated
	 */
	public Adapter createFileFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ezProcess.Rating <em>Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ezProcess.Rating
	 * @generated
	 */
	public Adapter createRatingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ezProcess.CandidateEmailField <em>Candidate Email Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ezProcess.CandidateEmailField
	 * @generated
	 */
	public Adapter createCandidateEmailFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //EzProcessAdapterFactory
