/**
 */
package ezProcess.impl;

import ezProcess.EzProcessPackage;
import ezProcess.InitialValue;
import ezProcess.Rating;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Initial Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ezProcess.impl.InitialValueImpl#getName <em>Name</em>}</li>
 *   <li>{@link ezProcess.impl.InitialValueImpl#isRequired <em>Required</em>}</li>
 *   <li>{@link ezProcess.impl.InitialValueImpl#isProof <em>Proof</em>}</li>
 *   <li>{@link ezProcess.impl.InitialValueImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link ezProcess.impl.InitialValueImpl#isRating <em>Rating</em>}</li>
 *   <li>{@link ezProcess.impl.InitialValueImpl#getHasRating <em>Has Rating</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class InitialValueImpl extends MinimalEObjectImpl.Container implements InitialValue {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected boolean required = REQUIRED_EDEFAULT;

	/**
	 * The default value of the '{@link #isProof() <em>Proof</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProof()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PROOF_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isProof() <em>Proof</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProof()
	 * @generated
	 * @ordered
	 */
	protected boolean proof = PROOF_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #isRating() <em>Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRating()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RATING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRating() <em>Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRating()
	 * @generated
	 * @ordered
	 */
	protected boolean rating = RATING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasRating() <em>Has Rating</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasRating()
	 * @generated
	 * @ordered
	 */
	protected EList<Rating> hasRating;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InitialValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzProcessPackage.Literals.INITIAL_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzProcessPackage.INITIAL_VALUE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRequired() {
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequired(boolean newRequired) {
		boolean oldRequired = required;
		required = newRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzProcessPackage.INITIAL_VALUE__REQUIRED, oldRequired,
					required));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isProof() {
		return proof;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProof(boolean newProof) {
		boolean oldProof = proof;
		proof = newProof;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzProcessPackage.INITIAL_VALUE__PROOF, oldProof,
					proof));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzProcessPackage.INITIAL_VALUE__LABEL, oldLabel,
					label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRating() {
		return rating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRating(boolean newRating) {
		boolean oldRating = rating;
		rating = newRating;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzProcessPackage.INITIAL_VALUE__RATING, oldRating,
					rating));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rating> getHasRating() {
		if (hasRating == null) {
			hasRating = new EObjectContainmentEList<Rating>(Rating.class, this,
					EzProcessPackage.INITIAL_VALUE__HAS_RATING);
		}
		return hasRating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EzProcessPackage.INITIAL_VALUE__HAS_RATING:
			return ((InternalEList<?>) getHasRating()).basicRemove(otherEnd, msgs);
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
		case EzProcessPackage.INITIAL_VALUE__NAME:
			return getName();
		case EzProcessPackage.INITIAL_VALUE__REQUIRED:
			return isRequired();
		case EzProcessPackage.INITIAL_VALUE__PROOF:
			return isProof();
		case EzProcessPackage.INITIAL_VALUE__LABEL:
			return getLabel();
		case EzProcessPackage.INITIAL_VALUE__RATING:
			return isRating();
		case EzProcessPackage.INITIAL_VALUE__HAS_RATING:
			return getHasRating();
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
		case EzProcessPackage.INITIAL_VALUE__NAME:
			setName((String) newValue);
			return;
		case EzProcessPackage.INITIAL_VALUE__REQUIRED:
			setRequired((Boolean) newValue);
			return;
		case EzProcessPackage.INITIAL_VALUE__PROOF:
			setProof((Boolean) newValue);
			return;
		case EzProcessPackage.INITIAL_VALUE__LABEL:
			setLabel((String) newValue);
			return;
		case EzProcessPackage.INITIAL_VALUE__RATING:
			setRating((Boolean) newValue);
			return;
		case EzProcessPackage.INITIAL_VALUE__HAS_RATING:
			getHasRating().clear();
			getHasRating().addAll((Collection<? extends Rating>) newValue);
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
		case EzProcessPackage.INITIAL_VALUE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case EzProcessPackage.INITIAL_VALUE__REQUIRED:
			setRequired(REQUIRED_EDEFAULT);
			return;
		case EzProcessPackage.INITIAL_VALUE__PROOF:
			setProof(PROOF_EDEFAULT);
			return;
		case EzProcessPackage.INITIAL_VALUE__LABEL:
			setLabel(LABEL_EDEFAULT);
			return;
		case EzProcessPackage.INITIAL_VALUE__RATING:
			setRating(RATING_EDEFAULT);
			return;
		case EzProcessPackage.INITIAL_VALUE__HAS_RATING:
			getHasRating().clear();
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
		case EzProcessPackage.INITIAL_VALUE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case EzProcessPackage.INITIAL_VALUE__REQUIRED:
			return required != REQUIRED_EDEFAULT;
		case EzProcessPackage.INITIAL_VALUE__PROOF:
			return proof != PROOF_EDEFAULT;
		case EzProcessPackage.INITIAL_VALUE__LABEL:
			return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
		case EzProcessPackage.INITIAL_VALUE__RATING:
			return rating != RATING_EDEFAULT;
		case EzProcessPackage.INITIAL_VALUE__HAS_RATING:
			return hasRating != null && !hasRating.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", required: ");
		result.append(required);
		result.append(", Proof: ");
		result.append(proof);
		result.append(", label: ");
		result.append(label);
		result.append(", rating: ");
		result.append(rating);
		result.append(')');
		return result.toString();
	}

} //InitialValueImpl
