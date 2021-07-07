/*
 * counter.java
 *
 * Created on 2007年11月22日, 上午10:27
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package com.jsp;

/**
 *
 * @author hyl
 */
public class counter {
    
    
   //初始化JavaBean的成员变量
	int count = 0;
// Class构造器
	public counter() {
	}
//属性count的Get方法
	public int getCount() {
//获取计数器的值，每一次请求都将计数器加1
	count++;
	return this.count;
	}
//属性Count的Set方法
	public void setCount(int count) {
	this.count = count;
	}
 
}
