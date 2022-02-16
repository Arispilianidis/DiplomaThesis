/**
 */
package ezProcess.impl;

import ezProcess.Employee;
import ezProcess.EzProcessPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Employee</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ezProcess.impl.EmployeeImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link ezProcess.impl.EmployeeImpl#getLastName <em>Last Name</em>}</li>
 *   <li>{@link ezProcess.impl.EmployeeImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link ezProcess.impl.EmployeeImpl#getUserName <em>User Name</em>}</li>
 *   <li>{@link ezProcess.impl.EmployeeImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link ezProcess.impl.EmployeeImpl#getId <em>Id</em>}</li>
 *   <li>{@link ezProcess.impl.EmployeeImpl#getAssignedProcess <em>Assigned Process</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmployeeImpl extends MinimalEObjectImpl.Container implements Employee {
	/**
	 * The default value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected String firstName = FIRST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected String lastName = LAST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserName() <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserName()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserName() <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserName()
	 * @generated
	 * @ordered
	 */
	protected String userName = USER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAssignedProcess() <em>Assigned Process</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedProcess()
	 * @generated
	 * @ordered
	 */
	protected EList<ezProcess.Process> assignedProcess;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmployeeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzProcessPackage.Literals.EMPLOYEE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstName(String newFirstName) {
		String oldFirstName = firstName;
		firstName = newFirstName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzProcessPackage.EMPLOYEE__FIRST_NAME, oldFirstName,
					firstName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastName(String newLastName) {
		String oldLastName = lastName;
		lastName = newLastName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzProcessPackage.EMPLOYEE__LAST_NAME, oldLastName,
					lastName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzProcessPackage.EMPLOYEE__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserName(String newUserName) {
		String oldUserName = userName;
		userName = newUserName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzProcessPackage.EMPLOYEE__USER_NAME, oldUserName,
					userName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzProcessPackage.EMPLOYEE__PASSWORD, oldPassword,
					password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzProcessPackage.EMPLOYEE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ezProcess.Process> getAssignedProcess() {
		if (assignedProcess == null) {
			assignedProcess = new EObjectResolvingEList<ezProcess.Process>(ezProcess.Process.class, this,
					EzProcessPackage.EMPLOYEE__ASSIGNED_PROCESS);
		}
		return assignedProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EzProcessPackage.EMPLOYEE__FIRST_NAME:
			return getFirstName();
		case EzProcessPackage.EMPLOYEE__LAST_NAME:
			return getLastName();
		case EzProcessPackage.EMPLOYEE__EMAIL:
			return getEmail();
		case EzProcessPackage.EMPLOYEE__USER_NAME:
			return getUserName();
		case EzProcessPackage.EMPLOYEE__PASSWORD:
			return getPassword();
		case EzProcessPackage.EMPLOYEE__ID:
			return getId();
		case EzProcessPackage.EMPLOYEE__ASSIGNED_PROCESS:
			return getAssignedProcess();
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
		case EzProcessPackage.EMPLOYEE__FIRST_NAME:
			setFirstName((String) newValue);
			return;
		case EzProcessPackage.EMPLOYEE__LAST_NAME:
			setLastName((String) newValue);
			return;
		case EzProcessPackage.EMPLOYEE__EMAIL:
			setEmail((String) newValue);
			return;
		case EzProcessPackage.EMPLOYEE__USER_NAME:
			setUserName((String) newValue);
			return;
		case EzProcessPackage.EMPLOYEE__PASSWORD:
			setPassword((String) newValue);
			return;
		case EzProcessPackage.EMPLOYEE__ID:
			setId((Integer) newValue);
			return;
		case EzProcessPackage.EMPLOYEE__ASSIGNED_PROCESS:
			getAssignedProcess().clear();
			getAssignedProcess().addAll((Collection<? extends ezProcess.Process>) newValue);
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
		case EzProcessPackage.EMPLOYEE__FIRST_NAME:
			setFirstName(FIRST_NAME_EDEFAULT);
			return;
		case EzProcessPackage.EMPLOYEE__LAST_NAME:
			setLastName(LAST_NAME_EDEFAULT);
			return;
		case EzProcessPackage.EMPLOYEE__EMAIL:
			setEmail(EMAIL_EDEFAULT);
			return;
		case EzProcessPackage.EMPLOYEE__USER_NAME:
			setUserName(USER_NAME_EDEFAULT);
			return;
		case EzProcessPackage.EMPLOYEE__PASSWORD:
			setPassword(PASSWORD_EDEFAULT);
			return;
		case EzProcessPackage.EMPLOYEE__ID:
			setId(ID_EDEFAULT);
			return;
		case EzProcessPackage.EMPLOYEE__ASSIGNED_PROCESS:
			getAssignedProcess().clear();
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
		case EzProcessPackage.EMPLOYEE__FIRST_NAME:
			return FIRST_NAME_EDEFAULT == null ? firstName != null : !FIRST_NAME_EDEFAULT.equals(firstName);
		case EzProcessPackage.EMPLOYEE__LAST_NAME:
			return LAST_NAME_EDEFAULT == null ? lastName != null : !LAST_NAME_EDEFAULT.equals(lastName);
		case EzProcessPackage.EMPLOYEE__EMAIL:
			return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
		case EzProcessPackage.EMPLOYEE__USER_NAME:
			return USER_NAME_EDEFAULT == null ? userName != null : !USER_NAME_EDEFAULT.equals(userName);
		case EzProcessPackage.EMPLOYEE__PASSWORD:
			return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
		case EzProcessPackage.EMPLOYEE__ID:
			return id != ID_EDEFAULT;
		case EzProcessPackage.EMPLOYEE__ASSIGNED_PROCESS:
			return assignedProcess != null && !assignedProcess.isEmpty();
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
		result.append(" (firstName: ");
		result.append(firstName);
		result.append(", lastName: ");
		result.append(lastName);
		result.append(", email: ");
		result.append(email);
		result.append(", userName: ");
		result.append(userName);
		result.append(", password: ");
		result.append(password);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //EmployeeImpl
