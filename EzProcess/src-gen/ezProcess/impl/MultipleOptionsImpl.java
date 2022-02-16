/**
 */
package ezProcess.impl;

import ezProcess.EzProcessPackage;
import ezProcess.MultipleOptions;
import ezProcess.Option;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multiple Options</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ezProcess.impl.MultipleOptionsImpl#getOptionVarName <em>Option Var Name</em>}</li>
 *   <li>{@link ezProcess.impl.MultipleOptionsImpl#getHasOption <em>Has Option</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MultipleOptionsImpl extends InitialValueImpl implements MultipleOptions {
	/**
	 * The default value of the '{@link #getOptionVarName() <em>Option Var Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionVarName()
	 * @generated
	 * @ordered
	 */
	protected static final String OPTION_VAR_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOptionVarName() <em>Option Var Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionVarName()
	 * @generated
	 * @ordered
	 */
	protected String optionVarName = OPTION_VAR_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasOption() <em>Has Option</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasOption()
	 * @generated
	 * @ordered
	 */
	protected EList<Option> hasOption;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultipleOptionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzProcessPackage.Literals.MULTIPLE_OPTIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOptionVarName() {
		return optionVarName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptionVarName(String newOptionVarName) {
		String oldOptionVarName = optionVarName;
		optionVarName = newOptionVarName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzProcessPackage.MULTIPLE_OPTIONS__OPTION_VAR_NAME,
					oldOptionVarName, optionVarName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Option> getHasOption() {
		if (hasOption == null) {
			hasOption = new EObjectContainmentEList<Option>(Option.class, this,
					EzProcessPackage.MULTIPLE_OPTIONS__HAS_OPTION);
		}
		return hasOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EzProcessPackage.MULTIPLE_OPTIONS__HAS_OPTION:
			return ((InternalEList<?>) getHasOption()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EzProcessPackage.MULTIPLE_OPTIONS__OPTION_VAR_NAME:
			return getOptionVarName();
		case EzProcessPackage.MULTIPLE_OPTIONS__HAS_OPTION:
			return getHasOption();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EzProcessPackage.MULTIPLE_OPTIONS__OPTION_VAR_NAME:
			setOptionVarName((String) newValue);
			return;
		case EzProcessPackage.MULTIPLE_OPTIONS__HAS_OPTION:
			getHasOption().clear();
			getHasOption().addAll((Collection<? extends Option>) newValue);
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
		case EzProcessPackage.MULTIPLE_OPTIONS__OPTION_VAR_NAME:
			setOptionVarName(OPTION_VAR_NAME_EDEFAULT);
			return;
		case EzProcessPackage.MULTIPLE_OPTIONS__HAS_OPTION:
			getHasOption().clear();
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
		case EzProcessPackage.MULTIPLE_OPTIONS__OPTION_VAR_NAME:
			return OPTION_VAR_NAME_EDEFAULT == null ? optionVarName != null
					: !OPTION_VAR_NAME_EDEFAULT.equals(optionVarName);
		case EzProcessPackage.MULTIPLE_OPTIONS__HAS_OPTION:
			return hasOption != null && !hasOption.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (optionVarName: ");
		result.append(optionVarName);
		result.append(')');
		return result.toString();
	}

} //MultipleOptionsImpl
