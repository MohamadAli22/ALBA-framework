/**
 */
package Application;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Application.Map#getApiKey <em>Api Key</em>}</li>
 *   <li>{@link Application.Map#getMapType <em>Map Type</em>}</li>
 *   <li>{@link Application.Map#isBindCardsToPins <em>Bind Cards To Pins</em>}</li>
 *   <li>{@link Application.Map#getZoomLevel <em>Zoom Level</em>}</li>
 *   <li>{@link Application.Map#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see Application.ApplicationPackage#getMap()
 * @model annotation="gmf.node figure='figures.MapFigure' label.icon='false' label='name'"
 * @generated
 */
public interface Map extends EObject {
	/**
	 * Returns the value of the '<em><b>Api Key</b></em>' attribute.
	 * The default value is <code>"AIzaSyCQ2IuVejeAjpoZA9w-d9IJ14xcoAy7Yd4"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Key</em>' attribute.
	 * @see #setApiKey(String)
	 * @see Application.ApplicationPackage#getMap_ApiKey()
	 * @model default="AIzaSyCQ2IuVejeAjpoZA9w-d9IJ14xcoAy7Yd4"
	 * @generated
	 */
	String getApiKey();

	/**
	 * Sets the value of the '{@link Application.Map#getApiKey <em>Api Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Key</em>' attribute.
	 * @see #getApiKey()
	 * @generated
	 */
	void setApiKey(String value);

	/**
	 * Returns the value of the '<em><b>Map Type</b></em>' attribute.
	 * The literals are from the enumeration {@link Application.MapType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Map Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map Type</em>' attribute.
	 * @see Application.MapType
	 * @see #setMapType(MapType)
	 * @see Application.ApplicationPackage#getMap_MapType()
	 * @model
	 * @generated
	 */
	MapType getMapType();

	/**
	 * Sets the value of the '{@link Application.Map#getMapType <em>Map Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Map Type</em>' attribute.
	 * @see Application.MapType
	 * @see #getMapType()
	 * @generated
	 */
	void setMapType(MapType value);

	/**
	 * Returns the value of the '<em><b>Bind Cards To Pins</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bind Cards To Pins</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bind Cards To Pins</em>' attribute.
	 * @see #setBindCardsToPins(boolean)
	 * @see Application.ApplicationPackage#getMap_BindCardsToPins()
	 * @model
	 * @generated
	 */
	boolean isBindCardsToPins();

	/**
	 * Sets the value of the '{@link Application.Map#isBindCardsToPins <em>Bind Cards To Pins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bind Cards To Pins</em>' attribute.
	 * @see #isBindCardsToPins()
	 * @generated
	 */
	void setBindCardsToPins(boolean value);

	/**
	 * Returns the value of the '<em><b>Zoom Level</b></em>' attribute.
	 * The default value is <code>"16"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zoom Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zoom Level</em>' attribute.
	 * @see #setZoomLevel(int)
	 * @see Application.ApplicationPackage#getMap_ZoomLevel()
	 * @model default="16"
	 * @generated
	 */
	int getZoomLevel();

	/**
	 * Sets the value of the '{@link Application.Map#getZoomLevel <em>Zoom Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zoom Level</em>' attribute.
	 * @see #getZoomLevel()
	 * @generated
	 */
	void setZoomLevel(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"MyMap"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Application.ApplicationPackage#getMap_Name()
	 * @model default="MyMap"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Application.Map#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Map
