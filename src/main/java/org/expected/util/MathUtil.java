package org.expected.util;

import java.util.LinkedList;

public class MathUtil {
	public static void main(String[] args) {
		LinkedList<Double> datas=new LinkedList<Double>();
		for(int i=0;i<5;i++)
			datas.addLast(i+0.5);
		System.out.println(datas.size());
		System.out.println(ExponentialSmoothing(0.0, datas));
	}
	
	public static double ExponentialSmoothing(Double S0,LinkedList<Double> datas) {
		if(datas.size()== 0){
			System.out.println(datas.size());
			return S0;
		}
		else{
			S0=0.8*datas.getFirst()+0.2*S0;
			datas.removeFirst();
			System.out.println(datas.size());
			return ExponentialSmoothing(S0,datas);
		}
	}
}
