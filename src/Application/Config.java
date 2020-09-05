/**
 */
package Application;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Application.Config#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link Application.Config#getIcon <em>Icon</em>}</li>
 *   <li>{@link Application.Config#getMinSdkVersion <em>Min Sdk Version</em>}</li>
 *   <li>{@link Application.Config#getTargetSdkVersion <em>Target Sdk Version</em>}</li>
 *   <li>{@link Application.Config#getVersionCode <em>Version Code</em>}</li>
 *   <li>{@link Application.Config#getVersionName <em>Version Name</em>}</li>
 *   <li>{@link Application.Config#getBuildToolsVersion <em>Build Tools Version</em>}</li>
 *   <li>{@link Application.Config#getCompileSdkVersion <em>Compile Sdk Version</em>}</li>
 *   <li>{@link Application.Config#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see Application.ApplicationPackage#getConfig()
 * @model annotation="gmf.node figure='figures.ConfigFigure' label.icon='false' label='name'"
 * @generated
 */
public interface Config extends EObject {
	/**
	 * Returns the value of the '<em><b>Package Name</b></em>' attribute.
	 * The default value is <code>"com.yourDomain.appName"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Name</em>' attribute.
	 * @see #setPackageName(String)
	 * @see Application.ApplicationPackage#getConfig_PackageName()
	 * @model default="com.yourDomain.appName"
	 * @generated
	 */
	String getPackageName();

	/**
	 * Sets the value of the '{@link Application.Config#getPackageName <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Name</em>' attribute.
	 * @see #getPackageName()
	 * @generated
	 */
	void setPackageName(String value);

	/**
	 * Returns the value of the '<em><b>Icon</b></em>' attribute.
	 * The default value is <code>"ic_launcher"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Icon</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon</em>' attribute.
	 * @see #setIcon(String)
	 * @see Application.ApplicationPackage#getConfig_Icon()
	 * @model default="ic_launcher"
	 * @generated
	 */
	String getIcon();

	/**
	 * Sets the value of the '{@link Application.Config#getIcon <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon</em>' attribute.
	 * @see #getIcon()
	 * @generated
	 */
	void setIcon(String value);

	/**
	 * Returns the value of the '<em><b>Min Sdk Version</b></em>' attribute.
	 * The default value is <code>"19"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Sdk Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Sdk Version</em>' attribute.
	 * @see #setMinSdkVersion(String)
	 * @see Application.ApplicationPackage#getConfig_MinSdkVersion()
	 * @model default="19"
	 * @generated
	 */
	String getMinSdkVersion();

	/**
	 * Sets the value of the '{@link Application.Config#getMinSdkVersion <em>Min Sdk Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Sdk Version</em>' attribute.
	 * @see #getMinSdkVersion()
	 * @generated
	 */
	void setMinSdkVersion(String value);

	/**
	 * Returns the value of the '<em><b>Target Sdk Version</b></em>' attribute.
	 * The default value is <code>"25"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Sdk Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Sdk Version</em>' attribute.
	 * @see #setTargetSdkVersion(String)
	 * @see Application.ApplicationPackage#getConfig_TargetSdkVersion()
	 * @model default="25"
	 * @generated
	 */
	String getTargetSdkVersion();

	/**
	 * Sets the value of the '{@link Application.Config#getTargetSdkVersion <em>Target Sdk Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Sdk Version</em>' attribute.
	 * @see #getTargetSdkVersion()
	 * @generated
	 */
	void setTargetSdkVersion(String value);

	/**
	 * Returns the value of the '<em><b>Version Code</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version Code</em>' attribute.
	 * @see #setVersionCode(String)
	 * @see Application.ApplicationPackage#getConfig_VersionCode()
	 * @model default="1"
	 * @generated
	 */
	String getVersionCode();

	/**
	 * Sets the value of the '{@link Application.Config#getVersionCode <em>Version Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version Code</em>' attribute.
	 * @see #getVersionCode()
	 * @generated
	 */
	void setVersionCode(String value);

	/**
	 * Returns the value of the '<em><b>Version Name</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version Name</em>' attribute.
	 * @see #setVersionName(String)
	 * @see Application.ApplicationPackage#getConfig_VersionName()
	 * @model default="1.0"
	 * @generated
	 */
	String getVersionName();

	/**
	 * Sets the value of the '{@link Application.Config#getVersionName <em>Version Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version Name</em>' attribute.
	 * @see #getVersionName()
	 * @generated
	 */
	void setVersionName(String value);

	/**
	 * Returns the value of the '<em><b>Build Tools Version</b></em>' attribute.
	 * The default value is <code>"25.0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Build Tools Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Build Tools Version</em>' attribute.
	 * @see #setBuildToolsVersion(String)
	 * @see Application.ApplicationPackage#getConfig_BuildToolsVersion()
	 * @model default="25.0.0"
	 * @generated
	 */
	String getBuildToolsVersion();

	/**
	 * Sets the value of the '{@link Application.Config#getBuildToolsVersion <em>Build Tools Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Build Tools Version</em>' attribute.
	 * @see #getBuildToolsVersion()
	 * @generated
	 */
	void setBuildToolsVersion(String value);

	/**
	 * Returns the value of the '<em><b>Compile Sdk Version</b></em>' attribute.
	 * The default value is <code>"25"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compile Sdk Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compile Sdk Version</em>' attribute.
	 * @see #setCompileSdkVersion(String)
	 * @see Application.ApplicationPackage#getConfig_CompileSdkVersion()
	 * @model default="25"
	 * @generated
	 */
	String getCompileSdkVersion();

	/**
	 * Sets the value of the '{@link Application.Config#getCompileSdkVersion <em>Compile Sdk Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compile Sdk Version</em>' attribute.
	 * @see #getCompileSdkVersion()
	 * @generated
	 */
	void setCompileSdkVersion(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"myConfig"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Application.ApplicationPackage#getConfig_Name()
	 * @model default="myConfig"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Application.Config#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Config
