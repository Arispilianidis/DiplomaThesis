/**
 */
package ezProcess.impl;

import ezProcess.EzProcessPackage;
import ezProcess.JobDescription;
import ezProcess.Screening;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Screening</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ezProcess.impl.ScreeningImpl#getHasJobDescription <em>Has Job Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScreeningImpl extends ProcessImpl implements Screening {
	/**
	 * The cached value of the '{@link #getHasJobDescription() <em>Has Job Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasJobDescription()
	 * @generated
	 * @ordered
	 */
	protected JobDescription hasJobDescription;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScreeningImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzProcessPackage.Literals.SCREENING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobDescription getHasJobDescription() {
		if (hasJobDescription != null && hasJobDescription.eIsProxy()) {
			InternalEObject oldHasJobDescription = (InternalEObject) hasJobDescription;
			hasJobDescription = (JobDescription) eResolveProxy(oldHasJobDescription);
			if (hasJobDescription != oldHasJobDescription) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EzProcessPackage.SCREENING__HAS_JOB_DESCRIPTION, oldHasJobDescription, hasJobDescription));
			}
		}
		return hasJobDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobDescription basicGetHasJobDescription() {
		return hasJobDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasJobDescription(JobDescription newHasJobDescription) {
		JobDescription oldHasJobDescription = hasJobDescription;
		hasJobDescription = newHasJobDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzProcessPackage.SCREENING__HAS_JOB_DESCRIPTION,
					oldHasJobDescription, hasJobDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EzProcessPackage.SCREENING__HAS_JOB_DESCRIPTION:
			if (resolve)
				return getHasJobDescription();
			return basicGetHasJobDescription();
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
		case EzProcessPackage.SCREENING__HAS_JOB_DESCRIPTION:
			setHasJobDescription((JobDescription) newValue);
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
		case EzProcessPackage.SCREENING__HAS_JOB_DESCRIPTION:
			setHasJobDescription((JobDescription) null);
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
		case EzProcessPackage.SCREENING__HAS_JOB_DESCRIPTION:
			return hasJobDescription != null;
		}
		return super.eIsSet(featureID);
	}

} //ScreeningImpl
