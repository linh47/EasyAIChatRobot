/**
	ʵ��αAI���������
	����
		A:��ȡ�û������ַ���
		B������ظ�"����"��"Ȼ���أ�"���ظ��û���������һ�仰��
			
*/
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Random;
class AIChatTest{
	public static void main(String[] args)
	{
		ChatModule ct=new ChatModule();
		ct.chat();		
	}
}
class ChatModule
{
	private Date date;
	private String reply="";
	private static int max=4;
	private static int min=1;
	private boolean flag=true;
	private static SimpleDateFormat df;
	public ChatModule(){
		df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//�������ڸ�ʽ
	};
	public  void chat(){
				this.date=new Date();//��ȡ��ǰʱ��
				System.out.println("ʱ�䣺"+df.format(date));
				System.out.println("���������");
				Scanner sc=new Scanner(System.in);
				while(flag)
				{
						String chatString=sc.nextLine();
						if(chatString.isEmpty())
						{
							flag=false;							
							System.out.println("ʱ�䣺"+df.format(new Date()));
							System.out.println("�㲻��˵���´����İɡ�");
						}else if(chatString.contains("�ݰ�")||chatString.contains("�ټ�")){
							flag=false;							
							System.out.println("ʱ�䣺"+df.format(new Date()));
							System.out.println("�õģ��´����İɡ�");
						}else
						{
							Random random = new Random();
							int s = random.nextInt(max)%(max-min+1) + min;	
							switch(s){
								case 1:
								System.out.println("ʱ�䣺"+df.format(new Date()));
								reply ="Ȼ���أ�";
								break;
								case 2:
								System.out.println("ʱ�䣺"+df.format(new Date()));
								if(chatString.contains("��")){
									reply=chatString.substring(chatString.lastIndexOf("��")+1)+"��";
								}
								else{
									reply=chatString+"��";
								}
								break;				
								case 3:
								System.out.println("ʱ�䣺"+df.format(new Date()));
								reply ="����";
								break;												
								default :
								System.out.println("ʱ�䣺"+df.format(new Date()));
								reply="������";
								
								}
							System.out.println(reply);
						}
				}
				
				
				
				
	}
}