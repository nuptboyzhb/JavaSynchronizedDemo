/*
 * $filename: TestMain.java,v $
 * $Date: 2013-11-26  $
 * Copyright (C) ZhengHaibo, Inc. All rights reserved.
 * This software is Made by Zhenghaibo.
 */
package edu.njupt.zhb.sync;

/*
 *@author: ZhengHaibo  
 *web:     http://blog.csdn.net/nuptboyzhb
 *mail:    zhb931706659@126.com
 *2013-11-26  Nanjing,njupt,China
 */
public class TestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//testExample1();
		testExample2();
	}
	/**
	 * 同一个对象，生成的多个线程，在synchronized关键字的同步块中
	 * 只能有一个线程同时执行，其他线程等待
	 * 运行结果：
	 * start和end count = 成对出现
	 */
	public static void testExample1(){
		// TODO Auto-generated method stub
		Counter counter = new Counter();//同一个对象
		Thread threadA = new CounterThread(counter);
		Thread threadB = new CounterThread(counter);

		threadA.start();
		threadB.start();
	}
	/**
	 * 两个不同的个对象，生成的多个线程，在synchronized关键字的同步块中
	 * 可以各自运行各自的，可以同时执行。
	 * 运行结果：
	 * start和end count = 不是成对出现
	 */
	public static void testExample2(){
		// TODO Auto-generated method stub
		Counter counter1 = new Counter();
		Counter counter2 = new Counter();
		Thread threadA = new CounterThread(counter1);
		Thread threadB = new CounterThread(counter2);
		threadA.start();
		threadB.start();
	}

}
