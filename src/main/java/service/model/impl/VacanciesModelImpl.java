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

package service.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import service.model.Vacancies;
import service.model.VacanciesModel;
import service.model.VacanciesSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Vacancies service. Represents a row in the &quot;SearchVacanses_Vacancies&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link service.model.VacanciesModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link VacanciesImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VacanciesImpl
 * @see service.model.Vacancies
 * @see service.model.VacanciesModel
 * @generated
 */
@JSON(strict = true)
public class VacanciesModelImpl extends BaseModelImpl<Vacancies>
	implements VacanciesModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a vacancies model instance should use the {@link service.model.Vacancies} interface instead.
	 */
	public static final String TABLE_NAME = "SearchVacanses_Vacancies";
	public static final Object[][] TABLE_COLUMNS = {
			{ "idVacancies", Types.BIGINT },
			{ "nameVacancy", Types.VARCHAR },
			{ "salary", Types.VARCHAR },
			{ "employer", Types.VARCHAR },
			{ "published_at", Types.VARCHAR },
			{ "numberVacancy", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table SearchVacanses_Vacancies (idVacancies LONG not null primary key,nameVacancy VARCHAR(75) null,salary VARCHAR(75) null,employer VARCHAR(75) null,published_at VARCHAR(75) null,numberVacancy VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table SearchVacanses_Vacancies";
	public static final String ORDER_BY_JPQL = " ORDER BY vacancies.idVacancies DESC";
	public static final String ORDER_BY_SQL = " ORDER BY SearchVacanses_Vacancies.idVacancies DESC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.service.model.Vacancies"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.service.model.Vacancies"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.service.model.Vacancies"),
			true);
	public static long IDVACANCIES_COLUMN_BITMASK = 1L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Vacancies toModel(VacanciesSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Vacancies model = new VacanciesImpl();

		model.setIdVacancies(soapModel.getIdVacancies());
		model.setNameVacancy(soapModel.getNameVacancy());
		model.setSalary(soapModel.getSalary());
		model.setEmployer(soapModel.getEmployer());
		model.setPublished_at(soapModel.getPublished_at());
		model.setNumberVacancy(soapModel.getNumberVacancy());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Vacancies> toModels(VacanciesSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Vacancies> models = new ArrayList<Vacancies>(soapModels.length);

		for (VacanciesSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.service.model.Vacancies"));

	public VacanciesModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _idVacancies;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setIdVacancies(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _idVacancies;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Vacancies.class;
	}

	@Override
	public String getModelClassName() {
		return Vacancies.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("idVacancies", getIdVacancies());
		attributes.put("nameVacancy", getNameVacancy());
		attributes.put("salary", getSalary());
		attributes.put("employer", getEmployer());
		attributes.put("published_at", getPublished_at());
		attributes.put("numberVacancy", getNumberVacancy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long idVacancies = (Long)attributes.get("idVacancies");

		if (idVacancies != null) {
			setIdVacancies(idVacancies);
		}

		String nameVacancy = (String)attributes.get("nameVacancy");

		if (nameVacancy != null) {
			setNameVacancy(nameVacancy);
		}

		String salary = (String)attributes.get("salary");

		if (salary != null) {
			setSalary(salary);
		}

		String employer = (String)attributes.get("employer");

		if (employer != null) {
			setEmployer(employer);
		}

		String published_at = (String)attributes.get("published_at");

		if (published_at != null) {
			setPublished_at(published_at);
		}

		String numberVacancy = (String)attributes.get("numberVacancy");

		if (numberVacancy != null) {
			setNumberVacancy(numberVacancy);
		}
	}

	@JSON
	@Override
	public long getIdVacancies() {
		return _idVacancies;
	}

	@Override
	public void setIdVacancies(long idVacancies) {
		_columnBitmask = -1L;

		if (!_setOriginalIdVacancies) {
			_setOriginalIdVacancies = true;

			_originalIdVacancies = _idVacancies;
		}

		_idVacancies = idVacancies;
	}

	public long getOriginalIdVacancies() {
		return _originalIdVacancies;
	}

	@JSON
	@Override
	public String getNameVacancy() {
		if (_nameVacancy == null) {
			return StringPool.BLANK;
		}
		else {
			return _nameVacancy;
		}
	}

	@Override
	public void setNameVacancy(String nameVacancy) {
		_nameVacancy = nameVacancy;
	}

	@JSON
	@Override
	public String getSalary() {
		if (_salary == null) {
			return StringPool.BLANK;
		}
		else {
			return _salary;
		}
	}

	@Override
	public void setSalary(String salary) {
		_salary = salary;
	}

	@JSON
	@Override
	public String getEmployer() {
		if (_employer == null) {
			return StringPool.BLANK;
		}
		else {
			return _employer;
		}
	}

	@Override
	public void setEmployer(String employer) {
		_employer = employer;
	}

	@JSON
	@Override
	public String getPublished_at() {
		if (_published_at == null) {
			return StringPool.BLANK;
		}
		else {
			return _published_at;
		}
	}

	@Override
	public void setPublished_at(String published_at) {
		_published_at = published_at;
	}

	@JSON
	@Override
	public String getNumberVacancy() {
		if (_numberVacancy == null) {
			return StringPool.BLANK;
		}
		else {
			return _numberVacancy;
		}
	}

	@Override
	public void setNumberVacancy(String numberVacancy) {
		_numberVacancy = numberVacancy;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			Vacancies.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Vacancies toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Vacancies)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		VacanciesImpl vacanciesImpl = new VacanciesImpl();

		vacanciesImpl.setIdVacancies(getIdVacancies());
		vacanciesImpl.setNameVacancy(getNameVacancy());
		vacanciesImpl.setSalary(getSalary());
		vacanciesImpl.setEmployer(getEmployer());
		vacanciesImpl.setPublished_at(getPublished_at());
		vacanciesImpl.setNumberVacancy(getNumberVacancy());

		vacanciesImpl.resetOriginalValues();

		return vacanciesImpl;
	}

	@Override
	public int compareTo(Vacancies vacancies) {
		int value = 0;

		if (getIdVacancies() < vacancies.getIdVacancies()) {
			value = -1;
		}
		else if (getIdVacancies() > vacancies.getIdVacancies()) {
			value = 1;
		}
		else {
			value = 0;
		}

		value = value * -1;

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Vacancies)) {
			return false;
		}

		Vacancies vacancies = (Vacancies)obj;

		long primaryKey = vacancies.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		VacanciesModelImpl vacanciesModelImpl = this;

		vacanciesModelImpl._originalIdVacancies = vacanciesModelImpl._idVacancies;

		vacanciesModelImpl._setOriginalIdVacancies = false;

		vacanciesModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Vacancies> toCacheModel() {
		VacanciesCacheModel vacanciesCacheModel = new VacanciesCacheModel();

		vacanciesCacheModel.idVacancies = getIdVacancies();

		vacanciesCacheModel.nameVacancy = getNameVacancy();

		String nameVacancy = vacanciesCacheModel.nameVacancy;

		if ((nameVacancy != null) && (nameVacancy.length() == 0)) {
			vacanciesCacheModel.nameVacancy = null;
		}

		vacanciesCacheModel.salary = getSalary();

		String salary = vacanciesCacheModel.salary;

		if ((salary != null) && (salary.length() == 0)) {
			vacanciesCacheModel.salary = null;
		}

		vacanciesCacheModel.employer = getEmployer();

		String employer = vacanciesCacheModel.employer;

		if ((employer != null) && (employer.length() == 0)) {
			vacanciesCacheModel.employer = null;
		}

		vacanciesCacheModel.published_at = getPublished_at();

		String published_at = vacanciesCacheModel.published_at;

		if ((published_at != null) && (published_at.length() == 0)) {
			vacanciesCacheModel.published_at = null;
		}

		vacanciesCacheModel.numberVacancy = getNumberVacancy();

		String numberVacancy = vacanciesCacheModel.numberVacancy;

		if ((numberVacancy != null) && (numberVacancy.length() == 0)) {
			vacanciesCacheModel.numberVacancy = null;
		}

		return vacanciesCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{idVacancies=");
		sb.append(getIdVacancies());
		sb.append(", nameVacancy=");
		sb.append(getNameVacancy());
		sb.append(", salary=");
		sb.append(getSalary());
		sb.append(", employer=");
		sb.append(getEmployer());
		sb.append(", published_at=");
		sb.append(getPublished_at());
		sb.append(", numberVacancy=");
		sb.append(getNumberVacancy());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("service.model.Vacancies");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>idVacancies</column-name><column-value><![CDATA[");
		sb.append(getIdVacancies());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nameVacancy</column-name><column-value><![CDATA[");
		sb.append(getNameVacancy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>salary</column-name><column-value><![CDATA[");
		sb.append(getSalary());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>employer</column-name><column-value><![CDATA[");
		sb.append(getEmployer());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>published_at</column-name><column-value><![CDATA[");
		sb.append(getPublished_at());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>numberVacancy</column-name><column-value><![CDATA[");
		sb.append(getNumberVacancy());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = Vacancies.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			Vacancies.class
		};
	private long _idVacancies;
	private long _originalIdVacancies;
	private boolean _setOriginalIdVacancies;
	private String _nameVacancy;
	private String _salary;
	private String _employer;
	private String _published_at;
	private String _numberVacancy;
	private long _columnBitmask;
	private Vacancies _escapedModel;
}