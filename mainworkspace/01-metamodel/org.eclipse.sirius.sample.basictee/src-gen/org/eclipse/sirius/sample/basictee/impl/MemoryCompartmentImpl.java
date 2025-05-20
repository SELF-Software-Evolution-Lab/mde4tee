/**
 */
package org.eclipse.sirius.sample.basictee.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.sirius.sample.basictee.BasicteePackage;
import org.eclipse.sirius.sample.basictee.IntegrationProcess;
import org.eclipse.sirius.sample.basictee.MemoryCompartment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Memory Compartment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.basictee.impl.MemoryCompartmentImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.basictee.impl.MemoryCompartmentImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.basictee.impl.MemoryCompartmentImpl#getIntegrationprocess <em>Integrationprocess</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MemoryCompartmentImpl extends MinimalEObjectImpl.Container implements MemoryCompartment {
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
	 * The cached value of the '{@link #getIntegrationprocess() <em>Integrationprocess</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegrationprocess()
	 * @generated
	 * @ordered
	 */
	protected IntegrationProcess integrationprocess;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemoryCompartmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicteePackage.Literals.MEMORY_COMPARTMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BasicteePackage.MEMORY_COMPARTMENT__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BasicteePackage.MEMORY_COMPARTMENT__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegrationProcess getIntegrationprocess() {
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
					BasicteePackage.MEMORY_COMPARTMENT__INTEGRATIONPROCESS, oldIntegrationprocess,
					newIntegrationprocess);
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
						EOPPOSITE_FEATURE_BASE - BasicteePackage.MEMORY_COMPARTMENT__INTEGRATIONPROCESS, null, msgs);
			if (newIntegrationprocess != null)
				msgs = ((InternalEObject) newIntegrationprocess).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - BasicteePackage.MEMORY_COMPARTMENT__INTEGRATIONPROCESS, null, msgs);
			msgs = basicSetIntegrationprocess(newIntegrationprocess, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BasicteePackage.MEMORY_COMPARTMENT__INTEGRATIONPROCESS, newIntegrationprocess,
					newIntegrationprocess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BasicteePackage.MEMORY_COMPARTMENT__INTEGRATIONPROCESS:
			return basicSetIntegrationprocess(null, msgs);
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
		case BasicteePackage.MEMORY_COMPARTMENT__ID:
			return getId();
		case BasicteePackage.MEMORY_COMPARTMENT__NAME:
			return getName();
		case BasicteePackage.MEMORY_COMPARTMENT__INTEGRATIONPROCESS:
			return getIntegrationprocess();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case BasicteePackage.MEMORY_COMPARTMENT__ID:
			setId((String) newValue);
			return;
		case BasicteePackage.MEMORY_COMPARTMENT__NAME:
			setName((String) newValue);
			return;
		case BasicteePackage.MEMORY_COMPARTMENT__INTEGRATIONPROCESS:
			setIntegrationprocess((IntegrationProcess) newValue);
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
		case BasicteePackage.MEMORY_COMPARTMENT__ID:
			setId(ID_EDEFAULT);
			return;
		case BasicteePackage.MEMORY_COMPARTMENT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case BasicteePackage.MEMORY_COMPARTMENT__INTEGRATIONPROCESS:
			setIntegrationprocess((IntegrationProcess) null);
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
		case BasicteePackage.MEMORY_COMPARTMENT__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case BasicteePackage.MEMORY_COMPARTMENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case BasicteePackage.MEMORY_COMPARTMENT__INTEGRATIONPROCESS:
			return integrationprocess != null;
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

} //MemoryCompartmentImpl
