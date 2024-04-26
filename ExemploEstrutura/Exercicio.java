package ExemploEstrutura;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashSet<Integer>num1 = new HashSet<Integer>();
		num1.add(1);
		num1.add(221);
		num1.add(33);
		num1.add(44);
		
		System.out.println("Listando Desordenado");
		for(int valor : num1) {
			System.out.println(valor);
		}
		LinkedHashSet<Integer> num2 = new LinkedHashSet<Integer>();
		num2.add(1);
		num2.add(221);
		num2.add(33);
		num2.add(44);
		
		System.out.println("Listando Ordenado");
		for(int valor :num2) {
			System.out.println(valor);
		}
		Set treeSet = new TreeSet<Integer>(num1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
