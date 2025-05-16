public class Electronics {
    public static void main(String[] args) {
        //Demonstrate polymorphism
        Switchable speaker1 = new SmartSpeaker();
        Switchable fan1 = new Fan();
        speaker1.turnOn();
        speaker1.turnOff();
        fan1.turnOn();
        fan1.turnOff();
        //Multiple inheritance through interfaces
        SmartSpeaker smartSpeaker = new SmartSpeaker();
        // Using SmartSpeaker methods
        smartSpeaker.turnOn();
        smartSpeaker.connect();
        smartSpeaker.increaseVol();
        smartSpeaker.decreaseVol();
        smartSpeaker.disconnect();
        smartSpeaker.turnOff();
        //Multiple inheritance through interfaces
        Fan fan = new Fan();
        // Using Fan methods
        fan.turnOn();
        fan.increase();
        fan.decrease();
        fan.turnOff();
    }
}
