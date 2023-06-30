package interface_Test;

//구현 클래스 : Audio
public class Audio implements RemoteControl{
    public int volume;

    //turnOn()의 실체 메소드
    public void turnOn(){
        System.out.println("Audio를 켭니다.");
    }

    //turnOff()의 실체 메소드
    public void turnOff(){
        System.out.println("Audio를 끕니다.");
    }

    //setVolume()의 실체 메소드
    public void setVolume(int volume){
        if(volume> RemoteControl.MAX_VOLUME){
            this.volume = RemoteControl.MAX_VOLUME;
        }
        else if(volume<RemoteControl.MIN_VOLUME){
            this.volume = RemoteControl.MIN_VOLUME;
        }
        else{
            this.volume = volume;
        }
        System.out.println("현재 Audio 볼륨: "+this.volume);
    }

}
