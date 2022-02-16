/**
 */
package ezProcess;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ezProcess.Process#getName <em>Name</em>}</li>
 *   <li>{@link ezProcess.Process#getHasPage <em>Has Page</em>}</li>
 * </ul>
 *
 * @see ezProcess.EzProcessPackage#getProcess()
 * @model abstract="true"
 * @generated
 */
public interface Process extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ezProcess.EzProcessPackage#getProcess_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ezProcess.Process#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Has Page</b></em>' containment reference list.
	 * The list contents are of type {@link ezProcess.Page}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Page</em>' containment reference list.
	 * @see ezProcess.EzProcessPackage#getProcess_HasPage()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Page> getHasPage();

} // Process
