package homework1;

public class homework3 {
//256559秒為多少天、多少小時、多少分與多少秒
	public static void main(String[] args){
		int total = 256559;
		int second = 1;//秒
		int minute = second * 60;//分		
		double hour= minute * 60;//時
		double day = hour * 24;//天
		double e =total/day;//求天
		double f =(total%day)/hour;//求時
		double g =((total%day)%hour)/minute;//求分
		double h =(((total%day)%hour)%minute);//求秒
		
		System.out.println (total+"秒總共是"+(int)e+"天"+(int)f+"時"+(int)g+"分"+(int)h+"秒");
		
		
		
		System.out.println(total+"秒是"+(int)(total/day)+"天");
		System.out.println(total+"秒是"+(int)(total/hour)+"個小時");
		System.out.println(total+"秒是"+(int)(total/minute)+"個分鐘");
		System.out.println(total+"秒是"+(int)(total/second)+"個秒鐘");
		
	}
}
