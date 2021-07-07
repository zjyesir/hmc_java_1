package oop1;

public class Teacher {
	
	private String name;
//	.....省略其他关于老师的信息

	public Teacher(String pName) {
		name = pName;
	}
	
/**
 * 这是一个public 函数，是可以被其他对象调用的，
 * @param question  学生的问题
 * @return 老师的回答
 */
	public String ask(String question) {
		String answer = think(question);
		return answer;
	}
	
	/**
	 * 这个函数具体展示了老师是怎么思考的，它是private，说明，其他对象是没法
	 * 调用它的，它是被隐藏的细节实现，不需要外界知道，如果某一天，这个老师的学识，经历
	 * 产生了变化(这个函数的算法产生了变化)，类的设计者只需要在这个函数里面修改此函数即可，
	 * 类的调用者无需知道 “修改细节”，他们依然通过ask调用即可。
	 * 好处1. 封装，调用者远离细节，细节的修改，更新，都不要关注，学生只要关注获取答案即可。
	 * 好处2. 好维护，不需要调用者改调用方式，即使代码升级，依然用 teacher.ask()
	 *        节省了外在代码的修改量，这个在大型工程项目中尤其重要。
	 * @param question  学生的问题
	 * @return  老师的回答
	 */
	protected String think(String question) {
//		此处省略如何思考的细节，老师会基于自己的学识，经历，针对你的问题，给出自己
//		的答案或者建议, 这里省略如何获取thinkResult，只是简单的举个例子。
		String thinkResult=""; 
		return thinkResult;
	}
	
	

}
