package A;

import java.util.Scanner;

public class ZZZZ {
	//������ɫ˼�����������󲻵������Ů���������������δʶ��������������һ��ѡ�ھ��������һЦ������������������ɫ
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a=0;
//		char c = 0;
		
		args =  new String[]{"������ɫ˼�����������󲻵������Ů���������������δʶ��������������һ��ѡ�ھ��������һЦ������������������ɫ������ԡ�������Ȫˮ��ϴ��֬�̶���������ʼ���³ж���ʱ���޻��ս�ҡܽ����ů�ȴ�����������ո���Ӵ˾������糯"};
		String str=args[0];
		int y=0;
		int z=0;
		try{
		for(int i =0;i<str.length();i++){
			if((i+1)%7==0){
				if(z%2!=0){
				System.out.println(str.substring(y, i+1)+"��");
				}else{
				System.out.print(str.substring(y, i+1)+",");	
				}
				z++;
				y+=7;
			}
		}}
		catch(Exception e){
			System.err.println("�����쳣��"+e.toString());
			e.printStackTrace();
			}
			countString(str,"һ");
	}
		
		public static void countString(String str,String s){
			int	count = 0;
			for(int i=0;i<str.length();i++){
				if(str.indexOf(s,i)==i){
				count++;
			}
		}
		System.out.println(s+"  ������   "+count+" ��");
}
}
