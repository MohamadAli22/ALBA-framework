/**
 */
package Application;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Category Fragment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Application.CategoryFragment#getHasCardView <em>Has Card View</em>}</li>
 *   <li>{@link Application.CategoryFragment#getColNumber <em>Col Number</em>}</li>
 * </ul>
 *
 * @see Application.ApplicationPackage#getCategoryFragment()
 * @model
 * @generated
 */
public interface CategoryFragment extends Fragment {
	/**
	 * Returns the value of the '<em><b>Has Card View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Card View</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Card View</em>' containment reference.
	 * @see #setHasCardView(CardView)
	 * @see Application.ApplicationPackage#getCategoryFragment_HasCardView()
	 * @model containment="true"
	 *        annotation="gmf.compartment collapsible='false'"
	 * @generated
	 */
	CardView getHasCardView();

	/**
	 * Sets the value of the '{@link Application.CategoryFragment#getHasCardView <em>Has Card View</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Card View</em>' containment reference.
	 * @see #getHasCardView()
	 * @generated
	 */
	void setHasCardView(CardView value);

	/**
	 * Returns the value of the '<em><b>Col Number</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Col Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Col Number</em>' attribute.
	 * @see #setColNumber(int)
	 * @see Application.ApplicationPackage#getCategoryFragment_ColNumber()
	 * @model default="2"
	 * @generated
	 */
	int getColNumber();

	/**
	 * Sets the value of the '{@link Application.CategoryFragment#getColNumber <em>Col Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Col Number</em>' attribute.
	 * @see #getColNumber()
	 * @generated
	 */
	void setColNumber(int value);

} // CategoryFragment
