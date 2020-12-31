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

package service.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import service.service.ClpSerializer;
import service.service.VacanciesLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Brian Wing Shun Chan
 */
public class VacanciesClp extends BaseModelImpl<Vacancies> implements Vacancies {
	public VacanciesClp() {
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

	@Override
	public long getIdVacancies() {
		return _idVacancies;
	}

	@Override
	public void setIdVacancies(long idVacancies) {
		_idVacancies = idVacancies;

		if (_vacanciesRemoteModel != null) {
			try {
				Class<?> clazz = _vacanciesRemoteModel.getClass();

				Method method = clazz.getMethod("setIdVacancies", long.class);

				method.invoke(_vacanciesRemoteModel, idVacancies);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNameVacancy() {
		return _nameVacancy;
	}

	@Override
	public void setNameVacancy(String nameVacancy) {
		_nameVacancy = nameVacancy;

		if (_vacanciesRemoteModel != null) {
			try {
				Class<?> clazz = _vacanciesRemoteModel.getClass();

				Method method = clazz.getMethod("setNameVacancy", String.class);

				method.invoke(_vacanciesRemoteModel, nameVacancy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSalary() {
		return _salary;
	}

	@Override
	public void setSalary(String salary) {
		_salary = salary;

		if (_vacanciesRemoteModel != null) {
			try {
				Class<?> clazz = _vacanciesRemoteModel.getClass();

				Method method = clazz.getMethod("setSalary", String.class);

				method.invoke(_vacanciesRemoteModel, salary);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEmployer() {
		return _employer;
	}

	@Override
	public void setEmployer(String employer) {
		_employer = employer;

		if (_vacanciesRemoteModel != null) {
			try {
				Class<?> clazz = _vacanciesRemoteModel.getClass();

				Method method = clazz.getMethod("setEmployer", String.class);

				method.invoke(_vacanciesRemoteModel, employer);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPublished_at() {
		return _published_at;
	}

	@Override
	public void setPublished_at(String published_at) {
		_published_at = published_at;

		if (_vacanciesRemoteModel != null) {
			try {
				Class<?> clazz = _vacanciesRemoteModel.getClass();

				Method method = clazz.getMethod("setPublished_at", String.class);

				method.invoke(_vacanciesRemoteModel, published_at);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNumberVacancy() {
		return _numberVacancy;
	}

	@Override
	public void setNumberVacancy(String numberVacancy) {
		_numberVacancy = numberVacancy;

		if (_vacanciesRemoteModel != null) {
			try {
				Class<?> clazz = _vacanciesRemoteModel.getClass();

				Method method = clazz.getMethod("setNumberVacancy", String.class);

				method.invoke(_vacanciesRemoteModel, numberVacancy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getVacanciesRemoteModel() {
		return _vacanciesRemoteModel;
	}

	public void setVacanciesRemoteModel(BaseModel<?> vacanciesRemoteModel) {
		_vacanciesRemoteModel = vacanciesRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _vacanciesRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_vacanciesRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			VacanciesLocalServiceUtil.addVacancies(this);
		}
		else {
			VacanciesLocalServiceUtil.updateVacancies(this);
		}
	}

	@Override
	public Vacancies toEscapedModel() {
		return (Vacancies)ProxyUtil.newProxyInstance(Vacancies.class.getClassLoader(),
			new Class[] { Vacancies.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		VacanciesClp clone = new VacanciesClp();

		clone.setIdVacancies(getIdVacancies());
		clone.setNameVacancy(getNameVacancy());
		clone.setSalary(getSalary());
		clone.setEmployer(getEmployer());
		clone.setPublished_at(getPublished_at());
		clone.setNumberVacancy(getNumberVacancy());

		return clone;
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

		if (!(obj instanceof VacanciesClp)) {
			return false;
		}

		VacanciesClp vacancies = (VacanciesClp)obj;

		long primaryKey = vacancies.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
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

	private long _idVacancies;
	private String _nameVacancy;
	private String _salary;
	private String _employer;
	private String _published_at;
	private String _numberVacancy;
	private BaseModel<?> _vacanciesRemoteModel;
	private Class<?> _clpSerializerClass = service.service.ClpSerializer.class;
}