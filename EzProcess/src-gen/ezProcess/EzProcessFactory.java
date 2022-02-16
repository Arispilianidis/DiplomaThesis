/**
 */
package ezProcess;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ezProcess.EzProcessPackage
 * @generated
 */
public interface EzProcessFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EzProcessFactory eINSTANCE = ezProcess.impl.EzProcessFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>App</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>App</em>'.
	 * @generated
	 */
	App createApp();

	/**
	 * Returns a new object of class '<em>Employee</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Employee</em>'.
	 * @generated
	 */
	Employee createEmployee();

	/**
	 * Returns a new object of class '<em>Job Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Job Description</em>'.
	 * @generated
	 */
	JobDescription createJobDescription();

	/**
	 * Returns a new object of class '<em>Screening</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Screening</em>'.
	 * @generated
	 */
	Screening createScreening();

	/**
	 * Returns a new object of class '<em>Onboarding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Onboarding</em>'.
	 * @generated
	 */
	Onboarding createOnboarding();

	/**
	 * Returns a new object of class '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Page</em>'.
	 * @generated
	 */
	Page createPage();

	/**
	 * Returns a new object of class '<em>Free Text Area</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Free Text Area</em>'.
	 * @generated
	 */
	FreeTextArea createFreeTextArea();

	/**
	 * Returns a new object of class '<em>Candidate Text Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Candidate Text Field</em>'.
	 * @generated
	 */
	CandidateTextField createCandidateTextField();

	/**
	 * Returns a new object of class '<em>Single Choice From List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Choice From List</em>'.
	 * @generated
	 */
	SingleChoiceFromList createSingleChoiceFromList();

	/**
	 * Returns a new object of class '<em>Multiple Choice From List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multiple Choice From List</em>'.
	 * @generated
	 */
	MultipleChoiceFromList createMultipleChoiceFromList();

	/**
	 * Returns a new object of class '<em>Single Choice From Drop Down List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Choice From Drop Down List</em>'.
	 * @generated
	 */
	SingleChoiceFromDropDownList createSingleChoiceFromDropDownList();

	/**
	 * Returns a new object of class '<em>Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Option</em>'.
	 * @generated
	 */
	Option createOption();

	/**
	 * Returns a new object of class '<em>Option Rating</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Option Rating</em>'.
	 * @generated
	 */
	OptionRating createOptionRating();

	/**
	 * Returns a new object of class '<em>Option Threshold</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Option Threshold</em>'.
	 * @generated
	 */
	OptionThreshold createOptionThreshold();

	/**
	 * Returns a new object of class '<em>Question</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Question</em>'.
	 * @generated
	 */
	Question createQuestion();

	/**
	 * Returns a new object of class '<em>Onboarding Training Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Onboarding Training Task</em>'.
	 * @generated
	 */
	OnboardingTrainingTask createOnboardingTrainingTask();

	/**
	 * Returns a new object of class '<em>Onboarding Setup Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Onboarding Setup Task</em>'.
	 * @generated
	 */
	OnboardingSetupTask createOnboardingSetupTask();

	/**
	 * Returns a new object of class '<em>Text Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Field</em>'.
	 * @generated
	 */
	TextField createTextField();

	/**
	 * Returns a new object of class '<em>Number Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Field</em>'.
	 * @generated
	 */
	NumberField createNumberField();

	/**
	 * Returns a new object of class '<em>Date</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date</em>'.
	 * @generated
	 */
	Date createDate();

	/**
	 * Returns a new object of class '<em>Email Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Email Field</em>'.
	 * @generated
	 */
	EmailField createEmailField();

	/**
	 * Returns a new object of class '<em>File Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Field</em>'.
	 * @generated
	 */
	FileField createFileField();

	/**
	 * Returns a new object of class '<em>Rating</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rating</em>'.
	 * @generated
	 */
	Rating createRating();

	/**
	 * Returns a new object of class '<em>Candidate Email Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Candidate Email Field</em>'.
	 * @generated
	 */
	CandidateEmailField createCandidateEmailField();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EzProcessPackage getEzProcessPackage();

} //EzProcessFactory
