/*
 * $filename: TestMain.java,v $
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
public class TestMain {
	
	public static void main(String[] args) {
		WorkQueue wQueue = new WorkQueue(1);//允许同时运行1个线程
		for (int i = 0; i < 10; i++) {
			WaitThread waitThread = new WaitThread();
			wQueue.execute(waitThread);//加入到线程队列
		}
		//没有notifyThread的通知，任何waitThread都不能运行
		//每运行一个notifyThread，就会有一个waitThread得到通知，然后运行
		for (int i = 0; i < 10; i++) {
			NotifyThread notifyThread = new NotifyThread();
			notifyThread.start();
			try {
				Thread.sleep(100);//确保每次通知都有waitThread在等
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
