/**
 */
package Application;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TBto Frag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Application.TBtoFrag#getTbtofSource <em>Tbtof Source</em>}</li>
 *   <li>{@link Application.TBtoFrag#getTbtofTarget <em>Tbtof Target</em>}</li>
 *   <li>{@link Application.TBtoFrag#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see Application.ApplicationPackage#getTBtoFrag()
 * @model annotation="gmf.link source='tbtofSource' target='tbtofTarget' style='dash' width='2'"
 * @generated
 */
public interface TBtoFrag extends EObject {
	/**
	 * Returns the value of the '<em><b>Tbtof Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tbtof Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tbtof Source</em>' reference.
	 * @see #setTbtofSource(TabBar)
	 * @see Application.ApplicationPackage#getTBtoFrag_TbtofSource()
	 * @model
	 * @generated
	 */
	TabBar getTbtofSource();

	/**
	 * Sets the value of the '{@link Application.TBtoFrag#getTbtofSource <em>Tbtof Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tbtof Source</em>' reference.
	 * @see #getTbtofSource()
	 * @generated
	 */
	void setTbtofSource(TabBar value);

	/**
	 * Returns the value of the '<em><b>Tbtof Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tbtof Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tbtof Target</em>' reference.
	 * @see #setTbtofTarget(Fragment)
	 * @see Application.ApplicationPackage#getTBtoFrag_TbtofTarget()
	 * @model required="true"
	 * @generated
	 */
	Fragment getTbtofTarget();

	/**
	 * Sets the value of the '{@link Application.TBtoFrag#getTbtofTarget <em>Tbtof Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tbtof Target</em>' reference.
	 * @see #getTbtofTarget()
	 * @generated
	 */
	void setTbtofTarget(Fragment value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Application.ApplicationPackage#getTBtoFrag_Name()
	 * @model default=""
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Application.TBtoFrag#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // TBtoFrag
