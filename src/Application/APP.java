/**
 */
package Application;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>APP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Application.APP#getHasConf <em>Has Conf</em>}</li>
 *   <li>{@link Application.APP#getHasMainActivity <em>Has Main Activity</em>}</li>
 *   <li>{@link Application.APP#getAppName <em>App Name</em>}</li>
 *   <li>{@link Application.APP#getHasTheme <em>Has Theme</em>}</li>
 *   <li>{@link Application.APP#getHasFrag <em>Has Frag</em>}</li>
 *   <li>{@link Application.APP#getMAhasFragment <em>MAhas Fragment</em>}</li>
 *   <li>{@link Application.APP#getTBhasFragment <em>TBhas Fragment</em>}</li>
 *   <li>{@link Application.APP#getNDhasFragment <em>NDhas Fragment</em>}</li>
 * </ul>
 *
 * @see Application.ApplicationPackage#getAPP()
 * @model
 * @generated
 */
public interface APP extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Conf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Conf</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Conf</em>' containment reference.
	 * @see #setHasConf(Config)
	 * @see Application.ApplicationPackage#getAPP_HasConf()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Config getHasConf();

	/**
	 * Sets the value of the '{@link Application.APP#getHasConf <em>Has Conf</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Conf</em>' containment reference.
	 * @see #getHasConf()
	 * @generated
	 */
	void setHasConf(Config value);

	/**
	 * Returns the value of the '<em><b>Has Main Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Main Activity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Main Activity</em>' containment reference.
	 * @see #setHasMainActivity(MainActivity)
	 * @see Application.ApplicationPackage#getAPP_HasMainActivity()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MainActivity getHasMainActivity();

	/**
	 * Sets the value of the '{@link Application.APP#getHasMainActivity <em>Has Main Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Main Activity</em>' containment reference.
	 * @see #getHasMainActivity()
	 * @generated
	 */
	void setHasMainActivity(MainActivity value);

	/**
	 * Returns the value of the '<em><b>App Name</b></em>' attribute.
	 * The default value is <code>"appName"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>App Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>App Name</em>' attribute.
	 * @see #setAppName(String)
	 * @see Application.ApplicationPackage#getAPP_AppName()
	 * @model default="appName"
	 * @generated
	 */
	String getAppName();

	/**
	 * Sets the value of the '{@link Application.APP#getAppName <em>App Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>App Name</em>' attribute.
	 * @see #getAppName()
	 * @generated
	 */
	void setAppName(String value);

	/**
	 * Returns the value of the '<em><b>Has Theme</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Theme</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Theme</em>' containment reference.
	 * @see #setHasTheme(Theme)
	 * @see Application.ApplicationPackage#getAPP_HasTheme()
	 * @model containment="true"
	 * @generated
	 */
	Theme getHasTheme();

	/**
	 * Sets the value of the '{@link Application.APP#getHasTheme <em>Has Theme</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Theme</em>' containment reference.
	 * @see #getHasTheme()
	 * @generated
	 */
	void setHasTheme(Theme value);

	/**
	 * Returns the value of the '<em><b>Has Frag</b></em>' containment reference list.
	 * The list contents are of type {@link Application.Fragment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Frag</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Frag</em>' containment reference list.
	 * @see Application.ApplicationPackage#getAPP_HasFrag()
	 * @model containment="true"
	 * @generated
	 */
	EList<Fragment> getHasFrag();

	/**
	 * Returns the value of the '<em><b>MAhas Fragment</b></em>' containment reference list.
	 * The list contents are of type {@link Application.MAtoFrag}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MAhas Fragment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MAhas Fragment</em>' containment reference list.
	 * @see Application.ApplicationPackage#getAPP_MAhasFragment()
	 * @model containment="true"
	 * @generated
	 */
	EList<MAtoFrag> getMAhasFragment();

	/**
	 * Returns the value of the '<em><b>TBhas Fragment</b></em>' containment reference list.
	 * The list contents are of type {@link Application.TBtoFrag}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TBhas Fragment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TBhas Fragment</em>' containment reference list.
	 * @see Application.ApplicationPackage#getAPP_TBhasFragment()
	 * @model containment="true"
	 * @generated
	 */
	EList<TBtoFrag> getTBhasFragment();

	/**
	 * Returns the value of the '<em><b>NDhas Fragment</b></em>' containment reference list.
	 * The list contents are of type {@link Application.NDtoFrag}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>NDhas Fragment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NDhas Fragment</em>' containment reference list.
	 * @see Application.ApplicationPackage#getAPP_NDhasFragment()
	 * @model containment="true"
	 * @generated
	 */
	EList<NDtoFrag> getNDhasFragment();

} // APP
