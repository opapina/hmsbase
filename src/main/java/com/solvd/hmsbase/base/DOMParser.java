package com.solvd.hmsbase.base;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class DOMParser implements IParse {

    @Override
    public void parse() throws ParserConfigurationException, IOException, SAXException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new File("hmsbase.xml"));
        String element = reader.readLine();
        NodeList matchedElementsList = document.getElementsByTagName(element);
        if (matchedElementsList.getLength() == 0) {
            System.out.println("Tag " + element + " was not found in the file");
        } else {
            int count = 0;
            System.out.println("Element was found! count of element = " + matchedElementsList.getLength());
            for (int j = 0; j < matchedElementsList.getLength(); j++) {
                Node foundedElement = matchedElementsList.item(j);
                count++;
                System.out.println(j + 1 + " element " + element);
                if (foundedElement.hasChildNodes()) {
                    for (int i = 0; i < foundedElement.getChildNodes().getLength(); i++) {
                        Node node = foundedElement.getChildNodes().item(i);
                        if (node.getNodeType() == Node.TEXT_NODE) {
                            String textInformation = node.getNodeValue().replace("\n", "").trim();
                            if (!textInformation.isEmpty()) {
                                System.out.println("Into element was found text: " + node.getNodeValue());
                            }
                        } else {
                            System.out.println("- has attr: " + node.getNodeName());
                            NamedNodeMap attributes = node.getAttributes();
                            for (int k = 0; k < attributes.getLength(); k++) {
                                System.out.println("Attr name: " + attributes.item(k).getNodeName() + ", attr value: " + attributes.item(k).getNodeValue());
                            }
                        }
                        if (node.hasChildNodes()) node.getChildNodes();
                    }
                }
            }
        }
    }
}