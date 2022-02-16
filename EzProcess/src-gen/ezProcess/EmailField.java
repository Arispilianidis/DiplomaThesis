/**
 */
package ezProcess;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Email Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ezProcess.EmailField#getPlaceholder <em>Placeholder</em>}</li>
 * </ul>
 *
 * @see ezProcess.EzProcessPackage#getEmailField()
 * @model
 * @generated
 */
public interface EmailField extends InputField {
	/**
	 * Returns the value of the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placeholder</em>' attribute.
	 * @see #setPlaceholder(String)
	 * @see ezProcess.EzProcessPackage#getEmailField_Placeholder()
	 * @model
	 * @generated
	 */
	String getPlaceholder();

	/**
	 * Sets the value of the '{@link ezProcess.EmailField#getPlaceholder <em>Placeholder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placeholder</em>' attribute.
	 * @see #getPlaceholder()
	 * @generated
	 */
	void setPlaceholder(String value);

} // EmailField
