/**
 */
package ezProcess.impl;

import ezProcess.App;
import ezProcess.Employee;
import ezProcess.EzProcessPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>App</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ezProcess.impl.AppImpl#getHasEmployee <em>Has Employee</em>}</li>
 *   <li>{@link ezProcess.impl.AppImpl#getHasProcess <em>Has Process</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AppImpl extends MinimalEObjectImpl.Container implements App {
	/**
	 * The cached value of the '{@link #getHasEmployee() <em>Has Employee</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasEmployee()
	 * @generated
	 * @ordered
	 */
	protected EList<Employee> hasEmployee;

	/**
	 * The cached value of the '{@link #getHasProcess() <em>Has Process</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasProcess()
	 * @generated
	 * @ordered
	 */
	protected EList<ezProcess.Process> hasProcess;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AppImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzProcessPackage.Literals.APP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Employee> getHasEmployee() {
		if (hasEmployee == null) {
			hasEmployee = new EObjectContainmentEList<Employee>(Employee.class, this,
					EzProcessPackage.APP__HAS_EMPLOYEE);
		}
		return hasEmployee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ezProcess.Process> getHasProcess() {
		if (hasProcess == null) {
			hasProcess = new EObjectContainmentEList<ezProcess.Process>(ezProcess.Process.class, this,
					EzProcessPackage.APP__HAS_PROCESS);
		}
		return hasProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EzProcessPackage.APP__HAS_EMPLOYEE:
			return ((InternalEList<?>) getHasEmployee()).basicRemove(otherEnd, msgs);
		case EzProcessPackage.APP__HAS_PROCESS:
			return ((InternalEList<?>) getHasProcess()).basicRemove(otherEnd, msgs);
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
		case EzProcessPackage.APP__HAS_EMPLOYEE:
			return getHasEmployee();
		case EzProcessPackage.APP__HAS_PROCESS:
			return getHasProcess();
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
		case EzProcessPackage.APP__HAS_EMPLOYEE:
			getHasEmployee().clear();
			getHasEmployee().addAll((Collection<? extends Employee>) newValue);
			return;
		case EzProcessPackage.APP__HAS_PROCESS:
			getHasProcess().clear();
			getHasProcess().addAll((Collection<? extends ezProcess.Process>) newValue);
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
		case EzProcessPackage.APP__HAS_EMPLOYEE:
			getHasEmployee().clear();
			return;
		case EzProcessPackage.APP__HAS_PROCESS:
			getHasProcess().clear();
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
		case EzProcessPackage.APP__HAS_EMPLOYEE:
			return hasEmployee != null && !hasEmployee.isEmpty();
		case EzProcessPackage.APP__HAS_PROCESS:
			return hasProcess != null && !hasProcess.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AppImpl
