/**
 */
package ezProcess;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Screening</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ezProcess.Screening#getHasJobDescription <em>Has Job Description</em>}</li>
 * </ul>
 *
 * @see ezProcess.EzProcessPackage#getScreening()
 * @model
 * @generated
 */
public interface Screening extends ezProcess.Process {
	/**
	 * Returns the value of the '<em><b>Has Job Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Job Description</em>' reference.
	 * @see #setHasJobDescription(JobDescription)
	 * @see ezProcess.EzProcessPackage#getScreening_HasJobDescription()
	 * @model required="true"
	 * @generated
	 */
	JobDescription getHasJobDescription();

	/**
	 * Sets the value of the '{@link ezProcess.Screening#getHasJobDescription <em>Has Job Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Job Description</em>' reference.
	 * @see #getHasJobDescription()
	 * @generated
	 */
	void setHasJobDescription(JobDescription value);

} // Screening
