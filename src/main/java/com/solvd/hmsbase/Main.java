package com.solvd.hmsbase;

import com.solvd.hmsbase.base.DOMParser;
import com.solvd.hmsbase.base.IParse;
import com.solvd.hmsbase.base.JaxBParser;
import com.solvd.hmsbase.base.JacksonParser;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        IParse dom = new DOMParser();
        dom.parse();

        IParse jaxB = new JaxBParser();
        jaxB.parse();

        IParse jackson = (IParse) new JacksonParser();
        jackson.parse();
    }
}
