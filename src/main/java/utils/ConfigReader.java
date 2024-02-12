package utils;
import java.io.InputStream;
import java.util.Properties;


public class ConfigReader {
     Properties properties= new Properties();
    public ConfigReader() {
        try {
            InputStream is = ConfigReader.class.getResourceAsStream("/config.properties");
            if(is != null) {
                properties.load(is);
                // Allow system properties to override config.properties
                properties.putAll(System.getProperties());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }

}
