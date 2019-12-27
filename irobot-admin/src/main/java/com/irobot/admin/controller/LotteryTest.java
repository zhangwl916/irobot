package com.irobot.admin.controller;

import com.irobot.admin.bean.Prize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangwl
 * @date 2019-12-18 13:55
 */
public class LotteryTest {

    public static void main(String[] args) {

        List<Prize> prizes = new ArrayList<Prize>();

        Prize prize1 = new Prize();
        prize1.setPrizeId(1);
        prize1.setProbability(new BigDecimal(0.02));
        prize1.setQuantity(2);
        prizes.add(prize1);

        Prize prize2 = new Prize();
        prize2.setPrizeId(2);
        prize2.setProbability(new BigDecimal(0.05));
        prize2.setQuantity(10);
        prizes.add(prize2);

        Prize prize3 = new Prize();
        prize3.setPrizeId(3);
        prize3.setProbability(new BigDecimal(0.1));
        prize3.setQuantity(20);
        prizes.add(prize3);

        Prize prize4 = new Prize();
        prize4.setPrizeId(4);
        prize4.setProbability(new BigDecimal(0.2));
        prize4.setQuantity(30);
        prizes.add(prize4);

        Prize prize5 = new Prize();
        prize5.setPrizeId(5);
        prize5.setProbability(new BigDecimal(0.25));
        prize5.setQuantity(300);
        prizes.add(prize5);

        Prize prize6 = new Prize();
        prize6.setPrizeId(6);
        prize6.setProbability(new BigDecimal(0.17));
        prize6.setQuantity(250);
        prizes.add(prize6);

        Prize prize7 = new Prize();
        prize7.setPrizeId(7);
        prize7.setProbability(new BigDecimal(0.18));
        prize7.setQuantity(250);
        prizes.add(prize7);

        Prize prize8 = new Prize();
        prize8.setPrizeId(8);
        prize8.setProbability(new BigDecimal(0.03));
        prize8.setQuantity(0);
        prizes.add(prize8);

        int prize1GetTimes = 0;
        int prize2GetTimes = 0;
        int prize3GetTimes = 0;
        int prize4GetTimes = 0;
        int prize5GetTimes = 0;
        int prize6GetTimes = 0;
        int prize7GetTimes = 0;
        int prize8GetTimes = 0;
        Arithmetic arithmetic = new Arithmetic();
        int times = 1000;
        for (int i = 0; i < times; i++) {
            int prizeId = arithmetic.pay(prizes);
            switch (prizeId) {
                case 1:
                    prize1GetTimes++;
                    break;
                case 2:
                    prize2GetTimes++;
                    break;
                case 3:
                    prize3GetTimes++;
                    break;
                case 4:
                    prize4GetTimes++;
                    break;
                case 5:
                    prize5GetTimes++;
                    break;
                case 6:
                    prize6GetTimes++;
                    break;
                case 7:
                    prize7GetTimes++;
                    break;
                case 8:
                    prize8GetTimes++;
                    break;
            }
        }
        System.out.println("抽奖次数" + times);
        System.out.println("一等奖中奖次数：" + prize1GetTimes);
        System.out.println("二等奖中奖次数:" + prize2GetTimes);
        System.out.println("三等奖中奖次数:" + prize3GetTimes);
        System.out.println("四等奖中奖次数：" + prize4GetTimes);
        System.out.println("五等奖中奖次数：" + prize5GetTimes);
        System.out.println("六等奖中奖次数：" + prize6GetTimes);
        System.out.println("六等奖2中奖次数：" + prize7GetTimes);
        System.out.println("未中奖次数：" + prize8GetTimes);
    }

}
