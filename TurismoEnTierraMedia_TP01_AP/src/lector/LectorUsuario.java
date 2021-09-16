package lector;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import enumeracion.TipoAtraccion;
import turismoTierraMedia.Usuario;

public class LectorUsuario {

	private FileReader fr = null;
	private BufferedReader br = null;
	
	public List<Usuario> leerUsuario() {
		List<Usuario> usuarios = new ArrayList<Usuario>();
		
		try {
			fr = new FileReader("ArchivosTP/Usuario.csv");
			br = new BufferedReader(fr);
			String linea = br.readLine();
			
			while (linea != null) {
				try {
					usuarios.add(crearUsuario(linea));
				}catch(Exception e) {
					System.out.println(e.getMessage());
				}
				
				linea = br.readLine();
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fr != null) {
					fr.close();
				}
			}catch(Exception e2) {
				e2.printStackTrace();
			}
		}
				
		return usuarios;
	}
	
	private Usuario crearUsuario(String linea) throws Exception {
		String[] lin = linea.split(",");
		
		if (lin.length != 4) {
			throw new Exception("Linea con distinto Parámetro");
		}
		return new Usuario(TipoAtraccion.valueOf(lin[0]), lin[1], Double.parseDouble(lin[2]), 
				Double.parseDouble(lin[3]));
	}
	
	
	
}
