package homework1;

public class homework3 {
//256559���h�֤ѡB�h�֤p�ɡB�h�֤��P�h�֬�
	public static void main(String[] args){
		int total = 256559;
		int second = 1;//��
		int minute = second * 60;//��		
		double hour= minute * 60;//��
		double day = hour * 24;//��
		double e =total/day;//�D��
		double f =(total%day)/hour;//�D��
		double g =((total%day)%hour)/minute;//�D��
		double h =(((total%day)%hour)%minute);//�D��
		
		System.out.println (total+"���`�@�O"+(int)e+"��"+(int)f+"��"+(int)g+"��"+(int)h+"��");
		
		
		
		System.out.println(total+"��O"+(int)(total/day)+"��");
		System.out.println(total+"��O"+(int)(total/hour)+"�Ӥp��");
		System.out.println(total+"��O"+(int)(total/minute)+"�Ӥ���");
		System.out.println(total+"��O"+(int)(total/second)+"�Ӭ���");
		
	}
}
