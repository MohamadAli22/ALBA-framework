/**
 */
package Application.impl;

import Application.ApplicationPackage;
import Application.Fragment;
import Application.TBtoFrag;
import Application.TabBar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TBto Frag</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Application.impl.TBtoFragImpl#getTbtofSource <em>Tbtof Source</em>}</li>
 *   <li>{@link Application.impl.TBtoFragImpl#getTbtofTarget <em>Tbtof Target</em>}</li>
 *   <li>{@link Application.impl.TBtoFragImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TBtoFragImpl extends EObjectImpl implements TBtoFrag {
	/**
	 * The cached value of the '{@link #getTbtofSource() <em>Tbtof Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTbtofSource()
	 * @generated
	 * @ordered
	 */
	protected TabBar tbtofSource;

	/**
	 * The cached value of the '{@link #getTbtofTarget() <em>Tbtof Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTbtofTarget()
	 * @generated
	 * @ordered
	 */
	protected Fragment tbtofTarget;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "";

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
	protected TBtoFragImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApplicationPackage.Literals.TBTO_FRAG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TabBar getTbtofSource() {
		if (tbtofSource != null && tbtofSource.eIsProxy()) {
			InternalEObject oldTbtofSource = (InternalEObject)tbtofSource;
			tbtofSource = (TabBar)eResolveProxy(oldTbtofSource);
			if (tbtofSource != oldTbtofSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApplicationPackage.TBTO_FRAG__TBTOF_SOURCE, oldTbtofSource, tbtofSource));
			}
		}
		return tbtofSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TabBar basicGetTbtofSource() {
		return tbtofSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTbtofSource(TabBar newTbtofSource) {
		TabBar oldTbtofSource = tbtofSource;
		tbtofSource = newTbtofSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.TBTO_FRAG__TBTOF_SOURCE, oldTbtofSource, tbtofSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fragment getTbtofTarget() {
		if (tbtofTarget != null && tbtofTarget.eIsProxy()) {
			InternalEObject oldTbtofTarget = (InternalEObject)tbtofTarget;
			tbtofTarget = (Fragment)eResolveProxy(oldTbtofTarget);
			if (tbtofTarget != oldTbtofTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApplicationPackage.TBTO_FRAG__TBTOF_TARGET, oldTbtofTarget, tbtofTarget));
			}
		}
		return tbtofTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fragment basicGetTbtofTarget() {
		return tbtofTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTbtofTarget(Fragment newTbtofTarget) {
		Fragment oldTbtofTarget = tbtofTarget;
		tbtofTarget = newTbtofTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.TBTO_FRAG__TBTOF_TARGET, oldTbtofTarget, tbtofTarget));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.TBTO_FRAG__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApplicationPackage.TBTO_FRAG__TBTOF_SOURCE:
				if (resolve) return getTbtofSource();
				return basicGetTbtofSource();
			case ApplicationPackage.TBTO_FRAG__TBTOF_TARGET:
				if (resolve) return getTbtofTarget();
				return basicGetTbtofTarget();
			case ApplicationPackage.TBTO_FRAG__NAME:
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
			case ApplicationPackage.TBTO_FRAG__TBTOF_SOURCE:
				setTbtofSource((TabBar)newValue);
				return;
			case ApplicationPackage.TBTO_FRAG__TBTOF_TARGET:
				setTbtofTarget((Fragment)newValue);
				return;
			case ApplicationPackage.TBTO_FRAG__NAME:
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
			case ApplicationPackage.TBTO_FRAG__TBTOF_SOURCE:
				setTbtofSource((TabBar)null);
				return;
			case ApplicationPackage.TBTO_FRAG__TBTOF_TARGET:
				setTbtofTarget((Fragment)null);
				return;
			case ApplicationPackage.TBTO_FRAG__NAME:
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
			case ApplicationPackage.TBTO_FRAG__TBTOF_SOURCE:
				return tbtofSource != null;
			case ApplicationPackage.TBTO_FRAG__TBTOF_TARGET:
				return tbtofTarget != null;
			case ApplicationPackage.TBTO_FRAG__NAME:
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

} //TBtoFragImpl
