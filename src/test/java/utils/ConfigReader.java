package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
private static Properties p = new Properties();
    static {

        try {
            FileInputStream fis = new FileInputStream("src/test/resources/config.properties");
            p.load(fis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static String getProperty(String key){
         return p.getProperty(key);
    }
}
