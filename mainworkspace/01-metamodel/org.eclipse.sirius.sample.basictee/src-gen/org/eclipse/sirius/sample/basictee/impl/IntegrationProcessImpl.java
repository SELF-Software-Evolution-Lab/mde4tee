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
 * An implementation of the model object '<em><b>Integration Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.basictee.impl.IntegrationProcessImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.basictee.impl.IntegrationProcessImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.basictee.impl.IntegrationProcessImpl#getLauncher <em>Launcher</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.basictee.impl.IntegrationProcessImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.basictee.impl.IntegrationProcessImpl#getService <em>Service</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntegrationProcessImpl extends MinimalEObjectImpl.Container implements IntegrationProcess {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

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
	 * The cached value of the '{@link #getLauncher() <em>Launcher</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLauncher()
	 * @generated
	 * @ordered
	 */
	protected Launcher launcher;

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
	protected IntegrationProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicteePackage.Literals.INTEGRATION_PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicteePackage.INTEGRATION_PROCESS__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BasicteePackage.INTEGRATION_PROCESS__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getPorts() {
		if (ports == null) {
			ports = new EObjectContainmentEList<Port>(Port.class, this, BasicteePackage.INTEGRATION_PROCESS__PORTS);
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
			service = new EObjectContainmentEList<Service>(Service.class, this,
					BasicteePackage.INTEGRATION_PROCESS__SERVICE);
		}
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Launcher getLauncher() {
		if (launcher != null && launcher.eIsProxy()) {
			InternalEObject oldLauncher = (InternalEObject) launcher;
			launcher = (Launcher) eResolveProxy(oldLauncher);
			if (launcher != oldLauncher) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							BasicteePackage.INTEGRATION_PROCESS__LAUNCHER, oldLauncher, launcher));
			}
		}
		return launcher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Launcher basicGetLauncher() {
		return launcher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLauncher(Launcher newLauncher, NotificationChain msgs) {
		Launcher oldLauncher = launcher;
		launcher = newLauncher;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					BasicteePackage.INTEGRATION_PROCESS__LAUNCHER, oldLauncher, newLauncher);
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
	public void setLauncher(Launcher newLauncher) {
		if (newLauncher != launcher) {
			NotificationChain msgs = null;
			if (launcher != null)
				msgs = ((InternalEObject) launcher).eInverseRemove(this, BasicteePackage.LAUNCHER__INTEGRATIONPROCESS,
						Launcher.class, msgs);
			if (newLauncher != null)
				msgs = ((InternalEObject) newLauncher).eInverseAdd(this, BasicteePackage.LAUNCHER__INTEGRATIONPROCESS,
						Launcher.class, msgs);
			msgs = basicSetLauncher(newLauncher, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicteePackage.INTEGRATION_PROCESS__LAUNCHER,
					newLauncher, newLauncher));
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
		case BasicteePackage.INTEGRATION_PROCESS__LAUNCHER:
			if (launcher != null)
				msgs = ((InternalEObject) launcher).eInverseRemove(this, BasicteePackage.LAUNCHER__INTEGRATIONPROCESS,
						Launcher.class, msgs);
			return basicSetLauncher((Launcher) otherEnd, msgs);
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
		case BasicteePackage.INTEGRATION_PROCESS__LAUNCHER:
			return basicSetLauncher(null, msgs);
		case BasicteePackage.INTEGRATION_PROCESS__PORTS:
			return ((InternalEList<?>) getPorts()).basicRemove(otherEnd, msgs);
		case BasicteePackage.INTEGRATION_PROCESS__SERVICE:
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
		case BasicteePackage.INTEGRATION_PROCESS__ID:
			return getId();
		case BasicteePackage.INTEGRATION_PROCESS__NAME:
			return getName();
		case BasicteePackage.INTEGRATION_PROCESS__LAUNCHER:
			if (resolve)
				return getLauncher();
			return basicGetLauncher();
		case BasicteePackage.INTEGRATION_PROCESS__PORTS:
			return getPorts();
		case BasicteePackage.INTEGRATION_PROCESS__SERVICE:
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
		case BasicteePackage.INTEGRATION_PROCESS__ID:
			setId((String) newValue);
			return;
		case BasicteePackage.INTEGRATION_PROCESS__NAME:
			setName((String) newValue);
			return;
		case BasicteePackage.INTEGRATION_PROCESS__LAUNCHER:
			setLauncher((Launcher) newValue);
			return;
		case BasicteePackage.INTEGRATION_PROCESS__PORTS:
			getPorts().clear();
			getPorts().addAll((Collection<? extends Port>) newValue);
			return;
		case BasicteePackage.INTEGRATION_PROCESS__SERVICE:
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
		case BasicteePackage.INTEGRATION_PROCESS__ID:
			setId(ID_EDEFAULT);
			return;
		case BasicteePackage.INTEGRATION_PROCESS__NAME:
			setName(NAME_EDEFAULT);
			return;
		case BasicteePackage.INTEGRATION_PROCESS__LAUNCHER:
			setLauncher((Launcher) null);
			return;
		case BasicteePackage.INTEGRATION_PROCESS__PORTS:
			getPorts().clear();
			return;
		case BasicteePackage.INTEGRATION_PROCESS__SERVICE:
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
		case BasicteePackage.INTEGRATION_PROCESS__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case BasicteePackage.INTEGRATION_PROCESS__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case BasicteePackage.INTEGRATION_PROCESS__LAUNCHER:
			return launcher != null;
		case BasicteePackage.INTEGRATION_PROCESS__PORTS:
			return ports != null && !ports.isEmpty();
		case BasicteePackage.INTEGRATION_PROCESS__SERVICE:
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
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //IntegrationProcessImpl
