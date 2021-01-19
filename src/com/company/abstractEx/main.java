package com.company.abstractEx;

import java.math.BigDecimal;

public class main {
    public static void main(String... args){
        ShopInfo info = new ShopInfo(19, new BigDecimal("20000"), 20, 5000);
        ShopAbs phone = new PhoneItem();
        boolean isAllow = phone.isAllowToAddToKart(info);
        System.out.println("allow" + isAllow);
        if (!isAllow){   //true
            return;
        }

        if(!phone.isAllowToBuy(info)){
            return;
        }

        System.out.println("amount remain "+phone.remainingAmount(info));
    }
}
