package gsn;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by niennguyen on 8/14/17.
 */
public class Config {
    static Properties properties;

    static {
        try {
            properties = new Properties();
            properties.load(new FileInputStream("config/server.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static final int port = Integer.valueOf(properties.getProperty("port"));
    public static final int portSSL = Integer.valueOf(properties.getProperty("portSSL"));
    public static final String firstMessage = properties.getProperty("defaultMessage");
}
