/**
 */
package org.eclipse.sirius.sample.basictee.impl;

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
import org.eclipse.sirius.sample.basictee.BasicteePackage;
import org.eclipse.sirius.sample.basictee.IntegrationProcess;
import org.eclipse.sirius.sample.basictee.Launcher;
import org.eclipse.sirius.sample.basictee.Port;
import org.eclipse.sirius.sample.basictee.Service;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Launcher</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.basictee.impl.LauncherImpl#getTimer <em>Timer</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.basictee.impl.LauncherImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.basictee.impl.LauncherImpl#getRepositoryPath <em>Repository Path</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.basictee.impl.LauncherImpl#getIntegrationprocess <em>Integrationprocess</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.basictee.impl.LauncherImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.basictee.impl.LauncherImpl#getService <em>Service</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LauncherImpl extends MinimalEObjectImpl.Container implements Launcher {
	/**
	 * The default value of the '{@link #getTimer() <em>Timer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimer()
	 * @generated
	 * @ordered
	 */
	protected static final int TIMER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTimer() <em>Timer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimer()
	 * @generated
	 * @ordered
	 */
	protected int timer = TIMER_EDEFAULT;

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
	 * The default value of the '{@link #getRepositoryPath() <em>Repository Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepositoryPath()
	 * @generated
	 * @ordered
	 */
	protected static final String REPOSITORY_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRepositoryPath() <em>Repository Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepositoryPath()
	 * @generated
	 * @ordered
	 */
	protected String repositoryPath = REPOSITORY_PATH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIntegrationprocess() <em>Integrationprocess</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegrationprocess()
	 * @generated
	 * @ordered
	 */
	protected IntegrationProcess integrationprocess;

	/**
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> ports;

	/**
	 * The cached value of the '{@link #getService() <em>Service</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> service;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LauncherImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicteePackage.Literals.LAUNCHER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTimer() {
		return timer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimer(int newTimer) {
		int oldTimer = timer;
		timer = newTimer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicteePackage.LAUNCHER__TIMER, oldTimer, timer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicteePackage.LAUNCHER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRepositoryPath() {
		return repositoryPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepositoryPath(String newRepositoryPath) {
		String oldRepositoryPath = repositoryPath;
		repositoryPath = newRepositoryPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicteePackage.LAUNCHER__REPOSITORY_PATH,
					oldRepositoryPath, repositoryPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getPorts() {
		if (ports == null) {
			ports = new EObjectContainmentEList<Port>(Port.class, this, BasicteePackage.LAUNCHER__PORTS);
		}
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getService() {
		if (service == null) {
			service = new EObjectContainmentEList<Service>(Service.class, this, BasicteePackage.LAUNCHER__SERVICE);
		}
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegrationProcess getIntegrationprocess() {
		if (integrationprocess != null && integrationprocess.eIsProxy()) {
			InternalEObject oldIntegrationprocess = (InternalEObject) integrationprocess;
			integrationprocess = (IntegrationProcess) eResolveProxy(oldIntegrationprocess);
			if (integrationprocess != oldIntegrationprocess) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							BasicteePackage.LAUNCHER__INTEGRATIONPROCESS, oldIntegrationprocess, integrationprocess));
			}
		}
		return integrationprocess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegrationProcess basicGetIntegrationprocess() {
		return integrationprocess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntegrationprocess(IntegrationProcess newIntegrationprocess,
			NotificationChain msgs) {
		IntegrationProcess oldIntegrationprocess = integrationprocess;
		integrationprocess = newIntegrationprocess;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					BasicteePackage.LAUNCHER__INTEGRATIONPROCESS, oldIntegrationprocess, newIntegrationprocess);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntegrationprocess(IntegrationProcess newIntegrationprocess) {
		if (newIntegrationprocess != integrationprocess) {
			NotificationChain msgs = null;
			if (integrationprocess != null)
				msgs = ((InternalEObject) integrationprocess).eInverseRemove(this,
						BasicteePackage.INTEGRATION_PROCESS__LAUNCHER, IntegrationProcess.class, msgs);
			if (newIntegrationprocess != null)
				msgs = ((InternalEObject) newIntegrationprocess).eInverseAdd(this,
						BasicteePackage.INTEGRATION_PROCESS__LAUNCHER, IntegrationProcess.class, msgs);
			msgs = basicSetIntegrationprocess(newIntegrationprocess, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicteePackage.LAUNCHER__INTEGRATIONPROCESS,
					newIntegrationprocess, newIntegrationprocess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BasicteePackage.LAUNCHER__INTEGRATIONPROCESS:
			if (integrationprocess != null)
				msgs = ((InternalEObject) integrationprocess).eInverseRemove(this,
						BasicteePackage.INTEGRATION_PROCESS__LAUNCHER, IntegrationProcess.class, msgs);
			return basicSetIntegrationprocess((IntegrationProcess) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BasicteePackage.LAUNCHER__INTEGRATIONPROCESS:
			return basicSetIntegrationprocess(null, msgs);
		case BasicteePackage.LAUNCHER__PORTS:
			return ((InternalEList<?>) getPorts()).basicRemove(otherEnd, msgs);
		case BasicteePackage.LAUNCHER__SERVICE:
			return ((InternalEList<?>) getService()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BasicteePackage.LAUNCHER__TIMER:
			return getTimer();
		case BasicteePackage.LAUNCHER__NAME:
			return getName();
		case BasicteePackage.LAUNCHER__REPOSITORY_PATH:
			return getRepositoryPath();
		case BasicteePackage.LAUNCHER__INTEGRATIONPROCESS:
			if (resolve)
				return getIntegrationprocess();
			return basicGetIntegrationprocess();
		case BasicteePackage.LAUNCHER__PORTS:
			return getPorts();
		case BasicteePackage.LAUNCHER__SERVICE:
			return getService();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case BasicteePackage.LAUNCHER__TIMER:
			setTimer((Integer) newValue);
			return;
		case BasicteePackage.LAUNCHER__NAME:
			setName((String) newValue);
			return;
		case BasicteePackage.LAUNCHER__REPOSITORY_PATH:
			setRepositoryPath((String) newValue);
			return;
		case BasicteePackage.LAUNCHER__INTEGRATIONPROCESS:
			setIntegrationprocess((IntegrationProcess) newValue);
			return;
		case BasicteePackage.LAUNCHER__PORTS:
			getPorts().clear();
			getPorts().addAll((Collection<? extends Port>) newValue);
			return;
		case BasicteePackage.LAUNCHER__SERVICE:
			getService().clear();
			getService().addAll((Collection<? extends Service>) newValue);
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
		case BasicteePackage.LAUNCHER__TIMER:
			setTimer(TIMER_EDEFAULT);
			return;
		case BasicteePackage.LAUNCHER__NAME:
			setName(NAME_EDEFAULT);
			return;
		case BasicteePackage.LAUNCHER__REPOSITORY_PATH:
			setRepositoryPath(REPOSITORY_PATH_EDEFAULT);
			return;
		case BasicteePackage.LAUNCHER__INTEGRATIONPROCESS:
			setIntegrationprocess((IntegrationProcess) null);
			return;
		case BasicteePackage.LAUNCHER__PORTS:
			getPorts().clear();
			return;
		case BasicteePackage.LAUNCHER__SERVICE:
			getService().clear();
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
		case BasicteePackage.LAUNCHER__TIMER:
			return timer != TIMER_EDEFAULT;
		case BasicteePackage.LAUNCHER__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case BasicteePackage.LAUNCHER__REPOSITORY_PATH:
			return REPOSITORY_PATH_EDEFAULT == null ? repositoryPath != null
					: !REPOSITORY_PATH_EDEFAULT.equals(repositoryPath);
		case BasicteePackage.LAUNCHER__INTEGRATIONPROCESS:
			return integrationprocess != null;
		case BasicteePackage.LAUNCHER__PORTS:
			return ports != null && !ports.isEmpty();
		case BasicteePackage.LAUNCHER__SERVICE:
			return service != null && !service.isEmpty();
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (timer: ");
		result.append(timer);
		result.append(", name: ");
		result.append(name);
		result.append(", repositoryPath: ");
		result.append(repositoryPath);
		result.append(')');
		return result.toString();
	}

} //LauncherImpl
