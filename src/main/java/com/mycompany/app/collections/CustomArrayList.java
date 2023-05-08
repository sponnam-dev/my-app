package com.mycompany.app.collections;

import java.util.ArrayList;

public class CustomArrayList extends ArrayList {
    public boolean add(int num){
        if(this.contains(num)){
            return false;
        } else{
            super.add(num);
        }
        return true;
    }

    public static void main(String[] args) {
        CustomArrayList c = new CustomArrayList();
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(1);
        c.add(2);
        System.out.println(c);
    }

}
