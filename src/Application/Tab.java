/**
 */
package Application;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tab</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Application.Tab#getName <em>Name</em>}</li>
 *   <li>{@link Application.Tab#getGetItemIdFrom <em>Get Item Id From</em>}</li>
 *   <li>{@link Application.Tab#getGetItemNameFrom <em>Get Item Name From</em>}</li>
 * </ul>
 *
 * @see Application.ApplicationPackage#getTab()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface Tab extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"MyTab"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Application.ApplicationPackage#getTab_Name()
	 * @model default="MyTab"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Application.Tab#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Get Item Id From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get Item Id From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Item Id From</em>' reference.
	 * @see #setGetItemIdFrom(ResponseItem)
	 * @see Application.ApplicationPackage#getTab_GetItemIdFrom()
	 * @model annotation="gmf.link target.decoration='arrow' label='has' style='dash'"
	 * @generated
	 */
	ResponseItem getGetItemIdFrom();

	/**
	 * Sets the value of the '{@link Application.Tab#getGetItemIdFrom <em>Get Item Id From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Item Id From</em>' reference.
	 * @see #getGetItemIdFrom()
	 * @generated
	 */
	void setGetItemIdFrom(ResponseItem value);

	/**
	 * Returns the value of the '<em><b>Get Item Name From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get Item Name From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Item Name From</em>' reference.
	 * @see #setGetItemNameFrom(ResponseItem)
	 * @see Application.ApplicationPackage#getTab_GetItemNameFrom()
	 * @model annotation="gmf.link target.decoration='arrow' label='has' style='dash'"
	 * @generated
	 */
	ResponseItem getGetItemNameFrom();

	/**
	 * Sets the value of the '{@link Application.Tab#getGetItemNameFrom <em>Get Item Name From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Item Name From</em>' reference.
	 * @see #getGetItemNameFrom()
	 * @generated
	 */
	void setGetItemNameFrom(ResponseItem value);

} // Tab
