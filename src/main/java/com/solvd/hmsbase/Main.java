package com.solvd.hmsbase;

import com.solvd.hmsbase.base.DOMParser;
import com.solvd.hmsbase.base.IParse;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        IParse dom = new DOMParser();
        dom.parse();
    }
}
