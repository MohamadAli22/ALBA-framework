/**
 */
package Application;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Application.ApplicationFactory
 * @model kind="package"
 * @generated
 */
public interface ApplicationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Application";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.alba2.mdserg.se.ui.ir";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "www.alba2.mdserg.se.ui.ir";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApplicationPackage eINSTANCE = Application.impl.ApplicationPackageImpl.init();

	/**
	 * The meta object id for the '{@link Application.impl.APPImpl <em>APP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Application.impl.APPImpl
	 * @see Application.impl.ApplicationPackageImpl#getAPP()
	 * @generated
	 */
	int APP = 0;

	/**
	 * The feature id for the '<em><b>Has Conf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP__HAS_CONF = 0;

	/**
	 * The feature id for the '<em><b>Has Main Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP__HAS_MAIN_ACTIVITY = 1;

	/**
	 * The feature id for the '<em><b>App Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP__APP_NAME = 2;

	/**
	 * The feature id for the '<em><b>Has Theme</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP__HAS_THEME = 3;

	/**
	 * The feature id for the '<em><b>Has Frag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP__HAS_FRAG = 4;

	/**
	 * The feature id for the '<em><b>MAhas Fragment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP__MAHAS_FRAGMENT = 5;

	/**
	 * The feature id for the '<em><b>TBhas Fragment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP__TBHAS_FRAGMENT = 6;

	/**
	 * The feature id for the '<em><b>NDhas Fragment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP__NDHAS_FRAGMENT = 7;

	/**
	 * The number of structural features of the '<em>APP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link Application.impl.ConfigImpl <em>Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Application.impl.ConfigImpl
	 * @see Application.impl.ApplicationPackageImpl#getConfig()
	 * @generated
	 */
	int CONFIG = 1;

	/**
	 * The feature id for the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__PACKAGE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__ICON = 1;

	/**
	 * The feature id for the '<em><b>Min Sdk Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__MIN_SDK_VERSION = 2;

	/**
	 * The feature id for the '<em><b>Target Sdk Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__TARGET_SDK_VERSION = 3;

	/**
	 * The feature id for the '<em><b>Version Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__VERSION_CODE = 4;

	/**
	 * The feature id for the '<em><b>Version Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__VERSION_NAME = 5;

	/**
	 * The feature id for the '<em><b>Build Tools Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__BUILD_TOOLS_VERSION = 6;

	/**
	 * The feature id for the '<em><b>Compile Sdk Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__COMPILE_SDK_VERSION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__NAME = 8;

	/**
	 * The number of structural features of the '<em>Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link Application.impl.ThemeImpl <em>Theme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Application.impl.ThemeImpl
	 * @see Application.impl.ApplicationPackageImpl#getTheme()
	 * @generated
	 */
	int THEME = 2;

	/**
	 * The feature id for the '<em><b>Color Primary Dark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEME__COLOR_PRIMARY_DARK = 0;

	/**
	 * The feature id for the '<em><b>Color Primary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEME__COLOR_PRIMARY = 1;

	/**
	 * The feature id for the '<em><b>Color Accent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEME__COLOR_ACCENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEME__NAME = 3;

	/**
	 * The number of structural features of the '<em>Theme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEME_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link Application.impl.MainActivityImpl <em>Main Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Application.impl.MainActivityImpl
	 * @see Application.impl.ApplicationPackageImpl#getMainActivity()
	 * @generated
	 */
	int MAIN_ACTIVITY = 3;

	/**
	 * The feature id for the '<em><b>Has Nav</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_ACTIVITY__HAS_NAV = 0;

	/**
	 * The feature id for the '<em><b>Has Bar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_ACTIVITY__HAS_BAR = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_ACTIVITY__NAME = 2;

	/**
	 * The number of structural features of the '<em>Main Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_ACTIVITY_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link Application.impl.NavigationDrawerImpl <em>Navigation Drawer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Application.impl.NavigationDrawerImpl
	 * @see Application.impl.ApplicationPackageImpl#getNavigationDrawer()
	 * @generated
	 */
	int NAVIGATION_DRAWER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_DRAWER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Header Drawable Src Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_DRAWER__HEADER_DRAWABLE_SRC_NAME = 1;

	/**
	 * The number of structural features of the '<em>Navigation Drawer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_DRAWER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link Application.impl.TabBarImpl <em>Tab Bar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Application.impl.TabBarImpl
	 * @see Application.impl.ApplicationPackageImpl#getTabBar()
	 * @generated
	 */
	int TAB_BAR = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_BAR__NAME = 0;

	/**
	 * The number of structural features of the '<em>Tab Bar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_BAR_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link Application.impl.FragmentImpl <em>Fragment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Application.impl.FragmentImpl
	 * @see Application.impl.ApplicationPackageImpl#getFragment()
	 * @generated
	 */
	int FRAGMENT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Has Api</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT__HAS_API = 1;

	/**
	 * The number of structural features of the '<em>Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link Application.impl.LoginFragmentImpl <em>Login Fragment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Application.impl.LoginFragmentImpl
	 * @see Application.impl.ApplicationPackageImpl#getLoginFragment()
	 * @generated
	 */
	int LOGIN_FRAGMENT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_FRAGMENT__NAME = FRAGMENT__NAME;

	/**
	 * The feature id for the '<em><b>Has Api</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_FRAGMENT__HAS_API = FRAGMENT__HAS_API;

	/**
	 * The feature id for the '<em><b>Generate Email Validation Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_FRAGMENT__GENERATE_EMAIL_VALIDATION_CODE = FRAGMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generate Phone Number Validation Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_FRAGMENT__GENERATE_PHONE_NUMBER_VALIDATION_CODE = FRAGMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Login Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_FRAGMENT_FEATURE_COUNT = FRAGMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link Application.impl.CategoryFragmentImpl <em>Category Fragment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Application.impl.CategoryFragmentImpl
	 * @see Application.impl.ApplicationPackageImpl#getCategoryFragment()
	 * @generated
	 */
	int CATEGORY_FRAGMENT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_FRAGMENT__NAME = FRAGMENT__NAME;

	/**
	 * The feature id for the '<em><b>Has Api</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_FRAGMENT__HAS_API = FRAGMENT__HAS_API;

	/**
	 * The feature id for the '<em><b>Has Card View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_FRAGMENT__HAS_CARD_VIEW = FRAGMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Col Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_FRAGMENT__COL_NUMBER = FRAGMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Category Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_FRAGMENT_FEATURE_COUNT = FRAGMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link Application.impl.LocationsFragmentImpl <em>Locations Fragment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Application.impl.LocationsFragmentImpl
	 * @see Application.impl.ApplicationPackageImpl#getLocationsFragment()
	 * @generated
	 */
	int LOCATIONS_FRAGMENT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATIONS_FRAGMENT__NAME = FRAGMENT__NAME;

	/**
	 * The feature id for the '<em><b>Has Api</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATIONS_FRAGMENT__HAS_API = FRAGMENT__HAS_API;

	/**
	 * The feature id for the '<em><b>Has Sub Cat Tab Bar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATIONS_FRAGMENT__HAS_SUB_CAT_TAB_BAR = FRAGMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATIONS_FRAGMENT__HAS_MAP = FRAGMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Rec View</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATIONS_FRAGMENT__HAS_REC_VIEW = FRAGMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Locations Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATIONS_FRAGMENT_FEATURE_COUNT = FRAGMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link Application.impl.LocationDetailsFragmentImpl <em>Location Details Fragment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Application.impl.LocationDetailsFragmentImpl
	 * @see Application.impl.ApplicationPackageImpl#getLocationDetailsFragment()
	 * @generated
	 */
	int LOCATION_DETAILS_FRAGMENT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_DETAILS_FRAGMENT__NAME = FRAGMENT__NAME;

	/**
	 * The feature id for the '<em><b>Has Api</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_DETAILS_FRAGMENT__HAS_API = FRAGMENT__HAS_API;

	/**
	 * The feature id for the '<em><b>Show Rating Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_DETAILS_FRAGMENT__SHOW_RATING_OPTION = FRAGMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Show Comment Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_DETAILS_FRAGMENT__SHOW_COMMENT_OPTION = FRAGMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Show Call Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_DETAILS_FRAGMENT__SHOW_CALL_OPTION = FRAGMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Show Navigation Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_DETAILS_FRAGMENT__SHOW_NAVIGATION_OPTION = FRAGMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Show Add Comment Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_DETAILS_FRAGMENT__SHOW_ADD_COMMENT_OPTION = FRAGMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Show Add To Bookmark Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_DETAILS_FRAGMENT__SHOW_ADD_TO_BOOKMARK_OPTION = FRAGMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Location Details Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_DETAILS_FRAGMENT_FEATURE_COUNT = FRAGMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link Application.impl.ApiImpl <em>Api</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Application.impl.ApiImpl
	 * @see Application.impl.ApplicationPackageImpl#getApi()
	 * @generated
	 */
	int API = 11;

	/**
	 * The feature id for the '<em><b>Base Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__BASE_ADDRESS = 0;

	/**
	 * The feature id for the '<em><b>Link Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__LINK_ADDRESS = 1;

	/**
	 * The feature id for the '<em><b>Has Res Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__HAS_RES_ITEM = 2;

	/**
	 * The feature id for the '<em><b>Has Req Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__HAS_REQ_ITEM = 3;

	/**
	 * The number of structural features of the '<em>Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link Application.impl.ResponseItemImpl <em>Response Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Application.impl.ResponseItemImpl
	 * @see Application.impl.ApplicationPackageImpl#getResponseItem()
	 * @generated
	 */
	int RESPONSE_ITEM = 12;

	/**
	 * The feature id for the '<em><b>Response Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_ITEM__RESPONSE_KEY = 0;

	/**
	 * The feature id for the '<em><b>Response Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_ITEM__RESPONSE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_ITEM__DEFAULT_VALUE = 2;

	/**
	 * The number of structural features of the '<em>Response Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_ITEM_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link Application.impl.RequestItemImpl <em>Request Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Application.impl.RequestItemImpl
	 * @see Application.impl.ApplicationPackageImpl#getRequestItem()
	 * @generated
	 */
	int REQUEST_ITEM = 13;

	/**
	 * The feature id for the '<em><b>Request Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_ITEM__REQUEST_KEY = 0;

	/**
	 * The feature id for the '<em><b>Request Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_ITEM__REQUEST_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Request Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_ITEM_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link Application.impl.MapImpl <em>Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Application.impl.MapImpl
	 * @see Application.impl.ApplicationPackageImpl#getMap()
	 * @generated
	 */
	int MAP = 14;

	/**
	 * The feature id for the '<em><b>Api Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__API_KEY = 0;

	/**
	 * The feature id for the '<em><b>Map Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__MAP_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Bind Cards To Pins</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__BIND_CARDS_TO_PINS = 2;

	/**
	 * The feature id for the '<em><b>Zoom Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__ZOOM_LEVEL = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__NAME = 4;

	/**
	 * The number of structural features of the '<em>Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link Application.impl.LocationsRecyclerViewImpl <em>Locations Recycler View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Application.impl.LocationsRecyclerViewImpl
	 * @see Application.impl.ApplicationPackageImpl#getLocationsRecyclerView()
	 * @generated
	 */
	int LOCATIONS_RECYCLER_VIEW = 15;

	/**
	 * The feature id for the '<em><b>Has CV</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATIONS_RECYCLER_VIEW__HAS_CV = 0;

	/**
	 * The feature id for the '<em><b>Is Vertical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATIONS_RECYCLER_VIEW__IS_VERTICAL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATIONS_RECYCLER_VIEW__NAME = 2;

	/**
	 * The number of structural features of the '<em>Locations Recycler View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATIONS_RECYCLER_VIEW_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link Application.impl.CardViewImpl <em>Card View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Application.impl.CardViewImpl
	 * @see Application.impl.ApplicationPackageImpl#getCardView()
	 * @generated
	 */
	int CARD_VIEW = 16;

	/**
	 * The feature id for the '<em><b>Layout File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_VIEW__LAYOUT_FILE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Has Card Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_VIEW__HAS_CARD_ITEM = 1;

	/**
	 * The feature id for the '<em><b>Link To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_VIEW__LINK_TO = 2;

	/**
	 * The number of structural features of the '<em>Card View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_VIEW_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link Application.impl.CardItemsImpl <em>Card Items</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Application.impl.CardItemsImpl
	 * @see Application.impl.ApplicationPackageImpl#getCardItems()
	 * @generated
	 */
	int CARD_ITEMS = 17;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_ITEMS__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_ITEMS__ID = 1;

	/**
	 * The feature id for the '<em><b>Connect To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_ITEMS__CONNECT_TO = 2;

	/**
	 * The number of structural features of the '<em>Card Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_ITEMS_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link Application.impl.SubCategoryTabbarImpl <em>Sub Category Tabbar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Application.impl.SubCategoryTabbarImpl
	 * @see Application.impl.ApplicationPackageImpl#getSubCategoryTabbar()
	 * @generated
	 */
	int SUB_CATEGORY_TABBAR = 18;

	/**
	 * The feature id for the '<em><b>Tab Text Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CATEGORY_TABBAR__TAB_TEXT_COLOR = 0;

	/**
	 * The feature id for the '<em><b>Tab Indicator Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CATEGORY_TABBAR__TAB_INDICATOR_COLOR = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CATEGORY_TABBAR__NAME = 2;

	/**
	 * The feature id for the '<em><b>Has APi</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CATEGORY_TABBAR__HAS_API = 3;

	/**
	 * The feature id for the '<em><b>Has Tabs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CATEGORY_TABBAR__HAS_TABS = 4;

	/**
	 * The feature id for the '<em><b>Tab Selected Text Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CATEGORY_TABBAR__TAB_SELECTED_TEXT_COLOR = 5;

	/**
	 * The number of structural features of the '<em>Sub Category Tabbar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CATEGORY_TABBAR_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link Application.impl.TabImpl <em>Tab</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Application.impl.TabImpl
	 * @see Application.impl.ApplicationPackageImpl#getTab()
	 * @generated
	 */
	int TAB = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB__NAME = 0;

	/**
	 * The feature id for the '<em><b>Get Item Id From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB__GET_ITEM_ID_FROM = 1;

	/**
	 * The feature id for the '<em><b>Get Item Name From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB__GET_ITEM_NAME_FROM = 2;

	/**
	 * The number of structural features of the '<em>Tab</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link Application.impl.MAtoFragImpl <em>MAto Frag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Application.impl.MAtoFragImpl
	 * @see Application.impl.ApplicationPackageImpl#getMAtoFrag()
	 * @generated
	 */
	int MATO_FRAG = 20;

	/**
	 * The feature id for the '<em><b>Mtof Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATO_FRAG__MTOF_TARGET = 0;

	/**
	 * The feature id for the '<em><b>Mtof Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATO_FRAG__MTOF_SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATO_FRAG__NAME = 2;

	/**
	 * The number of structural features of the '<em>MAto Frag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATO_FRAG_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link Application.impl.TBtoFragImpl <em>TBto Frag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Application.impl.TBtoFragImpl
	 * @see Application.impl.ApplicationPackageImpl#getTBtoFrag()
	 * @generated
	 */
	int TBTO_FRAG = 21;

	/**
	 * The feature id for the '<em><b>Tbtof Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBTO_FRAG__TBTOF_SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Tbtof Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBTO_FRAG__TBTOF_TARGET = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBTO_FRAG__NAME = 2;

	/**
	 * The number of structural features of the '<em>TBto Frag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBTO_FRAG_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link Application.impl.NDtoFragImpl <em>NDto Frag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Application.impl.NDtoFragImpl
	 * @see Application.impl.ApplicationPackageImpl#getNDtoFrag()
	 * @generated
	 */
	int NDTO_FRAG = 22;

	/**
	 * The feature id for the '<em><b>Ndtof Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NDTO_FRAG__NDTOF_TARGET = 0;

	/**
	 * The feature id for the '<em><b>Ndtof Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NDTO_FRAG__NDTOF_SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NDTO_FRAG__NAME = 2;

	/**
	 * The number of structural features of the '<em>NDto Frag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NDTO_FRAG_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link Application.MapType <em>Map Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Application.MapType
	 * @see Application.impl.ApplicationPackageImpl#getMapType()
	 * @generated
	 */
	int MAP_TYPE = 23;

	/**
	 * The meta object id for the '{@link Application.cardItemTypes <em>card Item Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Application.cardItemTypes
	 * @see Application.impl.ApplicationPackageImpl#getcardItemTypes()
	 * @generated
	 */
	int CARD_ITEM_TYPES = 24;


	/**
	 * Returns the meta object for class '{@link Application.APP <em>APP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APP</em>'.
	 * @see Application.APP
	 * @generated
	 */
	EClass getAPP();

	/**
	 * Returns the meta object for the containment reference '{@link Application.APP#getHasConf <em>Has Conf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Conf</em>'.
	 * @see Application.APP#getHasConf()
	 * @see #getAPP()
	 * @generated
	 */
	EReference getAPP_HasConf();

	/**
	 * Returns the meta object for the containment reference '{@link Application.APP#getHasMainActivity <em>Has Main Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Main Activity</em>'.
	 * @see Application.APP#getHasMainActivity()
	 * @see #getAPP()
	 * @generated
	 */
	EReference getAPP_HasMainActivity();

	/**
	 * Returns the meta object for the attribute '{@link Application.APP#getAppName <em>App Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>App Name</em>'.
	 * @see Application.APP#getAppName()
	 * @see #getAPP()
	 * @generated
	 */
	EAttribute getAPP_AppName();

	/**
	 * Returns the meta object for the containment reference '{@link Application.APP#getHasTheme <em>Has Theme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Theme</em>'.
	 * @see Application.APP#getHasTheme()
	 * @see #getAPP()
	 * @generated
	 */
	EReference getAPP_HasTheme();

	/**
	 * Returns the meta object for the containment reference list '{@link Application.APP#getHasFrag <em>Has Frag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Frag</em>'.
	 * @see Application.APP#getHasFrag()
	 * @see #getAPP()
	 * @generated
	 */
	EReference getAPP_HasFrag();

	/**
	 * Returns the meta object for the containment reference list '{@link Application.APP#getMAhasFragment <em>MAhas Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>MAhas Fragment</em>'.
	 * @see Application.APP#getMAhasFragment()
	 * @see #getAPP()
	 * @generated
	 */
	EReference getAPP_MAhasFragment();

	/**
	 * Returns the meta object for the containment reference list '{@link Application.APP#getTBhasFragment <em>TBhas Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>TBhas Fragment</em>'.
	 * @see Application.APP#getTBhasFragment()
	 * @see #getAPP()
	 * @generated
	 */
	EReference getAPP_TBhasFragment();

	/**
	 * Returns the meta object for the containment reference list '{@link Application.APP#getNDhasFragment <em>NDhas Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>NDhas Fragment</em>'.
	 * @see Application.APP#getNDhasFragment()
	 * @see #getAPP()
	 * @generated
	 */
	EReference getAPP_NDhasFragment();

	/**
	 * Returns the meta object for class '{@link Application.Config <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Config</em>'.
	 * @see Application.Config
	 * @generated
	 */
	EClass getConfig();

	/**
	 * Returns the meta object for the attribute '{@link Application.Config#getPackageName <em>Package Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Name</em>'.
	 * @see Application.Config#getPackageName()
	 * @see #getConfig()
	 * @generated
	 */
	EAttribute getConfig_PackageName();

	/**
	 * Returns the meta object for the attribute '{@link Application.Config#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon</em>'.
	 * @see Application.Config#getIcon()
	 * @see #getConfig()
	 * @generated
	 */
	EAttribute getConfig_Icon();

	/**
	 * Returns the meta object for the attribute '{@link Application.Config#getMinSdkVersion <em>Min Sdk Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Sdk Version</em>'.
	 * @see Application.Config#getMinSdkVersion()
	 * @see #getConfig()
	 * @generated
	 */
	EAttribute getConfig_MinSdkVersion();

	/**
	 * Returns the meta object for the attribute '{@link Application.Config#getTargetSdkVersion <em>Target Sdk Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Sdk Version</em>'.
	 * @see Application.Config#getTargetSdkVersion()
	 * @see #getConfig()
	 * @generated
	 */
	EAttribute getConfig_TargetSdkVersion();

	/**
	 * Returns the meta object for the attribute '{@link Application.Config#getVersionCode <em>Version Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version Code</em>'.
	 * @see Application.Config#getVersionCode()
	 * @see #getConfig()
	 * @generated
	 */
	EAttribute getConfig_VersionCode();

	/**
	 * Returns the meta object for the attribute '{@link Application.Config#getVersionName <em>Version Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version Name</em>'.
	 * @see Application.Config#getVersionName()
	 * @see #getConfig()
	 * @generated
	 */
	EAttribute getConfig_VersionName();

	/**
	 * Returns the meta object for the attribute '{@link Application.Config#getBuildToolsVersion <em>Build Tools Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Build Tools Version</em>'.
	 * @see Application.Config#getBuildToolsVersion()
	 * @see #getConfig()
	 * @generated
	 */
	EAttribute getConfig_BuildToolsVersion();

	/**
	 * Returns the meta object for the attribute '{@link Application.Config#getCompileSdkVersion <em>Compile Sdk Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compile Sdk Version</em>'.
	 * @see Application.Config#getCompileSdkVersion()
	 * @see #getConfig()
	 * @generated
	 */
	EAttribute getConfig_CompileSdkVersion();

	/**
	 * Returns the meta object for the attribute '{@link Application.Config#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Application.Config#getName()
	 * @see #getConfig()
	 * @generated
	 */
	EAttribute getConfig_Name();

	/**
	 * Returns the meta object for class '{@link Application.Theme <em>Theme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Theme</em>'.
	 * @see Application.Theme
	 * @generated
	 */
	EClass getTheme();

	/**
	 * Returns the meta object for the attribute '{@link Application.Theme#getColorPrimaryDark <em>Color Primary Dark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color Primary Dark</em>'.
	 * @see Application.Theme#getColorPrimaryDark()
	 * @see #getTheme()
	 * @generated
	 */
	EAttribute getTheme_ColorPrimaryDark();

	/**
	 * Returns the meta object for the attribute '{@link Application.Theme#getColorPrimary <em>Color Primary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color Primary</em>'.
	 * @see Application.Theme#getColorPrimary()
	 * @see #getTheme()
	 * @generated
	 */
	EAttribute getTheme_ColorPrimary();

	/**
	 * Returns the meta object for the attribute '{@link Application.Theme#getColorAccent <em>Color Accent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color Accent</em>'.
	 * @see Application.Theme#getColorAccent()
	 * @see #getTheme()
	 * @generated
	 */
	EAttribute getTheme_ColorAccent();

	/**
	 * Returns the meta object for the attribute '{@link Application.Theme#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Application.Theme#getName()
	 * @see #getTheme()
	 * @generated
	 */
	EAttribute getTheme_Name();

	/**
	 * Returns the meta object for class '{@link Application.MainActivity <em>Main Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Main Activity</em>'.
	 * @see Application.MainActivity
	 * @generated
	 */
	EClass getMainActivity();

	/**
	 * Returns the meta object for the containment reference '{@link Application.MainActivity#getHasNav <em>Has Nav</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Nav</em>'.
	 * @see Application.MainActivity#getHasNav()
	 * @see #getMainActivity()
	 * @generated
	 */
	EReference getMainActivity_HasNav();

	/**
	 * Returns the meta object for the containment reference '{@link Application.MainActivity#getHasBar <em>Has Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Bar</em>'.
	 * @see Application.MainActivity#getHasBar()
	 * @see #getMainActivity()
	 * @generated
	 */
	EReference getMainActivity_HasBar();

	/**
	 * Returns the meta object for the attribute '{@link Application.MainActivity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Application.MainActivity#getName()
	 * @see #getMainActivity()
	 * @generated
	 */
	EAttribute getMainActivity_Name();

	/**
	 * Returns the meta object for class '{@link Application.NavigationDrawer <em>Navigation Drawer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Navigation Drawer</em>'.
	 * @see Application.NavigationDrawer
	 * @generated
	 */
	EClass getNavigationDrawer();

	/**
	 * Returns the meta object for the attribute '{@link Application.NavigationDrawer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Application.NavigationDrawer#getName()
	 * @see #getNavigationDrawer()
	 * @generated
	 */
	EAttribute getNavigationDrawer_Name();

	/**
	 * Returns the meta object for the attribute '{@link Application.NavigationDrawer#getHeaderDrawableSrcName <em>Header Drawable Src Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header Drawable Src Name</em>'.
	 * @see Application.NavigationDrawer#getHeaderDrawableSrcName()
	 * @see #getNavigationDrawer()
	 * @generated
	 */
	EAttribute getNavigationDrawer_HeaderDrawableSrcName();

	/**
	 * Returns the meta object for class '{@link Application.TabBar <em>Tab Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tab Bar</em>'.
	 * @see Application.TabBar
	 * @generated
	 */
	EClass getTabBar();

	/**
	 * Returns the meta object for the attribute '{@link Application.TabBar#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Application.TabBar#getName()
	 * @see #getTabBar()
	 * @generated
	 */
	EAttribute getTabBar_Name();

	/**
	 * Returns the meta object for class '{@link Application.Fragment <em>Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fragment</em>'.
	 * @see Application.Fragment
	 * @generated
	 */
	EClass getFragment();

	/**
	 * Returns the meta object for the attribute '{@link Application.Fragment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Application.Fragment#getName()
	 * @see #getFragment()
	 * @generated
	 */
	EAttribute getFragment_Name();

	/**
	 * Returns the meta object for the containment reference '{@link Application.Fragment#getHasApi <em>Has Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Api</em>'.
	 * @see Application.Fragment#getHasApi()
	 * @see #getFragment()
	 * @generated
	 */
	EReference getFragment_HasApi();

	/**
	 * Returns the meta object for class '{@link Application.LoginFragment <em>Login Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Login Fragment</em>'.
	 * @see Application.LoginFragment
	 * @generated
	 */
	EClass getLoginFragment();

	/**
	 * Returns the meta object for the attribute '{@link Application.LoginFragment#isGenerateEmailValidationCode <em>Generate Email Validation Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generate Email Validation Code</em>'.
	 * @see Application.LoginFragment#isGenerateEmailValidationCode()
	 * @see #getLoginFragment()
	 * @generated
	 */
	EAttribute getLoginFragment_GenerateEmailValidationCode();

	/**
	 * Returns the meta object for the attribute '{@link Application.LoginFragment#isGeneratePhoneNumberValidationCode <em>Generate Phone Number Validation Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generate Phone Number Validation Code</em>'.
	 * @see Application.LoginFragment#isGeneratePhoneNumberValidationCode()
	 * @see #getLoginFragment()
	 * @generated
	 */
	EAttribute getLoginFragment_GeneratePhoneNumberValidationCode();

	/**
	 * Returns the meta object for class '{@link Application.CategoryFragment <em>Category Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category Fragment</em>'.
	 * @see Application.CategoryFragment
	 * @generated
	 */
	EClass getCategoryFragment();

	/**
	 * Returns the meta object for the containment reference '{@link Application.CategoryFragment#getHasCardView <em>Has Card View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Card View</em>'.
	 * @see Application.CategoryFragment#getHasCardView()
	 * @see #getCategoryFragment()
	 * @generated
	 */
	EReference getCategoryFragment_HasCardView();

	/**
	 * Returns the meta object for the attribute '{@link Application.CategoryFragment#getColNumber <em>Col Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Col Number</em>'.
	 * @see Application.CategoryFragment#getColNumber()
	 * @see #getCategoryFragment()
	 * @generated
	 */
	EAttribute getCategoryFragment_ColNumber();

	/**
	 * Returns the meta object for class '{@link Application.LocationsFragment <em>Locations Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Locations Fragment</em>'.
	 * @see Application.LocationsFragment
	 * @generated
	 */
	EClass getLocationsFragment();

	/**
	 * Returns the meta object for the containment reference '{@link Application.LocationsFragment#getHasSubCatTabBar <em>Has Sub Cat Tab Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Sub Cat Tab Bar</em>'.
	 * @see Application.LocationsFragment#getHasSubCatTabBar()
	 * @see #getLocationsFragment()
	 * @generated
	 */
	EReference getLocationsFragment_HasSubCatTabBar();

	/**
	 * Returns the meta object for the containment reference '{@link Application.LocationsFragment#getHasMap <em>Has Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Map</em>'.
	 * @see Application.LocationsFragment#getHasMap()
	 * @see #getLocationsFragment()
	 * @generated
	 */
	EReference getLocationsFragment_HasMap();

	/**
	 * Returns the meta object for the containment reference list '{@link Application.LocationsFragment#getHasRecView <em>Has Rec View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Rec View</em>'.
	 * @see Application.LocationsFragment#getHasRecView()
	 * @see #getLocationsFragment()
	 * @generated
	 */
	EReference getLocationsFragment_HasRecView();

	/**
	 * Returns the meta object for class '{@link Application.LocationDetailsFragment <em>Location Details Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location Details Fragment</em>'.
	 * @see Application.LocationDetailsFragment
	 * @generated
	 */
	EClass getLocationDetailsFragment();

	/**
	 * Returns the meta object for the attribute '{@link Application.LocationDetailsFragment#isShowRatingOption <em>Show Rating Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Rating Option</em>'.
	 * @see Application.LocationDetailsFragment#isShowRatingOption()
	 * @see #getLocationDetailsFragment()
	 * @generated
	 */
	EAttribute getLocationDetailsFragment_ShowRatingOption();

	/**
	 * Returns the meta object for the attribute '{@link Application.LocationDetailsFragment#isShowCommentOption <em>Show Comment Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Comment Option</em>'.
	 * @see Application.LocationDetailsFragment#isShowCommentOption()
	 * @see #getLocationDetailsFragment()
	 * @generated
	 */
	EAttribute getLocationDetailsFragment_ShowCommentOption();

	/**
	 * Returns the meta object for the attribute '{@link Application.LocationDetailsFragment#isShowCallOption <em>Show Call Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Call Option</em>'.
	 * @see Application.LocationDetailsFragment#isShowCallOption()
	 * @see #getLocationDetailsFragment()
	 * @generated
	 */
	EAttribute getLocationDetailsFragment_ShowCallOption();

	/**
	 * Returns the meta object for the attribute '{@link Application.LocationDetailsFragment#isShowNavigationOption <em>Show Navigation Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Navigation Option</em>'.
	 * @see Application.LocationDetailsFragment#isShowNavigationOption()
	 * @see #getLocationDetailsFragment()
	 * @generated
	 */
	EAttribute getLocationDetailsFragment_ShowNavigationOption();

	/**
	 * Returns the meta object for the attribute '{@link Application.LocationDetailsFragment#isShowAddCommentOption <em>Show Add Comment Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Add Comment Option</em>'.
	 * @see Application.LocationDetailsFragment#isShowAddCommentOption()
	 * @see #getLocationDetailsFragment()
	 * @generated
	 */
	EAttribute getLocationDetailsFragment_ShowAddCommentOption();

	/**
	 * Returns the meta object for the attribute '{@link Application.LocationDetailsFragment#isShowAddToBookmarkOption <em>Show Add To Bookmark Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Add To Bookmark Option</em>'.
	 * @see Application.LocationDetailsFragment#isShowAddToBookmarkOption()
	 * @see #getLocationDetailsFragment()
	 * @generated
	 */
	EAttribute getLocationDetailsFragment_ShowAddToBookmarkOption();

	/**
	 * Returns the meta object for class '{@link Application.Api <em>Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Api</em>'.
	 * @see Application.Api
	 * @generated
	 */
	EClass getApi();

	/**
	 * Returns the meta object for the attribute '{@link Application.Api#getBaseAddress <em>Base Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Address</em>'.
	 * @see Application.Api#getBaseAddress()
	 * @see #getApi()
	 * @generated
	 */
	EAttribute getApi_BaseAddress();

	/**
	 * Returns the meta object for the attribute '{@link Application.Api#getLinkAddress <em>Link Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link Address</em>'.
	 * @see Application.Api#getLinkAddress()
	 * @see #getApi()
	 * @generated
	 */
	EAttribute getApi_LinkAddress();

	/**
	 * Returns the meta object for the containment reference list '{@link Application.Api#getHasResItem <em>Has Res Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Res Item</em>'.
	 * @see Application.Api#getHasResItem()
	 * @see #getApi()
	 * @generated
	 */
	EReference getApi_HasResItem();

	/**
	 * Returns the meta object for the containment reference list '{@link Application.Api#getHasReqItem <em>Has Req Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Req Item</em>'.
	 * @see Application.Api#getHasReqItem()
	 * @see #getApi()
	 * @generated
	 */
	EReference getApi_HasReqItem();

	/**
	 * Returns the meta object for class '{@link Application.ResponseItem <em>Response Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response Item</em>'.
	 * @see Application.ResponseItem
	 * @generated
	 */
	EClass getResponseItem();

	/**
	 * Returns the meta object for the attribute '{@link Application.ResponseItem#getResponseKey <em>Response Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Response Key</em>'.
	 * @see Application.ResponseItem#getResponseKey()
	 * @see #getResponseItem()
	 * @generated
	 */
	EAttribute getResponseItem_ResponseKey();

	/**
	 * Returns the meta object for the attribute '{@link Application.ResponseItem#getResponseType <em>Response Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Response Type</em>'.
	 * @see Application.ResponseItem#getResponseType()
	 * @see #getResponseItem()
	 * @generated
	 */
	EAttribute getResponseItem_ResponseType();

	/**
	 * Returns the meta object for the attribute '{@link Application.ResponseItem#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see Application.ResponseItem#getDefaultValue()
	 * @see #getResponseItem()
	 * @generated
	 */
	EAttribute getResponseItem_DefaultValue();

	/**
	 * Returns the meta object for class '{@link Application.RequestItem <em>Request Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request Item</em>'.
	 * @see Application.RequestItem
	 * @generated
	 */
	EClass getRequestItem();

	/**
	 * Returns the meta object for the attribute '{@link Application.RequestItem#getRequestKey <em>Request Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Request Key</em>'.
	 * @see Application.RequestItem#getRequestKey()
	 * @see #getRequestItem()
	 * @generated
	 */
	EAttribute getRequestItem_RequestKey();

	/**
	 * Returns the meta object for the attribute '{@link Application.RequestItem#getRequestType <em>Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Request Type</em>'.
	 * @see Application.RequestItem#getRequestType()
	 * @see #getRequestItem()
	 * @generated
	 */
	EAttribute getRequestItem_RequestType();

	/**
	 * Returns the meta object for class '{@link Application.Map <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map</em>'.
	 * @see Application.Map
	 * @generated
	 */
	EClass getMap();

	/**
	 * Returns the meta object for the attribute '{@link Application.Map#getApiKey <em>Api Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Api Key</em>'.
	 * @see Application.Map#getApiKey()
	 * @see #getMap()
	 * @generated
	 */
	EAttribute getMap_ApiKey();

	/**
	 * Returns the meta object for the attribute '{@link Application.Map#getMapType <em>Map Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Map Type</em>'.
	 * @see Application.Map#getMapType()
	 * @see #getMap()
	 * @generated
	 */
	EAttribute getMap_MapType();

	/**
	 * Returns the meta object for the attribute '{@link Application.Map#isBindCardsToPins <em>Bind Cards To Pins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bind Cards To Pins</em>'.
	 * @see Application.Map#isBindCardsToPins()
	 * @see #getMap()
	 * @generated
	 */
	EAttribute getMap_BindCardsToPins();

	/**
	 * Returns the meta object for the attribute '{@link Application.Map#getZoomLevel <em>Zoom Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zoom Level</em>'.
	 * @see Application.Map#getZoomLevel()
	 * @see #getMap()
	 * @generated
	 */
	EAttribute getMap_ZoomLevel();

	/**
	 * Returns the meta object for the attribute '{@link Application.Map#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Application.Map#getName()
	 * @see #getMap()
	 * @generated
	 */
	EAttribute getMap_Name();

	/**
	 * Returns the meta object for class '{@link Application.LocationsRecyclerView <em>Locations Recycler View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Locations Recycler View</em>'.
	 * @see Application.LocationsRecyclerView
	 * @generated
	 */
	EClass getLocationsRecyclerView();

	/**
	 * Returns the meta object for the containment reference '{@link Application.LocationsRecyclerView#getHasCV <em>Has CV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has CV</em>'.
	 * @see Application.LocationsRecyclerView#getHasCV()
	 * @see #getLocationsRecyclerView()
	 * @generated
	 */
	EReference getLocationsRecyclerView_HasCV();

	/**
	 * Returns the meta object for the attribute '{@link Application.LocationsRecyclerView#isIsVertical <em>Is Vertical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Vertical</em>'.
	 * @see Application.LocationsRecyclerView#isIsVertical()
	 * @see #getLocationsRecyclerView()
	 * @generated
	 */
	EAttribute getLocationsRecyclerView_IsVertical();

	/**
	 * Returns the meta object for the attribute '{@link Application.LocationsRecyclerView#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Application.LocationsRecyclerView#getName()
	 * @see #getLocationsRecyclerView()
	 * @generated
	 */
	EAttribute getLocationsRecyclerView_Name();

	/**
	 * Returns the meta object for class '{@link Application.CardView <em>Card View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Card View</em>'.
	 * @see Application.CardView
	 * @generated
	 */
	EClass getCardView();

	/**
	 * Returns the meta object for the attribute '{@link Application.CardView#getLayoutFileName <em>Layout File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layout File Name</em>'.
	 * @see Application.CardView#getLayoutFileName()
	 * @see #getCardView()
	 * @generated
	 */
	EAttribute getCardView_LayoutFileName();

	/**
	 * Returns the meta object for the containment reference list '{@link Application.CardView#getHasCardItem <em>Has Card Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Card Item</em>'.
	 * @see Application.CardView#getHasCardItem()
	 * @see #getCardView()
	 * @generated
	 */
	EReference getCardView_HasCardItem();

	/**
	 * Returns the meta object for the reference '{@link Application.CardView#getLinkTo <em>Link To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Link To</em>'.
	 * @see Application.CardView#getLinkTo()
	 * @see #getCardView()
	 * @generated
	 */
	EReference getCardView_LinkTo();

	/**
	 * Returns the meta object for class '{@link Application.CardItems <em>Card Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Card Items</em>'.
	 * @see Application.CardItems
	 * @generated
	 */
	EClass getCardItems();

	/**
	 * Returns the meta object for the attribute '{@link Application.CardItems#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see Application.CardItems#getType()
	 * @see #getCardItems()
	 * @generated
	 */
	EAttribute getCardItems_Type();

	/**
	 * Returns the meta object for the attribute '{@link Application.CardItems#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Application.CardItems#getId()
	 * @see #getCardItems()
	 * @generated
	 */
	EAttribute getCardItems_Id();

	/**
	 * Returns the meta object for the reference '{@link Application.CardItems#getConnectTo <em>Connect To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connect To</em>'.
	 * @see Application.CardItems#getConnectTo()
	 * @see #getCardItems()
	 * @generated
	 */
	EReference getCardItems_ConnectTo();

	/**
	 * Returns the meta object for class '{@link Application.SubCategoryTabbar <em>Sub Category Tabbar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Category Tabbar</em>'.
	 * @see Application.SubCategoryTabbar
	 * @generated
	 */
	EClass getSubCategoryTabbar();

	/**
	 * Returns the meta object for the attribute '{@link Application.SubCategoryTabbar#getTabTextColor <em>Tab Text Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tab Text Color</em>'.
	 * @see Application.SubCategoryTabbar#getTabTextColor()
	 * @see #getSubCategoryTabbar()
	 * @generated
	 */
	EAttribute getSubCategoryTabbar_TabTextColor();

	/**
	 * Returns the meta object for the attribute '{@link Application.SubCategoryTabbar#getTabIndicatorColor <em>Tab Indicator Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tab Indicator Color</em>'.
	 * @see Application.SubCategoryTabbar#getTabIndicatorColor()
	 * @see #getSubCategoryTabbar()
	 * @generated
	 */
	EAttribute getSubCategoryTabbar_TabIndicatorColor();

	/**
	 * Returns the meta object for the attribute '{@link Application.SubCategoryTabbar#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Application.SubCategoryTabbar#getName()
	 * @see #getSubCategoryTabbar()
	 * @generated
	 */
	EAttribute getSubCategoryTabbar_Name();

	/**
	 * Returns the meta object for the containment reference '{@link Application.SubCategoryTabbar#getHasAPi <em>Has APi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has APi</em>'.
	 * @see Application.SubCategoryTabbar#getHasAPi()
	 * @see #getSubCategoryTabbar()
	 * @generated
	 */
	EReference getSubCategoryTabbar_HasAPi();

	/**
	 * Returns the meta object for the containment reference '{@link Application.SubCategoryTabbar#getHasTabs <em>Has Tabs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Tabs</em>'.
	 * @see Application.SubCategoryTabbar#getHasTabs()
	 * @see #getSubCategoryTabbar()
	 * @generated
	 */
	EReference getSubCategoryTabbar_HasTabs();

	/**
	 * Returns the meta object for the attribute '{@link Application.SubCategoryTabbar#getTabSelectedTextColor <em>Tab Selected Text Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tab Selected Text Color</em>'.
	 * @see Application.SubCategoryTabbar#getTabSelectedTextColor()
	 * @see #getSubCategoryTabbar()
	 * @generated
	 */
	EAttribute getSubCategoryTabbar_TabSelectedTextColor();

	/**
	 * Returns the meta object for class '{@link Application.Tab <em>Tab</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tab</em>'.
	 * @see Application.Tab
	 * @generated
	 */
	EClass getTab();

	/**
	 * Returns the meta object for the attribute '{@link Application.Tab#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Application.Tab#getName()
	 * @see #getTab()
	 * @generated
	 */
	EAttribute getTab_Name();

	/**
	 * Returns the meta object for the reference '{@link Application.Tab#getGetItemIdFrom <em>Get Item Id From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Get Item Id From</em>'.
	 * @see Application.Tab#getGetItemIdFrom()
	 * @see #getTab()
	 * @generated
	 */
	EReference getTab_GetItemIdFrom();

	/**
	 * Returns the meta object for the reference '{@link Application.Tab#getGetItemNameFrom <em>Get Item Name From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Get Item Name From</em>'.
	 * @see Application.Tab#getGetItemNameFrom()
	 * @see #getTab()
	 * @generated
	 */
	EReference getTab_GetItemNameFrom();

	/**
	 * Returns the meta object for class '{@link Application.MAtoFrag <em>MAto Frag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MAto Frag</em>'.
	 * @see Application.MAtoFrag
	 * @generated
	 */
	EClass getMAtoFrag();

	/**
	 * Returns the meta object for the reference '{@link Application.MAtoFrag#getMtofTarget <em>Mtof Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mtof Target</em>'.
	 * @see Application.MAtoFrag#getMtofTarget()
	 * @see #getMAtoFrag()
	 * @generated
	 */
	EReference getMAtoFrag_MtofTarget();

	/**
	 * Returns the meta object for the reference '{@link Application.MAtoFrag#getMtofSource <em>Mtof Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mtof Source</em>'.
	 * @see Application.MAtoFrag#getMtofSource()
	 * @see #getMAtoFrag()
	 * @generated
	 */
	EReference getMAtoFrag_MtofSource();

	/**
	 * Returns the meta object for the attribute '{@link Application.MAtoFrag#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Application.MAtoFrag#getName()
	 * @see #getMAtoFrag()
	 * @generated
	 */
	EAttribute getMAtoFrag_Name();

	/**
	 * Returns the meta object for class '{@link Application.TBtoFrag <em>TBto Frag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TBto Frag</em>'.
	 * @see Application.TBtoFrag
	 * @generated
	 */
	EClass getTBtoFrag();

	/**
	 * Returns the meta object for the reference '{@link Application.TBtoFrag#getTbtofSource <em>Tbtof Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tbtof Source</em>'.
	 * @see Application.TBtoFrag#getTbtofSource()
	 * @see #getTBtoFrag()
	 * @generated
	 */
	EReference getTBtoFrag_TbtofSource();

	/**
	 * Returns the meta object for the reference '{@link Application.TBtoFrag#getTbtofTarget <em>Tbtof Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tbtof Target</em>'.
	 * @see Application.TBtoFrag#getTbtofTarget()
	 * @see #getTBtoFrag()
	 * @generated
	 */
	EReference getTBtoFrag_TbtofTarget();

	/**
	 * Returns the meta object for the attribute '{@link Application.TBtoFrag#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Application.TBtoFrag#getName()
	 * @see #getTBtoFrag()
	 * @generated
	 */
	EAttribute getTBtoFrag_Name();

	/**
	 * Returns the meta object for class '{@link Application.NDtoFrag <em>NDto Frag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NDto Frag</em>'.
	 * @see Application.NDtoFrag
	 * @generated
	 */
	EClass getNDtoFrag();

	/**
	 * Returns the meta object for the reference '{@link Application.NDtoFrag#getNdtofTarget <em>Ndtof Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ndtof Target</em>'.
	 * @see Application.NDtoFrag#getNdtofTarget()
	 * @see #getNDtoFrag()
	 * @generated
	 */
	EReference getNDtoFrag_NdtofTarget();

	/**
	 * Returns the meta object for the reference '{@link Application.NDtoFrag#getNdtofSource <em>Ndtof Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ndtof Source</em>'.
	 * @see Application.NDtoFrag#getNdtofSource()
	 * @see #getNDtoFrag()
	 * @generated
	 */
	EReference getNDtoFrag_NdtofSource();

	/**
	 * Returns the meta object for the attribute '{@link Application.NDtoFrag#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Application.NDtoFrag#getName()
	 * @see #getNDtoFrag()
	 * @generated
	 */
	EAttribute getNDtoFrag_Name();

	/**
	 * Returns the meta object for enum '{@link Application.MapType <em>Map Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Map Type</em>'.
	 * @see Application.MapType
	 * @generated
	 */
	EEnum getMapType();

	/**
	 * Returns the meta object for enum '{@link Application.cardItemTypes <em>card Item Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>card Item Types</em>'.
	 * @see Application.cardItemTypes
	 * @generated
	 */
	EEnum getcardItemTypes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ApplicationFactory getApplicationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Application.impl.APPImpl <em>APP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Application.impl.APPImpl
		 * @see Application.impl.ApplicationPackageImpl#getAPP()
		 * @generated
		 */
		EClass APP = eINSTANCE.getAPP();

		/**
		 * The meta object literal for the '<em><b>Has Conf</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP__HAS_CONF = eINSTANCE.getAPP_HasConf();

		/**
		 * The meta object literal for the '<em><b>Has Main Activity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP__HAS_MAIN_ACTIVITY = eINSTANCE.getAPP_HasMainActivity();

		/**
		 * The meta object literal for the '<em><b>App Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP__APP_NAME = eINSTANCE.getAPP_AppName();

		/**
		 * The meta object literal for the '<em><b>Has Theme</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP__HAS_THEME = eINSTANCE.getAPP_HasTheme();

		/**
		 * The meta object literal for the '<em><b>Has Frag</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP__HAS_FRAG = eINSTANCE.getAPP_HasFrag();

		/**
		 * The meta object literal for the '<em><b>MAhas Fragment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP__MAHAS_FRAGMENT = eINSTANCE.getAPP_MAhasFragment();

		/**
		 * The meta object literal for the '<em><b>TBhas Fragment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP__TBHAS_FRAGMENT = eINSTANCE.getAPP_TBhasFragment();

		/**
		 * The meta object literal for the '<em><b>NDhas Fragment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP__NDHAS_FRAGMENT = eINSTANCE.getAPP_NDhasFragment();

		/**
		 * The meta object literal for the '{@link Application.impl.ConfigImpl <em>Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Application.impl.ConfigImpl
		 * @see Application.impl.ApplicationPackageImpl#getConfig()
		 * @generated
		 */
		EClass CONFIG = eINSTANCE.getConfig();

		/**
		 * The meta object literal for the '<em><b>Package Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG__PACKAGE_NAME = eINSTANCE.getConfig_PackageName();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG__ICON = eINSTANCE.getConfig_Icon();

		/**
		 * The meta object literal for the '<em><b>Min Sdk Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG__MIN_SDK_VERSION = eINSTANCE.getConfig_MinSdkVersion();

		/**
		 * The meta object literal for the '<em><b>Target Sdk Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG__TARGET_SDK_VERSION = eINSTANCE.getConfig_TargetSdkVersion();

		/**
		 * The meta object literal for the '<em><b>Version Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG__VERSION_CODE = eINSTANCE.getConfig_VersionCode();

		/**
		 * The meta object literal for the '<em><b>Version Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG__VERSION_NAME = eINSTANCE.getConfig_VersionName();

		/**
		 * The meta object literal for the '<em><b>Build Tools Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG__BUILD_TOOLS_VERSION = eINSTANCE.getConfig_BuildToolsVersion();

		/**
		 * The meta object literal for the '<em><b>Compile Sdk Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG__COMPILE_SDK_VERSION = eINSTANCE.getConfig_CompileSdkVersion();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG__NAME = eINSTANCE.getConfig_Name();

		/**
		 * The meta object literal for the '{@link Application.impl.ThemeImpl <em>Theme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Application.impl.ThemeImpl
		 * @see Application.impl.ApplicationPackageImpl#getTheme()
		 * @generated
		 */
		EClass THEME = eINSTANCE.getTheme();

		/**
		 * The meta object literal for the '<em><b>Color Primary Dark</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THEME__COLOR_PRIMARY_DARK = eINSTANCE.getTheme_ColorPrimaryDark();

		/**
		 * The meta object literal for the '<em><b>Color Primary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THEME__COLOR_PRIMARY = eINSTANCE.getTheme_ColorPrimary();

		/**
		 * The meta object literal for the '<em><b>Color Accent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THEME__COLOR_ACCENT = eINSTANCE.getTheme_ColorAccent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THEME__NAME = eINSTANCE.getTheme_Name();

		/**
		 * The meta object literal for the '{@link Application.impl.MainActivityImpl <em>Main Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Application.impl.MainActivityImpl
		 * @see Application.impl.ApplicationPackageImpl#getMainActivity()
		 * @generated
		 */
		EClass MAIN_ACTIVITY = eINSTANCE.getMainActivity();

		/**
		 * The meta object literal for the '<em><b>Has Nav</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN_ACTIVITY__HAS_NAV = eINSTANCE.getMainActivity_HasNav();

		/**
		 * The meta object literal for the '<em><b>Has Bar</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN_ACTIVITY__HAS_BAR = eINSTANCE.getMainActivity_HasBar();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAIN_ACTIVITY__NAME = eINSTANCE.getMainActivity_Name();

		/**
		 * The meta object literal for the '{@link Application.impl.NavigationDrawerImpl <em>Navigation Drawer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Application.impl.NavigationDrawerImpl
		 * @see Application.impl.ApplicationPackageImpl#getNavigationDrawer()
		 * @generated
		 */
		EClass NAVIGATION_DRAWER = eINSTANCE.getNavigationDrawer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAVIGATION_DRAWER__NAME = eINSTANCE.getNavigationDrawer_Name();

		/**
		 * The meta object literal for the '<em><b>Header Drawable Src Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAVIGATION_DRAWER__HEADER_DRAWABLE_SRC_NAME = eINSTANCE.getNavigationDrawer_HeaderDrawableSrcName();

		/**
		 * The meta object literal for the '{@link Application.impl.TabBarImpl <em>Tab Bar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Application.impl.TabBarImpl
		 * @see Application.impl.ApplicationPackageImpl#getTabBar()
		 * @generated
		 */
		EClass TAB_BAR = eINSTANCE.getTabBar();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAB_BAR__NAME = eINSTANCE.getTabBar_Name();

		/**
		 * The meta object literal for the '{@link Application.impl.FragmentImpl <em>Fragment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Application.impl.FragmentImpl
		 * @see Application.impl.ApplicationPackageImpl#getFragment()
		 * @generated
		 */
		EClass FRAGMENT = eINSTANCE.getFragment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRAGMENT__NAME = eINSTANCE.getFragment_Name();

		/**
		 * The meta object literal for the '<em><b>Has Api</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRAGMENT__HAS_API = eINSTANCE.getFragment_HasApi();

		/**
		 * The meta object literal for the '{@link Application.impl.LoginFragmentImpl <em>Login Fragment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Application.impl.LoginFragmentImpl
		 * @see Application.impl.ApplicationPackageImpl#getLoginFragment()
		 * @generated
		 */
		EClass LOGIN_FRAGMENT = eINSTANCE.getLoginFragment();

		/**
		 * The meta object literal for the '<em><b>Generate Email Validation Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGIN_FRAGMENT__GENERATE_EMAIL_VALIDATION_CODE = eINSTANCE.getLoginFragment_GenerateEmailValidationCode();

		/**
		 * The meta object literal for the '<em><b>Generate Phone Number Validation Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGIN_FRAGMENT__GENERATE_PHONE_NUMBER_VALIDATION_CODE = eINSTANCE.getLoginFragment_GeneratePhoneNumberValidationCode();

		/**
		 * The meta object literal for the '{@link Application.impl.CategoryFragmentImpl <em>Category Fragment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Application.impl.CategoryFragmentImpl
		 * @see Application.impl.ApplicationPackageImpl#getCategoryFragment()
		 * @generated
		 */
		EClass CATEGORY_FRAGMENT = eINSTANCE.getCategoryFragment();

		/**
		 * The meta object literal for the '<em><b>Has Card View</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY_FRAGMENT__HAS_CARD_VIEW = eINSTANCE.getCategoryFragment_HasCardView();

		/**
		 * The meta object literal for the '<em><b>Col Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY_FRAGMENT__COL_NUMBER = eINSTANCE.getCategoryFragment_ColNumber();

		/**
		 * The meta object literal for the '{@link Application.impl.LocationsFragmentImpl <em>Locations Fragment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Application.impl.LocationsFragmentImpl
		 * @see Application.impl.ApplicationPackageImpl#getLocationsFragment()
		 * @generated
		 */
		EClass LOCATIONS_FRAGMENT = eINSTANCE.getLocationsFragment();

		/**
		 * The meta object literal for the '<em><b>Has Sub Cat Tab Bar</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATIONS_FRAGMENT__HAS_SUB_CAT_TAB_BAR = eINSTANCE.getLocationsFragment_HasSubCatTabBar();

		/**
		 * The meta object literal for the '<em><b>Has Map</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATIONS_FRAGMENT__HAS_MAP = eINSTANCE.getLocationsFragment_HasMap();

		/**
		 * The meta object literal for the '<em><b>Has Rec View</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATIONS_FRAGMENT__HAS_REC_VIEW = eINSTANCE.getLocationsFragment_HasRecView();

		/**
		 * The meta object literal for the '{@link Application.impl.LocationDetailsFragmentImpl <em>Location Details Fragment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Application.impl.LocationDetailsFragmentImpl
		 * @see Application.impl.ApplicationPackageImpl#getLocationDetailsFragment()
		 * @generated
		 */
		EClass LOCATION_DETAILS_FRAGMENT = eINSTANCE.getLocationDetailsFragment();

		/**
		 * The meta object literal for the '<em><b>Show Rating Option</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_DETAILS_FRAGMENT__SHOW_RATING_OPTION = eINSTANCE.getLocationDetailsFragment_ShowRatingOption();

		/**
		 * The meta object literal for the '<em><b>Show Comment Option</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_DETAILS_FRAGMENT__SHOW_COMMENT_OPTION = eINSTANCE.getLocationDetailsFragment_ShowCommentOption();

		/**
		 * The meta object literal for the '<em><b>Show Call Option</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_DETAILS_FRAGMENT__SHOW_CALL_OPTION = eINSTANCE.getLocationDetailsFragment_ShowCallOption();

		/**
		 * The meta object literal for the '<em><b>Show Navigation Option</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_DETAILS_FRAGMENT__SHOW_NAVIGATION_OPTION = eINSTANCE.getLocationDetailsFragment_ShowNavigationOption();

		/**
		 * The meta object literal for the '<em><b>Show Add Comment Option</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_DETAILS_FRAGMENT__SHOW_ADD_COMMENT_OPTION = eINSTANCE.getLocationDetailsFragment_ShowAddCommentOption();

		/**
		 * The meta object literal for the '<em><b>Show Add To Bookmark Option</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_DETAILS_FRAGMENT__SHOW_ADD_TO_BOOKMARK_OPTION = eINSTANCE.getLocationDetailsFragment_ShowAddToBookmarkOption();

		/**
		 * The meta object literal for the '{@link Application.impl.ApiImpl <em>Api</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Application.impl.ApiImpl
		 * @see Application.impl.ApplicationPackageImpl#getApi()
		 * @generated
		 */
		EClass API = eINSTANCE.getApi();

		/**
		 * The meta object literal for the '<em><b>Base Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API__BASE_ADDRESS = eINSTANCE.getApi_BaseAddress();

		/**
		 * The meta object literal for the '<em><b>Link Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API__LINK_ADDRESS = eINSTANCE.getApi_LinkAddress();

		/**
		 * The meta object literal for the '<em><b>Has Res Item</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference API__HAS_RES_ITEM = eINSTANCE.getApi_HasResItem();

		/**
		 * The meta object literal for the '<em><b>Has Req Item</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference API__HAS_REQ_ITEM = eINSTANCE.getApi_HasReqItem();

		/**
		 * The meta object literal for the '{@link Application.impl.ResponseItemImpl <em>Response Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Application.impl.ResponseItemImpl
		 * @see Application.impl.ApplicationPackageImpl#getResponseItem()
		 * @generated
		 */
		EClass RESPONSE_ITEM = eINSTANCE.getResponseItem();

		/**
		 * The meta object literal for the '<em><b>Response Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_ITEM__RESPONSE_KEY = eINSTANCE.getResponseItem_ResponseKey();

		/**
		 * The meta object literal for the '<em><b>Response Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_ITEM__RESPONSE_TYPE = eINSTANCE.getResponseItem_ResponseType();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_ITEM__DEFAULT_VALUE = eINSTANCE.getResponseItem_DefaultValue();

		/**
		 * The meta object literal for the '{@link Application.impl.RequestItemImpl <em>Request Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Application.impl.RequestItemImpl
		 * @see Application.impl.ApplicationPackageImpl#getRequestItem()
		 * @generated
		 */
		EClass REQUEST_ITEM = eINSTANCE.getRequestItem();

		/**
		 * The meta object literal for the '<em><b>Request Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST_ITEM__REQUEST_KEY = eINSTANCE.getRequestItem_RequestKey();

		/**
		 * The meta object literal for the '<em><b>Request Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST_ITEM__REQUEST_TYPE = eINSTANCE.getRequestItem_RequestType();

		/**
		 * The meta object literal for the '{@link Application.impl.MapImpl <em>Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Application.impl.MapImpl
		 * @see Application.impl.ApplicationPackageImpl#getMap()
		 * @generated
		 */
		EClass MAP = eINSTANCE.getMap();

		/**
		 * The meta object literal for the '<em><b>Api Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP__API_KEY = eINSTANCE.getMap_ApiKey();

		/**
		 * The meta object literal for the '<em><b>Map Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP__MAP_TYPE = eINSTANCE.getMap_MapType();

		/**
		 * The meta object literal for the '<em><b>Bind Cards To Pins</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP__BIND_CARDS_TO_PINS = eINSTANCE.getMap_BindCardsToPins();

		/**
		 * The meta object literal for the '<em><b>Zoom Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP__ZOOM_LEVEL = eINSTANCE.getMap_ZoomLevel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP__NAME = eINSTANCE.getMap_Name();

		/**
		 * The meta object literal for the '{@link Application.impl.LocationsRecyclerViewImpl <em>Locations Recycler View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Application.impl.LocationsRecyclerViewImpl
		 * @see Application.impl.ApplicationPackageImpl#getLocationsRecyclerView()
		 * @generated
		 */
		EClass LOCATIONS_RECYCLER_VIEW = eINSTANCE.getLocationsRecyclerView();

		/**
		 * The meta object literal for the '<em><b>Has CV</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATIONS_RECYCLER_VIEW__HAS_CV = eINSTANCE.getLocationsRecyclerView_HasCV();

		/**
		 * The meta object literal for the '<em><b>Is Vertical</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATIONS_RECYCLER_VIEW__IS_VERTICAL = eINSTANCE.getLocationsRecyclerView_IsVertical();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATIONS_RECYCLER_VIEW__NAME = eINSTANCE.getLocationsRecyclerView_Name();

		/**
		 * The meta object literal for the '{@link Application.impl.CardViewImpl <em>Card View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Application.impl.CardViewImpl
		 * @see Application.impl.ApplicationPackageImpl#getCardView()
		 * @generated
		 */
		EClass CARD_VIEW = eINSTANCE.getCardView();

		/**
		 * The meta object literal for the '<em><b>Layout File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_VIEW__LAYOUT_FILE_NAME = eINSTANCE.getCardView_LayoutFileName();

		/**
		 * The meta object literal for the '<em><b>Has Card Item</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARD_VIEW__HAS_CARD_ITEM = eINSTANCE.getCardView_HasCardItem();

		/**
		 * The meta object literal for the '<em><b>Link To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARD_VIEW__LINK_TO = eINSTANCE.getCardView_LinkTo();

		/**
		 * The meta object literal for the '{@link Application.impl.CardItemsImpl <em>Card Items</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Application.impl.CardItemsImpl
		 * @see Application.impl.ApplicationPackageImpl#getCardItems()
		 * @generated
		 */
		EClass CARD_ITEMS = eINSTANCE.getCardItems();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_ITEMS__TYPE = eINSTANCE.getCardItems_Type();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_ITEMS__ID = eINSTANCE.getCardItems_Id();

		/**
		 * The meta object literal for the '<em><b>Connect To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARD_ITEMS__CONNECT_TO = eINSTANCE.getCardItems_ConnectTo();

		/**
		 * The meta object literal for the '{@link Application.impl.SubCategoryTabbarImpl <em>Sub Category Tabbar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Application.impl.SubCategoryTabbarImpl
		 * @see Application.impl.ApplicationPackageImpl#getSubCategoryTabbar()
		 * @generated
		 */
		EClass SUB_CATEGORY_TABBAR = eINSTANCE.getSubCategoryTabbar();

		/**
		 * The meta object literal for the '<em><b>Tab Text Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_CATEGORY_TABBAR__TAB_TEXT_COLOR = eINSTANCE.getSubCategoryTabbar_TabTextColor();

		/**
		 * The meta object literal for the '<em><b>Tab Indicator Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_CATEGORY_TABBAR__TAB_INDICATOR_COLOR = eINSTANCE.getSubCategoryTabbar_TabIndicatorColor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_CATEGORY_TABBAR__NAME = eINSTANCE.getSubCategoryTabbar_Name();

		/**
		 * The meta object literal for the '<em><b>Has APi</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_CATEGORY_TABBAR__HAS_API = eINSTANCE.getSubCategoryTabbar_HasAPi();

		/**
		 * The meta object literal for the '<em><b>Has Tabs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_CATEGORY_TABBAR__HAS_TABS = eINSTANCE.getSubCategoryTabbar_HasTabs();

		/**
		 * The meta object literal for the '<em><b>Tab Selected Text Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_CATEGORY_TABBAR__TAB_SELECTED_TEXT_COLOR = eINSTANCE.getSubCategoryTabbar_TabSelectedTextColor();

		/**
		 * The meta object literal for the '{@link Application.impl.TabImpl <em>Tab</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Application.impl.TabImpl
		 * @see Application.impl.ApplicationPackageImpl#getTab()
		 * @generated
		 */
		EClass TAB = eINSTANCE.getTab();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAB__NAME = eINSTANCE.getTab_Name();

		/**
		 * The meta object literal for the '<em><b>Get Item Id From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAB__GET_ITEM_ID_FROM = eINSTANCE.getTab_GetItemIdFrom();

		/**
		 * The meta object literal for the '<em><b>Get Item Name From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAB__GET_ITEM_NAME_FROM = eINSTANCE.getTab_GetItemNameFrom();

		/**
		 * The meta object literal for the '{@link Application.impl.MAtoFragImpl <em>MAto Frag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Application.impl.MAtoFragImpl
		 * @see Application.impl.ApplicationPackageImpl#getMAtoFrag()
		 * @generated
		 */
		EClass MATO_FRAG = eINSTANCE.getMAtoFrag();

		/**
		 * The meta object literal for the '<em><b>Mtof Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATO_FRAG__MTOF_TARGET = eINSTANCE.getMAtoFrag_MtofTarget();

		/**
		 * The meta object literal for the '<em><b>Mtof Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATO_FRAG__MTOF_SOURCE = eINSTANCE.getMAtoFrag_MtofSource();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATO_FRAG__NAME = eINSTANCE.getMAtoFrag_Name();

		/**
		 * The meta object literal for the '{@link Application.impl.TBtoFragImpl <em>TBto Frag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Application.impl.TBtoFragImpl
		 * @see Application.impl.ApplicationPackageImpl#getTBtoFrag()
		 * @generated
		 */
		EClass TBTO_FRAG = eINSTANCE.getTBtoFrag();

		/**
		 * The meta object literal for the '<em><b>Tbtof Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TBTO_FRAG__TBTOF_SOURCE = eINSTANCE.getTBtoFrag_TbtofSource();

		/**
		 * The meta object literal for the '<em><b>Tbtof Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TBTO_FRAG__TBTOF_TARGET = eINSTANCE.getTBtoFrag_TbtofTarget();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TBTO_FRAG__NAME = eINSTANCE.getTBtoFrag_Name();

		/**
		 * The meta object literal for the '{@link Application.impl.NDtoFragImpl <em>NDto Frag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Application.impl.NDtoFragImpl
		 * @see Application.impl.ApplicationPackageImpl#getNDtoFrag()
		 * @generated
		 */
		EClass NDTO_FRAG = eINSTANCE.getNDtoFrag();

		/**
		 * The meta object literal for the '<em><b>Ndtof Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NDTO_FRAG__NDTOF_TARGET = eINSTANCE.getNDtoFrag_NdtofTarget();

		/**
		 * The meta object literal for the '<em><b>Ndtof Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NDTO_FRAG__NDTOF_SOURCE = eINSTANCE.getNDtoFrag_NdtofSource();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NDTO_FRAG__NAME = eINSTANCE.getNDtoFrag_Name();

		/**
		 * The meta object literal for the '{@link Application.MapType <em>Map Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Application.MapType
		 * @see Application.impl.ApplicationPackageImpl#getMapType()
		 * @generated
		 */
		EEnum MAP_TYPE = eINSTANCE.getMapType();

		/**
		 * The meta object literal for the '{@link Application.cardItemTypes <em>card Item Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Application.cardItemTypes
		 * @see Application.impl.ApplicationPackageImpl#getcardItemTypes()
		 * @generated
		 */
		EEnum CARD_ITEM_TYPES = eINSTANCE.getcardItemTypes();

	}

} //ApplicationPackage
