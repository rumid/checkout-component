package org.rumid.checkout.model;

import java.math.BigDecimal;

interface CheckoutLineItem {
    String id();
    BigDecimal price();
    int quantity();
}
