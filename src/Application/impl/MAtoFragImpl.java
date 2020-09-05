/**
 */
package Application.impl;

import Application.ApplicationPackage;
import Application.Fragment;
import Application.MAtoFrag;
import Application.MainActivity;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MAto Frag</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Application.impl.MAtoFragImpl#getMtofTarget <em>Mtof Target</em>}</li>
 *   <li>{@link Application.impl.MAtoFragImpl#getMtofSource <em>Mtof Source</em>}</li>
 *   <li>{@link Application.impl.MAtoFragImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MAtoFragImpl extends EObjectImpl implements MAtoFrag {
	/**
	 * The cached value of the '{@link #getMtofTarget() <em>Mtof Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMtofTarget()
	 * @generated
	 * @ordered
	 */
	protected Fragment mtofTarget;

	/**
	 * The cached value of the '{@link #getMtofSource() <em>Mtof Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMtofSource()
	 * @generated
	 * @ordered
	 */
	protected MainActivity mtofSource;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MAtoFragImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApplicationPackage.Literals.MATO_FRAG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fragment getMtofTarget() {
		if (mtofTarget != null && mtofTarget.eIsProxy()) {
			InternalEObject oldMtofTarget = (InternalEObject)mtofTarget;
			mtofTarget = (Fragment)eResolveProxy(oldMtofTarget);
			if (mtofTarget != oldMtofTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApplicationPackage.MATO_FRAG__MTOF_TARGET, oldMtofTarget, mtofTarget));
			}
		}
		return mtofTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fragment basicGetMtofTarget() {
		return mtofTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMtofTarget(Fragment newMtofTarget) {
		Fragment oldMtofTarget = mtofTarget;
		mtofTarget = newMtofTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.MATO_FRAG__MTOF_TARGET, oldMtofTarget, mtofTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainActivity getMtofSource() {
		if (mtofSource != null && mtofSource.eIsProxy()) {
			InternalEObject oldMtofSource = (InternalEObject)mtofSource;
			mtofSource = (MainActivity)eResolveProxy(oldMtofSource);
			if (mtofSource != oldMtofSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApplicationPackage.MATO_FRAG__MTOF_SOURCE, oldMtofSource, mtofSource));
			}
		}
		return mtofSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainActivity basicGetMtofSource() {
		return mtofSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMtofSource(MainActivity newMtofSource) {
		MainActivity oldMtofSource = mtofSource;
		mtofSource = newMtofSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.MATO_FRAG__MTOF_SOURCE, oldMtofSource, mtofSource));
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.MATO_FRAG__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApplicationPackage.MATO_FRAG__MTOF_TARGET:
				if (resolve) return getMtofTarget();
				return basicGetMtofTarget();
			case ApplicationPackage.MATO_FRAG__MTOF_SOURCE:
				if (resolve) return getMtofSource();
				return basicGetMtofSource();
			case ApplicationPackage.MATO_FRAG__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ApplicationPackage.MATO_FRAG__MTOF_TARGET:
				setMtofTarget((Fragment)newValue);
				return;
			case ApplicationPackage.MATO_FRAG__MTOF_SOURCE:
				setMtofSource((MainActivity)newValue);
				return;
			case ApplicationPackage.MATO_FRAG__NAME:
				setName((String)newValue);
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
			case ApplicationPackage.MATO_FRAG__MTOF_TARGET:
				setMtofTarget((Fragment)null);
				return;
			case ApplicationPackage.MATO_FRAG__MTOF_SOURCE:
				setMtofSource((MainActivity)null);
				return;
			case ApplicationPackage.MATO_FRAG__NAME:
				setName(NAME_EDEFAULT);
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
			case ApplicationPackage.MATO_FRAG__MTOF_TARGET:
				return mtofTarget != null;
			case ApplicationPackage.MATO_FRAG__MTOF_SOURCE:
				return mtofSource != null;
			case ApplicationPackage.MATO_FRAG__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //MAtoFragImpl
