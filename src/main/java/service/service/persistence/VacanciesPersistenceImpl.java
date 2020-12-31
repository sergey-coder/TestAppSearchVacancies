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

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import service.NoSuchVacanciesException;

import service.model.Vacancies;

import service.model.impl.VacanciesImpl;
import service.model.impl.VacanciesModelImpl;

import service.service.persistence.VacanciesPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the vacancies service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VacanciesPersistence
 * @see VacanciesUtil
 * @generated
 */
public class VacanciesPersistenceImpl extends BasePersistenceImpl<Vacancies>
	implements VacanciesPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VacanciesUtil} to access the vacancies persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VacanciesImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VacanciesModelImpl.ENTITY_CACHE_ENABLED,
			VacanciesModelImpl.FINDER_CACHE_ENABLED, VacanciesImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VacanciesModelImpl.ENTITY_CACHE_ENABLED,
			VacanciesModelImpl.FINDER_CACHE_ENABLED, VacanciesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VacanciesModelImpl.ENTITY_CACHE_ENABLED,
			VacanciesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_IDVACANCIES =
		new FinderPath(VacanciesModelImpl.ENTITY_CACHE_ENABLED,
			VacanciesModelImpl.FINDER_CACHE_ENABLED, VacanciesImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByidVacancies",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IDVACANCIES =
		new FinderPath(VacanciesModelImpl.ENTITY_CACHE_ENABLED,
			VacanciesModelImpl.FINDER_CACHE_ENABLED, VacanciesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByidVacancies",
			new String[] { Long.class.getName() },
			VacanciesModelImpl.IDVACANCIES_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_IDVACANCIES = new FinderPath(VacanciesModelImpl.ENTITY_CACHE_ENABLED,
			VacanciesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByidVacancies",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the vacancieses where idVacancies = &#63;.
	 *
	 * @param idVacancies the id vacancies
	 * @return the matching vacancieses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Vacancies> findByidVacancies(long idVacancies)
		throws SystemException {
		return findByidVacancies(idVacancies, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<Vacancies> findByidVacancies(long idVacancies, int start,
		int end) throws SystemException {
		return findByidVacancies(idVacancies, start, end, null);
	}

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
	@Override
	public List<Vacancies> findByidVacancies(long idVacancies, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IDVACANCIES;
			finderArgs = new Object[] { idVacancies };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_IDVACANCIES;
			finderArgs = new Object[] { idVacancies, start, end, orderByComparator };
		}

		List<Vacancies> list = (List<Vacancies>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Vacancies vacancies : list) {
				if ((idVacancies != vacancies.getIdVacancies())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_VACANCIES_WHERE);

			query.append(_FINDER_COLUMN_IDVACANCIES_IDVACANCIES_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VacanciesModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(idVacancies);

				if (!pagination) {
					list = (List<Vacancies>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Vacancies>(list);
				}
				else {
					list = (List<Vacancies>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first vacancies in the ordered set where idVacancies = &#63;.
	 *
	 * @param idVacancies the id vacancies
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vacancies
	 * @throws service.NoSuchVacanciesException if a matching vacancies could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Vacancies findByidVacancies_First(long idVacancies,
		OrderByComparator orderByComparator)
		throws NoSuchVacanciesException, SystemException {
		Vacancies vacancies = fetchByidVacancies_First(idVacancies,
				orderByComparator);

		if (vacancies != null) {
			return vacancies;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("idVacancies=");
		msg.append(idVacancies);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVacanciesException(msg.toString());
	}

	/**
	 * Returns the first vacancies in the ordered set where idVacancies = &#63;.
	 *
	 * @param idVacancies the id vacancies
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vacancies, or <code>null</code> if a matching vacancies could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Vacancies fetchByidVacancies_First(long idVacancies,
		OrderByComparator orderByComparator) throws SystemException {
		List<Vacancies> list = findByidVacancies(idVacancies, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vacancies in the ordered set where idVacancies = &#63;.
	 *
	 * @param idVacancies the id vacancies
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vacancies
	 * @throws service.NoSuchVacanciesException if a matching vacancies could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Vacancies findByidVacancies_Last(long idVacancies,
		OrderByComparator orderByComparator)
		throws NoSuchVacanciesException, SystemException {
		Vacancies vacancies = fetchByidVacancies_Last(idVacancies,
				orderByComparator);

		if (vacancies != null) {
			return vacancies;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("idVacancies=");
		msg.append(idVacancies);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVacanciesException(msg.toString());
	}

	/**
	 * Returns the last vacancies in the ordered set where idVacancies = &#63;.
	 *
	 * @param idVacancies the id vacancies
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vacancies, or <code>null</code> if a matching vacancies could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Vacancies fetchByidVacancies_Last(long idVacancies,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByidVacancies(idVacancies);

		if (count == 0) {
			return null;
		}

		List<Vacancies> list = findByidVacancies(idVacancies, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Removes all the vacancieses where idVacancies = &#63; from the database.
	 *
	 * @param idVacancies the id vacancies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByidVacancies(long idVacancies) throws SystemException {
		for (Vacancies vacancies : findByidVacancies(idVacancies,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vacancies);
		}
	}

	/**
	 * Returns the number of vacancieses where idVacancies = &#63;.
	 *
	 * @param idVacancies the id vacancies
	 * @return the number of matching vacancieses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByidVacancies(long idVacancies) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_IDVACANCIES;

		Object[] finderArgs = new Object[] { idVacancies };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VACANCIES_WHERE);

			query.append(_FINDER_COLUMN_IDVACANCIES_IDVACANCIES_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(idVacancies);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_IDVACANCIES_IDVACANCIES_2 = "vacancies.idVacancies = ?";

	public VacanciesPersistenceImpl() {
		setModelClass(Vacancies.class);
	}

	/**
	 * Caches the vacancies in the entity cache if it is enabled.
	 *
	 * @param vacancies the vacancies
	 */
	@Override
	public void cacheResult(Vacancies vacancies) {
		EntityCacheUtil.putResult(VacanciesModelImpl.ENTITY_CACHE_ENABLED,
			VacanciesImpl.class, vacancies.getPrimaryKey(), vacancies);

		vacancies.resetOriginalValues();
	}

	/**
	 * Caches the vacancieses in the entity cache if it is enabled.
	 *
	 * @param vacancieses the vacancieses
	 */
	@Override
	public void cacheResult(List<Vacancies> vacancieses) {
		for (Vacancies vacancies : vacancieses) {
			if (EntityCacheUtil.getResult(
						VacanciesModelImpl.ENTITY_CACHE_ENABLED,
						VacanciesImpl.class, vacancies.getPrimaryKey()) == null) {
				cacheResult(vacancies);
			}
			else {
				vacancies.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vacancieses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(VacanciesImpl.class.getName());
		}

		EntityCacheUtil.clearCache(VacanciesImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vacancies.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Vacancies vacancies) {
		EntityCacheUtil.removeResult(VacanciesModelImpl.ENTITY_CACHE_ENABLED,
			VacanciesImpl.class, vacancies.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Vacancies> vacancieses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Vacancies vacancies : vacancieses) {
			EntityCacheUtil.removeResult(VacanciesModelImpl.ENTITY_CACHE_ENABLED,
				VacanciesImpl.class, vacancies.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vacancies with the primary key. Does not add the vacancies to the database.
	 *
	 * @param idVacancies the primary key for the new vacancies
	 * @return the new vacancies
	 */
	@Override
	public Vacancies create(long idVacancies) {
		Vacancies vacancies = new VacanciesImpl();

		vacancies.setNew(true);
		vacancies.setPrimaryKey(idVacancies);

		return vacancies;
	}

	/**
	 * Removes the vacancies with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param idVacancies the primary key of the vacancies
	 * @return the vacancies that was removed
	 * @throws service.NoSuchVacanciesException if a vacancies with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Vacancies remove(long idVacancies)
		throws NoSuchVacanciesException, SystemException {
		return remove((Serializable)idVacancies);
	}

	/**
	 * Removes the vacancies with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vacancies
	 * @return the vacancies that was removed
	 * @throws service.NoSuchVacanciesException if a vacancies with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Vacancies remove(Serializable primaryKey)
		throws NoSuchVacanciesException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Vacancies vacancies = (Vacancies)session.get(VacanciesImpl.class,
					primaryKey);

			if (vacancies == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVacanciesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vacancies);
		}
		catch (NoSuchVacanciesException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Vacancies removeImpl(Vacancies vacancies)
		throws SystemException {
		vacancies = toUnwrappedModel(vacancies);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vacancies)) {
				vacancies = (Vacancies)session.get(VacanciesImpl.class,
						vacancies.getPrimaryKeyObj());
			}

			if (vacancies != null) {
				session.delete(vacancies);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vacancies != null) {
			clearCache(vacancies);
		}

		return vacancies;
	}

	@Override
	public Vacancies updateImpl(service.model.Vacancies vacancies)
		throws SystemException {
		vacancies = toUnwrappedModel(vacancies);

		boolean isNew = vacancies.isNew();

		VacanciesModelImpl vacanciesModelImpl = (VacanciesModelImpl)vacancies;

		Session session = null;

		try {
			session = openSession();

			if (vacancies.isNew()) {
				session.save(vacancies);

				vacancies.setNew(false);
			}
			else {
				session.merge(vacancies);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VacanciesModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vacanciesModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IDVACANCIES.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vacanciesModelImpl.getOriginalIdVacancies()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_IDVACANCIES,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IDVACANCIES,
					args);

				args = new Object[] { vacanciesModelImpl.getIdVacancies() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_IDVACANCIES,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IDVACANCIES,
					args);
			}
		}

		EntityCacheUtil.putResult(VacanciesModelImpl.ENTITY_CACHE_ENABLED,
			VacanciesImpl.class, vacancies.getPrimaryKey(), vacancies);

		return vacancies;
	}

	protected Vacancies toUnwrappedModel(Vacancies vacancies) {
		if (vacancies instanceof VacanciesImpl) {
			return vacancies;
		}

		VacanciesImpl vacanciesImpl = new VacanciesImpl();

		vacanciesImpl.setNew(vacancies.isNew());
		vacanciesImpl.setPrimaryKey(vacancies.getPrimaryKey());

		vacanciesImpl.setIdVacancies(vacancies.getIdVacancies());
		vacanciesImpl.setNameVacancy(vacancies.getNameVacancy());
		vacanciesImpl.setSalary(vacancies.getSalary());
		vacanciesImpl.setEmployer(vacancies.getEmployer());
		vacanciesImpl.setPublished_at(vacancies.getPublished_at());
		vacanciesImpl.setNumberVacancy(vacancies.getNumberVacancy());

		return vacanciesImpl;
	}

	/**
	 * Returns the vacancies with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vacancies
	 * @return the vacancies
	 * @throws service.NoSuchVacanciesException if a vacancies with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Vacancies findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVacanciesException, SystemException {
		Vacancies vacancies = fetchByPrimaryKey(primaryKey);

		if (vacancies == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVacanciesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vacancies;
	}

	/**
	 * Returns the vacancies with the primary key or throws a {@link service.NoSuchVacanciesException} if it could not be found.
	 *
	 * @param idVacancies the primary key of the vacancies
	 * @return the vacancies
	 * @throws service.NoSuchVacanciesException if a vacancies with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Vacancies findByPrimaryKey(long idVacancies)
		throws NoSuchVacanciesException, SystemException {
		return findByPrimaryKey((Serializable)idVacancies);
	}

	/**
	 * Returns the vacancies with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vacancies
	 * @return the vacancies, or <code>null</code> if a vacancies with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Vacancies fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Vacancies vacancies = (Vacancies)EntityCacheUtil.getResult(VacanciesModelImpl.ENTITY_CACHE_ENABLED,
				VacanciesImpl.class, primaryKey);

		if (vacancies == _nullVacancies) {
			return null;
		}

		if (vacancies == null) {
			Session session = null;

			try {
				session = openSession();

				vacancies = (Vacancies)session.get(VacanciesImpl.class,
						primaryKey);

				if (vacancies != null) {
					cacheResult(vacancies);
				}
				else {
					EntityCacheUtil.putResult(VacanciesModelImpl.ENTITY_CACHE_ENABLED,
						VacanciesImpl.class, primaryKey, _nullVacancies);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(VacanciesModelImpl.ENTITY_CACHE_ENABLED,
					VacanciesImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vacancies;
	}

	/**
	 * Returns the vacancies with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param idVacancies the primary key of the vacancies
	 * @return the vacancies, or <code>null</code> if a vacancies with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Vacancies fetchByPrimaryKey(long idVacancies)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)idVacancies);
	}

	/**
	 * Returns all the vacancieses.
	 *
	 * @return the vacancieses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Vacancies> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<Vacancies> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

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
	@Override
	public List<Vacancies> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<Vacancies> list = (List<Vacancies>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_VACANCIES);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VACANCIES;

				if (pagination) {
					sql = sql.concat(VacanciesModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Vacancies>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Vacancies>(list);
				}
				else {
					list = (List<Vacancies>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the vacancieses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Vacancies vacancies : findAll()) {
			remove(vacancies);
		}
	}

	/**
	 * Returns the number of vacancieses.
	 *
	 * @return the number of vacancieses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VACANCIES);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the vacancies persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.service.model.Vacancies")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Vacancies>> listenersList = new ArrayList<ModelListener<Vacancies>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Vacancies>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(VacanciesImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_VACANCIES = "SELECT vacancies FROM Vacancies vacancies";
	private static final String _SQL_SELECT_VACANCIES_WHERE = "SELECT vacancies FROM Vacancies vacancies WHERE ";
	private static final String _SQL_COUNT_VACANCIES = "SELECT COUNT(vacancies) FROM Vacancies vacancies";
	private static final String _SQL_COUNT_VACANCIES_WHERE = "SELECT COUNT(vacancies) FROM Vacancies vacancies WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vacancies.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Vacancies exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Vacancies exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(VacanciesPersistenceImpl.class);
	private static Vacancies _nullVacancies = new VacanciesImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Vacancies> toCacheModel() {
				return _nullVacanciesCacheModel;
			}
		};

	private static CacheModel<Vacancies> _nullVacanciesCacheModel = new CacheModel<Vacancies>() {
			@Override
			public Vacancies toEntityModel() {
				return _nullVacancies;
			}
		};
}