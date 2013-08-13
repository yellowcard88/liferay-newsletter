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

import com.wcs.newsletter.service.SubscriptionCategoryLocalServiceUtil;

import java.util.Arrays;


public class SubscriptionCategoryLocalServiceClpInvoker {
    private String _methodName0;
    private String[] _methodParameterTypes0;
    private String _methodName1;
    private String[] _methodParameterTypes1;
    private String _methodName2;
    private String[] _methodParameterTypes2;
    private String _methodName3;
    private String[] _methodParameterTypes3;
    private String _methodName4;
    private String[] _methodParameterTypes4;
    private String _methodName5;
    private String[] _methodParameterTypes5;
    private String _methodName6;
    private String[] _methodParameterTypes6;
    private String _methodName7;
    private String[] _methodParameterTypes7;
    private String _methodName8;
    private String[] _methodParameterTypes8;
    private String _methodName9;
    private String[] _methodParameterTypes9;
    private String _methodName10;
    private String[] _methodParameterTypes10;
    private String _methodName11;
    private String[] _methodParameterTypes11;
    private String _methodName12;
    private String[] _methodParameterTypes12;
    private String _methodName13;
    private String[] _methodParameterTypes13;
    private String _methodName14;
    private String[] _methodParameterTypes14;
    private String _methodName15;
    private String[] _methodParameterTypes15;
    private String _methodName60;
    private String[] _methodParameterTypes60;
    private String _methodName61;
    private String[] _methodParameterTypes61;
    private String _methodName66;
    private String[] _methodParameterTypes66;
    private String _methodName67;
    private String[] _methodParameterTypes67;
    private String _methodName68;
    private String[] _methodParameterTypes68;
    private String _methodName69;
    private String[] _methodParameterTypes69;
    private String _methodName70;
    private String[] _methodParameterTypes70;

    public SubscriptionCategoryLocalServiceClpInvoker() {
        _methodName0 = "addSubscriptionCategory";

        _methodParameterTypes0 = new String[] {
                "com.wcs.newsletter.model.SubscriptionCategory"
            };

        _methodName1 = "createSubscriptionCategory";

        _methodParameterTypes1 = new String[] {
                "com.wcs.newsletter.service.persistence.SubscriptionCategoryPK"
            };

        _methodName2 = "deleteSubscriptionCategory";

        _methodParameterTypes2 = new String[] {
                "com.wcs.newsletter.service.persistence.SubscriptionCategoryPK"
            };

        _methodName3 = "deleteSubscriptionCategory";

        _methodParameterTypes3 = new String[] {
                "com.wcs.newsletter.model.SubscriptionCategory"
            };

        _methodName4 = "dynamicQuery";

        _methodParameterTypes4 = new String[] {  };

        _methodName5 = "dynamicQuery";

        _methodParameterTypes5 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery"
            };

        _methodName6 = "dynamicQuery";

