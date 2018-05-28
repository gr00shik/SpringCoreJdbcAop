package com.gr00shik.dao.bean;

import org.springframework.stereotype.Repository;

import java.sql.Date;

@Repository
public class Purchase {

    private int id;

    private String nameTool;

    private long cost;

    private Date date;

    private String seller;

    public Purchase() {
    }

    public Purchase(int id, String nameTool, long cost, Date date, String seller) {
        this.id = id;
        this.nameTool = nameTool;
        this.cost = cost;
        this.date = date;
        this.seller = seller;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameTool() {
        return nameTool;
    }

    public void setNameTool(String nameTool) {
        this.nameTool = nameTool;
    }

    public long getCost() {
        return cost;
    }

    public void setCost(long cost) {
        this.cost = cost;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "id=" + id +
                ", nameTool='" + nameTool + '\'' +
                ", cost=" + cost +
                ", date=" + date +
                ", seller='" + seller + '\'' +
                '}';
    }
}
