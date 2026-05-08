package Main;

import java.util.Scanner;

import LogicaMetodos.Implementacion;
import Modelo.Usuarios;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner lectura = null;


		System.out.println("----HOLA MUNDO ---");
		System.out.println("TIENES UN :" );
		String usuario;
		String contraseña;
		boolean estatus;

		Usuarios user;

		int menuPrin, indice;

		// Realizar la instancia de clase
		Implementacion imp = new Implementacion();

		do {
			System.out.println("-----inicio ------");
			System.out.println("Menu Principal");
			System.out.println("1 --- Alta");
			System.out.println("2 --- Mostrar");
			System.out.println("3 --- Buscar ");
			System.out.println("4 --- Editar");
			System.out.println("5 --- Eliminar");
			System.out.println("6 --- - Buscar por Marca");
			System.out.println("7 --- - Editar el  stock Buscando por Marca");
			System.out.println("8 --- - Calcular el total del dinero invertido");
			System.out.println("9 --- Salir");

			lectura = new Scanner(System.in);
			menuPrin = lectura.nextInt();

			switch (menuPrin) {
			case 1:
				try {

					System.out.println("Ingresa el nombre");
					lectura = new Scanner(System.in);
					usuario = lectura.nextLine();

					System.out.println("Ingresa la contraseña");
					lectura = new Scanner(System.in);
					contraseña = lectura.nextLine();

					estatus = true;

					// crear el objecto
					user = new Usuarios(usuario, contraseña, estatus);

					// Agregar a la Lista
					imp.guardar(user);

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Error al guardar " + e.getMessage());
				}
				break;
			case 2:

				if (imp.mostrar().size() > 0) {
					System.out.println(imp.mostrar());
				} else {
					System.out.println("No hay registros");
				}
				break;
			case 3:
				try {

					System.out.println("Ingrese el indice del registroa buscar");
					lectura = new Scanner(System.in);
					indice = lectura.nextInt();

					// Buscar
					user = imp.buscar(indice);
					System.out.println(user);

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("No exite el indice ");
				}
				break;
			case 4:
				try {

					// Atributo del objecto
					System.out.println("Ingrese el indice a buscar ");
					lectura = new Scanner(System.in);
					indice = lectura.nextInt();

					user = imp.buscar(indice);
					System.out.println("Se encontro el usuario para editar " + user.getUsuario() + "Estatus : "
							+ user.isEstatus());

					// Proceso para editar
					System.out.println("Ingrese el nuevo estatus");
					lectura = new Scanner(System.in);
					estatus = lectura.nextBoolean();

					// actualizar el objecto
					user.setEstatus(estatus);
					// actualizar en la lista
					imp.editar(indice, user);
					System.out.println("Se edito corectamente");

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("No exiten datos");
				}

				break;
			case 5:
				try {
					System.out.println("Ingrese el indice del registro a eliminar");
					lectura = new Scanner(System.in);
					indice = lectura.nextInt();

					// Eliminar
					imp.eliminar(indice);
					System.out.println("Se elimino correctamente");

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Ni existe ese registro");
				}

				break;
			case 6:
				break;
			case 7:
				break;
			case 8:
				break;
			case 9:
				break;
			}
		} while (menuPrin < 9);

	}
}
