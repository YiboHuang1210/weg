package com.hyb.weg.response;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.Serializable;

/**
 * Created by HuangYibo on 2018/4/10.
 */
public class CentreSerializable implements Serializable {
    private static final long serialVersionUID = -9006756275701089041L;

    public CentreSerializable() {
    }

    public final String toString() {
        ObjectMapper mapper = new ObjectMapper();
        String mapJackson = "";
        try {
            mapJackson = mapper.writeValueAsString(this);
        } catch (JsonProcessingException jpe) {
            jpe.printStackTrace();
        }
        return mapJackson;
    }
}

