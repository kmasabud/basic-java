package com.company.abstractEx;

import java.math.BigDecimal;

public abstract class ShopAbs {
    abstract boolean isAllowToBuy(ShopInfo shopInfo); //age, credit, kart
    abstract boolean isAllowToAddToKart(ShopInfo shopInfo); //age, credit, kart
    abstract int remainingAmount(ShopInfo shopInfo);

    protected int discountFive(int price){
        return price - 5;
    }
    protected int discountTen(int price){
        return price - 10;
    }
}
