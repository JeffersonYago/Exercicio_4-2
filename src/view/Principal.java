package view;

import javax.swing.JOptionPane;

import controller.FattController;

public class Principal {

	public static void main(String[] args) {
		FattController pc = new FattController ();
		int a = Integer.parseInt(JOptionPane.showInputDialog("insira um n�mero �mpar!"));
		while (a % 2 == 0) {
			a =  Integer.parseInt(JOptionPane.showInputDialog("insira um n�mero �mpar!"));
		}
		int resultado = pc.fatoraDuplo(a);
		System.out.println("fatorial duplo de "+a+ " = "+resultado);
	}
}
