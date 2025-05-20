/**
 */
package org.eclipse.sirius.sample.basictee;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.basictee.Tee#getBoardType <em>Board Type</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.basictee.Tee#getOs <em>Os</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.basictee.Tee#getHardwareInfo <em>Hardware Info</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.basictee.Tee#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.basictee.Tee#getMemorycompartment <em>Memorycompartment</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.basictee.BasicteePackage#getTee()
 * @model
 * @generated
 */
public interface Tee extends EObject {
	/**
	 * Returns the value of the '<em><b>Board Type</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * The literals are from the enumeration {@link org.eclipse.sirius.sample.basictee.BoardType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Board Type</em>' attribute.
	 * @see org.eclipse.sirius.sample.basictee.BoardType
	 * @see #setBoardType(BoardType)
	 * @see org.eclipse.sirius.sample.basictee.BasicteePackage#getTee_BoardType()
	 * @model default=""
	 * @generated
	 */
	BoardType getBoardType();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.basictee.Tee#getBoardType <em>Board Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Board Type</em>' attribute.
	 * @see org.eclipse.sirius.sample.basictee.BoardType
	 * @see #getBoardType()
	 * @generated
	 */
	void setBoardType(BoardType value);

	/**
	 * Returns the value of the '<em><b>Os</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * The literals are from the enumeration {@link org.eclipse.sirius.sample.basictee.OS}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Os</em>' attribute.
	 * @see org.eclipse.sirius.sample.basictee.OS
	 * @see #setOs(OS)
	 * @see org.eclipse.sirius.sample.basictee.BasicteePackage#getTee_Os()
	 * @model default=""
	 * @generated
	 */
	OS getOs();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.basictee.Tee#getOs <em>Os</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Os</em>' attribute.
	 * @see org.eclipse.sirius.sample.basictee.OS
	 * @see #getOs()
	 * @generated
	 */
	void setOs(OS value);

	/**
	 * Returns the value of the '<em><b>Hardware Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hardware Info</em>' attribute.
	 * @see #setHardwareInfo(String)
	 * @see org.eclipse.sirius.sample.basictee.BasicteePackage#getTee_HardwareInfo()
	 * @model
	 * @generated
	 */
	String getHardwareInfo();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.basictee.Tee#getHardwareInfo <em>Hardware Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hardware Info</em>' attribute.
	 * @see #getHardwareInfo()
	 * @generated
	 */
	void setHardwareInfo(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(Launcher)
	 * @see org.eclipse.sirius.sample.basictee.BasicteePackage#getTee_Status()
	 * @model containment="true"
	 * @generated
	 */
	Launcher getStatus();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.basictee.Tee#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Launcher value);

	/**
	 * Returns the value of the '<em><b>Memorycompartment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memorycompartment</em>' containment reference.
	 * @see #setMemorycompartment(MemoryCompartment)
	 * @see org.eclipse.sirius.sample.basictee.BasicteePackage#getTee_Memorycompartment()
	 * @model containment="true"
	 * @generated
	 */
	MemoryCompartment getMemorycompartment();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.basictee.Tee#getMemorycompartment <em>Memorycompartment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memorycompartment</em>' containment reference.
	 * @see #getMemorycompartment()
	 * @generated
	 */
	void setMemorycompartment(MemoryCompartment value);

} // Tee
