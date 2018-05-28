package com.gr00shik;

import com.gr00shik.dao.bean.Purchase;
import com.gr00shik.dao.utils.PurchaseJDBCTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Date;
import java.util.List;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        PurchaseJDBCTemplate purchaseJDBCTemplate = context.getBean(PurchaseJDBCTemplate.class);
//      Get List of purchases from database
        List<Purchase> listPurchase = purchaseJDBCTemplate.getListPurchase();
        for (Purchase pur : listPurchase){
            System.out.println(pur);
        }
//      Add a new purchase into table
        Purchase purchase = new Purchase();
        purchase.setNameTool("Huawei");
        purchase.setCost(1400L);
        purchase.setDate(new Date(System.currentTimeMillis()));
        purchase.setSeller("Vasya Pupkin");
        purchaseJDBCTemplate.savePurchase(purchase);
//      Delete a one purchase from table
        Purchase purchase1 = new Purchase();
        purchase1.setId(1);
        purchaseJDBCTemplate.deletePurchase(purchase1);
    }
}
