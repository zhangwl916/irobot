package com.irobot.admin.bean;

/**
 * @author: zhangwl
 * @date: 2019/9/6 11:39
 **/
public class KillThread extends Thread{

    private Hero h1;
    private Hero h2;

    public KillThread(Hero h1, Hero h2){
        this.h1 = h1;
        this.h2 = h2;
    }

    public void run(){
        while(!h2.isDead()){
            h1.attackHero(h2);
        }
    }

}
