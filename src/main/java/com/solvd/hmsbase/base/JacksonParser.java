package com.solvd.hmsbase.base;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.solvd.hmsbase.organization.HMS;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;

public class JacksonParser implements IParse {

    private static final Logger LOGGER = LogManager.getLogger(JacksonParser.class);

    @Override
    public void parse() {
        ObjectMapper mapper = new ObjectMapper();
        HMS hms;
        try {
            hms = mapper.readValue(new File("src/main/resources/hmsbase.json"), HMS.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        LOGGER.info(hms.toString());
    }
}
