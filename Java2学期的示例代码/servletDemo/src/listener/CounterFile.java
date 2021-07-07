/*
 * CounterFile.java
 *
 * Created on 2007�?10�?19�?, 下午4:03
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package listener;

/**
 *
 * @author hyl
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

//����������¼���ʴ���
public class CounterFile {
	private BufferedReader file; // BufferedReader�������ڶ�ȡ�ļ�����

	public CounterFile() {
	}

	// ReadFile ����������ȡ�ļ�filePath�е����ݣ��������������
	public String ReadFile(String filePath) throws FileNotFoundException {
		String currentRecord = null;// �����ı��ı���
		// �����µ�BufferedReader����
		file = new BufferedReader(new FileReader(filePath));
		String returnStr = null;
		try {
			// ��ȡһ�����ݲ����浽currentRecord������
			currentRecord = file.readLine();
		} catch (IOException e) {// ������
			System.out.println("��ȡ���ݴ���.");
		}
		if (currentRecord == null)
			// ����ļ�Ϊ��
			returnStr = "û���κμ�¼";
		else {// �ļ���Ϊ��
			returnStr = currentRecord;
		}
		// ���ض�ȡ�ļ�������
		return returnStr;
	}

//ReadFile��������������ounter+1��д�뵽�ı��ļ�filePath��
//��ʵ�ּ��������Ĺ���
	public synchronized void WriteFile(String filePath, String counter) throws FileNotFoundException {

		int Writestr = 0;
		Writestr = Integer.parseInt(counter);
		try {

			// ����PrintWriter��������д�����ݵ��ļ���
			PrintWriter pw = new PrintWriter(new FileOutputStream(filePath));
			// ���ı���ʽ��ӡ����Writestr
			pw.println(Writestr);
			// ���PrintWriter����
			pw.close();
		} catch (IOException e) {
			// ������
			System.out.println("д���ļ�����" + e.getMessage());
		}
	}

}
