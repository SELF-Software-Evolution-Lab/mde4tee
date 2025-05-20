/**
 */
package org.eclipse.sirius.sample.basictee;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Taxi Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.basictee.TaxiService#getRideRequests <em>Ride Requests</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.basictee.BasicteePackage#getTaxiService()
 * @model
 * @generated
 */
public interface TaxiService extends Service {
	/**
	 * Returns the value of the '<em><b>Ride Requests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ride Requests</em>' attribute.
	 * @see #setRideRequests(int)
	 * @see org.eclipse.sirius.sample.basictee.BasicteePackage#getTaxiService_RideRequests()
	 * @model
	 * @generated
	 */
	int getRideRequests();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.basictee.TaxiService#getRideRequests <em>Ride Requests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ride Requests</em>' attribute.
	 * @see #getRideRequests()
	 * @generated
	 */
	void setRideRequests(int value);

} // TaxiService
