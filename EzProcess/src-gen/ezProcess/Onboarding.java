/**
 */
package ezProcess;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Onboarding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ezProcess.Onboarding#getHasScreening <em>Has Screening</em>}</li>
 * </ul>
 *
 * @see ezProcess.EzProcessPackage#getOnboarding()
 * @model
 * @generated
 */
public interface Onboarding extends ezProcess.Process {
	/**
	 * Returns the value of the '<em><b>Has Screening</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Screening</em>' reference.
	 * @see #setHasScreening(Screening)
	 * @see ezProcess.EzProcessPackage#getOnboarding_HasScreening()
	 * @model required="true"
	 * @generated
	 */
	Screening getHasScreening();

	/**
	 * Sets the value of the '{@link ezProcess.Onboarding#getHasScreening <em>Has Screening</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Screening</em>' reference.
	 * @see #getHasScreening()
	 * @generated
	 */
	void setHasScreening(Screening value);

} // Onboarding
