/**
 */
package Application.impl;

import Application.APP;
import Application.ApplicationPackage;
import Application.Config;
import Application.Fragment;
import Application.MAtoFrag;
import Application.MainActivity;
import Application.NDtoFrag;
import Application.TBtoFrag;
import Application.Theme;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>APP</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Application.impl.APPImpl#getHasConf <em>Has Conf</em>}</li>
 *   <li>{@link Application.impl.APPImpl#getHasMainActivity <em>Has Main Activity</em>}</li>
 *   <li>{@link Application.impl.APPImpl#getAppName <em>App Name</em>}</li>
 *   <li>{@link Application.impl.APPImpl#getHasTheme <em>Has Theme</em>}</li>
 *   <li>{@link Application.impl.APPImpl#getHasFrag <em>Has Frag</em>}</li>
 *   <li>{@link Application.impl.APPImpl#getMAhasFragment <em>MAhas Fragment</em>}</li>
 *   <li>{@link Application.impl.APPImpl#getTBhasFragment <em>TBhas Fragment</em>}</li>
 *   <li>{@link Application.impl.APPImpl#getNDhasFragment <em>NDhas Fragment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class APPImpl extends EObjectImpl implements APP {
	/**
	 * The cached value of the '{@link #getHasConf() <em>Has Conf</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasConf()
	 * @generated
	 * @ordered
	 */
	protected Config hasConf;

	/**
	 * The cached value of the '{@link #getHasMainActivity() <em>Has Main Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasMainActivity()
	 * @generated
	 * @ordered
	 */
	protected MainActivity hasMainActivity;

	/**
	 * The default value of the '{@link #getAppName() <em>App Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppName()
	 * @generated
	 * @ordered
	 */
	protected static final String APP_NAME_EDEFAULT = "appName";

	/**
	 * The cached value of the '{@link #getAppName() <em>App Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppName()
	 * @generated
	 * @ordered
	 */
	protected String appName = APP_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasTheme() <em>Has Theme</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasTheme()
	 * @generated
	 * @ordered
	 */
	protected Theme hasTheme;

	/**
	 * The cached value of the '{@link #getHasFrag() <em>Has Frag</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasFrag()
	 * @generated
	 * @ordered
	 */
	protected EList<Fragment> hasFrag;

	/**
	 * The cached value of the '{@link #getMAhasFragment() <em>MAhas Fragment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMAhasFragment()
	 * @generated
	 * @ordered
	 */
	protected EList<MAtoFrag> mAhasFragment;

	/**
	 * The cached value of the '{@link #getTBhasFragment() <em>TBhas Fragment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTBhasFragment()
	 * @generated
	 * @ordered
	 */
	protected EList<TBtoFrag> tBhasFragment;

	/**
	 * The cached value of the '{@link #getNDhasFragment() <em>NDhas Fragment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNDhasFragment()
	 * @generated
	 * @ordered
	 */
	protected EList<NDtoFrag> nDhasFragment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected APPImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApplicationPackage.Literals.APP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Config getHasConf() {
		return hasConf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasConf(Config newHasConf, NotificationChain msgs) {
		Config oldHasConf = hasConf;
		hasConf = newHasConf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplicationPackage.APP__HAS_CONF, oldHasConf, newHasConf);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasConf(Config newHasConf) {
		if (newHasConf != hasConf) {
			NotificationChain msgs = null;
			if (hasConf != null)
				msgs = ((InternalEObject)hasConf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.APP__HAS_CONF, null, msgs);
			if (newHasConf != null)
				msgs = ((InternalEObject)newHasConf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.APP__HAS_CONF, null, msgs);
			msgs = basicSetHasConf(newHasConf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.APP__HAS_CONF, newHasConf, newHasConf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainActivity getHasMainActivity() {
		return hasMainActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasMainActivity(MainActivity newHasMainActivity, NotificationChain msgs) {
		MainActivity oldHasMainActivity = hasMainActivity;
		hasMainActivity = newHasMainActivity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplicationPackage.APP__HAS_MAIN_ACTIVITY, oldHasMainActivity, newHasMainActivity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasMainActivity(MainActivity newHasMainActivity) {
		if (newHasMainActivity != hasMainActivity) {
			NotificationChain msgs = null;
			if (hasMainActivity != null)
				msgs = ((InternalEObject)hasMainActivity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.APP__HAS_MAIN_ACTIVITY, null, msgs);
			if (newHasMainActivity != null)
				msgs = ((InternalEObject)newHasMainActivity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.APP__HAS_MAIN_ACTIVITY, null, msgs);
			msgs = basicSetHasMainActivity(newHasMainActivity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.APP__HAS_MAIN_ACTIVITY, newHasMainActivity, newHasMainActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAppName() {
		return appName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppName(String newAppName) {
		String oldAppName = appName;
		appName = newAppName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.APP__APP_NAME, oldAppName, appName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Theme getHasTheme() {
		return hasTheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasTheme(Theme newHasTheme, NotificationChain msgs) {
		Theme oldHasTheme = hasTheme;
		hasTheme = newHasTheme;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplicationPackage.APP__HAS_THEME, oldHasTheme, newHasTheme);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasTheme(Theme newHasTheme) {
		if (newHasTheme != hasTheme) {
			NotificationChain msgs = null;
			if (hasTheme != null)
				msgs = ((InternalEObject)hasTheme).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.APP__HAS_THEME, null, msgs);
			if (newHasTheme != null)
				msgs = ((InternalEObject)newHasTheme).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.APP__HAS_THEME, null, msgs);
			msgs = basicSetHasTheme(newHasTheme, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.APP__HAS_THEME, newHasTheme, newHasTheme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Fragment> getHasFrag() {
		if (hasFrag == null) {
			hasFrag = new EObjectContainmentEList<Fragment>(Fragment.class, this, ApplicationPackage.APP__HAS_FRAG);
		}
		return hasFrag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MAtoFrag> getMAhasFragment() {
		if (mAhasFragment == null) {
			mAhasFragment = new EObjectContainmentEList<MAtoFrag>(MAtoFrag.class, this, ApplicationPackage.APP__MAHAS_FRAGMENT);
		}
		return mAhasFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TBtoFrag> getTBhasFragment() {
		if (tBhasFragment == null) {
			tBhasFragment = new EObjectContainmentEList<TBtoFrag>(TBtoFrag.class, this, ApplicationPackage.APP__TBHAS_FRAGMENT);
		}
		return tBhasFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NDtoFrag> getNDhasFragment() {
		if (nDhasFragment == null) {
			nDhasFragment = new EObjectContainmentEList<NDtoFrag>(NDtoFrag.class, this, ApplicationPackage.APP__NDHAS_FRAGMENT);
		}
		return nDhasFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApplicationPackage.APP__HAS_CONF:
				return basicSetHasConf(null, msgs);
			case ApplicationPackage.APP__HAS_MAIN_ACTIVITY:
				return basicSetHasMainActivity(null, msgs);
			case ApplicationPackage.APP__HAS_THEME:
				return basicSetHasTheme(null, msgs);
			case ApplicationPackage.APP__HAS_FRAG:
				return ((InternalEList<?>)getHasFrag()).basicRemove(otherEnd, msgs);
			case ApplicationPackage.APP__MAHAS_FRAGMENT:
				return ((InternalEList<?>)getMAhasFragment()).basicRemove(otherEnd, msgs);
			case ApplicationPackage.APP__TBHAS_FRAGMENT:
				return ((InternalEList<?>)getTBhasFragment()).basicRemove(otherEnd, msgs);
			case ApplicationPackage.APP__NDHAS_FRAGMENT:
				return ((InternalEList<?>)getNDhasFragment()).basicRemove(otherEnd, msgs);
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
			case ApplicationPackage.APP__HAS_CONF:
				return getHasConf();
			case ApplicationPackage.APP__HAS_MAIN_ACTIVITY:
				return getHasMainActivity();
			case ApplicationPackage.APP__APP_NAME:
				return getAppName();
			case ApplicationPackage.APP__HAS_THEME:
				return getHasTheme();
			case ApplicationPackage.APP__HAS_FRAG:
				return getHasFrag();
			case ApplicationPackage.APP__MAHAS_FRAGMENT:
				return getMAhasFragment();
			case ApplicationPackage.APP__TBHAS_FRAGMENT:
				return getTBhasFragment();
			case ApplicationPackage.APP__NDHAS_FRAGMENT:
				return getNDhasFragment();
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
			case ApplicationPackage.APP__HAS_CONF:
				setHasConf((Config)newValue);
				return;
			case ApplicationPackage.APP__HAS_MAIN_ACTIVITY:
				setHasMainActivity((MainActivity)newValue);
				return;
			case ApplicationPackage.APP__APP_NAME:
				setAppName((String)newValue);
				return;
			case ApplicationPackage.APP__HAS_THEME:
				setHasTheme((Theme)newValue);
				return;
			case ApplicationPackage.APP__HAS_FRAG:
				getHasFrag().clear();
				getHasFrag().addAll((Collection<? extends Fragment>)newValue);
				return;
			case ApplicationPackage.APP__MAHAS_FRAGMENT:
				getMAhasFragment().clear();
				getMAhasFragment().addAll((Collection<? extends MAtoFrag>)newValue);
				return;
			case ApplicationPackage.APP__TBHAS_FRAGMENT:
				getTBhasFragment().clear();
				getTBhasFragment().addAll((Collection<? extends TBtoFrag>)newValue);
				return;
			case ApplicationPackage.APP__NDHAS_FRAGMENT:
				getNDhasFragment().clear();
				getNDhasFragment().addAll((Collection<? extends NDtoFrag>)newValue);
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
			case ApplicationPackage.APP__HAS_CONF:
				setHasConf((Config)null);
				return;
			case ApplicationPackage.APP__HAS_MAIN_ACTIVITY:
				setHasMainActivity((MainActivity)null);
				return;
			case ApplicationPackage.APP__APP_NAME:
				setAppName(APP_NAME_EDEFAULT);
				return;
			case ApplicationPackage.APP__HAS_THEME:
				setHasTheme((Theme)null);
				return;
			case ApplicationPackage.APP__HAS_FRAG:
				getHasFrag().clear();
				return;
			case ApplicationPackage.APP__MAHAS_FRAGMENT:
				getMAhasFragment().clear();
				return;
			case ApplicationPackage.APP__TBHAS_FRAGMENT:
				getTBhasFragment().clear();
				return;
			case ApplicationPackage.APP__NDHAS_FRAGMENT:
				getNDhasFragment().clear();
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
			case ApplicationPackage.APP__HAS_CONF:
				return hasConf != null;
			case ApplicationPackage.APP__HAS_MAIN_ACTIVITY:
				return hasMainActivity != null;
			case ApplicationPackage.APP__APP_NAME:
				return APP_NAME_EDEFAULT == null ? appName != null : !APP_NAME_EDEFAULT.equals(appName);
			case ApplicationPackage.APP__HAS_THEME:
				return hasTheme != null;
			case ApplicationPackage.APP__HAS_FRAG:
				return hasFrag != null && !hasFrag.isEmpty();
			case ApplicationPackage.APP__MAHAS_FRAGMENT:
				return mAhasFragment != null && !mAhasFragment.isEmpty();
			case ApplicationPackage.APP__TBHAS_FRAGMENT:
				return tBhasFragment != null && !tBhasFragment.isEmpty();
			case ApplicationPackage.APP__NDHAS_FRAGMENT:
				return nDhasFragment != null && !nDhasFragment.isEmpty();
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
		result.append(" (appName: ");
		result.append(appName);
		result.append(')');
		return result.toString();
	}

} //APPImpl
