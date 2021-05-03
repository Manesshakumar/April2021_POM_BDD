package com.qa.reader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	private Properties prop;

	public Properties init_prop() {
		prop = new Properties();
		try {
			FileInputStream io = new FileInputStream("./src/test/resources/config/config.properties");
			prop.load(io);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return prop;
	}

}
