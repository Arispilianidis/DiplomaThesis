/**
 */
package ezProcess.impl;

import ezProcess.EzProcessPackage;
import ezProcess.InitialValue;
import ezProcess.OnboardingTask;
import ezProcess.Page;
import ezProcess.Question;

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
 * An implementation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ezProcess.impl.PageImpl#isFinal <em>Final</em>}</li>
 *   <li>{@link ezProcess.impl.PageImpl#isFirst <em>First</em>}</li>
 *   <li>{@link ezProcess.impl.PageImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link ezProcess.impl.PageImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link ezProcess.impl.PageImpl#getHasInitialvalue <em>Has Initialvalue</em>}</li>
 *   <li>{@link ezProcess.impl.PageImpl#getHasQuestion <em>Has Question</em>}</li>
 *   <li>{@link ezProcess.impl.PageImpl#getHasOnboardingTask <em>Has Onboarding Task</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PageImpl extends MinimalEObjectImpl.Container implements Page {
	/**
	 * The default value of the '{@link #isFinal() <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FINAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFinal() <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinal()
	 * @generated
	 * @ordered
	 */
	protected boolean final_ = FINAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isFirst() <em>First</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFirst()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FIRST_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFirst() <em>First</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFirst()
	 * @generated
	 * @ordered
	 */
	protected boolean first = FIRST_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeader() <em>Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeader()
	 * @generated
	 * @ordered
	 */
	protected static final String HEADER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeader() <em>Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeader()
	 * @generated
	 * @ordered
	 */
	protected String header = HEADER_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasInitialvalue() <em>Has Initialvalue</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasInitialvalue()
	 * @generated
	 * @ordered
	 */
	protected EList<InitialValue> hasInitialvalue;

	/**
	 * The cached value of the '{@link #getHasQuestion() <em>Has Question</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasQuestion()
	 * @generated
	 * @ordered
	 */
	protected EList<Question> hasQuestion;

	/**
	 * The cached value of the '{@link #getHasOnboardingTask() <em>Has Onboarding Task</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasOnboardingTask()
	 * @generated
	 * @ordered
	 */
	protected EList<OnboardingTask> hasOnboardingTask;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzProcessPackage.Literals.PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFinal() {
		return final_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinal(boolean newFinal) {
		boolean oldFinal = final_;
		final_ = newFinal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzProcessPackage.PAGE__FINAL, oldFinal, final_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFirst() {
		return first;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirst(boolean newFirst) {
		boolean oldFirst = first;
		first = newFirst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzProcessPackage.PAGE__FIRST, oldFirst, first));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeader() {
		return header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeader(String newHeader) {
		String oldHeader = header;
		header = newHeader;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzProcessPackage.PAGE__HEADER, oldHeader, header));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzProcessPackage.PAGE__DESCRIPTION, oldDescription,
					description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InitialValue> getHasInitialvalue() {
		if (hasInitialvalue == null) {
			hasInitialvalue = new EObjectContainmentEList<InitialValue>(InitialValue.class, this,
					EzProcessPackage.PAGE__HAS_INITIALVALUE);
		}
		return hasInitialvalue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Question> getHasQuestion() {
		if (hasQuestion == null) {
			hasQuestion = new EObjectContainmentEList<Question>(Question.class, this,
					EzProcessPackage.PAGE__HAS_QUESTION);
		}
		return hasQuestion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OnboardingTask> getHasOnboardingTask() {
		if (hasOnboardingTask == null) {
			hasOnboardingTask = new EObjectContainmentEList<OnboardingTask>(OnboardingTask.class, this,
					EzProcessPackage.PAGE__HAS_ONBOARDING_TASK);
		}
		return hasOnboardingTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EzProcessPackage.PAGE__HAS_INITIALVALUE:
			return ((InternalEList<?>) getHasInitialvalue()).basicRemove(otherEnd, msgs);
		case EzProcessPackage.PAGE__HAS_QUESTION:
			return ((InternalEList<?>) getHasQuestion()).basicRemove(otherEnd, msgs);
		case EzProcessPackage.PAGE__HAS_ONBOARDING_TASK:
			return ((InternalEList<?>) getHasOnboardingTask()).basicRemove(otherEnd, msgs);
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
		case EzProcessPackage.PAGE__FINAL:
			return isFinal();
		case EzProcessPackage.PAGE__FIRST:
			return isFirst();
		case EzProcessPackage.PAGE__HEADER:
			return getHeader();
		case EzProcessPackage.PAGE__DESCRIPTION:
			return getDescription();
		case EzProcessPackage.PAGE__HAS_INITIALVALUE:
			return getHasInitialvalue();
		case EzProcessPackage.PAGE__HAS_QUESTION:
			return getHasQuestion();
		case EzProcessPackage.PAGE__HAS_ONBOARDING_TASK:
			return getHasOnboardingTask();
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
		case EzProcessPackage.PAGE__FINAL:
			setFinal((Boolean) newValue);
			return;
		case EzProcessPackage.PAGE__FIRST:
			setFirst((Boolean) newValue);
			return;
		case EzProcessPackage.PAGE__HEADER:
			setHeader((String) newValue);
			return;
		case EzProcessPackage.PAGE__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case EzProcessPackage.PAGE__HAS_INITIALVALUE:
			getHasInitialvalue().clear();
			getHasInitialvalue().addAll((Collection<? extends InitialValue>) newValue);
			return;
		case EzProcessPackage.PAGE__HAS_QUESTION:
			getHasQuestion().clear();
			getHasQuestion().addAll((Collection<? extends Question>) newValue);
			return;
		case EzProcessPackage.PAGE__HAS_ONBOARDING_TASK:
			getHasOnboardingTask().clear();
			getHasOnboardingTask().addAll((Collection<? extends OnboardingTask>) newValue);
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
		case EzProcessPackage.PAGE__FINAL:
			setFinal(FINAL_EDEFAULT);
			return;
		case EzProcessPackage.PAGE__FIRST:
			setFirst(FIRST_EDEFAULT);
			return;
		case EzProcessPackage.PAGE__HEADER:
			setHeader(HEADER_EDEFAULT);
			return;
		case EzProcessPackage.PAGE__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case EzProcessPackage.PAGE__HAS_INITIALVALUE:
			getHasInitialvalue().clear();
			return;
		case EzProcessPackage.PAGE__HAS_QUESTION:
			getHasQuestion().clear();
			return;
		case EzProcessPackage.PAGE__HAS_ONBOARDING_TASK:
			getHasOnboardingTask().clear();
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
		case EzProcessPackage.PAGE__FINAL:
			return final_ != FINAL_EDEFAULT;
		case EzProcessPackage.PAGE__FIRST:
			return first != FIRST_EDEFAULT;
		case EzProcessPackage.PAGE__HEADER:
			return HEADER_EDEFAULT == null ? header != null : !HEADER_EDEFAULT.equals(header);
		case EzProcessPackage.PAGE__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case EzProcessPackage.PAGE__HAS_INITIALVALUE:
			return hasInitialvalue != null && !hasInitialvalue.isEmpty();
		case EzProcessPackage.PAGE__HAS_QUESTION:
			return hasQuestion != null && !hasQuestion.isEmpty();
		case EzProcessPackage.PAGE__HAS_ONBOARDING_TASK:
			return hasOnboardingTask != null && !hasOnboardingTask.isEmpty();
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
		result.append(" (final: ");
		result.append(final_);
		result.append(", first: ");
		result.append(first);
		result.append(", header: ");
		result.append(header);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //PageImpl
