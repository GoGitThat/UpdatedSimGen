/**
 * generated by Xtext 2.18.0.M3
 */
package cs.queensu.ca.unity.impl;

import cs.queensu.ca.unity.Author;
import cs.queensu.ca.unity.Channel;
import cs.queensu.ca.unity.ENV;
import cs.queensu.ca.unity.Focus;
import cs.queensu.ca.unity.Init;
import cs.queensu.ca.unity.Instance;
import cs.queensu.ca.unity.Map;
import cs.queensu.ca.unity.Property;
import cs.queensu.ca.unity.Purpose;
import cs.queensu.ca.unity.Rotate;
import cs.queensu.ca.unity.Settings;
import cs.queensu.ca.unity.UnityPackage;
import cs.queensu.ca.unity.autoBuilding;
import cs.queensu.ca.unity.projectPath;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ENV</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cs.queensu.ca.unity.impl.ENVImpl#getName <em>Name</em>}</li>
 *   <li>{@link cs.queensu.ca.unity.impl.ENVImpl#getChannels <em>Channels</em>}</li>
 *   <li>{@link cs.queensu.ca.unity.impl.ENVImpl#getMaps <em>Maps</em>}</li>
 *   <li>{@link cs.queensu.ca.unity.impl.ENVImpl#getInstances <em>Instances</em>}</li>
 *   <li>{@link cs.queensu.ca.unity.impl.ENVImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link cs.queensu.ca.unity.impl.ENVImpl#getInitCodes <em>Init Codes</em>}</li>
 *   <li>{@link cs.queensu.ca.unity.impl.ENVImpl#getFocus <em>Focus</em>}</li>
 *   <li>{@link cs.queensu.ca.unity.impl.ENVImpl#getRotate <em>Rotate</em>}</li>
 *   <li>{@link cs.queensu.ca.unity.impl.ENVImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link cs.queensu.ca.unity.impl.ENVImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link cs.queensu.ca.unity.impl.ENVImpl#getProjectpath <em>Projectpath</em>}</li>
 *   <li>{@link cs.queensu.ca.unity.impl.ENVImpl#getSettings <em>Settings</em>}</li>
 *   <li>{@link cs.queensu.ca.unity.impl.ENVImpl#getAutoBuild <em>Auto Build</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ENVImpl extends MinimalEObjectImpl.Container implements ENV
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
   * The cached value of the '{@link #getChannels() <em>Channels</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChannels()
   * @generated
   * @ordered
   */
  protected EList<Channel> channels;

  /**
   * The cached value of the '{@link #getMaps() <em>Maps</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaps()
   * @generated
   * @ordered
   */
  protected EList<Map> maps;

  /**
   * The cached value of the '{@link #getInstances() <em>Instances</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstances()
   * @generated
   * @ordered
   */
  protected EList<Instance> instances;

  /**
   * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperties()
   * @generated
   * @ordered
   */
  protected EList<Property> properties;

  /**
   * The cached value of the '{@link #getInitCodes() <em>Init Codes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitCodes()
   * @generated
   * @ordered
   */
  protected Init initCodes;

  /**
   * The cached value of the '{@link #getFocus() <em>Focus</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFocus()
   * @generated
   * @ordered
   */
  protected Focus focus;

  /**
   * The cached value of the '{@link #getRotate() <em>Rotate</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRotate()
   * @generated
   * @ordered
   */
  protected Rotate rotate;

  /**
   * The cached value of the '{@link #getAuthor() <em>Author</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAuthor()
   * @generated
   * @ordered
   */
  protected Author author;

  /**
   * The cached value of the '{@link #getPurpose() <em>Purpose</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPurpose()
   * @generated
   * @ordered
   */
  protected Purpose purpose;

  /**
   * The cached value of the '{@link #getProjectpath() <em>Projectpath</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProjectpath()
   * @generated
   * @ordered
   */
  protected projectPath projectpath;

  /**
   * The cached value of the '{@link #getSettings() <em>Settings</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSettings()
   * @generated
   * @ordered
   */
  protected Settings settings;

  /**
   * The cached value of the '{@link #getAutoBuild() <em>Auto Build</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAutoBuild()
   * @generated
   * @ordered
   */
  protected autoBuilding autoBuild;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ENVImpl()
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
    return UnityPackage.Literals.ENV;
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
      eNotify(new ENotificationImpl(this, Notification.SET, UnityPackage.ENV__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Channel> getChannels()
  {
    if (channels == null)
    {
      channels = new EObjectContainmentEList<Channel>(Channel.class, this, UnityPackage.ENV__CHANNELS);
    }
    return channels;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Map> getMaps()
  {
    if (maps == null)
    {
      maps = new EObjectContainmentEList<Map>(Map.class, this, UnityPackage.ENV__MAPS);
    }
    return maps;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Instance> getInstances()
  {
    if (instances == null)
    {
      instances = new EObjectContainmentEList<Instance>(Instance.class, this, UnityPackage.ENV__INSTANCES);
    }
    return instances;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Property> getProperties()
  {
    if (properties == null)
    {
      properties = new EObjectContainmentEList<Property>(Property.class, this, UnityPackage.ENV__PROPERTIES);
    }
    return properties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Init getInitCodes()
  {
    return initCodes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInitCodes(Init newInitCodes, NotificationChain msgs)
  {
    Init oldInitCodes = initCodes;
    initCodes = newInitCodes;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnityPackage.ENV__INIT_CODES, oldInitCodes, newInitCodes);
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
  public void setInitCodes(Init newInitCodes)
  {
    if (newInitCodes != initCodes)
    {
      NotificationChain msgs = null;
      if (initCodes != null)
        msgs = ((InternalEObject)initCodes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnityPackage.ENV__INIT_CODES, null, msgs);
      if (newInitCodes != null)
        msgs = ((InternalEObject)newInitCodes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnityPackage.ENV__INIT_CODES, null, msgs);
      msgs = basicSetInitCodes(newInitCodes, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UnityPackage.ENV__INIT_CODES, newInitCodes, newInitCodes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Focus getFocus()
  {
    return focus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFocus(Focus newFocus, NotificationChain msgs)
  {
    Focus oldFocus = focus;
    focus = newFocus;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnityPackage.ENV__FOCUS, oldFocus, newFocus);
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
  public void setFocus(Focus newFocus)
  {
    if (newFocus != focus)
    {
      NotificationChain msgs = null;
      if (focus != null)
        msgs = ((InternalEObject)focus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnityPackage.ENV__FOCUS, null, msgs);
      if (newFocus != null)
        msgs = ((InternalEObject)newFocus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnityPackage.ENV__FOCUS, null, msgs);
      msgs = basicSetFocus(newFocus, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UnityPackage.ENV__FOCUS, newFocus, newFocus));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Rotate getRotate()
  {
    return rotate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRotate(Rotate newRotate, NotificationChain msgs)
  {
    Rotate oldRotate = rotate;
    rotate = newRotate;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnityPackage.ENV__ROTATE, oldRotate, newRotate);
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
  public void setRotate(Rotate newRotate)
  {
    if (newRotate != rotate)
    {
      NotificationChain msgs = null;
      if (rotate != null)
        msgs = ((InternalEObject)rotate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnityPackage.ENV__ROTATE, null, msgs);
      if (newRotate != null)
        msgs = ((InternalEObject)newRotate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnityPackage.ENV__ROTATE, null, msgs);
      msgs = basicSetRotate(newRotate, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UnityPackage.ENV__ROTATE, newRotate, newRotate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Author getAuthor()
  {
    return author;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAuthor(Author newAuthor, NotificationChain msgs)
  {
    Author oldAuthor = author;
    author = newAuthor;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnityPackage.ENV__AUTHOR, oldAuthor, newAuthor);
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
  public void setAuthor(Author newAuthor)
  {
    if (newAuthor != author)
    {
      NotificationChain msgs = null;
      if (author != null)
        msgs = ((InternalEObject)author).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnityPackage.ENV__AUTHOR, null, msgs);
      if (newAuthor != null)
        msgs = ((InternalEObject)newAuthor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnityPackage.ENV__AUTHOR, null, msgs);
      msgs = basicSetAuthor(newAuthor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UnityPackage.ENV__AUTHOR, newAuthor, newAuthor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Purpose getPurpose()
  {
    return purpose;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPurpose(Purpose newPurpose, NotificationChain msgs)
  {
    Purpose oldPurpose = purpose;
    purpose = newPurpose;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnityPackage.ENV__PURPOSE, oldPurpose, newPurpose);
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
  public void setPurpose(Purpose newPurpose)
  {
    if (newPurpose != purpose)
    {
      NotificationChain msgs = null;
      if (purpose != null)
        msgs = ((InternalEObject)purpose).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnityPackage.ENV__PURPOSE, null, msgs);
      if (newPurpose != null)
        msgs = ((InternalEObject)newPurpose).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnityPackage.ENV__PURPOSE, null, msgs);
      msgs = basicSetPurpose(newPurpose, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UnityPackage.ENV__PURPOSE, newPurpose, newPurpose));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public projectPath getProjectpath()
  {
    return projectpath;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProjectpath(projectPath newProjectpath, NotificationChain msgs)
  {
    projectPath oldProjectpath = projectpath;
    projectpath = newProjectpath;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnityPackage.ENV__PROJECTPATH, oldProjectpath, newProjectpath);
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
  public void setProjectpath(projectPath newProjectpath)
  {
    if (newProjectpath != projectpath)
    {
      NotificationChain msgs = null;
      if (projectpath != null)
        msgs = ((InternalEObject)projectpath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnityPackage.ENV__PROJECTPATH, null, msgs);
      if (newProjectpath != null)
        msgs = ((InternalEObject)newProjectpath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnityPackage.ENV__PROJECTPATH, null, msgs);
      msgs = basicSetProjectpath(newProjectpath, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UnityPackage.ENV__PROJECTPATH, newProjectpath, newProjectpath));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Settings getSettings()
  {
    return settings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSettings(Settings newSettings, NotificationChain msgs)
  {
    Settings oldSettings = settings;
    settings = newSettings;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnityPackage.ENV__SETTINGS, oldSettings, newSettings);
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
  public void setSettings(Settings newSettings)
  {
    if (newSettings != settings)
    {
      NotificationChain msgs = null;
      if (settings != null)
        msgs = ((InternalEObject)settings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnityPackage.ENV__SETTINGS, null, msgs);
      if (newSettings != null)
        msgs = ((InternalEObject)newSettings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnityPackage.ENV__SETTINGS, null, msgs);
      msgs = basicSetSettings(newSettings, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UnityPackage.ENV__SETTINGS, newSettings, newSettings));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public autoBuilding getAutoBuild()
  {
    return autoBuild;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAutoBuild(autoBuilding newAutoBuild, NotificationChain msgs)
  {
    autoBuilding oldAutoBuild = autoBuild;
    autoBuild = newAutoBuild;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnityPackage.ENV__AUTO_BUILD, oldAutoBuild, newAutoBuild);
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
  public void setAutoBuild(autoBuilding newAutoBuild)
  {
    if (newAutoBuild != autoBuild)
    {
      NotificationChain msgs = null;
      if (autoBuild != null)
        msgs = ((InternalEObject)autoBuild).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnityPackage.ENV__AUTO_BUILD, null, msgs);
      if (newAutoBuild != null)
        msgs = ((InternalEObject)newAutoBuild).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnityPackage.ENV__AUTO_BUILD, null, msgs);
      msgs = basicSetAutoBuild(newAutoBuild, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UnityPackage.ENV__AUTO_BUILD, newAutoBuild, newAutoBuild));
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
      case UnityPackage.ENV__CHANNELS:
        return ((InternalEList<?>)getChannels()).basicRemove(otherEnd, msgs);
      case UnityPackage.ENV__MAPS:
        return ((InternalEList<?>)getMaps()).basicRemove(otherEnd, msgs);
      case UnityPackage.ENV__INSTANCES:
        return ((InternalEList<?>)getInstances()).basicRemove(otherEnd, msgs);
      case UnityPackage.ENV__PROPERTIES:
        return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
      case UnityPackage.ENV__INIT_CODES:
        return basicSetInitCodes(null, msgs);
      case UnityPackage.ENV__FOCUS:
        return basicSetFocus(null, msgs);
      case UnityPackage.ENV__ROTATE:
        return basicSetRotate(null, msgs);
      case UnityPackage.ENV__AUTHOR:
        return basicSetAuthor(null, msgs);
      case UnityPackage.ENV__PURPOSE:
        return basicSetPurpose(null, msgs);
      case UnityPackage.ENV__PROJECTPATH:
        return basicSetProjectpath(null, msgs);
      case UnityPackage.ENV__SETTINGS:
        return basicSetSettings(null, msgs);
      case UnityPackage.ENV__AUTO_BUILD:
        return basicSetAutoBuild(null, msgs);
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
      case UnityPackage.ENV__NAME:
        return getName();
      case UnityPackage.ENV__CHANNELS:
        return getChannels();
      case UnityPackage.ENV__MAPS:
        return getMaps();
      case UnityPackage.ENV__INSTANCES:
        return getInstances();
      case UnityPackage.ENV__PROPERTIES:
        return getProperties();
      case UnityPackage.ENV__INIT_CODES:
        return getInitCodes();
      case UnityPackage.ENV__FOCUS:
        return getFocus();
      case UnityPackage.ENV__ROTATE:
        return getRotate();
      case UnityPackage.ENV__AUTHOR:
        return getAuthor();
      case UnityPackage.ENV__PURPOSE:
        return getPurpose();
      case UnityPackage.ENV__PROJECTPATH:
        return getProjectpath();
      case UnityPackage.ENV__SETTINGS:
        return getSettings();
      case UnityPackage.ENV__AUTO_BUILD:
        return getAutoBuild();
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
      case UnityPackage.ENV__NAME:
        setName((String)newValue);
        return;
      case UnityPackage.ENV__CHANNELS:
        getChannels().clear();
        getChannels().addAll((Collection<? extends Channel>)newValue);
        return;
      case UnityPackage.ENV__MAPS:
        getMaps().clear();
        getMaps().addAll((Collection<? extends Map>)newValue);
        return;
      case UnityPackage.ENV__INSTANCES:
        getInstances().clear();
        getInstances().addAll((Collection<? extends Instance>)newValue);
        return;
      case UnityPackage.ENV__PROPERTIES:
        getProperties().clear();
        getProperties().addAll((Collection<? extends Property>)newValue);
        return;
      case UnityPackage.ENV__INIT_CODES:
        setInitCodes((Init)newValue);
        return;
      case UnityPackage.ENV__FOCUS:
        setFocus((Focus)newValue);
        return;
      case UnityPackage.ENV__ROTATE:
        setRotate((Rotate)newValue);
        return;
      case UnityPackage.ENV__AUTHOR:
        setAuthor((Author)newValue);
        return;
      case UnityPackage.ENV__PURPOSE:
        setPurpose((Purpose)newValue);
        return;
      case UnityPackage.ENV__PROJECTPATH:
        setProjectpath((projectPath)newValue);
        return;
      case UnityPackage.ENV__SETTINGS:
        setSettings((Settings)newValue);
        return;
      case UnityPackage.ENV__AUTO_BUILD:
        setAutoBuild((autoBuilding)newValue);
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
      case UnityPackage.ENV__NAME:
        setName(NAME_EDEFAULT);
        return;
      case UnityPackage.ENV__CHANNELS:
        getChannels().clear();
        return;
      case UnityPackage.ENV__MAPS:
        getMaps().clear();
        return;
      case UnityPackage.ENV__INSTANCES:
        getInstances().clear();
        return;
      case UnityPackage.ENV__PROPERTIES:
        getProperties().clear();
        return;
      case UnityPackage.ENV__INIT_CODES:
        setInitCodes((Init)null);
        return;
      case UnityPackage.ENV__FOCUS:
        setFocus((Focus)null);
        return;
      case UnityPackage.ENV__ROTATE:
        setRotate((Rotate)null);
        return;
      case UnityPackage.ENV__AUTHOR:
        setAuthor((Author)null);
        return;
      case UnityPackage.ENV__PURPOSE:
        setPurpose((Purpose)null);
        return;
      case UnityPackage.ENV__PROJECTPATH:
        setProjectpath((projectPath)null);
        return;
      case UnityPackage.ENV__SETTINGS:
        setSettings((Settings)null);
        return;
      case UnityPackage.ENV__AUTO_BUILD:
        setAutoBuild((autoBuilding)null);
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
      case UnityPackage.ENV__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case UnityPackage.ENV__CHANNELS:
        return channels != null && !channels.isEmpty();
      case UnityPackage.ENV__MAPS:
        return maps != null && !maps.isEmpty();
      case UnityPackage.ENV__INSTANCES:
        return instances != null && !instances.isEmpty();
      case UnityPackage.ENV__PROPERTIES:
        return properties != null && !properties.isEmpty();
      case UnityPackage.ENV__INIT_CODES:
        return initCodes != null;
      case UnityPackage.ENV__FOCUS:
        return focus != null;
      case UnityPackage.ENV__ROTATE:
        return rotate != null;
      case UnityPackage.ENV__AUTHOR:
        return author != null;
      case UnityPackage.ENV__PURPOSE:
        return purpose != null;
      case UnityPackage.ENV__PROJECTPATH:
        return projectpath != null;
      case UnityPackage.ENV__SETTINGS:
        return settings != null;
      case UnityPackage.ENV__AUTO_BUILD:
        return autoBuild != null;
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
    result.append(')');
    return result.toString();
  }

} //ENVImpl