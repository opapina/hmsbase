package com.solvd.hmsbase.base;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.math.BigDecimal;

public class BigDecimalAdapter extends XmlAdapter<String, BigDecimal> {

    @Override
    public String marshal(BigDecimal s) {
        if (s != null) {
            return s.toString();
        }
        return null;
    }

    @Override
    public BigDecimal unmarshal(String s) {
        return new BigDecimal(s);
    }
}
