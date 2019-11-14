/**
 * generated by Xtext 2.18.0.M3
 */
package cs.queensu.ca.unity.impl;

import cs.queensu.ca.unity.AreaName;
import cs.queensu.ca.unity.Channel;
import cs.queensu.ca.unity.Instance;
import cs.queensu.ca.unity.Port;
import cs.queensu.ca.unity.QName;
import cs.queensu.ca.unity.UnityPackage;
import cs.queensu.ca.unity.interfaceType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Channel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cs.queensu.ca.unity.impl.ChannelImpl#getName <em>Name</em>}</li>
 *   <li>{@link cs.queensu.ca.unity.impl.ChannelImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link cs.queensu.ca.unity.impl.ChannelImpl#getType <em>Type</em>}</li>
 *   <li>{@link cs.queensu.ca.unity.impl.ChannelImpl#getPort <em>Port</em>}</li>
 *   <li>{@link cs.queensu.ca.unity.impl.ChannelImpl#getAreaname <em>Areaname</em>}</li>
 *   <li>{@link cs.queensu.ca.unity.impl.ChannelImpl#getQname <em>Qname</em>}</li>
 *   <li>{@link cs.queensu.ca.unity.impl.ChannelImpl#getBoundInstances <em>Bound Instances</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChannelImpl extends MinimalEObjectImpl.Container implements Channel
{
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
   * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDirection()
   * @generated
   * @ordered
   */
  protected static final String DIRECTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDirection()
   * @generated
   * @ordered
   */
  protected String direction = DIRECTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected interfaceType type;

  /**
   * The cached value of the '{@link #getPort() <em>Port</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPort()
   * @generated
   * @ordered
   */
  protected Port port;

  /**
   * The cached value of the '{@link #getAreaname() <em>Areaname</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAreaname()
   * @generated
   * @ordered
   */
  protected AreaName areaname;

  /**
   * The cached value of the '{@link #getQname() <em>Qname</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQname()
   * @generated
   * @ordered
   */
  protected QName qname;

  /**
   * The cached value of the '{@link #getBoundInstances() <em>Bound Instances</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBoundInstances()
   * @generated
   * @ordered
   */
  protected EList<Instance> boundInstances;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ChannelImpl()
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
    return UnityPackage.Literals.CHANNEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UnityPackage.CHANNEL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getDirection()
  {
    return direction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDirection(String newDirection)
  {
    String oldDirection = direction;
    direction = newDirection;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UnityPackage.CHANNEL__DIRECTION, oldDirection, direction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public interfaceType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(interfaceType newType, NotificationChain msgs)
  {
    interfaceType oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnityPackage.CHANNEL__TYPE, oldType, newType);
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
  public void setType(interfaceType newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnityPackage.CHANNEL__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnityPackage.CHANNEL__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UnityPackage.CHANNEL__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Port getPort()
  {
    return port;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPort(Port newPort, NotificationChain msgs)
  {
    Port oldPort = port;
    port = newPort;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnityPackage.CHANNEL__PORT, oldPort, newPort);
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
  public void setPort(Port newPort)
  {
    if (newPort != port)
    {
      NotificationChain msgs = null;
      if (port != null)
        msgs = ((InternalEObject)port).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnityPackage.CHANNEL__PORT, null, msgs);
      if (newPort != null)
        msgs = ((InternalEObject)newPort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnityPackage.CHANNEL__PORT, null, msgs);
      msgs = basicSetPort(newPort, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UnityPackage.CHANNEL__PORT, newPort, newPort));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AreaName getAreaname()
  {
    return areaname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAreaname(AreaName newAreaname, NotificationChain msgs)
  {
    AreaName oldAreaname = areaname;
    areaname = newAreaname;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnityPackage.CHANNEL__AREANAME, oldAreaname, newAreaname);
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
  public void setAreaname(AreaName newAreaname)
  {
    if (newAreaname != areaname)
    {
      NotificationChain msgs = null;
      if (areaname != null)
        msgs = ((InternalEObject)areaname).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnityPackage.CHANNEL__AREANAME, null, msgs);
      if (newAreaname != null)
        msgs = ((InternalEObject)newAreaname).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnityPackage.CHANNEL__AREANAME, null, msgs);
      msgs = basicSetAreaname(newAreaname, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UnityPackage.CHANNEL__AREANAME, newAreaname, newAreaname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public QName getQname()
  {
    return qname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetQname(QName newQname, NotificationChain msgs)
  {
    QName oldQname = qname;
    qname = newQname;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnityPackage.CHANNEL__QNAME, oldQname, newQname);
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
  public void setQname(QName newQname)
  {
    if (newQname != qname)
    {
      NotificationChain msgs = null;
      if (qname != null)
        msgs = ((InternalEObject)qname).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnityPackage.CHANNEL__QNAME, null, msgs);
      if (newQname != null)
        msgs = ((InternalEObject)newQname).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnityPackage.CHANNEL__QNAME, null, msgs);
      msgs = basicSetQname(newQname, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UnityPackage.CHANNEL__QNAME, newQname, newQname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Instance> getBoundInstances()
  {
    if (boundInstances == null)
    {
      boundInstances = new EObjectResolvingEList<Instance>(Instance.class, this, UnityPackage.CHANNEL__BOUND_INSTANCES);
    }
    return boundInstances;
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
      case UnityPackage.CHANNEL__TYPE:
        return basicSetType(null, msgs);
      case UnityPackage.CHANNEL__PORT:
        return basicSetPort(null, msgs);
      case UnityPackage.CHANNEL__AREANAME:
        return basicSetAreaname(null, msgs);
      case UnityPackage.CHANNEL__QNAME:
        return basicSetQname(null, msgs);
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
      case UnityPackage.CHANNEL__NAME:
        return getName();
      case UnityPackage.CHANNEL__DIRECTION:
        return getDirection();
      case UnityPackage.CHANNEL__TYPE:
        return getType();
      case UnityPackage.CHANNEL__PORT:
        return getPort();
      case UnityPackage.CHANNEL__AREANAME:
        return getAreaname();
      case UnityPackage.CHANNEL__QNAME:
        return getQname();
      case UnityPackage.CHANNEL__BOUND_INSTANCES:
        return getBoundInstances();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case UnityPackage.CHANNEL__NAME:
        setName((String)newValue);
        return;
      case UnityPackage.CHANNEL__DIRECTION:
        setDirection((String)newValue);
        return;
      case UnityPackage.CHANNEL__TYPE:
        setType((interfaceType)newValue);
        return;
      case UnityPackage.CHANNEL__PORT:
        setPort((Port)newValue);
        return;
      case UnityPackage.CHANNEL__AREANAME:
        setAreaname((AreaName)newValue);
        return;
      case UnityPackage.CHANNEL__QNAME:
        setQname((QName)newValue);
        return;
      case UnityPackage.CHANNEL__BOUND_INSTANCES:
        getBoundInstances().clear();
        getBoundInstances().addAll((Collection<? extends Instance>)newValue);
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
      case UnityPackage.CHANNEL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case UnityPackage.CHANNEL__DIRECTION:
        setDirection(DIRECTION_EDEFAULT);
        return;
      case UnityPackage.CHANNEL__TYPE:
        setType((interfaceType)null);
        return;
      case UnityPackage.CHANNEL__PORT:
        setPort((Port)null);
        return;
      case UnityPackage.CHANNEL__AREANAME:
        setAreaname((AreaName)null);
        return;
      case UnityPackage.CHANNEL__QNAME:
        setQname((QName)null);
        return;
      case UnityPackage.CHANNEL__BOUND_INSTANCES:
        getBoundInstances().clear();
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
      case UnityPackage.CHANNEL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case UnityPackage.CHANNEL__DIRECTION:
        return DIRECTION_EDEFAULT == null ? direction != null : !DIRECTION_EDEFAULT.equals(direction);
      case UnityPackage.CHANNEL__TYPE:
        return type != null;
      case UnityPackage.CHANNEL__PORT:
        return port != null;
      case UnityPackage.CHANNEL__AREANAME:
        return areaname != null;
      case UnityPackage.CHANNEL__QNAME:
        return qname != null;
      case UnityPackage.CHANNEL__BOUND_INSTANCES:
        return boundInstances != null && !boundInstances.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", direction: ");
    result.append(direction);
    result.append(')');
    return result.toString();
  }

} //ChannelImpl
