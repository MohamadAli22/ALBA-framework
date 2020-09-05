/**
 */
package Application.impl;

import Application.ApplicationPackage;
import Application.ResponseItem;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Response Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Application.impl.ResponseItemImpl#getResponseKey <em>Response Key</em>}</li>
 *   <li>{@link Application.impl.ResponseItemImpl#getResponseType <em>Response Type</em>}</li>
 *   <li>{@link Application.impl.ResponseItemImpl#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResponseItemImpl extends EObjectImpl implements ResponseItem {
	/**
	 * The default value of the '{@link #getResponseKey() <em>Response Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseKey()
	 * @generated
	 * @ordered
	 */
	protected static final String RESPONSE_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResponseKey() <em>Response Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseKey()
	 * @generated
	 * @ordered
	 */
	protected String responseKey = RESPONSE_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getResponseType() <em>Response Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseType()
	 * @generated
	 * @ordered
	 */
	protected static final String RESPONSE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResponseType() <em>Response Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseType()
	 * @generated
	 * @ordered
	 */
	protected String responseType = RESPONSE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_EDEFAULT = "notAvailable";

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected String defaultValue = DEFAULT_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponseItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApplicationPackage.Literals.RESPONSE_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResponseKey() {
		return responseKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponseKey(String newResponseKey) {
		String oldResponseKey = responseKey;
		responseKey = newResponseKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.RESPONSE_ITEM__RESPONSE_KEY, oldResponseKey, responseKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResponseType() {
		return responseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponseType(String newResponseType) {
		String oldResponseType = responseType;
		responseType = newResponseType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.RESPONSE_ITEM__RESPONSE_TYPE, oldResponseType, responseType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(String newDefaultValue) {
		String oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.RESPONSE_ITEM__DEFAULT_VALUE, oldDefaultValue, defaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApplicationPackage.RESPONSE_ITEM__RESPONSE_KEY:
				return getResponseKey();
			case ApplicationPackage.RESPONSE_ITEM__RESPONSE_TYPE:
				return getResponseType();
			case ApplicationPackage.RESPONSE_ITEM__DEFAULT_VALUE:
				return getDefaultValue();
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
			case ApplicationPackage.RESPONSE_ITEM__RESPONSE_KEY:
				setResponseKey((String)newValue);
				return;
			case ApplicationPackage.RESPONSE_ITEM__RESPONSE_TYPE:
				setResponseType((String)newValue);
				return;
			case ApplicationPackage.RESPONSE_ITEM__DEFAULT_VALUE:
				setDefaultValue((String)newValue);
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
			case ApplicationPackage.RESPONSE_ITEM__RESPONSE_KEY:
				setResponseKey(RESPONSE_KEY_EDEFAULT);
				return;
			case ApplicationPackage.RESPONSE_ITEM__RESPONSE_TYPE:
				setResponseType(RESPONSE_TYPE_EDEFAULT);
				return;
			case ApplicationPackage.RESPONSE_ITEM__DEFAULT_VALUE:
				setDefaultValue(DEFAULT_VALUE_EDEFAULT);
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
			case ApplicationPackage.RESPONSE_ITEM__RESPONSE_KEY:
				return RESPONSE_KEY_EDEFAULT == null ? responseKey != null : !RESPONSE_KEY_EDEFAULT.equals(responseKey);
			case ApplicationPackage.RESPONSE_ITEM__RESPONSE_TYPE:
				return RESPONSE_TYPE_EDEFAULT == null ? responseType != null : !RESPONSE_TYPE_EDEFAULT.equals(responseType);
			case ApplicationPackage.RESPONSE_ITEM__DEFAULT_VALUE:
				return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
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
		result.append(" (responseKey: ");
		result.append(responseKey);
		result.append(", responseType: ");
		result.append(responseType);
		result.append(", defaultValue: ");
		result.append(defaultValue);
		result.append(')');
		return result.toString();
	}

} //ResponseItemImpl
