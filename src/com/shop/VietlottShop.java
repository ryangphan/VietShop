package com.shop;
import java.util.*;

public class VietlottShop {

    private String owner;
    private int code;
    private int phone;
    private String address;
    private String email;
    private int moneyDeposit;
    private int moneyIssue;

    public VietlottShop(String owner, int code, int phone) {
        this.owner = owner;
        this.code = code;
        this.phone = phone;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMoneyDeposit() {
        return moneyDeposit;
    }

    public void setMoneyDeposit(int moneyDeposit) {
        this.moneyDeposit = moneyDeposit;
    }

    public int getMoneyIssue() {
        return moneyIssue;
    }

    public void setMoneyIssue(int moneyIssue) {
        this.moneyIssue = moneyIssue;
    }
}
