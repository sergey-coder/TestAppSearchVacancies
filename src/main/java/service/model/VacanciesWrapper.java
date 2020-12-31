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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Vacancies}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Vacancies
 * @generated
 */
public class VacanciesWrapper implements Vacancies, ModelWrapper<Vacancies> {
	public VacanciesWrapper(Vacancies vacancies) {
		_vacancies = vacancies;
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

	/**
	* Returns the primary key of this vacancies.
	*
	* @return the primary key of this vacancies
	*/
	@Override
	public long getPrimaryKey() {
		return _vacancies.getPrimaryKey();
	}

	/**
	* Sets the primary key of this vacancies.
	*
	* @param primaryKey the primary key of this vacancies
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vacancies.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the id vacancies of this vacancies.
	*
	* @return the id vacancies of this vacancies
	*/
	@Override
	public long getIdVacancies() {
		return _vacancies.getIdVacancies();
	}

	/**
	* Sets the id vacancies of this vacancies.
	*
	* @param idVacancies the id vacancies of this vacancies
	*/
	@Override
	public void setIdVacancies(long idVacancies) {
		_vacancies.setIdVacancies(idVacancies);
	}

	/**
	* Returns the name vacancy of this vacancies.
	*
	* @return the name vacancy of this vacancies
	*/
	@Override
	public java.lang.String getNameVacancy() {
		return _vacancies.getNameVacancy();
	}

	/**
	* Sets the name vacancy of this vacancies.
	*
	* @param nameVacancy the name vacancy of this vacancies
	*/
	@Override
	public void setNameVacancy(java.lang.String nameVacancy) {
		_vacancies.setNameVacancy(nameVacancy);
	}

	/**
	* Returns the salary of this vacancies.
	*
	* @return the salary of this vacancies
	*/
	@Override
	public java.lang.String getSalary() {
		return _vacancies.getSalary();
	}

	/**
	* Sets the salary of this vacancies.
	*
	* @param salary the salary of this vacancies
	*/
	@Override
	public void setSalary(java.lang.String salary) {
		_vacancies.setSalary(salary);
	}

	/**
	* Returns the employer of this vacancies.
	*
	* @return the employer of this vacancies
	*/
	@Override
	public java.lang.String getEmployer() {
		return _vacancies.getEmployer();
	}

	/**
	* Sets the employer of this vacancies.
	*
	* @param employer the employer of this vacancies
	*/
	@Override
	public void setEmployer(java.lang.String employer) {
		_vacancies.setEmployer(employer);
	}

	/**
	* Returns the published_at of this vacancies.
	*
	* @return the published_at of this vacancies
	*/
	@Override
	public java.lang.String getPublished_at() {
		return _vacancies.getPublished_at();
	}

	/**
	* Sets the published_at of this vacancies.
	*
	* @param published_at the published_at of this vacancies
	*/
	@Override
	public void setPublished_at(java.lang.String published_at) {
		_vacancies.setPublished_at(published_at);
	}

	/**
	* Returns the number vacancy of this vacancies.
	*
	* @return the number vacancy of this vacancies
	*/
	@Override
	public java.lang.String getNumberVacancy() {
		return _vacancies.getNumberVacancy();
	}

	/**
	* Sets the number vacancy of this vacancies.
	*
	* @param numberVacancy the number vacancy of this vacancies
	*/
	@Override
	public void setNumberVacancy(java.lang.String numberVacancy) {
		_vacancies.setNumberVacancy(numberVacancy);
	}

	@Override
	public boolean isNew() {
		return _vacancies.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_vacancies.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _vacancies.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vacancies.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _vacancies.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _vacancies.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_vacancies.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _vacancies.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_vacancies.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_vacancies.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_vacancies.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new VacanciesWrapper((Vacancies)_vacancies.clone());
	}

	@Override
	public int compareTo(service.model.Vacancies vacancies) {
		return _vacancies.compareTo(vacancies);
	}

	@Override
	public int hashCode() {
		return _vacancies.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<service.model.Vacancies> toCacheModel() {
		return _vacancies.toCacheModel();
	}

	@Override
	public service.model.Vacancies toEscapedModel() {
		return new VacanciesWrapper(_vacancies.toEscapedModel());
	}

	@Override
	public service.model.Vacancies toUnescapedModel() {
		return new VacanciesWrapper(_vacancies.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _vacancies.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vacancies.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_vacancies.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VacanciesWrapper)) {
			return false;
		}

		VacanciesWrapper vacanciesWrapper = (VacanciesWrapper)obj;

		if (Validator.equals(_vacancies, vacanciesWrapper._vacancies)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Vacancies getWrappedVacancies() {
		return _vacancies;
	}

	@Override
	public Vacancies getWrappedModel() {
		return _vacancies;
	}

	@Override
	public void resetOriginalValues() {
		_vacancies.resetOriginalValues();
	}

	private Vacancies _vacancies;
}