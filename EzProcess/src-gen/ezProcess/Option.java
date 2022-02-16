/**
 */
package ezProcess;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ezProcess.Option#getOptionValue <em>Option Value</em>}</li>
 *   <li>{@link ezProcess.Option#getOptionLabel <em>Option Label</em>}</li>
 *   <li>{@link ezProcess.Option#getHasOptionRating <em>Has Option Rating</em>}</li>
 *   <li>{@link ezProcess.Option#getSetupActions <em>Setup Actions</em>}</li>
 * </ul>
 *
 * @see ezProcess.EzProcessPackage#getOption()
 * @model
 * @generated
 */
public interface Option extends EObject {
	/**
	 * Returns the value of the '<em><b>Option Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option Value</em>' attribute.
	 * @see #setOptionValue(String)
	 * @see ezProcess.EzProcessPackage#getOption_OptionValue()
	 * @model required="true"
	 * @generated
	 */
	String getOptionValue();

	/**
	 * Sets the value of the '{@link ezProcess.Option#getOptionValue <em>Option Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Option Value</em>' attribute.
	 * @see #getOptionValue()
	 * @generated
	 */
	void setOptionValue(String value);

	/**
	 * Returns the value of the '<em><b>Option Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option Label</em>' attribute.
	 * @see #setOptionLabel(String)
	 * @see ezProcess.EzProcessPackage#getOption_OptionLabel()
	 * @model required="true"
	 * @generated
	 */
	String getOptionLabel();

	/**
	 * Sets the value of the '{@link ezProcess.Option#getOptionLabel <em>Option Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Option Label</em>' attribute.
	 * @see #getOptionLabel()
	 * @generated
	 */
	void setOptionLabel(String value);

	/**
	 * Returns the value of the '<em><b>Has Option Rating</b></em>' containment reference list.
	 * The list contents are of type {@link ezProcess.OptionRating}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Option Rating</em>' containment reference list.
	 * @see ezProcess.EzProcessPackage#getOption_HasOptionRating()
	 * @model containment="true"
	 * @generated
	 */
	EList<OptionRating> getHasOptionRating();

	/**
	 * Returns the value of the '<em><b>Setup Actions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Setup Actions</em>' attribute list.
	 * @see ezProcess.EzProcessPackage#getOption_SetupActions()
	 * @model
	 * @generated
	 */
	EList<String> getSetupActions();

} // Option
