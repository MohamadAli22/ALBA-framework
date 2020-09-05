/**
 */
package Application.impl;

import Application.ApplicationPackage;
import Application.NavigationDrawer;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Navigation Drawer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Application.impl.NavigationDrawerImpl#getName <em>Name</em>}</li>
 *   <li>{@link Application.impl.NavigationDrawerImpl#getHeaderDrawableSrcName <em>Header Drawable Src Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NavigationDrawerImpl extends EObjectImpl implements NavigationDrawer {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "MyNav";

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
	 * The default value of the '{@link #getHeaderDrawableSrcName() <em>Header Drawable Src Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaderDrawableSrcName()
	 * @generated
	 * @ordered
	 */
	protected static final String HEADER_DRAWABLE_SRC_NAME_EDEFAULT = "navheader";

	/**
	 * The cached value of the '{@link #getHeaderDrawableSrcName() <em>Header Drawable Src Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaderDrawableSrcName()
	 * @generated
	 * @ordered
	 */
	protected String headerDrawableSrcName = HEADER_DRAWABLE_SRC_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NavigationDrawerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApplicationPackage.Literals.NAVIGATION_DRAWER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.NAVIGATION_DRAWER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeaderDrawableSrcName() {
		return headerDrawableSrcName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeaderDrawableSrcName(String newHeaderDrawableSrcName) {
		String oldHeaderDrawableSrcName = headerDrawableSrcName;
		headerDrawableSrcName = newHeaderDrawableSrcName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.NAVIGATION_DRAWER__HEADER_DRAWABLE_SRC_NAME, oldHeaderDrawableSrcName, headerDrawableSrcName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApplicationPackage.NAVIGATION_DRAWER__NAME:
				return getName();
			case ApplicationPackage.NAVIGATION_DRAWER__HEADER_DRAWABLE_SRC_NAME:
				return getHeaderDrawableSrcName();
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
			case ApplicationPackage.NAVIGATION_DRAWER__NAME:
				setName((String)newValue);
				return;
			case ApplicationPackage.NAVIGATION_DRAWER__HEADER_DRAWABLE_SRC_NAME:
				setHeaderDrawableSrcName((String)newValue);
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
			case ApplicationPackage.NAVIGATION_DRAWER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ApplicationPackage.NAVIGATION_DRAWER__HEADER_DRAWABLE_SRC_NAME:
				setHeaderDrawableSrcName(HEADER_DRAWABLE_SRC_NAME_EDEFAULT);
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
			case ApplicationPackage.NAVIGATION_DRAWER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ApplicationPackage.NAVIGATION_DRAWER__HEADER_DRAWABLE_SRC_NAME:
				return HEADER_DRAWABLE_SRC_NAME_EDEFAULT == null ? headerDrawableSrcName != null : !HEADER_DRAWABLE_SRC_NAME_EDEFAULT.equals(headerDrawableSrcName);
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
		result.append(", headerDrawableSrcName: ");
		result.append(headerDrawableSrcName);
		result.append(')');
		return result.toString();
	}

} //NavigationDrawerImpl
