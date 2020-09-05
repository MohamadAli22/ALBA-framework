/**
 */
package Application;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Api</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Application.Api#getBaseAddress <em>Base Address</em>}</li>
 *   <li>{@link Application.Api#getLinkAddress <em>Link Address</em>}</li>
 *   <li>{@link Application.Api#getHasResItem <em>Has Res Item</em>}</li>
 *   <li>{@link Application.Api#getHasReqItem <em>Has Req Item</em>}</li>
 * </ul>
 *
 * @see Application.ApplicationPackage#getApi()
 * @model annotation="gmf.node label='baseAddress'"
 * @generated
 */
public interface Api extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Address</b></em>' attribute.
	 * The default value is <code>"http://medvisit.ir/"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Address</em>' attribute.
	 * @see #setBaseAddress(String)
	 * @see Application.ApplicationPackage#getApi_BaseAddress()
	 * @model default="http://medvisit.ir/" required="true"
	 * @generated
	 */
	String getBaseAddress();

	/**
	 * Sets the value of the '{@link Application.Api#getBaseAddress <em>Base Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Address</em>' attribute.
	 * @see #getBaseAddress()
	 * @generated
	 */
	void setBaseAddress(String value);

	/**
	 * Returns the value of the '<em><b>Link Address</b></em>' attribute.
	 * The default value is <code>"/API_UINAV/hiIranApi/public/..."</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Address</em>' attribute.
	 * @see #setLinkAddress(String)
	 * @see Application.ApplicationPackage#getApi_LinkAddress()
	 * @model default="/API_UINAV/hiIranApi/public/..." required="true"
	 * @generated
	 */
	String getLinkAddress();

	/**
	 * Sets the value of the '{@link Application.Api#getLinkAddress <em>Link Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Address</em>' attribute.
	 * @see #getLinkAddress()
	 * @generated
	 */
	void setLinkAddress(String value);

	/**
	 * Returns the value of the '<em><b>Has Res Item</b></em>' containment reference list.
	 * The list contents are of type {@link Application.ResponseItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Res Item</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Res Item</em>' containment reference list.
	 * @see Application.ApplicationPackage#getApi_HasResItem()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment layout='list' collapsible='false'"
	 * @generated
	 */
	EList<ResponseItem> getHasResItem();

	/**
	 * Returns the value of the '<em><b>Has Req Item</b></em>' containment reference list.
	 * The list contents are of type {@link Application.RequestItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Req Item</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Req Item</em>' containment reference list.
	 * @see Application.ApplicationPackage#getApi_HasReqItem()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment layout='list' collapsible='false'"
	 * @generated
	 */
	EList<RequestItem> getHasReqItem();

} // Api
