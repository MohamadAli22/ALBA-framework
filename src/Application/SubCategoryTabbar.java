/**
 */
package Application;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Category Tabbar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Application.SubCategoryTabbar#getTabTextColor <em>Tab Text Color</em>}</li>
 *   <li>{@link Application.SubCategoryTabbar#getTabIndicatorColor <em>Tab Indicator Color</em>}</li>
 *   <li>{@link Application.SubCategoryTabbar#getName <em>Name</em>}</li>
 *   <li>{@link Application.SubCategoryTabbar#getHasAPi <em>Has APi</em>}</li>
 *   <li>{@link Application.SubCategoryTabbar#getHasTabs <em>Has Tabs</em>}</li>
 *   <li>{@link Application.SubCategoryTabbar#getTabSelectedTextColor <em>Tab Selected Text Color</em>}</li>
 * </ul>
 *
 * @see Application.ApplicationPackage#getSubCategoryTabbar()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface SubCategoryTabbar extends EObject {
	/**
	 * Returns the value of the '<em><b>Tab Text Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tab Text Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tab Text Color</em>' attribute.
	 * @see #setTabTextColor(String)
	 * @see Application.ApplicationPackage#getSubCategoryTabbar_TabTextColor()
	 * @model
	 * @generated
	 */
	String getTabTextColor();

	/**
	 * Sets the value of the '{@link Application.SubCategoryTabbar#getTabTextColor <em>Tab Text Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tab Text Color</em>' attribute.
	 * @see #getTabTextColor()
	 * @generated
	 */
	void setTabTextColor(String value);

	/**
	 * Returns the value of the '<em><b>Tab Indicator Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tab Indicator Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tab Indicator Color</em>' attribute.
	 * @see #setTabIndicatorColor(String)
	 * @see Application.ApplicationPackage#getSubCategoryTabbar_TabIndicatorColor()
	 * @model
	 * @generated
	 */
	String getTabIndicatorColor();

	/**
	 * Sets the value of the '{@link Application.SubCategoryTabbar#getTabIndicatorColor <em>Tab Indicator Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tab Indicator Color</em>' attribute.
	 * @see #getTabIndicatorColor()
	 * @generated
	 */
	void setTabIndicatorColor(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"MySubCat"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Application.ApplicationPackage#getSubCategoryTabbar_Name()
	 * @model default="MySubCat"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Application.SubCategoryTabbar#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Has APi</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has APi</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has APi</em>' containment reference.
	 * @see #setHasAPi(Api)
	 * @see Application.ApplicationPackage#getSubCategoryTabbar_HasAPi()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='list' collapsible='true'"
	 * @generated
	 */
	Api getHasAPi();

	/**
	 * Sets the value of the '{@link Application.SubCategoryTabbar#getHasAPi <em>Has APi</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has APi</em>' containment reference.
	 * @see #getHasAPi()
	 * @generated
	 */
	void setHasAPi(Api value);

	/**
	 * Returns the value of the '<em><b>Has Tabs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Tabs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Tabs</em>' containment reference.
	 * @see #setHasTabs(Tab)
	 * @see Application.ApplicationPackage#getSubCategoryTabbar_HasTabs()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment layout='list' collapsible='true'"
	 * @generated
	 */
	Tab getHasTabs();

	/**
	 * Sets the value of the '{@link Application.SubCategoryTabbar#getHasTabs <em>Has Tabs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Tabs</em>' containment reference.
	 * @see #getHasTabs()
	 * @generated
	 */
	void setHasTabs(Tab value);

	/**
	 * Returns the value of the '<em><b>Tab Selected Text Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tab Selected Text Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tab Selected Text Color</em>' attribute.
	 * @see #setTabSelectedTextColor(String)
	 * @see Application.ApplicationPackage#getSubCategoryTabbar_TabSelectedTextColor()
	 * @model
	 * @generated
	 */
	String getTabSelectedTextColor();

	/**
	 * Sets the value of the '{@link Application.SubCategoryTabbar#getTabSelectedTextColor <em>Tab Selected Text Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tab Selected Text Color</em>' attribute.
	 * @see #getTabSelectedTextColor()
	 * @generated
	 */
	void setTabSelectedTextColor(String value);

} // SubCategoryTabbar
