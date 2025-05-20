/**
 */
package org.eclipse.sirius.sample.basictee;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Memory Compartment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.basictee.MemoryCompartment#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.basictee.MemoryCompartment#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.basictee.MemoryCompartment#getIntegrationprocess <em>Integrationprocess</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.basictee.BasicteePackage#getMemoryCompartment()
 * @model
 * @generated
 */
public interface MemoryCompartment extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.eclipse.sirius.sample.basictee.BasicteePackage#getMemoryCompartment_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.basictee.MemoryCompartment#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.sirius.sample.basictee.BasicteePackage#getMemoryCompartment_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.basictee.MemoryCompartment#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Integrationprocess</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integrationprocess</em>' containment reference.
	 * @see #setIntegrationprocess(IntegrationProcess)
	 * @see org.eclipse.sirius.sample.basictee.BasicteePackage#getMemoryCompartment_Integrationprocess()
	 * @model containment="true"
	 * @generated
	 */
	IntegrationProcess getIntegrationprocess();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.basictee.MemoryCompartment#getIntegrationprocess <em>Integrationprocess</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Integrationprocess</em>' containment reference.
	 * @see #getIntegrationprocess()
	 * @generated
	 */
	void setIntegrationprocess(IntegrationProcess value);

} // MemoryCompartment
