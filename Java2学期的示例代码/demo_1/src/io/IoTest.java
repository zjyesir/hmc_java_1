package io;

import java.io.File;

public class IoTest {

	public IoTest() {
		// TODO Auto-generated constructor stub
	}
	
	static void fileExample() {
		String notExistFilePath = "/Users/ianye/hmcGit/java_1/hmc_java_1/fileTest.txt";
		File noFile = new File(notExistFilePath);
		System.out.println("file exist? "+noFile.exists());
		
		String existFilePath = "/Users/ianye/hmcGit/java_1/hmc_java_1/程序错了怎么办.md";
		File hasFile = new File(existFilePath);
		System.out.println("file exist? "+hasFile.exists());
		
		
	}
	public static void main(String[] args) {
		fileExample();
	}

}
