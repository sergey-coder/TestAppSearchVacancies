/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package service.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link VacanciesLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see VacanciesLocalService
 * @generated
 */
public class VacanciesLocalServiceWrapper implements VacanciesLocalService,
	ServiceWrapper<VacanciesLocalService> {
	public VacanciesLocalServiceWrapper(
		VacanciesLocalService vacanciesLocalService) {
		_vacanciesLocalService = vacanciesLocalService;
	}

	/**
	* Adds the vacancies to the database. Also notifies the appropriate model listeners.
	*
	* @param vacancies the vacancies
	* @return the vacancies that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public service.model.Vacancies addVacancies(
		service.model.Vacancies vacancies)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vacanciesLocalService.addVacancies(vacancies);
	}

	/**
	* Creates a new vacancies with the primary key. Does not add the vacancies to the database.
	*
	* @param idVacancies the primary key for the new vacancies
	* @return the new vacancies
	*/
	@Override
	public service.model.Vacancies createVacancies(long idVacancies) {
		return _vacanciesLocalService.createVacancies(idVacancies);
	}

	/**
	* Deletes the vacancies with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param idVacancies the primary key of the vacancies
	* @return the vacancies that was removed
	* @throws PortalException if a vacancies with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public service.model.Vacancies deleteVacancies(long idVacancies)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vacanciesLocalService.deleteVacancies(idVacancies);
	}

	/**
	* Deletes the vacancies from the database. Also notifies the appropriate model listeners.
	*
	* @param vacancies the vacancies
	* @return the vacancies that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public service.model.Vacancies deleteVacancies(
		service.model.Vacancies vacancies)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vacanciesLocalService.deleteVacancies(vacancies);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vacanciesLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vacanciesLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link service.model.impl.VacanciesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _vacanciesLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link service.model.impl.VacanciesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vacanciesLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vacanciesLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vacanciesLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public service.model.Vacancies fetchVacancies(long idVacancies)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vacanciesLocalService.fetchVacancies(idVacancies);
	}

	/**
	* Returns the vacancies with the primary key.
	*
	* @param idVacancies the primary key of the vacancies
	* @return the vacancies
	* @throws PortalException if a vacancies with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public service.model.Vacancies getVacancies(long idVacancies)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vacanciesLocalService.getVacancies(idVacancies);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vacanciesLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the vacancieses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link service.model.impl.VacanciesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vacancieses
	* @param end the upper bound of the range of vacancieses (not inclusive)
	* @return the range of vacancieses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<service.model.Vacancies> getVacancieses(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _vacanciesLocalService.getVacancieses(start, end);
	}

	/**
	* Returns the number of vacancieses.
	*
	* @return the number of vacancieses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getVacanciesesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vacanciesLocalService.getVacanciesesCount();
	}

	/**
	* Updates the vacancies in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vacancies the vacancies
	* @return the vacancies that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public service.model.Vacancies updateVacancies(
		service.model.Vacancies vacancies)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vacanciesLocalService.updateVacancies(vacancies);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _vacanciesLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_vacanciesLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _vacanciesLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public VacanciesLocalService getWrappedVacanciesLocalService() {
		return _vacanciesLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedVacanciesLocalService(
		VacanciesLocalService vacanciesLocalService) {
		_vacanciesLocalService = vacanciesLocalService;
	}

	@Override
	public VacanciesLocalService getWrappedService() {
		return _vacanciesLocalService;
	}

	@Override
	public void setWrappedService(VacanciesLocalService vacanciesLocalService) {
		_vacanciesLocalService = vacanciesLocalService;
	}

	private VacanciesLocalService _vacanciesLocalService;
}