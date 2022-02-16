/**
 */
package ezProcess;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Initial Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ezProcess.InitialValue#getName <em>Name</em>}</li>
 *   <li>{@link ezProcess.InitialValue#isRequired <em>Required</em>}</li>
 *   <li>{@link ezProcess.InitialValue#isProof <em>Proof</em>}</li>
 *   <li>{@link ezProcess.InitialValue#getLabel <em>Label</em>}</li>
 *   <li>{@link ezProcess.InitialValue#isRating <em>Rating</em>}</li>
 *   <li>{@link ezProcess.InitialValue#getHasRating <em>Has Rating</em>}</li>
 * </ul>
 *
 * @see ezProcess.EzProcessPackage#getInitialValue()
 * @model abstract="true"
 * @generated
 */
public interface InitialValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ezProcess.EzProcessPackage#getInitialValue_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ezProcess.InitialValue#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' attribute.
	 * @see #setRequired(boolean)
	 * @see ezProcess.EzProcessPackage#getInitialValue_Required()
	 * @model required="true"
	 * @generated
	 */
	boolean isRequired();

	/**
	 * Sets the value of the '{@link ezProcess.InitialValue#isRequired <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' attribute.
	 * @see #isRequired()
	 * @generated
	 */
	void setRequired(boolean value);

	/**
	 * Returns the value of the '<em><b>Proof</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proof</em>' attribute.
	 * @see #setProof(boolean)
	 * @see ezProcess.EzProcessPackage#getInitialValue_Proof()
	 * @model required="true"
	 * @generated
	 */
	boolean isProof();

	/**
	 * Sets the value of the '{@link ezProcess.InitialValue#isProof <em>Proof</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proof</em>' attribute.
	 * @see #isProof()
	 * @generated
	 */
	void setProof(boolean value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see ezProcess.EzProcessPackage#getInitialValue_Label()
	 * @model required="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link ezProcess.InitialValue#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rating</em>' attribute.
	 * @see #setRating(boolean)
	 * @see ezProcess.EzProcessPackage#getInitialValue_Rating()
	 * @model required="true"
	 * @generated
	 */
	boolean isRating();

	/**
	 * Sets the value of the '{@link ezProcess.InitialValue#isRating <em>Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rating</em>' attribute.
	 * @see #isRating()
	 * @generated
	 */
	void setRating(boolean value);

	/**
	 * Returns the value of the '<em><b>Has Rating</b></em>' containment reference list.
	 * The list contents are of type {@link ezProcess.Rating}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Rating</em>' containment reference list.
	 * @see ezProcess.EzProcessPackage#getInitialValue_HasRating()
	 * @model containment="true"
	 * @generated
	 */
	EList<Rating> getHasRating();

} // InitialValue
