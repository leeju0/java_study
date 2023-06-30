package interface_Test;

//interface : RemoteControl
public interface RemoteControl {
    //상수 필드 선언
    public int MAX_VOLUME = 10;
    public int MIN_VOLUME = 0;

    //추상 메소드 선언
    public void turnOn();
    public void turnOff();
    public void setVolume(int volume);
}
