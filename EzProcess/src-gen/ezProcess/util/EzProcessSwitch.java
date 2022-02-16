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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ezProcess.EzProcessPackage
 * @generated
 */
public class EzProcessSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EzProcessPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzProcessSwitch() {
		if (modelPackage == null) {
			modelPackage = EzProcessPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case EzProcessPackage.APP: {
			App app = (App) theEObject;
			T result = caseApp(app);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EzProcessPackage.EMPLOYEE: {
			Employee employee = (Employee) theEObject;
			T result = caseEmployee(employee);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EzProcessPackage.PROCESS: {
			ezProcess.Process process = (ezProcess.Process) theEObject;
			T result = caseProcess(process);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EzProcessPackage.JOB_DESCRIPTION: {
			JobDescription jobDescription = (JobDescription) theEObject;
			T result = caseJobDescription(jobDescription);
			if (result == null)
				result = caseProcess(jobDescription);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EzProcessPackage.SCREENING: {
			Screening screening = (Screening) theEObject;
			T result = caseScreening(screening);
			if (result == null)
				result = caseProcess(screening);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EzProcessPackage.ONBOARDING: {
			Onboarding onboarding = (Onboarding) theEObject;
			T result = caseOnboarding(onboarding);
			if (result == null)
				result = caseProcess(onboarding);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EzProcessPackage.PAGE: {
			Page page = (Page) theEObject;
			T result = casePage(page);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EzProcessPackage.INITIAL_VALUE: {
			InitialValue initialValue = (InitialValue) theEObject;
			T result = caseInitialValue(initialValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EzProcessPackage.FREE_TEXT_AREA: {
			FreeTextArea freeTextArea = (FreeTextArea) theEObject;
			T result = caseFreeTextArea(freeTextArea);
			if (result == null)
				result = caseInitialValue(freeTextArea);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EzProcessPackage.INPUT_FIELD: {
			InputField inputField = (InputField) theEObject;
			T result = caseInputField(inputField);
			if (result == null)
				result = caseInitialValue(inputField);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EzProcessPackage.CANDIDATE_TEXT_FIELD: {
			CandidateTextField candidateTextField = (CandidateTextField) theEObject;
			T result = caseCandidateTextField(candidateTextField);
			if (result == null)
				result = caseTextField(candidateTextField);
			if (result == null)
				result = caseInputField(candidateTextField);
			if (result == null)
				result = caseInitialValue(candidateTextField);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EzProcessPackage.MULTIPLE_OPTIONS: {
			MultipleOptions multipleOptions = (MultipleOptions) theEObject;
			T result = caseMultipleOptions(multipleOptions);
			if (result == null)
				result = caseInitialValue(multipleOptions);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EzProcessPackage.SINGLE_CHOICE_FROM_LIST: {
			SingleChoiceFromList singleChoiceFromList = (SingleChoiceFromList) theEObject;
			T result = caseSingleChoiceFromList(singleChoiceFromList);
			if (result == null)
				result = caseMultipleOptions(singleChoiceFromList);
			if (result == null)
				result = caseInitialValue(singleChoiceFromList);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EzProcessPackage.MULTIPLE_CHOICE_FROM_LIST: {
			MultipleChoiceFromList multipleChoiceFromList = (MultipleChoiceFromList) theEObject;
			T result = caseMultipleChoiceFromList(multipleChoiceFromList);
			if (result == null)
				result = caseMultipleOptions(multipleChoiceFromList);
			if (result == null)
				result = caseInitialValue(multipleChoiceFromList);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EzProcessPackage.SINGLE_CHOICE_FROM_DROP_DOWN_LIST: {
			SingleChoiceFromDropDownList singleChoiceFromDropDownList = (SingleChoiceFromDropDownList) theEObject;
			T result = caseSingleChoiceFromDropDownList(singleChoiceFromDropDownList);
			if (result == null)
				result = caseMultipleOptions(singleChoiceFromDropDownList);
			if (result == null)
				result = caseInitialValue(singleChoiceFromDropDownList);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EzProcessPackage.OPTION: {
			Option option = (Option) theEObject;
			T result = caseOption(option);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EzProcessPackage.OPTION_RATING: {
			OptionRating optionRating = (OptionRating) theEObject;
			T result = caseOptionRating(optionRating);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EzProcessPackage.OPTION_THRESHOLD: {
			OptionThreshold optionThreshold = (OptionThreshold) theEObject;
			T result = caseOptionThreshold(optionThreshold);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EzProcessPackage.QUESTION: {
			Question question = (Question) theEObject;
			T result = caseQuestion(question);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EzProcessPackage.ONBOARDING_TRAINING_TASK: {
			OnboardingTrainingTask onboardingTrainingTask = (OnboardingTrainingTask) theEObject;
			T result = caseOnboardingTrainingTask(onboardingTrainingTask);
			if (result == null)
				result = caseOnboardingTask(onboardingTrainingTask);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EzProcessPackage.ONBOARDING_SETUP_TASK: {
			OnboardingSetupTask onboardingSetupTask = (OnboardingSetupTask) theEObject;
			T result = caseOnboardingSetupTask(onboardingSetupTask);
			if (result == null)
				result = caseOnboardingTask(onboardingSetupTask);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EzProcessPackage.ONBOARDING_TASK: {
			OnboardingTask onboardingTask = (OnboardingTask) theEObject;
			T result = caseOnboardingTask(onboardingTask);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EzProcessPackage.TEXT_FIELD: {
			TextField textField = (TextField) theEObject;
			T result = caseTextField(textField);
			if (result == null)
				result = caseInputField(textField);
			if (result == null)
				result = caseInitialValue(textField);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EzProcessPackage.NUMBER_FIELD: {
			NumberField numberField = (NumberField) theEObject;
			T result = caseNumberField(numberField);
			if (result == null)
				result = caseInputField(numberField);
			if (result == null)
				result = caseInitialValue(numberField);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EzProcessPackage.DATE: {
			Date date = (Date) theEObject;
			T result = caseDate(date);
			if (result == null)
				result = caseInitialValue(date);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EzProcessPackage.EMAIL_FIELD: {
			EmailField emailField = (EmailField) theEObject;
			T result = caseEmailField(emailField);
			if (result == null)
				result = caseInputField(emailField);
			if (result == null)
				result = caseInitialValue(emailField);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EzProcessPackage.FILE_FIELD: {
			FileField fileField = (FileField) theEObject;
			T result = caseFileField(fileField);
			if (result == null)
				result = caseInputField(fileField);
			if (result == null)
				result = caseInitialValue(fileField);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EzProcessPackage.RATING: {
			Rating rating = (Rating) theEObject;
			T result = caseRating(rating);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EzProcessPackage.CANDIDATE_EMAIL_FIELD: {
			CandidateEmailField candidateEmailField = (CandidateEmailField) theEObject;
			T result = caseCandidateEmailField(candidateEmailField);
			if (result == null)
				result = caseEmailField(candidateEmailField);
			if (result == null)
				result = caseInputField(candidateEmailField);
			if (result == null)
				result = caseInitialValue(candidateEmailField);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>App</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>App</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApp(App object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Employee</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Employee</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmployee(Employee object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcess(ezProcess.Process object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Job Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Job Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJobDescription(JobDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Screening</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Screening</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScreening(Screening object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Onboarding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Onboarding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnboarding(Onboarding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePage(Page object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initial Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initial Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitialValue(InitialValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Free Text Area</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Free Text Area</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFreeTextArea(FreeTextArea object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputField(InputField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Candidate Text Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Candidate Text Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCandidateTextField(CandidateTextField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiple Options</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiple Options</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultipleOptions(MultipleOptions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Choice From List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Choice From List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleChoiceFromList(SingleChoiceFromList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiple Choice From List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiple Choice From List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultipleChoiceFromList(MultipleChoiceFromList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Choice From Drop Down List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Choice From Drop Down List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleChoiceFromDropDownList(SingleChoiceFromDropDownList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOption(Option object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Option Rating</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Option Rating</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOptionRating(OptionRating object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Option Threshold</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Option Threshold</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOptionThreshold(OptionThreshold object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Question</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Question</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestion(Question object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Onboarding Training Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Onboarding Training Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnboardingTrainingTask(OnboardingTrainingTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Onboarding Setup Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Onboarding Setup Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnboardingSetupTask(OnboardingSetupTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Onboarding Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Onboarding Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnboardingTask(OnboardingTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextField(TextField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumberField(NumberField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDate(Date object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Email Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Email Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmailField(EmailField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileField(FileField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rating</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rating</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRating(Rating object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Candidate Email Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Candidate Email Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCandidateEmailField(CandidateEmailField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //EzProcessSwitch
