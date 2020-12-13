package ar.com.ada.online.second.abstracts;

public class Wand {
    protected String wandName;
    protected Integer damagePointsAdded;

    public Wand(String wandName, Integer damagePointsAdded) {
        this.wandName = wandName;
        this.damagePointsAdded = damagePointsAdded;
    }

    public String getWandName() {
        return wandName;
    }

    public Integer getDamagePointsAdded() {
        return damagePointsAdded;
    }

    @Override
    public String toString() {
        return "\nVarita de: "
                + wandName +
                ".\n Puntos de daño que agrega: " + damagePointsAdded +
                "\n";
    }
}
