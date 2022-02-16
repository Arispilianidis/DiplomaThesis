/**
 */
package ezProcess.impl;

import ezProcess.EzProcessPackage;
import ezProcess.Onboarding;
import ezProcess.Screening;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Onboarding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ezProcess.impl.OnboardingImpl#getHasScreening <em>Has Screening</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OnboardingImpl extends ProcessImpl implements Onboarding {
	/**
	 * The cached value of the '{@link #getHasScreening() <em>Has Screening</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasScreening()
	 * @generated
	 * @ordered
	 */
	protected Screening hasScreening;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OnboardingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzProcessPackage.Literals.ONBOARDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Screening getHasScreening() {
		if (hasScreening != null && hasScreening.eIsProxy()) {
			InternalEObject oldHasScreening = (InternalEObject) hasScreening;
			hasScreening = (Screening) eResolveProxy(oldHasScreening);
			if (hasScreening != oldHasScreening) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EzProcessPackage.ONBOARDING__HAS_SCREENING, oldHasScreening, hasScreening));
			}
		}
		return hasScreening;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Screening basicGetHasScreening() {
		return hasScreening;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasScreening(Screening newHasScreening) {
		Screening oldHasScreening = hasScreening;
		hasScreening = newHasScreening;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzProcessPackage.ONBOARDING__HAS_SCREENING,
					oldHasScreening, hasScreening));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EzProcessPackage.ONBOARDING__HAS_SCREENING:
			if (resolve)
				return getHasScreening();
			return basicGetHasScreening();
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
		case EzProcessPackage.ONBOARDING__HAS_SCREENING:
			setHasScreening((Screening) newValue);
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
		case EzProcessPackage.ONBOARDING__HAS_SCREENING:
			setHasScreening((Screening) null);
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
		case EzProcessPackage.ONBOARDING__HAS_SCREENING:
			return hasScreening != null;
		}
		return super.eIsSet(featureID);
	}

} //OnboardingImpl
