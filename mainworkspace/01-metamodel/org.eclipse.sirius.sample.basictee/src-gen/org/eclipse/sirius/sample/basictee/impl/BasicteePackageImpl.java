/**
 */
package org.eclipse.sirius.sample.basictee.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.sirius.sample.basictee.BasicteeFactory;
import org.eclipse.sirius.sample.basictee.BasicteePackage;
import org.eclipse.sirius.sample.basictee.BoardType;
import org.eclipse.sirius.sample.basictee.IntegrationProcess;
import org.eclipse.sirius.sample.basictee.IntegrationSolution;
import org.eclipse.sirius.sample.basictee.Launcher;
import org.eclipse.sirius.sample.basictee.MemoryCompartment;
import org.eclipse.sirius.sample.basictee.Port;
import org.eclipse.sirius.sample.basictee.PortType;
import org.eclipse.sirius.sample.basictee.Service;
import org.eclipse.sirius.sample.basictee.Tee;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BasicteePackageImpl extends EPackageImpl implements BasicteePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integrationSolutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass teeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass launcherEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memoryCompartmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integrationProcessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum boardTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum osEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum portTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.sirius.sample.basictee.BasicteePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BasicteePackageImpl() {
		super(eNS_URI, BasicteeFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link BasicteePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BasicteePackage init() {
		if (isInited)
			return (BasicteePackage) EPackage.Registry.INSTANCE.getEPackage(BasicteePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredBasicteePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		BasicteePackageImpl theBasicteePackage = registeredBasicteePackage instanceof BasicteePackageImpl
				? (BasicteePackageImpl) registeredBasicteePackage
				: new BasicteePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theBasicteePackage.createPackageContents();

		// Initialize created meta-data
		theBasicteePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBasicteePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BasicteePackage.eNS_URI, theBasicteePackage);
		return theBasicteePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegrationSolution() {
		return integrationSolutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegrationSolution_Name() {
		return (EAttribute) integrationSolutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegrationSolution_Description() {
		return (EAttribute) integrationSolutionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegrationSolution_Tee() {
		return (EReference) integrationSolutionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegrationSolution_Services() {
		return (EReference) integrationSolutionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTee() {
		return teeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTee_BoardType() {
		return (EAttribute) teeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTee_Os() {
		return (EAttribute) teeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTee_HardwareInfo() {
		return (EAttribute) teeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTee_Status() {
		return (EReference) teeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTee_Memorycompartment() {
		return (EReference) teeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLauncher() {
		return launcherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLauncher_Timer() {
		return (EAttribute) launcherEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLauncher_Name() {
		return (EAttribute) launcherEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLauncher_RepositoryPath() {
		return (EAttribute) launcherEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLauncher_Ports() {
		return (EReference) launcherEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLauncher_Service() {
		return (EReference) launcherEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLauncher_Integrationprocess() {
		return (EReference) launcherEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemoryCompartment() {
		return memoryCompartmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemoryCompartment_Id() {
		return (EAttribute) memoryCompartmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemoryCompartment_Name() {
		return (EAttribute) memoryCompartmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemoryCompartment_Integrationprocess() {
		return (EReference) memoryCompartmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_Id() {
		return (EAttribute) serviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_Name() {
		return (EAttribute) serviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_Ports() {
		return (EReference) serviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort() {
		return portEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_Id() {
		return (EAttribute) portEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_Type() {
		return (EAttribute) portEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_Connections() {
		return (EReference) portEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegrationProcess() {
		return integrationProcessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegrationProcess_Id() {
		return (EAttribute) integrationProcessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegrationProcess_Name() {
		return (EAttribute) integrationProcessEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegrationProcess_Ports() {
		return (EReference) integrationProcessEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegrationProcess_Service() {
		return (EReference) integrationProcessEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegrationProcess_Launcher() {
		return (EReference) integrationProcessEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBoardType() {
		return boardTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOS() {
		return osEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPortType() {
		return portTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicteeFactory getBasicteeFactory() {
		return (BasicteeFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		integrationSolutionEClass = createEClass(INTEGRATION_SOLUTION);
		createEAttribute(integrationSolutionEClass, INTEGRATION_SOLUTION__NAME);
		createEAttribute(integrationSolutionEClass, INTEGRATION_SOLUTION__DESCRIPTION);
		createEReference(integrationSolutionEClass, INTEGRATION_SOLUTION__TEE);
		createEReference(integrationSolutionEClass, INTEGRATION_SOLUTION__SERVICES);

		teeEClass = createEClass(TEE);
		createEAttribute(teeEClass, TEE__BOARD_TYPE);
		createEAttribute(teeEClass, TEE__OS);
		createEAttribute(teeEClass, TEE__HARDWARE_INFO);
		createEReference(teeEClass, TEE__STATUS);
		createEReference(teeEClass, TEE__MEMORYCOMPARTMENT);

		launcherEClass = createEClass(LAUNCHER);
		createEAttribute(launcherEClass, LAUNCHER__TIMER);
		createEAttribute(launcherEClass, LAUNCHER__NAME);
		createEAttribute(launcherEClass, LAUNCHER__REPOSITORY_PATH);
		createEReference(launcherEClass, LAUNCHER__INTEGRATIONPROCESS);
		createEReference(launcherEClass, LAUNCHER__PORTS);
		createEReference(launcherEClass, LAUNCHER__SERVICE);

		memoryCompartmentEClass = createEClass(MEMORY_COMPARTMENT);
		createEAttribute(memoryCompartmentEClass, MEMORY_COMPARTMENT__ID);
		createEAttribute(memoryCompartmentEClass, MEMORY_COMPARTMENT__NAME);
		createEReference(memoryCompartmentEClass, MEMORY_COMPARTMENT__INTEGRATIONPROCESS);

		integrationProcessEClass = createEClass(INTEGRATION_PROCESS);
		createEAttribute(integrationProcessEClass, INTEGRATION_PROCESS__ID);
		createEAttribute(integrationProcessEClass, INTEGRATION_PROCESS__NAME);
		createEReference(integrationProcessEClass, INTEGRATION_PROCESS__LAUNCHER);
		createEReference(integrationProcessEClass, INTEGRATION_PROCESS__PORTS);
		createEReference(integrationProcessEClass, INTEGRATION_PROCESS__SERVICE);

		serviceEClass = createEClass(SERVICE);
		createEAttribute(serviceEClass, SERVICE__ID);
		createEAttribute(serviceEClass, SERVICE__NAME);
		createEReference(serviceEClass, SERVICE__PORTS);

		portEClass = createEClass(PORT);
		createEAttribute(portEClass, PORT__ID);
		createEAttribute(portEClass, PORT__TYPE);
		createEReference(portEClass, PORT__CONNECTIONS);

		// Create enums
		boardTypeEEnum = createEEnum(BOARD_TYPE);
		osEEnum = createEEnum(OS);
		portTypeEEnum = createEEnum(PORT_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(integrationSolutionEClass, IntegrationSolution.class, "IntegrationSolution", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegrationSolution_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				IntegrationSolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegrationSolution_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				IntegrationSolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntegrationSolution_Tee(), this.getTee(), null, "tee", null, 0, 1, IntegrationSolution.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntegrationSolution_Services(), this.getService(), null, "services", null, 0, -1,
				IntegrationSolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(teeEClass, Tee.class, "Tee", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTee_BoardType(), this.getBoardType(), "boardType", "", 0, 1, Tee.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTee_Os(), this.getOS(), "os", "", 0, 1, Tee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTee_HardwareInfo(), ecorePackage.getEString(), "hardwareInfo", null, 0, 1, Tee.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTee_Status(), this.getLauncher(), null, "status", null, 0, 1, Tee.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getTee_Memorycompartment(), this.getMemoryCompartment(), null, "memorycompartment", null, 0, 1,
				Tee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(launcherEClass, Launcher.class, "Launcher", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLauncher_Timer(), ecorePackage.getEInt(), "timer", null, 0, 1, Launcher.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLauncher_Name(), ecorePackage.getEString(), "name", null, 0, 1, Launcher.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLauncher_RepositoryPath(), ecorePackage.getEString(), "repositoryPath", null, 0, 1,
				Launcher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getLauncher_Integrationprocess(), this.getIntegrationProcess(),
				this.getIntegrationProcess_Launcher(), "integrationprocess", null, 0, 1, Launcher.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getLauncher_Ports(), this.getPort(), null, "ports", null, 0, -1, Launcher.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getLauncher_Service(), this.getService(), null, "service", null, 0, -1, Launcher.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(memoryCompartmentEClass, MemoryCompartment.class, "MemoryCompartment", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMemoryCompartment_Id(), ecorePackage.getEString(), "id", null, 0, 1, MemoryCompartment.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMemoryCompartment_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				MemoryCompartment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getMemoryCompartment_Integrationprocess(), this.getIntegrationProcess(), null,
				"integrationprocess", null, 0, 1, MemoryCompartment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integrationProcessEClass, IntegrationProcess.class, "IntegrationProcess", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegrationProcess_Id(), ecorePackage.getEString(), "id", null, 0, 1,
				IntegrationProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegrationProcess_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				IntegrationProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getIntegrationProcess_Launcher(), this.getLauncher(), this.getLauncher_Integrationprocess(),
				"launcher", null, 0, 1, IntegrationProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntegrationProcess_Ports(), this.getPort(), null, "ports", null, 0, -1,
				IntegrationProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntegrationProcess_Service(), this.getService(), null, "service", null, 0, -1,
				IntegrationProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getService_Id(), ecorePackage.getEString(), "id", null, 0, 1, Service.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getService_Name(), ecorePackage.getEString(), "name", null, 0, 1, Service.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_Ports(), this.getPort(), null, "ports", null, 0, -1, Service.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(portEClass, Port.class, "Port", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPort_Id(), ecorePackage.getEString(), "id", null, 0, 1, Port.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPort_Type(), this.getPortType(), "type", "", 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPort_Connections(), this.getPort(), null, "connections", null, 0, -1, Port.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(boardTypeEEnum, BoardType.class, "BoardType");
		addEEnumLiteral(boardTypeEEnum, BoardType.MORELLO);
		addEEnumLiteral(boardTypeEEnum, BoardType.RASPBERRY);

		initEEnum(osEEnum, org.eclipse.sirius.sample.basictee.OS.class, "OS");
		addEEnumLiteral(osEEnum, org.eclipse.sirius.sample.basictee.OS.CHERI_BSD);
		addEEnumLiteral(osEEnum, org.eclipse.sirius.sample.basictee.OS.FREE_BSD);

		initEEnum(portTypeEEnum, PortType.class, "PortType");
		addEEnumLiteral(portTypeEEnum, PortType.IN);
		addEEnumLiteral(portTypeEEnum, PortType.OUT);

		// Create resource
		createResource(eNS_URI);
	}

} //BasicteePackageImpl
