package com.gr00shik.dao.utils;

import com.gr00shik.dao.bean.Purchase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PurchaseJDBCTemplate implements PurchaseJDBC {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    private final String sqlGetList = "select * from Purchase";
    private final String sqlAddPurchase="insert into purchase (nameTool, cost, dateSale, seller) values (?, ?, ?, ?)";
    private final String sqlDetele="delete from purchase where id=?";
    private PurchaseRowMapper rowMapper = new PurchaseRowMapper();

    @Override
    public List<Purchase> getListPurchase() {
        ArrayList<Purchase> purchases = (ArrayList<Purchase>) jdbcTemplate.query(sqlGetList, rowMapper);
        return purchases;
    }

    @Override
    public void savePurchase(Purchase purchase) {
        jdbcTemplate.update(sqlAddPurchase, purchase.getNameTool(), purchase.getCost(), purchase.getDate(), purchase.getSeller());
    }

    @Override
    public void deletePurchase(Purchase purchase) {
        jdbcTemplate.update(sqlDetele, purchase.getId());
    }
}
