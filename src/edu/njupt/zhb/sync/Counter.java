/*
 * $filename: Counter.java,v $
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
public class Counter {
	private int count = 0;
	public synchronized void add(int i){
		System.out.println("start...");
		count += i;
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end count = "+i);
	}
	// add == add2
	public void add2(int i){
		synchronized (this) {
			System.out.println("start...");
			count += i;
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("end count = "+i);
		}
	}
}
