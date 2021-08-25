package com.jkpark.algorithm;

public class BaseMain {
	public static void execute(BaseAlgorithm algorithm) {
		algorithm.initParam();
		algorithm.execute();
		algorithm.printResult();
	}
}
