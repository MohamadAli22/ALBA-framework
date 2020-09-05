/**
 */
package Application;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Navigation Drawer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Application.NavigationDrawer#getName <em>Name</em>}</li>
 *   <li>{@link Application.NavigationDrawer#getHeaderDrawableSrcName <em>Header Drawable Src Name</em>}</li>
 * </ul>
 *
 * @see Application.ApplicationPackage#getNavigationDrawer()
 * @model annotation="gmf.node figure='figures.NavigationDrawerFigure' label.icon='false' label='name'"
 * @generated
 */
public interface NavigationDrawer extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"MyNav"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Application.ApplicationPackage#getNavigationDrawer_Name()
	 * @model default="MyNav"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Application.NavigationDrawer#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Header Drawable Src Name</b></em>' attribute.
	 * The default value is <code>"navheader"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header Drawable Src Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header Drawable Src Name</em>' attribute.
	 * @see #setHeaderDrawableSrcName(String)
	 * @see Application.ApplicationPackage#getNavigationDrawer_HeaderDrawableSrcName()
	 * @model default="navheader"
	 * @generated
	 */
	String getHeaderDrawableSrcName();

	/**
	 * Sets the value of the '{@link Application.NavigationDrawer#getHeaderDrawableSrcName <em>Header Drawable Src Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header Drawable Src Name</em>' attribute.
	 * @see #getHeaderDrawableSrcName()
	 * @generated
	 */
	void setHeaderDrawableSrcName(String value);

} // NavigationDrawer
