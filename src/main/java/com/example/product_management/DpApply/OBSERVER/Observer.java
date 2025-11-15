package com.example.product_management.DpApply.OBSERVER;

import com.example.product_management.controller.StockEntry;

public interface Observer {
    void update(StockEntry product, String message);
}
