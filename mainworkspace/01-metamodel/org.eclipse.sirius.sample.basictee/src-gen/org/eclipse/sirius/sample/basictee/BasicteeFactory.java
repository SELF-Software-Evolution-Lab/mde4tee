/**
 */
package org.eclipse.sirius.sample.basictee;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.sirius.sample.basictee.BasicteePackage
 * @generated
 */
public interface BasicteeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BasicteeFactory eINSTANCE = org.eclipse.sirius.sample.basictee.impl.BasicteeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Integration Solution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integration Solution</em>'.
	 * @generated
	 */
	IntegrationSolution createIntegrationSolution();

	/**
	 * Returns a new object of class '<em>Tee</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tee</em>'.
	 * @generated
	 */
	Tee createTee();

	/**
	 * Returns a new object of class '<em>Launcher</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Launcher</em>'.
	 * @generated
	 */
	Launcher createLauncher();

	/**
	 * Returns a new object of class '<em>Memory Compartment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Memory Compartment</em>'.
	 * @generated
	 */
	MemoryCompartment createMemoryCompartment();

	/**
	 * Returns a new object of class '<em>Integration Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integration Process</em>'.
	 * @generated
	 */
	IntegrationProcess createIntegrationProcess();

	/**
	 * Returns a new object of class '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service</em>'.
	 * @generated
	 */
	Service createService();

	/**
	 * Returns a new object of class '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port</em>'.
	 * @generated
	 */
	Port createPort();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BasicteePackage getBasicteePackage();

} //BasicteeFactory
