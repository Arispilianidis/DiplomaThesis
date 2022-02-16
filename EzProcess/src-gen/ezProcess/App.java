/**
 */
package ezProcess;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>App</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ezProcess.App#getHasEmployee <em>Has Employee</em>}</li>
 *   <li>{@link ezProcess.App#getHasProcess <em>Has Process</em>}</li>
 * </ul>
 *
 * @see ezProcess.EzProcessPackage#getApp()
 * @model
 * @generated
 */
public interface App extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Employee</b></em>' containment reference list.
	 * The list contents are of type {@link ezProcess.Employee}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Employee</em>' containment reference list.
	 * @see ezProcess.EzProcessPackage#getApp_HasEmployee()
	 * @model containment="true"
	 * @generated
	 */
	EList<Employee> getHasEmployee();

	/**
	 * Returns the value of the '<em><b>Has Process</b></em>' containment reference list.
	 * The list contents are of type {@link ezProcess.Process}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Process</em>' containment reference list.
	 * @see ezProcess.EzProcessPackage#getApp_HasProcess()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ezProcess.Process> getHasProcess();

} // App
