package com.gr00shik.dao.utils;

import com.gr00shik.dao.bean.Purchase;

import java.util.List;

public interface PurchaseJDBC {

    public List<Purchase> getListPurchase();
    public void savePurchase(Purchase purchase);
    public void deletePurchase(Purchase purchase);

}
