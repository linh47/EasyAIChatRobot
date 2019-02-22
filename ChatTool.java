/**
	实现伪AI聊天机器人
	需求：
		A:读取用户输入字符串
		B：随机回复"是吗？"、"然后呢？"、"这样啊"和重复用户输入的最后一句话。
			
*/
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Random;
class ChatTool
{
	private static String reply="";
	private static int max=4;
	private static int min=1;
	private static boolean flag=true;
	private ChatTool(){
		
	}
	public static void chat(){
				SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
				System.out.println("时间："+df.format(new Date()));
				System.out.println("最近还好吗？");
				Scanner sc=new Scanner(System.in);
				while(flag)
				{
						String chatString=sc.nextLine();
						if(chatString.isEmpty())
						{
							flag=false;							
							System.out.println("时间："+df.format(new Date()));
							System.out.println("你不想说就下次再聊吧。");
						}else if(chatString.contains("拜拜")||chatString.contains("再见")){
							flag=false;							
							System.out.println("时间："+df.format(new Date()));
							System.out.println("好的，下次再聊吧。");
						}else
						{
							Random random = new Random();
							int s = random.nextInt(max)%(max-min+1) + min;	
							switch(s){
								case 1:
								System.out.println("时间："+df.format(new Date()));
								reply ="然后呢？";
								break;
								case 2:
								System.out.println("时间："+df.format(new Date()));
								if(chatString.contains("，")){
									reply=chatString.substring(chatString.lastIndexOf("，")+1)+"？";
								}
								else{
									reply=chatString+"？";
								}
								break;				
								case 3:
								System.out.println("时间："+df.format(new Date()));
								reply ="是吗？";
								break;												
								default :
								System.out.println("时间："+df.format(new Date()));
								reply="这样啊";
								
								}
							System.out.println(reply);
						}
				}
				
	}
}