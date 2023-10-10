@FunctionalInterface
interface Calculator {
    int sum(int a, int b);

    
}

public class main {

    public static void main(String[] args) {

        Calculator cal = (a,b)-> a+b;
        int result = cal.sum(1, 2);
        System.out.println(result);

    }


}
