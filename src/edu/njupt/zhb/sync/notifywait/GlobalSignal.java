/*
 * $filename: GlobalSignal.java,v $
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
public class GlobalSignal {
	public final static Object locker = new Object();
	public static boolean condition = false;
}
