/**
 */
package ezProcess.impl;

import ezProcess.App;
import ezProcess.CandidateEmailField;
import ezProcess.CandidateFieldType;
import ezProcess.CandidateTextField;
import ezProcess.Date;
import ezProcess.EmailField;
import ezProcess.Employee;
import ezProcess.EzProcessFactory;
import ezProcess.EzProcessPackage;
import ezProcess.FileField;
import ezProcess.FreeTextArea;
import ezProcess.JobDescription;
import ezProcess.MultipleChoiceFromList;
import ezProcess.NumberField;
import ezProcess.Onboarding;
import ezProcess.OnboardingSetupTask;
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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EzProcessFactoryImpl extends EFactoryImpl implements EzProcessFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EzProcessFactory init() {
		try {
			EzProcessFactory theEzProcessFactory = (EzProcessFactory) EPackage.Registry.INSTANCE
					.getEFactory(EzProcessPackage.eNS_URI);
			if (theEzProcessFactory != null) {
				return theEzProcessFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EzProcessFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzProcessFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case EzProcessPackage.APP:
			return createApp();
		case EzProcessPackage.EMPLOYEE:
			return createEmployee();
		case EzProcessPackage.JOB_DESCRIPTION:
			return createJobDescription();
		case EzProcessPackage.SCREENING:
			return createScreening();
		case EzProcessPackage.ONBOARDING:
			return createOnboarding();
		case EzProcessPackage.PAGE:
			return createPage();
		case EzProcessPackage.FREE_TEXT_AREA:
			return createFreeTextArea();
		case EzProcessPackage.CANDIDATE_TEXT_FIELD:
			return createCandidateTextField();
		case EzProcessPackage.SINGLE_CHOICE_FROM_LIST:
			return createSingleChoiceFromList();
		case EzProcessPackage.MULTIPLE_CHOICE_FROM_LIST:
			return createMultipleChoiceFromList();
		case EzProcessPackage.SINGLE_CHOICE_FROM_DROP_DOWN_LIST:
			return createSingleChoiceFromDropDownList();
		case EzProcessPackage.OPTION:
			return createOption();
		case EzProcessPackage.OPTION_RATING:
			return createOptionRating();
		case EzProcessPackage.OPTION_THRESHOLD:
			return createOptionThreshold();
		case EzProcessPackage.QUESTION:
			return createQuestion();
		case EzProcessPackage.ONBOARDING_TRAINING_TASK:
			return createOnboardingTrainingTask();
		case EzProcessPackage.ONBOARDING_SETUP_TASK:
			return createOnboardingSetupTask();
		case EzProcessPackage.TEXT_FIELD:
			return createTextField();
		case EzProcessPackage.NUMBER_FIELD:
			return createNumberField();
		case EzProcessPackage.DATE:
			return createDate();
		case EzProcessPackage.EMAIL_FIELD:
			return createEmailField();
		case EzProcessPackage.FILE_FIELD:
			return createFileField();
		case EzProcessPackage.RATING:
			return createRating();
		case EzProcessPackage.CANDIDATE_EMAIL_FIELD:
			return createCandidateEmailField();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case EzProcessPackage.CANDIDATE_FIELD_TYPE:
			return createCandidateFieldTypeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case EzProcessPackage.CANDIDATE_FIELD_TYPE:
			return convertCandidateFieldTypeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public App createApp() {
		AppImpl app = new AppImpl();
		return app;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Employee createEmployee() {
		EmployeeImpl employee = new EmployeeImpl();
		return employee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobDescription createJobDescription() {
		JobDescriptionImpl jobDescription = new JobDescriptionImpl();
		return jobDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Screening createScreening() {
		ScreeningImpl screening = new ScreeningImpl();
		return screening;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Onboarding createOnboarding() {
		OnboardingImpl onboarding = new OnboardingImpl();
		return onboarding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page createPage() {
		PageImpl page = new PageImpl();
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FreeTextArea createFreeTextArea() {
		FreeTextAreaImpl freeTextArea = new FreeTextAreaImpl();
		return freeTextArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CandidateTextField createCandidateTextField() {
		CandidateTextFieldImpl candidateTextField = new CandidateTextFieldImpl();
		return candidateTextField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleChoiceFromList createSingleChoiceFromList() {
		SingleChoiceFromListImpl singleChoiceFromList = new SingleChoiceFromListImpl();
		return singleChoiceFromList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleChoiceFromList createMultipleChoiceFromList() {
		MultipleChoiceFromListImpl multipleChoiceFromList = new MultipleChoiceFromListImpl();
		return multipleChoiceFromList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleChoiceFromDropDownList createSingleChoiceFromDropDownList() {
		SingleChoiceFromDropDownListImpl singleChoiceFromDropDownList = new SingleChoiceFromDropDownListImpl();
		return singleChoiceFromDropDownList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Option createOption() {
		OptionImpl option = new OptionImpl();
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionRating createOptionRating() {
		OptionRatingImpl optionRating = new OptionRatingImpl();
		return optionRating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionThreshold createOptionThreshold() {
		OptionThresholdImpl optionThreshold = new OptionThresholdImpl();
		return optionThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Question createQuestion() {
		QuestionImpl question = new QuestionImpl();
		return question;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnboardingTrainingTask createOnboardingTrainingTask() {
		OnboardingTrainingTaskImpl onboardingTrainingTask = new OnboardingTrainingTaskImpl();
		return onboardingTrainingTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnboardingSetupTask createOnboardingSetupTask() {
		OnboardingSetupTaskImpl onboardingSetupTask = new OnboardingSetupTaskImpl();
		return onboardingSetupTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextField createTextField() {
		TextFieldImpl textField = new TextFieldImpl();
		return textField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberField createNumberField() {
		NumberFieldImpl numberField = new NumberFieldImpl();
		return numberField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date createDate() {
		DateImpl date = new DateImpl();
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmailField createEmailField() {
		EmailFieldImpl emailField = new EmailFieldImpl();
		return emailField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileField createFileField() {
		FileFieldImpl fileField = new FileFieldImpl();
		return fileField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rating createRating() {
		RatingImpl rating = new RatingImpl();
		return rating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CandidateEmailField createCandidateEmailField() {
		CandidateEmailFieldImpl candidateEmailField = new CandidateEmailFieldImpl();
		return candidateEmailField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CandidateFieldType createCandidateFieldTypeFromString(EDataType eDataType, String initialValue) {
		CandidateFieldType result = CandidateFieldType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCandidateFieldTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzProcessPackage getEzProcessPackage() {
		return (EzProcessPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EzProcessPackage getPackage() {
		return EzProcessPackage.eINSTANCE;
	}

} //EzProcessFactoryImpl
