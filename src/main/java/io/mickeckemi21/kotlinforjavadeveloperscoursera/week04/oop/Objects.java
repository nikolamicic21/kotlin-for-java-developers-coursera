package io.mickeckemi21.kotlinforjavadeveloperscoursera.week04.oop;

import io.mickeckemi21.kotlinforjavadeveloperscoursera.week04.oop.objects.C;
import io.mickeckemi21.kotlinforjavadeveloperscoursera.week04.oop.objects.D;
import io.mickeckemi21.kotlinforjavadeveloperscoursera.week04.oop.objects.KSingleton;
import io.mickeckemi21.kotlinforjavadeveloperscoursera.week04.oop.objects.Obj;

public class Objects {

    public static void main(String[] args) {

        // object == singleton
        KSingleton.INSTANCE.foo();

        // companion object
        // with @JvmStatic
        C.foo();
//        C.bar(); // doesn't work
        C.Companion.foo();
        C.Companion.bar();

        // object == singleton
        // with @JvmStatic
        Obj.foo();
        Obj.INSTANCE.bar();
//        Obj.INSTANCE.foo();

        // nested object
        D.B.INSTANCE.bar();
    }

}
