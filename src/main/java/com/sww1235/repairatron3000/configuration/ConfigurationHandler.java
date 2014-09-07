package com.sww1235.repairatron3000.configuration;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{
    public static void init(File configFile)
    {
        //create config object from given config file
        Configuration configuration = new Configuration(configFile);

        try
        {
            //load the config file
            configuration.load();

            //read in properties from config file (example boolean)
            boolean configValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "This is a comment").getBoolean(true);
            boolean configValue2 = configuration.get("testCategory", "configValue2", false, "This is another comment").getBoolean();

        }
        catch (Exception e)
        {
            //log the exception
        }
        finally
        {
            //save the config file
            configuration.save();
        }
        }
}
//maybe use reference class to read in config values