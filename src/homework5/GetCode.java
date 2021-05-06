package homework5;

public class GetCode {
	public void genAuthCode() {
		int[]code=new int[8];
		int r;
		for (int i=0;i<code.length;i++) {
			//字元碼0-z是48到122加1總共75個
			r=(int)((Math.random()*75)+48);
			if ((47<r && r<58) || (64<r && r<91) || (96<r && r<123)) {
				code[i]=r;
				System.out.print((char)code[i]);
			}else {
				i--;
			}
		}
	}
}
