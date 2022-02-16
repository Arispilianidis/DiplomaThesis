/**
 */
package ezProcess;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiple Options</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ezProcess.MultipleOptions#getOptionVarName <em>Option Var Name</em>}</li>
 *   <li>{@link ezProcess.MultipleOptions#getHasOption <em>Has Option</em>}</li>
 * </ul>
 *
 * @see ezProcess.EzProcessPackage#getMultipleOptions()
 * @model abstract="true"
 * @generated
 */
public interface MultipleOptions extends InitialValue {
	/**
	 * Returns the value of the '<em><b>Option Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option Var Name</em>' attribute.
	 * @see #setOptionVarName(String)
	 * @see ezProcess.EzProcessPackage#getMultipleOptions_OptionVarName()
	 * @model required="true"
	 * @generated
	 */
	String getOptionVarName();

	/**
	 * Sets the value of the '{@link ezProcess.MultipleOptions#getOptionVarName <em>Option Var Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Option Var Name</em>' attribute.
	 * @see #getOptionVarName()
	 * @generated
	 */
	void setOptionVarName(String value);

	/**
	 * Returns the value of the '<em><b>Has Option</b></em>' containment reference list.
	 * The list contents are of type {@link ezProcess.Option}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Option</em>' containment reference list.
	 * @see ezProcess.EzProcessPackage#getMultipleOptions_HasOption()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<Option> getHasOption();

} // MultipleOptions
