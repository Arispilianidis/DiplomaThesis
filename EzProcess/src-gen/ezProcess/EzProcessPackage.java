/**
 */
package ezProcess;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ezProcess.EzProcessFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 * @generated
 */
public interface EzProcessPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ezProcess";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/ezProcess";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ezProcess";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EzProcessPackage eINSTANCE = ezProcess.impl.EzProcessPackageImpl.init();

	/**
	 * The meta object id for the '{@link ezProcess.impl.AppImpl <em>App</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ezProcess.impl.AppImpl
	 * @see ezProcess.impl.EzProcessPackageImpl#getApp()
	 * @generated
	 */
	int APP = 0;

	/**
	 * The feature id for the '<em><b>Has Employee</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP__HAS_EMPLOYEE = 0;

	/**
	 * The feature id for the '<em><b>Has Process</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP__HAS_PROCESS = 1;

	/**
	 * The number of structural features of the '<em>App</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>App</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ezProcess.impl.EmployeeImpl <em>Employee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ezProcess.impl.EmployeeImpl
	 * @see ezProcess.impl.EzProcessPackageImpl#getEmployee()
	 * @generated
	 */
	int EMPLOYEE = 1;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__FIRST_NAME = 0;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__LAST_NAME = 1;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__EMAIL = 2;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__USER_NAME = 3;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__PASSWORD = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__ID = 5;

	/**
	 * The feature id for the '<em><b>Assigned Process</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__ASSIGNED_PROCESS = 6;

	/**
	 * The number of structural features of the '<em>Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ezProcess.impl.ProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ezProcess.impl.ProcessImpl
	 * @see ezProcess.impl.EzProcessPackageImpl#getProcess()
	 * @generated
	 */
	int PROCESS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Has Page</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__HAS_PAGE = 1;

	/**
	 * The number of structural features of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ezProcess.impl.JobDescriptionImpl <em>Job Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ezProcess.impl.JobDescriptionImpl
	 * @see ezProcess.impl.EzProcessPackageImpl#getJobDescription()
	 * @generated
	 */
	int JOB_DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_DESCRIPTION__NAME = PROCESS__NAME;

	/**
	 * The feature id for the '<em><b>Has Page</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_DESCRIPTION__HAS_PAGE = PROCESS__HAS_PAGE;

	/**
	 * The number of structural features of the '<em>Job Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_DESCRIPTION_FEATURE_COUNT = PROCESS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Job Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_DESCRIPTION_OPERATION_COUNT = PROCESS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ezProcess.impl.ScreeningImpl <em>Screening</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ezProcess.impl.ScreeningImpl
	 * @see ezProcess.impl.EzProcessPackageImpl#getScreening()
	 * @generated
	 */
	int SCREENING = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREENING__NAME = PROCESS__NAME;

	/**
	 * The feature id for the '<em><b>Has Page</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREENING__HAS_PAGE = PROCESS__HAS_PAGE;

	/**
	 * The feature id for the '<em><b>Has Job Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREENING__HAS_JOB_DESCRIPTION = PROCESS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Screening</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREENING_FEATURE_COUNT = PROCESS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Screening</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREENING_OPERATION_COUNT = PROCESS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ezProcess.impl.OnboardingImpl <em>Onboarding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ezProcess.impl.OnboardingImpl
	 * @see ezProcess.impl.EzProcessPackageImpl#getOnboarding()
	 * @generated
	 */
	int ONBOARDING = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONBOARDING__NAME = PROCESS__NAME;

	/**
	 * The feature id for the '<em><b>Has Page</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONBOARDING__HAS_PAGE = PROCESS__HAS_PAGE;

	/**
	 * The feature id for the '<em><b>Has Screening</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONBOARDING__HAS_SCREENING = PROCESS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Onboarding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONBOARDING_FEATURE_COUNT = PROCESS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Onboarding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONBOARDING_OPERATION_COUNT = PROCESS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ezProcess.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ezProcess.impl.PageImpl
	 * @see ezProcess.impl.EzProcessPackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 6;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__FINAL = 0;

	/**
	 * The feature id for the '<em><b>First</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__FIRST = 1;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__HEADER = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Has Initialvalue</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__HAS_INITIALVALUE = 4;

	/**
	 * The feature id for the '<em><b>Has Question</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__HAS_QUESTION = 5;

	/**
	 * The feature id for the '<em><b>Has Onboarding Task</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__HAS_ONBOARDING_TASK = 6;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ezProcess.impl.InitialValueImpl <em>Initial Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ezProcess.impl.InitialValueImpl
	 * @see ezProcess.impl.EzProcessPackageImpl#getInitialValue()
	 * @generated
	 */
	int INITIAL_VALUE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_VALUE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_VALUE__REQUIRED = 1;

	/**
	 * The feature id for the '<em><b>Proof</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_VALUE__PROOF = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_VALUE__LABEL = 3;

	/**
	 * The feature id for the '<em><b>Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_VALUE__RATING = 4;

	/**
	 * The feature id for the '<em><b>Has Rating</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_VALUE__HAS_RATING = 5;

	/**
	 * The number of structural features of the '<em>Initial Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_VALUE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Initial Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ezProcess.impl.FreeTextAreaImpl <em>Free Text Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ezProcess.impl.FreeTextAreaImpl
	 * @see ezProcess.impl.EzProcessPackageImpl#getFreeTextArea()
	 * @generated
	 */
	int FREE_TEXT_AREA = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT_AREA__NAME = INITIAL_VALUE__NAME;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT_AREA__REQUIRED = INITIAL_VALUE__REQUIRED;

	/**
	 * The feature id for the '<em><b>Proof</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT_AREA__PROOF = INITIAL_VALUE__PROOF;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT_AREA__LABEL = INITIAL_VALUE__LABEL;

	/**
	 * The feature id for the '<em><b>Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT_AREA__RATING = INITIAL_VALUE__RATING;

	/**
	 * The feature id for the '<em><b>Has Rating</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT_AREA__HAS_RATING = INITIAL_VALUE__HAS_RATING;

	/**
	 * The feature id for the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT_AREA__PLACEHOLDER = INITIAL_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Free Text Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT_AREA_FEATURE_COUNT = INITIAL_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Free Text Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT_AREA_OPERATION_COUNT = INITIAL_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ezProcess.impl.InputFieldImpl <em>Input Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ezProcess.impl.InputFieldImpl
	 * @see ezProcess.impl.EzProcessPackageImpl#getInputField()
	 * @generated
	 */
	int INPUT_FIELD = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FIELD__NAME = INITIAL_VALUE__NAME;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FIELD__REQUIRED = INITIAL_VALUE__REQUIRED;

	/**
	 * The feature id for the '<em><b>Proof</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FIELD__PROOF = INITIAL_VALUE__PROOF;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FIELD__LABEL = INITIAL_VALUE__LABEL;

	/**
	 * The feature id for the '<em><b>Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FIELD__RATING = INITIAL_VALUE__RATING;

	/**
	 * The feature id for the '<em><b>Has Rating</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FIELD__HAS_RATING = INITIAL_VALUE__HAS_RATING;

	/**
	 * The number of structural features of the '<em>Input Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FIELD_FEATURE_COUNT = INITIAL_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Input Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FIELD_OPERATION_COUNT = INITIAL_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ezProcess.impl.TextFieldImpl <em>Text Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ezProcess.impl.TextFieldImpl
	 * @see ezProcess.impl.EzProcessPackageImpl#getTextField()
	 * @generated
	 */
	int TEXT_FIELD = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__NAME = INPUT_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__REQUIRED = INPUT_FIELD__REQUIRED;

	/**
	 * The feature id for the '<em><b>Proof</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__PROOF = INPUT_FIELD__PROOF;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__LABEL = INPUT_FIELD__LABEL;

	/**
	 * The feature id for the '<em><b>Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__RATING = INPUT_FIELD__RATING;

	/**
	 * The feature id for the '<em><b>Has Rating</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__HAS_RATING = INPUT_FIELD__HAS_RATING;

	/**
	 * The feature id for the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__PLACEHOLDER = INPUT_FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD_FEATURE_COUNT = INPUT_FIELD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Text Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD_OPERATION_COUNT = INPUT_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ezProcess.impl.CandidateTextFieldImpl <em>Candidate Text Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ezProcess.impl.CandidateTextFieldImpl
	 * @see ezProcess.impl.EzProcessPackageImpl#getCandidateTextField()
	 * @generated
	 */
	int CANDIDATE_TEXT_FIELD = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANDIDATE_TEXT_FIELD__NAME = TEXT_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANDIDATE_TEXT_FIELD__REQUIRED = TEXT_FIELD__REQUIRED;

	/**
	 * The feature id for the '<em><b>Proof</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANDIDATE_TEXT_FIELD__PROOF = TEXT_FIELD__PROOF;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANDIDATE_TEXT_FIELD__LABEL = TEXT_FIELD__LABEL;

	/**
	 * The feature id for the '<em><b>Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANDIDATE_TEXT_FIELD__RATING = TEXT_FIELD__RATING;

	/**
	 * The feature id for the '<em><b>Has Rating</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANDIDATE_TEXT_FIELD__HAS_RATING = TEXT_FIELD__HAS_RATING;

	/**
	 * The feature id for the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANDIDATE_TEXT_FIELD__PLACEHOLDER = TEXT_FIELD__PLACEHOLDER;

	/**
	 * The feature id for the '<em><b>Candidate Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANDIDATE_TEXT_FIELD__CANDIDATE_FIELD = TEXT_FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Candidate Text Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANDIDATE_TEXT_FIELD_FEATURE_COUNT = TEXT_FIELD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Candidate Text Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANDIDATE_TEXT_FIELD_OPERATION_COUNT = TEXT_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ezProcess.impl.MultipleOptionsImpl <em>Multiple Options</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ezProcess.impl.MultipleOptionsImpl
	 * @see ezProcess.impl.EzProcessPackageImpl#getMultipleOptions()
	 * @generated
	 */
	int MULTIPLE_OPTIONS = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_OPTIONS__NAME = INITIAL_VALUE__NAME;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_OPTIONS__REQUIRED = INITIAL_VALUE__REQUIRED;

	/**
	 * The feature id for the '<em><b>Proof</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_OPTIONS__PROOF = INITIAL_VALUE__PROOF;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_OPTIONS__LABEL = INITIAL_VALUE__LABEL;

	/**
	 * The feature id for the '<em><b>Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_OPTIONS__RATING = INITIAL_VALUE__RATING;

	/**
	 * The feature id for the '<em><b>Has Rating</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_OPTIONS__HAS_RATING = INITIAL_VALUE__HAS_RATING;

	/**
	 * The feature id for the '<em><b>Option Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_OPTIONS__OPTION_VAR_NAME = INITIAL_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has Option</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_OPTIONS__HAS_OPTION = INITIAL_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Multiple Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_OPTIONS_FEATURE_COUNT = INITIAL_VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Multiple Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_OPTIONS_OPERATION_COUNT = INITIAL_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ezProcess.impl.SingleChoiceFromListImpl <em>Single Choice From List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ezProcess.impl.SingleChoiceFromListImpl
	 * @see ezProcess.impl.EzProcessPackageImpl#getSingleChoiceFromList()
	 * @generated
	 */
	int SINGLE_CHOICE_FROM_LIST = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_CHOICE_FROM_LIST__NAME = MULTIPLE_OPTIONS__NAME;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_CHOICE_FROM_LIST__REQUIRED = MULTIPLE_OPTIONS__REQUIRED;

	/**
	 * The feature id for the '<em><b>Proof</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_CHOICE_FROM_LIST__PROOF = MULTIPLE_OPTIONS__PROOF;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_CHOICE_FROM_LIST__LABEL = MULTIPLE_OPTIONS__LABEL;

	/**
	 * The feature id for the '<em><b>Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_CHOICE_FROM_LIST__RATING = MULTIPLE_OPTIONS__RATING;

	/**
	 * The feature id for the '<em><b>Has Rating</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_CHOICE_FROM_LIST__HAS_RATING = MULTIPLE_OPTIONS__HAS_RATING;

	/**
	 * The feature id for the '<em><b>Option Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_CHOICE_FROM_LIST__OPTION_VAR_NAME = MULTIPLE_OPTIONS__OPTION_VAR_NAME;

	/**
	 * The feature id for the '<em><b>Has Option</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_CHOICE_FROM_LIST__HAS_OPTION = MULTIPLE_OPTIONS__HAS_OPTION;

	/**
	 * The number of structural features of the '<em>Single Choice From List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_CHOICE_FROM_LIST_FEATURE_COUNT = MULTIPLE_OPTIONS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Single Choice From List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_CHOICE_FROM_LIST_OPERATION_COUNT = MULTIPLE_OPTIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ezProcess.impl.MultipleChoiceFromListImpl <em>Multiple Choice From List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ezProcess.impl.MultipleChoiceFromListImpl
	 * @see ezProcess.impl.EzProcessPackageImpl#getMultipleChoiceFromList()
	 * @generated
	 */
	int MULTIPLE_CHOICE_FROM_LIST = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE_FROM_LIST__NAME = MULTIPLE_OPTIONS__NAME;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE_FROM_LIST__REQUIRED = MULTIPLE_OPTIONS__REQUIRED;

	/**
	 * The feature id for the '<em><b>Proof</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE_FROM_LIST__PROOF = MULTIPLE_OPTIONS__PROOF;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE_FROM_LIST__LABEL = MULTIPLE_OPTIONS__LABEL;

	/**
	 * The feature id for the '<em><b>Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE_FROM_LIST__RATING = MULTIPLE_OPTIONS__RATING;

	/**
	 * The feature id for the '<em><b>Has Rating</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE_FROM_LIST__HAS_RATING = MULTIPLE_OPTIONS__HAS_RATING;

	/**
	 * The feature id for the '<em><b>Option Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE_FROM_LIST__OPTION_VAR_NAME = MULTIPLE_OPTIONS__OPTION_VAR_NAME;

	/**
	 * The feature id for the '<em><b>Has Option</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE_FROM_LIST__HAS_OPTION = MULTIPLE_OPTIONS__HAS_OPTION;

	/**
	 * The number of structural features of the '<em>Multiple Choice From List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE_FROM_LIST_FEATURE_COUNT = MULTIPLE_OPTIONS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Multiple Choice From List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE_FROM_LIST_OPERATION_COUNT = MULTIPLE_OPTIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ezProcess.impl.SingleChoiceFromDropDownListImpl <em>Single Choice From Drop Down List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ezProcess.impl.SingleChoiceFromDropDownListImpl
	 * @see ezProcess.impl.EzProcessPackageImpl#getSingleChoiceFromDropDownList()
	 * @generated
	 */
	int SINGLE_CHOICE_FROM_DROP_DOWN_LIST = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_CHOICE_FROM_DROP_DOWN_LIST__NAME = MULTIPLE_OPTIONS__NAME;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_CHOICE_FROM_DROP_DOWN_LIST__REQUIRED = MULTIPLE_OPTIONS__REQUIRED;

	/**
	 * The feature id for the '<em><b>Proof</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_CHOICE_FROM_DROP_DOWN_LIST__PROOF = MULTIPLE_OPTIONS__PROOF;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_CHOICE_FROM_DROP_DOWN_LIST__LABEL = MULTIPLE_OPTIONS__LABEL;

	/**
	 * The feature id for the '<em><b>Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_CHOICE_FROM_DROP_DOWN_LIST__RATING = MULTIPLE_OPTIONS__RATING;

	/**
	 * The feature id for the '<em><b>Has Rating</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_CHOICE_FROM_DROP_DOWN_LIST__HAS_RATING = MULTIPLE_OPTIONS__HAS_RATING;

	/**
	 * The feature id for the '<em><b>Option Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_CHOICE_FROM_DROP_DOWN_LIST__OPTION_VAR_NAME = MULTIPLE_OPTIONS__OPTION_VAR_NAME;

	/**
	 * The feature id for the '<em><b>Has Option</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_CHOICE_FROM_DROP_DOWN_LIST__HAS_OPTION = MULTIPLE_OPTIONS__HAS_OPTION;

	/**
	 * The number of structural features of the '<em>Single Choice From Drop Down List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_CHOICE_FROM_DROP_DOWN_LIST_FEATURE_COUNT = MULTIPLE_OPTIONS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Single Choice From Drop Down List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_CHOICE_FROM_DROP_DOWN_LIST_OPERATION_COUNT = MULTIPLE_OPTIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ezProcess.impl.OptionImpl <em>Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ezProcess.impl.OptionImpl
	 * @see ezProcess.impl.EzProcessPackageImpl#getOption()
	 * @generated
	 */
	int OPTION = 15;

	/**
	 * The feature id for the '<em><b>Option Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__OPTION_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Option Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__OPTION_LABEL = 1;

	/**
	 * The feature id for the '<em><b>Has Option Rating</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__HAS_OPTION_RATING = 2;

	/**
	 * The feature id for the '<em><b>Setup Actions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__SETUP_ACTIONS = 3;

	/**
	 * The number of structural features of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ezProcess.impl.OptionRatingImpl <em>Option Rating</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ezProcess.impl.OptionRatingImpl
	 * @see ezProcess.impl.EzProcessPackageImpl#getOptionRating()
	 * @generated
	 */
	int OPTION_RATING = 16;

	/**
	 * The feature id for the '<em><b>Tooltip Array</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_RATING__TOOLTIP_ARRAY = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_RATING__ID = 1;

	/**
	 * The feature id for the '<em><b>Has Threshold</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_RATING__HAS_THRESHOLD = 2;

	/**
	 * The feature id for the '<em><b>Is About</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_RATING__IS_ABOUT = 3;

	/**
	 * The number of structural features of the '<em>Option Rating</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_RATING_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Option Rating</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_RATING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ezProcess.impl.OptionThresholdImpl <em>Option Threshold</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ezProcess.impl.OptionThresholdImpl
	 * @see ezProcess.impl.EzProcessPackageImpl#getOptionThreshold()
	 * @generated
	 */
	int OPTION_THRESHOLD = 17;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_THRESHOLD__MIN = 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_THRESHOLD__MAX = 1;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_THRESHOLD__TEXT = 2;

	/**
	 * The number of structural features of the '<em>Option Threshold</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_THRESHOLD_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Option Threshold</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_THRESHOLD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ezProcess.impl.QuestionImpl <em>Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ezProcess.impl.QuestionImpl
	 * @see ezProcess.impl.EzProcessPackageImpl#getQuestion()
	 * @generated
	 */
	int QUESTION = 18;

	/**
	 * The feature id for the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__QUESTION = 0;

	/**
	 * The feature id for the '<em><b>Is About</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__IS_ABOUT = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__ID = 2;

	/**
	 * The number of structural features of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ezProcess.impl.OnboardingTaskImpl <em>Onboarding Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ezProcess.impl.OnboardingTaskImpl
	 * @see ezProcess.impl.EzProcessPackageImpl#getOnboardingTask()
	 * @generated
	 */
	int ONBOARDING_TASK = 21;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONBOARDING_TASK__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONBOARDING_TASK__NAME = 1;

	/**
	 * The number of structural features of the '<em>Onboarding Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONBOARDING_TASK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Onboarding Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONBOARDING_TASK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ezProcess.impl.OnboardingTrainingTaskImpl <em>Onboarding Training Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ezProcess.impl.OnboardingTrainingTaskImpl
	 * @see ezProcess.impl.EzProcessPackageImpl#getOnboardingTrainingTask()
	 * @generated
	 */
	int ONBOARDING_TRAINING_TASK = 19;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONBOARDING_TRAINING_TASK__LABEL = ONBOARDING_TASK__LABEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONBOARDING_TRAINING_TASK__NAME = ONBOARDING_TASK__NAME;

	/**
	 * The feature id for the '<em><b>Is About</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONBOARDING_TRAINING_TASK__IS_ABOUT = ONBOARDING_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Onboarding Training Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONBOARDING_TRAINING_TASK_FEATURE_COUNT = ONBOARDING_TASK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Onboarding Training Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONBOARDING_TRAINING_TASK_OPERATION_COUNT = ONBOARDING_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ezProcess.impl.OnboardingSetupTaskImpl <em>Onboarding Setup Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ezProcess.impl.OnboardingSetupTaskImpl
	 * @see ezProcess.impl.EzProcessPackageImpl#getOnboardingSetupTask()
	 * @generated
	 */
	int ONBOARDING_SETUP_TASK = 20;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONBOARDING_SETUP_TASK__LABEL = ONBOARDING_TASK__LABEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONBOARDING_SETUP_TASK__NAME = ONBOARDING_TASK__NAME;

	/**
	 * The feature id for the '<em><b>Is About</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONBOARDING_SETUP_TASK__IS_ABOUT = ONBOARDING_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Onboarding Setup Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONBOARDING_SETUP_TASK_FEATURE_COUNT = ONBOARDING_TASK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Onboarding Setup Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONBOARDING_SETUP_TASK_OPERATION_COUNT = ONBOARDING_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ezProcess.impl.NumberFieldImpl <em>Number Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ezProcess.impl.NumberFieldImpl
	 * @see ezProcess.impl.EzProcessPackageImpl#getNumberField()
	 * @generated
	 */
	int NUMBER_FIELD = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FIELD__NAME = INPUT_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FIELD__REQUIRED = INPUT_FIELD__REQUIRED;

	/**
	 * The feature id for the '<em><b>Proof</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FIELD__PROOF = INPUT_FIELD__PROOF;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FIELD__LABEL = INPUT_FIELD__LABEL;

	/**
	 * The feature id for the '<em><b>Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FIELD__RATING = INPUT_FIELD__RATING;

	/**
	 * The feature id for the '<em><b>Has Rating</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FIELD__HAS_RATING = INPUT_FIELD__HAS_RATING;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FIELD__MIN = INPUT_FIELD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FIELD__MAX = INPUT_FIELD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Number Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FIELD_FEATURE_COUNT = INPUT_FIELD_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Number Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FIELD_OPERATION_COUNT = INPUT_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ezProcess.impl.DateImpl <em>Date</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ezProcess.impl.DateImpl
	 * @see ezProcess.impl.EzProcessPackageImpl#getDate()
	 * @generated
	 */
	int DATE = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__NAME = INITIAL_VALUE__NAME;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__REQUIRED = INITIAL_VALUE__REQUIRED;

	/**
	 * The feature id for the '<em><b>Proof</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__PROOF = INITIAL_VALUE__PROOF;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__LABEL = INITIAL_VALUE__LABEL;

	/**
	 * The feature id for the '<em><b>Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__RATING = INITIAL_VALUE__RATING;

	/**
	 * The feature id for the '<em><b>Has Rating</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__HAS_RATING = INITIAL_VALUE__HAS_RATING;

	/**
	 * The number of structural features of the '<em>Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FEATURE_COUNT = INITIAL_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_OPERATION_COUNT = INITIAL_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ezProcess.impl.EmailFieldImpl <em>Email Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ezProcess.impl.EmailFieldImpl
	 * @see ezProcess.impl.EzProcessPackageImpl#getEmailField()
	 * @generated
	 */
	int EMAIL_FIELD = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_FIELD__NAME = INPUT_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_FIELD__REQUIRED = INPUT_FIELD__REQUIRED;

	/**
	 * The feature id for the '<em><b>Proof</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_FIELD__PROOF = INPUT_FIELD__PROOF;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_FIELD__LABEL = INPUT_FIELD__LABEL;

	/**
	 * The feature id for the '<em><b>Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_FIELD__RATING = INPUT_FIELD__RATING;

	/**
	 * The feature id for the '<em><b>Has Rating</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_FIELD__HAS_RATING = INPUT_FIELD__HAS_RATING;

	/**
	 * The feature id for the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_FIELD__PLACEHOLDER = INPUT_FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Email Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_FIELD_FEATURE_COUNT = INPUT_FIELD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Email Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_FIELD_OPERATION_COUNT = INPUT_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ezProcess.impl.FileFieldImpl <em>File Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ezProcess.impl.FileFieldImpl
	 * @see ezProcess.impl.EzProcessPackageImpl#getFileField()
	 * @generated
	 */
	int FILE_FIELD = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FIELD__NAME = INPUT_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FIELD__REQUIRED = INPUT_FIELD__REQUIRED;

	/**
	 * The feature id for the '<em><b>Proof</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FIELD__PROOF = INPUT_FIELD__PROOF;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FIELD__LABEL = INPUT_FIELD__LABEL;

	/**
	 * The feature id for the '<em><b>Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FIELD__RATING = INPUT_FIELD__RATING;

	/**
	 * The feature id for the '<em><b>Has Rating</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FIELD__HAS_RATING = INPUT_FIELD__HAS_RATING;

	/**
	 * The number of structural features of the '<em>File Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FIELD_FEATURE_COUNT = INPUT_FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>File Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FIELD_OPERATION_COUNT = INPUT_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ezProcess.impl.RatingImpl <em>Rating</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ezProcess.impl.RatingImpl
	 * @see ezProcess.impl.EzProcessPackageImpl#getRating()
	 * @generated
	 */
	int RATING = 27;

	/**
	 * The feature id for the '<em><b>Tooltip Array</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING__TOOLTIP_ARRAY = 0;

	/**
	 * The number of structural features of the '<em>Rating</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Rating</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ezProcess.impl.CandidateEmailFieldImpl <em>Candidate Email Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ezProcess.impl.CandidateEmailFieldImpl
	 * @see ezProcess.impl.EzProcessPackageImpl#getCandidateEmailField()
	 * @generated
	 */
	int CANDIDATE_EMAIL_FIELD = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANDIDATE_EMAIL_FIELD__NAME = EMAIL_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANDIDATE_EMAIL_FIELD__REQUIRED = EMAIL_FIELD__REQUIRED;

	/**
	 * The feature id for the '<em><b>Proof</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANDIDATE_EMAIL_FIELD__PROOF = EMAIL_FIELD__PROOF;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANDIDATE_EMAIL_FIELD__LABEL = EMAIL_FIELD__LABEL;

	/**
	 * The feature id for the '<em><b>Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANDIDATE_EMAIL_FIELD__RATING = EMAIL_FIELD__RATING;

	/**
	 * The feature id for the '<em><b>Has Rating</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANDIDATE_EMAIL_FIELD__HAS_RATING = EMAIL_FIELD__HAS_RATING;

	/**
	 * The feature id for the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANDIDATE_EMAIL_FIELD__PLACEHOLDER = EMAIL_FIELD__PLACEHOLDER;

	/**
	 * The number of structural features of the '<em>Candidate Email Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANDIDATE_EMAIL_FIELD_FEATURE_COUNT = EMAIL_FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Candidate Email Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANDIDATE_EMAIL_FIELD_OPERATION_COUNT = EMAIL_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ezProcess.CandidateFieldType <em>Candidate Field Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ezProcess.CandidateFieldType
	 * @see ezProcess.impl.EzProcessPackageImpl#getCandidateFieldType()
	 * @generated
	 */
	int CANDIDATE_FIELD_TYPE = 29;

	/**
	 * Returns the meta object for class '{@link ezProcess.App <em>App</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>App</em>'.
	 * @see ezProcess.App
	 * @generated
	 */
	EClass getApp();

	/**
	 * Returns the meta object for the containment reference list '{@link ezProcess.App#getHasEmployee <em>Has Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Employee</em>'.
	 * @see ezProcess.App#getHasEmployee()
	 * @see #getApp()
	 * @generated
	 */
	EReference getApp_HasEmployee();

	/**
	 * Returns the meta object for the containment reference list '{@link ezProcess.App#getHasProcess <em>Has Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Process</em>'.
	 * @see ezProcess.App#getHasProcess()
	 * @see #getApp()
	 * @generated
	 */
	EReference getApp_HasProcess();

	/**
	 * Returns the meta object for class '{@link ezProcess.Employee <em>Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Employee</em>'.
	 * @see ezProcess.Employee
	 * @generated
	 */
	EClass getEmployee();

	/**
	 * Returns the meta object for the attribute '{@link ezProcess.Employee#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see ezProcess.Employee#getFirstName()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link ezProcess.Employee#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see ezProcess.Employee#getLastName()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_LastName();

	/**
	 * Returns the meta object for the attribute '{@link ezProcess.Employee#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see ezProcess.Employee#getEmail()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_Email();

	/**
	 * Returns the meta object for the attribute '{@link ezProcess.Employee#getUserName <em>User Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Name</em>'.
	 * @see ezProcess.Employee#getUserName()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_UserName();

	/**
	 * Returns the meta object for the attribute '{@link ezProcess.Employee#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see ezProcess.Employee#getPassword()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_Password();

	/**
	 * Returns the meta object for the attribute '{@link ezProcess.Employee#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see ezProcess.Employee#getId()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_Id();

	/**
	 * Returns the meta object for the reference list '{@link ezProcess.Employee#getAssignedProcess <em>Assigned Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assigned Process</em>'.
	 * @see ezProcess.Employee#getAssignedProcess()
	 * @see #getEmployee()
	 * @generated
	 */
	EReference getEmployee_AssignedProcess();

	/**
	 * Returns the meta object for class '{@link ezProcess.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see ezProcess.Process
	 * @generated
	 */
	EClass getProcess();

	/**
	 * Returns the meta object for the attribute '{@link ezProcess.Process#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ezProcess.Process#getName()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link ezProcess.Process#getHasPage <em>Has Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Page</em>'.
	 * @see ezProcess.Process#getHasPage()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_HasPage();

	/**
	 * Returns the meta object for class '{@link ezProcess.JobDescription <em>Job Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job Description</em>'.
	 * @see ezProcess.JobDescription
	 * @generated
	 */
	EClass getJobDescription();

	/**
	 * Returns the meta object for class '{@link ezProcess.Screening <em>Screening</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Screening</em>'.
	 * @see ezProcess.Screening
	 * @generated
	 */
	EClass getScreening();

	/**
	 * Returns the meta object for the reference '{@link ezProcess.Screening#getHasJobDescription <em>Has Job Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Job Description</em>'.
	 * @see ezProcess.Screening#getHasJobDescription()
	 * @see #getScreening()
	 * @generated
	 */
	EReference getScreening_HasJobDescription();

	/**
	 * Returns the meta object for class '{@link ezProcess.Onboarding <em>Onboarding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Onboarding</em>'.
	 * @see ezProcess.Onboarding
	 * @generated
	 */
	EClass getOnboarding();

	/**
	 * Returns the meta object for the reference '{@link ezProcess.Onboarding#getHasScreening <em>Has Screening</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Screening</em>'.
	 * @see ezProcess.Onboarding#getHasScreening()
	 * @see #getOnboarding()
	 * @generated
	 */
	EReference getOnboarding_HasScreening();

	/**
	 * Returns the meta object for class '{@link ezProcess.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see ezProcess.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for the attribute '{@link ezProcess.Page#isFinal <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final</em>'.
	 * @see ezProcess.Page#isFinal()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Final();

	/**
	 * Returns the meta object for the attribute '{@link ezProcess.Page#isFirst <em>First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First</em>'.
	 * @see ezProcess.Page#isFirst()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_First();

	/**
	 * Returns the meta object for the attribute '{@link ezProcess.Page#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header</em>'.
	 * @see ezProcess.Page#getHeader()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Header();

	/**
	 * Returns the meta object for the attribute '{@link ezProcess.Page#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ezProcess.Page#getDescription()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link ezProcess.Page#getHasInitialvalue <em>Has Initialvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Initialvalue</em>'.
	 * @see ezProcess.Page#getHasInitialvalue()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_HasInitialvalue();

	/**
	 * Returns the meta object for the containment reference list '{@link ezProcess.Page#getHasQuestion <em>Has Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Question</em>'.
	 * @see ezProcess.Page#getHasQuestion()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_HasQuestion();

	/**
	 * Returns the meta object for the containment reference list '{@link ezProcess.Page#getHasOnboardingTask <em>Has Onboarding Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Onboarding Task</em>'.
	 * @see ezProcess.Page#getHasOnboardingTask()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_HasOnboardingTask();

	/**
	 * Returns the meta object for class '{@link ezProcess.InitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial Value</em>'.
	 * @see ezProcess.InitialValue
	 * @generated
	 */
	EClass getInitialValue();

	/**
	 * Returns the meta object for the attribute '{@link ezProcess.InitialValue#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ezProcess.InitialValue#getName()
	 * @see #getInitialValue()
	 * @generated
	 */
	EAttribute getInitialValue_Name();

	/**
	 * Returns the meta object for the attribute '{@link ezProcess.InitialValue#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see ezProcess.InitialValue#isRequired()
	 * @see #getInitialValue()
	 * @generated
	 */
	EAttribute getInitialValue_Required();

	/**
	 * Returns the meta object for the attribute '{@link ezProcess.InitialValue#isProof <em>Proof</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Proof</em>'.
	 * @see ezProcess.InitialValue#isProof()
	 * @see #getInitialValue()
	 * @generated
	 */
	EAttribute getInitialValue_Proof();

	/**
	 * Returns the meta object for the attribute '{@link ezProcess.InitialValue#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see ezProcess.InitialValue#getLabel()
	 * @see #getInitialValue()
	 * @generated
	 */
	EAttribute getInitialValue_Label();

	/**
	 * Returns the meta object for the attribute '{@link ezProcess.InitialValue#isRating <em>Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rating</em>'.
	 * @see ezProcess.InitialValue#isRating()
	 * @see #getInitialValue()
	 * @generated
	 */
	EAttribute getInitialValue_Rating();

	/**
	 * Returns the meta object for the containment reference list '{@link ezProcess.InitialValue#getHasRating <em>Has Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Rating</em>'.
	 * @see ezProcess.InitialValue#getHasRating()
	 * @see #getInitialValue()
	 * @generated
	 */
	EReference getInitialValue_HasRating();

	/**
	 * Returns the meta object for class '{@link ezProcess.FreeTextArea <em>Free Text Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Free Text Area</em>'.
	 * @see ezProcess.FreeTextArea
	 * @generated
	 */
	EClass getFreeTextArea();

	/**
	 * Returns the meta object for the attribute '{@link ezProcess.FreeTextArea#getPlaceholder <em>Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Placeholder</em>'.
	 * @see ezProcess.FreeTextArea#getPlaceholder()
	 * @see #getFreeTextArea()
	 * @generated
	 */
	EAttribute getFreeTextArea_Placeholder();

	/**
	 * Returns the meta object for class '{@link ezProcess.InputField <em>Input Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Field</em>'.
	 * @see ezProcess.InputField
	 * @generated
	 */
	EClass getInputField();

	/**
	 * Returns the meta object for class '{@link ezProcess.CandidateTextField <em>Candidate Text Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Candidate Text Field</em>'.
	 * @see ezProcess.CandidateTextField
	 * @generated
	 */
	EClass getCandidateTextField();

	/**
	 * Returns the meta object for the attribute '{@link ezProcess.CandidateTextField#getCandidateField <em>Candidate Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Candidate Field</em>'.
	 * @see ezProcess.CandidateTextField#getCandidateField()
	 * @see #getCandidateTextField()
	 * @generated
	 */
	EAttribute getCandidateTextField_CandidateField();

	/**
	 * Returns the meta object for class '{@link ezProcess.MultipleOptions <em>Multiple Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiple Options</em>'.
	 * @see ezProcess.MultipleOptions
	 * @generated
	 */
	EClass getMultipleOptions();

	/**
	 * Returns the meta object for the attribute '{@link ezProcess.MultipleOptions#getOptionVarName <em>Option Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Option Var Name</em>'.
	 * @see ezProcess.MultipleOptions#getOptionVarName()
	 * @see #getMultipleOptions()
	 * @generated
	 */
	EAttribute getMultipleOptions_OptionVarName();

	/**
	 * Returns the meta object for the containment reference list '{@link ezProcess.MultipleOptions#getHasOption <em>Has Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Option</em>'.
	 * @see ezProcess.MultipleOptions#getHasOption()
	 * @see #getMultipleOptions()
	 * @generated
	 */
	EReference getMultipleOptions_HasOption();

	/**
	 * Returns the meta object for class '{@link ezProcess.SingleChoiceFromList <em>Single Choice From List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Choice From List</em>'.
	 * @see ezProcess.SingleChoiceFromList
	 * @generated
	 */
	EClass getSingleChoiceFromList();

	/**
	 * Returns the meta object for class '{@link ezProcess.MultipleChoiceFromList <em>Multiple Choice From List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiple Choice From List</em>'.
	 * @see ezProcess.MultipleChoiceFromList
	 * @generated
	 */
	EClass getMultipleChoiceFromList();

	/**
	 * Returns the meta object for class '{@link ezProcess.SingleChoiceFromDropDownList <em>Single Choice From Drop Down List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Choice From Drop Down List</em>'.
	 * @see ezProcess.SingleChoiceFromDropDownList
	 * @generated
	 */
	EClass getSingleChoiceFromDropDownList();

	/**
	 * Returns the meta object for class '{@link ezProcess.Option <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option</em>'.
	 * @see ezProcess.Option
	 * @generated
	 */
	EClass getOption();

	/**
	 * Returns the meta object for the attribute '{@link ezProcess.Option#getOptionValue <em>Option Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Option Value</em>'.
	 * @see ezProcess.Option#getOptionValue()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_OptionValue();

	/**
	 * Returns the meta object for the attribute '{@link ezProcess.Option#getOptionLabel <em>Option Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Option Label</em>'.
	 * @see ezProcess.Option#getOptionLabel()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_OptionLabel();

	/**
	 * Returns the meta object for the containment reference list '{@link ezProcess.Option#getHasOptionRating <em>Has Option Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Option Rating</em>'.
	 * @see ezProcess.Option#getHasOptionRating()
	 * @see #getOption()
	 * @generated
	 */
	EReference getOption_HasOptionRating();

	/**
	 * Returns the meta object for the attribute list '{@link ezProcess.Option#getSetupActions <em>Setup Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Setup Actions</em>'.
	 * @see ezProcess.Option#getSetupActions()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_SetupActions();

	/**
	 * Returns the meta object for class '{@link ezProcess.OptionRating <em>Option Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option Rating</em>'.
	 * @see ezProcess.OptionRating
	 * @generated
	 */
	EClass getOptionRating();

	/**
	 * Returns the meta object for the attribute list '{@link ezProcess.OptionRating#getTooltipArray <em>Tooltip Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Tooltip Array</em>'.
	 * @see ezProcess.OptionRating#getTooltipArray()
	 * @see #getOptionRating()
	 * @generated
	 */
	EAttribute getOptionRating_TooltipArray();

	/**
	 * Returns the meta object for the attribute '{@link ezProcess.OptionRating#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see ezProcess.OptionRating#getID()
	 * @see #getOptionRating()
	 * @generated
	 */
	EAttribute getOptionRating_ID();

	/**
	 * Returns the meta object for the containment reference list '{@link ezProcess.OptionRating#getHasThreshold <em>Has Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Threshold</em>'.
	 * @see ezProcess.OptionRating#getHasThreshold()
	 * @see #getOptionRating()
	 * @generated
	 */
	EReference getOptionRating_HasThreshold();

	/**
	 * Returns the meta object for the reference '{@link ezProcess.OptionRating#getIsAbout <em>Is About</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is About</em>'.
	 * @see ezProcess.OptionRating#getIsAbout()
	 * @see #getOptionRating()
	 * @generated
	 */
	EReference getOptionRating_IsAbout();

	/**
	 * Returns the meta object for class '{@link ezProcess.OptionThreshold <em>Option Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option Threshold</em>'.
	 * @see ezProcess.OptionThreshold
	 * @generated
	 */
	EClass getOptionThreshold();

	/**
	 * Returns the meta object for the attribute '{@link ezProcess.OptionThreshold#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see ezProcess.OptionThreshold#getMin()
	 * @see #getOptionThreshold()
	 * @generated
	 */
	EAttribute getOptionThreshold_Min();

	/**
	 * Returns the meta object for the attribute '{@link ezProcess.OptionThreshold#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see ezProcess.OptionThreshold#getMax()
	 * @see #getOptionThreshold()
	 * @generated
	 */
	EAttribute getOptionThreshold_Max();

	/**
	 * Returns the meta object for the attribute list '{@link ezProcess.OptionThreshold#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Text</em>'.
	 * @see ezProcess.OptionThreshold#getText()
	 * @see #getOptionThreshold()
	 * @generated
	 */
	EAttribute getOptionThreshold_Text();

	/**
	 * Returns the meta object for class '{@link ezProcess.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question</em>'.
	 * @see ezProcess.Question
	 * @generated
	 */
	EClass getQuestion();

	/**
	 * Returns the meta object for the attribute '{@link ezProcess.Question#getQuestion <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Question</em>'.
	 * @see ezProcess.Question#getQuestion()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_Question();

	/**
	 * Returns the meta object for the reference '{@link ezProcess.Question#getIsAbout <em>Is About</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is About</em>'.
	 * @see ezProcess.Question#getIsAbout()
	 * @see #getQuestion()
	 * @generated
	 */
	EReference getQuestion_IsAbout();

	/**
	 * Returns the meta object for the attribute '{@link ezProcess.Question#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see ezProcess.Question#getID()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_ID();

	/**
	 * Returns the meta object for class '{@link ezProcess.OnboardingTrainingTask <em>Onboarding Training Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Onboarding Training Task</em>'.
	 * @see ezProcess.OnboardingTrainingTask
	 * @generated
	 */
	EClass getOnboardingTrainingTask();

	/**
	 * Returns the meta object for the reference '{@link ezProcess.OnboardingTrainingTask#getIsAbout <em>Is About</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is About</em>'.
	 * @see ezProcess.OnboardingTrainingTask#getIsAbout()
	 * @see #getOnboardingTrainingTask()
	 * @generated
	 */
	EReference getOnboardingTrainingTask_IsAbout();

	/**
	 * Returns the meta object for class '{@link ezProcess.OnboardingSetupTask <em>Onboarding Setup Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Onboarding Setup Task</em>'.
	 * @see ezProcess.OnboardingSetupTask
	 * @generated
	 */
	EClass getOnboardingSetupTask();

	/**
	 * Returns the meta object for the reference '{@link ezProcess.OnboardingSetupTask#getIsAbout <em>Is About</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is About</em>'.
	 * @see ezProcess.OnboardingSetupTask#getIsAbout()
	 * @see #getOnboardingSetupTask()
	 * @generated
	 */
	EReference getOnboardingSetupTask_IsAbout();

	/**
	 * Returns the meta object for class '{@link ezProcess.OnboardingTask <em>Onboarding Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Onboarding Task</em>'.
	 * @see ezProcess.OnboardingTask
	 * @generated
	 */
	EClass getOnboardingTask();

	/**
	 * Returns the meta object for the attribute '{@link ezProcess.OnboardingTask#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see ezProcess.OnboardingTask#getLabel()
	 * @see #getOnboardingTask()
	 * @generated
	 */
	EAttribute getOnboardingTask_Label();

	/**
	 * Returns the meta object for the attribute '{@link ezProcess.OnboardingTask#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ezProcess.OnboardingTask#getName()
	 * @see #getOnboardingTask()
	 * @generated
	 */
	EAttribute getOnboardingTask_Name();

	/**
	 * Returns the meta object for class '{@link ezProcess.TextField <em>Text Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Field</em>'.
	 * @see ezProcess.TextField
	 * @generated
	 */
	EClass getTextField();

	/**
	 * Returns the meta object for the attribute '{@link ezProcess.TextField#getPlaceholder <em>Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Placeholder</em>'.
	 * @see ezProcess.TextField#getPlaceholder()
	 * @see #getTextField()
	 * @generated
	 */
	EAttribute getTextField_Placeholder();

	/**
	 * Returns the meta object for class '{@link ezProcess.NumberField <em>Number Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Field</em>'.
	 * @see ezProcess.NumberField
	 * @generated
	 */
	EClass getNumberField();

	/**
	 * Returns the meta object for the attribute '{@link ezProcess.NumberField#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see ezProcess.NumberField#getMin()
	 * @see #getNumberField()
	 * @generated
	 */
	EAttribute getNumberField_Min();

	/**
	 * Returns the meta object for the attribute '{@link ezProcess.NumberField#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see ezProcess.NumberField#getMax()
	 * @see #getNumberField()
	 * @generated
	 */
	EAttribute getNumberField_Max();

	/**
	 * Returns the meta object for class '{@link ezProcess.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date</em>'.
	 * @see ezProcess.Date
	 * @generated
	 */
	EClass getDate();

	/**
	 * Returns the meta object for class '{@link ezProcess.EmailField <em>Email Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Email Field</em>'.
	 * @see ezProcess.EmailField
	 * @generated
	 */
	EClass getEmailField();

	/**
	 * Returns the meta object for the attribute '{@link ezProcess.EmailField#getPlaceholder <em>Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Placeholder</em>'.
	 * @see ezProcess.EmailField#getPlaceholder()
	 * @see #getEmailField()
	 * @generated
	 */
	EAttribute getEmailField_Placeholder();

	/**
	 * Returns the meta object for class '{@link ezProcess.FileField <em>File Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Field</em>'.
	 * @see ezProcess.FileField
	 * @generated
	 */
	EClass getFileField();

	/**
	 * Returns the meta object for class '{@link ezProcess.Rating <em>Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rating</em>'.
	 * @see ezProcess.Rating
	 * @generated
	 */
	EClass getRating();

	/**
	 * Returns the meta object for the attribute list '{@link ezProcess.Rating#getTooltipArray <em>Tooltip Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Tooltip Array</em>'.
	 * @see ezProcess.Rating#getTooltipArray()
	 * @see #getRating()
	 * @generated
	 */
	EAttribute getRating_TooltipArray();

	/**
	 * Returns the meta object for class '{@link ezProcess.CandidateEmailField <em>Candidate Email Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Candidate Email Field</em>'.
	 * @see ezProcess.CandidateEmailField
	 * @generated
	 */
	EClass getCandidateEmailField();

	/**
	 * Returns the meta object for enum '{@link ezProcess.CandidateFieldType <em>Candidate Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Candidate Field Type</em>'.
	 * @see ezProcess.CandidateFieldType
	 * @generated
	 */
	EEnum getCandidateFieldType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EzProcessFactory getEzProcessFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ezProcess.impl.AppImpl <em>App</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ezProcess.impl.AppImpl
		 * @see ezProcess.impl.EzProcessPackageImpl#getApp()
		 * @generated
		 */
		EClass APP = eINSTANCE.getApp();

		/**
		 * The meta object literal for the '<em><b>Has Employee</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP__HAS_EMPLOYEE = eINSTANCE.getApp_HasEmployee();

		/**
		 * The meta object literal for the '<em><b>Has Process</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP__HAS_PROCESS = eINSTANCE.getApp_HasProcess();

		/**
		 * The meta object literal for the '{@link ezProcess.impl.EmployeeImpl <em>Employee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ezProcess.impl.EmployeeImpl
		 * @see ezProcess.impl.EzProcessPackageImpl#getEmployee()
		 * @generated
		 */
		EClass EMPLOYEE = eINSTANCE.getEmployee();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__FIRST_NAME = eINSTANCE.getEmployee_FirstName();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__LAST_NAME = eINSTANCE.getEmployee_LastName();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__EMAIL = eINSTANCE.getEmployee_Email();

		/**
		 * The meta object literal for the '<em><b>User Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__USER_NAME = eINSTANCE.getEmployee_UserName();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__PASSWORD = eINSTANCE.getEmployee_Password();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__ID = eINSTANCE.getEmployee_Id();

		/**
		 * The meta object literal for the '<em><b>Assigned Process</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYEE__ASSIGNED_PROCESS = eINSTANCE.getEmployee_AssignedProcess();

		/**
		 * The meta object literal for the '{@link ezProcess.impl.ProcessImpl <em>Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ezProcess.impl.ProcessImpl
		 * @see ezProcess.impl.EzProcessPackageImpl#getProcess()
		 * @generated
		 */
		EClass PROCESS = eINSTANCE.getProcess();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__NAME = eINSTANCE.getProcess_Name();

		/**
		 * The meta object literal for the '<em><b>Has Page</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__HAS_PAGE = eINSTANCE.getProcess_HasPage();

		/**
		 * The meta object literal for the '{@link ezProcess.impl.JobDescriptionImpl <em>Job Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ezProcess.impl.JobDescriptionImpl
		 * @see ezProcess.impl.EzProcessPackageImpl#getJobDescription()
		 * @generated
		 */
		EClass JOB_DESCRIPTION = eINSTANCE.getJobDescription();

		/**
		 * The meta object literal for the '{@link ezProcess.impl.ScreeningImpl <em>Screening</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ezProcess.impl.ScreeningImpl
		 * @see ezProcess.impl.EzProcessPackageImpl#getScreening()
		 * @generated
		 */
		EClass SCREENING = eINSTANCE.getScreening();

		/**
		 * The meta object literal for the '<em><b>Has Job Description</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCREENING__HAS_JOB_DESCRIPTION = eINSTANCE.getScreening_HasJobDescription();

		/**
		 * The meta object literal for the '{@link ezProcess.impl.OnboardingImpl <em>Onboarding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ezProcess.impl.OnboardingImpl
		 * @see ezProcess.impl.EzProcessPackageImpl#getOnboarding()
		 * @generated
		 */
		EClass ONBOARDING = eINSTANCE.getOnboarding();

		/**
		 * The meta object literal for the '<em><b>Has Screening</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONBOARDING__HAS_SCREENING = eINSTANCE.getOnboarding_HasScreening();

		/**
		 * The meta object literal for the '{@link ezProcess.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ezProcess.impl.PageImpl
		 * @see ezProcess.impl.EzProcessPackageImpl#getPage()
		 * @generated
		 */
		EClass PAGE = eINSTANCE.getPage();

		/**
		 * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__FINAL = eINSTANCE.getPage_Final();

		/**
		 * The meta object literal for the '<em><b>First</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__FIRST = eINSTANCE.getPage_First();

		/**
		 * The meta object literal for the '<em><b>Header</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__HEADER = eINSTANCE.getPage_Header();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__DESCRIPTION = eINSTANCE.getPage_Description();

		/**
		 * The meta object literal for the '<em><b>Has Initialvalue</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__HAS_INITIALVALUE = eINSTANCE.getPage_HasInitialvalue();

		/**
		 * The meta object literal for the '<em><b>Has Question</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__HAS_QUESTION = eINSTANCE.getPage_HasQuestion();

		/**
		 * The meta object literal for the '<em><b>Has Onboarding Task</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__HAS_ONBOARDING_TASK = eINSTANCE.getPage_HasOnboardingTask();

		/**
		 * The meta object literal for the '{@link ezProcess.impl.InitialValueImpl <em>Initial Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ezProcess.impl.InitialValueImpl
		 * @see ezProcess.impl.EzProcessPackageImpl#getInitialValue()
		 * @generated
		 */
		EClass INITIAL_VALUE = eINSTANCE.getInitialValue();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INITIAL_VALUE__NAME = eINSTANCE.getInitialValue_Name();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INITIAL_VALUE__REQUIRED = eINSTANCE.getInitialValue_Required();

		/**
		 * The meta object literal for the '<em><b>Proof</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INITIAL_VALUE__PROOF = eINSTANCE.getInitialValue_Proof();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INITIAL_VALUE__LABEL = eINSTANCE.getInitialValue_Label();

		/**
		 * The meta object literal for the '<em><b>Rating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INITIAL_VALUE__RATING = eINSTANCE.getInitialValue_Rating();

		/**
		 * The meta object literal for the '<em><b>Has Rating</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_VALUE__HAS_RATING = eINSTANCE.getInitialValue_HasRating();

		/**
		 * The meta object literal for the '{@link ezProcess.impl.FreeTextAreaImpl <em>Free Text Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ezProcess.impl.FreeTextAreaImpl
		 * @see ezProcess.impl.EzProcessPackageImpl#getFreeTextArea()
		 * @generated
		 */
		EClass FREE_TEXT_AREA = eINSTANCE.getFreeTextArea();

		/**
		 * The meta object literal for the '<em><b>Placeholder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FREE_TEXT_AREA__PLACEHOLDER = eINSTANCE.getFreeTextArea_Placeholder();

		/**
		 * The meta object literal for the '{@link ezProcess.impl.InputFieldImpl <em>Input Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ezProcess.impl.InputFieldImpl
		 * @see ezProcess.impl.EzProcessPackageImpl#getInputField()
		 * @generated
		 */
		EClass INPUT_FIELD = eINSTANCE.getInputField();

		/**
		 * The meta object literal for the '{@link ezProcess.impl.CandidateTextFieldImpl <em>Candidate Text Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ezProcess.impl.CandidateTextFieldImpl
		 * @see ezProcess.impl.EzProcessPackageImpl#getCandidateTextField()
		 * @generated
		 */
		EClass CANDIDATE_TEXT_FIELD = eINSTANCE.getCandidateTextField();

		/**
		 * The meta object literal for the '<em><b>Candidate Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CANDIDATE_TEXT_FIELD__CANDIDATE_FIELD = eINSTANCE.getCandidateTextField_CandidateField();

		/**
		 * The meta object literal for the '{@link ezProcess.impl.MultipleOptionsImpl <em>Multiple Options</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ezProcess.impl.MultipleOptionsImpl
		 * @see ezProcess.impl.EzProcessPackageImpl#getMultipleOptions()
		 * @generated
		 */
		EClass MULTIPLE_OPTIONS = eINSTANCE.getMultipleOptions();

		/**
		 * The meta object literal for the '<em><b>Option Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLE_OPTIONS__OPTION_VAR_NAME = eINSTANCE.getMultipleOptions_OptionVarName();

		/**
		 * The meta object literal for the '<em><b>Has Option</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLE_OPTIONS__HAS_OPTION = eINSTANCE.getMultipleOptions_HasOption();

		/**
		 * The meta object literal for the '{@link ezProcess.impl.SingleChoiceFromListImpl <em>Single Choice From List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ezProcess.impl.SingleChoiceFromListImpl
		 * @see ezProcess.impl.EzProcessPackageImpl#getSingleChoiceFromList()
		 * @generated
		 */
		EClass SINGLE_CHOICE_FROM_LIST = eINSTANCE.getSingleChoiceFromList();

		/**
		 * The meta object literal for the '{@link ezProcess.impl.MultipleChoiceFromListImpl <em>Multiple Choice From List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ezProcess.impl.MultipleChoiceFromListImpl
		 * @see ezProcess.impl.EzProcessPackageImpl#getMultipleChoiceFromList()
		 * @generated
		 */
		EClass MULTIPLE_CHOICE_FROM_LIST = eINSTANCE.getMultipleChoiceFromList();

		/**
		 * The meta object literal for the '{@link ezProcess.impl.SingleChoiceFromDropDownListImpl <em>Single Choice From Drop Down List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ezProcess.impl.SingleChoiceFromDropDownListImpl
		 * @see ezProcess.impl.EzProcessPackageImpl#getSingleChoiceFromDropDownList()
		 * @generated
		 */
		EClass SINGLE_CHOICE_FROM_DROP_DOWN_LIST = eINSTANCE.getSingleChoiceFromDropDownList();

		/**
		 * The meta object literal for the '{@link ezProcess.impl.OptionImpl <em>Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ezProcess.impl.OptionImpl
		 * @see ezProcess.impl.EzProcessPackageImpl#getOption()
		 * @generated
		 */
		EClass OPTION = eINSTANCE.getOption();

		/**
		 * The meta object literal for the '<em><b>Option Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION__OPTION_VALUE = eINSTANCE.getOption_OptionValue();

		/**
		 * The meta object literal for the '<em><b>Option Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION__OPTION_LABEL = eINSTANCE.getOption_OptionLabel();

		/**
		 * The meta object literal for the '<em><b>Has Option Rating</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTION__HAS_OPTION_RATING = eINSTANCE.getOption_HasOptionRating();

		/**
		 * The meta object literal for the '<em><b>Setup Actions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION__SETUP_ACTIONS = eINSTANCE.getOption_SetupActions();

		/**
		 * The meta object literal for the '{@link ezProcess.impl.OptionRatingImpl <em>Option Rating</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ezProcess.impl.OptionRatingImpl
		 * @see ezProcess.impl.EzProcessPackageImpl#getOptionRating()
		 * @generated
		 */
		EClass OPTION_RATING = eINSTANCE.getOptionRating();

		/**
		 * The meta object literal for the '<em><b>Tooltip Array</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION_RATING__TOOLTIP_ARRAY = eINSTANCE.getOptionRating_TooltipArray();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION_RATING__ID = eINSTANCE.getOptionRating_ID();

		/**
		 * The meta object literal for the '<em><b>Has Threshold</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTION_RATING__HAS_THRESHOLD = eINSTANCE.getOptionRating_HasThreshold();

		/**
		 * The meta object literal for the '<em><b>Is About</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTION_RATING__IS_ABOUT = eINSTANCE.getOptionRating_IsAbout();

		/**
		 * The meta object literal for the '{@link ezProcess.impl.OptionThresholdImpl <em>Option Threshold</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ezProcess.impl.OptionThresholdImpl
		 * @see ezProcess.impl.EzProcessPackageImpl#getOptionThreshold()
		 * @generated
		 */
		EClass OPTION_THRESHOLD = eINSTANCE.getOptionThreshold();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION_THRESHOLD__MIN = eINSTANCE.getOptionThreshold_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION_THRESHOLD__MAX = eINSTANCE.getOptionThreshold_Max();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION_THRESHOLD__TEXT = eINSTANCE.getOptionThreshold_Text();

		/**
		 * The meta object literal for the '{@link ezProcess.impl.QuestionImpl <em>Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ezProcess.impl.QuestionImpl
		 * @see ezProcess.impl.EzProcessPackageImpl#getQuestion()
		 * @generated
		 */
		EClass QUESTION = eINSTANCE.getQuestion();

		/**
		 * The meta object literal for the '<em><b>Question</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__QUESTION = eINSTANCE.getQuestion_Question();

		/**
		 * The meta object literal for the '<em><b>Is About</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION__IS_ABOUT = eINSTANCE.getQuestion_IsAbout();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__ID = eINSTANCE.getQuestion_ID();

		/**
		 * The meta object literal for the '{@link ezProcess.impl.OnboardingTrainingTaskImpl <em>Onboarding Training Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ezProcess.impl.OnboardingTrainingTaskImpl
		 * @see ezProcess.impl.EzProcessPackageImpl#getOnboardingTrainingTask()
		 * @generated
		 */
		EClass ONBOARDING_TRAINING_TASK = eINSTANCE.getOnboardingTrainingTask();

		/**
		 * The meta object literal for the '<em><b>Is About</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONBOARDING_TRAINING_TASK__IS_ABOUT = eINSTANCE.getOnboardingTrainingTask_IsAbout();

		/**
		 * The meta object literal for the '{@link ezProcess.impl.OnboardingSetupTaskImpl <em>Onboarding Setup Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ezProcess.impl.OnboardingSetupTaskImpl
		 * @see ezProcess.impl.EzProcessPackageImpl#getOnboardingSetupTask()
		 * @generated
		 */
		EClass ONBOARDING_SETUP_TASK = eINSTANCE.getOnboardingSetupTask();

		/**
		 * The meta object literal for the '<em><b>Is About</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONBOARDING_SETUP_TASK__IS_ABOUT = eINSTANCE.getOnboardingSetupTask_IsAbout();

		/**
		 * The meta object literal for the '{@link ezProcess.impl.OnboardingTaskImpl <em>Onboarding Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ezProcess.impl.OnboardingTaskImpl
		 * @see ezProcess.impl.EzProcessPackageImpl#getOnboardingTask()
		 * @generated
		 */
		EClass ONBOARDING_TASK = eINSTANCE.getOnboardingTask();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONBOARDING_TASK__LABEL = eINSTANCE.getOnboardingTask_Label();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONBOARDING_TASK__NAME = eINSTANCE.getOnboardingTask_Name();

		/**
		 * The meta object literal for the '{@link ezProcess.impl.TextFieldImpl <em>Text Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ezProcess.impl.TextFieldImpl
		 * @see ezProcess.impl.EzProcessPackageImpl#getTextField()
		 * @generated
		 */
		EClass TEXT_FIELD = eINSTANCE.getTextField();

		/**
		 * The meta object literal for the '<em><b>Placeholder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_FIELD__PLACEHOLDER = eINSTANCE.getTextField_Placeholder();

		/**
		 * The meta object literal for the '{@link ezProcess.impl.NumberFieldImpl <em>Number Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ezProcess.impl.NumberFieldImpl
		 * @see ezProcess.impl.EzProcessPackageImpl#getNumberField()
		 * @generated
		 */
		EClass NUMBER_FIELD = eINSTANCE.getNumberField();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_FIELD__MIN = eINSTANCE.getNumberField_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_FIELD__MAX = eINSTANCE.getNumberField_Max();

		/**
		 * The meta object literal for the '{@link ezProcess.impl.DateImpl <em>Date</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ezProcess.impl.DateImpl
		 * @see ezProcess.impl.EzProcessPackageImpl#getDate()
		 * @generated
		 */
		EClass DATE = eINSTANCE.getDate();

		/**
		 * The meta object literal for the '{@link ezProcess.impl.EmailFieldImpl <em>Email Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ezProcess.impl.EmailFieldImpl
		 * @see ezProcess.impl.EzProcessPackageImpl#getEmailField()
		 * @generated
		 */
		EClass EMAIL_FIELD = eINSTANCE.getEmailField();

		/**
		 * The meta object literal for the '<em><b>Placeholder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMAIL_FIELD__PLACEHOLDER = eINSTANCE.getEmailField_Placeholder();

		/**
		 * The meta object literal for the '{@link ezProcess.impl.FileFieldImpl <em>File Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ezProcess.impl.FileFieldImpl
		 * @see ezProcess.impl.EzProcessPackageImpl#getFileField()
		 * @generated
		 */
		EClass FILE_FIELD = eINSTANCE.getFileField();

		/**
		 * The meta object literal for the '{@link ezProcess.impl.RatingImpl <em>Rating</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ezProcess.impl.RatingImpl
		 * @see ezProcess.impl.EzProcessPackageImpl#getRating()
		 * @generated
		 */
		EClass RATING = eINSTANCE.getRating();

		/**
		 * The meta object literal for the '<em><b>Tooltip Array</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RATING__TOOLTIP_ARRAY = eINSTANCE.getRating_TooltipArray();

		/**
		 * The meta object literal for the '{@link ezProcess.impl.CandidateEmailFieldImpl <em>Candidate Email Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ezProcess.impl.CandidateEmailFieldImpl
		 * @see ezProcess.impl.EzProcessPackageImpl#getCandidateEmailField()
		 * @generated
		 */
		EClass CANDIDATE_EMAIL_FIELD = eINSTANCE.getCandidateEmailField();

		/**
		 * The meta object literal for the '{@link ezProcess.CandidateFieldType <em>Candidate Field Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ezProcess.CandidateFieldType
		 * @see ezProcess.impl.EzProcessPackageImpl#getCandidateFieldType()
		 * @generated
		 */
		EEnum CANDIDATE_FIELD_TYPE = eINSTANCE.getCandidateFieldType();

	}

} //EzProcessPackage
