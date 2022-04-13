package com.lengcz.springbootocr.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@ConfigurationProperties(prefix = "ocr")
public class OcrProperties {

    private String tessdata;

    private String[] file_suffix;

    public String getTessdata() {
        return tessdata;
    }

    public void setTessdata(String tessdata) {
        this.tessdata = tessdata;
    }

    public String[] getFile_suffix() {
        return file_suffix;
    }

    public void setFile_suffix(String[] file_suffix) {
        this.file_suffix = file_suffix;
    }

    @Override
    public String toString() {
        return "OcrProperties{" +
                "tessdata='" + tessdata + '\'' +
                ", file_suffix=" + Arrays.toString(file_suffix) +
                '}';
    }
}
