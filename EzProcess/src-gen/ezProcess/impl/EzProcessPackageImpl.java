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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EzProcessPackageImpl extends EPackageImpl implements EzProcessPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass employeeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jobDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass screeningEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass onboardingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass freeTextAreaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass candidateTextFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multipleOptionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleChoiceFromListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multipleChoiceFromListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleChoiceFromDropDownListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionRatingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionThresholdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass onboardingTrainingTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass onboardingSetupTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass onboardingTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emailFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ratingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass candidateEmailFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum candidateFieldTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ezProcess.EzProcessPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EzProcessPackageImpl() {
		super(eNS_URI, EzProcessFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link EzProcessPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EzProcessPackage init() {
		if (isInited)
			return (EzProcessPackage) EPackage.Registry.INSTANCE.getEPackage(EzProcessPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredEzProcessPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		EzProcessPackageImpl theEzProcessPackage = registeredEzProcessPackage instanceof EzProcessPackageImpl
				? (EzProcessPackageImpl) registeredEzProcessPackage
				: new EzProcessPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theEzProcessPackage.createPackageContents();

		// Initialize created meta-data
		theEzProcessPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEzProcessPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EzProcessPackage.eNS_URI, theEzProcessPackage);
		return theEzProcessPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApp() {
		return appEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApp_HasEmployee() {
		return (EReference) appEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApp_HasProcess() {
		return (EReference) appEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmployee() {
		return employeeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmployee_FirstName() {
		return (EAttribute) employeeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmployee_LastName() {
		return (EAttribute) employeeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmployee_Email() {
		return (EAttribute) employeeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmployee_UserName() {
		return (EAttribute) employeeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmployee_Password() {
		return (EAttribute) employeeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmployee_Id() {
		return (EAttribute) employeeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEmployee_AssignedProcess() {
		return (EReference) employeeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcess() {
		return processEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcess_Name() {
		return (EAttribute) processEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcess_HasPage() {
		return (EReference) processEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJobDescription() {
		return jobDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScreening() {
		return screeningEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScreening_HasJobDescription() {
		return (EReference) screeningEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOnboarding() {
		return onboardingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOnboarding_HasScreening() {
		return (EReference) onboardingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPage() {
		return pageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPage_Final() {
		return (EAttribute) pageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPage_First() {
		return (EAttribute) pageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPage_Header() {
		return (EAttribute) pageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPage_Description() {
		return (EAttribute) pageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPage_HasInitialvalue() {
		return (EReference) pageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPage_HasQuestion() {
		return (EReference) pageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPage_HasOnboardingTask() {
		return (EReference) pageEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitialValue() {
		return initialValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInitialValue_Name() {
		return (EAttribute) initialValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInitialValue_Required() {
		return (EAttribute) initialValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInitialValue_Proof() {
		return (EAttribute) initialValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInitialValue_Label() {
		return (EAttribute) initialValueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInitialValue_Rating() {
		return (EAttribute) initialValueEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitialValue_HasRating() {
		return (EReference) initialValueEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFreeTextArea() {
		return freeTextAreaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFreeTextArea_Placeholder() {
		return (EAttribute) freeTextAreaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputField() {
		return inputFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCandidateTextField() {
		return candidateTextFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCandidateTextField_CandidateField() {
		return (EAttribute) candidateTextFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultipleOptions() {
		return multipleOptionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultipleOptions_OptionVarName() {
		return (EAttribute) multipleOptionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultipleOptions_HasOption() {
		return (EReference) multipleOptionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleChoiceFromList() {
		return singleChoiceFromListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultipleChoiceFromList() {
		return multipleChoiceFromListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleChoiceFromDropDownList() {
		return singleChoiceFromDropDownListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOption() {
		return optionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOption_OptionValue() {
		return (EAttribute) optionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOption_OptionLabel() {
		return (EAttribute) optionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOption_HasOptionRating() {
		return (EReference) optionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOption_SetupActions() {
		return (EAttribute) optionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOptionRating() {
		return optionRatingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptionRating_TooltipArray() {
		return (EAttribute) optionRatingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptionRating_ID() {
		return (EAttribute) optionRatingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOptionRating_HasThreshold() {
		return (EReference) optionRatingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOptionRating_IsAbout() {
		return (EReference) optionRatingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOptionThreshold() {
		return optionThresholdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptionThreshold_Min() {
		return (EAttribute) optionThresholdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptionThreshold_Max() {
		return (EAttribute) optionThresholdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptionThreshold_Text() {
		return (EAttribute) optionThresholdEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestion() {
		return questionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuestion_Question() {
		return (EAttribute) questionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestion_IsAbout() {
		return (EReference) questionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuestion_ID() {
		return (EAttribute) questionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOnboardingTrainingTask() {
		return onboardingTrainingTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOnboardingTrainingTask_IsAbout() {
		return (EReference) onboardingTrainingTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOnboardingSetupTask() {
		return onboardingSetupTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOnboardingSetupTask_IsAbout() {
		return (EReference) onboardingSetupTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOnboardingTask() {
		return onboardingTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOnboardingTask_Label() {
		return (EAttribute) onboardingTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOnboardingTask_Name() {
		return (EAttribute) onboardingTaskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextField() {
		return textFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextField_Placeholder() {
		return (EAttribute) textFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumberField() {
		return numberFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberField_Min() {
		return (EAttribute) numberFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberField_Max() {
		return (EAttribute) numberFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDate() {
		return dateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmailField() {
		return emailFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmailField_Placeholder() {
		return (EAttribute) emailFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileField() {
		return fileFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRating() {
		return ratingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRating_TooltipArray() {
		return (EAttribute) ratingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCandidateEmailField() {
		return candidateEmailFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCandidateFieldType() {
		return candidateFieldTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzProcessFactory getEzProcessFactory() {
		return (EzProcessFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		appEClass = createEClass(APP);
		createEReference(appEClass, APP__HAS_EMPLOYEE);
		createEReference(appEClass, APP__HAS_PROCESS);

		employeeEClass = createEClass(EMPLOYEE);
		createEAttribute(employeeEClass, EMPLOYEE__FIRST_NAME);
		createEAttribute(employeeEClass, EMPLOYEE__LAST_NAME);
		createEAttribute(employeeEClass, EMPLOYEE__EMAIL);
		createEAttribute(employeeEClass, EMPLOYEE__USER_NAME);
		createEAttribute(employeeEClass, EMPLOYEE__PASSWORD);
		createEAttribute(employeeEClass, EMPLOYEE__ID);
		createEReference(employeeEClass, EMPLOYEE__ASSIGNED_PROCESS);

		processEClass = createEClass(PROCESS);
		createEAttribute(processEClass, PROCESS__NAME);
		createEReference(processEClass, PROCESS__HAS_PAGE);

		jobDescriptionEClass = createEClass(JOB_DESCRIPTION);

		screeningEClass = createEClass(SCREENING);
		createEReference(screeningEClass, SCREENING__HAS_JOB_DESCRIPTION);

		onboardingEClass = createEClass(ONBOARDING);
		createEReference(onboardingEClass, ONBOARDING__HAS_SCREENING);

		pageEClass = createEClass(PAGE);
		createEAttribute(pageEClass, PAGE__FINAL);
		createEAttribute(pageEClass, PAGE__FIRST);
		createEAttribute(pageEClass, PAGE__HEADER);
		createEAttribute(pageEClass, PAGE__DESCRIPTION);
		createEReference(pageEClass, PAGE__HAS_INITIALVALUE);
		createEReference(pageEClass, PAGE__HAS_QUESTION);
		createEReference(pageEClass, PAGE__HAS_ONBOARDING_TASK);

		initialValueEClass = createEClass(INITIAL_VALUE);
		createEAttribute(initialValueEClass, INITIAL_VALUE__NAME);
		createEAttribute(initialValueEClass, INITIAL_VALUE__REQUIRED);
		createEAttribute(initialValueEClass, INITIAL_VALUE__PROOF);
		createEAttribute(initialValueEClass, INITIAL_VALUE__LABEL);
		createEAttribute(initialValueEClass, INITIAL_VALUE__RATING);
		createEReference(initialValueEClass, INITIAL_VALUE__HAS_RATING);

		freeTextAreaEClass = createEClass(FREE_TEXT_AREA);
		createEAttribute(freeTextAreaEClass, FREE_TEXT_AREA__PLACEHOLDER);

		inputFieldEClass = createEClass(INPUT_FIELD);

		candidateTextFieldEClass = createEClass(CANDIDATE_TEXT_FIELD);
		createEAttribute(candidateTextFieldEClass, CANDIDATE_TEXT_FIELD__CANDIDATE_FIELD);

		multipleOptionsEClass = createEClass(MULTIPLE_OPTIONS);
		createEAttribute(multipleOptionsEClass, MULTIPLE_OPTIONS__OPTION_VAR_NAME);
		createEReference(multipleOptionsEClass, MULTIPLE_OPTIONS__HAS_OPTION);

		singleChoiceFromListEClass = createEClass(SINGLE_CHOICE_FROM_LIST);

		multipleChoiceFromListEClass = createEClass(MULTIPLE_CHOICE_FROM_LIST);

		singleChoiceFromDropDownListEClass = createEClass(SINGLE_CHOICE_FROM_DROP_DOWN_LIST);

		optionEClass = createEClass(OPTION);
		createEAttribute(optionEClass, OPTION__OPTION_VALUE);
		createEAttribute(optionEClass, OPTION__OPTION_LABEL);
		createEReference(optionEClass, OPTION__HAS_OPTION_RATING);
		createEAttribute(optionEClass, OPTION__SETUP_ACTIONS);

		optionRatingEClass = createEClass(OPTION_RATING);
		createEAttribute(optionRatingEClass, OPTION_RATING__TOOLTIP_ARRAY);
		createEAttribute(optionRatingEClass, OPTION_RATING__ID);
		createEReference(optionRatingEClass, OPTION_RATING__HAS_THRESHOLD);
		createEReference(optionRatingEClass, OPTION_RATING__IS_ABOUT);

		optionThresholdEClass = createEClass(OPTION_THRESHOLD);
		createEAttribute(optionThresholdEClass, OPTION_THRESHOLD__MIN);
		createEAttribute(optionThresholdEClass, OPTION_THRESHOLD__MAX);
		createEAttribute(optionThresholdEClass, OPTION_THRESHOLD__TEXT);

		questionEClass = createEClass(QUESTION);
		createEAttribute(questionEClass, QUESTION__QUESTION);
		createEReference(questionEClass, QUESTION__IS_ABOUT);
		createEAttribute(questionEClass, QUESTION__ID);

		onboardingTrainingTaskEClass = createEClass(ONBOARDING_TRAINING_TASK);
		createEReference(onboardingTrainingTaskEClass, ONBOARDING_TRAINING_TASK__IS_ABOUT);

		onboardingSetupTaskEClass = createEClass(ONBOARDING_SETUP_TASK);
		createEReference(onboardingSetupTaskEClass, ONBOARDING_SETUP_TASK__IS_ABOUT);

		onboardingTaskEClass = createEClass(ONBOARDING_TASK);
		createEAttribute(onboardingTaskEClass, ONBOARDING_TASK__LABEL);
		createEAttribute(onboardingTaskEClass, ONBOARDING_TASK__NAME);

		textFieldEClass = createEClass(TEXT_FIELD);
		createEAttribute(textFieldEClass, TEXT_FIELD__PLACEHOLDER);

		numberFieldEClass = createEClass(NUMBER_FIELD);
		createEAttribute(numberFieldEClass, NUMBER_FIELD__MIN);
		createEAttribute(numberFieldEClass, NUMBER_FIELD__MAX);

		dateEClass = createEClass(DATE);

		emailFieldEClass = createEClass(EMAIL_FIELD);
		createEAttribute(emailFieldEClass, EMAIL_FIELD__PLACEHOLDER);

		fileFieldEClass = createEClass(FILE_FIELD);

		ratingEClass = createEClass(RATING);
		createEAttribute(ratingEClass, RATING__TOOLTIP_ARRAY);

		candidateEmailFieldEClass = createEClass(CANDIDATE_EMAIL_FIELD);

		// Create enums
		candidateFieldTypeEEnum = createEEnum(CANDIDATE_FIELD_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		jobDescriptionEClass.getESuperTypes().add(this.getProcess());
		screeningEClass.getESuperTypes().add(this.getProcess());
		onboardingEClass.getESuperTypes().add(this.getProcess());
		freeTextAreaEClass.getESuperTypes().add(this.getInitialValue());
		inputFieldEClass.getESuperTypes().add(this.getInitialValue());
		candidateTextFieldEClass.getESuperTypes().add(this.getTextField());
		multipleOptionsEClass.getESuperTypes().add(this.getInitialValue());
		singleChoiceFromListEClass.getESuperTypes().add(this.getMultipleOptions());
		multipleChoiceFromListEClass.getESuperTypes().add(this.getMultipleOptions());
		singleChoiceFromDropDownListEClass.getESuperTypes().add(this.getMultipleOptions());
		onboardingTrainingTaskEClass.getESuperTypes().add(this.getOnboardingTask());
		onboardingSetupTaskEClass.getESuperTypes().add(this.getOnboardingTask());
		textFieldEClass.getESuperTypes().add(this.getInputField());
		numberFieldEClass.getESuperTypes().add(this.getInputField());
		dateEClass.getESuperTypes().add(this.getInitialValue());
		emailFieldEClass.getESuperTypes().add(this.getInputField());
		fileFieldEClass.getESuperTypes().add(this.getInputField());
		candidateEmailFieldEClass.getESuperTypes().add(this.getEmailField());

		// Initialize classes, features, and operations; add parameters
		initEClass(appEClass, App.class, "App", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getApp_HasEmployee(), this.getEmployee(), null, "hasEmployee", null, 0, -1, App.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApp_HasProcess(), this.getProcess(), null, "hasProcess", null, 1, -1, App.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(employeeEClass, Employee.class, "Employee", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmployee_FirstName(), ecorePackage.getEString(), "firstName", null, 0, 1, Employee.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmployee_LastName(), ecorePackage.getEString(), "lastName", null, 0, 1, Employee.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmployee_Email(), ecorePackage.getEString(), "email", null, 0, 1, Employee.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmployee_UserName(), ecorePackage.getEString(), "userName", null, 1, 1, Employee.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmployee_Password(), ecorePackage.getEString(), "password", null, 1, 1, Employee.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmployee_Id(), ecorePackage.getEInt(), "id", null, 1, 1, Employee.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEmployee_AssignedProcess(), this.getProcess(), null, "assignedProcess", null, 1, -1,
				Employee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processEClass, ezProcess.Process.class, "Process", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcess_Name(), ecorePackage.getEString(), "name", null, 1, 1, ezProcess.Process.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcess_HasPage(), this.getPage(), null, "hasPage", null, 1, -1, ezProcess.Process.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jobDescriptionEClass, JobDescription.class, "JobDescription", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(screeningEClass, Screening.class, "Screening", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScreening_HasJobDescription(), this.getJobDescription(), null, "hasJobDescription", null, 1,
				1, Screening.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(onboardingEClass, Onboarding.class, "Onboarding", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOnboarding_HasScreening(), this.getScreening(), null, "hasScreening", null, 1, 1,
				Onboarding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pageEClass, Page.class, "Page", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPage_Final(), ecorePackage.getEBoolean(), "final", null, 1, 1, Page.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPage_First(), ecorePackage.getEBoolean(), "first", null, 1, 1, Page.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPage_Header(), ecorePackage.getEString(), "header", null, 0, 1, Page.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPage_Description(), ecorePackage.getEString(), "description", null, 0, 1, Page.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPage_HasInitialvalue(), this.getInitialValue(), null, "hasInitialvalue", null, 0, -1,
				Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPage_HasQuestion(), this.getQuestion(), null, "hasQuestion", null, 0, -1, Page.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPage_HasOnboardingTask(), this.getOnboardingTask(), null, "hasOnboardingTask", null, 0, -1,
				Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initialValueEClass, InitialValue.class, "InitialValue", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInitialValue_Name(), ecorePackage.getEString(), "name", null, 1, 1, InitialValue.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInitialValue_Required(), ecorePackage.getEBoolean(), "required", null, 1, 1,
				InitialValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getInitialValue_Proof(), ecorePackage.getEBoolean(), "Proof", null, 1, 1, InitialValue.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInitialValue_Label(), ecorePackage.getEString(), "label", null, 1, 1, InitialValue.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInitialValue_Rating(), ecorePackage.getEBoolean(), "rating", null, 1, 1, InitialValue.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialValue_HasRating(), this.getRating(), null, "hasRating", null, 0, -1,
				InitialValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(freeTextAreaEClass, FreeTextArea.class, "FreeTextArea", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFreeTextArea_Placeholder(), ecorePackage.getEString(), "placeholder", null, 0, 1,
				FreeTextArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(inputFieldEClass, InputField.class, "InputField", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(candidateTextFieldEClass, CandidateTextField.class, "CandidateTextField", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCandidateTextField_CandidateField(), this.getCandidateFieldType(), "candidateField", null, 1,
				1, CandidateTextField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multipleOptionsEClass, MultipleOptions.class, "MultipleOptions", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMultipleOptions_OptionVarName(), ecorePackage.getEString(), "optionVarName", null, 1, 1,
				MultipleOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getMultipleOptions_HasOption(), this.getOption(), null, "hasOption", null, 2, -1,
				MultipleOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(singleChoiceFromListEClass, SingleChoiceFromList.class, "SingleChoiceFromList", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multipleChoiceFromListEClass, MultipleChoiceFromList.class, "MultipleChoiceFromList", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(singleChoiceFromDropDownListEClass, SingleChoiceFromDropDownList.class,
				"SingleChoiceFromDropDownList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(optionEClass, Option.class, "Option", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOption_OptionValue(), ecorePackage.getEString(), "optionValue", null, 1, 1, Option.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOption_OptionLabel(), ecorePackage.getEString(), "optionLabel", null, 1, 1, Option.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOption_HasOptionRating(), this.getOptionRating(), null, "hasOptionRating", null, 0, -1,
				Option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOption_SetupActions(), ecorePackage.getEString(), "setupActions", null, 0, -1, Option.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(optionRatingEClass, OptionRating.class, "OptionRating", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOptionRating_TooltipArray(), ecorePackage.getEString(), "tooltipArray", null, 1, 10,
				OptionRating.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getOptionRating_ID(), ecorePackage.getEInt(), "ID", null, 1, 1, OptionRating.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOptionRating_HasThreshold(), this.getOptionThreshold(), null, "hasThreshold", null, 0, -1,
				OptionRating.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOptionRating_IsAbout(), this.getQuestion(), null, "isAbout", null, 1, 1, OptionRating.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(optionThresholdEClass, OptionThreshold.class, "OptionThreshold", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOptionThreshold_Min(), ecorePackage.getEInt(), "min", null, 1, 1, OptionThreshold.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOptionThreshold_Max(), ecorePackage.getEInt(), "max", null, 1, 1, OptionThreshold.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOptionThreshold_Text(), ecorePackage.getEString(), "text", null, 1, -1, OptionThreshold.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(questionEClass, Question.class, "Question", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuestion_Question(), ecorePackage.getEString(), "question", null, 1, 1, Question.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuestion_IsAbout(), this.getMultipleOptions(), null, "isAbout", null, 1, 1, Question.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestion_ID(), ecorePackage.getEInt(), "ID", null, 1, 1, Question.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(onboardingTrainingTaskEClass, OnboardingTrainingTask.class, "OnboardingTrainingTask", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOnboardingTrainingTask_IsAbout(), this.getQuestion(), null, "isAbout", null, 1, 1,
				OnboardingTrainingTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(onboardingSetupTaskEClass, OnboardingSetupTask.class, "OnboardingSetupTask", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOnboardingSetupTask_IsAbout(), this.getMultipleOptions(), null, "isAbout", null, 1, 1,
				OnboardingSetupTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(onboardingTaskEClass, OnboardingTask.class, "OnboardingTask", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOnboardingTask_Label(), ecorePackage.getEString(), "label", null, 0, 1, OnboardingTask.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOnboardingTask_Name(), ecorePackage.getEString(), "name", null, 1, 1, OnboardingTask.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textFieldEClass, TextField.class, "TextField", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextField_Placeholder(), ecorePackage.getEString(), "placeholder", null, 0, 1,
				TextField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(numberFieldEClass, NumberField.class, "NumberField", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNumberField_Min(), ecorePackage.getEInt(), "min", "0", 1, 1, NumberField.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumberField_Max(), ecorePackage.getEInt(), "max", "10000", 1, 1, NumberField.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateEClass, Date.class, "Date", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(emailFieldEClass, EmailField.class, "EmailField", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmailField_Placeholder(), ecorePackage.getEString(), "placeholder", null, 0, 1,
				EmailField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(fileFieldEClass, FileField.class, "FileField", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(ratingEClass, Rating.class, "Rating", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRating_TooltipArray(), ecorePackage.getEString(), "tooltipArray", null, 1, 10, Rating.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(candidateEmailFieldEClass, CandidateEmailField.class, "CandidateEmailField", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(candidateFieldTypeEEnum, CandidateFieldType.class, "CandidateFieldType");
		addEEnumLiteral(candidateFieldTypeEEnum, CandidateFieldType.FIRST_NAME);
		addEEnumLiteral(candidateFieldTypeEEnum, CandidateFieldType.LAST_NAME);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";
		addAnnotation(this, source, new String[] { "ecore", "http://www.eclipse.org/emf/2002/Ecore" });
	}

} //EzProcessPackageImpl
