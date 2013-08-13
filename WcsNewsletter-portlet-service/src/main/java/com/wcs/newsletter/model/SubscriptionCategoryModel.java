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

import com.wcs.newsletter.service.persistence.SubscriptionCategoryPK;

import java.io.Serializable;

/**
 * The base model interface for the SubscriptionCategory service. Represents a row in the &quot;WcsNewsletter_Subscription_Category&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.wcs.newsletter.model.impl.SubscriptionCategoryModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.wcs.newsletter.model.impl.SubscriptionCategoryImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SubscriptionCategory
 * @see com.wcs.newsletter.model.impl.SubscriptionCategoryImpl
 * @see com.wcs.newsletter.model.impl.SubscriptionCategoryModelImpl
 * @generated
 */
public interface SubscriptionCategoryModel extends BaseModel<SubscriptionCategory> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a subscription category model instance should use the {@link SubscriptionCategory} interface instead.
     */

    /**
     * Returns the primary key of this subscription category.
     *
     * @return the primary key of this subscription category
     */
    public SubscriptionCategoryPK getPrimaryKey();

    /**
     * Sets the primary key of this subscription category.
     *
     * @param primaryKey the primary key of this subscription category
     */
    public void setPrimaryKey(SubscriptionCategoryPK primaryKey);

    /**
     * Returns the subscription ID of this subscription category.
     *
     * @return the subscription ID of this subscription category
     */
    public long getSubscriptionId();

    /**
     * Sets the subscription ID of this subscription category.
     *
     * @param subscriptionId the subscription ID of this subscription category
     */
    public void setSubscriptionId(long subscriptionId);

    /**
     * Returns the category ID of this subscription category.
     *
     * @return the category ID of this subscription category
     */
    public long getCategoryId();

    /**
     * Sets the category ID of this subscription category.
     *
     * @param categoryId the category ID of this subscription category
     */
    public void setCategoryId(long categoryId);

    /**
     * Returns the confirmation key of this subscription category.
     *
     * @return the confirmation key of this subscription category
     */
    @AutoEscape
    public String getConfirmationKey();

    /**
     * Sets the confirmation key of this subscription category.
     *
     * @param confirmationKey the confirmation key of this subscription category
     */
    public void setConfirmationKey(String confirmationKey);

    /**
     * Returns the cancellation key of this subscription category.
     *
     * @return the cancellation key of this subscription category
     */
    @AutoEscape
    public String getCancellationKey();

    /**
     * Sets the cancellation key of this subscription category.
     *
     * @param cancellationKey the cancellation key of this subscription category
     */
    public void setCancellationKey(String cancellationKey);

    /**
     * Returns the status of this subscription category.
     *
     * @return the status of this subscription category
     */
    @AutoEscape
    public String getStatus();

    /**
     * Sets the status of this subscription category.
     *
     * @param status the status of this subscription category
     */
    public void setStatus(String status);

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

    public int compareTo(SubscriptionCategory subscriptionCategory);

    public int hashCode();

    public CacheModel<SubscriptionCategory> toCacheModel();

    public SubscriptionCategory toEscapedModel();

    public String toString();

    public String toXmlString();
}