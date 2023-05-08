package com.mycompany.app.design.patterns;
//if want to modify the object at runtime
public class DecoratorPatternTest {
    public static void main(String[] args) {
        Dress sportsDress = new SportsDress(new BaseDress());
        sportsDress.assemble();

        Dress sportsCasualDress = new SportsDress(new CasualDress(new BaseDress()));
        sportsCasualDress.assemble();
    }
}
interface Dress{
    void assemble();
}
class BaseDress implements Dress{

    @Override
    public void assemble() {
        System.out.println("base dress=====");
    }
}
class DressDecorator implements Dress{
    protected Dress d;
    public DressDecorator(Dress d){
        this.d=d;
    }
    @Override
    public void assemble() {
        this.d.assemble();
    }
}

class SportsDress extends DressDecorator{
    public SportsDress(Dress d){
        super(d);
    }
    @Override
    public void assemble(){
        super.assemble();
        System.out.println("sports dress feature=========");
    }
}
class CasualDress extends DressDecorator{
    public CasualDress(Dress d){
        super(d);
    }
    @Override
    public void assemble(){
        super.assemble();
        System.out.println("casual dress feature=========");
    }
}