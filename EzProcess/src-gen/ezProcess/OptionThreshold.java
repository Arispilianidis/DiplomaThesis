/**
 */
package ezProcess;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Option Threshold</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ezProcess.OptionThreshold#getMin <em>Min</em>}</li>
 *   <li>{@link ezProcess.OptionThreshold#getMax <em>Max</em>}</li>
 *   <li>{@link ezProcess.OptionThreshold#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see ezProcess.EzProcessPackage#getOptionThreshold()
 * @model
 * @generated
 */
public interface OptionThreshold extends EObject {
	/**
	 * Returns the value of the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' attribute.
	 * @see #setMin(int)
	 * @see ezProcess.EzProcessPackage#getOptionThreshold_Min()
	 * @model required="true"
	 * @generated
	 */
	int getMin();

	/**
	 * Sets the value of the '{@link ezProcess.OptionThreshold#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' attribute.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(int value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' attribute.
	 * @see #setMax(int)
	 * @see ezProcess.EzProcessPackage#getOptionThreshold_Max()
	 * @model required="true"
	 * @generated
	 */
	int getMax();

	/**
	 * Sets the value of the '{@link ezProcess.OptionThreshold#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(int value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute list.
	 * @see ezProcess.EzProcessPackage#getOptionThreshold_Text()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getText();

} // OptionThreshold
