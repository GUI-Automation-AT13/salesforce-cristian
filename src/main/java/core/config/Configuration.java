package core.config;

import io.github.cdimascio.dotenv.Dotenv;

/**
 * This class loads the file to dotenv.
 */
public class Configuration {
    public static Dotenv dotenv = Dotenv.configure().load();
}