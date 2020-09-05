/**
 */
package Application;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Map Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Application.ApplicationPackage#getMapType()
 * @model
 * @generated
 */
public enum MapType implements Enumerator {
	/**
	 * The '<em><b>Google Map</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GOOGLE_MAP_VALUE
	 * @generated
	 * @ordered
	 */
	GOOGLE_MAP(0, "googleMap", "googleMap"),

	/**
	 * The '<em><b>Bing Map</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BING_MAP_VALUE
	 * @generated
	 * @ordered
	 */
	BING_MAP(0, "bingMap", "bingMap"),

	/**
	 * The '<em><b>Open Layer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPEN_LAYER_VALUE
	 * @generated
	 * @ordered
	 */
	OPEN_LAYER(0, "openLayer", "openLayer");

	/**
	 * The '<em><b>Google Map</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Google Map</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GOOGLE_MAP
	 * @model name="googleMap"
	 * @generated
	 * @ordered
	 */
	public static final int GOOGLE_MAP_VALUE = 0;

	/**
	 * The '<em><b>Bing Map</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bing Map</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BING_MAP
	 * @model name="bingMap"
	 * @generated
	 * @ordered
	 */
	public static final int BING_MAP_VALUE = 0;

	/**
	 * The '<em><b>Open Layer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Open Layer</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPEN_LAYER
	 * @model name="openLayer"
	 * @generated
	 * @ordered
	 */
	public static final int OPEN_LAYER_VALUE = 0;

	/**
	 * An array of all the '<em><b>Map Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MapType[] VALUES_ARRAY =
		new MapType[] {
			GOOGLE_MAP,
			BING_MAP,
			OPEN_LAYER,
		};

	/**
	 * A public read-only list of all the '<em><b>Map Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MapType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Map Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MapType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MapType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Map Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MapType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MapType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Map Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MapType get(int value) {
		switch (value) {
			case GOOGLE_MAP_VALUE: return GOOGLE_MAP;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private MapType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //MapType
