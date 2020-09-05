/**
 */
package Application;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Locations Recycler View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Application.LocationsRecyclerView#getHasCV <em>Has CV</em>}</li>
 *   <li>{@link Application.LocationsRecyclerView#isIsVertical <em>Is Vertical</em>}</li>
 *   <li>{@link Application.LocationsRecyclerView#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see Application.ApplicationPackage#getLocationsRecyclerView()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface LocationsRecyclerView extends EObject {
	/**
	 * Returns the value of the '<em><b>Has CV</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has CV</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has CV</em>' containment reference.
	 * @see #setHasCV(CardView)
	 * @see Application.ApplicationPackage#getLocationsRecyclerView_HasCV()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment layout='list' collapsible='false'"
	 * @generated
	 */
	CardView getHasCV();

	/**
	 * Sets the value of the '{@link Application.LocationsRecyclerView#getHasCV <em>Has CV</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has CV</em>' containment reference.
	 * @see #getHasCV()
	 * @generated
	 */
	void setHasCV(CardView value);

	/**
	 * Returns the value of the '<em><b>Is Vertical</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Vertical</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Vertical</em>' attribute.
	 * @see #setIsVertical(boolean)
	 * @see Application.ApplicationPackage#getLocationsRecyclerView_IsVertical()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsVertical();

	/**
	 * Sets the value of the '{@link Application.LocationsRecyclerView#isIsVertical <em>Is Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Vertical</em>' attribute.
	 * @see #isIsVertical()
	 * @generated
	 */
	void setIsVertical(boolean value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Application.ApplicationPackage#getLocationsRecyclerView_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Application.LocationsRecyclerView#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // LocationsRecyclerView
