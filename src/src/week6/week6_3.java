package src.src.week6;
class method2{
    public int sum(int a, int b) {
        int result = 0;
        for(int i = 0; i <=b; i++){
            result += i;
        }
        return result;
    }
}
public class week6_3 {
    public static void main(String[] args) {

        method2 sum = new method2();

        System.out.println(sum.sum(1, 10));

    }
}
