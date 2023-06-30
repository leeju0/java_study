package interface_Test;


public class MyClassExample {
    public static void main(String args[]) {
        //1의 경우 -> 바로 . 연산자로 사용가능
        MyClass myClass1 = new MyClass();
        myClass1.rc.turnOn();
        myClass1.rc.setVolume(5);

        //2의 경우 -> new연산자로 생성한, 구현 객체를 매개값으로 대입함
        MyClass myClass2 = new MyClass(new Audio());

        //3의 경우
        MyClass myClass3 = new MyClass();
        myClass3.methodA();

        //4의 경우 -> new연산자로 생성한, 구현 객체를 매개값으로 대입함
        MyClass myClass4 = new MyClass();
        myClass4.methodB(new Television());
    }
}
