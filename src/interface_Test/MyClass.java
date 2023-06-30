package interface_Test;


public class MyClass {
    //1. 인터페이스가 필드 타입으로 사용되는 경우
    RemoteControl rc = new Television(); //인터페이스로 구현 객체를 사용할려면, 다음과 같이 인터페이스 변수를 선언하고 구현객체를 대입해야한다.

    //생성자
    MyClass(){

    }

    //2. 인터페이스가 생성자의 매개 변수 타입으로 사용되는 경우
    //new 연산자로 객체를 생성할 때 구현 객체를 생성자의 매개값(ex new Audio()) 으로 전달함
    MyClass(RemoteControl rc){

        this.rc = rc;
        rc.turnOn();
        rc.turnOff();
        rc.setVolume(5);
    }


    void methodA(){
        RemoteControl rc = new Audio();//3. 인터페이스가 특정 메소드 내부 로컬 변수 타입으로 사용될 경우, 변수에 구현객체를 대입한다,
        rc.turnOn();

        rc.setVolume(5);
    }

    //4. 인터페이스가 메소드의 매개 변수 타입으로 사용될 경우, 메소드 호출 시 구현 객체를 매개값(ex. new Television())으로 대입한다.
    void methodB( RemoteControl rc ){

        rc.turnOn();

        rc.setVolume(5);
    }
}
