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

package service.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import service.model.Vacancies;

/**
 * The persistence interface for the vacancies service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VacanciesPersistenceImpl
 * @see VacanciesUtil
 * @generated
 */
public interface VacanciesPersistence extends BasePersistence<Vacancies> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VacanciesUtil} to access the vacancies persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the vacancieses where idVacancies = &#63;.
	*
	* @param idVacancies the id vacancies
	* @return the matching vacancieses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<service.model.Vacancies> findByidVacancies(
		long idVacancies)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the vacancieses where idVacancies = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link service.model.impl.VacanciesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param idVacancies the id vacancies
	* @param start the lower bound of the range of vacancieses
	* @param end the upper bound of the range of vacancieses (not inclusive)
	* @return the range of matching vacancieses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<service.model.Vacancies> findByidVacancies(
		long idVacancies, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the vacancieses where idVacancies = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link service.model.impl.VacanciesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param idVacancies the id vacancies
	* @param start the lower bound of the range of vacancieses
	* @param end the upper bound of the range of vacancieses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vacancieses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<service.model.Vacancies> findByidVacancies(
		long idVacancies, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first vacancies in the ordered set where idVacancies = &#63;.
	*
	* @param idVacancies the id vacancies
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vacancies
	* @throws service.NoSuchVacanciesException if a matching vacancies could not be found
	* @throws SystemException if a system exception occurred
	*/
	public service.model.Vacancies findByidVacancies_First(long idVacancies,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			service.NoSuchVacanciesException;

	/**
	* Returns the first vacancies in the ordered set where idVacancies = &#63;.
	*
	* @param idVacancies the id vacancies
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vacancies, or <code>null</code> if a matching vacancies could not be found
	* @throws SystemException if a system exception occurred
	*/
	public service.model.Vacancies fetchByidVacancies_First(long idVacancies,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last vacancies in the ordered set where idVacancies = &#63;.
	*
	* @param idVacancies the id vacancies
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vacancies
	* @throws service.NoSuchVacanciesException if a matching vacancies could not be found
	* @throws SystemException if a system exception occurred
	*/
	public service.model.Vacancies findByidVacancies_Last(long idVacancies,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			service.NoSuchVacanciesException;

	/**
	* Returns the last vacancies in the ordered set where idVacancies = &#63;.
	*
	* @param idVacancies the id vacancies
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vacancies, or <code>null</code> if a matching vacancies could not be found
	* @throws SystemException if a system exception occurred
	*/
	public service.model.Vacancies fetchByidVacancies_Last(long idVacancies,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the vacancieses where idVacancies = &#63; from the database.
	*
	* @param idVacancies the id vacancies
	* @throws SystemException if a system exception occurred
	*/
	public void removeByidVacancies(long idVacancies)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of vacancieses where idVacancies = &#63;.
	*
	* @param idVacancies the id vacancies
	* @return the number of matching vacancieses
	* @throws SystemException if a system exception occurred
	*/
	public int countByidVacancies(long idVacancies)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the vacancies in the entity cache if it is enabled.
	*
	* @param vacancies the vacancies
	*/
	public void cacheResult(service.model.Vacancies vacancies);

	/**
	* Caches the vacancieses in the entity cache if it is enabled.
	*
	* @param vacancieses the vacancieses
	*/
	public void cacheResult(java.util.List<service.model.Vacancies> vacancieses);

	/**
	* Creates a new vacancies with the primary key. Does not add the vacancies to the database.
	*
	* @param idVacancies the primary key for the new vacancies
	* @return the new vacancies
	*/
	public service.model.Vacancies create(long idVacancies);

	/**
	* Removes the vacancies with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param idVacancies the primary key of the vacancies
	* @return the vacancies that was removed
	* @throws service.NoSuchVacanciesException if a vacancies with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public service.model.Vacancies remove(long idVacancies)
		throws com.liferay.portal.kernel.exception.SystemException,
			service.NoSuchVacanciesException;

	public service.model.Vacancies updateImpl(service.model.Vacancies vacancies)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the vacancies with the primary key or throws a {@link service.NoSuchVacanciesException} if it could not be found.
	*
	* @param idVacancies the primary key of the vacancies
	* @return the vacancies
	* @throws service.NoSuchVacanciesException if a vacancies with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public service.model.Vacancies findByPrimaryKey(long idVacancies)
		throws com.liferay.portal.kernel.exception.SystemException,
			service.NoSuchVacanciesException;

	/**
	* Returns the vacancies with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param idVacancies the primary key of the vacancies
	* @return the vacancies, or <code>null</code> if a vacancies with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public service.model.Vacancies fetchByPrimaryKey(long idVacancies)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the vacancieses.
	*
	* @return the vacancieses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<service.model.Vacancies> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<service.model.Vacancies> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the vacancieses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link service.model.impl.VacanciesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vacancieses
	* @param end the upper bound of the range of vacancieses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vacancieses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<service.model.Vacancies> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the vacancieses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of vacancieses.
	*
	* @return the number of vacancieses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}