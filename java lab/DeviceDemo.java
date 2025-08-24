interface Camera {
    void takePhoto();
}

interface MusicPlayer {
    void playMusic();
}

class Smartphone implements Camera, MusicPlayer {
    public void takePhoto() { System.out.println("Click! Photo taken."); }
    public void playMusic() { System.out.println("Playing music..."); }
}

public class DeviceDemo {
    public static void main(String[] args) {
        try {
            Smartphone phone = new Smartphone();
            phone.takePhoto();
            phone.playMusic();
        } catch (Exception e) {
            System.out.println("Device error!");
        }
    }
}
