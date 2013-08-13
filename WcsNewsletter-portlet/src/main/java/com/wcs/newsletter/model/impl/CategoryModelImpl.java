package com.wcs.newsletter.model.impl;

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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.wcs.newsletter.model.Category;
import com.wcs.newsletter.model.CategoryModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the Category service. Represents a row in the &quot;WcsNewsletter_Category&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.wcs.newsletter.model.CategoryModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CategoryImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CategoryImpl
 * @see com.wcs.newsletter.model.Category
 * @see com.wcs.newsletter.model.CategoryModel
 * @generated
 */
public class CategoryModelImpl extends BaseModelImpl<Category>
    implements CategoryModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a category model instance should use the {@link com.wcs.newsletter.model.Category} interface instead.
     */
    public static final String TABLE_NAME = "WcsNewsletter_Category";
    public static final Object[][] TABLE_COLUMNS = {
            { "categoryId", Types.BIGINT },
            { "name", Types.VARCHAR },
            { "locale", Types.VARCHAR }
        };
    public static final String TABLE_SQL_CREATE = "create table WcsNewsletter_Category (categoryId LONG not null primary key,name VARCHAR(75) null,locale VARCHAR(75) null)";
    public static final String TABLE_SQL_DROP = "drop table WcsNewsletter_Category";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.wcs.newsletter.model.Category"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.wcs.newsletter.model.Category"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.column.bitmask.enabled.com.wcs.newsletter.model.Category"),
            true);
    public static long LOCALE_COLUMN_BITMASK = 1L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.wcs.newsletter.model.Category"));
    private static ClassLoader _classLoader = Category.class.getClassLoader();
    private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
            Category.class
        };
    private long _categoryId;
    private String _name;
    private String _locale;
    private String _originalLocale;
    private long _columnBitmask;
    private Category _escapedModelProxy;

    public CategoryModelImpl() {
    }

    public long getPrimaryKey() {
        return _categoryId;
    }

    public void setPrimaryKey(long primaryKey) {
        setCategoryId(primaryKey);
    }

    public Serializable getPrimaryKeyObj() {
        return new Long(_categoryId);
    }

    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    public Class<?> getModelClass() {
        return Category.class;
    }

    public String getModelClassName() {
        return Category.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("categoryId", getCategoryId());
        attributes.put("name", getName());
        attributes.put("locale", getLocale());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long categoryId = (Long) attributes.get("categoryId");

        if (categoryId != null) {
            setCategoryId(categoryId);
        }

        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
        }

        String locale = (String) attributes.get("locale");

        if (locale != null) {
            setLocale(locale);
        }
    }

    public long getCategoryId() {
        return _categoryId;
    }

    public void setCategoryId(long categoryId) {
        _categoryId = categoryId;
    }

    public String getName() {
        if (_name == null) {
            return StringPool.BLANK;
        } else {
            return _name;
        }
    }

    public void setName(String name) {
        _name = name;
    }

    public String getLocale() {
        if (_locale == null) {
            return StringPool.BLANK;
        } else {
            return _locale;
        }
    }

    public void setLocale(String locale) {
        _columnBitmask |= LOCALE_COLUMN_BITMASK;

        if (_originalLocale == null) {
            _originalLocale = _locale;
        }

        _locale = locale;
    }

    public String getOriginalLocale() {
        return GetterUtil.getString(_originalLocale);
    }

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
            Category.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public Category toEscapedModel() {
        if (_escapedModelProxy == null) {
            _escapedModelProxy = (Category) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelProxyInterfaces,
                    new AutoEscapeBeanHandler(this));
        }

        return _escapedModelProxy;
    }

    @Override
    public Object clone() {
        CategoryImpl categoryImpl = new CategoryImpl();

        categoryImpl.setCategoryId(getCategoryId());
        categoryImpl.setName(getName());
        categoryImpl.setLocale(getLocale());

        categoryImpl.resetOriginalValues();

        return categoryImpl;
    }

    public int compareTo(Category category) {
        long primaryKey = category.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        Category category = null;

        try {
            category = (Category) obj;
        } catch (ClassCastException cce) {
            return false;
        }

        long primaryKey = category.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public void resetOriginalValues() {
        CategoryModelImpl categoryModelImpl = this;

        categoryModelImpl._originalLocale = categoryModelImpl._locale;

        categoryModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<Category> toCacheModel() {
        CategoryCacheModel categoryCacheModel = new CategoryCacheModel();

        categoryCacheModel.categoryId = getCategoryId();

        categoryCacheModel.name = getName();

        String name = categoryCacheModel.name;

        if ((name != null) && (name.length() == 0)) {
            categoryCacheModel.name = null;
        }

        categoryCacheModel.locale = getLocale();

        String locale = categoryCacheModel.locale;

        if ((locale != null) && (locale.length() == 0)) {
            categoryCacheModel.locale = null;
        }

        return categoryCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(7);

        sb.append("{categoryId=");
        sb.append(getCategoryId());
        sb.append(", name=");
        sb.append(getName());
        sb.append(", locale=");
        sb.append(getLocale());
        sb.append("}");

        return sb.toString();
    }

    public String toXmlString() {
        StringBundler sb = new StringBundler(13);

        sb.append("<model><model-name>");
        sb.append("com.wcs.newsletter.model.Category");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>categoryId</column-name><column-value><![CDATA[");
        sb.append(getCategoryId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>name</column-name><column-value><![CDATA[");
        sb.append(getName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>locale</column-name><column-value><![CDATA[");
        sb.append(getLocale());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}