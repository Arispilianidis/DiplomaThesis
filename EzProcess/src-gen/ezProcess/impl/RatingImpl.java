/**
 */
package ezProcess.impl;

import ezProcess.EzProcessPackage;
import ezProcess.Rating;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rating</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ezProcess.impl.RatingImpl#getTooltipArray <em>Tooltip Array</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RatingImpl extends MinimalEObjectImpl.Container implements Rating {
	/**
	 * The cached value of the '{@link #getTooltipArray() <em>Tooltip Array</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTooltipArray()
	 * @generated
	 * @ordered
	 */
	protected EList<String> tooltipArray;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RatingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzProcessPackage.Literals.RATING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getTooltipArray() {
		if (tooltipArray == null) {
			tooltipArray = new EDataTypeUniqueEList<String>(String.class, this, EzProcessPackage.RATING__TOOLTIP_ARRAY);
		}
		return tooltipArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EzProcessPackage.RATING__TOOLTIP_ARRAY:
			return getTooltipArray();
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
		case EzProcessPackage.RATING__TOOLTIP_ARRAY:
			getTooltipArray().clear();
			getTooltipArray().addAll((Collection<? extends String>) newValue);
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
		case EzProcessPackage.RATING__TOOLTIP_ARRAY:
			getTooltipArray().clear();
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
		case EzProcessPackage.RATING__TOOLTIP_ARRAY:
			return tooltipArray != null && !tooltipArray.isEmpty();
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
		result.append(" (tooltipArray: ");
		result.append(tooltipArray);
		result.append(')');
		return result.toString();
	}

} //RatingImpl
