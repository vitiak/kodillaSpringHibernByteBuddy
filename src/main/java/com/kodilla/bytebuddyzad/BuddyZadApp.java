package com.kodilla.bytebuddyzad;

import net.bytebuddy.ByteBuddy;
import net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Default;
import net.bytebuddy.implementation.FixedValue;
import net.bytebuddy.matcher.ElementMatchers;

import java.lang.reflect.InvocationTargetException;
import java.util.List;


public class BuddyZadApp {

/*    public static void main(String[] args) throws Exception {
        Class<?> dynamicUserClass = new ByteBuddy()
                .subclass(User.class)
                .method(ElementMatchers.named("doSomething"))
                .intercept(FixedValue.value("Hello my zadanie Buddy!"))
                .make()
                .load(User.class.getClassLoader(), Default.WRAPPER)
                .getLoaded();

        Class[] parameterTypes = { String.class, String.class};

        System.out.println(dynamicUserClass.getDeclaredConstructor(parameterTypes)
                .newInstance("jakiesImie", "jakiesNazwisko"));
        Class[] parameterTypesMethod = { };
//        dynamicUserClass.getDeclaredMethod("doSomething").invoke(null);
        System.out.println(dynamicUserClass.getDeclaredMethod("doSomething"));

    }*/

    public static void main(String[] args) {
        User user = new User("imie", "nazwisko");
        for(int i = 0; i<10; i++) {
            user.doSomething();
            System.out.println("n = " + i) ;
        }

    }

}
