/**
 */
package ezProcess.impl;

import ezProcess.EzProcessPackage;
import ezProcess.Option;
import ezProcess.OptionRating;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ezProcess.impl.OptionImpl#getOptionValue <em>Option Value</em>}</li>
 *   <li>{@link ezProcess.impl.OptionImpl#getOptionLabel <em>Option Label</em>}</li>
 *   <li>{@link ezProcess.impl.OptionImpl#getHasOptionRating <em>Has Option Rating</em>}</li>
 *   <li>{@link ezProcess.impl.OptionImpl#getSetupActions <em>Setup Actions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OptionImpl extends MinimalEObjectImpl.Container implements Option {
	/**
	 * The default value of the '{@link #getOptionValue() <em>Option Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionValue()
	 * @generated
	 * @ordered
	 */
	protected static final String OPTION_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOptionValue() <em>Option Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionValue()
	 * @generated
	 * @ordered
	 */
	protected String optionValue = OPTION_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOptionLabel() <em>Option Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String OPTION_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOptionLabel() <em>Option Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionLabel()
	 * @generated
	 * @ordered
	 */
	protected String optionLabel = OPTION_LABEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasOptionRating() <em>Has Option Rating</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasOptionRating()
	 * @generated
	 * @ordered
	 */
	protected EList<OptionRating> hasOptionRating;

	/**
	 * The cached value of the '{@link #getSetupActions() <em>Setup Actions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetupActions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> setupActions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzProcessPackage.Literals.OPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOptionValue() {
		return optionValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptionValue(String newOptionValue) {
		String oldOptionValue = optionValue;
		optionValue = newOptionValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzProcessPackage.OPTION__OPTION_VALUE, oldOptionValue,
					optionValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOptionLabel() {
		return optionLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptionLabel(String newOptionLabel) {
		String oldOptionLabel = optionLabel;
		optionLabel = newOptionLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzProcessPackage.OPTION__OPTION_LABEL, oldOptionLabel,
					optionLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OptionRating> getHasOptionRating() {
		if (hasOptionRating == null) {
			hasOptionRating = new EObjectContainmentEList<OptionRating>(OptionRating.class, this,
					EzProcessPackage.OPTION__HAS_OPTION_RATING);
		}
		return hasOptionRating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSetupActions() {
		if (setupActions == null) {
			setupActions = new EDataTypeUniqueEList<String>(String.class, this, EzProcessPackage.OPTION__SETUP_ACTIONS);
		}
		return setupActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EzProcessPackage.OPTION__HAS_OPTION_RATING:
			return ((InternalEList<?>) getHasOptionRating()).basicRemove(otherEnd, msgs);
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
		case EzProcessPackage.OPTION__OPTION_VALUE:
			return getOptionValue();
		case EzProcessPackage.OPTION__OPTION_LABEL:
			return getOptionLabel();
		case EzProcessPackage.OPTION__HAS_OPTION_RATING:
			return getHasOptionRating();
		case EzProcessPackage.OPTION__SETUP_ACTIONS:
			return getSetupActions();
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
		case EzProcessPackage.OPTION__OPTION_VALUE:
			setOptionValue((String) newValue);
			return;
		case EzProcessPackage.OPTION__OPTION_LABEL:
			setOptionLabel((String) newValue);
			return;
		case EzProcessPackage.OPTION__HAS_OPTION_RATING:
			getHasOptionRating().clear();
			getHasOptionRating().addAll((Collection<? extends OptionRating>) newValue);
			return;
		case EzProcessPackage.OPTION__SETUP_ACTIONS:
			getSetupActions().clear();
			getSetupActions().addAll((Collection<? extends String>) newValue);
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
		case EzProcessPackage.OPTION__OPTION_VALUE:
			setOptionValue(OPTION_VALUE_EDEFAULT);
			return;
		case EzProcessPackage.OPTION__OPTION_LABEL:
			setOptionLabel(OPTION_LABEL_EDEFAULT);
			return;
		case EzProcessPackage.OPTION__HAS_OPTION_RATING:
			getHasOptionRating().clear();
			return;
		case EzProcessPackage.OPTION__SETUP_ACTIONS:
			getSetupActions().clear();
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
		case EzProcessPackage.OPTION__OPTION_VALUE:
			return OPTION_VALUE_EDEFAULT == null ? optionValue != null : !OPTION_VALUE_EDEFAULT.equals(optionValue);
		case EzProcessPackage.OPTION__OPTION_LABEL:
			return OPTION_LABEL_EDEFAULT == null ? optionLabel != null : !OPTION_LABEL_EDEFAULT.equals(optionLabel);
		case EzProcessPackage.OPTION__HAS_OPTION_RATING:
			return hasOptionRating != null && !hasOptionRating.isEmpty();
		case EzProcessPackage.OPTION__SETUP_ACTIONS:
			return setupActions != null && !setupActions.isEmpty();
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
		result.append(" (optionValue: ");
		result.append(optionValue);
		result.append(", optionLabel: ");
		result.append(optionLabel);
		result.append(", setupActions: ");
		result.append(setupActions);
		result.append(')');
		return result.toString();
	}

} //OptionImpl
