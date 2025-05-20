/**
 */
package org.eclipse.sirius.sample.basictee;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.basictee.Port#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.basictee.Port#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.basictee.Port#getConnections <em>Connections</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.basictee.BasicteePackage#getPort()
 * @model
 * @generated
 */
public interface Port extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.eclipse.sirius.sample.basictee.BasicteePackage#getPort_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.basictee.Port#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * The literals are from the enumeration {@link org.eclipse.sirius.sample.basictee.PortType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.sirius.sample.basictee.PortType
	 * @see #setType(PortType)
	 * @see org.eclipse.sirius.sample.basictee.BasicteePackage#getPort_Type()
	 * @model default=""
	 * @generated
	 */
	PortType getType();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.basictee.Port#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.sirius.sample.basictee.PortType
	 * @see #getType()
	 * @generated
	 */
	void setType(PortType value);

	/**
	 * Returns the value of the '<em><b>Connections</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.basictee.Port}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections</em>' reference list.
	 * @see org.eclipse.sirius.sample.basictee.BasicteePackage#getPort_Connections()
	 * @model
	 * @generated
	 */
	EList<Port> getConnections();

} // Port
