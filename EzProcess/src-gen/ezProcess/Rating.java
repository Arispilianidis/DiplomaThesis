/**
 */
package ezProcess;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rating</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ezProcess.Rating#getTooltipArray <em>Tooltip Array</em>}</li>
 * </ul>
 *
 * @see ezProcess.EzProcessPackage#getRating()
 * @model
 * @generated
 */
public interface Rating extends EObject {
	/**
	 * Returns the value of the '<em><b>Tooltip Array</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tooltip Array</em>' attribute list.
	 * @see ezProcess.EzProcessPackage#getRating_TooltipArray()
	 * @model required="true" upper="10"
	 * @generated
	 */
	EList<String> getTooltipArray();

} // Rating
