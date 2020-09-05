/**
 */
package Application;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Request Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Application.RequestItem#getRequestKey <em>Request Key</em>}</li>
 *   <li>{@link Application.RequestItem#getRequestType <em>Request Type</em>}</li>
 * </ul>
 *
 * @see Application.ApplicationPackage#getRequestItem()
 * @model annotation="gmf.node label='requestKey'"
 * @generated
 */
public interface RequestItem extends EObject {
	/**
	 * Returns the value of the '<em><b>Request Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Key</em>' attribute.
	 * @see #setRequestKey(String)
	 * @see Application.ApplicationPackage#getRequestItem_RequestKey()
	 * @model
	 * @generated
	 */
	String getRequestKey();

	/**
	 * Sets the value of the '{@link Application.RequestItem#getRequestKey <em>Request Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Key</em>' attribute.
	 * @see #getRequestKey()
	 * @generated
	 */
	void setRequestKey(String value);

	/**
	 * Returns the value of the '<em><b>Request Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Type</em>' attribute.
	 * @see #setRequestType(String)
	 * @see Application.ApplicationPackage#getRequestItem_RequestType()
	 * @model
	 * @generated
	 */
	String getRequestType();

	/**
	 * Sets the value of the '{@link Application.RequestItem#getRequestType <em>Request Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Type</em>' attribute.
	 * @see #getRequestType()
	 * @generated
	 */
	void setRequestType(String value);

} // RequestItem
