/**
 */
package Application.impl;

import Application.Api;
import Application.ApplicationPackage;
import Application.RequestItem;
import Application.ResponseItem;

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
 * An implementation of the model object '<em><b>Api</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Application.impl.ApiImpl#getBaseAddress <em>Base Address</em>}</li>
 *   <li>{@link Application.impl.ApiImpl#getLinkAddress <em>Link Address</em>}</li>
 *   <li>{@link Application.impl.ApiImpl#getHasResItem <em>Has Res Item</em>}</li>
 *   <li>{@link Application.impl.ApiImpl#getHasReqItem <em>Has Req Item</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApiImpl extends EObjectImpl implements Api {
	/**
	 * The default value of the '{@link #getBaseAddress() <em>Base Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_ADDRESS_EDEFAULT = "http://medvisit.ir/";

	/**
	 * The cached value of the '{@link #getBaseAddress() <em>Base Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseAddress()
	 * @generated
	 * @ordered
	 */
	protected String baseAddress = BASE_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLinkAddress() <em>Link Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String LINK_ADDRESS_EDEFAULT = "/API_UINAV/hiIranApi/public/...";

	/**
	 * The cached value of the '{@link #getLinkAddress() <em>Link Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkAddress()
	 * @generated
	 * @ordered
	 */
	protected String linkAddress = LINK_ADDRESS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasResItem() <em>Has Res Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasResItem()
	 * @generated
	 * @ordered
	 */
	protected EList<ResponseItem> hasResItem;

	/**
	 * The cached value of the '{@link #getHasReqItem() <em>Has Req Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasReqItem()
	 * @generated
	 * @ordered
	 */
	protected EList<RequestItem> hasReqItem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApiImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApplicationPackage.Literals.API;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBaseAddress() {
		return baseAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseAddress(String newBaseAddress) {
		String oldBaseAddress = baseAddress;
		baseAddress = newBaseAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.API__BASE_ADDRESS, oldBaseAddress, baseAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLinkAddress() {
		return linkAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkAddress(String newLinkAddress) {
		String oldLinkAddress = linkAddress;
		linkAddress = newLinkAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.API__LINK_ADDRESS, oldLinkAddress, linkAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResponseItem> getHasResItem() {
		if (hasResItem == null) {
			hasResItem = new EObjectContainmentEList<ResponseItem>(ResponseItem.class, this, ApplicationPackage.API__HAS_RES_ITEM);
		}
		return hasResItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequestItem> getHasReqItem() {
		if (hasReqItem == null) {
			hasReqItem = new EObjectContainmentEList<RequestItem>(RequestItem.class, this, ApplicationPackage.API__HAS_REQ_ITEM);
		}
		return hasReqItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApplicationPackage.API__HAS_RES_ITEM:
				return ((InternalEList<?>)getHasResItem()).basicRemove(otherEnd, msgs);
			case ApplicationPackage.API__HAS_REQ_ITEM:
				return ((InternalEList<?>)getHasReqItem()).basicRemove(otherEnd, msgs);
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
			case ApplicationPackage.API__BASE_ADDRESS:
				return getBaseAddress();
			case ApplicationPackage.API__LINK_ADDRESS:
				return getLinkAddress();
			case ApplicationPackage.API__HAS_RES_ITEM:
				return getHasResItem();
			case ApplicationPackage.API__HAS_REQ_ITEM:
				return getHasReqItem();
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
			case ApplicationPackage.API__BASE_ADDRESS:
				setBaseAddress((String)newValue);
				return;
			case ApplicationPackage.API__LINK_ADDRESS:
				setLinkAddress((String)newValue);
				return;
			case ApplicationPackage.API__HAS_RES_ITEM:
				getHasResItem().clear();
				getHasResItem().addAll((Collection<? extends ResponseItem>)newValue);
				return;
			case ApplicationPackage.API__HAS_REQ_ITEM:
				getHasReqItem().clear();
				getHasReqItem().addAll((Collection<? extends RequestItem>)newValue);
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
			case ApplicationPackage.API__BASE_ADDRESS:
				setBaseAddress(BASE_ADDRESS_EDEFAULT);
				return;
			case ApplicationPackage.API__LINK_ADDRESS:
				setLinkAddress(LINK_ADDRESS_EDEFAULT);
				return;
			case ApplicationPackage.API__HAS_RES_ITEM:
				getHasResItem().clear();
				return;
			case ApplicationPackage.API__HAS_REQ_ITEM:
				getHasReqItem().clear();
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
			case ApplicationPackage.API__BASE_ADDRESS:
				return BASE_ADDRESS_EDEFAULT == null ? baseAddress != null : !BASE_ADDRESS_EDEFAULT.equals(baseAddress);
			case ApplicationPackage.API__LINK_ADDRESS:
				return LINK_ADDRESS_EDEFAULT == null ? linkAddress != null : !LINK_ADDRESS_EDEFAULT.equals(linkAddress);
			case ApplicationPackage.API__HAS_RES_ITEM:
				return hasResItem != null && !hasResItem.isEmpty();
			case ApplicationPackage.API__HAS_REQ_ITEM:
				return hasReqItem != null && !hasReqItem.isEmpty();
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
		result.append(" (baseAddress: ");
		result.append(baseAddress);
		result.append(", linkAddress: ");
		result.append(linkAddress);
		result.append(')');
		return result.toString();
	}

} //ApiImpl
