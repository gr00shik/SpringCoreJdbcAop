package com.gr00shik.dao.utils;

import com.gr00shik.dao.bean.Purchase;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
@Component
public class PurchaseRowMapper implements RowMapper<Purchase> {

    private Purchase purchase=null;

    @Override
    public Purchase mapRow(ResultSet rs, int rowNum) throws SQLException {
        purchase = new Purchase();
        purchase.setId(rs.getInt("id"));
        purchase.setNameTool(rs.getString("nameTool"));
        purchase.setCost(rs.getLong("cost"));
        purchase.setDate(rs.getDate("dateSale"));
        purchase.setSeller(rs.getString("seller"));
        return purchase;
    }
}
