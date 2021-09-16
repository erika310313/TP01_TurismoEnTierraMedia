package turismoTierraMedia;

import java.util.ArrayList;
import java.util.List;

import comparator.Sugerencia;
import lector.LectorAtraccion;
import lector.LectorPromo;
import lector.LectorUsuario;
import promocion.Promocion;

public class Parque {
	
	private List<Usuario> usuarios;
	private static List<Sugerencia> sugerencias = new ArrayList<Sugerencia>();
	private static List<Atraccion> atracciones = new ArrayList<Atraccion>();
	private static List<Promocion> promos = new ArrayList<Promocion>();

	public static void main(String[] args) {
		
		Parque parque = new Parque();
		
		LectorUsuario lector = new LectorUsuario();
		parque.usuarios = lector.leerUsuario();
		
		LectorAtraccion lectorA = new LectorAtraccion();
		atracciones = lectorA.crearAtraccion();
		
		LectorPromo lectorP = new LectorPromo();
		promos = lectorP.crearPromociones();
		
		
		
	}
}

