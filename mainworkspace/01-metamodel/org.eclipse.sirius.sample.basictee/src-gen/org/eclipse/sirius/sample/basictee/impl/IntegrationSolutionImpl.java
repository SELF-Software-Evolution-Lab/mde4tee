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
import org.eclipse.sirius.sample.basictee.IntegrationSolution;
import org.eclipse.sirius.sample.basictee.Service;
import org.eclipse.sirius.sample.basictee.Tee;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integration Solution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.basictee.impl.IntegrationSolutionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.basictee.impl.IntegrationSolutionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.basictee.impl.IntegrationSolutionImpl#getTee <em>Tee</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.basictee.impl.IntegrationSolutionImpl#getServices <em>Services</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntegrationSolutionImpl extends MinimalEObjectImpl.Container implements IntegrationSolution {
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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTee() <em>Tee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTee()
	 * @generated
	 * @ordered
	 */
	protected Tee tee;

	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> services;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegrationSolutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicteePackage.Literals.INTEGRATION_SOLUTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BasicteePackage.INTEGRATION_SOLUTION__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicteePackage.INTEGRATION_SOLUTION__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tee getTee() {
		return tee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTee(Tee newTee, NotificationChain msgs) {
		Tee oldTee = tee;
		tee = newTee;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					BasicteePackage.INTEGRATION_SOLUTION__TEE, oldTee, newTee);
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
	public void setTee(Tee newTee) {
		if (newTee != tee) {
			NotificationChain msgs = null;
			if (tee != null)
				msgs = ((InternalEObject) tee).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - BasicteePackage.INTEGRATION_SOLUTION__TEE, null, msgs);
			if (newTee != null)
				msgs = ((InternalEObject) newTee).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - BasicteePackage.INTEGRATION_SOLUTION__TEE, null, msgs);
			msgs = basicSetTee(newTee, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicteePackage.INTEGRATION_SOLUTION__TEE, newTee,
					newTee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getServices() {
		if (services == null) {
			services = new EObjectContainmentEList<Service>(Service.class, this,
					BasicteePackage.INTEGRATION_SOLUTION__SERVICES);
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BasicteePackage.INTEGRATION_SOLUTION__TEE:
			return basicSetTee(null, msgs);
		case BasicteePackage.INTEGRATION_SOLUTION__SERVICES:
			return ((InternalEList<?>) getServices()).basicRemove(otherEnd, msgs);
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
		case BasicteePackage.INTEGRATION_SOLUTION__NAME:
			return getName();
		case BasicteePackage.INTEGRATION_SOLUTION__DESCRIPTION:
			return getDescription();
		case BasicteePackage.INTEGRATION_SOLUTION__TEE:
			return getTee();
		case BasicteePackage.INTEGRATION_SOLUTION__SERVICES:
			return getServices();
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
		case BasicteePackage.INTEGRATION_SOLUTION__NAME:
			setName((String) newValue);
			return;
		case BasicteePackage.INTEGRATION_SOLUTION__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case BasicteePackage.INTEGRATION_SOLUTION__TEE:
			setTee((Tee) newValue);
			return;
		case BasicteePackage.INTEGRATION_SOLUTION__SERVICES:
			getServices().clear();
			getServices().addAll((Collection<? extends Service>) newValue);
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
		case BasicteePackage.INTEGRATION_SOLUTION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case BasicteePackage.INTEGRATION_SOLUTION__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case BasicteePackage.INTEGRATION_SOLUTION__TEE:
			setTee((Tee) null);
			return;
		case BasicteePackage.INTEGRATION_SOLUTION__SERVICES:
			getServices().clear();
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
		case BasicteePackage.INTEGRATION_SOLUTION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case BasicteePackage.INTEGRATION_SOLUTION__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case BasicteePackage.INTEGRATION_SOLUTION__TEE:
			return tee != null;
		case BasicteePackage.INTEGRATION_SOLUTION__SERVICES:
			return services != null && !services.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //IntegrationSolutionImpl
