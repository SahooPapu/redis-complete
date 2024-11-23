package com.bip;

import lombok.Data;
import java.io.Serializable;
@Data
public class Country implements Serializable {

    private Integer sno;
    private String name;
    private String countryCode;

}