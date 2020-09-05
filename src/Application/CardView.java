/**
 */
package Application;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Card View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Application.CardView#getLayoutFileName <em>Layout File Name</em>}</li>
 *   <li>{@link Application.CardView#getHasCardItem <em>Has Card Item</em>}</li>
 *   <li>{@link Application.CardView#getLinkTo <em>Link To</em>}</li>
 * </ul>
 *
 * @see Application.ApplicationPackage#getCardView()
 * @model annotation="gmf.node label='layoutFileName'"
 * @generated
 */
public interface CardView extends EObject {
	/**
	 * Returns the value of the '<em><b>Layout File Name</b></em>' attribute.
	 * The default value is <code>"?.xml"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layout File Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout File Name</em>' attribute.
	 * @see #setLayoutFileName(String)
	 * @see Application.ApplicationPackage#getCardView_LayoutFileName()
	 * @model default="?.xml"
	 * @generated
	 */
	String getLayoutFileName();

	/**
	 * Sets the value of the '{@link Application.CardView#getLayoutFileName <em>Layout File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout File Name</em>' attribute.
	 * @see #getLayoutFileName()
	 * @generated
	 */
	void setLayoutFileName(String value);

	/**
	 * Returns the value of the '<em><b>Has Card Item</b></em>' containment reference list.
	 * The list contents are of type {@link Application.CardItems}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Card Item</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Card Item</em>' containment reference list.
	 * @see Application.ApplicationPackage#getCardView_HasCardItem()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment layout='list' collapsible='false'"
	 * @generated
	 */
	EList<CardItems> getHasCardItem();

	/**
	 * Returns the value of the '<em><b>Link To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link To</em>' reference.
	 * @see #setLinkTo(Fragment)
	 * @see Application.ApplicationPackage#getCardView_LinkTo()
	 * @model annotation="gmf.link target.decoration='arrow' label='linkedTo' style='solid'"
	 * @generated
	 */
	Fragment getLinkTo();

	/**
	 * Sets the value of the '{@link Application.CardView#getLinkTo <em>Link To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link To</em>' reference.
	 * @see #getLinkTo()
	 * @generated
	 */
	void setLinkTo(Fragment value);

} // CardView
