package ar.com.ada.online.second.abstracts;

public class EnergySpell extends Spell {

    @Override
    public String toString() {
        return "\nENERGÍA MÁGICA:\n\t" +
                name +
                "\n\tEnergía mágica requerida: " + requiredMagicPoints +
                "\n\tEnergía mágica recuperada: " + magicEnergy +
                "\n ";
    }
}
