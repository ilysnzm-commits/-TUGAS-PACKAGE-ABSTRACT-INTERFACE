public class Lenovo implements Laptop {

    private int volume = 50;
    private boolean isPowerOn = false;

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Lenovo menyala...");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Lenovo mati...");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn) {
            volume++;
            System.out.println("Volume Lenovo: " + volume);
        } else {
            System.out.println("Nyalakan dulu laptop!");
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn) {
            volume--;
            System.out.println("Volume Lenovo: " + volume);
        } else {
            System.out.println("Nyalakan dulu laptop!");
        }
    }
}