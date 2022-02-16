/**
 */
package ezProcess;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Candidate Field Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ezProcess.EzProcessPackage#getCandidateFieldType()
 * @model
 * @generated
 */
public enum CandidateFieldType implements Enumerator {
	/**
	 * The '<em><b>FIRST NAME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIRST_NAME_VALUE
	 * @generated
	 * @ordered
	 */
	FIRST_NAME(0, "FIRST_NAME", "FIRST_NAME"),

	/**
	 * The '<em><b>LAST NAME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LAST_NAME_VALUE
	 * @generated
	 * @ordered
	 */
	LAST_NAME(1, "LAST_NAME", "LAST_NAME");

	/**
	 * The '<em><b>FIRST NAME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIRST_NAME
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FIRST_NAME_VALUE = 0;

	/**
	 * The '<em><b>LAST NAME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LAST_NAME
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LAST_NAME_VALUE = 1;

	/**
	 * An array of all the '<em><b>Candidate Field Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CandidateFieldType[] VALUES_ARRAY = new CandidateFieldType[] { FIRST_NAME, LAST_NAME, };

	/**
	 * A public read-only list of all the '<em><b>Candidate Field Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CandidateFieldType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Candidate Field Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CandidateFieldType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CandidateFieldType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Candidate Field Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CandidateFieldType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CandidateFieldType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Candidate Field Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CandidateFieldType get(int value) {
		switch (value) {
		case FIRST_NAME_VALUE:
			return FIRST_NAME;
		case LAST_NAME_VALUE:
			return LAST_NAME;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private CandidateFieldType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //CandidateFieldType
