/**
 */
package Application.impl;

import Application.ApplicationPackage;
import Application.CardView;
import Application.CategoryFragment;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Category Fragment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Application.impl.CategoryFragmentImpl#getHasCardView <em>Has Card View</em>}</li>
 *   <li>{@link Application.impl.CategoryFragmentImpl#getColNumber <em>Col Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CategoryFragmentImpl extends FragmentImpl implements CategoryFragment {
	/**
	 * The cached value of the '{@link #getHasCardView() <em>Has Card View</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasCardView()
	 * @generated
	 * @ordered
	 */
	protected CardView hasCardView;

	/**
	 * The default value of the '{@link #getColNumber() <em>Col Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int COL_NUMBER_EDEFAULT = 2;

	/**
	 * The cached value of the '{@link #getColNumber() <em>Col Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColNumber()
	 * @generated
	 * @ordered
	 */
	protected int colNumber = COL_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CategoryFragmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApplicationPackage.Literals.CATEGORY_FRAGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardView getHasCardView() {
		return hasCardView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasCardView(CardView newHasCardView, NotificationChain msgs) {
		CardView oldHasCardView = hasCardView;
		hasCardView = newHasCardView;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplicationPackage.CATEGORY_FRAGMENT__HAS_CARD_VIEW, oldHasCardView, newHasCardView);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasCardView(CardView newHasCardView) {
		if (newHasCardView != hasCardView) {
			NotificationChain msgs = null;
			if (hasCardView != null)
				msgs = ((InternalEObject)hasCardView).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.CATEGORY_FRAGMENT__HAS_CARD_VIEW, null, msgs);
			if (newHasCardView != null)
				msgs = ((InternalEObject)newHasCardView).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.CATEGORY_FRAGMENT__HAS_CARD_VIEW, null, msgs);
			msgs = basicSetHasCardView(newHasCardView, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.CATEGORY_FRAGMENT__HAS_CARD_VIEW, newHasCardView, newHasCardView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getColNumber() {
		return colNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColNumber(int newColNumber) {
		int oldColNumber = colNumber;
		colNumber = newColNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.CATEGORY_FRAGMENT__COL_NUMBER, oldColNumber, colNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApplicationPackage.CATEGORY_FRAGMENT__HAS_CARD_VIEW:
				return basicSetHasCardView(null, msgs);
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
			case ApplicationPackage.CATEGORY_FRAGMENT__HAS_CARD_VIEW:
				return getHasCardView();
			case ApplicationPackage.CATEGORY_FRAGMENT__COL_NUMBER:
				return getColNumber();
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
			case ApplicationPackage.CATEGORY_FRAGMENT__HAS_CARD_VIEW:
				setHasCardView((CardView)newValue);
				return;
			case ApplicationPackage.CATEGORY_FRAGMENT__COL_NUMBER:
				setColNumber((Integer)newValue);
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
			case ApplicationPackage.CATEGORY_FRAGMENT__HAS_CARD_VIEW:
				setHasCardView((CardView)null);
				return;
			case ApplicationPackage.CATEGORY_FRAGMENT__COL_NUMBER:
				setColNumber(COL_NUMBER_EDEFAULT);
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
			case ApplicationPackage.CATEGORY_FRAGMENT__HAS_CARD_VIEW:
				return hasCardView != null;
			case ApplicationPackage.CATEGORY_FRAGMENT__COL_NUMBER:
				return colNumber != COL_NUMBER_EDEFAULT;
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
		result.append(" (colNumber: ");
		result.append(colNumber);
		result.append(')');
		return result.toString();
	}

} //CategoryFragmentImpl
