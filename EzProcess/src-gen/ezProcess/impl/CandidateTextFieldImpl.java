/**
 */
package ezProcess.impl;

import ezProcess.CandidateFieldType;
import ezProcess.CandidateTextField;
import ezProcess.EzProcessPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Candidate Text Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ezProcess.impl.CandidateTextFieldImpl#getCandidateField <em>Candidate Field</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CandidateTextFieldImpl extends TextFieldImpl implements CandidateTextField {
	/**
	 * The default value of the '{@link #getCandidateField() <em>Candidate Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCandidateField()
	 * @generated
	 * @ordered
	 */
	protected static final CandidateFieldType CANDIDATE_FIELD_EDEFAULT = CandidateFieldType.FIRST_NAME;

	/**
	 * The cached value of the '{@link #getCandidateField() <em>Candidate Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCandidateField()
	 * @generated
	 * @ordered
	 */
	protected CandidateFieldType candidateField = CANDIDATE_FIELD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CandidateTextFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzProcessPackage.Literals.CANDIDATE_TEXT_FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CandidateFieldType getCandidateField() {
		return candidateField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCandidateField(CandidateFieldType newCandidateField) {
		CandidateFieldType oldCandidateField = candidateField;
		candidateField = newCandidateField == null ? CANDIDATE_FIELD_EDEFAULT : newCandidateField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EzProcessPackage.CANDIDATE_TEXT_FIELD__CANDIDATE_FIELD, oldCandidateField, candidateField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EzProcessPackage.CANDIDATE_TEXT_FIELD__CANDIDATE_FIELD:
			return getCandidateField();
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
		case EzProcessPackage.CANDIDATE_TEXT_FIELD__CANDIDATE_FIELD:
			setCandidateField((CandidateFieldType) newValue);
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
		case EzProcessPackage.CANDIDATE_TEXT_FIELD__CANDIDATE_FIELD:
			setCandidateField(CANDIDATE_FIELD_EDEFAULT);
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
		case EzProcessPackage.CANDIDATE_TEXT_FIELD__CANDIDATE_FIELD:
			return candidateField != CANDIDATE_FIELD_EDEFAULT;
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
		result.append(" (candidateField: ");
		result.append(candidateField);
		result.append(')');
		return result.toString();
	}

} //CandidateTextFieldImpl
