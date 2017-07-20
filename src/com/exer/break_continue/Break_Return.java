package com.exer.break_continue;

public class Break_Return {  
	   
    public static void main(String[] args) {  
           
        for(int i=0;i<4;i++){  
            for(int j=0;j<4;j++){  
                System.out.println("测试i="+i+" 测试j="+j);  
                if(i==2) return;//测试return  
   //           if(i==2) break;//测试break  
                System.out.println("j"+j+"循环结束");  
            }  
        }  
        System.out.println("i循环结束");  
           
    }  
    
}  