package com.mycompany.app.datastructure;

import java.util.HashMap;
import java.util.Map;

public class HashMapInternal {

    public static void main(String[] args) {
       // Map map = new HashMap<>();
        //Object key =map.put("xx","yy");
     //   Bucket arr[] = new Bucket[16];
        HashMapTest nm = new HashMapTest();
        Object previousKey = nm.put("xxx","cccc");
        System.out.println(previousKey);
        Object previousKey1 = nm.put("xxy","dddd");
        System.out.println(previousKey1);
        Object previousKey2 = nm.put("zzz","ggggg");
        System.out.println("previousKey2"+previousKey2);

    }

}
class HashMapTest{
     Bucket arr[] = new Bucket[16];
    public HashMapTest(){
        for (int i=0;i<arr.length;i++){
            arr[i]= new Bucket();
        }
    }
    public Object put(Object key, Object value){
        //need to be found hashcode of key
       int index = hashCode(key);
        System.out.println("index : "+index);
        Node n =arr[index].node;
        if(n == null){
            System.out.println("inside nulll block=======");
            n= new Node();
            n.key =key;
            n.value = value;
            n.hashCode=key.hashCode();
            n.nextRef =null;
            arr[index].node = n;
            return null;
        } else{
            if(n.key == key ){
               // some values
            } else{
                System.out.println("heyyyyyyyyy");
                Node n1 = new Node();
                n1.key =key;
                n1.value = value;
                n1.hashCode=key.hashCode();
                n1.nextRef =null;
                while(n.nextRef != null){
                    n=n.nextRef;
                }
                n.nextRef = n1;
            }

        }
  return  n!= null && n.key != null ? n.key : null;

    }
   int hashCode(Object key ){
        String s = (String) key;
        int len =s.length();
        return len %10;
    }

public Object get(Object key){
    int index = hashCode(key);
    Node n =arr[index].node;
    while(n.nextRef != null){
        if(n.key.equals(key) ){
            return n.value;
        }
    }

    return n.value;
}

}


class Bucket{
    Node node;
}

class Node {
    Object key;
    Object value;
    int hashCode;

    Node nextRef;
}
