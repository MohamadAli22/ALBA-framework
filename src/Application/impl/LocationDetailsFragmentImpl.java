/**
 */
package Application.impl;

import Application.ApplicationPackage;
import Application.LocationDetailsFragment;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Location Details Fragment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Application.impl.LocationDetailsFragmentImpl#isShowRatingOption <em>Show Rating Option</em>}</li>
 *   <li>{@link Application.impl.LocationDetailsFragmentImpl#isShowCommentOption <em>Show Comment Option</em>}</li>
 *   <li>{@link Application.impl.LocationDetailsFragmentImpl#isShowCallOption <em>Show Call Option</em>}</li>
 *   <li>{@link Application.impl.LocationDetailsFragmentImpl#isShowNavigationOption <em>Show Navigation Option</em>}</li>
 *   <li>{@link Application.impl.LocationDetailsFragmentImpl#isShowAddCommentOption <em>Show Add Comment Option</em>}</li>
 *   <li>{@link Application.impl.LocationDetailsFragmentImpl#isShowAddToBookmarkOption <em>Show Add To Bookmark Option</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocationDetailsFragmentImpl extends FragmentImpl implements LocationDetailsFragment {
	/**
	 * The default value of the '{@link #isShowRatingOption() <em>Show Rating Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowRatingOption()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_RATING_OPTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isShowRatingOption() <em>Show Rating Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowRatingOption()
	 * @generated
	 * @ordered
	 */
	protected boolean showRatingOption = SHOW_RATING_OPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isShowCommentOption() <em>Show Comment Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowCommentOption()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_COMMENT_OPTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isShowCommentOption() <em>Show Comment Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowCommentOption()
	 * @generated
	 * @ordered
	 */
	protected boolean showCommentOption = SHOW_COMMENT_OPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isShowCallOption() <em>Show Call Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowCallOption()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_CALL_OPTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isShowCallOption() <em>Show Call Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowCallOption()
	 * @generated
	 * @ordered
	 */
	protected boolean showCallOption = SHOW_CALL_OPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isShowNavigationOption() <em>Show Navigation Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowNavigationOption()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_NAVIGATION_OPTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isShowNavigationOption() <em>Show Navigation Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowNavigationOption()
	 * @generated
	 * @ordered
	 */
	protected boolean showNavigationOption = SHOW_NAVIGATION_OPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isShowAddCommentOption() <em>Show Add Comment Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowAddCommentOption()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_ADD_COMMENT_OPTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isShowAddCommentOption() <em>Show Add Comment Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowAddCommentOption()
	 * @generated
	 * @ordered
	 */
	protected boolean showAddCommentOption = SHOW_ADD_COMMENT_OPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isShowAddToBookmarkOption() <em>Show Add To Bookmark Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowAddToBookmarkOption()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_ADD_TO_BOOKMARK_OPTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isShowAddToBookmarkOption() <em>Show Add To Bookmark Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowAddToBookmarkOption()
	 * @generated
	 * @ordered
	 */
	protected boolean showAddToBookmarkOption = SHOW_ADD_TO_BOOKMARK_OPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationDetailsFragmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApplicationPackage.Literals.LOCATION_DETAILS_FRAGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isShowRatingOption() {
		return showRatingOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowRatingOption(boolean newShowRatingOption) {
		boolean oldShowRatingOption = showRatingOption;
		showRatingOption = newShowRatingOption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.LOCATION_DETAILS_FRAGMENT__SHOW_RATING_OPTION, oldShowRatingOption, showRatingOption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isShowCommentOption() {
		return showCommentOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowCommentOption(boolean newShowCommentOption) {
		boolean oldShowCommentOption = showCommentOption;
		showCommentOption = newShowCommentOption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.LOCATION_DETAILS_FRAGMENT__SHOW_COMMENT_OPTION, oldShowCommentOption, showCommentOption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isShowCallOption() {
		return showCallOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowCallOption(boolean newShowCallOption) {
		boolean oldShowCallOption = showCallOption;
		showCallOption = newShowCallOption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.LOCATION_DETAILS_FRAGMENT__SHOW_CALL_OPTION, oldShowCallOption, showCallOption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isShowNavigationOption() {
		return showNavigationOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowNavigationOption(boolean newShowNavigationOption) {
		boolean oldShowNavigationOption = showNavigationOption;
		showNavigationOption = newShowNavigationOption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.LOCATION_DETAILS_FRAGMENT__SHOW_NAVIGATION_OPTION, oldShowNavigationOption, showNavigationOption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isShowAddCommentOption() {
		return showAddCommentOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowAddCommentOption(boolean newShowAddCommentOption) {
		boolean oldShowAddCommentOption = showAddCommentOption;
		showAddCommentOption = newShowAddCommentOption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.LOCATION_DETAILS_FRAGMENT__SHOW_ADD_COMMENT_OPTION, oldShowAddCommentOption, showAddCommentOption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isShowAddToBookmarkOption() {
		return showAddToBookmarkOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowAddToBookmarkOption(boolean newShowAddToBookmarkOption) {
		boolean oldShowAddToBookmarkOption = showAddToBookmarkOption;
		showAddToBookmarkOption = newShowAddToBookmarkOption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.LOCATION_DETAILS_FRAGMENT__SHOW_ADD_TO_BOOKMARK_OPTION, oldShowAddToBookmarkOption, showAddToBookmarkOption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApplicationPackage.LOCATION_DETAILS_FRAGMENT__SHOW_RATING_OPTION:
				return isShowRatingOption();
			case ApplicationPackage.LOCATION_DETAILS_FRAGMENT__SHOW_COMMENT_OPTION:
				return isShowCommentOption();
			case ApplicationPackage.LOCATION_DETAILS_FRAGMENT__SHOW_CALL_OPTION:
				return isShowCallOption();
			case ApplicationPackage.LOCATION_DETAILS_FRAGMENT__SHOW_NAVIGATION_OPTION:
				return isShowNavigationOption();
			case ApplicationPackage.LOCATION_DETAILS_FRAGMENT__SHOW_ADD_COMMENT_OPTION:
				return isShowAddCommentOption();
			case ApplicationPackage.LOCATION_DETAILS_FRAGMENT__SHOW_ADD_TO_BOOKMARK_OPTION:
				return isShowAddToBookmarkOption();
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
			case ApplicationPackage.LOCATION_DETAILS_FRAGMENT__SHOW_RATING_OPTION:
				setShowRatingOption((Boolean)newValue);
				return;
			case ApplicationPackage.LOCATION_DETAILS_FRAGMENT__SHOW_COMMENT_OPTION:
				setShowCommentOption((Boolean)newValue);
				return;
			case ApplicationPackage.LOCATION_DETAILS_FRAGMENT__SHOW_CALL_OPTION:
				setShowCallOption((Boolean)newValue);
				return;
			case ApplicationPackage.LOCATION_DETAILS_FRAGMENT__SHOW_NAVIGATION_OPTION:
				setShowNavigationOption((Boolean)newValue);
				return;
			case ApplicationPackage.LOCATION_DETAILS_FRAGMENT__SHOW_ADD_COMMENT_OPTION:
				setShowAddCommentOption((Boolean)newValue);
				return;
			case ApplicationPackage.LOCATION_DETAILS_FRAGMENT__SHOW_ADD_TO_BOOKMARK_OPTION:
				setShowAddToBookmarkOption((Boolean)newValue);
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
			case ApplicationPackage.LOCATION_DETAILS_FRAGMENT__SHOW_RATING_OPTION:
				setShowRatingOption(SHOW_RATING_OPTION_EDEFAULT);
				return;
			case ApplicationPackage.LOCATION_DETAILS_FRAGMENT__SHOW_COMMENT_OPTION:
				setShowCommentOption(SHOW_COMMENT_OPTION_EDEFAULT);
				return;
			case ApplicationPackage.LOCATION_DETAILS_FRAGMENT__SHOW_CALL_OPTION:
				setShowCallOption(SHOW_CALL_OPTION_EDEFAULT);
				return;
			case ApplicationPackage.LOCATION_DETAILS_FRAGMENT__SHOW_NAVIGATION_OPTION:
				setShowNavigationOption(SHOW_NAVIGATION_OPTION_EDEFAULT);
				return;
			case ApplicationPackage.LOCATION_DETAILS_FRAGMENT__SHOW_ADD_COMMENT_OPTION:
				setShowAddCommentOption(SHOW_ADD_COMMENT_OPTION_EDEFAULT);
				return;
			case ApplicationPackage.LOCATION_DETAILS_FRAGMENT__SHOW_ADD_TO_BOOKMARK_OPTION:
				setShowAddToBookmarkOption(SHOW_ADD_TO_BOOKMARK_OPTION_EDEFAULT);
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
			case ApplicationPackage.LOCATION_DETAILS_FRAGMENT__SHOW_RATING_OPTION:
				return showRatingOption != SHOW_RATING_OPTION_EDEFAULT;
			case ApplicationPackage.LOCATION_DETAILS_FRAGMENT__SHOW_COMMENT_OPTION:
				return showCommentOption != SHOW_COMMENT_OPTION_EDEFAULT;
			case ApplicationPackage.LOCATION_DETAILS_FRAGMENT__SHOW_CALL_OPTION:
				return showCallOption != SHOW_CALL_OPTION_EDEFAULT;
			case ApplicationPackage.LOCATION_DETAILS_FRAGMENT__SHOW_NAVIGATION_OPTION:
				return showNavigationOption != SHOW_NAVIGATION_OPTION_EDEFAULT;
			case ApplicationPackage.LOCATION_DETAILS_FRAGMENT__SHOW_ADD_COMMENT_OPTION:
				return showAddCommentOption != SHOW_ADD_COMMENT_OPTION_EDEFAULT;
			case ApplicationPackage.LOCATION_DETAILS_FRAGMENT__SHOW_ADD_TO_BOOKMARK_OPTION:
				return showAddToBookmarkOption != SHOW_ADD_TO_BOOKMARK_OPTION_EDEFAULT;
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
		result.append(" (showRatingOption: ");
		result.append(showRatingOption);
		result.append(", showCommentOption: ");
		result.append(showCommentOption);
		result.append(", showCallOption: ");
		result.append(showCallOption);
		result.append(", showNavigationOption: ");
		result.append(showNavigationOption);
		result.append(", showAddCommentOption: ");
		result.append(showAddCommentOption);
		result.append(", showAddToBookmarkOption: ");
		result.append(showAddToBookmarkOption);
		result.append(')');
		return result.toString();
	}

} //LocationDetailsFragmentImpl
