package org.expected.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import weka.core.converters.ConverterUtils.DataSource;

public class Writer {
	
	public static DataSource csvDataSourceCreate(String[] x,String[] y) throws Exception{
		FileWriter csvFileWriter = new FileWriter("temp.csv");
		BufferedWriter writer  = new BufferedWriter(csvFileWriter);
		writer.write("X,Y");
		writer.newLine();
		for (int i = 0; i < x.length; i++) {
			writer.write(x[i]+","+y[i]);
			writer.newLine();
		}
		writer.close();
		return new DataSource("temp.csv");
	}
	
}
