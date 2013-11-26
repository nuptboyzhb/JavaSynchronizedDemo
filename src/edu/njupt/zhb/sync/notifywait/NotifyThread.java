/*
 * $filename: NotifyThread.java,v $
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
public class NotifyThread extends Thread {

	public void run() {
		synchronized (GlobalSignal.locker) {
			GlobalSignal.condition = true;
			GlobalSignal.locker.notifyAll();
			System.out.println("Noticer:分配一个新任务通知");
		}
	}

}
