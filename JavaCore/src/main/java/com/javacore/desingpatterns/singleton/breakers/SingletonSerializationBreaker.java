package com.javacore.desingpatterns.singleton.breakers;

import com.javacore.desingpatterns.singleton.fixes.F2ReflectionSynchronizationConfig;

import java.io.*;

public class SingletonSerializationBreaker {
     static void main(String[] args) {
        F2ReflectionSynchronizationConfig instance1 = F2ReflectionSynchronizationConfig.getInstance();
        F2ReflectionSynchronizationConfig instance2 = null;

        try {
            // 1. Serialize (Write to file)
            ObjectOutput out = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
            out.writeObject(instance1);
            out.close();

            // 2. Deserialize (Read from file)
            ObjectInput in = new ObjectInputStream(new FileInputStream("singleton.ser"));
            instance2 = (F2ReflectionSynchronizationConfig) in.readObject();
            in.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Instance 1 HashCode: " + instance1.hashCode());
        System.out.println("Instance 2 HashCode: " + instance2.hashCode());

        if (instance1.hashCode() != instance2.hashCode()) {
            System.out.println("RESULT: Singleton BROKEN via SERIALIZATION");
        }
    }
}