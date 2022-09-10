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
            Document document = builder.parse(new File("src/main/resources/hmsbase.xml"));

            Node root = document.getDocumentElement();
            NodeList hmss = root.getChildNodes();
            for (int i = 0; i < hmss.getLength(); i++) {
                Node hms = hmss.item(i);
                if (hms.getNodeType() == Node.TEXT_NODE) {
                    String textInform = hms.getNodeValue().replace("\n", "").trim();
                    if (!textInform.isEmpty()) {
                        System.out.println("Into element was found text: " + hms.getNodeValue());
                    }
                } else {
                    System.out.println("element: " + hms.getNodeName());
                }
                if (hms.getNodeType() != Node.TEXT_NODE) {
                    NodeList hmsFields = hms.getChildNodes();
                    for (int j = 0; j < hmsFields.getLength(); j++) {
                        Node hmsField = hmsFields.item(j);
                        if (hmsField.getNodeType() != Node.TEXT_NODE) {
                            System.out.println("-----------");
                            System.out.println(hmsField.getNodeName() + ": " + hmsField.getChildNodes().item(0).getTextContent());
                            if (hmsField.hasChildNodes()) {
                                NodeList fieldsElements = hmsField.getChildNodes();
                                for (int n = 0; n < fieldsElements.getLength(); n++) {
                                    Node fieldsElement = hmsField.getChildNodes().item(n);
                                    if (!(fieldsElement == null)) {
                                        if (fieldsElement.getNodeType() != Node.TEXT_NODE) {
                                            System.out.println(fieldsElement.getNodeName() + ": " + fieldsElement.getChildNodes().item(0).getTextContent());
                                        }
                                        if (fieldsElement.hasChildNodes()) {
                                            NodeList fieldsChildElements = fieldsElement.getChildNodes();
                                            for (int k = 0; k < fieldsChildElements.getLength(); k++) {
                                                Node fieldsChildElement = fieldsElement.getChildNodes().item(k);
                                                if (!(fieldsChildElement == null)) {
                                                    if (fieldsChildElement.getNodeType() != Node.TEXT_NODE) {
//                                                        System.out.println("----");
                                                        System.out.println(fieldsChildElement.getNodeName() + ": " + fieldsChildElement.getChildNodes().item(0).getTextContent());
                                                        if (fieldsChildElement.hasChildNodes()) {
                                                            NodeList fieldsChildChilds = fieldsChildElement.getChildNodes();
                                                            for (int l = 0; l < fieldsChildElements.getLength(); l++) {
                                                                Node fieldsChildChild = fieldsChildElement.getChildNodes().item(l);
                                                                if (!(fieldsChildChild == null)) {
                                                                    if (fieldsChildChild.getNodeType() != Node.TEXT_NODE) {
                                                                        System.out.println(fieldsChildChild.getNodeName() + " : " + fieldsChildChild.getChildNodes().item(0).getTextContent());
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        NamedNodeMap childAttrs = fieldsChildElement.getAttributes();
                                                        if (null != childAttrs) {
                                                            for (int m = 0; m < childAttrs.getLength(); m++) {
                                                                System.out.println("Attr name: " + childAttrs.item(m).getNodeName() + ", attr value: " + childAttrs.item(m).getNodeValue());
                                                            }

                                                        }
                                                    }
                                                }
                                            }
                                            NamedNodeMap attrs = fieldsElement.getAttributes();
                                            if (null != attrs) {
                                                for (int b = 0; b < attrs.getLength(); b++) {
                                                    System.out.println("Attr name: " + attrs.item(b).getNodeName() + ", attr value: " + attrs.item(b).getNodeValue());
                                                }
                                            }
                                        }
                                    }
                                }
                                NamedNodeMap attributes = hmsField.getAttributes();
                                for (int k = 0; k < attributes.getLength(); k++) {
                                    System.out.println("Attr's name: " + attributes.item(k).getNodeName() + ", attr's value: " + attributes.item(k).getNodeValue());
                                }
                            }
                        }
                    }
                    System.out.println("===========>>>>");
                }
            }
        } catch (ParserConfigurationException | DOMException | SAXException e) {
            throw new RuntimeException(e);
        }
    }
}
