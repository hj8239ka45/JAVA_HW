import javax.swing.JOptionPane;

public class equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name= JOptionPane.showInputDialog("What's your name?");
		String size= JOptionPane.showInputDialog("What's your shoes size?");
		int Size=Integer.parseInt(size);
		if(name.equals("Jone")&&Size==8) {
			JOptionPane.showMessageDialog(null,"I found you!!!!!","°T®§",JOptionPane.PLAIN_MESSAGE);
		}
		else if(name.equals("Jone")||Size==8) {
			JOptionPane.showMessageDialog(null,"Sorry, you're not","°T®§",JOptionPane.PLAIN_MESSAGE);
		}
		else {
			JOptionPane.showMessageDialog(null,"Bye","°T®§",JOptionPane.PLAIN_MESSAGE);
		}
	}

}
