/**
 */
package ezProcess;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ezProcess.TextField#getPlaceholder <em>Placeholder</em>}</li>
 * </ul>
 *
 * @see ezProcess.EzProcessPackage#getTextField()
 * @model
 * @generated
 */
public interface TextField extends InputField {
	/**
	 * Returns the value of the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placeholder</em>' attribute.
	 * @see #setPlaceholder(String)
	 * @see ezProcess.EzProcessPackage#getTextField_Placeholder()
	 * @model
	 * @generated
	 */
	String getPlaceholder();

	/**
	 * Sets the value of the '{@link ezProcess.TextField#getPlaceholder <em>Placeholder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placeholder</em>' attribute.
	 * @see #getPlaceholder()
	 * @generated
	 */
	void setPlaceholder(String value);

} // TextField
