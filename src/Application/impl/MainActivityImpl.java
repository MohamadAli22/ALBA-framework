/**
 */
package Application.impl;

import Application.ApplicationPackage;
import Application.MainActivity;
import Application.NavigationDrawer;
import Application.TabBar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Main Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Application.impl.MainActivityImpl#getHasNav <em>Has Nav</em>}</li>
 *   <li>{@link Application.impl.MainActivityImpl#getHasBar <em>Has Bar</em>}</li>
 *   <li>{@link Application.impl.MainActivityImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MainActivityImpl extends EObjectImpl implements MainActivity {
	/**
	 * The cached value of the '{@link #getHasNav() <em>Has Nav</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasNav()
	 * @generated
	 * @ordered
	 */
	protected NavigationDrawer hasNav;

	/**
	 * The cached value of the '{@link #getHasBar() <em>Has Bar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasBar()
	 * @generated
	 * @ordered
	 */
	protected TabBar hasBar;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "MyMainActivity";

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
	protected MainActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApplicationPackage.Literals.MAIN_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavigationDrawer getHasNav() {
		return hasNav;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasNav(NavigationDrawer newHasNav, NotificationChain msgs) {
		NavigationDrawer oldHasNav = hasNav;
		hasNav = newHasNav;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplicationPackage.MAIN_ACTIVITY__HAS_NAV, oldHasNav, newHasNav);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasNav(NavigationDrawer newHasNav) {
		if (newHasNav != hasNav) {
			NotificationChain msgs = null;
			if (hasNav != null)
				msgs = ((InternalEObject)hasNav).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.MAIN_ACTIVITY__HAS_NAV, null, msgs);
			if (newHasNav != null)
				msgs = ((InternalEObject)newHasNav).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.MAIN_ACTIVITY__HAS_NAV, null, msgs);
			msgs = basicSetHasNav(newHasNav, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.MAIN_ACTIVITY__HAS_NAV, newHasNav, newHasNav));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TabBar getHasBar() {
		return hasBar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasBar(TabBar newHasBar, NotificationChain msgs) {
		TabBar oldHasBar = hasBar;
		hasBar = newHasBar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplicationPackage.MAIN_ACTIVITY__HAS_BAR, oldHasBar, newHasBar);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasBar(TabBar newHasBar) {
		if (newHasBar != hasBar) {
			NotificationChain msgs = null;
			if (hasBar != null)
				msgs = ((InternalEObject)hasBar).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.MAIN_ACTIVITY__HAS_BAR, null, msgs);
			if (newHasBar != null)
				msgs = ((InternalEObject)newHasBar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.MAIN_ACTIVITY__HAS_BAR, null, msgs);
			msgs = basicSetHasBar(newHasBar, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.MAIN_ACTIVITY__HAS_BAR, newHasBar, newHasBar));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.MAIN_ACTIVITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApplicationPackage.MAIN_ACTIVITY__HAS_NAV:
				return basicSetHasNav(null, msgs);
			case ApplicationPackage.MAIN_ACTIVITY__HAS_BAR:
				return basicSetHasBar(null, msgs);
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
			case ApplicationPackage.MAIN_ACTIVITY__HAS_NAV:
				return getHasNav();
			case ApplicationPackage.MAIN_ACTIVITY__HAS_BAR:
				return getHasBar();
			case ApplicationPackage.MAIN_ACTIVITY__NAME:
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
			case ApplicationPackage.MAIN_ACTIVITY__HAS_NAV:
				setHasNav((NavigationDrawer)newValue);
				return;
			case ApplicationPackage.MAIN_ACTIVITY__HAS_BAR:
				setHasBar((TabBar)newValue);
				return;
			case ApplicationPackage.MAIN_ACTIVITY__NAME:
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
			case ApplicationPackage.MAIN_ACTIVITY__HAS_NAV:
				setHasNav((NavigationDrawer)null);
				return;
			case ApplicationPackage.MAIN_ACTIVITY__HAS_BAR:
				setHasBar((TabBar)null);
				return;
			case ApplicationPackage.MAIN_ACTIVITY__NAME:
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
			case ApplicationPackage.MAIN_ACTIVITY__HAS_NAV:
				return hasNav != null;
			case ApplicationPackage.MAIN_ACTIVITY__HAS_BAR:
				return hasBar != null;
			case ApplicationPackage.MAIN_ACTIVITY__NAME:
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

} //MainActivityImpl
