package jaxb;


import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
 class Ingredients {

    @XmlElement(name = "Water")
    private int water;

    @XmlElement(name = "Sugar")
    private int sugar;

    @XmlElement(name = "Fructose")
    private int fructose;

    @XmlElement(name = "Vanillin")
    private int vanillin;

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getSugar() {
        return sugar;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    public int getFructose() {
        return fructose;
    }

    public void setFructose(int fructose) {
        this.fructose = fructose;
    }

    public int getVanillin() {
        return vanillin;
    }

    public void setVanillin(int vanillin) {
        this.vanillin = vanillin;
    }
}