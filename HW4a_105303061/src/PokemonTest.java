//105303061 ¾÷±ñ2B ³¯´Q²N
//JOptionPane_test
//set_test get_test
//Integer.parseInt_test
//String = string1 + string2_test
import java.util.Scanner;

import javax.swing.JOptionPane;

public class PokemonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		String temp;
		int dust;
		int cost;
		Scanner scan = new Scanner(System.in);
		Pokemon Pokemongo =new Pokemon();
		
		name = JOptionPane.showInputDialog(null,"What Pokemon do you get?");
		Pokemongo.setName(name);
		
		temp = JOptionPane.showInputDialog(null,"How many stardust will consume when you powerup this pokemon?");
		dust = Integer.parseInt(temp);
		
		Pokemongo.setDust(dust);
		if(Pokemongo.getDust()>800) {
			String output = Pokemongo.getName()+" is a big pokemon.";
			JOptionPane.showMessageDialog(null,output);
		}
		else if(Pokemongo.getDust()==800) {
			String output = Pokemongo.getName()+" is a medium pokemon.";
			JOptionPane.showMessageDialog(null,output);
		}
		else {
			String output = Pokemongo.getName()+" is a small pokemon.";
			JOptionPane.showMessageDialog(null,output);
		}

		
	}
}
