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

import com.liferay.portal.kernel.exception.SystemException;

import com.wcs.newsletter.model.Label;
import com.wcs.newsletter.service.LabelLocalServiceUtil;

/**
 * The extended model base implementation for the Label service. Represents a row in the &quot;WcsNewsletter_Label&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LabelImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LabelImpl
 * @see com.wcs.newsletter.model.Label
 * @generated
 */
public abstract class LabelBaseImpl extends LabelModelImpl implements Label {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a label model instance should use the {@link Label} interface instead.
     */
    public void persist() throws SystemException {
        if (this.isNew()) {
            LabelLocalServiceUtil.addLabel(this);
        } else {
            LabelLocalServiceUtil.updateLabel(this);
        }
    }
}
