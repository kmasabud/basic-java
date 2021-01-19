package com.company.abstractEx;

import java.math.BigDecimal;


//ShopInfo tmp = new ShopInfo();
// [ShopInfo, age[int]=10, credit[BigDecimal]=null, kart[int]0]
public class ShopInfo{
    private int age;
    private BigDecimal credit;
    private int kart;
    private int amount;

    public ShopInfo(){

    }

    public ShopInfo(int age, BigDecimal credit, int kart, int amount){
        this.age = age;
        this.credit = credit;
        this.kart = kart;
        this.amount = amount;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public BigDecimal getCredit() {
        return credit;
    }

    public void setCredit(BigDecimal credit) {
        this.credit = credit;
    }

    public int getKart() {
        return kart;
    }

    public void setKart(int kart) {
        this.kart = kart;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }


    @Override
    public String toString() {
        return "ShopInfo{" +
                "age=" + age +
                ", credit=" + credit +
                ", kart=" + kart +
                ", amount=" + amount +
                '}';
    }
}
