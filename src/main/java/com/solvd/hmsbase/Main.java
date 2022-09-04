package com.solvd.hmsbase;

import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;


public class Main {

    public static void main(String[] args) throws Exception, ParserConfigurationException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new File("hmsbase.xml"));
        String element = reader.readLine();
        NodeList matchedElementsList = document.getElementsByTagName(element);


    }
}
