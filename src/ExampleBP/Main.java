package ExampleBP;

public class Main {
    public static void main(String[] args) {
        ElectricalEquipment fan = new Fan();
        ElectricalEquipment light = new Light();

        Switch fancySwitch = new FancySwitch();
        Switch normalSwitch = new NormalSwitch();

        fancySwitch.setEquipment(fan);
        fancySwitch.On();
        fancySwitch.Off();

        normalSwitch.setEquipment(light);
        normalSwitch.On();
        normalSwitch.Off();

    }
}