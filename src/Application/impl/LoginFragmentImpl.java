/**
 */
package Application.impl;

import Application.ApplicationPackage;
import Application.LoginFragment;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Login Fragment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Application.impl.LoginFragmentImpl#isGenerateEmailValidationCode <em>Generate Email Validation Code</em>}</li>
 *   <li>{@link Application.impl.LoginFragmentImpl#isGeneratePhoneNumberValidationCode <em>Generate Phone Number Validation Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoginFragmentImpl extends FragmentImpl implements LoginFragment {
	/**
	 * The default value of the '{@link #isGenerateEmailValidationCode() <em>Generate Email Validation Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateEmailValidationCode()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATE_EMAIL_VALIDATION_CODE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGenerateEmailValidationCode() <em>Generate Email Validation Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateEmailValidationCode()
	 * @generated
	 * @ordered
	 */
	protected boolean generateEmailValidationCode = GENERATE_EMAIL_VALIDATION_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #isGeneratePhoneNumberValidationCode() <em>Generate Phone Number Validation Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGeneratePhoneNumberValidationCode()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATE_PHONE_NUMBER_VALIDATION_CODE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGeneratePhoneNumberValidationCode() <em>Generate Phone Number Validation Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGeneratePhoneNumberValidationCode()
	 * @generated
	 * @ordered
	 */
	protected boolean generatePhoneNumberValidationCode = GENERATE_PHONE_NUMBER_VALIDATION_CODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoginFragmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApplicationPackage.Literals.LOGIN_FRAGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGenerateEmailValidationCode() {
		return generateEmailValidationCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerateEmailValidationCode(boolean newGenerateEmailValidationCode) {
		boolean oldGenerateEmailValidationCode = generateEmailValidationCode;
		generateEmailValidationCode = newGenerateEmailValidationCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.LOGIN_FRAGMENT__GENERATE_EMAIL_VALIDATION_CODE, oldGenerateEmailValidationCode, generateEmailValidationCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGeneratePhoneNumberValidationCode() {
		return generatePhoneNumberValidationCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneratePhoneNumberValidationCode(boolean newGeneratePhoneNumberValidationCode) {
		boolean oldGeneratePhoneNumberValidationCode = generatePhoneNumberValidationCode;
		generatePhoneNumberValidationCode = newGeneratePhoneNumberValidationCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.LOGIN_FRAGMENT__GENERATE_PHONE_NUMBER_VALIDATION_CODE, oldGeneratePhoneNumberValidationCode, generatePhoneNumberValidationCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApplicationPackage.LOGIN_FRAGMENT__GENERATE_EMAIL_VALIDATION_CODE:
				return isGenerateEmailValidationCode();
			case ApplicationPackage.LOGIN_FRAGMENT__GENERATE_PHONE_NUMBER_VALIDATION_CODE:
				return isGeneratePhoneNumberValidationCode();
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
			case ApplicationPackage.LOGIN_FRAGMENT__GENERATE_EMAIL_VALIDATION_CODE:
				setGenerateEmailValidationCode((Boolean)newValue);
				return;
			case ApplicationPackage.LOGIN_FRAGMENT__GENERATE_PHONE_NUMBER_VALIDATION_CODE:
				setGeneratePhoneNumberValidationCode((Boolean)newValue);
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
			case ApplicationPackage.LOGIN_FRAGMENT__GENERATE_EMAIL_VALIDATION_CODE:
				setGenerateEmailValidationCode(GENERATE_EMAIL_VALIDATION_CODE_EDEFAULT);
				return;
			case ApplicationPackage.LOGIN_FRAGMENT__GENERATE_PHONE_NUMBER_VALIDATION_CODE:
				setGeneratePhoneNumberValidationCode(GENERATE_PHONE_NUMBER_VALIDATION_CODE_EDEFAULT);
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
			case ApplicationPackage.LOGIN_FRAGMENT__GENERATE_EMAIL_VALIDATION_CODE:
				return generateEmailValidationCode != GENERATE_EMAIL_VALIDATION_CODE_EDEFAULT;
			case ApplicationPackage.LOGIN_FRAGMENT__GENERATE_PHONE_NUMBER_VALIDATION_CODE:
				return generatePhoneNumberValidationCode != GENERATE_PHONE_NUMBER_VALIDATION_CODE_EDEFAULT;
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
		result.append(" (generateEmailValidationCode: ");
		result.append(generateEmailValidationCode);
		result.append(", generatePhoneNumberValidationCode: ");
		result.append(generatePhoneNumberValidationCode);
		result.append(')');
		return result.toString();
	}

} //LoginFragmentImpl
