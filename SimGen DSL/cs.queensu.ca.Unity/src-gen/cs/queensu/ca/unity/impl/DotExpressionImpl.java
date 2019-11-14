/**
 * generated by Xtext 2.18.0.M3
 */
package cs.queensu.ca.unity.impl;

import cs.queensu.ca.unity.DotExpression;
import cs.queensu.ca.unity.Property;
import cs.queensu.ca.unity.Ref;
import cs.queensu.ca.unity.UnityPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dot Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cs.queensu.ca.unity.impl.DotExpressionImpl#getHead <em>Head</em>}</li>
 *   <li>{@link cs.queensu.ca.unity.impl.DotExpressionImpl#getTail <em>Tail</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DotExpressionImpl extends RefImpl implements DotExpression
{
  /**
   * The cached value of the '{@link #getHead() <em>Head</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHead()
   * @generated
   * @ordered
   */
  protected Ref head;

  /**
   * The cached value of the '{@link #getTail() <em>Tail</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTail()
   * @generated
   * @ordered
   */
  protected Property tail;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DotExpressionImpl()
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
    return UnityPackage.Literals.DOT_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Ref getHead()
  {
    return head;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHead(Ref newHead, NotificationChain msgs)
  {
    Ref oldHead = head;
    head = newHead;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnityPackage.DOT_EXPRESSION__HEAD, oldHead, newHead);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setHead(Ref newHead)
  {
    if (newHead != head)
    {
      NotificationChain msgs = null;
      if (head != null)
        msgs = ((InternalEObject)head).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnityPackage.DOT_EXPRESSION__HEAD, null, msgs);
      if (newHead != null)
        msgs = ((InternalEObject)newHead).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnityPackage.DOT_EXPRESSION__HEAD, null, msgs);
      msgs = basicSetHead(newHead, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UnityPackage.DOT_EXPRESSION__HEAD, newHead, newHead));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Property getTail()
  {
    if (tail != null && tail.eIsProxy())
    {
      InternalEObject oldTail = (InternalEObject)tail;
      tail = (Property)eResolveProxy(oldTail);
      if (tail != oldTail)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, UnityPackage.DOT_EXPRESSION__TAIL, oldTail, tail));
      }
    }
    return tail;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property basicGetTail()
  {
    return tail;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTail(Property newTail)
  {
    Property oldTail = tail;
    tail = newTail;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UnityPackage.DOT_EXPRESSION__TAIL, oldTail, tail));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case UnityPackage.DOT_EXPRESSION__HEAD:
        return basicSetHead(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case UnityPackage.DOT_EXPRESSION__HEAD:
        return getHead();
      case UnityPackage.DOT_EXPRESSION__TAIL:
        if (resolve) return getTail();
        return basicGetTail();
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
      case UnityPackage.DOT_EXPRESSION__HEAD:
        setHead((Ref)newValue);
        return;
      case UnityPackage.DOT_EXPRESSION__TAIL:
        setTail((Property)newValue);
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
      case UnityPackage.DOT_EXPRESSION__HEAD:
        setHead((Ref)null);
        return;
      case UnityPackage.DOT_EXPRESSION__TAIL:
        setTail((Property)null);
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
      case UnityPackage.DOT_EXPRESSION__HEAD:
        return head != null;
      case UnityPackage.DOT_EXPRESSION__TAIL:
        return tail != null;
    }
    return super.eIsSet(featureID);
  }

} //DotExpressionImpl
