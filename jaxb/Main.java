package jaxb;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;

/**
 * З 5 завдання першого уроку, яке Ви обрали, розпарсити XML-документ за допомогою JAXB.
 */

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\My comp\\IdeaProjects\\Lesson48\\src\\main\\java\\task2\\candy.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Candy.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Candy candy = (Candy) jaxbUnmarshaller.unmarshal(file);

            for (int i = 0; i < candy.getName().size(); i++) {
                System.out.println("Name: " + candy.getName().get(i));
                System.out.println("Energy: " + candy.getEnergy().get(i));
                System.out.println("Type: " + candy.getType().get(i).getCandyType());
                System.out.println("Ingredients: " + candy.getIngredients().get(i).getWater() + ", " + candy.getIngredients().get(i).getSugar() + ", " + candy.getIngredients().get(i).getFructose() + ", " + candy.getIngredients().get(i).getVanillin());
                System.out.println("Value: " + candy.getValue().get(i).getProtein() + ", " + candy.getValue().get(i).getFat() + ", " + candy.getValue().get(i).getCarbohydrate());
                System.out.println("Production: " + candy.getProduction().get(i));
                System.out.println();
            }

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}

