/**
 */
package Application.impl;

import Application.ApplicationPackage;
import Application.Map;
import Application.MapType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Application.impl.MapImpl#getApiKey <em>Api Key</em>}</li>
 *   <li>{@link Application.impl.MapImpl#getMapType <em>Map Type</em>}</li>
 *   <li>{@link Application.impl.MapImpl#isBindCardsToPins <em>Bind Cards To Pins</em>}</li>
 *   <li>{@link Application.impl.MapImpl#getZoomLevel <em>Zoom Level</em>}</li>
 *   <li>{@link Application.impl.MapImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MapImpl extends EObjectImpl implements Map {
	/**
	 * The default value of the '{@link #getApiKey() <em>Api Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiKey()
	 * @generated
	 * @ordered
	 */
	protected static final String API_KEY_EDEFAULT = "AIzaSyCQ2IuVejeAjpoZA9w-d9IJ14xcoAy7Yd4";

	/**
	 * The cached value of the '{@link #getApiKey() <em>Api Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiKey()
	 * @generated
	 * @ordered
	 */
	protected String apiKey = API_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMapType() <em>Map Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapType()
	 * @generated
	 * @ordered
	 */
	protected static final MapType MAP_TYPE_EDEFAULT = MapType.GOOGLE_MAP;

	/**
	 * The cached value of the '{@link #getMapType() <em>Map Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapType()
	 * @generated
	 * @ordered
	 */
	protected MapType mapType = MAP_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isBindCardsToPins() <em>Bind Cards To Pins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBindCardsToPins()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BIND_CARDS_TO_PINS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBindCardsToPins() <em>Bind Cards To Pins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBindCardsToPins()
	 * @generated
	 * @ordered
	 */
	protected boolean bindCardsToPins = BIND_CARDS_TO_PINS_EDEFAULT;

	/**
	 * The default value of the '{@link #getZoomLevel() <em>Zoom Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZoomLevel()
	 * @generated
	 * @ordered
	 */
	protected static final int ZOOM_LEVEL_EDEFAULT = 16;

	/**
	 * The cached value of the '{@link #getZoomLevel() <em>Zoom Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZoomLevel()
	 * @generated
	 * @ordered
	 */
	protected int zoomLevel = ZOOM_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "MyMap";

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
	protected MapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApplicationPackage.Literals.MAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApiKey() {
		return apiKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApiKey(String newApiKey) {
		String oldApiKey = apiKey;
		apiKey = newApiKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.MAP__API_KEY, oldApiKey, apiKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapType getMapType() {
		return mapType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMapType(MapType newMapType) {
		MapType oldMapType = mapType;
		mapType = newMapType == null ? MAP_TYPE_EDEFAULT : newMapType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.MAP__MAP_TYPE, oldMapType, mapType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBindCardsToPins() {
		return bindCardsToPins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBindCardsToPins(boolean newBindCardsToPins) {
		boolean oldBindCardsToPins = bindCardsToPins;
		bindCardsToPins = newBindCardsToPins;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.MAP__BIND_CARDS_TO_PINS, oldBindCardsToPins, bindCardsToPins));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getZoomLevel() {
		return zoomLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZoomLevel(int newZoomLevel) {
		int oldZoomLevel = zoomLevel;
		zoomLevel = newZoomLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.MAP__ZOOM_LEVEL, oldZoomLevel, zoomLevel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.MAP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApplicationPackage.MAP__API_KEY:
				return getApiKey();
			case ApplicationPackage.MAP__MAP_TYPE:
				return getMapType();
			case ApplicationPackage.MAP__BIND_CARDS_TO_PINS:
				return isBindCardsToPins();
			case ApplicationPackage.MAP__ZOOM_LEVEL:
				return getZoomLevel();
			case ApplicationPackage.MAP__NAME:
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
			case ApplicationPackage.MAP__API_KEY:
				setApiKey((String)newValue);
				return;
			case ApplicationPackage.MAP__MAP_TYPE:
				setMapType((MapType)newValue);
				return;
			case ApplicationPackage.MAP__BIND_CARDS_TO_PINS:
				setBindCardsToPins((Boolean)newValue);
				return;
			case ApplicationPackage.MAP__ZOOM_LEVEL:
				setZoomLevel((Integer)newValue);
				return;
			case ApplicationPackage.MAP__NAME:
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
			case ApplicationPackage.MAP__API_KEY:
				setApiKey(API_KEY_EDEFAULT);
				return;
			case ApplicationPackage.MAP__MAP_TYPE:
				setMapType(MAP_TYPE_EDEFAULT);
				return;
			case ApplicationPackage.MAP__BIND_CARDS_TO_PINS:
				setBindCardsToPins(BIND_CARDS_TO_PINS_EDEFAULT);
				return;
			case ApplicationPackage.MAP__ZOOM_LEVEL:
				setZoomLevel(ZOOM_LEVEL_EDEFAULT);
				return;
			case ApplicationPackage.MAP__NAME:
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
			case ApplicationPackage.MAP__API_KEY:
				return API_KEY_EDEFAULT == null ? apiKey != null : !API_KEY_EDEFAULT.equals(apiKey);
			case ApplicationPackage.MAP__MAP_TYPE:
				return mapType != MAP_TYPE_EDEFAULT;
			case ApplicationPackage.MAP__BIND_CARDS_TO_PINS:
				return bindCardsToPins != BIND_CARDS_TO_PINS_EDEFAULT;
			case ApplicationPackage.MAP__ZOOM_LEVEL:
				return zoomLevel != ZOOM_LEVEL_EDEFAULT;
			case ApplicationPackage.MAP__NAME:
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
		result.append(" (apiKey: ");
		result.append(apiKey);
		result.append(", mapType: ");
		result.append(mapType);
		result.append(", bindCardsToPins: ");
		result.append(bindCardsToPins);
		result.append(", zoomLevel: ");
		result.append(zoomLevel);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //MapImpl
