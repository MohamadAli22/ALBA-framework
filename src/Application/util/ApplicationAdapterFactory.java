/**
 */
package Application.util;

import Application.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Application.ApplicationPackage
 * @generated
 */
public class ApplicationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ApplicationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ApplicationPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationSwitch<Adapter> modelSwitch =
		new ApplicationSwitch<Adapter>() {
			@Override
			public Adapter caseAPP(APP object) {
				return createAPPAdapter();
			}
			@Override
			public Adapter caseConfig(Config object) {
				return createConfigAdapter();
			}
			@Override
			public Adapter caseTheme(Theme object) {
				return createThemeAdapter();
			}
			@Override
			public Adapter caseMainActivity(MainActivity object) {
				return createMainActivityAdapter();
			}
			@Override
			public Adapter caseNavigationDrawer(NavigationDrawer object) {
				return createNavigationDrawerAdapter();
			}
			@Override
			public Adapter caseTabBar(TabBar object) {
				return createTabBarAdapter();
			}
			@Override
			public Adapter caseFragment(Fragment object) {
				return createFragmentAdapter();
			}
			@Override
			public Adapter caseLoginFragment(LoginFragment object) {
				return createLoginFragmentAdapter();
			}
			@Override
			public Adapter caseCategoryFragment(CategoryFragment object) {
				return createCategoryFragmentAdapter();
			}
			@Override
			public Adapter caseLocationsFragment(LocationsFragment object) {
				return createLocationsFragmentAdapter();
			}
			@Override
			public Adapter caseLocationDetailsFragment(LocationDetailsFragment object) {
				return createLocationDetailsFragmentAdapter();
			}
			@Override
			public Adapter caseApi(Api object) {
				return createApiAdapter();
			}
			@Override
			public Adapter caseResponseItem(ResponseItem object) {
				return createResponseItemAdapter();
			}
			@Override
			public Adapter caseRequestItem(RequestItem object) {
				return createRequestItemAdapter();
			}
			@Override
			public Adapter caseMap(Map object) {
				return createMapAdapter();
			}
			@Override
			public Adapter caseLocationsRecyclerView(LocationsRecyclerView object) {
				return createLocationsRecyclerViewAdapter();
			}
			@Override
			public Adapter caseCardView(CardView object) {
				return createCardViewAdapter();
			}
			@Override
			public Adapter caseCardItems(CardItems object) {
				return createCardItemsAdapter();
			}
			@Override
			public Adapter caseSubCategoryTabbar(SubCategoryTabbar object) {
				return createSubCategoryTabbarAdapter();
			}
			@Override
			public Adapter caseTab(Tab object) {
				return createTabAdapter();
			}
			@Override
			public Adapter caseMAtoFrag(MAtoFrag object) {
				return createMAtoFragAdapter();
			}
			@Override
			public Adapter caseTBtoFrag(TBtoFrag object) {
				return createTBtoFragAdapter();
			}
			@Override
			public Adapter caseNDtoFrag(NDtoFrag object) {
				return createNDtoFragAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link Application.APP <em>APP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Application.APP
	 * @generated
	 */
	public Adapter createAPPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Application.Config <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Application.Config
	 * @generated
	 */
	public Adapter createConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Application.Theme <em>Theme</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Application.Theme
	 * @generated
	 */
	public Adapter createThemeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Application.MainActivity <em>Main Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Application.MainActivity
	 * @generated
	 */
	public Adapter createMainActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Application.NavigationDrawer <em>Navigation Drawer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Application.NavigationDrawer
	 * @generated
	 */
	public Adapter createNavigationDrawerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Application.TabBar <em>Tab Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Application.TabBar
	 * @generated
	 */
	public Adapter createTabBarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Application.Fragment <em>Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Application.Fragment
	 * @generated
	 */
	public Adapter createFragmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Application.LoginFragment <em>Login Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Application.LoginFragment
	 * @generated
	 */
	public Adapter createLoginFragmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Application.CategoryFragment <em>Category Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Application.CategoryFragment
	 * @generated
	 */
	public Adapter createCategoryFragmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Application.LocationsFragment <em>Locations Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Application.LocationsFragment
	 * @generated
	 */
	public Adapter createLocationsFragmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Application.LocationDetailsFragment <em>Location Details Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Application.LocationDetailsFragment
	 * @generated
	 */
	public Adapter createLocationDetailsFragmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Application.Api <em>Api</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Application.Api
	 * @generated
	 */
	public Adapter createApiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Application.ResponseItem <em>Response Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Application.ResponseItem
	 * @generated
	 */
	public Adapter createResponseItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Application.RequestItem <em>Request Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Application.RequestItem
	 * @generated
	 */
	public Adapter createRequestItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Application.Map <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Application.Map
	 * @generated
	 */
	public Adapter createMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Application.LocationsRecyclerView <em>Locations Recycler View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Application.LocationsRecyclerView
	 * @generated
	 */
	public Adapter createLocationsRecyclerViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Application.CardView <em>Card View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Application.CardView
	 * @generated
	 */
	public Adapter createCardViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Application.CardItems <em>Card Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Application.CardItems
	 * @generated
	 */
	public Adapter createCardItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Application.SubCategoryTabbar <em>Sub Category Tabbar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Application.SubCategoryTabbar
	 * @generated
	 */
	public Adapter createSubCategoryTabbarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Application.Tab <em>Tab</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Application.Tab
	 * @generated
	 */
	public Adapter createTabAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Application.MAtoFrag <em>MAto Frag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Application.MAtoFrag
	 * @generated
	 */
	public Adapter createMAtoFragAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Application.TBtoFrag <em>TBto Frag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Application.TBtoFrag
	 * @generated
	 */
	public Adapter createTBtoFragAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Application.NDtoFrag <em>NDto Frag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Application.NDtoFrag
	 * @generated
	 */
	public Adapter createNDtoFragAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ApplicationAdapterFactory
