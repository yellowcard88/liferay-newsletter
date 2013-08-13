package com.wcs.newsletter.service.base;

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

import com.liferay.counter.service.CounterLocalService;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.ResourceLocalService;
import com.liferay.portal.service.ResourceService;
import com.liferay.portal.service.UserLocalService;
import com.liferay.portal.service.UserService;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;

import com.wcs.newsletter.model.SubscriptionCategory;
import com.wcs.newsletter.service.CategoryLocalService;
import com.wcs.newsletter.service.LabelLocalService;
import com.wcs.newsletter.service.NewsletterConfigLocalService;
import com.wcs.newsletter.service.NewsletterLocalService;
import com.wcs.newsletter.service.RecipientLocalService;
import com.wcs.newsletter.service.SubscriptionCategoryLocalService;
import com.wcs.newsletter.service.SubscriptionLocalService;
import com.wcs.newsletter.service.persistence.CategoryPersistence;
import com.wcs.newsletter.service.persistence.LabelPersistence;
import com.wcs.newsletter.service.persistence.NewsletterConfigPersistence;
import com.wcs.newsletter.service.persistence.NewsletterPersistence;
import com.wcs.newsletter.service.persistence.RecipientPersistence;
import com.wcs.newsletter.service.persistence.SubscriptionCategoryPK;
import com.wcs.newsletter.service.persistence.SubscriptionCategoryPersistence;
import com.wcs.newsletter.service.persistence.SubscriptionPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * The base implementation of the subscription category local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.wcs.newsletter.service.impl.SubscriptionCategoryLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.wcs.newsletter.service.impl.SubscriptionCategoryLocalServiceImpl
 * @see com.wcs.newsletter.service.SubscriptionCategoryLocalServiceUtil
 * @generated
 */
