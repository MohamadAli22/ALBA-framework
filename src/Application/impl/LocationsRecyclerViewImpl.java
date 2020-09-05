/**
 */
package Application.impl;

import Application.ApplicationPackage;
import Application.CardView;
import Application.LocationsRecyclerView;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Locations Recycler View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Application.impl.LocationsRecyclerViewImpl#getHasCV <em>Has CV</em>}</li>
 *   <li>{@link Application.impl.LocationsRecyclerViewImpl#isIsVertical <em>Is Vertical</em>}</li>
 *   <li>{@link Application.impl.LocationsRecyclerViewImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocationsRecyclerViewImpl extends EObjectImpl implements LocationsRecyclerView {
	/**
	 * The cached value of the '{@link #getHasCV() <em>Has CV</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasCV()
	 * @generated
	 * @ordered
	 */
	protected CardView hasCV;

	/**
	 * The default value of the '{@link #isIsVertical() <em>Is Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsVertical()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_VERTICAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsVertical() <em>Is Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsVertical()
	 * @generated
	 * @ordered
	 */
	protected boolean isVertical = IS_VERTICAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationsRecyclerViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApplicationPackage.Literals.LOCATIONS_RECYCLER_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardView getHasCV() {
		return hasCV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasCV(CardView newHasCV, NotificationChain msgs) {
		CardView oldHasCV = hasCV;
		hasCV = newHasCV;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplicationPackage.LOCATIONS_RECYCLER_VIEW__HAS_CV, oldHasCV, newHasCV);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasCV(CardView newHasCV) {
		if (newHasCV != hasCV) {
			NotificationChain msgs = null;
			if (hasCV != null)
				msgs = ((InternalEObject)hasCV).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.LOCATIONS_RECYCLER_VIEW__HAS_CV, null, msgs);
			if (newHasCV != null)
				msgs = ((InternalEObject)newHasCV).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.LOCATIONS_RECYCLER_VIEW__HAS_CV, null, msgs);
			msgs = basicSetHasCV(newHasCV, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.LOCATIONS_RECYCLER_VIEW__HAS_CV, newHasCV, newHasCV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsVertical() {
		return isVertical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsVertical(boolean newIsVertical) {
		boolean oldIsVertical = isVertical;
		isVertical = newIsVertical;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.LOCATIONS_RECYCLER_VIEW__IS_VERTICAL, oldIsVertical, isVertical));
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.LOCATIONS_RECYCLER_VIEW__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApplicationPackage.LOCATIONS_RECYCLER_VIEW__HAS_CV:
				return basicSetHasCV(null, msgs);
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
			case ApplicationPackage.LOCATIONS_RECYCLER_VIEW__HAS_CV:
				return getHasCV();
			case ApplicationPackage.LOCATIONS_RECYCLER_VIEW__IS_VERTICAL:
				return isIsVertical();
			case ApplicationPackage.LOCATIONS_RECYCLER_VIEW__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ApplicationPackage.LOCATIONS_RECYCLER_VIEW__HAS_CV:
				setHasCV((CardView)newValue);
				return;
			case ApplicationPackage.LOCATIONS_RECYCLER_VIEW__IS_VERTICAL:
				setIsVertical((Boolean)newValue);
				return;
			case ApplicationPackage.LOCATIONS_RECYCLER_VIEW__NAME:
				setName((String)newValue);
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
			case ApplicationPackage.LOCATIONS_RECYCLER_VIEW__HAS_CV:
				setHasCV((CardView)null);
				return;
			case ApplicationPackage.LOCATIONS_RECYCLER_VIEW__IS_VERTICAL:
				setIsVertical(IS_VERTICAL_EDEFAULT);
				return;
			case ApplicationPackage.LOCATIONS_RECYCLER_VIEW__NAME:
				setName(NAME_EDEFAULT);
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
			case ApplicationPackage.LOCATIONS_RECYCLER_VIEW__HAS_CV:
				return hasCV != null;
			case ApplicationPackage.LOCATIONS_RECYCLER_VIEW__IS_VERTICAL:
				return isVertical != IS_VERTICAL_EDEFAULT;
			case ApplicationPackage.LOCATIONS_RECYCLER_VIEW__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (isVertical: ");
		result.append(isVertical);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //LocationsRecyclerViewImpl