        _methodParameterTypes6 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int"
            };

        _methodName7 = "dynamicQuery";

        _methodParameterTypes7 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int",
                "com.liferay.portal.kernel.util.OrderByComparator"
            };

        _methodName8 = "dynamicQueryCount";

        _methodParameterTypes8 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery"
            };

        _methodName9 = "fetchSubscriptionCategory";

        _methodParameterTypes9 = new String[] {
                "com.wcs.newsletter.service.persistence.SubscriptionCategoryPK"
            };

        _methodName10 = "getSubscriptionCategory";

        _methodParameterTypes10 = new String[] {
                "com.wcs.newsletter.service.persistence.SubscriptionCategoryPK"
            };

        _methodName11 = "getPersistedModel";

        _methodParameterTypes11 = new String[] { "java.io.Serializable" };

        _methodName12 = "getSubscriptionCategories";

        _methodParameterTypes12 = new String[] { "int", "int" };

        _methodName13 = "getSubscriptionCategoriesCount";

        _methodParameterTypes13 = new String[] {  };

        _methodName14 = "updateSubscriptionCategory";

        _methodParameterTypes14 = new String[] {
                "com.wcs.newsletter.model.SubscriptionCategory"
            };

        _methodName15 = "updateSubscriptionCategory";

        _methodParameterTypes15 = new String[] {
                "com.wcs.newsletter.model.SubscriptionCategory", "boolean"
            };

        _methodName60 = "getBeanIdentifier";

        _methodParameterTypes60 = new String[] {  };

        _methodName61 = "setBeanIdentifier";

        _methodParameterTypes61 = new String[] { "java.lang.String" };

        _methodName66 = "findBySubscriptionId";

        _methodParameterTypes66 = new String[] { "long" };

        _methodName67 = "findByConfirmationKey";

        _methodParameterTypes67 = new String[] { "java.lang.String" };

        _methodName68 = "findByCancellationKey";

        _methodParameterTypes68 = new String[] { "java.lang.String" };

        _methodName69 = "findByStatus";

        _methodParameterTypes69 = new String[] { "java.lang.String" };

        _methodName70 = "findByCategoryId";

        _methodParameterTypes70 = new String[] { "long" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName0.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
            return SubscriptionCategoryLocalServiceUtil.addSubscriptionCategory((com.wcs.newsletter.model.SubscriptionCategory) arguments[0]);
        }

        if (_methodName1.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
            return SubscriptionCategoryLocalServiceUtil.createSubscriptionCategory((com.wcs.newsletter.service.persistence.SubscriptionCategoryPK) arguments[0]);
        }

        if (_methodName2.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
            return SubscriptionCategoryLocalServiceUtil.deleteSubscriptionCategory((com.wcs.newsletter.service.persistence.SubscriptionCategoryPK) arguments[0]);
        }

        if (_methodName3.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
            return SubscriptionCategoryLocalServiceUtil.deleteSubscriptionCategory((com.wcs.newsletter.model.SubscriptionCategory) arguments[0]);
        }

        if (_methodName4.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
            return SubscriptionCategoryLocalServiceUtil.dynamicQuery();
        }

        if (_methodName5.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
            return SubscriptionCategoryLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName6.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
            return SubscriptionCategoryLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue());
        }

        if (_methodName7.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
            return SubscriptionCategoryLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue(),
                (com.liferay.portal.kernel.util.OrderByComparator) arguments[3]);
        }

        if (_methodName8.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
            return SubscriptionCategoryLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName9.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
            return SubscriptionCategoryLocalServiceUtil.fetchSubscriptionCategory((com.wcs.newsletter.service.persistence.SubscriptionCategoryPK) arguments[0]);
        }

        if (_methodName10.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
            return SubscriptionCategoryLocalServiceUtil.getSubscriptionCategory((com.wcs.newsletter.service.persistence.SubscriptionCategoryPK) arguments[0]);
        }

        if (_methodName11.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
            return SubscriptionCategoryLocalServiceUtil.getPersistedModel((java.io.Serializable) arguments[0]);
        }

        if (_methodName12.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
            return SubscriptionCategoryLocalServiceUtil.getSubscriptionCategories(((Integer) arguments[0]).intValue(),
                ((Integer) arguments[1]).intValue());
        }

        if (_methodName13.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
            return SubscriptionCategoryLocalServiceUtil.getSubscriptionCategoriesCount();
        }

        if (_methodName14.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
            return SubscriptionCategoryLocalServiceUtil.updateSubscriptionCategory((com.wcs.newsletter.model.SubscriptionCategory) arguments[0]);
        }

        if (_methodName15.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
            return SubscriptionCategoryLocalServiceUtil.updateSubscriptionCategory((com.wcs.newsletter.model.SubscriptionCategory) arguments[0],
                ((Boolean) arguments[1]).booleanValue());
        }

        if (_methodName60.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes60, parameterTypes)) {
            return SubscriptionCategoryLocalServiceUtil.getBeanIdentifier();
        }

        if (_methodName61.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes61, parameterTypes)) {
            SubscriptionCategoryLocalServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);
        }

        if (_methodName66.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes66, parameterTypes)) {
            return SubscriptionCategoryLocalServiceUtil.findBySubscriptionId(((Long) arguments[0]).longValue());
        }

        if (_methodName67.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes67, parameterTypes)) {
            return SubscriptionCategoryLocalServiceUtil.findByConfirmationKey((java.lang.String) arguments[0]);
        }

        if (_methodName68.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes68, parameterTypes)) {
            return SubscriptionCategoryLocalServiceUtil.findByCancellationKey((java.lang.String) arguments[0]);
        }

        if (_methodName69.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes69, parameterTypes)) {
            return SubscriptionCategoryLocalServiceUtil.findByStatus((java.lang.String) arguments[0]);
        }

        if (_methodName70.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes70, parameterTypes)) {
            return SubscriptionCategoryLocalServiceUtil.findByCategoryId(((Long) arguments[0]).longValue());
        }

        throw new UnsupportedOperationException();
    }
}
