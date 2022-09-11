package com.solvd.hmsbase.base;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.IntNode;
import com.solvd.hmsbase.organization.HMS;

import java.io.File;
import java.io.IOException;

public class JacksonParser {
    ObjectMapper mapper = new ObjectMapper();

    HMS hms;

    {
        try {
            hms = mapper.readValue(new File("src/main/resources/hmsbase.json"), HMS.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public JacksonParser(JsonParser hms, DeserializationContext hms)
            throws IOException, JsonProcessingException {
        JsonNode node = hms.getCodec().readTree(hms);
        int id = (Integer) ((IntNode) node.get("id")).numberValue();
        String itemName = node.get("itemName").asText();
        int userId = (Integer) ((IntNode) node.get("createdBy")).numberValue();
    }
}
