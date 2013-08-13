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

import java.util.Date;

/**
 * The base model interface for the Newsletter service. Represents a row in the &quot;WcsNewsletter_Newsletter&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.wcs.newsletter.model.impl.NewsletterModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.wcs.newsletter.model.impl.NewsletterImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Newsletter
 * @see com.wcs.newsletter.model.impl.NewsletterImpl
 * @see com.wcs.newsletter.model.impl.NewsletterModelImpl
 * @generated
 */
public interface NewsletterModel extends BaseModel<Newsletter> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a newsletter model instance should use the {@link Newsletter} interface instead.
     */

    /**
     * Returns the primary key of this newsletter.
     *
     * @return the primary key of this newsletter
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this newsletter.
     *
     * @param primaryKey the primary key of this newsletter
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the newsletter ID of this newsletter.
     *
     * @return the newsletter ID of this newsletter
     */
    public long getNewsletterId();

    /**
     * Sets the newsletter ID of this newsletter.
     *
     * @param newsletterId the newsletter ID of this newsletter
     */
    public void setNewsletterId(long newsletterId);

    /**
     * Returns the subject of this newsletter.
     *
     * @return the subject of this newsletter
     */
    @AutoEscape
    public String getSubject();

    /**
     * Sets the subject of this newsletter.
     *
     * @param subject the subject of this newsletter
     */
    public void setSubject(String subject);

    /**
     * Returns the sender of this newsletter.
     *
     * @return the sender of this newsletter
     */
    @AutoEscape
    public String getSender();

    /**
     * Sets the sender of this newsletter.
     *
     * @param sender the sender of this newsletter
     */
    public void setSender(String sender);

    /**
     * Returns the content ID of this newsletter.
     *
     * @return the content ID of this newsletter
     */
    @AutoEscape
    public String getContentId();

    /**
     * Sets the content ID of this newsletter.
     *
     * @param contentId the content ID of this newsletter
     */
    public void setContentId(String contentId);

    /**
     * Returns the content version of this newsletter.
     *
     * @return the content version of this newsletter
     */
    @AutoEscape
    public String getContentVersion();

    /**
     * Sets the content version of this newsletter.
     *
     * @param contentVersion the content version of this newsletter
     */
    public void setContentVersion(String contentVersion);

    /**
     * Returns the template ID of this newsletter.
     *
     * @return the template ID of this newsletter
     */
    @AutoEscape
    public String getTemplateId();

    /**
     * Sets the template ID of this newsletter.
     *
     * @param templateId the template ID of this newsletter
     */
    public void setTemplateId(String templateId);

    /**
     * Returns the template version of this newsletter.
     *
     * @return the template version of this newsletter
     */
    @AutoEscape
    public String getTemplateVersion();

    /**
     * Sets the template version of this newsletter.
     *
     * @param templateVersion the template version of this newsletter
     */
    public void setTemplateVersion(String templateVersion);

    /**
     * Returns the parent ID of this newsletter.
     *
     * @return the parent ID of this newsletter
     */
    public long getParentId();

    /**
     * Sets the parent ID of this newsletter.
     *
     * @param parentId the parent ID of this newsletter
     */
    public void setParentId(long parentId);

    /**
     * Returns the creation time of this newsletter.
     *
     * @return the creation time of this newsletter
     */
    public Date getCreationTime();

    /**
     * Sets the creation time of this newsletter.
     *
     * @param creationTime the creation time of this newsletter
     */
    public void setCreationTime(Date creationTime);

    /**
     * Returns the state of this newsletter.
     *
     * @return the state of this newsletter
     */
    @AutoEscape
    public String getState();

    /**
     * Sets the state of this newsletter.
     *
     * @param state the state of this newsletter
     */
    public void setState(String state);

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

    public int compareTo(Newsletter newsletter);

    public int hashCode();

    public CacheModel<Newsletter> toCacheModel();

    public Newsletter toEscapedModel();

    public String toString();

    public String toXmlString();
}
