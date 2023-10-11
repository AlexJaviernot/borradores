import java.util.Scanner;

public class P2p1_1S22{
	public static void main(String[] args) {
		int opc = 1;
		switch(opc){
		case 1:
			System.out.println("Aqui estamos en la primera opcion");
			break;
		case 2:
			System.out.println("Aqui estamos en la segunda opcion");
			break;
		case 3:
			System.out.println("Aqui estamos en la tercera opcion");
			break;
		default:
			System.out.println("no existe el valor dentro de los casos");
		}

		char opc1= 'a';
		switch(opc1){
		case 'a':
			System.out.println("Selecciono A");
		case 'b':
			System.out.println("Selecciono B");
		case 'c':
			System.out.println("Selecciono C");
		default:
			System.out.println("No esta dentro de las opciones");
		}

		char opc2;
		Scanner teclado = new Scanner(System.in);
		String temp;
		int num1, num2;
		int resultado;

		System.out.println("Programa que realiza operaciones basicas");
		System.out.println("Seleccione la operacion deseada: suma, resta, multiplicacion y division");
		operacion = teclado.nextLine();
		

		}
		opc2 = teclado.next().charAt(0);
		switch(opc2){

if(operacion.equals("suma")){
	case 's':
		System.out.println("aqui ira las operaciones de suma");
		System.out.println("ingresa el primer numero:   ");
		temp = teclado.nextLine();
		num1 = Integer.parseInt(temp);
		System.out.println("ingresa el segundo numero:   ");
		temp = teclado.nextLine();
		num2 = Integer.parseInt(temp);
		resultado = num1 + num2;
		System.out.println("la suma es:  " + resultado);
		break;
 }else if(operacion.equals("resta")){ 
	case 'r':
		System.out.println("aqui ira las operaciones de resta");
		System.out.println("ingresa el primer numero:   ");
		temp = teclado.nextLine();
		num1 = Integer.parseInt(temp);
		System.out.println("ingresa el segundo numero:   ");
		temp = teclado.nextLine();
		num2 = Integer.parseInt(temp);
		resultado = num1 - num2;
		System.out.println("la resta es:  " + resultado);
		break;
 }else if(operacion.equals("multiplicacion")){ 
	case 'm':
		System.out.println("aqui ira las operaciones de multiplicacion");
		System.out.println("ingresa el primer numero:   ");
		temp = teclado.nextLine();
		num1 = Integer.parseInt(temp);
		System.out.println("ingresa el segundo numero:   ");
		temp = teclado.nextLine();
		num2 = Integer.parseInt(temp);
		resultado = num1 * num2;
		System.out.println("la multiplicacion es:  " + resultado);
		break;
 }else if(operacion.equals("division")){ 
	case 'd':
		System.out.println("aqui ira las operaciones de division");
		System.out.println("ingresa el primer numero:   ");
		temp = teclado.nextLine();
		num1 = Integer.parseInt(temp);
		System.out.println("ingresa el segundo numero:   ");
		temp = teclado.nextLine();
		num2 = Integer.parseInt(temp);
		resultado = num1 / num2;
		System.out.println("la division es:  " + resultado);
		break;
	default:
		System.out.println("no existe operacion a realizar...");
		}
	

	}
}