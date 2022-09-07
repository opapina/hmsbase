package com.solvd.hmsbase.base;

import org.w3c.dom.*;
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
    public void parse() throws IOException {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(new File("hmsbase.xml"));

//            String element = reader.readLine();
//            NodeList matchedElementsList = document.getElementsByTagName(element);
            Node root = document.getDocumentElement();
            NodeList hmss = root.getChildNodes();
            for (int i = 0; i < hmss.getLength(); i++) {
                Node hms = hmss.item(i);
                if (hms.getNodeType() != Node.TEXT_NODE) {
                    NodeList hmsfeilds = hms.getChildNodes();
                    for(int j = 0; j < hmsfeilds.getLength(); j++) {
                        Node hmsfeild = hmsfeilds.item(j);
                        if (hmsfeild.getNodeType() != Node.TEXT_NODE) {
                            System.out.println(hmsfeild.getNodeName() + ":" + hmsfeild.getChildNodes().item(0).getTextContent());
                        }
                    }
                    System.out.println("===========>>>>");
                }

//            if (matchedElementsList.getLength() == 0) {
//                System.out.println("Tag " + element + " was not found in the file");
//            } else {
//                int count = 0;
//                System.out.println("Element was found! count of element = " + matchedElementsList.getLength());
//                for (int j = 0; j < matchedElementsList.getLength(); j++) {
//                    Node foundedElement = matchedElementsList.item(j);
//                    count++;
//                    System.out.println(j + 1 + " element " + element);
//                    if (foundedElement.hasChildNodes()) {
//                        for (int i = 0; i < foundedElement.getChildNodes().getLength(); i++) {
//                            Node node = foundedElement.getChildNodes().item(i);
//                            if (node.getNodeType() == Node.TEXT_NODE) {
//                                String textInformation = node.getNodeValue().replace("\n", "").trim();
//                                if (!textInformation.isEmpty()) {
//                                    System.out.println("Into element was found text: " + node.getNodeValue());
//                                }
//                            } else {
//                                System.out.println("- has attr: " + node.getNodeName());
//                                NamedNodeMap attributes = node.getAttributes();
//                                for (int k = 0; k < attributes.getLength(); k++) {
//                                    System.out.println("Attr name: " + attributes.item(k).getNodeName() + ", attr value: " + attributes.item(k).getNodeValue());
//                                }
//                            }
//                            if (node.hasChildNodes()) node.getChildNodes();
                        }

        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        } catch (DOMException e) {
            throw new RuntimeException(e);
        } catch (SAXException e) {
            throw new RuntimeException(e);
        }
    }
}
