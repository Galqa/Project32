package jaxb;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;


import java.util.List;



@XmlRootElement(name = "Candy")
@XmlAccessorType(XmlAccessType.FIELD)
public class Candy {

    @XmlElement(name = "Name")
    private List<String> name;

    @XmlElement(name = "Energy")
    private List<Integer> energy;

    @XmlElement(name = "Type")
    private List<Type> type;

    @XmlElement(name = "Ingredients")
    private List<Ingredients> ingredients;

    @XmlElement(name = "Value")
    private List<Value> value;

    @XmlElement(name = "Production")
    private List<String> production;

    public List<String> getName() {
        return name;
    }

    public void setName(List<String> name) {
        this.name = name;
    }

    public List<Integer> getEnergy() {
        return energy;
    }

    public void setEnergy(List<Integer> energy) {
        this.energy = energy;
    }

    public List<Type> getType() {
        return type;
    }

    public void setType(List<Type> type) {
        this.type = type;
    }

    public List<Ingredients> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredients> ingredients) {
        this.ingredients = ingredients;
    }

    public List<Value> getValue() {
        return value;
    }

    public void setValue(List<Value> value) {
        this.value = value;
    }

    public List<String> getProduction() {
        return production;
    }

    public void setProduction(List<String> production) {
        this.production = production;
    }
}


