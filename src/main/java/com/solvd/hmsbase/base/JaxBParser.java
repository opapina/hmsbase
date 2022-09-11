package com.solvd.hmsbase.base;

import com.solvd.hmsbase.organization.HMS;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;;

public class JaxBParser implements IParse {

    private static final Logger LOGGER = LogManager.getLogger(JaxBParser.class);

    @Override
    public void parse() {
        HMS hms = null;
        try {
            JAXBContext context = JAXBContext.newInstance(HMS.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            hms = (HMS) unmarshaller.unmarshal(new File("src/main/resources/hmsbase.xml"));
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
        LOGGER.info(hms.toString());
    }
}
