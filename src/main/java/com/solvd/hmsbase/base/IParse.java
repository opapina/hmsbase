package com.solvd.hmsbase.base;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public interface IParse {

    void parse() throws ParserConfigurationException, IOException, SAXException;
    
}
