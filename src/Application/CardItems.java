/**
 */
package Application;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Card Items</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Application.CardItems#getType <em>Type</em>}</li>
 *   <li>{@link Application.CardItems#getId <em>Id</em>}</li>
 *   <li>{@link Application.CardItems#getConnectTo <em>Connect To</em>}</li>
 * </ul>
 *
 * @see Application.ApplicationPackage#getCardItems()
 * @model annotation="gmf.node label='id'"
 * @generated
 */
public interface CardItems extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link Application.cardItemTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see Application.cardItemTypes
	 * @see #setType(cardItemTypes)
	 * @see Application.ApplicationPackage#getCardItems_Type()
	 * @model
	 * @generated
	 */
	cardItemTypes getType();

	/**
	 * Sets the value of the '{@link Application.CardItems#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see Application.cardItemTypes
	 * @see #getType()
	 * @generated
	 */
	void setType(cardItemTypes value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see Application.ApplicationPackage#getCardItems_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link Application.CardItems#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Connect To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connect To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connect To</em>' reference.
	 * @see #setConnectTo(ResponseItem)
	 * @see Application.ApplicationPackage#getCardItems_ConnectTo()
	 * @model annotation="gmf.link target.decoration='arrow' label='connectedTo' style='solid'"
	 * @generated
	 */
	ResponseItem getConnectTo();

	/**
	 * Sets the value of the '{@link Application.CardItems#getConnectTo <em>Connect To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connect To</em>' reference.
	 * @see #getConnectTo()
	 * @generated
	 */
	void setConnectTo(ResponseItem value);

} // CardItems
