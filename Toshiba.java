public class Toshiba implements Laptop {

    private int volume = 40;
    private boolean isPowerOn = false;

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Toshiba hidup...");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Toshiba dimatikan...");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn) {
            volume += 2;
            System.out.println("Volume Toshiba: " + volume);
        } else {
            System.out.println("Laptop masih OFF!");
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn) {
            volume -= 2;
            System.out.println("Volume Toshiba: " + volume);
        } else {
            System.out.println("Laptop masih OFF!");
        }
    }
}