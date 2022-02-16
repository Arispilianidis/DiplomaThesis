/**
 */
package ezProcess;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Employee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ezProcess.Employee#getFirstName <em>First Name</em>}</li>
 *   <li>{@link ezProcess.Employee#getLastName <em>Last Name</em>}</li>
 *   <li>{@link ezProcess.Employee#getEmail <em>Email</em>}</li>
 *   <li>{@link ezProcess.Employee#getUserName <em>User Name</em>}</li>
 *   <li>{@link ezProcess.Employee#getPassword <em>Password</em>}</li>
 *   <li>{@link ezProcess.Employee#getId <em>Id</em>}</li>
 *   <li>{@link ezProcess.Employee#getAssignedProcess <em>Assigned Process</em>}</li>
 * </ul>
 *
 * @see ezProcess.EzProcessPackage#getEmployee()
 * @model
 * @generated
 */
public interface Employee extends EObject {
	/**
	 * Returns the value of the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Name</em>' attribute.
	 * @see #setFirstName(String)
	 * @see ezProcess.EzProcessPackage#getEmployee_FirstName()
	 * @model
	 * @generated
	 */
	String getFirstName();

	/**
	 * Sets the value of the '{@link ezProcess.Employee#getFirstName <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Name</em>' attribute.
	 * @see #getFirstName()
	 * @generated
	 */
	void setFirstName(String value);

	/**
	 * Returns the value of the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Name</em>' attribute.
	 * @see #setLastName(String)
	 * @see ezProcess.EzProcessPackage#getEmployee_LastName()
	 * @model
	 * @generated
	 */
	String getLastName();

	/**
	 * Sets the value of the '{@link ezProcess.Employee#getLastName <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Name</em>' attribute.
	 * @see #getLastName()
	 * @generated
	 */
	void setLastName(String value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see ezProcess.EzProcessPackage#getEmployee_Email()
	 * @model
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link ezProcess.Employee#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Name</em>' attribute.
	 * @see #setUserName(String)
	 * @see ezProcess.EzProcessPackage#getEmployee_UserName()
	 * @model required="true"
	 * @generated
	 */
	String getUserName();

	/**
	 * Sets the value of the '{@link ezProcess.Employee#getUserName <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Name</em>' attribute.
	 * @see #getUserName()
	 * @generated
	 */
	void setUserName(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see ezProcess.EzProcessPackage#getEmployee_Password()
	 * @model required="true"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link ezProcess.Employee#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see ezProcess.EzProcessPackage#getEmployee_Id()
	 * @model required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link ezProcess.Employee#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Assigned Process</b></em>' reference list.
	 * The list contents are of type {@link ezProcess.Process}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigned Process</em>' reference list.
	 * @see ezProcess.EzProcessPackage#getEmployee_AssignedProcess()
	 * @model required="true"
	 * @generated
	 */
	EList<ezProcess.Process> getAssignedProcess();

} // Employee
