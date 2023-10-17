class Counter{
    static int count =1;
    public static int getCount(){
        return count;
    }
}

public class main4 {
    public static void main(String[] args) {
        System.out.println(Counter.getCount());
    }

}
