package org.example.singleton;

public class SingletonTest {
    private static SingletonTest instance;

    private SingletonTest(){
    }

    public static synchronized SingletonTest getInstance(){
        if(instance==null)
            return new SingletonTest();
        return instance;
    }
}
