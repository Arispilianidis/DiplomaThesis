/**
 */
package ezProcess;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ezProcess.Page#isFinal <em>Final</em>}</li>
 *   <li>{@link ezProcess.Page#isFirst <em>First</em>}</li>
 *   <li>{@link ezProcess.Page#getHeader <em>Header</em>}</li>
 *   <li>{@link ezProcess.Page#getDescription <em>Description</em>}</li>
 *   <li>{@link ezProcess.Page#getHasInitialvalue <em>Has Initialvalue</em>}</li>
 *   <li>{@link ezProcess.Page#getHasQuestion <em>Has Question</em>}</li>
 *   <li>{@link ezProcess.Page#getHasOnboardingTask <em>Has Onboarding Task</em>}</li>
 * </ul>
 *
 * @see ezProcess.EzProcessPackage#getPage()
 * @model
 * @generated
 */
public interface Page extends EObject {
	/**
	 * Returns the value of the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final</em>' attribute.
	 * @see #setFinal(boolean)
	 * @see ezProcess.EzProcessPackage#getPage_Final()
	 * @model required="true"
	 * @generated
	 */
	boolean isFinal();

	/**
	 * Sets the value of the '{@link ezProcess.Page#isFinal <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final</em>' attribute.
	 * @see #isFinal()
	 * @generated
	 */
	void setFinal(boolean value);

	/**
	 * Returns the value of the '<em><b>First</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First</em>' attribute.
	 * @see #setFirst(boolean)
	 * @see ezProcess.EzProcessPackage#getPage_First()
	 * @model required="true"
	 * @generated
	 */
	boolean isFirst();

	/**
	 * Sets the value of the '{@link ezProcess.Page#isFirst <em>First</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First</em>' attribute.
	 * @see #isFirst()
	 * @generated
	 */
	void setFirst(boolean value);

	/**
	 * Returns the value of the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header</em>' attribute.
	 * @see #setHeader(String)
	 * @see ezProcess.EzProcessPackage#getPage_Header()
	 * @model
	 * @generated
	 */
	String getHeader();

	/**
	 * Sets the value of the '{@link ezProcess.Page#getHeader <em>Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' attribute.
	 * @see #getHeader()
	 * @generated
	 */
	void setHeader(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see ezProcess.EzProcessPackage#getPage_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link ezProcess.Page#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Has Initialvalue</b></em>' containment reference list.
	 * The list contents are of type {@link ezProcess.InitialValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Initialvalue</em>' containment reference list.
	 * @see ezProcess.EzProcessPackage#getPage_HasInitialvalue()
	 * @model containment="true"
	 * @generated
	 */
	EList<InitialValue> getHasInitialvalue();

	/**
	 * Returns the value of the '<em><b>Has Question</b></em>' containment reference list.
	 * The list contents are of type {@link ezProcess.Question}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Question</em>' containment reference list.
	 * @see ezProcess.EzProcessPackage#getPage_HasQuestion()
	 * @model containment="true"
	 * @generated
	 */
	EList<Question> getHasQuestion();

	/**
	 * Returns the value of the '<em><b>Has Onboarding Task</b></em>' containment reference list.
	 * The list contents are of type {@link ezProcess.OnboardingTask}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Onboarding Task</em>' containment reference list.
	 * @see ezProcess.EzProcessPackage#getPage_HasOnboardingTask()
	 * @model containment="true"
	 * @generated
	 */
	EList<OnboardingTask> getHasOnboardingTask();

} // Page
