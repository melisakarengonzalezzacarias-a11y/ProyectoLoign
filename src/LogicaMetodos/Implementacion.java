package LogicaMetodos;

import java.util.ArrayList;
import java.util.List;

import Modelo.Usuarios;

public class Implementacion implements Interface.Metodos {

	private List<Usuarios> lista = new ArrayList<Usuarios>();

	int arreglo[]= {250,100,23,145,422};
	
	@Override
	public void guardar(Usuarios user) {
		// TODO Auto-generated method stub

		boolean bandera = false;

		for (Usuarios usuario : lista) {
			if (usuario.getUsuario().equals(usuario.getUsuario())) {
				System.out.println("No se guardo ya existe este usuario ");
				bandera = true;
				break;

			}

		}
		if (!bandera) {
			lista.add(user);
			System.out.println("se guardo correctamente");
		}
	}

	@Override
	public List<Usuarios> mostrar() {
		// TODO Auto-generated method stub
		return lista;
	}

	@Override
	public Usuarios buscar(int indice) {
		// TODO Auto-generated method stub
		return lista.get(indice);
	}

	@Override
	public void editar(int indice, Usuarios user) {
		// TODO Auto-generated method stub
		lista.set(indice, user);
	}

	@Override
	public void eliminar(int indice) {
		// TODO Auto-generated method stub
		lista.remove(indice);
	}

}
