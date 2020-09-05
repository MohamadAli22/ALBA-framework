/**
 */
package Application.impl;

import Application.ApplicationPackage;
import Application.Fragment;
import Application.NDtoFrag;
import Application.NavigationDrawer;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NDto Frag</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Application.impl.NDtoFragImpl#getNdtofTarget <em>Ndtof Target</em>}</li>
 *   <li>{@link Application.impl.NDtoFragImpl#getNdtofSource <em>Ndtof Source</em>}</li>
 *   <li>{@link Application.impl.NDtoFragImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NDtoFragImpl extends EObjectImpl implements NDtoFrag {
	/**
	 * The cached value of the '{@link #getNdtofTarget() <em>Ndtof Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNdtofTarget()
	 * @generated
	 * @ordered
	 */
	protected Fragment ndtofTarget;

	/**
	 * The cached value of the '{@link #getNdtofSource() <em>Ndtof Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNdtofSource()
	 * @generated
	 * @ordered
	 */
	protected NavigationDrawer ndtofSource;

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
	protected NDtoFragImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApplicationPackage.Literals.NDTO_FRAG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fragment getNdtofTarget() {
		if (ndtofTarget != null && ndtofTarget.eIsProxy()) {
			InternalEObject oldNdtofTarget = (InternalEObject)ndtofTarget;
			ndtofTarget = (Fragment)eResolveProxy(oldNdtofTarget);
			if (ndtofTarget != oldNdtofTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApplicationPackage.NDTO_FRAG__NDTOF_TARGET, oldNdtofTarget, ndtofTarget));
			}
		}
		return ndtofTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fragment basicGetNdtofTarget() {
		return ndtofTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNdtofTarget(Fragment newNdtofTarget) {
		Fragment oldNdtofTarget = ndtofTarget;
		ndtofTarget = newNdtofTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.NDTO_FRAG__NDTOF_TARGET, oldNdtofTarget, ndtofTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavigationDrawer getNdtofSource() {
		if (ndtofSource != null && ndtofSource.eIsProxy()) {
			InternalEObject oldNdtofSource = (InternalEObject)ndtofSource;
			ndtofSource = (NavigationDrawer)eResolveProxy(oldNdtofSource);
			if (ndtofSource != oldNdtofSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApplicationPackage.NDTO_FRAG__NDTOF_SOURCE, oldNdtofSource, ndtofSource));
			}
		}
		return ndtofSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavigationDrawer basicGetNdtofSource() {
		return ndtofSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNdtofSource(NavigationDrawer newNdtofSource) {
		NavigationDrawer oldNdtofSource = ndtofSource;
		ndtofSource = newNdtofSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.NDTO_FRAG__NDTOF_SOURCE, oldNdtofSource, ndtofSource));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.NDTO_FRAG__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApplicationPackage.NDTO_FRAG__NDTOF_TARGET:
				if (resolve) return getNdtofTarget();
				return basicGetNdtofTarget();
			case ApplicationPackage.NDTO_FRAG__NDTOF_SOURCE:
				if (resolve) return getNdtofSource();
				return basicGetNdtofSource();
			case ApplicationPackage.NDTO_FRAG__NAME:
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
			case ApplicationPackage.NDTO_FRAG__NDTOF_TARGET:
				setNdtofTarget((Fragment)newValue);
				return;
			case ApplicationPackage.NDTO_FRAG__NDTOF_SOURCE:
				setNdtofSource((NavigationDrawer)newValue);
				return;
			case ApplicationPackage.NDTO_FRAG__NAME:
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
			case ApplicationPackage.NDTO_FRAG__NDTOF_TARGET:
				setNdtofTarget((Fragment)null);
				return;
			case ApplicationPackage.NDTO_FRAG__NDTOF_SOURCE:
				setNdtofSource((NavigationDrawer)null);
				return;
			case ApplicationPackage.NDTO_FRAG__NAME:
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
			case ApplicationPackage.NDTO_FRAG__NDTOF_TARGET:
				return ndtofTarget != null;
			case ApplicationPackage.NDTO_FRAG__NDTOF_SOURCE:
				return ndtofSource != null;
			case ApplicationPackage.NDTO_FRAG__NAME:
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

} //NDtoFragImpl
