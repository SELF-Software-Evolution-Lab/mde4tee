/**
 */
package org.eclipse.sirius.sample.basictee;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Store Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.basictee.StoreService#getStoreData <em>Store Data</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.basictee.BasicteePackage#getStoreService()
 * @model
 * @generated
 */
public interface StoreService extends Service {
	/**
	 * Returns the value of the '<em><b>Store Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Store Data</em>' attribute.
	 * @see #setStoreData(String)
	 * @see org.eclipse.sirius.sample.basictee.BasicteePackage#getStoreService_StoreData()
	 * @model
	 * @generated
	 */
	String getStoreData();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.basictee.StoreService#getStoreData <em>Store Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Store Data</em>' attribute.
	 * @see #getStoreData()
	 * @generated
	 */
	void setStoreData(String value);

} // StoreService
