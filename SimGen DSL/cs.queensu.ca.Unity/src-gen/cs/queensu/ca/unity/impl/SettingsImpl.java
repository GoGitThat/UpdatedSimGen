/**
 * generated by Xtext 2.18.0.M3
 */
package cs.queensu.ca.unity.impl;

import cs.queensu.ca.unity.Settings;
import cs.queensu.ca.unity.UnityPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Settings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cs.queensu.ca.unity.impl.SettingsImpl#getSettingsFilename <em>Settings Filename</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SettingsImpl extends MinimalEObjectImpl.Container implements Settings
{
  /**
   * The default value of the '{@link #getSettingsFilename() <em>Settings Filename</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSettingsFilename()
   * @generated
   * @ordered
   */
  protected static final String SETTINGS_FILENAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSettingsFilename() <em>Settings Filename</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSettingsFilename()
   * @generated
   * @ordered
   */
  protected String settingsFilename = SETTINGS_FILENAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SettingsImpl()
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
    return UnityPackage.Literals.SETTINGS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getSettingsFilename()
  {
    return settingsFilename;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSettingsFilename(String newSettingsFilename)
  {
    String oldSettingsFilename = settingsFilename;
    settingsFilename = newSettingsFilename;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UnityPackage.SETTINGS__SETTINGS_FILENAME, oldSettingsFilename, settingsFilename));
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
      case UnityPackage.SETTINGS__SETTINGS_FILENAME:
        return getSettingsFilename();
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
      case UnityPackage.SETTINGS__SETTINGS_FILENAME:
        setSettingsFilename((String)newValue);
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
      case UnityPackage.SETTINGS__SETTINGS_FILENAME:
        setSettingsFilename(SETTINGS_FILENAME_EDEFAULT);
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
      case UnityPackage.SETTINGS__SETTINGS_FILENAME:
        return SETTINGS_FILENAME_EDEFAULT == null ? settingsFilename != null : !SETTINGS_FILENAME_EDEFAULT.equals(settingsFilename);
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
    result.append(" (settingsFilename: ");
    result.append(settingsFilename);
    result.append(')');
    return result.toString();
  }

} //SettingsImpl