package com.wcs.newsletter.dto;

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


public class SubscriptionKeySet {

    private String cancelationKey;
    private String confirmationKey;

    public SubscriptionKeySet(String confirmationKey, String cancelationKey) {
        this.confirmationKey = confirmationKey;
        this.cancelationKey = cancelationKey;
    }

    public String getCancelationKey() {
        return cancelationKey;
    }

    public String getConfirmationKey() {
        return confirmationKey;
    }
    
}