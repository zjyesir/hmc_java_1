/**
 * 
 */
package example;

import java.util.Random;

/**
 * @author ianye
 *  书第4章 常用函数， 字符，字符串的例子
 */
public class MathAndStringExample {

	/**
	 * 
	 */
	public MathAndStringExample() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		math中函数的使用
//		demoMathExmaple();
//		简单的用法
//		demoRandomSimpleExample();
////		另一种，略微复杂的用法，但功能更加强大
//		demoOtherRandomExample();
////	    character 对字符的操作
//		characterExample();
////		字符串的操作
		demoStringExamples();
	}
	
	private static  void demoMathExmaple() {
		System.out.println("展示 floor,ceil 和abs的用法 ");
		System.out.println("Math.floor(-2.6) = "+Math.floor(-2.6));
		System.out.println("Math.ceil(-2.6) = "+Math.ceil(-2.6));
		System.out.println("Math.abs(-2.6) = "+Math.abs(-2.6));
		
	}
	private static void demoRandomSimpleExample() {
		System.out.println("简单用法，产生10个随机数的结果如下：");
		for (int i = 0; i < 10; i++) {
			System.out.println("random integer is: "+Math.random());
		}
	}
	
	private static void demoOtherRandomExample() {
//		下面Random()的两种构造方法：
//		Random()：创建一个新的随机数生成器。默认当前系统时间的毫秒数作为种子数
//		Random(long seed)：使用单个 long 种子创建一个新的随机数生成器。
		
//		System.out.println("默认种子构造Random ，产生10个随机数的结果如下：");
//		Random random = new Random();
//		for (int i = 0; i < 10; i++) {
//			System.out.print(random.nextInt(100)+"  ");
//		}
//		
//		System.out.println("");
		
		System.out.println("以我们班级同学人数作为种子构造Random ，产生10个随机数的结果如下：");
		Random random2 = new Random();
		for (int i = 0; i < 10; i++) {
			System.out.print(random2.nextInt(27)+"  ");
		}
		

	}
	
	private static void characterExample() {
		char c1 = 'k';
		char c2 = 'w';
		char c3 = '5';
		char c4 = ' ';
		char c5 = 'W';

		System.out.println("");
//		是否是个数字
		System.out.println("Character.isDigit(c1) = "+Character.isDigit(c3)); //
		System.out.println("Character.isDigit(c1) = "+Character.isDigit(c1)); //
//		是否是个英文字母
		System.out.println("Character.isLetter(c1) = "+Character.isLetter(c1));
		System.out.println("Character.isLetter(c1) = "+Character.isLetter(c4));
//		是否为空格/回车/制表符等
		System.out.println("Character.isSpace(c1) = "+Character.isWhitespace(c4));
		System.out.println("Character.isSpace(c1) = "+Character.isSpace(c1));
//		是否是小写字母
		System.out.println("Character.isLowerCase(c1) = "+Character.isLowerCase(c2));
		System.out.println("Character.isLowerCase(c1) = "+Character.isLowerCase(c5));
//		转变为大写字母
		System.out.println("Character.toUpperCase(c1) = "+Character.toUpperCase(c1));
		
	}
	
	private static void demoStringExamples() {
		 String  words = "make each day count";  
		 String  jackSaidString = "jack said:";
		 String  jackSaidString2 = "jack said:";
		
		 
//		 长度
		 System.out.println("the length of this string : "+words.length());
		 
		 int position = 8;
//		 获取第9个位置的字符
		 System.out.println("the "+position+" th char of this string is "+words.charAt(position));
//		拼接多个字符串
		 System.out.println(jackSaidString+words);
		 
//		 字符串大小写转换
		 System.out.println("the upper  words is : "+words.toUpperCase());
//		 字符串比较
	
		 System.out.println(jackSaidString +"and "+jackSaidString2 +"are " +((jackSaidString.equals(jackSaidString2)?" the same ":"different")));
		 System.out.println(jackSaidString +"and "+jackSaidString2 +"are " +((jackSaidString ==jackSaidString2?" the same ":"different")));
//		 开头，结尾，包含关系
		 String childString = "day";
		 System.out.println(words + (words.contains(childString)?"contains ":"does not contain "+ childString));
		 System.out.println(words + (words.startsWith("ma")?"startsWith ":"does not startsWith "+ "ma"));
		 System.out.println(words + (words.endsWith("ount")?"endsWith ":"does not endsWith"+ "ount"));
//		 获取子串，获取子串所在的起始位置
		 System.out.println("第一次 出现"+childString+ "的下标是："+words.indexOf("day"));
		 System.out.println("从第"+position+"位置"+"到 "+position+7+ " 的子串是："+words.substring(position, position+7));
//		 字符串和数值之间的转换
		 String valueString = "987";

		 System.out.println(Integer.parseInt(valueString));
		 
		 int value = 987;
		 System.out.println(String.valueOf(valueString));
		 String valueInStringFormatString = ""+value;
		
	}
	

}
