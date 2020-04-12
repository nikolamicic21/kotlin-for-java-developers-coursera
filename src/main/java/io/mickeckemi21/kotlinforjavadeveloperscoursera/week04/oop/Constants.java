package io.mickeckemi21.kotlinforjavadeveloperscoursera.week04.oop;

import io.mickeckemi21.kotlinforjavadeveloperscoursera.week04.oop.constants.A;
import io.mickeckemi21.kotlinforjavadeveloperscoursera.week04.oop.constants.ConstantsKt;
import io.mickeckemi21.kotlinforjavadeveloperscoursera.week04.oop.constants.SuperComputer;

public class Constants {

    public static void main(String[] args) {
        // top-level constants
        // defined with const
        System.out.println(ConstantsKt.answer);
        // defined with @JvmField
        System.out.println(ConstantsKt.prop);

        Object obj = A.INSTANCE.prop;

        // const exposes 'answer' as
        // static field when user from Java
        // which inlines the value (better performance)
        System.out.println(SuperComputer.answer);
        // @JvmField exposes a field
        // through the property
        System.out.println(SuperComputer.reason);
        // without any annotation
        // field becomes available with getter
        // as a member of instance field
        SuperComputer.INSTANCE.getQuestion();
        // to expose getter without using instance field
        // @JvmStatic should be used
        SuperComputer.getKnown();

    }

}
