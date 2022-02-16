/**
 */
package ezProcess.impl;

import ezProcess.EzProcessPackage;
import ezProcess.MultipleOptions;
import ezProcess.OnboardingSetupTask;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Onboarding Setup Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ezProcess.impl.OnboardingSetupTaskImpl#getIsAbout <em>Is About</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OnboardingSetupTaskImpl extends OnboardingTaskImpl implements OnboardingSetupTask {
	/**
	 * The cached value of the '{@link #getIsAbout() <em>Is About</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAbout()
	 * @generated
	 * @ordered
	 */
	protected MultipleOptions isAbout;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OnboardingSetupTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzProcessPackage.Literals.ONBOARDING_SETUP_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleOptions getIsAbout() {
		if (isAbout != null && isAbout.eIsProxy()) {
			InternalEObject oldIsAbout = (InternalEObject) isAbout;
			isAbout = (MultipleOptions) eResolveProxy(oldIsAbout);
			if (isAbout != oldIsAbout) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EzProcessPackage.ONBOARDING_SETUP_TASK__IS_ABOUT, oldIsAbout, isAbout));
			}
		}
		return isAbout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleOptions basicGetIsAbout() {
		return isAbout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAbout(MultipleOptions newIsAbout) {
		MultipleOptions oldIsAbout = isAbout;
		isAbout = newIsAbout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzProcessPackage.ONBOARDING_SETUP_TASK__IS_ABOUT,
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
		case EzProcessPackage.ONBOARDING_SETUP_TASK__IS_ABOUT:
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
		case EzProcessPackage.ONBOARDING_SETUP_TASK__IS_ABOUT:
			setIsAbout((MultipleOptions) newValue);
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
		case EzProcessPackage.ONBOARDING_SETUP_TASK__IS_ABOUT:
			setIsAbout((MultipleOptions) null);
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
		case EzProcessPackage.ONBOARDING_SETUP_TASK__IS_ABOUT:
			return isAbout != null;
		}
		return super.eIsSet(featureID);
	}

} //OnboardingSetupTaskImpl
