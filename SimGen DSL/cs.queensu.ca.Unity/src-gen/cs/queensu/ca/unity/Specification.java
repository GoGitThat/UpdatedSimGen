/**
 * generated by Xtext 2.18.0.M3
 */
package cs.queensu.ca.unity;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cs.queensu.ca.unity.Specification#getSpec <em>Spec</em>}</li>
 * </ul>
 *
 * @see cs.queensu.ca.unity.UnityPackage#getSpecification()
 * @model
 * @generated
 */
public interface Specification extends EObject
{
  /**
   * Returns the value of the '<em><b>Spec</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Spec</em>' containment reference list.
   * @see cs.queensu.ca.unity.UnityPackage#getSpecification_Spec()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getSpec();

} // Specification
