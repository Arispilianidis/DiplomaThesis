/**
 */
package ezProcess.impl;

import ezProcess.EzProcessPackage;
import ezProcess.OptionRating;
import ezProcess.OptionThreshold;
import ezProcess.Question;

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
 * An implementation of the model object '<em><b>Option Rating</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ezProcess.impl.OptionRatingImpl#getTooltipArray <em>Tooltip Array</em>}</li>
 *   <li>{@link ezProcess.impl.OptionRatingImpl#getID <em>ID</em>}</li>
 *   <li>{@link ezProcess.impl.OptionRatingImpl#getHasThreshold <em>Has Threshold</em>}</li>
 *   <li>{@link ezProcess.impl.OptionRatingImpl#getIsAbout <em>Is About</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OptionRatingImpl extends MinimalEObjectImpl.Container implements OptionRating {
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
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasThreshold() <em>Has Threshold</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasThreshold()
	 * @generated
	 * @ordered
	 */
	protected EList<OptionThreshold> hasThreshold;

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
	protected OptionRatingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzProcessPackage.Literals.OPTION_RATING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getTooltipArray() {
		if (tooltipArray == null) {
			tooltipArray = new EDataTypeUniqueEList<String>(String.class, this,
					EzProcessPackage.OPTION_RATING__TOOLTIP_ARRAY);
		}
		return tooltipArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(int newID) {
		int oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzProcessPackage.OPTION_RATING__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OptionThreshold> getHasThreshold() {
		if (hasThreshold == null) {
			hasThreshold = new EObjectContainmentEList<OptionThreshold>(OptionThreshold.class, this,
					EzProcessPackage.OPTION_RATING__HAS_THRESHOLD);
		}
		return hasThreshold;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EzProcessPackage.OPTION_RATING__IS_ABOUT,
							oldIsAbout, isAbout));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EzProcessPackage.OPTION_RATING__IS_ABOUT, oldIsAbout,
					isAbout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EzProcessPackage.OPTION_RATING__HAS_THRESHOLD:
			return ((InternalEList<?>) getHasThreshold()).basicRemove(otherEnd, msgs);
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
		case EzProcessPackage.OPTION_RATING__TOOLTIP_ARRAY:
			return getTooltipArray();
		case EzProcessPackage.OPTION_RATING__ID:
			return getID();
		case EzProcessPackage.OPTION_RATING__HAS_THRESHOLD:
			return getHasThreshold();
		case EzProcessPackage.OPTION_RATING__IS_ABOUT:
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EzProcessPackage.OPTION_RATING__TOOLTIP_ARRAY:
			getTooltipArray().clear();
			getTooltipArray().addAll((Collection<? extends String>) newValue);
			return;
		case EzProcessPackage.OPTION_RATING__ID:
			setID((Integer) newValue);
			return;
		case EzProcessPackage.OPTION_RATING__HAS_THRESHOLD:
			getHasThreshold().clear();
			getHasThreshold().addAll((Collection<? extends OptionThreshold>) newValue);
			return;
		case EzProcessPackage.OPTION_RATING__IS_ABOUT:
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
		case EzProcessPackage.OPTION_RATING__TOOLTIP_ARRAY:
			getTooltipArray().clear();
			return;
		case EzProcessPackage.OPTION_RATING__ID:
			setID(ID_EDEFAULT);
			return;
		case EzProcessPackage.OPTION_RATING__HAS_THRESHOLD:
			getHasThreshold().clear();
			return;
		case EzProcessPackage.OPTION_RATING__IS_ABOUT:
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
		case EzProcessPackage.OPTION_RATING__TOOLTIP_ARRAY:
			return tooltipArray != null && !tooltipArray.isEmpty();
		case EzProcessPackage.OPTION_RATING__ID:
			return id != ID_EDEFAULT;
		case EzProcessPackage.OPTION_RATING__HAS_THRESHOLD:
			return hasThreshold != null && !hasThreshold.isEmpty();
		case EzProcessPackage.OPTION_RATING__IS_ABOUT:
			return isAbout != null;
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
		result.append(", ID: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //OptionRatingImpl
