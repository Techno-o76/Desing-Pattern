package Patterns.SingletonPattern.LazyWay;

public class SingletonLazy {

    // since the static method cannot use non-static varible, hence make the object static,
    // make it private so that
    private static SingletonLazy singletonObject;


    // making the constructor private so that outside the class, no one can make the object.
    private SingletonLazy(){

    }

    // Lazy way of making
    public static SingletonLazy getSingletonObject(){
        if(singletonObject==null){
            singletonObject = new SingletonLazy();
        }
        return singletonObject;
    }
}
