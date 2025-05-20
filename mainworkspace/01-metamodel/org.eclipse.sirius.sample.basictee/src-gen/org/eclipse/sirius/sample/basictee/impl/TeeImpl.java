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
import org.eclipse.sirius.sample.basictee.BoardType;
import org.eclipse.sirius.sample.basictee.Launcher;
import org.eclipse.sirius.sample.basictee.MemoryCompartment;
import org.eclipse.sirius.sample.basictee.OS;
import org.eclipse.sirius.sample.basictee.Tee;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tee</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.basictee.impl.TeeImpl#getBoardType <em>Board Type</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.basictee.impl.TeeImpl#getOs <em>Os</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.basictee.impl.TeeImpl#getHardwareInfo <em>Hardware Info</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.basictee.impl.TeeImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.basictee.impl.TeeImpl#getMemorycompartment <em>Memorycompartment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TeeImpl extends MinimalEObjectImpl.Container implements Tee {
	/**
	 * The default value of the '{@link #getBoardType() <em>Board Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoardType()
	 * @generated
	 * @ordered
	 */
	protected static final BoardType BOARD_TYPE_EDEFAULT = BoardType.MORELLO;

	/**
	 * The cached value of the '{@link #getBoardType() <em>Board Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoardType()
	 * @generated
	 * @ordered
	 */
	protected BoardType boardType = BOARD_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOs() <em>Os</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOs()
	 * @generated
	 * @ordered
	 */
	protected static final OS OS_EDEFAULT = OS.CHERI_BSD;

	/**
	 * The cached value of the '{@link #getOs() <em>Os</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOs()
	 * @generated
	 * @ordered
	 */
	protected OS os = OS_EDEFAULT;

	/**
	 * The default value of the '{@link #getHardwareInfo() <em>Hardware Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardwareInfo()
	 * @generated
	 * @ordered
	 */
	protected static final String HARDWARE_INFO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHardwareInfo() <em>Hardware Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardwareInfo()
	 * @generated
	 * @ordered
	 */
	protected String hardwareInfo = HARDWARE_INFO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Launcher status;

	/**
	 * The cached value of the '{@link #getMemorycompartment() <em>Memorycompartment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemorycompartment()
	 * @generated
	 * @ordered
	 */
	protected MemoryCompartment memorycompartment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TeeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicteePackage.Literals.TEE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoardType getBoardType() {
		return boardType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoardType(BoardType newBoardType) {
		BoardType oldBoardType = boardType;
		boardType = newBoardType == null ? BOARD_TYPE_EDEFAULT : newBoardType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicteePackage.TEE__BOARD_TYPE, oldBoardType,
					boardType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OS getOs() {
		return os;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOs(OS newOs) {
		OS oldOs = os;
		os = newOs == null ? OS_EDEFAULT : newOs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicteePackage.TEE__OS, oldOs, os));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHardwareInfo() {
		return hardwareInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHardwareInfo(String newHardwareInfo) {
		String oldHardwareInfo = hardwareInfo;
		hardwareInfo = newHardwareInfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicteePackage.TEE__HARDWARE_INFO, oldHardwareInfo,
					hardwareInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Launcher getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(Launcher newStatus, NotificationChain msgs) {
		Launcher oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicteePackage.TEE__STATUS,
					oldStatus, newStatus);
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
	public void setStatus(Launcher newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject) status).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - BasicteePackage.TEE__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject) newStatus).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - BasicteePackage.TEE__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicteePackage.TEE__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryCompartment getMemorycompartment() {
		return memorycompartment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMemorycompartment(MemoryCompartment newMemorycompartment, NotificationChain msgs) {
		MemoryCompartment oldMemorycompartment = memorycompartment;
		memorycompartment = newMemorycompartment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					BasicteePackage.TEE__MEMORYCOMPARTMENT, oldMemorycompartment, newMemorycompartment);
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
	public void setMemorycompartment(MemoryCompartment newMemorycompartment) {
		if (newMemorycompartment != memorycompartment) {
			NotificationChain msgs = null;
			if (memorycompartment != null)
				msgs = ((InternalEObject) memorycompartment).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - BasicteePackage.TEE__MEMORYCOMPARTMENT, null, msgs);
			if (newMemorycompartment != null)
				msgs = ((InternalEObject) newMemorycompartment).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - BasicteePackage.TEE__MEMORYCOMPARTMENT, null, msgs);
			msgs = basicSetMemorycompartment(newMemorycompartment, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicteePackage.TEE__MEMORYCOMPARTMENT,
					newMemorycompartment, newMemorycompartment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BasicteePackage.TEE__STATUS:
			return basicSetStatus(null, msgs);
		case BasicteePackage.TEE__MEMORYCOMPARTMENT:
			return basicSetMemorycompartment(null, msgs);
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
		case BasicteePackage.TEE__BOARD_TYPE:
			return getBoardType();
		case BasicteePackage.TEE__OS:
			return getOs();
		case BasicteePackage.TEE__HARDWARE_INFO:
			return getHardwareInfo();
		case BasicteePackage.TEE__STATUS:
			return getStatus();
		case BasicteePackage.TEE__MEMORYCOMPARTMENT:
			return getMemorycompartment();
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
		case BasicteePackage.TEE__BOARD_TYPE:
			setBoardType((BoardType) newValue);
			return;
		case BasicteePackage.TEE__OS:
			setOs((OS) newValue);
			return;
		case BasicteePackage.TEE__HARDWARE_INFO:
			setHardwareInfo((String) newValue);
			return;
		case BasicteePackage.TEE__STATUS:
			setStatus((Launcher) newValue);
			return;
		case BasicteePackage.TEE__MEMORYCOMPARTMENT:
			setMemorycompartment((MemoryCompartment) newValue);
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
		case BasicteePackage.TEE__BOARD_TYPE:
			setBoardType(BOARD_TYPE_EDEFAULT);
			return;
		case BasicteePackage.TEE__OS:
			setOs(OS_EDEFAULT);
			return;
		case BasicteePackage.TEE__HARDWARE_INFO:
			setHardwareInfo(HARDWARE_INFO_EDEFAULT);
			return;
		case BasicteePackage.TEE__STATUS:
			setStatus((Launcher) null);
			return;
		case BasicteePackage.TEE__MEMORYCOMPARTMENT:
			setMemorycompartment((MemoryCompartment) null);
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
		case BasicteePackage.TEE__BOARD_TYPE:
			return boardType != BOARD_TYPE_EDEFAULT;
		case BasicteePackage.TEE__OS:
			return os != OS_EDEFAULT;
		case BasicteePackage.TEE__HARDWARE_INFO:
			return HARDWARE_INFO_EDEFAULT == null ? hardwareInfo != null : !HARDWARE_INFO_EDEFAULT.equals(hardwareInfo);
		case BasicteePackage.TEE__STATUS:
			return status != null;
		case BasicteePackage.TEE__MEMORYCOMPARTMENT:
			return memorycompartment != null;
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
		result.append(" (boardType: ");
		result.append(boardType);
		result.append(", os: ");
		result.append(os);
		result.append(", hardwareInfo: ");
		result.append(hardwareInfo);
		result.append(')');
		return result.toString();
	}

} //TeeImpl
