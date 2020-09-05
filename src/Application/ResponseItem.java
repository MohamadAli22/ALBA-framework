/**
 */
package Application;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Response Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Application.ResponseItem#getResponseKey <em>Response Key</em>}</li>
 *   <li>{@link Application.ResponseItem#getResponseType <em>Response Type</em>}</li>
 *   <li>{@link Application.ResponseItem#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 *
 * @see Application.ApplicationPackage#getResponseItem()
 * @model annotation="gmf.node label='responseKey'"
 * @generated
 */
public interface ResponseItem extends EObject {
	/**
	 * Returns the value of the '<em><b>Response Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Key</em>' attribute.
	 * @see #setResponseKey(String)
	 * @see Application.ApplicationPackage#getResponseItem_ResponseKey()
	 * @model
	 * @generated
	 */
	String getResponseKey();

	/**
	 * Sets the value of the '{@link Application.ResponseItem#getResponseKey <em>Response Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Key</em>' attribute.
	 * @see #getResponseKey()
	 * @generated
	 */
	void setResponseKey(String value);

	/**
	 * Returns the value of the '<em><b>Response Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Type</em>' attribute.
	 * @see #setResponseType(String)
	 * @see Application.ApplicationPackage#getResponseItem_ResponseType()
	 * @model
	 * @generated
	 */
	String getResponseType();

	/**
	 * Sets the value of the '{@link Application.ResponseItem#getResponseType <em>Response Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Type</em>' attribute.
	 * @see #getResponseType()
	 * @generated
	 */
	void setResponseType(String value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * The default value is <code>"notAvailable"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(String)
	 * @see Application.ApplicationPackage#getResponseItem_DefaultValue()
	 * @model default="notAvailable"
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '{@link Application.ResponseItem#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(String value);

} // ResponseItem
