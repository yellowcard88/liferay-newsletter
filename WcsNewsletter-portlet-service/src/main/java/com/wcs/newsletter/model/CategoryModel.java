package com.wcs.newsletter.model;

/*
 * #%L
 * Webstar Newsletter
 * %%
 * Copyright (C) 2013 Webstar Csoport Kft.
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the 
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public 
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the Category service. Represents a row in the &quot;WcsNewsletter_Category&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.wcs.newsletter.model.impl.CategoryModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.wcs.newsletter.model.impl.CategoryImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Category
 * @see com.wcs.newsletter.model.impl.CategoryImpl
 * @see com.wcs.newsletter.model.impl.CategoryModelImpl
 * @generated
 */
public interface CategoryModel extends BaseModel<Category> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a category model instance should use the {@link Category} interface instead.
     */

    /**
     * Returns the primary key of this category.
     *
     * @return the primary key of this category
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this category.
     *
     * @param primaryKey the primary key of this category
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the category ID of this category.
     *
     * @return the category ID of this category
     */
    public long getCategoryId();

    /**
     * Sets the category ID of this category.
     *
     * @param categoryId the category ID of this category
     */
    public void setCategoryId(long categoryId);

    /**
     * Returns the name of this category.
     *
     * @return the name of this category
     */
    @AutoEscape
    public String getName();

    /**
     * Sets the name of this category.
     *
     * @param name the name of this category
     */
    public void setName(String name);

    /**
     * Returns the locale of this category.
     *
     * @return the locale of this category
     */
    @AutoEscape
    public String getLocale();

    /**
     * Sets the locale of this category.
     *
     * @param locale the locale of this category
     */
    public void setLocale(String locale);

    public boolean isNew();

    public void setNew(boolean n);

    public boolean isCachedModel();

    public void setCachedModel(boolean cachedModel);

    public boolean isEscapedModel();

    public Serializable getPrimaryKeyObj();

    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    public ExpandoBridge getExpandoBridge();

    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    public Object clone();

    public int compareTo(Category category);

    public int hashCode();

    public CacheModel<Category> toCacheModel();

    public Category toEscapedModel();

    public String toString();

    public String toXmlString();
}