/**
 */
package ezProcess;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Onboarding Setup Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ezProcess.OnboardingSetupTask#getIsAbout <em>Is About</em>}</li>
 * </ul>
 *
 * @see ezProcess.EzProcessPackage#getOnboardingSetupTask()
 * @model
 * @generated
 */
public interface OnboardingSetupTask extends OnboardingTask {
	/**
	 * Returns the value of the '<em><b>Is About</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is About</em>' reference.
	 * @see #setIsAbout(MultipleOptions)
	 * @see ezProcess.EzProcessPackage#getOnboardingSetupTask_IsAbout()
	 * @model required="true"
	 * @generated
	 */
	MultipleOptions getIsAbout();

	/**
	 * Sets the value of the '{@link ezProcess.OnboardingSetupTask#getIsAbout <em>Is About</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is About</em>' reference.
	 * @see #getIsAbout()
	 * @generated
	 */
	void setIsAbout(MultipleOptions value);

} // OnboardingSetupTask
