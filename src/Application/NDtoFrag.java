/**
 */
package Application;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NDto Frag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Application.NDtoFrag#getNdtofTarget <em>Ndtof Target</em>}</li>
 *   <li>{@link Application.NDtoFrag#getNdtofSource <em>Ndtof Source</em>}</li>
 *   <li>{@link Application.NDtoFrag#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see Application.ApplicationPackage#getNDtoFrag()
 * @model annotation="gmf.link source='ndtofSource' target='ndtofTarget' style='dash' width='2'"
 * @generated
 */
public interface NDtoFrag extends EObject {
	/**
	 * Returns the value of the '<em><b>Ndtof Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ndtof Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ndtof Target</em>' reference.
	 * @see #setNdtofTarget(Fragment)
	 * @see Application.ApplicationPackage#getNDtoFrag_NdtofTarget()
	 * @model required="true"
	 * @generated
	 */
	Fragment getNdtofTarget();

	/**
	 * Sets the value of the '{@link Application.NDtoFrag#getNdtofTarget <em>Ndtof Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ndtof Target</em>' reference.
	 * @see #getNdtofTarget()
	 * @generated
	 */
	void setNdtofTarget(Fragment value);

	/**
	 * Returns the value of the '<em><b>Ndtof Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ndtof Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ndtof Source</em>' reference.
	 * @see #setNdtofSource(NavigationDrawer)
	 * @see Application.ApplicationPackage#getNDtoFrag_NdtofSource()
	 * @model
	 * @generated
	 */
	NavigationDrawer getNdtofSource();

	/**
	 * Sets the value of the '{@link Application.NDtoFrag#getNdtofSource <em>Ndtof Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ndtof Source</em>' reference.
	 * @see #getNdtofSource()
	 * @generated
	 */
	void setNdtofSource(NavigationDrawer value);

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
	 * @see Application.ApplicationPackage#getNDtoFrag_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Application.NDtoFrag#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // NDtoFrag
