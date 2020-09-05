/**
 */
package Application.impl;

import Application.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApplicationFactoryImpl extends EFactoryImpl implements ApplicationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApplicationFactory init() {
		try {
			ApplicationFactory theApplicationFactory = (ApplicationFactory)EPackage.Registry.INSTANCE.getEFactory(ApplicationPackage.eNS_URI);
			if (theApplicationFactory != null) {
				return theApplicationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApplicationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ApplicationPackage.APP: return createAPP();
			case ApplicationPackage.CONFIG: return createConfig();
			case ApplicationPackage.THEME: return createTheme();
			case ApplicationPackage.MAIN_ACTIVITY: return createMainActivity();
			case ApplicationPackage.NAVIGATION_DRAWER: return createNavigationDrawer();
			case ApplicationPackage.TAB_BAR: return createTabBar();
			case ApplicationPackage.FRAGMENT: return createFragment();
			case ApplicationPackage.LOGIN_FRAGMENT: return createLoginFragment();
			case ApplicationPackage.CATEGORY_FRAGMENT: return createCategoryFragment();
			case ApplicationPackage.LOCATIONS_FRAGMENT: return createLocationsFragment();
			case ApplicationPackage.LOCATION_DETAILS_FRAGMENT: return createLocationDetailsFragment();
			case ApplicationPackage.API: return createApi();
			case ApplicationPackage.RESPONSE_ITEM: return createResponseItem();
			case ApplicationPackage.REQUEST_ITEM: return createRequestItem();
			case ApplicationPackage.MAP: return createMap();
			case ApplicationPackage.LOCATIONS_RECYCLER_VIEW: return createLocationsRecyclerView();
			case ApplicationPackage.CARD_VIEW: return createCardView();
			case ApplicationPackage.CARD_ITEMS: return createCardItems();
			case ApplicationPackage.SUB_CATEGORY_TABBAR: return createSubCategoryTabbar();
			case ApplicationPackage.TAB: return createTab();
			case ApplicationPackage.MATO_FRAG: return createMAtoFrag();
			case ApplicationPackage.TBTO_FRAG: return createTBtoFrag();
			case ApplicationPackage.NDTO_FRAG: return createNDtoFrag();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ApplicationPackage.MAP_TYPE:
				return createMapTypeFromString(eDataType, initialValue);
			case ApplicationPackage.CARD_ITEM_TYPES:
				return createcardItemTypesFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ApplicationPackage.MAP_TYPE:
				return convertMapTypeToString(eDataType, instanceValue);
			case ApplicationPackage.CARD_ITEM_TYPES:
				return convertcardItemTypesToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APP createAPP() {
		APPImpl app = new APPImpl();
		return app;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Config createConfig() {
		ConfigImpl config = new ConfigImpl();
		return config;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Theme createTheme() {
		ThemeImpl theme = new ThemeImpl();
		return theme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainActivity createMainActivity() {
		MainActivityImpl mainActivity = new MainActivityImpl();
		return mainActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavigationDrawer createNavigationDrawer() {
		NavigationDrawerImpl navigationDrawer = new NavigationDrawerImpl();
		return navigationDrawer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TabBar createTabBar() {
		TabBarImpl tabBar = new TabBarImpl();
		return tabBar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fragment createFragment() {
		FragmentImpl fragment = new FragmentImpl();
		return fragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoginFragment createLoginFragment() {
		LoginFragmentImpl loginFragment = new LoginFragmentImpl();
		return loginFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategoryFragment createCategoryFragment() {
		CategoryFragmentImpl categoryFragment = new CategoryFragmentImpl();
		return categoryFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationsFragment createLocationsFragment() {
		LocationsFragmentImpl locationsFragment = new LocationsFragmentImpl();
		return locationsFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationDetailsFragment createLocationDetailsFragment() {
		LocationDetailsFragmentImpl locationDetailsFragment = new LocationDetailsFragmentImpl();
		return locationDetailsFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Api createApi() {
		ApiImpl api = new ApiImpl();
		return api;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseItem createResponseItem() {
		ResponseItemImpl responseItem = new ResponseItemImpl();
		return responseItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestItem createRequestItem() {
		RequestItemImpl requestItem = new RequestItemImpl();
		return requestItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map createMap() {
		MapImpl map = new MapImpl();
		return map;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationsRecyclerView createLocationsRecyclerView() {
		LocationsRecyclerViewImpl locationsRecyclerView = new LocationsRecyclerViewImpl();
		return locationsRecyclerView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardView createCardView() {
		CardViewImpl cardView = new CardViewImpl();
		return cardView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardItems createCardItems() {
		CardItemsImpl cardItems = new CardItemsImpl();
		return cardItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubCategoryTabbar createSubCategoryTabbar() {
		SubCategoryTabbarImpl subCategoryTabbar = new SubCategoryTabbarImpl();
		return subCategoryTabbar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tab createTab() {
		TabImpl tab = new TabImpl();
		return tab;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MAtoFrag createMAtoFrag() {
		MAtoFragImpl mAtoFrag = new MAtoFragImpl();
		return mAtoFrag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TBtoFrag createTBtoFrag() {
		TBtoFragImpl tBtoFrag = new TBtoFragImpl();
		return tBtoFrag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NDtoFrag createNDtoFrag() {
		NDtoFragImpl nDtoFrag = new NDtoFragImpl();
		return nDtoFrag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapType createMapTypeFromString(EDataType eDataType, String initialValue) {
		MapType result = MapType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMapTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public cardItemTypes createcardItemTypesFromString(EDataType eDataType, String initialValue) {
		cardItemTypes result = cardItemTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertcardItemTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationPackage getApplicationPackage() {
		return (ApplicationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApplicationPackage getPackage() {
		return ApplicationPackage.eINSTANCE;
	}

} //ApplicationFactoryImpl
