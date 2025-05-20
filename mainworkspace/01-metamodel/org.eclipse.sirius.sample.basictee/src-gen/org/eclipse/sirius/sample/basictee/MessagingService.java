/**
 */
package org.eclipse.sirius.sample.basictee;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Messaging Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.basictee.MessagingService#getMessageQueue <em>Message Queue</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.basictee.BasicteePackage#getMessagingService()
 * @model
 * @generated
 */
public interface MessagingService extends Service {
	/**
	 * Returns the value of the '<em><b>Message Queue</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Queue</em>' attribute list.
	 * @see org.eclipse.sirius.sample.basictee.BasicteePackage#getMessagingService_MessageQueue()
	 * @model
	 * @generated
	 */
	EList<String> getMessageQueue();

} // MessagingService
