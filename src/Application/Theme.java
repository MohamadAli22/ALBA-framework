/**
 */
package Application;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Theme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Application.Theme#getColorPrimaryDark <em>Color Primary Dark</em>}</li>
 *   <li>{@link Application.Theme#getColorPrimary <em>Color Primary</em>}</li>
 *   <li>{@link Application.Theme#getColorAccent <em>Color Accent</em>}</li>
 *   <li>{@link Application.Theme#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see Application.ApplicationPackage#getTheme()
 * @model annotation="gmf.node figure='figures.ThemeFigure' label.icon='false' label='name'"
 * @generated
 */
public interface Theme extends EObject {
	/**
	 * Returns the value of the '<em><b>Color Primary Dark</b></em>' attribute.
	 * The default value is <code>"#8E24AA"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color Primary Dark</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color Primary Dark</em>' attribute.
	 * @see #setColorPrimaryDark(String)
	 * @see Application.ApplicationPackage#getTheme_ColorPrimaryDark()
	 * @model default="#8E24AA"
	 * @generated
	 */
	String getColorPrimaryDark();

	/**
	 * Sets the value of the '{@link Application.Theme#getColorPrimaryDark <em>Color Primary Dark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color Primary Dark</em>' attribute.
	 * @see #getColorPrimaryDark()
	 * @generated
	 */
	void setColorPrimaryDark(String value);

	/**
	 * Returns the value of the '<em><b>Color Primary</b></em>' attribute.
	 * The default value is <code>"#6A1B9A"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color Primary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color Primary</em>' attribute.
	 * @see #setColorPrimary(String)
	 * @see Application.ApplicationPackage#getTheme_ColorPrimary()
	 * @model default="#6A1B9A"
	 * @generated
	 */
	String getColorPrimary();

	/**
	 * Sets the value of the '{@link Application.Theme#getColorPrimary <em>Color Primary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color Primary</em>' attribute.
	 * @see #getColorPrimary()
	 * @generated
	 */
	void setColorPrimary(String value);

	/**
	 * Returns the value of the '<em><b>Color Accent</b></em>' attribute.
	 * The default value is <code>"#C2185B"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color Accent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color Accent</em>' attribute.
	 * @see #setColorAccent(String)
	 * @see Application.ApplicationPackage#getTheme_ColorAccent()
	 * @model default="#C2185B"
	 * @generated
	 */
	String getColorAccent();

	/**
	 * Sets the value of the '{@link Application.Theme#getColorAccent <em>Color Accent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color Accent</em>' attribute.
	 * @see #getColorAccent()
	 * @generated
	 */
	void setColorAccent(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"MyTheme"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Application.ApplicationPackage#getTheme_Name()
	 * @model default="MyTheme"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Application.Theme#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Theme
