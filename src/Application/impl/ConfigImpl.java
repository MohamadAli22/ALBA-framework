/**
 */
package Application.impl;

import Application.ApplicationPackage;
import Application.Config;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Application.impl.ConfigImpl#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link Application.impl.ConfigImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link Application.impl.ConfigImpl#getMinSdkVersion <em>Min Sdk Version</em>}</li>
 *   <li>{@link Application.impl.ConfigImpl#getTargetSdkVersion <em>Target Sdk Version</em>}</li>
 *   <li>{@link Application.impl.ConfigImpl#getVersionCode <em>Version Code</em>}</li>
 *   <li>{@link Application.impl.ConfigImpl#getVersionName <em>Version Name</em>}</li>
 *   <li>{@link Application.impl.ConfigImpl#getBuildToolsVersion <em>Build Tools Version</em>}</li>
 *   <li>{@link Application.impl.ConfigImpl#getCompileSdkVersion <em>Compile Sdk Version</em>}</li>
 *   <li>{@link Application.impl.ConfigImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigImpl extends EObjectImpl implements Config {
	/**
	 * The default value of the '{@link #getPackageName() <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageName()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKAGE_NAME_EDEFAULT = "com.yourDomain.appName";

	/**
	 * The cached value of the '{@link #getPackageName() <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageName()
	 * @generated
	 * @ordered
	 */
	protected String packageName = PACKAGE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getIcon() <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected static final String ICON_EDEFAULT = "ic_launcher";

	/**
	 * The cached value of the '{@link #getIcon() <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected String icon = ICON_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinSdkVersion() <em>Min Sdk Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinSdkVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String MIN_SDK_VERSION_EDEFAULT = "19";

	/**
	 * The cached value of the '{@link #getMinSdkVersion() <em>Min Sdk Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinSdkVersion()
	 * @generated
	 * @ordered
	 */
	protected String minSdkVersion = MIN_SDK_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetSdkVersion() <em>Target Sdk Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetSdkVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_SDK_VERSION_EDEFAULT = "25";

	/**
	 * The cached value of the '{@link #getTargetSdkVersion() <em>Target Sdk Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetSdkVersion()
	 * @generated
	 * @ordered
	 */
	protected String targetSdkVersion = TARGET_SDK_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersionCode() <em>Version Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionCode()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_CODE_EDEFAULT = "1";

	/**
	 * The cached value of the '{@link #getVersionCode() <em>Version Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionCode()
	 * @generated
	 * @ordered
	 */
	protected String versionCode = VERSION_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersionName() <em>Version Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionName()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_NAME_EDEFAULT = "1.0";

	/**
	 * The cached value of the '{@link #getVersionName() <em>Version Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionName()
	 * @generated
	 * @ordered
	 */
	protected String versionName = VERSION_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getBuildToolsVersion() <em>Build Tools Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildToolsVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String BUILD_TOOLS_VERSION_EDEFAULT = "25.0.0";

	/**
	 * The cached value of the '{@link #getBuildToolsVersion() <em>Build Tools Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildToolsVersion()
	 * @generated
	 * @ordered
	 */
	protected String buildToolsVersion = BUILD_TOOLS_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompileSdkVersion() <em>Compile Sdk Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompileSdkVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPILE_SDK_VERSION_EDEFAULT = "25";

	/**
	 * The cached value of the '{@link #getCompileSdkVersion() <em>Compile Sdk Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompileSdkVersion()
	 * @generated
	 * @ordered
	 */
	protected String compileSdkVersion = COMPILE_SDK_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "myConfig";

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
	protected ConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApplicationPackage.Literals.CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPackageName() {
		return packageName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackageName(String newPackageName) {
		String oldPackageName = packageName;
		packageName = newPackageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.CONFIG__PACKAGE_NAME, oldPackageName, packageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIcon() {
		return icon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIcon(String newIcon) {
		String oldIcon = icon;
		icon = newIcon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.CONFIG__ICON, oldIcon, icon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMinSdkVersion() {
		return minSdkVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinSdkVersion(String newMinSdkVersion) {
		String oldMinSdkVersion = minSdkVersion;
		minSdkVersion = newMinSdkVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.CONFIG__MIN_SDK_VERSION, oldMinSdkVersion, minSdkVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetSdkVersion() {
		return targetSdkVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetSdkVersion(String newTargetSdkVersion) {
		String oldTargetSdkVersion = targetSdkVersion;
		targetSdkVersion = newTargetSdkVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.CONFIG__TARGET_SDK_VERSION, oldTargetSdkVersion, targetSdkVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersionCode() {
		return versionCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersionCode(String newVersionCode) {
		String oldVersionCode = versionCode;
		versionCode = newVersionCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.CONFIG__VERSION_CODE, oldVersionCode, versionCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersionName() {
		return versionName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersionName(String newVersionName) {
		String oldVersionName = versionName;
		versionName = newVersionName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.CONFIG__VERSION_NAME, oldVersionName, versionName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBuildToolsVersion() {
		return buildToolsVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuildToolsVersion(String newBuildToolsVersion) {
		String oldBuildToolsVersion = buildToolsVersion;
		buildToolsVersion = newBuildToolsVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.CONFIG__BUILD_TOOLS_VERSION, oldBuildToolsVersion, buildToolsVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCompileSdkVersion() {
		return compileSdkVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompileSdkVersion(String newCompileSdkVersion) {
		String oldCompileSdkVersion = compileSdkVersion;
		compileSdkVersion = newCompileSdkVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.CONFIG__COMPILE_SDK_VERSION, oldCompileSdkVersion, compileSdkVersion));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.CONFIG__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApplicationPackage.CONFIG__PACKAGE_NAME:
				return getPackageName();
			case ApplicationPackage.CONFIG__ICON:
				return getIcon();
			case ApplicationPackage.CONFIG__MIN_SDK_VERSION:
				return getMinSdkVersion();
			case ApplicationPackage.CONFIG__TARGET_SDK_VERSION:
				return getTargetSdkVersion();
			case ApplicationPackage.CONFIG__VERSION_CODE:
				return getVersionCode();
			case ApplicationPackage.CONFIG__VERSION_NAME:
				return getVersionName();
			case ApplicationPackage.CONFIG__BUILD_TOOLS_VERSION:
				return getBuildToolsVersion();
			case ApplicationPackage.CONFIG__COMPILE_SDK_VERSION:
				return getCompileSdkVersion();
			case ApplicationPackage.CONFIG__NAME:
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
			case ApplicationPackage.CONFIG__PACKAGE_NAME:
				setPackageName((String)newValue);
				return;
			case ApplicationPackage.CONFIG__ICON:
				setIcon((String)newValue);
				return;
			case ApplicationPackage.CONFIG__MIN_SDK_VERSION:
				setMinSdkVersion((String)newValue);
				return;
			case ApplicationPackage.CONFIG__TARGET_SDK_VERSION:
				setTargetSdkVersion((String)newValue);
				return;
			case ApplicationPackage.CONFIG__VERSION_CODE:
				setVersionCode((String)newValue);
				return;
			case ApplicationPackage.CONFIG__VERSION_NAME:
				setVersionName((String)newValue);
				return;
			case ApplicationPackage.CONFIG__BUILD_TOOLS_VERSION:
				setBuildToolsVersion((String)newValue);
				return;
			case ApplicationPackage.CONFIG__COMPILE_SDK_VERSION:
				setCompileSdkVersion((String)newValue);
				return;
			case ApplicationPackage.CONFIG__NAME:
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
			case ApplicationPackage.CONFIG__PACKAGE_NAME:
				setPackageName(PACKAGE_NAME_EDEFAULT);
				return;
			case ApplicationPackage.CONFIG__ICON:
				setIcon(ICON_EDEFAULT);
				return;
			case ApplicationPackage.CONFIG__MIN_SDK_VERSION:
				setMinSdkVersion(MIN_SDK_VERSION_EDEFAULT);
				return;
			case ApplicationPackage.CONFIG__TARGET_SDK_VERSION:
				setTargetSdkVersion(TARGET_SDK_VERSION_EDEFAULT);
				return;
			case ApplicationPackage.CONFIG__VERSION_CODE:
				setVersionCode(VERSION_CODE_EDEFAULT);
				return;
			case ApplicationPackage.CONFIG__VERSION_NAME:
				setVersionName(VERSION_NAME_EDEFAULT);
				return;
			case ApplicationPackage.CONFIG__BUILD_TOOLS_VERSION:
				setBuildToolsVersion(BUILD_TOOLS_VERSION_EDEFAULT);
				return;
			case ApplicationPackage.CONFIG__COMPILE_SDK_VERSION:
				setCompileSdkVersion(COMPILE_SDK_VERSION_EDEFAULT);
				return;
			case ApplicationPackage.CONFIG__NAME:
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
			case ApplicationPackage.CONFIG__PACKAGE_NAME:
				return PACKAGE_NAME_EDEFAULT == null ? packageName != null : !PACKAGE_NAME_EDEFAULT.equals(packageName);
			case ApplicationPackage.CONFIG__ICON:
				return ICON_EDEFAULT == null ? icon != null : !ICON_EDEFAULT.equals(icon);
			case ApplicationPackage.CONFIG__MIN_SDK_VERSION:
				return MIN_SDK_VERSION_EDEFAULT == null ? minSdkVersion != null : !MIN_SDK_VERSION_EDEFAULT.equals(minSdkVersion);
			case ApplicationPackage.CONFIG__TARGET_SDK_VERSION:
				return TARGET_SDK_VERSION_EDEFAULT == null ? targetSdkVersion != null : !TARGET_SDK_VERSION_EDEFAULT.equals(targetSdkVersion);
			case ApplicationPackage.CONFIG__VERSION_CODE:
				return VERSION_CODE_EDEFAULT == null ? versionCode != null : !VERSION_CODE_EDEFAULT.equals(versionCode);
			case ApplicationPackage.CONFIG__VERSION_NAME:
				return VERSION_NAME_EDEFAULT == null ? versionName != null : !VERSION_NAME_EDEFAULT.equals(versionName);
			case ApplicationPackage.CONFIG__BUILD_TOOLS_VERSION:
				return BUILD_TOOLS_VERSION_EDEFAULT == null ? buildToolsVersion != null : !BUILD_TOOLS_VERSION_EDEFAULT.equals(buildToolsVersion);
			case ApplicationPackage.CONFIG__COMPILE_SDK_VERSION:
				return COMPILE_SDK_VERSION_EDEFAULT == null ? compileSdkVersion != null : !COMPILE_SDK_VERSION_EDEFAULT.equals(compileSdkVersion);
			case ApplicationPackage.CONFIG__NAME:
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
		result.append(" (packageName: ");
		result.append(packageName);
		result.append(", icon: ");
		result.append(icon);
		result.append(", minSdkVersion: ");
		result.append(minSdkVersion);
		result.append(", targetSdkVersion: ");
		result.append(targetSdkVersion);
		result.append(", versionCode: ");
		result.append(versionCode);
		result.append(", versionName: ");
		result.append(versionName);
		result.append(", buildToolsVersion: ");
		result.append(buildToolsVersion);
		result.append(", compileSdkVersion: ");
		result.append(compileSdkVersion);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ConfigImpl
