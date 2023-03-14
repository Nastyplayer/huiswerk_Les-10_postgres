package com.example.huiswerk_les10_techiteasy.dto.output;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class TelevisionOutputDto {
    @Id
    @GeneratedValue

    public Long id;
    public String type;
    public String brand;

    public String name;
    public double price;
    public double availableSize;
    public double refreshRate;
    public  String screenType;
    public String screenQuality;
    public boolean smartTv;
    public boolean wifi;
    public boolean voiceControl;
    public boolean hdr;
    public boolean bluetooth;
    public boolean ambiLight;

    public int originalStock;

    public int sold;
}
