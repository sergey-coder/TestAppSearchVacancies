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

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import service.model.Vacancies;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Vacancies in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Vacancies
 * @generated
 */
public class VacanciesCacheModel implements CacheModel<Vacancies>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{idVacancies=");
		sb.append(idVacancies);
		sb.append(", nameVacancy=");
		sb.append(nameVacancy);
		sb.append(", salary=");
		sb.append(salary);
		sb.append(", employer=");
		sb.append(employer);
		sb.append(", published_at=");
		sb.append(published_at);
		sb.append(", numberVacancy=");
		sb.append(numberVacancy);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Vacancies toEntityModel() {
		VacanciesImpl vacanciesImpl = new VacanciesImpl();

		vacanciesImpl.setIdVacancies(idVacancies);

		if (nameVacancy == null) {
			vacanciesImpl.setNameVacancy(StringPool.BLANK);
		}
		else {
			vacanciesImpl.setNameVacancy(nameVacancy);
		}

		if (salary == null) {
			vacanciesImpl.setSalary(StringPool.BLANK);
		}
		else {
			vacanciesImpl.setSalary(salary);
		}

		if (employer == null) {
			vacanciesImpl.setEmployer(StringPool.BLANK);
		}
		else {
			vacanciesImpl.setEmployer(employer);
		}

		if (published_at == null) {
			vacanciesImpl.setPublished_at(StringPool.BLANK);
		}
		else {
			vacanciesImpl.setPublished_at(published_at);
		}

		if (numberVacancy == null) {
			vacanciesImpl.setNumberVacancy(StringPool.BLANK);
		}
		else {
			vacanciesImpl.setNumberVacancy(numberVacancy);
		}

		vacanciesImpl.resetOriginalValues();

		return vacanciesImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		idVacancies = objectInput.readLong();
		nameVacancy = objectInput.readUTF();
		salary = objectInput.readUTF();
		employer = objectInput.readUTF();
		published_at = objectInput.readUTF();
		numberVacancy = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(idVacancies);

		if (nameVacancy == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nameVacancy);
		}

		if (salary == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(salary);
		}

		if (employer == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(employer);
		}

		if (published_at == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(published_at);
		}

		if (numberVacancy == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(numberVacancy);
		}
	}

	public long idVacancies;
	public String nameVacancy;
	public String salary;
	public String employer;
	public String published_at;
	public String numberVacancy;
}