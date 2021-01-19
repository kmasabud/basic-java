package com.company.abstractEx;

public class Computer extends ShopAbs{
    @Override
    public boolean isAllowToBuy(ShopInfo shopInfo) {
        System.out.println("buy success");
        return true;
    }

    @Override
    public boolean isAllowToAddToKart(ShopInfo shopInfo) {
        System.out.println("add to kart success");
        return true;
    }

    @Override
    int remainingAmount(ShopInfo shopInfo) {
        return 0;
    }
}
