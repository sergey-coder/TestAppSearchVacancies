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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link service.service.http.VacanciesServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see service.service.http.VacanciesServiceSoap
 * @generated
 */
public class VacanciesSoap implements Serializable {
	public static VacanciesSoap toSoapModel(Vacancies model) {
		VacanciesSoap soapModel = new VacanciesSoap();

		soapModel.setIdVacancies(model.getIdVacancies());
		soapModel.setNameVacancy(model.getNameVacancy());
		soapModel.setSalary(model.getSalary());
		soapModel.setEmployer(model.getEmployer());
		soapModel.setPublished_at(model.getPublished_at());
		soapModel.setNumberVacancy(model.getNumberVacancy());

		return soapModel;
	}

	public static VacanciesSoap[] toSoapModels(Vacancies[] models) {
		VacanciesSoap[] soapModels = new VacanciesSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VacanciesSoap[][] toSoapModels(Vacancies[][] models) {
		VacanciesSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VacanciesSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VacanciesSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VacanciesSoap[] toSoapModels(List<Vacancies> models) {
		List<VacanciesSoap> soapModels = new ArrayList<VacanciesSoap>(models.size());

		for (Vacancies model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VacanciesSoap[soapModels.size()]);
	}

	public VacanciesSoap() {
	}

	public long getPrimaryKey() {
		return _idVacancies;
	}

	public void setPrimaryKey(long pk) {
		setIdVacancies(pk);
	}

	public long getIdVacancies() {
		return _idVacancies;
	}

	public void setIdVacancies(long idVacancies) {
		_idVacancies = idVacancies;
	}

	public String getNameVacancy() {
		return _nameVacancy;
	}

	public void setNameVacancy(String nameVacancy) {
		_nameVacancy = nameVacancy;
	}

	public String getSalary() {
		return _salary;
	}

	public void setSalary(String salary) {
		_salary = salary;
	}

	public String getEmployer() {
		return _employer;
	}

	public void setEmployer(String employer) {
		_employer = employer;
	}

	public String getPublished_at() {
		return _published_at;
	}

	public void setPublished_at(String published_at) {
		_published_at = published_at;
	}

	public String getNumberVacancy() {
		return _numberVacancy;
	}

	public void setNumberVacancy(String numberVacancy) {
		_numberVacancy = numberVacancy;
	}

	private long _idVacancies;
	private String _nameVacancy;
	private String _salary;
	private String _employer;
	private String _published_at;
	private String _numberVacancy;
}