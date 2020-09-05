/**
 */
package Application;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Locations Fragment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Application.LocationsFragment#getHasSubCatTabBar <em>Has Sub Cat Tab Bar</em>}</li>
 *   <li>{@link Application.LocationsFragment#getHasMap <em>Has Map</em>}</li>
 *   <li>{@link Application.LocationsFragment#getHasRecView <em>Has Rec View</em>}</li>
 * </ul>
 *
 * @see Application.ApplicationPackage#getLocationsFragment()
 * @model
 * @generated
 */
public interface LocationsFragment extends Fragment {
	/**
	 * Returns the value of the '<em><b>Has Sub Cat Tab Bar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Sub Cat Tab Bar</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Sub Cat Tab Bar</em>' containment reference.
	 * @see #setHasSubCatTabBar(SubCategoryTabbar)
	 * @see Application.ApplicationPackage#getLocationsFragment_HasSubCatTabBar()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='list' collapsible='false'"
	 * @generated
	 */
	SubCategoryTabbar getHasSubCatTabBar();

	/**
	 * Sets the value of the '{@link Application.LocationsFragment#getHasSubCatTabBar <em>Has Sub Cat Tab Bar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Sub Cat Tab Bar</em>' containment reference.
	 * @see #getHasSubCatTabBar()
	 * @generated
	 */
	void setHasSubCatTabBar(SubCategoryTabbar value);

	/**
	 * Returns the value of the '<em><b>Has Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Map</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Map</em>' containment reference.
	 * @see #setHasMap(Map)
	 * @see Application.ApplicationPackage#getLocationsFragment_HasMap()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='list' collapsible='false'"
	 * @generated
	 */
	Map getHasMap();

	/**
	 * Sets the value of the '{@link Application.LocationsFragment#getHasMap <em>Has Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Map</em>' containment reference.
	 * @see #getHasMap()
	 * @generated
	 */
	void setHasMap(Map value);

	/**
	 * Returns the value of the '<em><b>Has Rec View</b></em>' containment reference list.
	 * The list contents are of type {@link Application.LocationsRecyclerView}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Rec View</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Rec View</em>' containment reference list.
	 * @see Application.ApplicationPackage#getLocationsFragment_HasRecView()
	 * @model containment="true" upper="2"
	 *        annotation="gmf.compartment layout='list' collapsible='false'"
	 * @generated
	 */
	EList<LocationsRecyclerView> getHasRecView();

} // LocationsFragment
