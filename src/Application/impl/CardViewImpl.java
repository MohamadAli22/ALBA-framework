/**
 */
package Application.impl;

import Application.ApplicationPackage;
import Application.CardItems;
import Application.CardView;
import Application.Fragment;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Card View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Application.impl.CardViewImpl#getLayoutFileName <em>Layout File Name</em>}</li>
 *   <li>{@link Application.impl.CardViewImpl#getHasCardItem <em>Has Card Item</em>}</li>
 *   <li>{@link Application.impl.CardViewImpl#getLinkTo <em>Link To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CardViewImpl extends EObjectImpl implements CardView {
	/**
	 * The default value of the '{@link #getLayoutFileName() <em>Layout File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutFileName()
	 * @generated
	 * @ordered
	 */
	protected static final String LAYOUT_FILE_NAME_EDEFAULT = "?.xml";

	/**
	 * The cached value of the '{@link #getLayoutFileName() <em>Layout File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutFileName()
	 * @generated
	 * @ordered
	 */
	protected String layoutFileName = LAYOUT_FILE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasCardItem() <em>Has Card Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasCardItem()
	 * @generated
	 * @ordered
	 */
	protected EList<CardItems> hasCardItem;

	/**
	 * The cached value of the '{@link #getLinkTo() <em>Link To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkTo()
	 * @generated
	 * @ordered
	 */
	protected Fragment linkTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CardViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApplicationPackage.Literals.CARD_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLayoutFileName() {
		return layoutFileName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayoutFileName(String newLayoutFileName) {
		String oldLayoutFileName = layoutFileName;
		layoutFileName = newLayoutFileName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.CARD_VIEW__LAYOUT_FILE_NAME, oldLayoutFileName, layoutFileName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CardItems> getHasCardItem() {
		if (hasCardItem == null) {
			hasCardItem = new EObjectContainmentEList<CardItems>(CardItems.class, this, ApplicationPackage.CARD_VIEW__HAS_CARD_ITEM);
		}
		return hasCardItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fragment getLinkTo() {
		if (linkTo != null && linkTo.eIsProxy()) {
			InternalEObject oldLinkTo = (InternalEObject)linkTo;
			linkTo = (Fragment)eResolveProxy(oldLinkTo);
			if (linkTo != oldLinkTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApplicationPackage.CARD_VIEW__LINK_TO, oldLinkTo, linkTo));
			}
		}
		return linkTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fragment basicGetLinkTo() {
		return linkTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkTo(Fragment newLinkTo) {
		Fragment oldLinkTo = linkTo;
		linkTo = newLinkTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.CARD_VIEW__LINK_TO, oldLinkTo, linkTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApplicationPackage.CARD_VIEW__HAS_CARD_ITEM:
				return ((InternalEList<?>)getHasCardItem()).basicRemove(otherEnd, msgs);
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
			case ApplicationPackage.CARD_VIEW__LAYOUT_FILE_NAME:
				return getLayoutFileName();
			case ApplicationPackage.CARD_VIEW__HAS_CARD_ITEM:
				return getHasCardItem();
			case ApplicationPackage.CARD_VIEW__LINK_TO:
				if (resolve) return getLinkTo();
				return basicGetLinkTo();
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
			case ApplicationPackage.CARD_VIEW__LAYOUT_FILE_NAME:
				setLayoutFileName((String)newValue);
				return;
			case ApplicationPackage.CARD_VIEW__HAS_CARD_ITEM:
				getHasCardItem().clear();
				getHasCardItem().addAll((Collection<? extends CardItems>)newValue);
				return;
			case ApplicationPackage.CARD_VIEW__LINK_TO:
				setLinkTo((Fragment)newValue);
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
			case ApplicationPackage.CARD_VIEW__LAYOUT_FILE_NAME:
				setLayoutFileName(LAYOUT_FILE_NAME_EDEFAULT);
				return;
			case ApplicationPackage.CARD_VIEW__HAS_CARD_ITEM:
				getHasCardItem().clear();
				return;
			case ApplicationPackage.CARD_VIEW__LINK_TO:
				setLinkTo((Fragment)null);
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
			case ApplicationPackage.CARD_VIEW__LAYOUT_FILE_NAME:
				return LAYOUT_FILE_NAME_EDEFAULT == null ? layoutFileName != null : !LAYOUT_FILE_NAME_EDEFAULT.equals(layoutFileName);
			case ApplicationPackage.CARD_VIEW__HAS_CARD_ITEM:
				return hasCardItem != null && !hasCardItem.isEmpty();
			case ApplicationPackage.CARD_VIEW__LINK_TO:
				return linkTo != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (layoutFileName: ");
		result.append(layoutFileName);
		result.append(')');
		return result.toString();
	}

} //CardViewImpl
