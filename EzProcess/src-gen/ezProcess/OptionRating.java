/**
 */
package ezProcess;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Option Rating</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ezProcess.OptionRating#getTooltipArray <em>Tooltip Array</em>}</li>
 *   <li>{@link ezProcess.OptionRating#getID <em>ID</em>}</li>
 *   <li>{@link ezProcess.OptionRating#getHasThreshold <em>Has Threshold</em>}</li>
 *   <li>{@link ezProcess.OptionRating#getIsAbout <em>Is About</em>}</li>
 * </ul>
 *
 * @see ezProcess.EzProcessPackage#getOptionRating()
 * @model
 * @generated
 */
public interface OptionRating extends EObject {
	/**
	 * Returns the value of the '<em><b>Tooltip Array</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tooltip Array</em>' attribute list.
	 * @see ezProcess.EzProcessPackage#getOptionRating_TooltipArray()
	 * @model required="true" upper="10"
	 * @generated
	 */
	EList<String> getTooltipArray();

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(int)
	 * @see ezProcess.EzProcessPackage#getOptionRating_ID()
	 * @model required="true"
	 * @generated
	 */
	int getID();

	/**
	 * Sets the value of the '{@link ezProcess.OptionRating#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(int value);

	/**
	 * Returns the value of the '<em><b>Has Threshold</b></em>' containment reference list.
	 * The list contents are of type {@link ezProcess.OptionThreshold}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Threshold</em>' containment reference list.
	 * @see ezProcess.EzProcessPackage#getOptionRating_HasThreshold()
	 * @model containment="true"
	 * @generated
	 */
	EList<OptionThreshold> getHasThreshold();

	/**
	 * Returns the value of the '<em><b>Is About</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is About</em>' reference.
	 * @see #setIsAbout(Question)
	 * @see ezProcess.EzProcessPackage#getOptionRating_IsAbout()
	 * @model required="true"
	 * @generated
	 */
	Question getIsAbout();

	/**
	 * Sets the value of the '{@link ezProcess.OptionRating#getIsAbout <em>Is About</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is About</em>' reference.
	 * @see #getIsAbout()
	 * @generated
	 */
	void setIsAbout(Question value);

} // OptionRating
