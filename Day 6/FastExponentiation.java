import java.lang.*;

public class FastExponentiation {
    static Integer Exp(Integer a, Integer b) {
        Double dblResult = Math.pow((double) a, (double) b);
        return dblResult.intValue();
    }
    public static void main(String[] args){
        System.out.println(Exp(2,3));
        System.out.println(Exp(5,3));
        System.out.println(Exp(10,2));
        System.out.println(Exp(2,5));
        System.out.println(Exp(7,3));
    }
}
