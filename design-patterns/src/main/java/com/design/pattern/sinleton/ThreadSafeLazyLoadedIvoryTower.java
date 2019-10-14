package com.design.pattern.sinleton;

public final class ThreadSafeLazyLoadedIvoryTower {

    private static ThreadSafeLazyLoadedIvoryTower instance;


    private ThreadSafeLazyLoadedIvoryTower(){

        if (instance == null){
            instance = this;
        }else {
            throw new IllegalStateException("");
        }

    }


    public static synchronized ThreadSafeLazyLoadedIvoryTower getInstance(){
        if (instance == null) {
            instance = new ThreadSafeLazyLoadedIvoryTower();
        }

        return instance;
    }


}
