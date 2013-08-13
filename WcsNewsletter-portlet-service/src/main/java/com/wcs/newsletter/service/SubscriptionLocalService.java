package com.wcs.newsletter.service;

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

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.service.BaseLocalService;
import com.liferay.portal.service.InvokableLocalService;
import com.liferay.portal.service.PersistedModelLocalService;

/**
 * The interface for the subscription local service.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SubscriptionLocalServiceUtil
 * @see com.wcs.newsletter.service.base.SubscriptionLocalServiceBaseImpl
 * @see com.wcs.newsletter.service.impl.SubscriptionLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
    PortalException.class, SystemException.class}
)
public interface SubscriptionLocalService extends BaseLocalService,
    InvokableLocalService, PersistedModelLocalService {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link SubscriptionLocalServiceUtil} to access the subscription local service. Add custom service methods to {@link com.wcs.newsletter.service.impl.SubscriptionLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */

    /**
    * Adds the subscription to the database. Also notifies the appropriate model listeners.
    *
    * @param subscription the subscription
    * @return the subscription that was added
    * @throws SystemException if a system exception occurred
    */
    public com.wcs.newsletter.model.Subscription addSubscription(
        com.wcs.newsletter.model.Subscription subscription)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Creates a new subscription with the primary key. Does not add the subscription to the database.
    *
    * @param subscriptionId the primary key for the new subscription
    * @return the new subscription
    */
    public com.wcs.newsletter.model.Subscription createSubscription(
        long subscriptionId);

    /**
    * Deletes the subscription with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param subscriptionId the primary key of the subscription
    * @return the subscription that was removed
    * @throws PortalException if a subscription with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.wcs.newsletter.model.Subscription deleteSubscription(
        long subscriptionId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Deletes the subscription from the database. Also notifies the appropriate model listeners.
    *
    * @param subscription the subscription
    * @return the subscription that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.wcs.newsletter.model.Subscription deleteSubscription(
        com.wcs.newsletter.model.Subscription subscription)
        throws com.liferay.portal.kernel.exception.SystemException;

    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery();

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public com.wcs.newsletter.model.Subscription fetchSubscription(
        long subscriptionId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the subscription with the primary key.
    *
    * @param subscriptionId the primary key of the subscription
    * @return the subscription
    * @throws PortalException if a subscription with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public com.wcs.newsletter.model.Subscription getSubscription(
        long subscriptionId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the subscriptions.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param start the lower bound of the range of subscriptions
    * @param end the upper bound of the range of subscriptions (not inclusive)
    * @return the range of subscriptions
    * @throws SystemException if a system exception occurred
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<com.wcs.newsletter.model.Subscription> getSubscriptions(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of subscriptions.
    *
    * @return the number of subscriptions
    * @throws SystemException if a system exception occurred
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public int getSubscriptionsCount()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Updates the subscription in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param subscription the subscription
    * @return the subscription that was updated
    * @throws SystemException if a system exception occurred
    */
    public com.wcs.newsletter.model.Subscription updateSubscription(
        com.wcs.newsletter.model.Subscription subscription)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Updates the subscription in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param subscription the subscription
    * @param merge whether to merge the subscription with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
    * @return the subscription that was updated
    * @throws SystemException if a system exception occurred
    */
    public com.wcs.newsletter.model.Subscription updateSubscription(
        com.wcs.newsletter.model.Subscription subscription, boolean merge)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public java.lang.String getBeanIdentifier();

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public void setBeanIdentifier(java.lang.String beanIdentifier);

    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable;

    public java.util.List<com.wcs.newsletter.model.Subscription> findByEmail(
        java.lang.String email)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.wcs.newsletter.model.Subscription> findByUserId(
        long userId) throws com.liferay.portal.kernel.exception.SystemException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<com.wcs.newsletter.model.Subscription> getSubscriptions()
        throws com.liferay.portal.kernel.exception.SystemException;
}