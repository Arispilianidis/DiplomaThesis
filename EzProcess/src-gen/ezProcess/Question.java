/**
 */
package ezProcess;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ezProcess.Question#getQuestion <em>Question</em>}</li>
 *   <li>{@link ezProcess.Question#getIsAbout <em>Is About</em>}</li>
 *   <li>{@link ezProcess.Question#getID <em>ID</em>}</li>
 * </ul>
 *
 * @see ezProcess.EzProcessPackage#getQuestion()
 * @model
 * @generated
 */
public interface Question extends EObject {
	/**
	 * Returns the value of the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question</em>' attribute.
	 * @see #setQuestion(String)
	 * @see ezProcess.EzProcessPackage#getQuestion_Question()
	 * @model required="true"
	 * @generated
	 */
	String getQuestion();

	/**
	 * Sets the value of the '{@link ezProcess.Question#getQuestion <em>Question</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Question</em>' attribute.
	 * @see #getQuestion()
	 * @generated
	 */
	void setQuestion(String value);

	/**
	 * Returns the value of the '<em><b>Is About</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is About</em>' reference.
	 * @see #setIsAbout(MultipleOptions)
	 * @see ezProcess.EzProcessPackage#getQuestion_IsAbout()
	 * @model required="true"
	 * @generated
	 */
	MultipleOptions getIsAbout();

	/**
	 * Sets the value of the '{@link ezProcess.Question#getIsAbout <em>Is About</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is About</em>' reference.
	 * @see #getIsAbout()
	 * @generated
	 */
	void setIsAbout(MultipleOptions value);

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(int)
	 * @see ezProcess.EzProcessPackage#getQuestion_ID()
	 * @model required="true"
	 * @generated
	 */
	int getID();

	/**
	 * Sets the value of the '{@link ezProcess.Question#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(int value);

} // Question
