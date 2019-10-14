package com.design.pattern.sinleton;


//双重检测
public final class ThreadSafeDoubleCheckLocking {


    private static volatile ThreadSafeDoubleCheckLocking instance;

    private ThreadSafeDoubleCheckLocking(){
        //利用反射，在new之前可以重复建立，可加个状态位再做下判断
       if (instance !=null){
           throw new IllegalStateException("Already initialized");
       }

   }


   public ThreadSafeDoubleCheckLocking getInstance(){

       ThreadSafeDoubleCheckLocking result = instance;

       if (result == null){
            synchronized (ThreadSafeDoubleCheckLocking.class){
                result = instance;
                if (result == null){
                    instance = result = new ThreadSafeDoubleCheckLocking();
                }
            }
       }

       return result;


   }

}
