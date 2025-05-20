/**
 */
package org.eclipse.sirius.sample.basictee;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integration Solution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.basictee.IntegrationSolution#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.basictee.IntegrationSolution#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.basictee.IntegrationSolution#getTee <em>Tee</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.basictee.IntegrationSolution#getServices <em>Services</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.basictee.BasicteePackage#getIntegrationSolution()
 * @model
 * @generated
 */
public interface IntegrationSolution extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.sirius.sample.basictee.BasicteePackage#getIntegrationSolution_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.basictee.IntegrationSolution#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.eclipse.sirius.sample.basictee.BasicteePackage#getIntegrationSolution_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.basictee.IntegrationSolution#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Tee</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tee</em>' containment reference.
	 * @see #setTee(Tee)
	 * @see org.eclipse.sirius.sample.basictee.BasicteePackage#getIntegrationSolution_Tee()
	 * @model containment="true"
	 * @generated
	 */
	Tee getTee();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.basictee.IntegrationSolution#getTee <em>Tee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tee</em>' containment reference.
	 * @see #getTee()
	 * @generated
	 */
	void setTee(Tee value);

	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.basictee.Service}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' containment reference list.
	 * @see org.eclipse.sirius.sample.basictee.BasicteePackage#getIntegrationSolution_Services()
	 * @model containment="true"
	 * @generated
	 */
	EList<Service> getServices();

} // IntegrationSolution
