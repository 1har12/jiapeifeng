package view;

import java.util.Scanner;
import view.MainUI;
import biz.*;
import dao.*;
import entity.*;
public class CourseSelection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			MainUI.show();
			CourseDao.getInstance();
	}
	public static void show() {
		int flag=0;
		while(true){
			if(flag==1) break;
			System.out.println("————————————欢迎进入选课系统————————————\r\n"
				            +"—————1.正选——————2.正选结果—————3.退选—————4.退出——\r\n"
				           +"请输入要进行的操作\r\n"
				);
		Scanner scanner = new Scanner(System.in);
		String option1=scanner.nextLine();
		switch(option1){
		case "1":
//			System.out.println("请输入您选择的课程编号");
			SCBiz scBiz = new SCBiz();
			scBiz.selection();
//			show();
			break;
		case "2": break;
		case "3": break;
		case "4": flag=1; break;
		}
		}
		
//		System.out.println("请选择你的课程：");
		/*System.out.println("课程列表：\r\n"
				+ "1.数据科学导论\r\n"
				+ "2.大数据采集与预处理技术\r\n"
				+ "3.前端开发技术\r\n"
				+ "4.大数据技术及应用\r\n"
				+ "5.数据库系统与数据仓库\r\n"
				+ "6.计算机系统基础\r\n"
				+ "0.退出选课");*/
//		System.out.println("请输入选择的课程编号");
//		Scanner scanner1 = new Scanner(System.in);
//		String option = scanner1.nextLine();
		
	/*	switch (option) {
		case "1":
			System.out.println("已选上数据科学导论");
			show();
			break;
		case "2":
			System.out.println("已选大数据技术及应用");
			show();
			break;
		case "3":
			System.out.println("已选上前端开发技术");
			show();
			break;
		case "4":
			System.out.println("已选上大数据技术及应用");
			show();
			break;
		case "5":
			System.out.println("已选上数据库系统与数据仓库");
			show();
			break;
		case "6":
			System.out.println("已选上计算机系统基础");
			show();
			break;
		case "0":
			System.out.print("已退出");
			break;
		}*/
//		System.out.println("\n");
//		MainUI.show();	
	} 
}
