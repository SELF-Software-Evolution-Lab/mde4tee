/**
 */
package org.eclipse.sirius.sample.basictee;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Launcher</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.basictee.Launcher#getTimer <em>Timer</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.basictee.Launcher#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.basictee.Launcher#getRepositoryPath <em>Repository Path</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.basictee.Launcher#getIntegrationprocess <em>Integrationprocess</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.basictee.Launcher#getPorts <em>Ports</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.basictee.Launcher#getService <em>Service</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.basictee.BasicteePackage#getLauncher()
 * @model
 * @generated
 */
public interface Launcher extends EObject {
	/**
	 * Returns the value of the '<em><b>Timer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timer</em>' attribute.
	 * @see #setTimer(int)
	 * @see org.eclipse.sirius.sample.basictee.BasicteePackage#getLauncher_Timer()
	 * @model
	 * @generated
	 */
	int getTimer();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.basictee.Launcher#getTimer <em>Timer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timer</em>' attribute.
	 * @see #getTimer()
	 * @generated
	 */
	void setTimer(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.sirius.sample.basictee.BasicteePackage#getLauncher_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.basictee.Launcher#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Repository Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository Path</em>' attribute.
	 * @see #setRepositoryPath(String)
	 * @see org.eclipse.sirius.sample.basictee.BasicteePackage#getLauncher_RepositoryPath()
	 * @model
	 * @generated
	 */
	String getRepositoryPath();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.basictee.Launcher#getRepositoryPath <em>Repository Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository Path</em>' attribute.
	 * @see #getRepositoryPath()
	 * @generated
	 */
	void setRepositoryPath(String value);

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.basictee.Port}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see org.eclipse.sirius.sample.basictee.BasicteePackage#getLauncher_Ports()
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
	 * @see org.eclipse.sirius.sample.basictee.BasicteePackage#getLauncher_Service()
	 * @model containment="true"
	 * @generated
	 */
	EList<Service> getService();

	/**
	 * Returns the value of the '<em><b>Integrationprocess</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sirius.sample.basictee.IntegrationProcess#getLauncher <em>Launcher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integrationprocess</em>' reference.
	 * @see #setIntegrationprocess(IntegrationProcess)
	 * @see org.eclipse.sirius.sample.basictee.BasicteePackage#getLauncher_Integrationprocess()
	 * @see org.eclipse.sirius.sample.basictee.IntegrationProcess#getLauncher
	 * @model opposite="launcher"
	 * @generated
	 */
	IntegrationProcess getIntegrationprocess();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.basictee.Launcher#getIntegrationprocess <em>Integrationprocess</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Integrationprocess</em>' reference.
	 * @see #getIntegrationprocess()
	 * @generated
	 */
	void setIntegrationprocess(IntegrationProcess value);

} // Launcher
