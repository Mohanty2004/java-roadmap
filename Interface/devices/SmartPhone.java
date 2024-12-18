package Interface.devices;

public class SmartPhone implements Camera, MusicPlayer, Phone {

    @Override
    public void makeCall(String number) {
        System.out.println("making call");
    }

    @Override
    public void endCall() {
        System.out.println("ending call");
    }

    @Override
    public void playMusic() {
        System.out.println("");
    }

    @Override
    public void stopMusic() {
        System.out.println("");
    }

    @Override
    public void takePhoto() {
        System.out.println("khich meri photo");
    }

    @Override
    public void recordVideo() {
        System.out.println("recording vlog");
    }

}
