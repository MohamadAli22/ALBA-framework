/**
 */
package Application;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tab Bar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Application.TabBar#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see Application.ApplicationPackage#getTabBar()
 * @model annotation="gmf.node figure='figures.TabBarFigure' label.icon='false' label='name'"
 * @generated
 */
public interface TabBar extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"MyTabBar"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Application.ApplicationPackage#getTabBar_Name()
	 * @model default="MyTabBar"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Application.TabBar#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // TabBar
