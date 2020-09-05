/**
 */
package Application.impl;

import Application.ApplicationPackage;
import Application.Theme;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Theme</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Application.impl.ThemeImpl#getColorPrimaryDark <em>Color Primary Dark</em>}</li>
 *   <li>{@link Application.impl.ThemeImpl#getColorPrimary <em>Color Primary</em>}</li>
 *   <li>{@link Application.impl.ThemeImpl#getColorAccent <em>Color Accent</em>}</li>
 *   <li>{@link Application.impl.ThemeImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThemeImpl extends EObjectImpl implements Theme {
	/**
	 * The default value of the '{@link #getColorPrimaryDark() <em>Color Primary Dark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColorPrimaryDark()
	 * @generated
	 * @ordered
	 */
	protected static final String COLOR_PRIMARY_DARK_EDEFAULT = "#8E24AA";

	/**
	 * The cached value of the '{@link #getColorPrimaryDark() <em>Color Primary Dark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColorPrimaryDark()
	 * @generated
	 * @ordered
	 */
	protected String colorPrimaryDark = COLOR_PRIMARY_DARK_EDEFAULT;

	/**
	 * The default value of the '{@link #getColorPrimary() <em>Color Primary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColorPrimary()
	 * @generated
	 * @ordered
	 */
	protected static final String COLOR_PRIMARY_EDEFAULT = "#6A1B9A";

	/**
	 * The cached value of the '{@link #getColorPrimary() <em>Color Primary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColorPrimary()
	 * @generated
	 * @ordered
	 */
	protected String colorPrimary = COLOR_PRIMARY_EDEFAULT;

	/**
	 * The default value of the '{@link #getColorAccent() <em>Color Accent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColorAccent()
	 * @generated
	 * @ordered
	 */
	protected static final String COLOR_ACCENT_EDEFAULT = "#C2185B";

	/**
	 * The cached value of the '{@link #getColorAccent() <em>Color Accent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColorAccent()
	 * @generated
	 * @ordered
	 */
	protected String colorAccent = COLOR_ACCENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "MyTheme";

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
	protected ThemeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApplicationPackage.Literals.THEME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColorPrimaryDark() {
		return colorPrimaryDark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColorPrimaryDark(String newColorPrimaryDark) {
		String oldColorPrimaryDark = colorPrimaryDark;
		colorPrimaryDark = newColorPrimaryDark;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.THEME__COLOR_PRIMARY_DARK, oldColorPrimaryDark, colorPrimaryDark));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColorPrimary() {
		return colorPrimary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColorPrimary(String newColorPrimary) {
		String oldColorPrimary = colorPrimary;
		colorPrimary = newColorPrimary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.THEME__COLOR_PRIMARY, oldColorPrimary, colorPrimary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColorAccent() {
		return colorAccent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColorAccent(String newColorAccent) {
		String oldColorAccent = colorAccent;
		colorAccent = newColorAccent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.THEME__COLOR_ACCENT, oldColorAccent, colorAccent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.THEME__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApplicationPackage.THEME__COLOR_PRIMARY_DARK:
				return getColorPrimaryDark();
			case ApplicationPackage.THEME__COLOR_PRIMARY:
				return getColorPrimary();
			case ApplicationPackage.THEME__COLOR_ACCENT:
				return getColorAccent();
			case ApplicationPackage.THEME__NAME:
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
			case ApplicationPackage.THEME__COLOR_PRIMARY_DARK:
				setColorPrimaryDark((String)newValue);
				return;
			case ApplicationPackage.THEME__COLOR_PRIMARY:
				setColorPrimary((String)newValue);
				return;
			case ApplicationPackage.THEME__COLOR_ACCENT:
				setColorAccent((String)newValue);
				return;
			case ApplicationPackage.THEME__NAME:
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
			case ApplicationPackage.THEME__COLOR_PRIMARY_DARK:
				setColorPrimaryDark(COLOR_PRIMARY_DARK_EDEFAULT);
				return;
			case ApplicationPackage.THEME__COLOR_PRIMARY:
				setColorPrimary(COLOR_PRIMARY_EDEFAULT);
				return;
			case ApplicationPackage.THEME__COLOR_ACCENT:
				setColorAccent(COLOR_ACCENT_EDEFAULT);
				return;
			case ApplicationPackage.THEME__NAME:
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
			case ApplicationPackage.THEME__COLOR_PRIMARY_DARK:
				return COLOR_PRIMARY_DARK_EDEFAULT == null ? colorPrimaryDark != null : !COLOR_PRIMARY_DARK_EDEFAULT.equals(colorPrimaryDark);
			case ApplicationPackage.THEME__COLOR_PRIMARY:
				return COLOR_PRIMARY_EDEFAULT == null ? colorPrimary != null : !COLOR_PRIMARY_EDEFAULT.equals(colorPrimary);
			case ApplicationPackage.THEME__COLOR_ACCENT:
				return COLOR_ACCENT_EDEFAULT == null ? colorAccent != null : !COLOR_ACCENT_EDEFAULT.equals(colorAccent);
			case ApplicationPackage.THEME__NAME:
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
		result.append(" (colorPrimaryDark: ");
		result.append(colorPrimaryDark);
		result.append(", colorPrimary: ");
		result.append(colorPrimary);
		result.append(", colorAccent: ");
		result.append(colorAccent);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ThemeImpl
