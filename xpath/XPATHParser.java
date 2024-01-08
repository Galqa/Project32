package xpath;

/*
З 5 завдання першого уроку, яке Ви обрали, за допомогою XPath розпарити XML-документ.
*/

import javax.xml.xpath.*;
import javax.xml.parsers.*;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import java.io.*;

public class XPATHParser {
    public static void main(String[] args) {
        try {
            // Створити об'єкт DocumentBuilder
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();


            Document document = builder.parse(new File("C:\\Users\\My comp\\IdeaProjects\\Lesson48\\src\\main\\java\\task2\\candy.xml"));


            XPathFactory xPathfactory = XPathFactory.newInstance();
            XPath xpath = xPathfactory.newXPath();

            //  XPath-вирази
            String nameExpression = "/Candy/Name";
            String typeExpression = "/Candy/Type";
            String energyExpression = "/Candy/Energy";
            String productionExpression = "/Candy/Production";


            // компіляція XPath-виразів
            XPathExpression nameExpr = xpath.compile(nameExpression);
            XPathExpression typeExpr = xpath.compile(typeExpression);
            XPathExpression energyExpr = xpath.compile(energyExpression);
            XPathExpression productionExpr = xpath.compile(productionExpression);


            // отримаємо список вузлів
            NodeList nameList = (NodeList) nameExpr.evaluate(document, XPathConstants.NODESET);
            NodeList typeList = (NodeList) typeExpr.evaluate(document, XPathConstants.NODESET);
            NodeList energyList = (NodeList) energyExpr.evaluate(document, XPathConstants.NODESET);
            NodeList productionList = (NodeList) productionExpr.evaluate(document, XPathConstants.NODESET);


            System.out.println("Цукерки: назва - вид - енергетмчна цінність - виробник");
            for (int i = 0; i < nameList.getLength(); i++) {
                System.out.println(nameList.item(i).getTextContent() + " - " + typeList.item(i).getTextContent() +
                        " - " + energyList.item(i).getTextContent() + " - " + productionList.item(i).getTextContent());
            }

        } catch (ParserConfigurationException | SAXException | IOException | XPathExpressionException e) {
            e.printStackTrace();
        }
    }
}




