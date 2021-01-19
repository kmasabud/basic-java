package com.company;

import com.company.abstractEx.ShopInfo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataType {
    public static void main(String... args){
        int a = 1;
        long b = 2;

        double c = 1.1;
        BigDecimal e = new BigDecimal("1");

        double tc1 = 0.3;
        double tc2 = 0.1;
        System.out.println(tc1 - tc2);

        BigDecimal tc3 = new BigDecimal("0.03");
        BigDecimal tc4 = new BigDecimal("0.01");
        System.out.println(tc3.subtract(tc4));

        String f = "1";
        boolean g = true;

        String[] zz = new String[1];
        zz[0] = "test";
        System.out.println(zz[0]);

        int[] xx = new int[1];
        xx[0]= 10;
        System.out.println(xx[0]);


        List<Integer> x = new ArrayList<>();
        x.add(1);
        for (int tmp : x){
            System.out.println(tmp);
        }


        List<String> aa = new ArrayList<>();
        aa.add("test list 0");
        aa.add("test list 1");
        aa.add("test list 2");

        for (int i =0;i<aa.size();i++){
            System.out.println(aa.get(i));
        }

        System.out.println("======");

        for(String tmp : aa){ //for earch
            System.out.println(tmp);
        }

        List<ShopInfo> infos = new ArrayList<>();
        infos.add(new ShopInfo(10, new BigDecimal("1000"), 1, 10));
        infos.add(new ShopInfo(1, new BigDecimal("2000"), 1, 2000));
        infos.add(new ShopInfo(2, new BigDecimal("2000"), 3, 5000));
        infos.add(new ShopInfo(20, new BigDecimal("2000"), 4, 9000));

        for (ShopInfo tmp : infos){
            //age more than or equals 10
            if(tmp.getAge() >=10){
                System.out.println(tmp);
                System.out.println("position is " + infos.indexOf(tmp));
            }
        }

        System.out.println("======");

        for (int i = 0; i< infos.size();i++){
            if(infos.get(i).getAge() >=10) {
                System.out.println(infos.get(i));
                System.out.println("position is " + i);
            }
        }

        ShopInfo[] infos2 = new ShopInfo[1];
        infos2[0] = new ShopInfo(2, new BigDecimal("2000"), 20, 2000);
        for (ShopInfo tmp : infos2){
            System.out.println(tmp);
        }


        //Hash map
        hashMap(infos);

    }

    //[1]->ShopInfo{age=2, credit=2000, kart=1, amount=2000}
    //[2]->ShopInfo{age=1, credit=1, kart=2 amount=2000}
    public static void hashMap(List<ShopInfo> shopInfos){
        System.out.println("start hashMap");
//        for (ShopInfo tmp : shopInfos){
//            if(tmp.getKart() == 3){
//                System.out.println(tmp);
//            }
//        }

//        Map<Integer, ShopInfo> t = new HashMap<>();
//        for (ShopInfo tmp : shopInfos){
//            t.put(tmp.getKart(), tmp);
//        }
//
//        ShopInfo shopInfo = t.get(4);
//        if(shopInfo != null){
//            System.out.println(shopInfo.getAmount());
//        }
//
//        System.out.println(shopInfo);
//
//        boolean b = t.containsKey(4);
//        System.out.println(b);

        //[LESS] -> Lis<ShopInfo> [ShopInfo{age=10, credit=1000, kart=1, amount=10},ShopInfo{age=1, credit=2000, kart=1, amount=2000}]
        Map<String, List<ShopInfo>> tt = new HashMap<>();
        for (ShopInfo tmp : shopInfos){
            if(tmp.getAmount() > 2000){
                List<ShopInfo> more = tt.get("MORE");
                if(more == null){
                    more = new ArrayList<>();
                    more.add(tmp);
                }else{
                    more.add(tmp);
                }
                tt.put("MORE", more);
            }else{
                List<ShopInfo> less = tt.get("LESS");
                if(less == null){
                    less = new ArrayList<>();
                    less.add(tmp);
                }else{
                    less.add(tmp);
                }
                tt.put("LESS", less);
            }
        }

        List<ShopInfo> more = tt.get("LESS");
        if(more != null){
            System.out.println(more.size());
            for(ShopInfo moreItem : more){
                System.out.println(moreItem);
            }
        }
        // tt.put("MORE", tmp);


        List<ShopInfo> mm = new ArrayList<>();
        List<ShopInfo> ll = new ArrayList<>();
        for (ShopInfo ttt : shopInfos){
            if (ttt.getAmount() > 2000){
                mm.add(ttt);
            }else{
                ll.add(ttt);
            }
        }

    }
}
