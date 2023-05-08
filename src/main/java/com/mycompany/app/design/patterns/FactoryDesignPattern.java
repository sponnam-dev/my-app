package com.mycompany.app.design.patterns;

public class FactoryDesignPattern {
    public static void main(String[] args) {
    OS o =OSFactoryDesignPattern.getInstance("window");
    o.spec();
    }
}

interface OS{
    void spec();
}
class Android implements OS{
    @Override
    public void spec(){
        System.out.println("Android power full");
    }
}
class IOS implements OS{
    @Override
    public void spec(){
        System.out.println("IOS power full");
    }
}
class Window implements OS{
    @Override
    public void spec(){
        System.out.println("Window power full");
    }
}
class OSFactoryDesignPattern{

    public static OS getInstance(String type){
        if(type.equals("OPEN")){
            return new Android();
        } else if (type.equals("Closed")){
            return new IOS();
        }else {
            return new Window();
        }
    }
}