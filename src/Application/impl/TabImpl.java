/**
 */
package Application.impl;

import Application.ApplicationPackage;
import Application.ResponseItem;
import Application.Tab;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tab</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Application.impl.TabImpl#getName <em>Name</em>}</li>
 *   <li>{@link Application.impl.TabImpl#getGetItemIdFrom <em>Get Item Id From</em>}</li>
 *   <li>{@link Application.impl.TabImpl#getGetItemNameFrom <em>Get Item Name From</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TabImpl extends EObjectImpl implements Tab {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "MyTab";

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
	 * The cached value of the '{@link #getGetItemIdFrom() <em>Get Item Id From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetItemIdFrom()
	 * @generated
	 * @ordered
	 */
	protected ResponseItem getItemIdFrom;

	/**
	 * The cached value of the '{@link #getGetItemNameFrom() <em>Get Item Name From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetItemNameFrom()
	 * @generated
	 * @ordered
	 */
	protected ResponseItem getItemNameFrom;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TabImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApplicationPackage.Literals.TAB;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.TAB__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseItem getGetItemIdFrom() {
		if (getItemIdFrom != null && getItemIdFrom.eIsProxy()) {
			InternalEObject oldGetItemIdFrom = (InternalEObject)getItemIdFrom;
			getItemIdFrom = (ResponseItem)eResolveProxy(oldGetItemIdFrom);
			if (getItemIdFrom != oldGetItemIdFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApplicationPackage.TAB__GET_ITEM_ID_FROM, oldGetItemIdFrom, getItemIdFrom));
			}
		}
		return getItemIdFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseItem basicGetGetItemIdFrom() {
		return getItemIdFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetItemIdFrom(ResponseItem newGetItemIdFrom) {
		ResponseItem oldGetItemIdFrom = getItemIdFrom;
		getItemIdFrom = newGetItemIdFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.TAB__GET_ITEM_ID_FROM, oldGetItemIdFrom, getItemIdFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseItem getGetItemNameFrom() {
		if (getItemNameFrom != null && getItemNameFrom.eIsProxy()) {
			InternalEObject oldGetItemNameFrom = (InternalEObject)getItemNameFrom;
			getItemNameFrom = (ResponseItem)eResolveProxy(oldGetItemNameFrom);
			if (getItemNameFrom != oldGetItemNameFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApplicationPackage.TAB__GET_ITEM_NAME_FROM, oldGetItemNameFrom, getItemNameFrom));
			}
		}
		return getItemNameFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseItem basicGetGetItemNameFrom() {
		return getItemNameFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetItemNameFrom(ResponseItem newGetItemNameFrom) {
		ResponseItem oldGetItemNameFrom = getItemNameFrom;
		getItemNameFrom = newGetItemNameFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.TAB__GET_ITEM_NAME_FROM, oldGetItemNameFrom, getItemNameFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApplicationPackage.TAB__NAME:
				return getName();
			case ApplicationPackage.TAB__GET_ITEM_ID_FROM:
				if (resolve) return getGetItemIdFrom();
				return basicGetGetItemIdFrom();
			case ApplicationPackage.TAB__GET_ITEM_NAME_FROM:
				if (resolve) return getGetItemNameFrom();
				return basicGetGetItemNameFrom();
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
			case ApplicationPackage.TAB__NAME:
				setName((String)newValue);
				return;
			case ApplicationPackage.TAB__GET_ITEM_ID_FROM:
				setGetItemIdFrom((ResponseItem)newValue);
				return;
			case ApplicationPackage.TAB__GET_ITEM_NAME_FROM:
				setGetItemNameFrom((ResponseItem)newValue);
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
			case ApplicationPackage.TAB__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ApplicationPackage.TAB__GET_ITEM_ID_FROM:
				setGetItemIdFrom((ResponseItem)null);
				return;
			case ApplicationPackage.TAB__GET_ITEM_NAME_FROM:
				setGetItemNameFrom((ResponseItem)null);
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
			case ApplicationPackage.TAB__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ApplicationPackage.TAB__GET_ITEM_ID_FROM:
				return getItemIdFrom != null;
			case ApplicationPackage.TAB__GET_ITEM_NAME_FROM:
				return getItemNameFrom != null;
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

} //TabImpl
