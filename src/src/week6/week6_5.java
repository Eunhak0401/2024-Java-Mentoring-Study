package src.src.week6;

class A {
    int v = 10;

    void m(){
        int v = 20;
        System.out.println(v);
        System.out.println(this.v);
    }
}

public class week6_5 {
    public static void main(String[] args){
        A a1 = new A();
        a1.m();
    }
}

