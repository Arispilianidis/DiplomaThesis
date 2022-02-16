/**
 */
package ezProcess.impl;

import ezProcess.EzProcessPackage;
import ezProcess.OptionThreshold;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Option Threshold</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ezProcess.impl.OptionThresholdImpl#getMin <em>Min</em>}</li>
 *   <li>{@link ezProcess.impl.OptionThresholdImpl#getMax <em>Max</em>}</li>
 *   <li>{@link ezProcess.impl.OptionThresholdImpl#getText <em>Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OptionThresholdImpl extends MinimalEObjectImpl.Container implements OptionThreshold {
	/**
	 * The default value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected int min = MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected int max = MAX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected EList<String> text;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OptionThresholdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzProcessPackage.Literals.OPTION_THRESHOLD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMin() {
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMin(int newMin) {
		int oldMin = min;
		min = newMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzProcessPackage.OPTION_THRESHOLD__MIN, oldMin, min));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMax() {
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax(int newMax) {
		int oldMax = max;
		max = newMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzProcessPackage.OPTION_THRESHOLD__MAX, oldMax, max));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getText() {
		if (text == null) {
			text = new EDataTypeUniqueEList<String>(String.class, this, EzProcessPackage.OPTION_THRESHOLD__TEXT);
		}
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EzProcessPackage.OPTION_THRESHOLD__MIN:
			return getMin();
		case EzProcessPackage.OPTION_THRESHOLD__MAX:
			return getMax();
		case EzProcessPackage.OPTION_THRESHOLD__TEXT:
			return getText();
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
		case EzProcessPackage.OPTION_THRESHOLD__MIN:
			setMin((Integer) newValue);
			return;
		case EzProcessPackage.OPTION_THRESHOLD__MAX:
			setMax((Integer) newValue);
			return;
		case EzProcessPackage.OPTION_THRESHOLD__TEXT:
			getText().clear();
			getText().addAll((Collection<? extends String>) newValue);
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
		case EzProcessPackage.OPTION_THRESHOLD__MIN:
			setMin(MIN_EDEFAULT);
			return;
		case EzProcessPackage.OPTION_THRESHOLD__MAX:
			setMax(MAX_EDEFAULT);
			return;
		case EzProcessPackage.OPTION_THRESHOLD__TEXT:
			getText().clear();
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
		case EzProcessPackage.OPTION_THRESHOLD__MIN:
			return min != MIN_EDEFAULT;
		case EzProcessPackage.OPTION_THRESHOLD__MAX:
			return max != MAX_EDEFAULT;
		case EzProcessPackage.OPTION_THRESHOLD__TEXT:
			return text != null && !text.isEmpty();
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
		result.append(" (min: ");
		result.append(min);
		result.append(", max: ");
		result.append(max);
		result.append(", text: ");
		result.append(text);
		result.append(')');
		return result.toString();
	}

} //OptionThresholdImpl
