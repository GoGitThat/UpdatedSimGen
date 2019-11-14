/**
 * generated by Xtext 2.18.0.M3
 */
package cs.queensu.ca.unity;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cs.queensu.ca.unity.GT#getLeft <em>Left</em>}</li>
 *   <li>{@link cs.queensu.ca.unity.GT#getRest <em>Rest</em>}</li>
 * </ul>
 *
 * @see cs.queensu.ca.unity.UnityPackage#getGT()
 * @model
 * @generated
 */
public interface GT extends Expression
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Expression)
   * @see cs.queensu.ca.unity.UnityPackage#getGT_Left()
   * @model containment="true"
   * @generated
   */
  Expression getLeft();

  /**
   * Sets the value of the '{@link cs.queensu.ca.unity.GT#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Expression value);

  /**
   * Returns the value of the '<em><b>Rest</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rest</em>' containment reference.
   * @see #setRest(Expression)
   * @see cs.queensu.ca.unity.UnityPackage#getGT_Rest()
   * @model containment="true"
   * @generated
   */
  Expression getRest();

  /**
   * Sets the value of the '{@link cs.queensu.ca.unity.GT#getRest <em>Rest</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rest</em>' containment reference.
   * @see #getRest()
   * @generated
   */
  void setRest(Expression value);

} // GT
