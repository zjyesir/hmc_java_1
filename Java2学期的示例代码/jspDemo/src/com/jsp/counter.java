/*
 * counter.java
 *
 * Created on 2007��11��22��, ����10:27
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
    
    
   //��ʼ��JavaBean�ĳ�Ա����
	int count = 0;
// Class������
	public counter() {
	}
//����count��Get����
	public int getCount() {
//��ȡ��������ֵ��ÿһ�����󶼽���������1
	count++;
	return this.count;
	}
//����Count��Set����
	public void setCount(int count) {
	this.count = count;
	}
 
}
