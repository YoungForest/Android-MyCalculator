/*
 * 用于实现简单四则运算的类与方法
*/
package com.example.mycalculator;

public class Calculate {	
	//返回a 'c' b的计算结果
	public static double calculate(double a,double b,char c) {
		double result = 0;
		if(c == '+')
			result = a + b;
		else if(c == '-')
			result = a - b;
		else if(c == '*')
			result = a * b;
		else if(c == '/')
			result = a / b;
		else
			result = 233.33333;
		return result;
	}
	
