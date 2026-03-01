package reader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Properties;

public class ConfigReader {
    private static Properties properties = new Properties();
    static{
        try {
            InputStream inputStream = ConfigReader.class
                    .getClassLoader()
                    .getResourceAsStream("config.properties");
            properties.load(inputStream);

        } catch(IOException e){
            e.printStackTrace();
        }
    }
    public static String getProperty(String propKey){
        return properties.getProperty(propKey.trim());
    }

}
