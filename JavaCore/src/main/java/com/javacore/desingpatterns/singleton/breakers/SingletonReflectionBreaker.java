package com.javacore.desingpatterns.singleton.breakers;

import com.javacore.desingpatterns.singleton.fixes.F1SynchronizedAppConfig;

import java.lang.reflect.Constructor;

/**
 * This class breaks F1SynchronizedAppConfig class with constructor
 * -
 */
public class SingletonReflectionBreaker {
    static void main(String[] args) {
        System.out.println("Using Reflection to break Singleton...");
        // 1. getting legal instance first
        F1SynchronizedAppConfig config1 = F1SynchronizedAppConfig.getInstance();
        F1SynchronizedAppConfig config2 = null;

        try{
            // using Reflection to access private constructor
            Constructor<F1SynchronizedAppConfig> constructor = F1SynchronizedAppConfig
                    .class.getDeclaredConstructor();
            // changing constructor visibility
            constructor.setAccessible(true);

            //creating new instance now
            config2 = constructor.newInstance();

            System.out.println("Instance 1 HashCode: "+config1.hashCode());
            System.out.println("Instance 2 HashCode: "+config2.hashCode());

            if(config1.hashCode() != config2.hashCode()){
                System.out.println("RESULT: Singleton BROKEN via REFLECTION");
            }
        }catch (Exception e){
            System.out.println("Error instantiating F1SynchronizedAppConfig "+e.fillInStackTrace());
        }

    }
}

/**
 * Key Points-
 * 1. Reflection is created for frameworks like spring or Hibernate that need to instantiate object at runtime without knowing their types at compile time.
 * 2. By calling setAccessible(true), the JVM's access checks are disabled for that specific constructor.
 * 3. To create instance ultimately constructor is used, hence put not null check for static variable there i.e.
 * - if config is initialized, later if attempt is made to create objects, it should throw Exception
 */