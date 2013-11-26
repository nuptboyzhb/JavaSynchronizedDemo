/*
 * $filename: WaitThread.java,v $
 * $Date: 2013-11-26  $
 * Copyright (C) ZhengHaibo, Inc. All rights reserved.
 * This software is Made by Zhenghaibo.
 */
package edu.njupt.zhb.sync.notifywait;

/*
 *@author: ZhengHaibo  
 *web:     http://blog.csdn.net/nuptboyzhb
 *mail:    zhb931706659@126.com
 *2013-11-26  Nanjing,njupt,China
 */
public class WaitThread extends Thread {
	public static int count = 0;
	@Override
	public void run() {
		//while (true) {
			synchronized (GlobalSignal.locker) {
				while (!GlobalSignal.condition) {
					try {
						GlobalSignal.locker.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				GlobalSignal.condition = false;
			}// synchronized end
			// do something here
			count++;
			System.out.println("count = "+count);
		//}
	}
}
