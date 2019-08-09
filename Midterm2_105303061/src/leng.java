import javax.swing.JOptionPane;

public class leng {
	static boolean isPalindrome(String s) {
		
		boolean x=true;
		int a=s.length();
		//System.out.print(a);
		
		if(a>1) {
			for(int b=0;b<=a/2;b++) {
				String c=""+s.charAt(b);
				int temp=a-b-1;
				String d=""+s.charAt(temp);
				if(c.equals(d)) 
				{
					x=true;
				}
				else {
					x=false;
					break;
				}
			}
		}
		
		else {
			x=false;
		}
		
		return x;
	} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		boolean temp;
		s = JOptionPane.showInputDialog(null,"Enter a string");
		int i=s.length();
		temp=isPalindrome(s);
		//System.out.print(temp);
		if(temp==true) {
			String a=s+" is a palindrome!";
			JOptionPane.showMessageDialog(null,a);
		}
		if(temp==false) {
			String a=s+" is not a palindrome!";
			JOptionPane.showMessageDialog(null,a);
		}
	}

}
