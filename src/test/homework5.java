package test;

public class homework5 {
	public static void main(String[] args) {
		int money = 1500000 ;
		double fr = 0.02;
	    int year=1;
	    double totle=0;
	    	while(year<=10) {
//	    	  System.out.println(z);
//	    	  z++;
	    	  totle=money * Math.pow(1+fr, year++);
	        }
	    System.out.printf("�����[�Q����%.2f%n",totle);
	}
}
//���� = ����*(1+�Q�v)��n����
//�Y�H�b�Ȧ�s�J150�U�A�Ȧ�Q�v��2%�A�p�G�C�~�Q�����~��s�J�Ȧ�A�Хε{���p��10�~��A��
//���[�Q���@���h�ֿ� 


