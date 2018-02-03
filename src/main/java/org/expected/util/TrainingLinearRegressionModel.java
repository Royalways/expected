package org.expected.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import weka.classifiers.AbstractClassifier;
import weka.classifiers.functions.SimpleLinearRegression;
import weka.core.Instances;
import weka.core.converters.ArffSaver;
import weka.core.converters.ConverterUtils.DataSource;

public class TrainingLinearRegressionModel {
	public static AbstractClassifier simpleLinearModel(String[] x,String[] y)throws Exception{
		DataSource dataSource = Writer.csvDataSourceCreate(x,y);
		Instances CSV_instances  = dataSource.getDataSet();
		ArffSaver saver = new ArffSaver();
		saver.setInstances(CSV_instances);
//		File file = new File("temp.arff");
//		if(file.exists())
//			file.delete();
//		saver.setFile(file);
//		saver.setDestination(file);
//        saver.writeBatch();
		BufferedWriter writer = new BufferedWriter(new FileWriter("temp.arff"));
		writer.write(CSV_instances.toString());
		writer.close();
		
        Instances Arff_instances = DataSource.read("temp.arff");
        Arff_instances.setClassIndex(Arff_instances.numAttributes()-1);
		SimpleLinearRegression linear = new SimpleLinearRegression();
		linear.buildClassifier(Arff_instances);
		return linear;
	}
}
