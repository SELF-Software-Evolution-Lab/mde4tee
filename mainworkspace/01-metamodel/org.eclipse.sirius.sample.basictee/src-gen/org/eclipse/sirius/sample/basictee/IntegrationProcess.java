/**
 */
package org.eclipse.sirius.sample.basictee;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integration Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.basictee.IntegrationProcess#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.basictee.IntegrationProcess#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.basictee.IntegrationProcess#getLauncher <em>Launcher</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.basictee.IntegrationProcess#getPorts <em>Ports</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.basictee.IntegrationProcess#getService <em>Service</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.basictee.BasicteePackage#getIntegrationProcess()
 * @model
 * @generated
 */
public interface IntegrationProcess extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.eclipse.sirius.sample.basictee.BasicteePackage#getIntegrationProcess_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.basictee.IntegrationProcess#getId <em>Id</em>}' attribute.
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
	 * @see org.eclipse.sirius.sample.basictee.BasicteePackage#getIntegrationProcess_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.basictee.IntegrationProcess#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.basictee.Port}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see org.eclipse.sirius.sample.basictee.BasicteePackage#getIntegrationProcess_Ports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port> getPorts();

	/**
	 * Returns the value of the '<em><b>Service</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.basictee.Service}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' containment reference list.
	 * @see org.eclipse.sirius.sample.basictee.BasicteePackage#getIntegrationProcess_Service()
	 * @model containment="true"
	 * @generated
	 */
	EList<Service> getService();

	/**
	 * Returns the value of the '<em><b>Launcher</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sirius.sample.basictee.Launcher#getIntegrationprocess <em>Integrationprocess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Launcher</em>' reference.
	 * @see #setLauncher(Launcher)
	 * @see org.eclipse.sirius.sample.basictee.BasicteePackage#getIntegrationProcess_Launcher()
	 * @see org.eclipse.sirius.sample.basictee.Launcher#getIntegrationprocess
	 * @model opposite="integrationprocess"
	 * @generated
	 */
	Launcher getLauncher();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.basictee.IntegrationProcess#getLauncher <em>Launcher</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Launcher</em>' reference.
	 * @see #getLauncher()
	 * @generated
	 */
	void setLauncher(Launcher value);

} // IntegrationProcess
