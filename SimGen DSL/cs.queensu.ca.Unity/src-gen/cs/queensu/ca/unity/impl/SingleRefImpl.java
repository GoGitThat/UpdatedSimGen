/**
 * generated by Xtext 2.18.0.M3
 */
package cs.queensu.ca.unity.impl;

import cs.queensu.ca.unity.Property;
import cs.queensu.ca.unity.SingleRef;
import cs.queensu.ca.unity.UnityPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Single Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cs.queensu.ca.unity.impl.SingleRefImpl#getSingleRef <em>Single Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SingleRefImpl extends RefImpl implements SingleRef
{
  /**
   * The cached value of the '{@link #getSingleRef() <em>Single Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSingleRef()
   * @generated
   * @ordered
   */
  protected Property singleRef;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SingleRefImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return UnityPackage.Literals.SINGLE_REF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Property getSingleRef()
  {
    if (singleRef != null && singleRef.eIsProxy())
    {
      InternalEObject oldSingleRef = (InternalEObject)singleRef;
      singleRef = (Property)eResolveProxy(oldSingleRef);
      if (singleRef != oldSingleRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, UnityPackage.SINGLE_REF__SINGLE_REF, oldSingleRef, singleRef));
      }
    }
    return singleRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property basicGetSingleRef()
  {
    return singleRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSingleRef(Property newSingleRef)
  {
    Property oldSingleRef = singleRef;
    singleRef = newSingleRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UnityPackage.SINGLE_REF__SINGLE_REF, oldSingleRef, singleRef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case UnityPackage.SINGLE_REF__SINGLE_REF:
        if (resolve) return getSingleRef();
        return basicGetSingleRef();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case UnityPackage.SINGLE_REF__SINGLE_REF:
        setSingleRef((Property)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case UnityPackage.SINGLE_REF__SINGLE_REF:
        setSingleRef((Property)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case UnityPackage.SINGLE_REF__SINGLE_REF:
        return singleRef != null;
    }
    return super.eIsSet(featureID);
  }

} //SingleRefImpl