public abstract class SubscriptionCategoryLocalServiceBaseImpl
    extends BaseLocalServiceImpl implements SubscriptionCategoryLocalService,
        IdentifiableBean {
    @BeanReference(type = CategoryLocalService.class)
    protected CategoryLocalService categoryLocalService;
    @BeanReference(type = CategoryPersistence.class)
    protected CategoryPersistence categoryPersistence;
    @BeanReference(type = LabelLocalService.class)
    protected LabelLocalService labelLocalService;
    @BeanReference(type = LabelPersistence.class)
    protected LabelPersistence labelPersistence;
    @BeanReference(type = NewsletterLocalService.class)
    protected NewsletterLocalService newsletterLocalService;
    @BeanReference(type = NewsletterPersistence.class)
    protected NewsletterPersistence newsletterPersistence;
    @BeanReference(type = NewsletterConfigLocalService.class)
    protected NewsletterConfigLocalService newsletterConfigLocalService;
    @BeanReference(type = NewsletterConfigPersistence.class)
    protected NewsletterConfigPersistence newsletterConfigPersistence;
    @BeanReference(type = RecipientLocalService.class)
    protected RecipientLocalService recipientLocalService;
    @BeanReference(type = RecipientPersistence.class)
    protected RecipientPersistence recipientPersistence;
    @BeanReference(type = SubscriptionLocalService.class)
    protected SubscriptionLocalService subscriptionLocalService;
    @BeanReference(type = SubscriptionPersistence.class)
    protected SubscriptionPersistence subscriptionPersistence;
    @BeanReference(type = SubscriptionCategoryLocalService.class)
    protected SubscriptionCategoryLocalService subscriptionCategoryLocalService;
    @BeanReference(type = SubscriptionCategoryPersistence.class)
    protected SubscriptionCategoryPersistence subscriptionCategoryPersistence;
    @BeanReference(type = CounterLocalService.class)
    protected CounterLocalService counterLocalService;
    @BeanReference(type = ResourceLocalService.class)
    protected ResourceLocalService resourceLocalService;
    @BeanReference(type = ResourceService.class)
    protected ResourceService resourceService;
    @BeanReference(type = ResourcePersistence.class)
    protected ResourcePersistence resourcePersistence;
    @BeanReference(type = UserLocalService.class)
    protected UserLocalService userLocalService;
    @BeanReference(type = UserService.class)
    protected UserService userService;
    @BeanReference(type = UserPersistence.class)
    protected UserPersistence userPersistence;
    private String _beanIdentifier;
    private SubscriptionCategoryLocalServiceClpInvoker _clpInvoker = new SubscriptionCategoryLocalServiceClpInvoker();

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link com.wcs.newsletter.service.SubscriptionCategoryLocalServiceUtil} to access the subscription category local service.
     */

    /**
     * Adds the subscription category to the database. Also notifies the appropriate model listeners.
     *
     * @param subscriptionCategory the subscription category
     * @return the subscription category that was added
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    public SubscriptionCategory addSubscriptionCategory(
        SubscriptionCategory subscriptionCategory) throws SystemException {
        subscriptionCategory.setNew(true);

        return subscriptionCategoryPersistence.update(subscriptionCategory,
            false);
    }

    /**
     * Creates a new subscription category with the primary key. Does not add the subscription category to the database.
     *
     * @param subscriptionCategoryPK the primary key for the new subscription category
     * @return the new subscription category
     */
    public SubscriptionCategory createSubscriptionCategory(
        SubscriptionCategoryPK subscriptionCategoryPK) {
        return subscriptionCategoryPersistence.create(subscriptionCategoryPK);
    }

    /**
     * Deletes the subscription category with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param subscriptionCategoryPK the primary key of the subscription category
     * @return the subscription category that was removed
     * @throws PortalException if a subscription category with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    public SubscriptionCategory deleteSubscriptionCategory(
        SubscriptionCategoryPK subscriptionCategoryPK)
        throws PortalException, SystemException {
        return subscriptionCategoryPersistence.remove(subscriptionCategoryPK);
    }

    /**
     * Deletes the subscription category from the database. Also notifies the appropriate model listeners.
     *
     * @param subscriptionCategory the subscription category
     * @return the subscription category that was removed
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    public SubscriptionCategory deleteSubscriptionCategory(
        SubscriptionCategory subscriptionCategory) throws SystemException {
        return subscriptionCategoryPersistence.remove(subscriptionCategory);
    }

    public DynamicQuery dynamicQuery() {
        Class<?> clazz = getClass();

        return DynamicQueryFactoryUtil.forClass(SubscriptionCategory.class,
            clazz.getClassLoader());
    }

    /**
     * Performs a dynamic query on the database and returns the matching rows.
     *
     * @param dynamicQuery the dynamic query
     * @return the matching rows
     * @throws SystemException if a system exception occurred
     */
    @SuppressWarnings("rawtypes")
    public List dynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return subscriptionCategoryPersistence.findWithDynamicQuery(dynamicQuery);
    }

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
    public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return subscriptionCategoryPersistence.findWithDynamicQuery(dynamicQuery,
            start, end);
    }

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
    public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return subscriptionCategoryPersistence.findWithDynamicQuery(dynamicQuery,
            start, end, orderByComparator);
    }

    /**
     * Returns the number of rows that match the dynamic query.
     *
     * @param dynamicQuery the dynamic query
     * @return the number of rows that match the dynamic query
     * @throws SystemException if a system exception occurred
     */
    public long dynamicQueryCount(DynamicQuery dynamicQuery)
        throws SystemException {
        return subscriptionCategoryPersistence.countWithDynamicQuery(dynamicQuery);
    }

    public SubscriptionCategory fetchSubscriptionCategory(
        SubscriptionCategoryPK subscriptionCategoryPK)
        throws SystemException {
        return subscriptionCategoryPersistence.fetchByPrimaryKey(subscriptionCategoryPK);
    }

    /**
     * Returns the subscription category with the primary key.
     *
     * @param subscriptionCategoryPK the primary key of the subscription category
     * @return the subscription category
     * @throws PortalException if a subscription category with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    public SubscriptionCategory getSubscriptionCategory(
        SubscriptionCategoryPK subscriptionCategoryPK)
        throws PortalException, SystemException {
        return subscriptionCategoryPersistence.findByPrimaryKey(subscriptionCategoryPK);
    }

    public PersistedModel getPersistedModel(Serializable primaryKeyObj)
        throws PortalException, SystemException {
        return subscriptionCategoryPersistence.findByPrimaryKey(primaryKeyObj);
    }

    /**
     * Returns a range of all the subscription categories.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
     * </p>
     *
     * @param start the lower bound of the range of subscription categories
     * @param end the upper bound of the range of subscription categories (not inclusive)
     * @return the range of subscription categories
     * @throws SystemException if a system exception occurred
     */
    public List<SubscriptionCategory> getSubscriptionCategories(int start,
        int end) throws SystemException {
        return subscriptionCategoryPersistence.findAll(start, end);
    }

    /**
     * Returns the number of subscription categories.
     *
     * @return the number of subscription categories
     * @throws SystemException if a system exception occurred
     */
    public int getSubscriptionCategoriesCount() throws SystemException {
        return subscriptionCategoryPersistence.countAll();
    }

    /**
     * Updates the subscription category in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
     *
     * @param subscriptionCategory the subscription category
     * @return the subscription category that was updated
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    public SubscriptionCategory updateSubscriptionCategory(
        SubscriptionCategory subscriptionCategory) throws SystemException {
        return updateSubscriptionCategory(subscriptionCategory, true);
    }

    /**
     * Updates the subscription category in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
     *
     * @param subscriptionCategory the subscription category
     * @param merge whether to merge the subscription category with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
     * @return the subscription category that was updated
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    public SubscriptionCategory updateSubscriptionCategory(
        SubscriptionCategory subscriptionCategory, boolean merge)
        throws SystemException {
        subscriptionCategory.setNew(false);

        return subscriptionCategoryPersistence.update(subscriptionCategory,
            merge);
    }

    /**
     * Returns the category local service.
     *
     * @return the category local service
     */
    public CategoryLocalService getCategoryLocalService() {
        return categoryLocalService;
    }

    /**
     * Sets the category local service.
     *
     * @param categoryLocalService the category local service
     */
    public void setCategoryLocalService(
        CategoryLocalService categoryLocalService) {
        this.categoryLocalService = categoryLocalService;
    }

    /**
     * Returns the category persistence.
     *
     * @return the category persistence
     */
    public CategoryPersistence getCategoryPersistence() {
        return categoryPersistence;
    }

    /**
     * Sets the category persistence.
     *
     * @param categoryPersistence the category persistence
     */
    public void setCategoryPersistence(CategoryPersistence categoryPersistence) {
        this.categoryPersistence = categoryPersistence;
    }

    /**
     * Returns the label local service.
     *
     * @return the label local service
     */
    public LabelLocalService getLabelLocalService() {
        return labelLocalService;
    }

    /**
     * Sets the label local service.
     *
     * @param labelLocalService the label local service
     */
    public void setLabelLocalService(LabelLocalService labelLocalService) {
        this.labelLocalService = labelLocalService;
    }

    /**
     * Returns the label persistence.
     *
     * @return the label persistence
     */
    public LabelPersistence getLabelPersistence() {
        return labelPersistence;
    }

    /**
     * Sets the label persistence.
     *
     * @param labelPersistence the label persistence
     */
    public void setLabelPersistence(LabelPersistence labelPersistence) {
        this.labelPersistence = labelPersistence;
    }

    /**
     * Returns the newsletter local service.
     *
     * @return the newsletter local service
     */
    public NewsletterLocalService getNewsletterLocalService() {
        return newsletterLocalService;
    }

    /**
     * Sets the newsletter local service.
     *
     * @param newsletterLocalService the newsletter local service
     */
    public void setNewsletterLocalService(
        NewsletterLocalService newsletterLocalService) {
        this.newsletterLocalService = newsletterLocalService;
    }

    /**
     * Returns the newsletter persistence.
     *
     * @return the newsletter persistence
     */
    public NewsletterPersistence getNewsletterPersistence() {
        return newsletterPersistence;
    }

    /**
     * Sets the newsletter persistence.
     *
     * @param newsletterPersistence the newsletter persistence
     */
    public void setNewsletterPersistence(
        NewsletterPersistence newsletterPersistence) {
        this.newsletterPersistence = newsletterPersistence;
    }

    /**
     * Returns the newsletter config local service.
     *
     * @return the newsletter config local service
     */
    public NewsletterConfigLocalService getNewsletterConfigLocalService() {
        return newsletterConfigLocalService;
    }

    /**
     * Sets the newsletter config local service.
     *
     * @param newsletterConfigLocalService the newsletter config local service
     */
    public void setNewsletterConfigLocalService(
        NewsletterConfigLocalService newsletterConfigLocalService) {
        this.newsletterConfigLocalService = newsletterConfigLocalService;
    }

    /**
     * Returns the newsletter config persistence.
     *
     * @return the newsletter config persistence
     */
    public NewsletterConfigPersistence getNewsletterConfigPersistence() {
        return newsletterConfigPersistence;
    }

    /**
     * Sets the newsletter config persistence.
     *
     * @param newsletterConfigPersistence the newsletter config persistence
     */
    public void setNewsletterConfigPersistence(
        NewsletterConfigPersistence newsletterConfigPersistence) {
        this.newsletterConfigPersistence = newsletterConfigPersistence;
    }

    /**
     * Returns the recipient local service.
     *
     * @return the recipient local service
     */
    public RecipientLocalService getRecipientLocalService() {
        return recipientLocalService;
    }

    /**
     * Sets the recipient local service.
     *
     * @param recipientLocalService the recipient local service
     */
    public void setRecipientLocalService(
        RecipientLocalService recipientLocalService) {
        this.recipientLocalService = recipientLocalService;
    }

    /**
     * Returns the recipient persistence.
     *
     * @return the recipient persistence
     */
    public RecipientPersistence getRecipientPersistence() {
        return recipientPersistence;
    }

    /**
     * Sets the recipient persistence.
     *
     * @param recipientPersistence the recipient persistence
     */
    public void setRecipientPersistence(
        RecipientPersistence recipientPersistence) {
        this.recipientPersistence = recipientPersistence;
    }

    /**
     * Returns the subscription local service.
     *
     * @return the subscription local service
     */
    public SubscriptionLocalService getSubscriptionLocalService() {
        return subscriptionLocalService;
    }

    /**
     * Sets the subscription local service.
     *
     * @param subscriptionLocalService the subscription local service
     */
    public void setSubscriptionLocalService(
        SubscriptionLocalService subscriptionLocalService) {
        this.subscriptionLocalService = subscriptionLocalService;
    }

    /**
     * Returns the subscription persistence.
     *
     * @return the subscription persistence
     */
    public SubscriptionPersistence getSubscriptionPersistence() {
        return subscriptionPersistence;
    }

    /**
     * Sets the subscription persistence.
     *
     * @param subscriptionPersistence the subscription persistence
     */
    public void setSubscriptionPersistence(
        SubscriptionPersistence subscriptionPersistence) {
        this.subscriptionPersistence = subscriptionPersistence;
    }

    /**
     * Returns the subscription category local service.
     *
     * @return the subscription category local service
     */
    public SubscriptionCategoryLocalService getSubscriptionCategoryLocalService() {
        return subscriptionCategoryLocalService;
    }

    /**
     * Sets the subscription category local service.
     *
     * @param subscriptionCategoryLocalService the subscription category local service
     */
    public void setSubscriptionCategoryLocalService(
        SubscriptionCategoryLocalService subscriptionCategoryLocalService) {
        this.subscriptionCategoryLocalService = subscriptionCategoryLocalService;
    }

    /**
     * Returns the subscription category persistence.
     *
     * @return the subscription category persistence
     */
    public SubscriptionCategoryPersistence getSubscriptionCategoryPersistence() {
        return subscriptionCategoryPersistence;
    }

    /**
     * Sets the subscription category persistence.
     *
     * @param subscriptionCategoryPersistence the subscription category persistence
     */
    public void setSubscriptionCategoryPersistence(
        SubscriptionCategoryPersistence subscriptionCategoryPersistence) {
        this.subscriptionCategoryPersistence = subscriptionCategoryPersistence;
    }

    /**
     * Returns the counter local service.
     *
     * @return the counter local service
     */
    public CounterLocalService getCounterLocalService() {
        return counterLocalService;
    }

    /**
     * Sets the counter local service.
     *
     * @param counterLocalService the counter local service
     */
    public void setCounterLocalService(CounterLocalService counterLocalService) {
        this.counterLocalService = counterLocalService;
    }

    /**
     * Returns the resource local service.
     *
     * @return the resource local service
     */
    public ResourceLocalService getResourceLocalService() {
        return resourceLocalService;
    }

    /**
     * Sets the resource local service.
     *
     * @param resourceLocalService the resource local service
     */
    public void setResourceLocalService(
        ResourceLocalService resourceLocalService) {
        this.resourceLocalService = resourceLocalService;
    }

    /**
     * Returns the resource remote service.
     *
     * @return the resource remote service
     */
    public ResourceService getResourceService() {
        return resourceService;
    }

    /**
     * Sets the resource remote service.
     *
     * @param resourceService the resource remote service
     */
    public void setResourceService(ResourceService resourceService) {
        this.resourceService = resourceService;
    }

    /**
     * Returns the resource persistence.
     *
     * @return the resource persistence
     */
    public ResourcePersistence getResourcePersistence() {
        return resourcePersistence;
    }

    /**
     * Sets the resource persistence.
     *
     * @param resourcePersistence the resource persistence
     */
    public void setResourcePersistence(ResourcePersistence resourcePersistence) {
        this.resourcePersistence = resourcePersistence;
    }

    /**
     * Returns the user local service.
     *
     * @return the user local service
     */
    public UserLocalService getUserLocalService() {
        return userLocalService;
    }

    /**
     * Sets the user local service.
     *
     * @param userLocalService the user local service
     */
    public void setUserLocalService(UserLocalService userLocalService) {
        this.userLocalService = userLocalService;
    }

    /**
     * Returns the user remote service.
     *
     * @return the user remote service
     */
    public UserService getUserService() {
        return userService;
    }

    /**
     * Sets the user remote service.
     *
     * @param userService the user remote service
     */
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    /**
     * Returns the user persistence.
     *
     * @return the user persistence
     */
    public UserPersistence getUserPersistence() {
        return userPersistence;
    }

    /**
     * Sets the user persistence.
     *
     * @param userPersistence the user persistence
     */
    public void setUserPersistence(UserPersistence userPersistence) {
        this.userPersistence = userPersistence;
    }

    public void afterPropertiesSet() {
        PersistedModelLocalServiceRegistryUtil.register("com.wcs.newsletter.model.SubscriptionCategory",
            subscriptionCategoryLocalService);
    }

    public void destroy() {
        PersistedModelLocalServiceRegistryUtil.unregister(
            "com.wcs.newsletter.model.SubscriptionCategory");
    }

    /**
     * Returns the Spring bean ID for this bean.
     *
     * @return the Spring bean ID for this bean
     */
    public String getBeanIdentifier() {
        return _beanIdentifier;
    }

    /**
     * Sets the Spring bean ID for this bean.
     *
     * @param beanIdentifier the Spring bean ID for this bean
     */
    public void setBeanIdentifier(String beanIdentifier) {
        _beanIdentifier = beanIdentifier;
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
    }

    protected Class<?> getModelClass() {
        return SubscriptionCategory.class;
    }

    protected String getModelClassName() {
        return SubscriptionCategory.class.getName();
    }

    /**
     * Performs an SQL query.
     *
     * @param sql the sql query
     */
    protected void runSQL(String sql) throws SystemException {
        try {
            DataSource dataSource = subscriptionCategoryPersistence.getDataSource();

            SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
                    sql, new int[0]);

            sqlUpdate.update();
        } catch (Exception e) {
            throw new SystemException(e);
        }
    }
}
