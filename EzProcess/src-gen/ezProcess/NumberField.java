/**
 */
package ezProcess;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ezProcess.NumberField#getMin <em>Min</em>}</li>
 *   <li>{@link ezProcess.NumberField#getMax <em>Max</em>}</li>
 * </ul>
 *
 * @see ezProcess.EzProcessPackage#getNumberField()
 * @model
 * @generated
 */
public interface NumberField extends InputField {
	/**
	 * Returns the value of the '<em><b>Min</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' attribute.
	 * @see #setMin(int)
	 * @see ezProcess.EzProcessPackage#getNumberField_Min()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getMin();

	/**
	 * Sets the value of the '{@link ezProcess.NumberField#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' attribute.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(int value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' attribute.
	 * The default value is <code>"10000"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' attribute.
	 * @see #setMax(int)
	 * @see ezProcess.EzProcessPackage#getNumberField_Max()
	 * @model default="10000" required="true"
	 * @generated
	 */
	int getMax();

	/**
	 * Sets the value of the '{@link ezProcess.NumberField#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(int value);

} // NumberField
