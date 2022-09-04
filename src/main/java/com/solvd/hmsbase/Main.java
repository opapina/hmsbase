package com.solvd.hmsbase;

import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;


public class Main {

    public static void main(String[] args) throws Exception, ParserConfigurationException {

        DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
        Document document = documentBuilder.newDocument();


    }
}
