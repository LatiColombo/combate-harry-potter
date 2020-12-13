package ar.com.ada.online.second.abstracts;

public class AttackSpell extends Spell {

    public AttackSpell() {
    }

    @Override
    public String toString() {
        return "\nATAQUE:\n\t" +
                name +
                "\n\tAtaque básico: " + attack +
                "\n\tEnergía mágica requerida: " + requiredMagicPoints +
                "\n";
    }
}


