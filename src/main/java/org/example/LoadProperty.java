package org.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadProperty
{
    static Properties prop;
    static FileInputStream input;
    public String getProperty (String key)
    {
        prop = new Properties();
        try {
            String filePath ="src\\test\\resources\\TestData\\TestDataConfig.properties";
            input = new FileInputStream(filePath);
            prop.load(input);
            input.close();

        } catch (IOException e)
        {
            e.printStackTrace();
        }return prop.getProperty(key);
    }
}
