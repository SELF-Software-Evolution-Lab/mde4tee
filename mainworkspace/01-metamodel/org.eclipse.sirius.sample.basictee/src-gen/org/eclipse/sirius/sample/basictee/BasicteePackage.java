/**
 */
package org.eclipse.sirius.sample.basictee;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.sirius.sample.basictee.BasicteeFactory
 * @model kind="package"
 * @generated
 */
public interface BasicteePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "basictee";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/sirius/sample/basictee";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "basictee";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BasicteePackage eINSTANCE = org.eclipse.sirius.sample.basictee.impl.BasicteePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.basictee.impl.IntegrationSolutionImpl <em>Integration Solution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.basictee.impl.IntegrationSolutionImpl
	 * @see org.eclipse.sirius.sample.basictee.impl.BasicteePackageImpl#getIntegrationSolution()
	 * @generated
	 */
	int INTEGRATION_SOLUTION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_SOLUTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_SOLUTION__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Tee</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_SOLUTION__TEE = 2;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_SOLUTION__SERVICES = 3;

	/**
	 * The number of structural features of the '<em>Integration Solution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_SOLUTION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Integration Solution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_SOLUTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.basictee.impl.TeeImpl <em>Tee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.basictee.impl.TeeImpl
	 * @see org.eclipse.sirius.sample.basictee.impl.BasicteePackageImpl#getTee()
	 * @generated
	 */
	int TEE = 1;

	/**
	 * The feature id for the '<em><b>Board Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEE__BOARD_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Os</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEE__OS = 1;

	/**
	 * The feature id for the '<em><b>Hardware Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEE__HARDWARE_INFO = 2;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEE__STATUS = 3;

	/**
	 * The feature id for the '<em><b>Memorycompartment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEE__MEMORYCOMPARTMENT = 4;

	/**
	 * The number of structural features of the '<em>Tee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Tee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.basictee.impl.LauncherImpl <em>Launcher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.basictee.impl.LauncherImpl
	 * @see org.eclipse.sirius.sample.basictee.impl.BasicteePackageImpl#getLauncher()
	 * @generated
	 */
	int LAUNCHER = 2;

	/**
	 * The feature id for the '<em><b>Timer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCHER__TIMER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCHER__NAME = 1;

	/**
	 * The feature id for the '<em><b>Repository Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCHER__REPOSITORY_PATH = 2;

	/**
	 * The feature id for the '<em><b>Integrationprocess</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCHER__INTEGRATIONPROCESS = 3;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCHER__PORTS = 4;

	/**
	 * The feature id for the '<em><b>Service</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCHER__SERVICE = 5;

	/**
	 * The number of structural features of the '<em>Launcher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCHER_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Launcher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCHER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.basictee.impl.MemoryCompartmentImpl <em>Memory Compartment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.basictee.impl.MemoryCompartmentImpl
	 * @see org.eclipse.sirius.sample.basictee.impl.BasicteePackageImpl#getMemoryCompartment()
	 * @generated
	 */
	int MEMORY_COMPARTMENT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_COMPARTMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_COMPARTMENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Integrationprocess</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_COMPARTMENT__INTEGRATIONPROCESS = 2;

	/**
	 * The number of structural features of the '<em>Memory Compartment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_COMPARTMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Memory Compartment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_COMPARTMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.basictee.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.basictee.impl.ServiceImpl
	 * @see org.eclipse.sirius.sample.basictee.impl.BasicteePackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.basictee.impl.IntegrationProcessImpl <em>Integration Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.basictee.impl.IntegrationProcessImpl
	 * @see org.eclipse.sirius.sample.basictee.impl.BasicteePackageImpl#getIntegrationProcess()
	 * @generated
	 */
	int INTEGRATION_PROCESS = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_PROCESS__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_PROCESS__NAME = 1;

	/**
	 * The feature id for the '<em><b>Launcher</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_PROCESS__LAUNCHER = 2;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_PROCESS__PORTS = 3;

	/**
	 * The feature id for the '<em><b>Service</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_PROCESS__SERVICE = 4;

	/**
	 * The number of structural features of the '<em>Integration Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_PROCESS_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Integration Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_PROCESS_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__PORTS = 2;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.basictee.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.basictee.impl.PortImpl
	 * @see org.eclipse.sirius.sample.basictee.impl.BasicteePackageImpl#getPort()
	 * @generated
	 */
	int PORT = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__ID = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__CONNECTIONS = 2;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.basictee.BoardType <em>Board Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.basictee.BoardType
	 * @see org.eclipse.sirius.sample.basictee.impl.BasicteePackageImpl#getBoardType()
	 * @generated
	 */
	int BOARD_TYPE = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.basictee.OS <em>OS</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.basictee.OS
	 * @see org.eclipse.sirius.sample.basictee.impl.BasicteePackageImpl#getOS()
	 * @generated
	 */
	int OS = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.basictee.PortType <em>Port Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.basictee.PortType
	 * @see org.eclipse.sirius.sample.basictee.impl.BasicteePackageImpl#getPortType()
	 * @generated
	 */
	int PORT_TYPE = 9;

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.basictee.IntegrationSolution <em>Integration Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integration Solution</em>'.
	 * @see org.eclipse.sirius.sample.basictee.IntegrationSolution
	 * @generated
	 */
	EClass getIntegrationSolution();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.basictee.IntegrationSolution#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.sirius.sample.basictee.IntegrationSolution#getName()
	 * @see #getIntegrationSolution()
	 * @generated
	 */
	EAttribute getIntegrationSolution_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.basictee.IntegrationSolution#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.sirius.sample.basictee.IntegrationSolution#getDescription()
	 * @see #getIntegrationSolution()
	 * @generated
	 */
	EAttribute getIntegrationSolution_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.sirius.sample.basictee.IntegrationSolution#getTee <em>Tee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tee</em>'.
	 * @see org.eclipse.sirius.sample.basictee.IntegrationSolution#getTee()
	 * @see #getIntegrationSolution()
	 * @generated
	 */
	EReference getIntegrationSolution_Tee();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.sample.basictee.IntegrationSolution#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Services</em>'.
	 * @see org.eclipse.sirius.sample.basictee.IntegrationSolution#getServices()
	 * @see #getIntegrationSolution()
	 * @generated
	 */
	EReference getIntegrationSolution_Services();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.basictee.Tee <em>Tee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tee</em>'.
	 * @see org.eclipse.sirius.sample.basictee.Tee
	 * @generated
	 */
	EClass getTee();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.basictee.Tee#getBoardType <em>Board Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Board Type</em>'.
	 * @see org.eclipse.sirius.sample.basictee.Tee#getBoardType()
	 * @see #getTee()
	 * @generated
	 */
	EAttribute getTee_BoardType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.basictee.Tee#getOs <em>Os</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Os</em>'.
	 * @see org.eclipse.sirius.sample.basictee.Tee#getOs()
	 * @see #getTee()
	 * @generated
	 */
	EAttribute getTee_Os();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.basictee.Tee#getHardwareInfo <em>Hardware Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hardware Info</em>'.
	 * @see org.eclipse.sirius.sample.basictee.Tee#getHardwareInfo()
	 * @see #getTee()
	 * @generated
	 */
	EAttribute getTee_HardwareInfo();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.sirius.sample.basictee.Tee#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see org.eclipse.sirius.sample.basictee.Tee#getStatus()
	 * @see #getTee()
	 * @generated
	 */
	EReference getTee_Status();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.sirius.sample.basictee.Tee#getMemorycompartment <em>Memorycompartment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Memorycompartment</em>'.
	 * @see org.eclipse.sirius.sample.basictee.Tee#getMemorycompartment()
	 * @see #getTee()
	 * @generated
	 */
	EReference getTee_Memorycompartment();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.basictee.Launcher <em>Launcher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Launcher</em>'.
	 * @see org.eclipse.sirius.sample.basictee.Launcher
	 * @generated
	 */
	EClass getLauncher();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.basictee.Launcher#getTimer <em>Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timer</em>'.
	 * @see org.eclipse.sirius.sample.basictee.Launcher#getTimer()
	 * @see #getLauncher()
	 * @generated
	 */
	EAttribute getLauncher_Timer();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.basictee.Launcher#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.sirius.sample.basictee.Launcher#getName()
	 * @see #getLauncher()
	 * @generated
	 */
	EAttribute getLauncher_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.basictee.Launcher#getRepositoryPath <em>Repository Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repository Path</em>'.
	 * @see org.eclipse.sirius.sample.basictee.Launcher#getRepositoryPath()
	 * @see #getLauncher()
	 * @generated
	 */
	EAttribute getLauncher_RepositoryPath();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.sample.basictee.Launcher#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see org.eclipse.sirius.sample.basictee.Launcher#getPorts()
	 * @see #getLauncher()
	 * @generated
	 */
	EReference getLauncher_Ports();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.sample.basictee.Launcher#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service</em>'.
	 * @see org.eclipse.sirius.sample.basictee.Launcher#getService()
	 * @see #getLauncher()
	 * @generated
	 */
	EReference getLauncher_Service();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.basictee.Launcher#getIntegrationprocess <em>Integrationprocess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Integrationprocess</em>'.
	 * @see org.eclipse.sirius.sample.basictee.Launcher#getIntegrationprocess()
	 * @see #getLauncher()
	 * @generated
	 */
	EReference getLauncher_Integrationprocess();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.basictee.MemoryCompartment <em>Memory Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memory Compartment</em>'.
	 * @see org.eclipse.sirius.sample.basictee.MemoryCompartment
	 * @generated
	 */
	EClass getMemoryCompartment();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.basictee.MemoryCompartment#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.sirius.sample.basictee.MemoryCompartment#getId()
	 * @see #getMemoryCompartment()
	 * @generated
	 */
	EAttribute getMemoryCompartment_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.basictee.MemoryCompartment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.sirius.sample.basictee.MemoryCompartment#getName()
	 * @see #getMemoryCompartment()
	 * @generated
	 */
	EAttribute getMemoryCompartment_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.sirius.sample.basictee.MemoryCompartment#getIntegrationprocess <em>Integrationprocess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Integrationprocess</em>'.
	 * @see org.eclipse.sirius.sample.basictee.MemoryCompartment#getIntegrationprocess()
	 * @see #getMemoryCompartment()
	 * @generated
	 */
	EReference getMemoryCompartment_Integrationprocess();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.basictee.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see org.eclipse.sirius.sample.basictee.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.basictee.Service#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.sirius.sample.basictee.Service#getId()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.basictee.Service#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.sirius.sample.basictee.Service#getName()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.sample.basictee.Service#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see org.eclipse.sirius.sample.basictee.Service#getPorts()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Ports();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.basictee.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see org.eclipse.sirius.sample.basictee.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.basictee.Port#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.sirius.sample.basictee.Port#getId()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.basictee.Port#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.sirius.sample.basictee.Port#getType()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Type();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sirius.sample.basictee.Port#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connections</em>'.
	 * @see org.eclipse.sirius.sample.basictee.Port#getConnections()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Connections();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.basictee.IntegrationProcess <em>Integration Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integration Process</em>'.
	 * @see org.eclipse.sirius.sample.basictee.IntegrationProcess
	 * @generated
	 */
	EClass getIntegrationProcess();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.basictee.IntegrationProcess#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.sirius.sample.basictee.IntegrationProcess#getId()
	 * @see #getIntegrationProcess()
	 * @generated
	 */
	EAttribute getIntegrationProcess_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.basictee.IntegrationProcess#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.sirius.sample.basictee.IntegrationProcess#getName()
	 * @see #getIntegrationProcess()
	 * @generated
	 */
	EAttribute getIntegrationProcess_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.sample.basictee.IntegrationProcess#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see org.eclipse.sirius.sample.basictee.IntegrationProcess#getPorts()
	 * @see #getIntegrationProcess()
	 * @generated
	 */
	EReference getIntegrationProcess_Ports();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.sample.basictee.IntegrationProcess#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service</em>'.
	 * @see org.eclipse.sirius.sample.basictee.IntegrationProcess#getService()
	 * @see #getIntegrationProcess()
	 * @generated
	 */
	EReference getIntegrationProcess_Service();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.basictee.IntegrationProcess#getLauncher <em>Launcher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Launcher</em>'.
	 * @see org.eclipse.sirius.sample.basictee.IntegrationProcess#getLauncher()
	 * @see #getIntegrationProcess()
	 * @generated
	 */
	EReference getIntegrationProcess_Launcher();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.sirius.sample.basictee.BoardType <em>Board Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Board Type</em>'.
	 * @see org.eclipse.sirius.sample.basictee.BoardType
	 * @generated
	 */
	EEnum getBoardType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.sirius.sample.basictee.OS <em>OS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>OS</em>'.
	 * @see org.eclipse.sirius.sample.basictee.OS
	 * @generated
	 */
	EEnum getOS();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.sirius.sample.basictee.PortType <em>Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Port Type</em>'.
	 * @see org.eclipse.sirius.sample.basictee.PortType
	 * @generated
	 */
	EEnum getPortType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BasicteeFactory getBasicteeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.basictee.impl.IntegrationSolutionImpl <em>Integration Solution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.basictee.impl.IntegrationSolutionImpl
		 * @see org.eclipse.sirius.sample.basictee.impl.BasicteePackageImpl#getIntegrationSolution()
		 * @generated
		 */
		EClass INTEGRATION_SOLUTION = eINSTANCE.getIntegrationSolution();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGRATION_SOLUTION__NAME = eINSTANCE.getIntegrationSolution_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGRATION_SOLUTION__DESCRIPTION = eINSTANCE.getIntegrationSolution_Description();

		/**
		 * The meta object literal for the '<em><b>Tee</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGRATION_SOLUTION__TEE = eINSTANCE.getIntegrationSolution_Tee();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGRATION_SOLUTION__SERVICES = eINSTANCE.getIntegrationSolution_Services();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.basictee.impl.TeeImpl <em>Tee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.basictee.impl.TeeImpl
		 * @see org.eclipse.sirius.sample.basictee.impl.BasicteePackageImpl#getTee()
		 * @generated
		 */
		EClass TEE = eINSTANCE.getTee();

		/**
		 * The meta object literal for the '<em><b>Board Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEE__BOARD_TYPE = eINSTANCE.getTee_BoardType();

		/**
		 * The meta object literal for the '<em><b>Os</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEE__OS = eINSTANCE.getTee_Os();

		/**
		 * The meta object literal for the '<em><b>Hardware Info</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEE__HARDWARE_INFO = eINSTANCE.getTee_HardwareInfo();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEE__STATUS = eINSTANCE.getTee_Status();

		/**
		 * The meta object literal for the '<em><b>Memorycompartment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEE__MEMORYCOMPARTMENT = eINSTANCE.getTee_Memorycompartment();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.basictee.impl.LauncherImpl <em>Launcher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.basictee.impl.LauncherImpl
		 * @see org.eclipse.sirius.sample.basictee.impl.BasicteePackageImpl#getLauncher()
		 * @generated
		 */
		EClass LAUNCHER = eINSTANCE.getLauncher();

		/**
		 * The meta object literal for the '<em><b>Timer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAUNCHER__TIMER = eINSTANCE.getLauncher_Timer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAUNCHER__NAME = eINSTANCE.getLauncher_Name();

		/**
		 * The meta object literal for the '<em><b>Repository Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAUNCHER__REPOSITORY_PATH = eINSTANCE.getLauncher_RepositoryPath();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAUNCHER__PORTS = eINSTANCE.getLauncher_Ports();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAUNCHER__SERVICE = eINSTANCE.getLauncher_Service();

		/**
		 * The meta object literal for the '<em><b>Integrationprocess</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAUNCHER__INTEGRATIONPROCESS = eINSTANCE.getLauncher_Integrationprocess();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.basictee.impl.MemoryCompartmentImpl <em>Memory Compartment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.basictee.impl.MemoryCompartmentImpl
		 * @see org.eclipse.sirius.sample.basictee.impl.BasicteePackageImpl#getMemoryCompartment()
		 * @generated
		 */
		EClass MEMORY_COMPARTMENT = eINSTANCE.getMemoryCompartment();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMORY_COMPARTMENT__ID = eINSTANCE.getMemoryCompartment_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMORY_COMPARTMENT__NAME = eINSTANCE.getMemoryCompartment_Name();

		/**
		 * The meta object literal for the '<em><b>Integrationprocess</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMORY_COMPARTMENT__INTEGRATIONPROCESS = eINSTANCE.getMemoryCompartment_Integrationprocess();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.basictee.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.basictee.impl.ServiceImpl
		 * @see org.eclipse.sirius.sample.basictee.impl.BasicteePackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__ID = eINSTANCE.getService_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__NAME = eINSTANCE.getService_Name();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__PORTS = eINSTANCE.getService_Ports();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.basictee.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.basictee.impl.PortImpl
		 * @see org.eclipse.sirius.sample.basictee.impl.BasicteePackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__ID = eINSTANCE.getPort_Id();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__TYPE = eINSTANCE.getPort_Type();

		/**
		 * The meta object literal for the '<em><b>Connections</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__CONNECTIONS = eINSTANCE.getPort_Connections();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.basictee.impl.IntegrationProcessImpl <em>Integration Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.basictee.impl.IntegrationProcessImpl
		 * @see org.eclipse.sirius.sample.basictee.impl.BasicteePackageImpl#getIntegrationProcess()
		 * @generated
		 */
		EClass INTEGRATION_PROCESS = eINSTANCE.getIntegrationProcess();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGRATION_PROCESS__ID = eINSTANCE.getIntegrationProcess_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGRATION_PROCESS__NAME = eINSTANCE.getIntegrationProcess_Name();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGRATION_PROCESS__PORTS = eINSTANCE.getIntegrationProcess_Ports();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGRATION_PROCESS__SERVICE = eINSTANCE.getIntegrationProcess_Service();

		/**
		 * The meta object literal for the '<em><b>Launcher</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGRATION_PROCESS__LAUNCHER = eINSTANCE.getIntegrationProcess_Launcher();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.basictee.BoardType <em>Board Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.basictee.BoardType
		 * @see org.eclipse.sirius.sample.basictee.impl.BasicteePackageImpl#getBoardType()
		 * @generated
		 */
		EEnum BOARD_TYPE = eINSTANCE.getBoardType();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.basictee.OS <em>OS</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.basictee.OS
		 * @see org.eclipse.sirius.sample.basictee.impl.BasicteePackageImpl#getOS()
		 * @generated
		 */
		EEnum OS = eINSTANCE.getOS();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.basictee.PortType <em>Port Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.basictee.PortType
		 * @see org.eclipse.sirius.sample.basictee.impl.BasicteePackageImpl#getPortType()
		 * @generated
		 */
		EEnum PORT_TYPE = eINSTANCE.getPortType();

	}

} //BasicteePackage
