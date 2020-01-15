package co.pragra.b18.config;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Paths;
import java.util.Properties;

public class FrameWorkConfig {
    private Properties properties;
    private static FrameWorkConfig frameWorkConfig;
    private static Logger logger = LogManager.getLogger(FrameWorkConfig.class);

    private FrameWorkConfig(){
        try {
            InputStream inputStream =
                    new FileInputStream(Paths.get("src/test/resources/framework.properties").toFile());
            properties = new Properties();
            properties.load(inputStream);
        }catch (IOException ex){
            logger.fatal("Check if file  {}  exists", Paths.get("src/test/resources/framework.properties").toString());
            logger.fatal(ex.getMessage());
            logger.fatal("Exiting the run");
            System.exit(1);
        }
    }

    public static String getProperty(String key){
        if(frameWorkConfig==null){
            frameWorkConfig = new FrameWorkConfig();
        }
        return (String)frameWorkConfig.properties.get(key);
    }


}
