/**
 */
package ezProcess.impl;

import ezProcess.EzProcessPackage;
import ezProcess.MultipleOptions;
import ezProcess.Question;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Question</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ezProcess.impl.QuestionImpl#getQuestion <em>Question</em>}</li>
 *   <li>{@link ezProcess.impl.QuestionImpl#getIsAbout <em>Is About</em>}</li>
 *   <li>{@link ezProcess.impl.QuestionImpl#getID <em>ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuestionImpl extends MinimalEObjectImpl.Container implements Question {
	/**
	 * The default value of the '{@link #getQuestion() <em>Question</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestion()
	 * @generated
	 * @ordered
	 */
	protected static final String QUESTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuestion() <em>Question</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestion()
	 * @generated
	 * @ordered
	 */
	protected String question = QUESTION_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzProcessPackage.Literals.QUESTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQuestion() {
		return question;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuestion(String newQuestion) {
		String oldQuestion = question;
		question = newQuestion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzProcessPackage.QUESTION__QUESTION, oldQuestion,
					question));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EzProcessPackage.QUESTION__IS_ABOUT,
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
			eNotify(new ENotificationImpl(this, Notification.SET, EzProcessPackage.QUESTION__IS_ABOUT, oldIsAbout,
					isAbout));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EzProcessPackage.QUESTION__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EzProcessPackage.QUESTION__QUESTION:
			return getQuestion();
		case EzProcessPackage.QUESTION__IS_ABOUT:
			if (resolve)
				return getIsAbout();
			return basicGetIsAbout();
		case EzProcessPackage.QUESTION__ID:
			return getID();
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
		case EzProcessPackage.QUESTION__QUESTION:
			setQuestion((String) newValue);
			return;
		case EzProcessPackage.QUESTION__IS_ABOUT:
			setIsAbout((MultipleOptions) newValue);
			return;
		case EzProcessPackage.QUESTION__ID:
			setID((Integer) newValue);
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
		case EzProcessPackage.QUESTION__QUESTION:
			setQuestion(QUESTION_EDEFAULT);
			return;
		case EzProcessPackage.QUESTION__IS_ABOUT:
			setIsAbout((MultipleOptions) null);
			return;
		case EzProcessPackage.QUESTION__ID:
			setID(ID_EDEFAULT);
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
		case EzProcessPackage.QUESTION__QUESTION:
			return QUESTION_EDEFAULT == null ? question != null : !QUESTION_EDEFAULT.equals(question);
		case EzProcessPackage.QUESTION__IS_ABOUT:
			return isAbout != null;
		case EzProcessPackage.QUESTION__ID:
			return id != ID_EDEFAULT;
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
		result.append(" (question: ");
		result.append(question);
		result.append(", ID: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //QuestionImpl
