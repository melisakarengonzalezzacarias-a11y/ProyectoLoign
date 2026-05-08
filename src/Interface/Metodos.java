package Interface;

import java.util.List;

import Modelo.Usuarios;

public interface Metodos {
	
	//Metodos
	//1-- Procedimiento (no tiene valor de retorno )
	//	Sintaxis: modificadores de acesso void(vacio), nombreProce(parmetos o argumentos / valores de entrada)
	
	//2 -- Funciones(siempre retornan algo )
	//	Sintaxis: modificadores tipoRetorno nombreFunc(parametros o argumentos )
	
	
	public void guardar(Usuarios user);
		
	public List<Usuarios> mostrar();

	public Usuarios buscar(int indice);
	
	public void editar(int indice, Usuarios user);

	public void eliminar(int indice);
	
}
