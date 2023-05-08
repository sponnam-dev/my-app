package com.mycompany.app.design.patterns;

public class Singleton {
    public static void main(String[] args) {

    }
}
class SingleInstance{
    static SingleInstance instance = null;


    public static SingleInstance instance(){
        synchronized (SingleInstance.class){
            if(instance == null){
                    instance = new SingleInstance();

            }
        }
        return instance;
    }

}
