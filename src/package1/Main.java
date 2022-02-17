package package1;

import package2.Class3;

public class Main {

    public static void main(String[] args) {

        Class1 c1 = new Class1(7,8,9);
        Class2 c2 = new Class2(3,4,5);
        Class3 c3 = new Class3();

        c1.publicInt = 71;
        c1.protectedInt = 81;
        c1.setPrivateInt(91);

        System.out.println(c1.publicInt);
        System.out.println(c1.protectedInt);
        System.out.println(c1.getPrivateInt());

        c2.publicInt = 31;
        c2.protectedInt = 41;
        c2.setPrivateInt(51);

        System.out.println(c2.publicInt);
        System.out.println(c2.protectedInt);
        System.out.println(c2.getPrivateInt());

        c3.publicInt = 11;
        c3.setProtectedInt(22);
        c3.setPrivateInt(33);

        System.out.println(c3.publicInt);
        System.out.println(c3.getProtectedInt());
        System.out.println(c3.getPrivateInt());

        Object obj = new Object();





    }
}
