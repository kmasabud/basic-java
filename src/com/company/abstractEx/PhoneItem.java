package com.company.abstractEx;

import java.math.BigDecimal;

public class PhoneItem extends ShopAbs{

    @Override
    public boolean isAllowToBuy(ShopInfo shopInfo) {
        //age > 18
        if (shopInfo.getAge() < 18){
            System.out.println("not allow to buy phone cause age less than 18");
            return false;
        }


        //credit > 20,0000
        if (shopInfo.getCredit().compareTo(new BigDecimal("20000")) < 0){ //-? < 0 <1
            System.out.println("not allow credit less than 20000");
            return false;
        }

        System.out.println("Happy, buy phone success");
        return true;
    }

    @Override
    public boolean isAllowToAddToKart(ShopInfo shopInfo) {
        //kart > 10
        if(shopInfo.getKart() > 10){
            System.out.println("not allow to add to kart due to kart more than 10");
            return false;
        }
        System.out.println("Happy, add to kart success");
        return true;
    }

    @Override
    int remainingAmount(ShopInfo shopInfo) {
        int prize =1500;
        return shopInfo.getAmount() - discountTen(prize);
    }
}
