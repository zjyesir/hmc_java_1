/*
 * CounterFile.java
 *
 * Created on 2007骞?10鏈?19鏃?, 涓嬪崍4:03
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

//用来操作记录访问次数
public class CounterFile {
	private BufferedReader file; // BufferedReader对象，用于读取文件数据

	public CounterFile() {
	}

	// ReadFile 方法用来读取文件filePath中的数据，并返回这个数据
	public String ReadFile(String filePath) throws FileNotFoundException {
		String currentRecord = null;// 保存文本的变量
		// 创新新的BufferedReader对象
		file = new BufferedReader(new FileReader(filePath));
		String returnStr = null;
		try {
			// 读取一行数据并保存到currentRecord变量中
			currentRecord = file.readLine();
		} catch (IOException e) {// 错误处理
			System.out.println("读取数据错误.");
		}
		if (currentRecord == null)
			// 如果文件为空
			returnStr = "没有任何记录";
		else {// 文件不为空
			returnStr = currentRecord;
		}
		// 返回读取文件的数据
		return returnStr;
	}

//ReadFile方法用来将数据ounter+1后写入到文本文件filePath中
//以实现计数增长的功能
	public synchronized void WriteFile(String filePath, String counter) throws FileNotFoundException {

		int Writestr = 0;
		Writestr = Integer.parseInt(counter);
		try {

			// 创建PrintWriter对象，用于写入数据到文件中
			PrintWriter pw = new PrintWriter(new FileOutputStream(filePath));
			// 用文本格式打印整数Writestr
			pw.println(Writestr);
			// 清除PrintWriter对象
			pw.close();
		} catch (IOException e) {
			// 错误处理
			System.out.println("写入文件错误" + e.getMessage());
		}
	}

}
