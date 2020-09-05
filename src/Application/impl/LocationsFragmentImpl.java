/**
 */
package Application.impl;

import Application.ApplicationPackage;
import Application.LocationsFragment;
import Application.LocationsRecyclerView;
import Application.Map;
import Application.SubCategoryTabbar;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Locations Fragment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Application.impl.LocationsFragmentImpl#getHasSubCatTabBar <em>Has Sub Cat Tab Bar</em>}</li>
 *   <li>{@link Application.impl.LocationsFragmentImpl#getHasMap <em>Has Map</em>}</li>
 *   <li>{@link Application.impl.LocationsFragmentImpl#getHasRecView <em>Has Rec View</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocationsFragmentImpl extends FragmentImpl implements LocationsFragment {
	/**
	 * The cached value of the '{@link #getHasSubCatTabBar() <em>Has Sub Cat Tab Bar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasSubCatTabBar()
	 * @generated
	 * @ordered
	 */
	protected SubCategoryTabbar hasSubCatTabBar;

	/**
	 * The cached value of the '{@link #getHasMap() <em>Has Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasMap()
	 * @generated
	 * @ordered
	 */
	protected Map hasMap;

	/**
	 * The cached value of the '{@link #getHasRecView() <em>Has Rec View</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasRecView()
	 * @generated
	 * @ordered
	 */
	protected EList<LocationsRecyclerView> hasRecView;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationsFragmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApplicationPackage.Literals.LOCATIONS_FRAGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubCategoryTabbar getHasSubCatTabBar() {
		return hasSubCatTabBar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasSubCatTabBar(SubCategoryTabbar newHasSubCatTabBar, NotificationChain msgs) {
		SubCategoryTabbar oldHasSubCatTabBar = hasSubCatTabBar;
		hasSubCatTabBar = newHasSubCatTabBar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplicationPackage.LOCATIONS_FRAGMENT__HAS_SUB_CAT_TAB_BAR, oldHasSubCatTabBar, newHasSubCatTabBar);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasSubCatTabBar(SubCategoryTabbar newHasSubCatTabBar) {
		if (newHasSubCatTabBar != hasSubCatTabBar) {
			NotificationChain msgs = null;
			if (hasSubCatTabBar != null)
				msgs = ((InternalEObject)hasSubCatTabBar).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.LOCATIONS_FRAGMENT__HAS_SUB_CAT_TAB_BAR, null, msgs);
			if (newHasSubCatTabBar != null)
				msgs = ((InternalEObject)newHasSubCatTabBar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.LOCATIONS_FRAGMENT__HAS_SUB_CAT_TAB_BAR, null, msgs);
			msgs = basicSetHasSubCatTabBar(newHasSubCatTabBar, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.LOCATIONS_FRAGMENT__HAS_SUB_CAT_TAB_BAR, newHasSubCatTabBar, newHasSubCatTabBar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map getHasMap() {
		return hasMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasMap(Map newHasMap, NotificationChain msgs) {
		Map oldHasMap = hasMap;
		hasMap = newHasMap;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplicationPackage.LOCATIONS_FRAGMENT__HAS_MAP, oldHasMap, newHasMap);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasMap(Map newHasMap) {
		if (newHasMap != hasMap) {
			NotificationChain msgs = null;
			if (hasMap != null)
				msgs = ((InternalEObject)hasMap).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.LOCATIONS_FRAGMENT__HAS_MAP, null, msgs);
			if (newHasMap != null)
				msgs = ((InternalEObject)newHasMap).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.LOCATIONS_FRAGMENT__HAS_MAP, null, msgs);
			msgs = basicSetHasMap(newHasMap, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.LOCATIONS_FRAGMENT__HAS_MAP, newHasMap, newHasMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LocationsRecyclerView> getHasRecView() {
		if (hasRecView == null) {
			hasRecView = new EObjectContainmentEList<LocationsRecyclerView>(LocationsRecyclerView.class, this, ApplicationPackage.LOCATIONS_FRAGMENT__HAS_REC_VIEW);
		}
		return hasRecView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApplicationPackage.LOCATIONS_FRAGMENT__HAS_SUB_CAT_TAB_BAR:
				return basicSetHasSubCatTabBar(null, msgs);
			case ApplicationPackage.LOCATIONS_FRAGMENT__HAS_MAP:
				return basicSetHasMap(null, msgs);
			case ApplicationPackage.LOCATIONS_FRAGMENT__HAS_REC_VIEW:
				return ((InternalEList<?>)getHasRecView()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApplicationPackage.LOCATIONS_FRAGMENT__HAS_SUB_CAT_TAB_BAR:
				return getHasSubCatTabBar();
			case ApplicationPackage.LOCATIONS_FRAGMENT__HAS_MAP:
				return getHasMap();
			case ApplicationPackage.LOCATIONS_FRAGMENT__HAS_REC_VIEW:
				return getHasRecView();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ApplicationPackage.LOCATIONS_FRAGMENT__HAS_SUB_CAT_TAB_BAR:
				setHasSubCatTabBar((SubCategoryTabbar)newValue);
				return;
			case ApplicationPackage.LOCATIONS_FRAGMENT__HAS_MAP:
				setHasMap((Map)newValue);
				return;
			case ApplicationPackage.LOCATIONS_FRAGMENT__HAS_REC_VIEW:
				getHasRecView().clear();
				getHasRecView().addAll((Collection<? extends LocationsRecyclerView>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ApplicationPackage.LOCATIONS_FRAGMENT__HAS_SUB_CAT_TAB_BAR:
				setHasSubCatTabBar((SubCategoryTabbar)null);
				return;
			case ApplicationPackage.LOCATIONS_FRAGMENT__HAS_MAP:
				setHasMap((Map)null);
				return;
			case ApplicationPackage.LOCATIONS_FRAGMENT__HAS_REC_VIEW:
				getHasRecView().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ApplicationPackage.LOCATIONS_FRAGMENT__HAS_SUB_CAT_TAB_BAR:
				return hasSubCatTabBar != null;
			case ApplicationPackage.LOCATIONS_FRAGMENT__HAS_MAP:
				return hasMap != null;
			case ApplicationPackage.LOCATIONS_FRAGMENT__HAS_REC_VIEW:
				return hasRecView != null && !hasRecView.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LocationsFragmentImpl
