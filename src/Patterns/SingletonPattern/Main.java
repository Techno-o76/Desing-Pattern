package Patterns.SingletonPattern;

import Patterns.SingletonPattern.EagerWay.SingletonEager;
import Patterns.SingletonPattern.LazyWay.SingletonLazy;

public class Main {
    public static void main(String[] args){
        SingletonLazy singletonLazy1 = SingletonLazy.getSingletonObject();
        SingletonLazy singletonLazy2 = SingletonLazy.getSingletonObject();

        SingletonEager singletonEager1 = SingletonEager.getSingletonEager();
        SingletonEager singletonEager2 = SingletonEager.getSingletonEager();

        System.out.println(singletonLazy1.hashCode() + " " + singletonLazy2.hashCode());
        System.out.println(singletonEager1.hashCode() + " " + singletonEager2.hashCode());

    }
}
