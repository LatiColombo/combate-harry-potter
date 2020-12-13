package ar.com.ada.online.second.abstracts;

public class DefenseSpell extends Spell {

    @Override
    public String toString() {
        return "\nDEFENSA/CURACIÓN:\n\t" +
                name +
                "\n\tPuntos de sanación: " + heal +
                "\n\tEnergía mágica requerida: " + requiredMagicPoints +
                "\n ";

    }
}
