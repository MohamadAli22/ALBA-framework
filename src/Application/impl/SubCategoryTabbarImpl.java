/**
 */
package Application.impl;

import Application.Api;
import Application.ApplicationPackage;
import Application.SubCategoryTabbar;
import Application.Tab;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Category Tabbar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Application.impl.SubCategoryTabbarImpl#getTabTextColor <em>Tab Text Color</em>}</li>
 *   <li>{@link Application.impl.SubCategoryTabbarImpl#getTabIndicatorColor <em>Tab Indicator Color</em>}</li>
 *   <li>{@link Application.impl.SubCategoryTabbarImpl#getName <em>Name</em>}</li>
 *   <li>{@link Application.impl.SubCategoryTabbarImpl#getHasAPi <em>Has APi</em>}</li>
 *   <li>{@link Application.impl.SubCategoryTabbarImpl#getHasTabs <em>Has Tabs</em>}</li>
 *   <li>{@link Application.impl.SubCategoryTabbarImpl#getTabSelectedTextColor <em>Tab Selected Text Color</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubCategoryTabbarImpl extends EObjectImpl implements SubCategoryTabbar {
	/**
	 * The default value of the '{@link #getTabTextColor() <em>Tab Text Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTabTextColor()
	 * @generated
	 * @ordered
	 */
	protected static final String TAB_TEXT_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTabTextColor() <em>Tab Text Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTabTextColor()
	 * @generated
	 * @ordered
	 */
	protected String tabTextColor = TAB_TEXT_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTabIndicatorColor() <em>Tab Indicator Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTabIndicatorColor()
	 * @generated
	 * @ordered
	 */
	protected static final String TAB_INDICATOR_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTabIndicatorColor() <em>Tab Indicator Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTabIndicatorColor()
	 * @generated
	 * @ordered
	 */
	protected String tabIndicatorColor = TAB_INDICATOR_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "MySubCat";

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
	 * The cached value of the '{@link #getHasAPi() <em>Has APi</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasAPi()
	 * @generated
	 * @ordered
	 */
	protected Api hasAPi;

	/**
	 * The cached value of the '{@link #getHasTabs() <em>Has Tabs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasTabs()
	 * @generated
	 * @ordered
	 */
	protected Tab hasTabs;

	/**
	 * The default value of the '{@link #getTabSelectedTextColor() <em>Tab Selected Text Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTabSelectedTextColor()
	 * @generated
	 * @ordered
	 */
	protected static final String TAB_SELECTED_TEXT_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTabSelectedTextColor() <em>Tab Selected Text Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTabSelectedTextColor()
	 * @generated
	 * @ordered
	 */
	protected String tabSelectedTextColor = TAB_SELECTED_TEXT_COLOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubCategoryTabbarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApplicationPackage.Literals.SUB_CATEGORY_TABBAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTabTextColor() {
		return tabTextColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTabTextColor(String newTabTextColor) {
		String oldTabTextColor = tabTextColor;
		tabTextColor = newTabTextColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.SUB_CATEGORY_TABBAR__TAB_TEXT_COLOR, oldTabTextColor, tabTextColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTabIndicatorColor() {
		return tabIndicatorColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTabIndicatorColor(String newTabIndicatorColor) {
		String oldTabIndicatorColor = tabIndicatorColor;
		tabIndicatorColor = newTabIndicatorColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.SUB_CATEGORY_TABBAR__TAB_INDICATOR_COLOR, oldTabIndicatorColor, tabIndicatorColor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.SUB_CATEGORY_TABBAR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Api getHasAPi() {
		return hasAPi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasAPi(Api newHasAPi, NotificationChain msgs) {
		Api oldHasAPi = hasAPi;
		hasAPi = newHasAPi;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplicationPackage.SUB_CATEGORY_TABBAR__HAS_API, oldHasAPi, newHasAPi);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasAPi(Api newHasAPi) {
		if (newHasAPi != hasAPi) {
			NotificationChain msgs = null;
			if (hasAPi != null)
				msgs = ((InternalEObject)hasAPi).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.SUB_CATEGORY_TABBAR__HAS_API, null, msgs);
			if (newHasAPi != null)
				msgs = ((InternalEObject)newHasAPi).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.SUB_CATEGORY_TABBAR__HAS_API, null, msgs);
			msgs = basicSetHasAPi(newHasAPi, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.SUB_CATEGORY_TABBAR__HAS_API, newHasAPi, newHasAPi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tab getHasTabs() {
		return hasTabs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasTabs(Tab newHasTabs, NotificationChain msgs) {
		Tab oldHasTabs = hasTabs;
		hasTabs = newHasTabs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplicationPackage.SUB_CATEGORY_TABBAR__HAS_TABS, oldHasTabs, newHasTabs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasTabs(Tab newHasTabs) {
		if (newHasTabs != hasTabs) {
			NotificationChain msgs = null;
			if (hasTabs != null)
				msgs = ((InternalEObject)hasTabs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.SUB_CATEGORY_TABBAR__HAS_TABS, null, msgs);
			if (newHasTabs != null)
				msgs = ((InternalEObject)newHasTabs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.SUB_CATEGORY_TABBAR__HAS_TABS, null, msgs);
			msgs = basicSetHasTabs(newHasTabs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.SUB_CATEGORY_TABBAR__HAS_TABS, newHasTabs, newHasTabs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTabSelectedTextColor() {
		return tabSelectedTextColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTabSelectedTextColor(String newTabSelectedTextColor) {
		String oldTabSelectedTextColor = tabSelectedTextColor;
		tabSelectedTextColor = newTabSelectedTextColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.SUB_CATEGORY_TABBAR__TAB_SELECTED_TEXT_COLOR, oldTabSelectedTextColor, tabSelectedTextColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApplicationPackage.SUB_CATEGORY_TABBAR__HAS_API:
				return basicSetHasAPi(null, msgs);
			case ApplicationPackage.SUB_CATEGORY_TABBAR__HAS_TABS:
				return basicSetHasTabs(null, msgs);
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
			case ApplicationPackage.SUB_CATEGORY_TABBAR__TAB_TEXT_COLOR:
				return getTabTextColor();
			case ApplicationPackage.SUB_CATEGORY_TABBAR__TAB_INDICATOR_COLOR:
				return getTabIndicatorColor();
			case ApplicationPackage.SUB_CATEGORY_TABBAR__NAME:
				return getName();
			case ApplicationPackage.SUB_CATEGORY_TABBAR__HAS_API:
				return getHasAPi();
			case ApplicationPackage.SUB_CATEGORY_TABBAR__HAS_TABS:
				return getHasTabs();
			case ApplicationPackage.SUB_CATEGORY_TABBAR__TAB_SELECTED_TEXT_COLOR:
				return getTabSelectedTextColor();
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
			case ApplicationPackage.SUB_CATEGORY_TABBAR__TAB_TEXT_COLOR:
				setTabTextColor((String)newValue);
				return;
			case ApplicationPackage.SUB_CATEGORY_TABBAR__TAB_INDICATOR_COLOR:
				setTabIndicatorColor((String)newValue);
				return;
			case ApplicationPackage.SUB_CATEGORY_TABBAR__NAME:
				setName((String)newValue);
				return;
			case ApplicationPackage.SUB_CATEGORY_TABBAR__HAS_API:
				setHasAPi((Api)newValue);
				return;
			case ApplicationPackage.SUB_CATEGORY_TABBAR__HAS_TABS:
				setHasTabs((Tab)newValue);
				return;
			case ApplicationPackage.SUB_CATEGORY_TABBAR__TAB_SELECTED_TEXT_COLOR:
				setTabSelectedTextColor((String)newValue);
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
			case ApplicationPackage.SUB_CATEGORY_TABBAR__TAB_TEXT_COLOR:
				setTabTextColor(TAB_TEXT_COLOR_EDEFAULT);
				return;
			case ApplicationPackage.SUB_CATEGORY_TABBAR__TAB_INDICATOR_COLOR:
				setTabIndicatorColor(TAB_INDICATOR_COLOR_EDEFAULT);
				return;
			case ApplicationPackage.SUB_CATEGORY_TABBAR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ApplicationPackage.SUB_CATEGORY_TABBAR__HAS_API:
				setHasAPi((Api)null);
				return;
			case ApplicationPackage.SUB_CATEGORY_TABBAR__HAS_TABS:
				setHasTabs((Tab)null);
				return;
			case ApplicationPackage.SUB_CATEGORY_TABBAR__TAB_SELECTED_TEXT_COLOR:
				setTabSelectedTextColor(TAB_SELECTED_TEXT_COLOR_EDEFAULT);
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
			case ApplicationPackage.SUB_CATEGORY_TABBAR__TAB_TEXT_COLOR:
				return TAB_TEXT_COLOR_EDEFAULT == null ? tabTextColor != null : !TAB_TEXT_COLOR_EDEFAULT.equals(tabTextColor);
			case ApplicationPackage.SUB_CATEGORY_TABBAR__TAB_INDICATOR_COLOR:
				return TAB_INDICATOR_COLOR_EDEFAULT == null ? tabIndicatorColor != null : !TAB_INDICATOR_COLOR_EDEFAULT.equals(tabIndicatorColor);
			case ApplicationPackage.SUB_CATEGORY_TABBAR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ApplicationPackage.SUB_CATEGORY_TABBAR__HAS_API:
				return hasAPi != null;
			case ApplicationPackage.SUB_CATEGORY_TABBAR__HAS_TABS:
				return hasTabs != null;
			case ApplicationPackage.SUB_CATEGORY_TABBAR__TAB_SELECTED_TEXT_COLOR:
				return TAB_SELECTED_TEXT_COLOR_EDEFAULT == null ? tabSelectedTextColor != null : !TAB_SELECTED_TEXT_COLOR_EDEFAULT.equals(tabSelectedTextColor);
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
		result.append(" (tabTextColor: ");
		result.append(tabTextColor);
		result.append(", tabIndicatorColor: ");
		result.append(tabIndicatorColor);
		result.append(", name: ");
		result.append(name);
		result.append(", tabSelectedTextColor: ");
		result.append(tabSelectedTextColor);
		result.append(')');
		return result.toString();
	}

} //SubCategoryTabbarImpl
