package com.solvd.hmsbase;

import com.solvd.hmsbase.base.DOMParser;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;

import java.io.*;

public class Main {

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {

        DOMParser dom = new DOMParser();
        dom.parse();
    }
}
