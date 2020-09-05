/**
 */
package Application;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Application.MainActivity#getHasNav <em>Has Nav</em>}</li>
 *   <li>{@link Application.MainActivity#getHasBar <em>Has Bar</em>}</li>
 *   <li>{@link Application.MainActivity#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see Application.ApplicationPackage#getMainActivity()
 * @model annotation="gmf.node label='name' tool.name='MainActivity'"
 * @generated
 */
public interface MainActivity extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Nav</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Nav</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Nav</em>' containment reference.
	 * @see #setHasNav(NavigationDrawer)
	 * @see Application.ApplicationPackage#getMainActivity_HasNav()
	 * @model containment="true"
	 *        annotation="gmf.compartment collapsible='false'"
	 * @generated
	 */
	NavigationDrawer getHasNav();

	/**
	 * Sets the value of the '{@link Application.MainActivity#getHasNav <em>Has Nav</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Nav</em>' containment reference.
	 * @see #getHasNav()
	 * @generated
	 */
	void setHasNav(NavigationDrawer value);

	/**
	 * Returns the value of the '<em><b>Has Bar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Bar</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Bar</em>' containment reference.
	 * @see #setHasBar(TabBar)
	 * @see Application.ApplicationPackage#getMainActivity_HasBar()
	 * @model containment="true"
	 *        annotation="gmf.compartment collapsible='false'"
	 * @generated
	 */
	TabBar getHasBar();

	/**
	 * Sets the value of the '{@link Application.MainActivity#getHasBar <em>Has Bar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Bar</em>' containment reference.
	 * @see #getHasBar()
	 * @generated
	 */
	void setHasBar(TabBar value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"MyMainActivity"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Application.ApplicationPackage#getMainActivity_Name()
	 * @model default="MyMainActivity"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Application.MainActivity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // MainActivity
