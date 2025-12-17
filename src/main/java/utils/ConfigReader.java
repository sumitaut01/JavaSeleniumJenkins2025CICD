package utils;

import com.google.common.io.Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigReader {
    static Properties properties = new Properties();
    static FileInputStream fileInputStream;

    public static Properties readDefaultProperties() {
        try {
            fileInputStream = new FileInputStream("src/test/resources/config.properties");
            properties.load(fileInputStream);
        } catch (Exception oEx) {
            System.out.println("Error while reading property");
            System.exit(1);
        }
        return properties;
    }
}
