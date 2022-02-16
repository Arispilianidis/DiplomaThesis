/**
 */
package ezProcess;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Candidate Text Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ezProcess.CandidateTextField#getCandidateField <em>Candidate Field</em>}</li>
 * </ul>
 *
 * @see ezProcess.EzProcessPackage#getCandidateTextField()
 * @model
 * @generated
 */
public interface CandidateTextField extends TextField {
	/**
	 * Returns the value of the '<em><b>Candidate Field</b></em>' attribute.
	 * The literals are from the enumeration {@link ezProcess.CandidateFieldType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Candidate Field</em>' attribute.
	 * @see ezProcess.CandidateFieldType
	 * @see #setCandidateField(CandidateFieldType)
	 * @see ezProcess.EzProcessPackage#getCandidateTextField_CandidateField()
	 * @model required="true"
	 * @generated
	 */
	CandidateFieldType getCandidateField();

	/**
	 * Sets the value of the '{@link ezProcess.CandidateTextField#getCandidateField <em>Candidate Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Candidate Field</em>' attribute.
	 * @see ezProcess.CandidateFieldType
	 * @see #getCandidateField()
	 * @generated
	 */
	void setCandidateField(CandidateFieldType value);

} // CandidateTextField
