/**
 */
package ezProcess.impl;

import ezProcess.EzProcessPackage;
import ezProcess.OnboardingTrainingTask;
import ezProcess.Question;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Onboarding Training Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ezProcess.impl.OnboardingTrainingTaskImpl#getIsAbout <em>Is About</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OnboardingTrainingTaskImpl extends OnboardingTaskImpl implements OnboardingTrainingTask {
	/**
	 * The cached value of the '{@link #getIsAbout() <em>Is About</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAbout()
	 * @generated
	 * @ordered
	 */
	protected Question isAbout;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OnboardingTrainingTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzProcessPackage.Literals.ONBOARDING_TRAINING_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Question getIsAbout() {
		if (isAbout != null && isAbout.eIsProxy()) {
			InternalEObject oldIsAbout = (InternalEObject) isAbout;
			isAbout = (Question) eResolveProxy(oldIsAbout);
			if (isAbout != oldIsAbout) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EzProcessPackage.ONBOARDING_TRAINING_TASK__IS_ABOUT, oldIsAbout, isAbout));
			}
		}
		return isAbout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Question basicGetIsAbout() {
		return isAbout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAbout(Question newIsAbout) {
		Question oldIsAbout = isAbout;
		isAbout = newIsAbout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzProcessPackage.ONBOARDING_TRAINING_TASK__IS_ABOUT,
					oldIsAbout, isAbout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EzProcessPackage.ONBOARDING_TRAINING_TASK__IS_ABOUT:
			if (resolve)
				return getIsAbout();
			return basicGetIsAbout();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EzProcessPackage.ONBOARDING_TRAINING_TASK__IS_ABOUT:
			setIsAbout((Question) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case EzProcessPackage.ONBOARDING_TRAINING_TASK__IS_ABOUT:
			setIsAbout((Question) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case EzProcessPackage.ONBOARDING_TRAINING_TASK__IS_ABOUT:
			return isAbout != null;
		}
		return super.eIsSet(featureID);
	}

} //OnboardingTrainingTaskImpl
