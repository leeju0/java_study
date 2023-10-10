import java.util.function.BiFunction;

public class main2 {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> x = (a,b) -> a + b;

        //BiFunction은 입출력 항목의 타입을 다양하게 사용할 수 있다.

        int result = x.apply(1, 2);
        System.out.println(result);
    }
}
