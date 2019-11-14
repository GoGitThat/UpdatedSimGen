/**
 * generated by Xtext 2.18.0.M3
 */
package cs.queensu.ca.unity;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meta Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cs.queensu.ca.unity.MetaObject#getName <em>Name</em>}</li>
 *   <li>{@link cs.queensu.ca.unity.MetaObject#getKind <em>Kind</em>}</li>
 *   <li>{@link cs.queensu.ca.unity.MetaObject#getProperties <em>Properties</em>}</li>
 *   <li>{@link cs.queensu.ca.unity.MetaObject#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @see cs.queensu.ca.unity.UnityPackage#getMetaObject()
 * @model
 * @generated
 */
public interface MetaObject extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see cs.queensu.ca.unity.UnityPackage#getMetaObject_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link cs.queensu.ca.unity.MetaObject#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Kind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Kind</em>' attribute.
   * @see #setKind(String)
   * @see cs.queensu.ca.unity.UnityPackage#getMetaObject_Kind()
   * @model
   * @generated
   */
  String getKind();

  /**
   * Sets the value of the '{@link cs.queensu.ca.unity.MetaObject#getKind <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Kind</em>' attribute.
   * @see #getKind()
   * @generated
   */
  void setKind(String value);

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link cs.queensu.ca.unity.Attribute}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see cs.queensu.ca.unity.UnityPackage#getMetaObject_Properties()
   * @model containment="true"
   * @generated
   */
  EList<Attribute> getProperties();

  /**
   * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
   * The list contents are of type {@link cs.queensu.ca.unity.Action}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actions</em>' containment reference list.
   * @see cs.queensu.ca.unity.UnityPackage#getMetaObject_Actions()
   * @model containment="true"
   * @generated
   */
  EList<Action> getActions();

} // MetaObject
