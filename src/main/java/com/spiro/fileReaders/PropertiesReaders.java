package com.spiro.fileReaders;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Properties;

public class PropertiesReaders {
    private Properties properties;
    private final String path = "ConfigFile/config.properties";

    public PropertiesReaders() {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader(path));
            properties = new Properties();
            try {
                properties.load(bufferedReader);
                bufferedReader.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getBrowser() {
        String browser = properties.getProperty("browser");
        return browser;
    }

    public String getUrl() {
        String url = properties.getProperty("url");
        return url;
    }

    public String getUsername() {
        String username = properties.getProperty("username");
        return username;
    }

    public String getPassword() {
        String password = properties.getProperty("password");
        return password;
    }


}
