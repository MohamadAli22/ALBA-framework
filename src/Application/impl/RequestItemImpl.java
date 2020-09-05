/**
 */
package Application.impl;

import Application.ApplicationPackage;
import Application.RequestItem;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Request Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Application.impl.RequestItemImpl#getRequestKey <em>Request Key</em>}</li>
 *   <li>{@link Application.impl.RequestItemImpl#getRequestType <em>Request Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequestItemImpl extends EObjectImpl implements RequestItem {
	/**
	 * The default value of the '{@link #getRequestKey() <em>Request Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestKey()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUEST_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequestKey() <em>Request Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestKey()
	 * @generated
	 * @ordered
	 */
	protected String requestKey = REQUEST_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequestType() <em>Request Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestType()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUEST_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequestType() <em>Request Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestType()
	 * @generated
	 * @ordered
	 */
	protected String requestType = REQUEST_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequestItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApplicationPackage.Literals.REQUEST_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRequestKey() {
		return requestKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestKey(String newRequestKey) {
		String oldRequestKey = requestKey;
		requestKey = newRequestKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.REQUEST_ITEM__REQUEST_KEY, oldRequestKey, requestKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRequestType() {
		return requestType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestType(String newRequestType) {
		String oldRequestType = requestType;
		requestType = newRequestType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.REQUEST_ITEM__REQUEST_TYPE, oldRequestType, requestType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApplicationPackage.REQUEST_ITEM__REQUEST_KEY:
				return getRequestKey();
			case ApplicationPackage.REQUEST_ITEM__REQUEST_TYPE:
				return getRequestType();
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
			case ApplicationPackage.REQUEST_ITEM__REQUEST_KEY:
				setRequestKey((String)newValue);
				return;
			case ApplicationPackage.REQUEST_ITEM__REQUEST_TYPE:
				setRequestType((String)newValue);
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
			case ApplicationPackage.REQUEST_ITEM__REQUEST_KEY:
				setRequestKey(REQUEST_KEY_EDEFAULT);
				return;
			case ApplicationPackage.REQUEST_ITEM__REQUEST_TYPE:
				setRequestType(REQUEST_TYPE_EDEFAULT);
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
			case ApplicationPackage.REQUEST_ITEM__REQUEST_KEY:
				return REQUEST_KEY_EDEFAULT == null ? requestKey != null : !REQUEST_KEY_EDEFAULT.equals(requestKey);
			case ApplicationPackage.REQUEST_ITEM__REQUEST_TYPE:
				return REQUEST_TYPE_EDEFAULT == null ? requestType != null : !REQUEST_TYPE_EDEFAULT.equals(requestType);
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
		result.append(" (requestKey: ");
		result.append(requestKey);
		result.append(", requestType: ");
		result.append(requestType);
		result.append(')');
		return result.toString();
	}

} //RequestItemImpl
