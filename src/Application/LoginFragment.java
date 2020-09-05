/**
 */
package Application;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Login Fragment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Application.LoginFragment#isGenerateEmailValidationCode <em>Generate Email Validation Code</em>}</li>
 *   <li>{@link Application.LoginFragment#isGeneratePhoneNumberValidationCode <em>Generate Phone Number Validation Code</em>}</li>
 * </ul>
 *
 * @see Application.ApplicationPackage#getLoginFragment()
 * @model
 * @generated
 */
public interface LoginFragment extends Fragment {
	/**
	 * Returns the value of the '<em><b>Generate Email Validation Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generate Email Validation Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generate Email Validation Code</em>' attribute.
	 * @see #setGenerateEmailValidationCode(boolean)
	 * @see Application.ApplicationPackage#getLoginFragment_GenerateEmailValidationCode()
	 * @model
	 * @generated
	 */
	boolean isGenerateEmailValidationCode();

	/**
	 * Sets the value of the '{@link Application.LoginFragment#isGenerateEmailValidationCode <em>Generate Email Validation Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generate Email Validation Code</em>' attribute.
	 * @see #isGenerateEmailValidationCode()
	 * @generated
	 */
	void setGenerateEmailValidationCode(boolean value);

	/**
	 * Returns the value of the '<em><b>Generate Phone Number Validation Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generate Phone Number Validation Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generate Phone Number Validation Code</em>' attribute.
	 * @see #setGeneratePhoneNumberValidationCode(boolean)
	 * @see Application.ApplicationPackage#getLoginFragment_GeneratePhoneNumberValidationCode()
	 * @model
	 * @generated
	 */
	boolean isGeneratePhoneNumberValidationCode();

	/**
	 * Sets the value of the '{@link Application.LoginFragment#isGeneratePhoneNumberValidationCode <em>Generate Phone Number Validation Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generate Phone Number Validation Code</em>' attribute.
	 * @see #isGeneratePhoneNumberValidationCode()
	 * @generated
	 */
	void setGeneratePhoneNumberValidationCode(boolean value);

} // LoginFragment
