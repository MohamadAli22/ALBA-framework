/**
 */
package Application;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MAto Frag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Application.MAtoFrag#getMtofTarget <em>Mtof Target</em>}</li>
 *   <li>{@link Application.MAtoFrag#getMtofSource <em>Mtof Source</em>}</li>
 *   <li>{@link Application.MAtoFrag#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see Application.ApplicationPackage#getMAtoFrag()
 * @model annotation="gmf.link source='mtofSource' target='mtofTarget' style='solid' width='2' target.decoration='arrow'"
 * @generated
 */
public interface MAtoFrag extends EObject {
	/**
	 * Returns the value of the '<em><b>Mtof Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mtof Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mtof Target</em>' reference.
	 * @see #setMtofTarget(Fragment)
	 * @see Application.ApplicationPackage#getMAtoFrag_MtofTarget()
	 * @model required="true"
	 * @generated
	 */
	Fragment getMtofTarget();

	/**
	 * Sets the value of the '{@link Application.MAtoFrag#getMtofTarget <em>Mtof Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mtof Target</em>' reference.
	 * @see #getMtofTarget()
	 * @generated
	 */
	void setMtofTarget(Fragment value);

	/**
	 * Returns the value of the '<em><b>Mtof Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mtof Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mtof Source</em>' reference.
	 * @see #setMtofSource(MainActivity)
	 * @see Application.ApplicationPackage#getMAtoFrag_MtofSource()
	 * @model
	 * @generated
	 */
	MainActivity getMtofSource();

	/**
	 * Sets the value of the '{@link Application.MAtoFrag#getMtofSource <em>Mtof Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mtof Source</em>' reference.
	 * @see #getMtofSource()
	 * @generated
	 */
	void setMtofSource(MainActivity value);

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
	 * @see Application.ApplicationPackage#getMAtoFrag_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Application.MAtoFrag#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // MAtoFrag
