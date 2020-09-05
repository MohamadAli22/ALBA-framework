/**
 */
package Application.impl;

import Application.Api;
import Application.ApplicationFactory;
import Application.ApplicationPackage;
import Application.CardItems;
import Application.CardView;
import Application.CategoryFragment;
import Application.Config;
import Application.Fragment;
import Application.LocationDetailsFragment;
import Application.LocationsFragment;
import Application.LocationsRecyclerView;
import Application.LoginFragment;
import Application.MAtoFrag;
import Application.MainActivity;
import Application.Map;
import Application.MapType;
import Application.NDtoFrag;
import Application.NavigationDrawer;
import Application.RequestItem;
import Application.ResponseItem;
import Application.SubCategoryTabbar;
import Application.TBtoFrag;
import Application.Tab;
import Application.TabBar;
import Application.Theme;
import Application.cardItemTypes;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApplicationPackageImpl extends EPackageImpl implements ApplicationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass themeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mainActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass navigationDrawerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tabBarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fragmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loginFragmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categoryFragmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationsFragmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationDetailsFragmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responseItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationsRecyclerViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subCategoryTabbarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tabEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mAtoFragEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tBtoFragEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nDtoFragEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mapTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cardItemTypesEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see Application.ApplicationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ApplicationPackageImpl() {
		super(eNS_URI, ApplicationFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ApplicationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ApplicationPackage init() {
		if (isInited) return (ApplicationPackage)EPackage.Registry.INSTANCE.getEPackage(ApplicationPackage.eNS_URI);

		// Obtain or create and register package
		ApplicationPackageImpl theApplicationPackage = (ApplicationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ApplicationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ApplicationPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theApplicationPackage.createPackageContents();

		// Initialize created meta-data
		theApplicationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApplicationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApplicationPackage.eNS_URI, theApplicationPackage);
		return theApplicationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPP() {
		return appEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPP_HasConf() {
		return (EReference)appEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPP_HasMainActivity() {
		return (EReference)appEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAPP_AppName() {
		return (EAttribute)appEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPP_HasTheme() {
		return (EReference)appEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPP_HasFrag() {
		return (EReference)appEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPP_MAhasFragment() {
		return (EReference)appEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPP_TBhasFragment() {
		return (EReference)appEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPP_NDhasFragment() {
		return (EReference)appEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfig() {
		return configEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfig_PackageName() {
		return (EAttribute)configEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfig_Icon() {
		return (EAttribute)configEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfig_MinSdkVersion() {
		return (EAttribute)configEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfig_TargetSdkVersion() {
		return (EAttribute)configEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfig_VersionCode() {
		return (EAttribute)configEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfig_VersionName() {
		return (EAttribute)configEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfig_BuildToolsVersion() {
		return (EAttribute)configEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfig_CompileSdkVersion() {
		return (EAttribute)configEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfig_Name() {
		return (EAttribute)configEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTheme() {
		return themeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTheme_ColorPrimaryDark() {
		return (EAttribute)themeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTheme_ColorPrimary() {
		return (EAttribute)themeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTheme_ColorAccent() {
		return (EAttribute)themeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTheme_Name() {
		return (EAttribute)themeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMainActivity() {
		return mainActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMainActivity_HasNav() {
		return (EReference)mainActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMainActivity_HasBar() {
		return (EReference)mainActivityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMainActivity_Name() {
		return (EAttribute)mainActivityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNavigationDrawer() {
		return navigationDrawerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNavigationDrawer_Name() {
		return (EAttribute)navigationDrawerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNavigationDrawer_HeaderDrawableSrcName() {
		return (EAttribute)navigationDrawerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTabBar() {
		return tabBarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTabBar_Name() {
		return (EAttribute)tabBarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFragment() {
		return fragmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFragment_Name() {
		return (EAttribute)fragmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFragment_HasApi() {
		return (EReference)fragmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoginFragment() {
		return loginFragmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoginFragment_GenerateEmailValidationCode() {
		return (EAttribute)loginFragmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoginFragment_GeneratePhoneNumberValidationCode() {
		return (EAttribute)loginFragmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCategoryFragment() {
		return categoryFragmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategoryFragment_HasCardView() {
		return (EReference)categoryFragmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCategoryFragment_ColNumber() {
		return (EAttribute)categoryFragmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocationsFragment() {
		return locationsFragmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocationsFragment_HasSubCatTabBar() {
		return (EReference)locationsFragmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocationsFragment_HasMap() {
		return (EReference)locationsFragmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocationsFragment_HasRecView() {
		return (EReference)locationsFragmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocationDetailsFragment() {
		return locationDetailsFragmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationDetailsFragment_ShowRatingOption() {
		return (EAttribute)locationDetailsFragmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationDetailsFragment_ShowCommentOption() {
		return (EAttribute)locationDetailsFragmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationDetailsFragment_ShowCallOption() {
		return (EAttribute)locationDetailsFragmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationDetailsFragment_ShowNavigationOption() {
		return (EAttribute)locationDetailsFragmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationDetailsFragment_ShowAddCommentOption() {
		return (EAttribute)locationDetailsFragmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationDetailsFragment_ShowAddToBookmarkOption() {
		return (EAttribute)locationDetailsFragmentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApi() {
		return apiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApi_BaseAddress() {
		return (EAttribute)apiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApi_LinkAddress() {
		return (EAttribute)apiEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApi_HasResItem() {
		return (EReference)apiEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApi_HasReqItem() {
		return (EReference)apiEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResponseItem() {
		return responseItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponseItem_ResponseKey() {
		return (EAttribute)responseItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponseItem_ResponseType() {
		return (EAttribute)responseItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponseItem_DefaultValue() {
		return (EAttribute)responseItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequestItem() {
		return requestItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestItem_RequestKey() {
		return (EAttribute)requestItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestItem_RequestType() {
		return (EAttribute)requestItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMap() {
		return mapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMap_ApiKey() {
		return (EAttribute)mapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMap_MapType() {
		return (EAttribute)mapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMap_BindCardsToPins() {
		return (EAttribute)mapEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMap_ZoomLevel() {
		return (EAttribute)mapEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMap_Name() {
		return (EAttribute)mapEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocationsRecyclerView() {
		return locationsRecyclerViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocationsRecyclerView_HasCV() {
		return (EReference)locationsRecyclerViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationsRecyclerView_IsVertical() {
		return (EAttribute)locationsRecyclerViewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationsRecyclerView_Name() {
		return (EAttribute)locationsRecyclerViewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCardView() {
		return cardViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardView_LayoutFileName() {
		return (EAttribute)cardViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCardView_HasCardItem() {
		return (EReference)cardViewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCardView_LinkTo() {
		return (EReference)cardViewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCardItems() {
		return cardItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardItems_Type() {
		return (EAttribute)cardItemsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardItems_Id() {
		return (EAttribute)cardItemsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCardItems_ConnectTo() {
		return (EReference)cardItemsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubCategoryTabbar() {
		return subCategoryTabbarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubCategoryTabbar_TabTextColor() {
		return (EAttribute)subCategoryTabbarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubCategoryTabbar_TabIndicatorColor() {
		return (EAttribute)subCategoryTabbarEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubCategoryTabbar_Name() {
		return (EAttribute)subCategoryTabbarEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubCategoryTabbar_HasAPi() {
		return (EReference)subCategoryTabbarEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubCategoryTabbar_HasTabs() {
		return (EReference)subCategoryTabbarEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubCategoryTabbar_TabSelectedTextColor() {
		return (EAttribute)subCategoryTabbarEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTab() {
		return tabEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTab_Name() {
		return (EAttribute)tabEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTab_GetItemIdFrom() {
		return (EReference)tabEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTab_GetItemNameFrom() {
		return (EReference)tabEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMAtoFrag() {
		return mAtoFragEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMAtoFrag_MtofTarget() {
		return (EReference)mAtoFragEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMAtoFrag_MtofSource() {
		return (EReference)mAtoFragEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMAtoFrag_Name() {
		return (EAttribute)mAtoFragEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTBtoFrag() {
		return tBtoFragEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTBtoFrag_TbtofSource() {
		return (EReference)tBtoFragEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTBtoFrag_TbtofTarget() {
		return (EReference)tBtoFragEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTBtoFrag_Name() {
		return (EAttribute)tBtoFragEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNDtoFrag() {
		return nDtoFragEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNDtoFrag_NdtofTarget() {
		return (EReference)nDtoFragEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNDtoFrag_NdtofSource() {
		return (EReference)nDtoFragEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNDtoFrag_Name() {
		return (EAttribute)nDtoFragEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMapType() {
		return mapTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getcardItemTypes() {
		return cardItemTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationFactory getApplicationFactory() {
		return (ApplicationFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		appEClass = createEClass(APP);
		createEReference(appEClass, APP__HAS_CONF);
		createEReference(appEClass, APP__HAS_MAIN_ACTIVITY);
		createEAttribute(appEClass, APP__APP_NAME);
		createEReference(appEClass, APP__HAS_THEME);
		createEReference(appEClass, APP__HAS_FRAG);
		createEReference(appEClass, APP__MAHAS_FRAGMENT);
		createEReference(appEClass, APP__TBHAS_FRAGMENT);
		createEReference(appEClass, APP__NDHAS_FRAGMENT);

		configEClass = createEClass(CONFIG);
		createEAttribute(configEClass, CONFIG__PACKAGE_NAME);
		createEAttribute(configEClass, CONFIG__ICON);
		createEAttribute(configEClass, CONFIG__MIN_SDK_VERSION);
		createEAttribute(configEClass, CONFIG__TARGET_SDK_VERSION);
		createEAttribute(configEClass, CONFIG__VERSION_CODE);
		createEAttribute(configEClass, CONFIG__VERSION_NAME);
		createEAttribute(configEClass, CONFIG__BUILD_TOOLS_VERSION);
		createEAttribute(configEClass, CONFIG__COMPILE_SDK_VERSION);
		createEAttribute(configEClass, CONFIG__NAME);

		themeEClass = createEClass(THEME);
		createEAttribute(themeEClass, THEME__COLOR_PRIMARY_DARK);
		createEAttribute(themeEClass, THEME__COLOR_PRIMARY);
		createEAttribute(themeEClass, THEME__COLOR_ACCENT);
		createEAttribute(themeEClass, THEME__NAME);

		mainActivityEClass = createEClass(MAIN_ACTIVITY);
		createEReference(mainActivityEClass, MAIN_ACTIVITY__HAS_NAV);
		createEReference(mainActivityEClass, MAIN_ACTIVITY__HAS_BAR);
		createEAttribute(mainActivityEClass, MAIN_ACTIVITY__NAME);

		navigationDrawerEClass = createEClass(NAVIGATION_DRAWER);
		createEAttribute(navigationDrawerEClass, NAVIGATION_DRAWER__NAME);
		createEAttribute(navigationDrawerEClass, NAVIGATION_DRAWER__HEADER_DRAWABLE_SRC_NAME);

		tabBarEClass = createEClass(TAB_BAR);
		createEAttribute(tabBarEClass, TAB_BAR__NAME);

		fragmentEClass = createEClass(FRAGMENT);
		createEAttribute(fragmentEClass, FRAGMENT__NAME);
		createEReference(fragmentEClass, FRAGMENT__HAS_API);

		loginFragmentEClass = createEClass(LOGIN_FRAGMENT);
		createEAttribute(loginFragmentEClass, LOGIN_FRAGMENT__GENERATE_EMAIL_VALIDATION_CODE);
		createEAttribute(loginFragmentEClass, LOGIN_FRAGMENT__GENERATE_PHONE_NUMBER_VALIDATION_CODE);

		categoryFragmentEClass = createEClass(CATEGORY_FRAGMENT);
		createEReference(categoryFragmentEClass, CATEGORY_FRAGMENT__HAS_CARD_VIEW);
		createEAttribute(categoryFragmentEClass, CATEGORY_FRAGMENT__COL_NUMBER);

		locationsFragmentEClass = createEClass(LOCATIONS_FRAGMENT);
		createEReference(locationsFragmentEClass, LOCATIONS_FRAGMENT__HAS_SUB_CAT_TAB_BAR);
		createEReference(locationsFragmentEClass, LOCATIONS_FRAGMENT__HAS_MAP);
		createEReference(locationsFragmentEClass, LOCATIONS_FRAGMENT__HAS_REC_VIEW);

		locationDetailsFragmentEClass = createEClass(LOCATION_DETAILS_FRAGMENT);
		createEAttribute(locationDetailsFragmentEClass, LOCATION_DETAILS_FRAGMENT__SHOW_RATING_OPTION);
		createEAttribute(locationDetailsFragmentEClass, LOCATION_DETAILS_FRAGMENT__SHOW_COMMENT_OPTION);
		createEAttribute(locationDetailsFragmentEClass, LOCATION_DETAILS_FRAGMENT__SHOW_CALL_OPTION);
		createEAttribute(locationDetailsFragmentEClass, LOCATION_DETAILS_FRAGMENT__SHOW_NAVIGATION_OPTION);
		createEAttribute(locationDetailsFragmentEClass, LOCATION_DETAILS_FRAGMENT__SHOW_ADD_COMMENT_OPTION);
		createEAttribute(locationDetailsFragmentEClass, LOCATION_DETAILS_FRAGMENT__SHOW_ADD_TO_BOOKMARK_OPTION);

		apiEClass = createEClass(API);
		createEAttribute(apiEClass, API__BASE_ADDRESS);
		createEAttribute(apiEClass, API__LINK_ADDRESS);
		createEReference(apiEClass, API__HAS_RES_ITEM);
		createEReference(apiEClass, API__HAS_REQ_ITEM);

		responseItemEClass = createEClass(RESPONSE_ITEM);
		createEAttribute(responseItemEClass, RESPONSE_ITEM__RESPONSE_KEY);
		createEAttribute(responseItemEClass, RESPONSE_ITEM__RESPONSE_TYPE);
		createEAttribute(responseItemEClass, RESPONSE_ITEM__DEFAULT_VALUE);

		requestItemEClass = createEClass(REQUEST_ITEM);
		createEAttribute(requestItemEClass, REQUEST_ITEM__REQUEST_KEY);
		createEAttribute(requestItemEClass, REQUEST_ITEM__REQUEST_TYPE);

		mapEClass = createEClass(MAP);
		createEAttribute(mapEClass, MAP__API_KEY);
		createEAttribute(mapEClass, MAP__MAP_TYPE);
		createEAttribute(mapEClass, MAP__BIND_CARDS_TO_PINS);
		createEAttribute(mapEClass, MAP__ZOOM_LEVEL);
		createEAttribute(mapEClass, MAP__NAME);

		locationsRecyclerViewEClass = createEClass(LOCATIONS_RECYCLER_VIEW);
		createEReference(locationsRecyclerViewEClass, LOCATIONS_RECYCLER_VIEW__HAS_CV);
		createEAttribute(locationsRecyclerViewEClass, LOCATIONS_RECYCLER_VIEW__IS_VERTICAL);
		createEAttribute(locationsRecyclerViewEClass, LOCATIONS_RECYCLER_VIEW__NAME);

		cardViewEClass = createEClass(CARD_VIEW);
		createEAttribute(cardViewEClass, CARD_VIEW__LAYOUT_FILE_NAME);
		createEReference(cardViewEClass, CARD_VIEW__HAS_CARD_ITEM);
		createEReference(cardViewEClass, CARD_VIEW__LINK_TO);

		cardItemsEClass = createEClass(CARD_ITEMS);
		createEAttribute(cardItemsEClass, CARD_ITEMS__TYPE);
		createEAttribute(cardItemsEClass, CARD_ITEMS__ID);
		createEReference(cardItemsEClass, CARD_ITEMS__CONNECT_TO);

		subCategoryTabbarEClass = createEClass(SUB_CATEGORY_TABBAR);
		createEAttribute(subCategoryTabbarEClass, SUB_CATEGORY_TABBAR__TAB_TEXT_COLOR);
		createEAttribute(subCategoryTabbarEClass, SUB_CATEGORY_TABBAR__TAB_INDICATOR_COLOR);
		createEAttribute(subCategoryTabbarEClass, SUB_CATEGORY_TABBAR__NAME);
		createEReference(subCategoryTabbarEClass, SUB_CATEGORY_TABBAR__HAS_API);
		createEReference(subCategoryTabbarEClass, SUB_CATEGORY_TABBAR__HAS_TABS);
		createEAttribute(subCategoryTabbarEClass, SUB_CATEGORY_TABBAR__TAB_SELECTED_TEXT_COLOR);

		tabEClass = createEClass(TAB);
		createEAttribute(tabEClass, TAB__NAME);
		createEReference(tabEClass, TAB__GET_ITEM_ID_FROM);
		createEReference(tabEClass, TAB__GET_ITEM_NAME_FROM);

		mAtoFragEClass = createEClass(MATO_FRAG);
		createEReference(mAtoFragEClass, MATO_FRAG__MTOF_TARGET);
		createEReference(mAtoFragEClass, MATO_FRAG__MTOF_SOURCE);
		createEAttribute(mAtoFragEClass, MATO_FRAG__NAME);

		tBtoFragEClass = createEClass(TBTO_FRAG);
		createEReference(tBtoFragEClass, TBTO_FRAG__TBTOF_SOURCE);
		createEReference(tBtoFragEClass, TBTO_FRAG__TBTOF_TARGET);
		createEAttribute(tBtoFragEClass, TBTO_FRAG__NAME);

		nDtoFragEClass = createEClass(NDTO_FRAG);
		createEReference(nDtoFragEClass, NDTO_FRAG__NDTOF_TARGET);
		createEReference(nDtoFragEClass, NDTO_FRAG__NDTOF_SOURCE);
		createEAttribute(nDtoFragEClass, NDTO_FRAG__NAME);

		// Create enums
		mapTypeEEnum = createEEnum(MAP_TYPE);
		cardItemTypesEEnum = createEEnum(CARD_ITEM_TYPES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		loginFragmentEClass.getESuperTypes().add(this.getFragment());
		categoryFragmentEClass.getESuperTypes().add(this.getFragment());
		locationsFragmentEClass.getESuperTypes().add(this.getFragment());
		locationDetailsFragmentEClass.getESuperTypes().add(this.getFragment());

		// Initialize classes and features; add operations and parameters
		initEClass(appEClass, Application.APP.class, "APP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAPP_HasConf(), this.getConfig(), null, "hasConf", null, 1, 1, Application.APP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAPP_HasMainActivity(), this.getMainActivity(), null, "hasMainActivity", null, 1, 1, Application.APP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAPP_AppName(), ecorePackage.getEString(), "appName", "appName", 0, 1, Application.APP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAPP_HasTheme(), this.getTheme(), null, "hasTheme", null, 0, 1, Application.APP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAPP_HasFrag(), this.getFragment(), null, "hasFrag", null, 0, -1, Application.APP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAPP_MAhasFragment(), this.getMAtoFrag(), null, "MAhasFragment", null, 0, -1, Application.APP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAPP_TBhasFragment(), this.getTBtoFrag(), null, "TBhasFragment", null, 0, -1, Application.APP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAPP_NDhasFragment(), this.getNDtoFrag(), null, "NDhasFragment", null, 0, -1, Application.APP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configEClass, Config.class, "Config", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConfig_PackageName(), ecorePackage.getEString(), "packageName", "com.yourDomain.appName", 0, 1, Config.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfig_Icon(), ecorePackage.getEString(), "icon", "ic_launcher", 0, 1, Config.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfig_MinSdkVersion(), ecorePackage.getEString(), "minSdkVersion", "19", 0, 1, Config.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfig_TargetSdkVersion(), ecorePackage.getEString(), "targetSdkVersion", "25", 0, 1, Config.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfig_VersionCode(), ecorePackage.getEString(), "versionCode", "1", 0, 1, Config.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfig_VersionName(), ecorePackage.getEString(), "versionName", "1.0", 0, 1, Config.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfig_BuildToolsVersion(), ecorePackage.getEString(), "buildToolsVersion", "25.0.0", 0, 1, Config.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfig_CompileSdkVersion(), ecorePackage.getEString(), "compileSdkVersion", "25", 0, 1, Config.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfig_Name(), ecorePackage.getEString(), "name", "myConfig", 0, 1, Config.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(themeEClass, Theme.class, "Theme", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTheme_ColorPrimaryDark(), ecorePackage.getEString(), "colorPrimaryDark", "#8E24AA", 0, 1, Theme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTheme_ColorPrimary(), ecorePackage.getEString(), "colorPrimary", "#6A1B9A", 0, 1, Theme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTheme_ColorAccent(), ecorePackage.getEString(), "colorAccent", "#C2185B", 0, 1, Theme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTheme_Name(), ecorePackage.getEString(), "name", "MyTheme", 0, 1, Theme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mainActivityEClass, MainActivity.class, "MainActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMainActivity_HasNav(), this.getNavigationDrawer(), null, "hasNav", null, 0, 1, MainActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMainActivity_HasBar(), this.getTabBar(), null, "hasBar", null, 0, 1, MainActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMainActivity_Name(), ecorePackage.getEString(), "name", "MyMainActivity", 0, 1, MainActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(navigationDrawerEClass, NavigationDrawer.class, "NavigationDrawer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNavigationDrawer_Name(), ecorePackage.getEString(), "name", "MyNav", 0, 1, NavigationDrawer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNavigationDrawer_HeaderDrawableSrcName(), ecorePackage.getEString(), "headerDrawableSrcName", "navheader", 0, 1, NavigationDrawer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tabBarEClass, TabBar.class, "TabBar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTabBar_Name(), ecorePackage.getEString(), "name", "MyTabBar", 0, 1, TabBar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fragmentEClass, Fragment.class, "Fragment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFragment_Name(), ecorePackage.getEString(), "name", "", 0, 1, Fragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFragment_HasApi(), this.getApi(), null, "hasApi", null, 0, 1, Fragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(loginFragmentEClass, LoginFragment.class, "LoginFragment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLoginFragment_GenerateEmailValidationCode(), ecorePackage.getEBoolean(), "generateEmailValidationCode", null, 0, 1, LoginFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoginFragment_GeneratePhoneNumberValidationCode(), ecorePackage.getEBoolean(), "generatePhoneNumberValidationCode", null, 0, 1, LoginFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(categoryFragmentEClass, CategoryFragment.class, "CategoryFragment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCategoryFragment_HasCardView(), this.getCardView(), null, "hasCardView", null, 0, 1, CategoryFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCategoryFragment_ColNumber(), ecorePackage.getEInt(), "colNumber", "2", 0, 1, CategoryFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationsFragmentEClass, LocationsFragment.class, "LocationsFragment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocationsFragment_HasSubCatTabBar(), this.getSubCategoryTabbar(), null, "hasSubCatTabBar", null, 0, 1, LocationsFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocationsFragment_HasMap(), this.getMap(), null, "hasMap", null, 0, 1, LocationsFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocationsFragment_HasRecView(), this.getLocationsRecyclerView(), null, "hasRecView", null, 0, 2, LocationsFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationDetailsFragmentEClass, LocationDetailsFragment.class, "LocationDetailsFragment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocationDetailsFragment_ShowRatingOption(), ecorePackage.getEBoolean(), "showRatingOption", null, 0, 1, LocationDetailsFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocationDetailsFragment_ShowCommentOption(), ecorePackage.getEBoolean(), "showCommentOption", null, 0, 1, LocationDetailsFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocationDetailsFragment_ShowCallOption(), ecorePackage.getEBoolean(), "showCallOption", null, 0, 1, LocationDetailsFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocationDetailsFragment_ShowNavigationOption(), ecorePackage.getEBoolean(), "showNavigationOption", null, 0, 1, LocationDetailsFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocationDetailsFragment_ShowAddCommentOption(), ecorePackage.getEBoolean(), "showAddCommentOption", null, 0, 1, LocationDetailsFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocationDetailsFragment_ShowAddToBookmarkOption(), ecorePackage.getEBoolean(), "showAddToBookmarkOption", null, 0, 1, LocationDetailsFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apiEClass, Api.class, "Api", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApi_BaseAddress(), ecorePackage.getEString(), "baseAddress", "http://medvisit.ir/", 1, 1, Api.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApi_LinkAddress(), ecorePackage.getEString(), "linkAddress", "/API_UINAV/hiIranApi/public/...", 1, 1, Api.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApi_HasResItem(), this.getResponseItem(), null, "hasResItem", null, 1, -1, Api.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApi_HasReqItem(), this.getRequestItem(), null, "hasReqItem", null, 1, -1, Api.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(responseItemEClass, ResponseItem.class, "ResponseItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResponseItem_ResponseKey(), ecorePackage.getEString(), "responseKey", null, 0, 1, ResponseItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResponseItem_ResponseType(), ecorePackage.getEString(), "responseType", null, 0, 1, ResponseItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResponseItem_DefaultValue(), ecorePackage.getEString(), "defaultValue", "notAvailable", 0, 1, ResponseItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requestItemEClass, RequestItem.class, "RequestItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequestItem_RequestKey(), ecorePackage.getEString(), "requestKey", null, 0, 1, RequestItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequestItem_RequestType(), ecorePackage.getEString(), "requestType", null, 0, 1, RequestItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mapEClass, Map.class, "Map", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMap_ApiKey(), ecorePackage.getEString(), "apiKey", "AIzaSyCQ2IuVejeAjpoZA9w-d9IJ14xcoAy7Yd4", 0, 1, Map.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMap_MapType(), this.getMapType(), "mapType", null, 0, 1, Map.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMap_BindCardsToPins(), ecorePackage.getEBoolean(), "bindCardsToPins", null, 0, 1, Map.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMap_ZoomLevel(), ecorePackage.getEInt(), "zoomLevel", "16", 0, 1, Map.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMap_Name(), ecorePackage.getEString(), "name", "MyMap", 0, 1, Map.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationsRecyclerViewEClass, LocationsRecyclerView.class, "LocationsRecyclerView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocationsRecyclerView_HasCV(), this.getCardView(), null, "hasCV", null, 1, 1, LocationsRecyclerView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocationsRecyclerView_IsVertical(), ecorePackage.getEBoolean(), "isVertical", "false", 0, 1, LocationsRecyclerView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocationsRecyclerView_Name(), ecorePackage.getEString(), "name", null, 0, 1, LocationsRecyclerView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cardViewEClass, CardView.class, "CardView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCardView_LayoutFileName(), ecorePackage.getEString(), "layoutFileName", "?.xml", 0, 1, CardView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCardView_HasCardItem(), this.getCardItems(), null, "hasCardItem", null, 1, -1, CardView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCardView_LinkTo(), this.getFragment(), null, "linkTo", null, 0, 1, CardView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cardItemsEClass, CardItems.class, "CardItems", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCardItems_Type(), this.getcardItemTypes(), "type", null, 0, 1, CardItems.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardItems_Id(), ecorePackage.getEString(), "id", null, 0, 1, CardItems.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCardItems_ConnectTo(), this.getResponseItem(), null, "connectTo", null, 0, 1, CardItems.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subCategoryTabbarEClass, SubCategoryTabbar.class, "SubCategoryTabbar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubCategoryTabbar_TabTextColor(), ecorePackage.getEString(), "tabTextColor", null, 0, 1, SubCategoryTabbar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubCategoryTabbar_TabIndicatorColor(), ecorePackage.getEString(), "tabIndicatorColor", null, 0, 1, SubCategoryTabbar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubCategoryTabbar_Name(), ecorePackage.getEString(), "name", "MySubCat", 0, 1, SubCategoryTabbar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubCategoryTabbar_HasAPi(), this.getApi(), null, "hasAPi", null, 0, 1, SubCategoryTabbar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubCategoryTabbar_HasTabs(), this.getTab(), null, "hasTabs", null, 1, 1, SubCategoryTabbar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubCategoryTabbar_TabSelectedTextColor(), ecorePackage.getEString(), "tabSelectedTextColor", null, 0, 1, SubCategoryTabbar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tabEClass, Tab.class, "Tab", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTab_Name(), ecorePackage.getEString(), "name", "MyTab", 0, 1, Tab.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTab_GetItemIdFrom(), this.getResponseItem(), null, "getItemIdFrom", null, 0, 1, Tab.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTab_GetItemNameFrom(), this.getResponseItem(), null, "getItemNameFrom", null, 0, 1, Tab.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mAtoFragEClass, MAtoFrag.class, "MAtoFrag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMAtoFrag_MtofTarget(), this.getFragment(), null, "mtofTarget", null, 1, 1, MAtoFrag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMAtoFrag_MtofSource(), this.getMainActivity(), null, "mtofSource", null, 0, 1, MAtoFrag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMAtoFrag_Name(), ecorePackage.getEString(), "name", null, 0, 1, MAtoFrag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tBtoFragEClass, TBtoFrag.class, "TBtoFrag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTBtoFrag_TbtofSource(), this.getTabBar(), null, "tbtofSource", null, 0, 1, TBtoFrag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTBtoFrag_TbtofTarget(), this.getFragment(), null, "tbtofTarget", null, 1, 1, TBtoFrag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTBtoFrag_Name(), ecorePackage.getEString(), "name", "", 0, 1, TBtoFrag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nDtoFragEClass, NDtoFrag.class, "NDtoFrag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNDtoFrag_NdtofTarget(), this.getFragment(), null, "ndtofTarget", null, 1, 1, NDtoFrag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNDtoFrag_NdtofSource(), this.getNavigationDrawer(), null, "ndtofSource", null, 0, 1, NDtoFrag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNDtoFrag_Name(), ecorePackage.getEString(), "name", null, 0, 1, NDtoFrag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(mapTypeEEnum, MapType.class, "MapType");
		addEEnumLiteral(mapTypeEEnum, MapType.GOOGLE_MAP);
		addEEnumLiteral(mapTypeEEnum, MapType.BING_MAP);
		addEEnumLiteral(mapTypeEEnum, MapType.OPEN_LAYER);

		initEEnum(cardItemTypesEEnum, cardItemTypes.class, "cardItemTypes");
		addEEnumLiteral(cardItemTypesEEnum, cardItemTypes.IMAGE_VIEW);
		addEEnumLiteral(cardItemTypesEEnum, cardItemTypes.TEXT_VIEW);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf.diagram
		createGmfAnnotations();
		// gmf.node
		createGmf_1Annotations();
		// gmf.compartment
		createGmf_2Annotations();
		// gmf.link
		createGmf_3Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf.diagram";	
		addAnnotation
		  (appEClass, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.node";	
		addAnnotation
		  (configEClass, 
		   source, 
		   new String[] {
			 "figure", "figures.ConfigFigure",
			 "label.icon", "false",
			 "label", "name"
		   });	
		addAnnotation
		  (themeEClass, 
		   source, 
		   new String[] {
			 "figure", "figures.ThemeFigure",
			 "label.icon", "false",
			 "label", "name"
		   });	
		addAnnotation
		  (mainActivityEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "tool.name", "MainActivity"
		   });	
		addAnnotation
		  (navigationDrawerEClass, 
		   source, 
		   new String[] {
			 "figure", "figures.NavigationDrawerFigure",
			 "label.icon", "false",
			 "label", "name"
		   });	
		addAnnotation
		  (tabBarEClass, 
		   source, 
		   new String[] {
			 "figure", "figures.TabBarFigure",
			 "label.icon", "false",
			 "label", "name"
		   });	
		addAnnotation
		  (fragmentEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });	
		addAnnotation
		  (apiEClass, 
		   source, 
		   new String[] {
			 "label", "baseAddress"
		   });	
		addAnnotation
		  (responseItemEClass, 
		   source, 
		   new String[] {
			 "label", "responseKey"
		   });	
		addAnnotation
		  (requestItemEClass, 
		   source, 
		   new String[] {
			 "label", "requestKey"
		   });	
		addAnnotation
		  (mapEClass, 
		   source, 
		   new String[] {
			 "figure", "figures.MapFigure",
			 "label.icon", "false",
			 "label", "name"
		   });	
		addAnnotation
		  (locationsRecyclerViewEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });	
		addAnnotation
		  (cardViewEClass, 
		   source, 
		   new String[] {
			 "label", "layoutFileName"
		   });	
		addAnnotation
		  (cardItemsEClass, 
		   source, 
		   new String[] {
			 "label", "id"
		   });	
		addAnnotation
		  (subCategoryTabbarEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });	
		addAnnotation
		  (tabEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.compartment";	
		addAnnotation
		  (getMainActivity_HasNav(), 
		   source, 
		   new String[] {
			 "collapsible", "false"
		   });	
		addAnnotation
		  (getMainActivity_HasBar(), 
		   source, 
		   new String[] {
			 "collapsible", "false"
		   });	
		addAnnotation
		  (getFragment_HasApi(), 
		   source, 
		   new String[] {
			 "layout", "list",
			 "collapsible", "true"
		   });	
		addAnnotation
		  (getCategoryFragment_HasCardView(), 
		   source, 
		   new String[] {
			 "collapsible", "false"
		   });	
		addAnnotation
		  (getLocationsFragment_HasSubCatTabBar(), 
		   source, 
		   new String[] {
			 "layout", "list",
			 "collapsible", "false"
		   });	
		addAnnotation
		  (getLocationsFragment_HasMap(), 
		   source, 
		   new String[] {
			 "layout", "list",
			 "collapsible", "false"
		   });	
		addAnnotation
		  (getLocationsFragment_HasRecView(), 
		   source, 
		   new String[] {
			 "layout", "list",
			 "collapsible", "false"
		   });	
		addAnnotation
		  (getApi_HasResItem(), 
		   source, 
		   new String[] {
			 "layout", "list",
			 "collapsible", "false"
		   });	
		addAnnotation
		  (getApi_HasReqItem(), 
		   source, 
		   new String[] {
			 "layout", "list",
			 "collapsible", "false"
		   });	
		addAnnotation
		  (getLocationsRecyclerView_HasCV(), 
		   source, 
		   new String[] {
			 "layout", "list",
			 "collapsible", "false"
		   });	
		addAnnotation
		  (getCardView_HasCardItem(), 
		   source, 
		   new String[] {
			 "layout", "list",
			 "collapsible", "false"
		   });	
		addAnnotation
		  (getSubCategoryTabbar_HasAPi(), 
		   source, 
		   new String[] {
			 "layout", "list",
			 "collapsible", "true"
		   });	
		addAnnotation
		  (getSubCategoryTabbar_HasTabs(), 
		   source, 
		   new String[] {
			 "layout", "list",
			 "collapsible", "true"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations() {
		String source = "gmf.link";	
		addAnnotation
		  (getCardView_LinkTo(), 
		   source, 
		   new String[] {
			 "target.decoration", "arrow",
			 "label", "linkedTo",
			 "style", "solid"
		   });	
		addAnnotation
		  (getCardItems_ConnectTo(), 
		   source, 
		   new String[] {
			 "target.decoration", "arrow",
			 "label", "connectedTo",
			 "style", "solid"
		   });	
		addAnnotation
		  (getTab_GetItemIdFrom(), 
		   source, 
		   new String[] {
			 "target.decoration", "arrow",
			 "label", "has",
			 "style", "dash"
		   });	
		addAnnotation
		  (getTab_GetItemNameFrom(), 
		   source, 
		   new String[] {
			 "target.decoration", "arrow",
			 "label", "has",
			 "style", "dash"
		   });	
		addAnnotation
		  (mAtoFragEClass, 
		   source, 
		   new String[] {
			 "source", "mtofSource",
			 "target", "mtofTarget",
			 "style", "solid",
			 "width", "2",
			 "target.decoration", "arrow"
		   });	
		addAnnotation
		  (tBtoFragEClass, 
		   source, 
		   new String[] {
			 "source", "tbtofSource",
			 "target", "tbtofTarget",
			 "style", "dash",
			 "width", "2"
		   });	
		addAnnotation
		  (nDtoFragEClass, 
		   source, 
		   new String[] {
			 "source", "ndtofSource",
			 "target", "ndtofTarget",
			 "style", "dash",
			 "width", "2"
		   });
	}

} //ApplicationPackageImpl
