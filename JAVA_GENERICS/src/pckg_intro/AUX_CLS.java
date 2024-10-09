package pckg_intro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class AUX_CLS {
    public static void listElements(ArrayList<String> lista) {
        for(String el: lista){
            System.out.println("Element : " + el);
        }
    }

    public static void listIntList(ArrayList<Integer> lst) {
        for(Integer intEl: lst){
            System.out.println("element: "+ intEl);
        }
    }

    public static void listUsrList(ArrayList<User> lst) {
        for(User usr: lst){
            System.out.println("element: "+ usr);
        }
    }


    public static <E> void listAllElements(ArrayList<E> lista) {
        if (lista.isEmpty()) {
            System.out.println("List is empty");
        }else{
            for(E el: lista){
                System.out.println("Element : " + el);
            }
        }
    }

    public static <Q> void listAllElements2(ArrayList<Q> lista) {
        Iterator<Q> iter = lista.iterator();
        while (iter.hasNext()) {
            System.out.println("Element : " + iter.next());
        }
    }

    public static <K,V> void listMapElements(HashMap<K,V> map){
        if (map.isEmpty()) {
            System.out.println("Map is empty");
        }else{
            System.out.println("Map details as object: " + Integer.toHexString(map.hashCode()));
            for (Map.Entry<K,V> entry: map.entrySet()) {
                System.out.println("key: " + entry.getKey());
                System.out.println("value: " + entry.getValue());
            }
        }
    }




}
