package com.exer.break_continue;

/*
 * break:使用在switch-case中或者循环中
 * 如果使用循环中，表示：结束当前循环
 * 
 * continue:使用在循环中
 * 表示：结束当次循环
 */
public class Break_Continue {
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			for (int j = 1; j <= 10; j++) {
				if (j % 4 == 0) {
					// break;
					continue;
					//System.out.println("啦啦啦");
				}
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
