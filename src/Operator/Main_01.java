package Operator;

import java.util.ArrayList;
import java.util.List;

public class Main_01 {
    public static void main(String[] args) {
        int s0=1;
        Integer s1=2;
        //System.out.println(object instanceof T);A为实例，B为类或者接口

        //1.object不能基本数据类型
        //System.out.println(s0 instanceof Integer);

        //2.null
        System.out.println(s1 instanceof Integer);
        s1=null;
        System.out.println(s1 instanceof Integer);
        System.out.println(null instanceof Integer);

        //3.object为接口T的实现类的实例
        System.out.println("------___3__------");
        ArrayList arrayList = new ArrayList();
        System.out.println(arrayList instanceof ArrayList);
        List arrayList2= new ArrayList();
        System.out.println(arrayList2 instanceof ArrayList);
        System.out.println(arrayList2 instanceof List);

        //4.object为T的间接子类或直接子类的实例
        System.out.println("------___4__------");
        class A{}
        class B extends A{}
        class C extends A{}
        class D extends B{}
        //D->B->A
        A obj = new D();
        System.out.println(obj instanceof B);
        //C->A
        System.out.println(obj instanceof C);
        System.out.println(obj instanceof D);
        System.out.println(obj instanceof A);

    }
}
