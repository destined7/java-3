package A;

import java.util.Scanner;

public class ZZZZ {
	//汉皇重色思倾国御宇多年求不得杨家有女初长成养在深闺人未识天生丽质难自弃一朝选在君王侧回眸一笑百媚生六宫粉黛无颜色
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a=0;
//		char c = 0;
		
		args =  new String[]{"汉皇重色思倾国御宇多年求不得杨家有女初长成养在深闺人未识天生丽质难自弃一朝选在君王侧回眸一笑百媚生六宫粉黛无颜色春寒赐浴华清池温泉水滑洗凝脂侍儿扶起娇无力始是新承恩泽时云鬓花颜金步摇芙蓉帐暖度春宵春宵苦短日高起从此君王不早朝"};
		String str=args[0];
		int y=0;
		int z=0;
		try{
		for(int i =0;i<str.length();i++){
			if((i+1)%7==0){
				if(z%2!=0){
				System.out.println(str.substring(y, i+1)+"。");
				}else{
				System.out.print(str.substring(y, i+1)+",");	
				}
				z++;
				y+=7;
			}
		}}
		catch(Exception e){
			System.err.println("发生异常："+e.toString());
			e.printStackTrace();
			}
			countString(str,"一");
	}
		
		public static void countString(String str,String s){
			int	count = 0;
			for(int i=0;i<str.length();i++){
				if(str.indexOf(s,i)==i){
				count++;
			}
		}
		System.out.println(s+"  出现了   "+count+" 次");
}
}
