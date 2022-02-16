/**
 */
package ezProcess;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Onboarding Training Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ezProcess.OnboardingTrainingTask#getIsAbout <em>Is About</em>}</li>
 * </ul>
 *
 * @see ezProcess.EzProcessPackage#getOnboardingTrainingTask()
 * @model
 * @generated
 */
public interface OnboardingTrainingTask extends OnboardingTask {
	/**
	 * Returns the value of the '<em><b>Is About</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is About</em>' reference.
	 * @see #setIsAbout(Question)
	 * @see ezProcess.EzProcessPackage#getOnboardingTrainingTask_IsAbout()
	 * @model required="true"
	 * @generated
	 */
	Question getIsAbout();

	/**
	 * Sets the value of the '{@link ezProcess.OnboardingTrainingTask#getIsAbout <em>Is About</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is About</em>' reference.
	 * @see #getIsAbout()
	 * @generated
	 */
	void setIsAbout(Question value);

} // OnboardingTrainingTask
