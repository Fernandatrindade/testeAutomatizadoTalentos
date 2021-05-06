package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.util.Properties;

public class PropertiesFile {

    /**
     * Responsável por ler o valor de um atributo no arquivo de propriedades
     *
     * @param propriedades nome do atributo
     * @return valor do atributo
     */
    public static String readPropertiesFile(String propriedades) {
        Properties prop = new Properties();
        try {
            String filePath = System.getProperty("user.dir") + "/src/test/java/config/config.properties";
            InputStream input = new FileInputStream(filePath);
            prop.load(input);
            prop.getProperty(propriedades);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return prop.getProperty(propriedades);
    }

    /**
     * Responsável por gravar o valor de um atributo no arquivo de propriedades
     *
     * @param propriedades nome do atributo
     * @param valor        do atributo
     * @return propriedades e valor
     */
    public static String writerPropertiesFile(String propriedades, String valor) {
        Properties prop = new Properties();
        try {
            String filePath = System.getProperty("user.dir") + "/src/test/java/config/config.properties";
            InputStream input = new FileInputStream(filePath);
            prop.load(input);

            OutputStream output = new FileOutputStream(filePath);
            prop.setProperty(propriedades, valor);
            prop.store(output, "Gravando");
            System.out.println(prop.setProperty(propriedades, valor));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (String) prop.setProperty(propriedades, valor);
    }
}
