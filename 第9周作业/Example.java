

public class Example {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1、添加----------");
		add();
		System.out.println("2、删除-----------");
		remove();
		System.out.println("3、修改-----------");
		alter();
	}
	public static void add() {
		StringBuffer sb=new StringBuffer();  //定义一个字符串缓冲区
		StringBuffer bt=new StringBuffer(); 
		sb.append("贾");                 //添加姓名
		bt.append("1848050");               //添加学号
		System.out.println("append添加结果："+sb+bt);
		sb.insert(2,"培丰");                  //在指定位置添加字符
		bt.insert(5, "012");
		System.out.println("insert添加的结果："+sb+bt);
	}
	public static void remove() {
		StringBuffer sb=new StringBuffer("贾培丰");
		StringBuffer bt=new StringBuffer("1848050012"); 
		System.out.println("最初的样子："+sb+bt);
		bt.delete(1, 5);           //指定位置删除
		System.out.println("删除指定位置的结果："+sb+bt);
		sb.deleteCharAt(2);    
		System.out.println("指定位置删除后的结果："+sb+bt);
		bt.delete(0, sb.length());
		System.out.println("清空缓冲区的结果："+sb+bt);
	}
	public static void alter() {
		StringBuffer sb =new StringBuffer("贾");
		StringBuffer bt=new StringBuffer("1184805");
		System.out.println("最初的样子："+sb+bt);
		sb.setCharAt(1, '李');
		System.out.println("修改指定位置字符结果："+sb+bt);
		bt.replace(1, 3, "44");
		System.out.println("替换指定位置字符串的结果："+sb+bt);
		System.out.println("字符串翻转结果："+sb+bt.reverse());
	}

}
