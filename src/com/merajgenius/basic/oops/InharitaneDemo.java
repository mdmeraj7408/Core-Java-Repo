package com.merajgenius.basic.oops;
class A {
    static int prop() {
        int field = 200;

        return field;
    }
}
    class SunB extends  A
    {
         public int sunBprop()
         {
             int myprop=SunB.prop()/2;
             return myprop;
         }
    }
class Sunc extends  A
{
    public int sunCprop()
    {
        int myprop=Sunc.prop()/2;
        return myprop;
    }
}
public class InharitaneDemo {
    public static void main(String[] args) {

        SunB sunB = new SunB();
        Sunc sunc = new Sunc();
        int pprop = A.prop();
        int bprop = sunB.sunBprop();
        int cprop = sunc.sunCprop();
        System.out.println("Father Properties:"+pprop);
        System.out.println("Child I Property:"+bprop);
        System.out.println("Child II Property:"+cprop);

    }
}
