package ExampleBP;

public class Switch {
    private ElectricalEquipment equipment;

    public void setEquipment(ElectricalEquipment equipment) {
        this.equipment = equipment;
    }

    public ElectricalEquipment getElectricalEquipment() {
        return equipment;
    }

    public void On() {
        System.out.println("Switch On the equipment");
        equipment.PowerOn();
    }

    public void Off() {
        System.out.println("Switch Off the equipment");
        equipment.PowerOff();
    }
}
