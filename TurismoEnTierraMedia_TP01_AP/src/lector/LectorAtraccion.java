package lector;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import enumeracion.TipoAtraccion;
import turismoTierraMedia.Atraccion;

public class LectorAtraccion {

	private FileReader fr = null;
	private BufferedReader br = null;
	
	public List<Atraccion> crearAtraccion(){
		List<Atraccion> atracciones = new ArrayList<Atraccion>();
		
		try {
			fr = new FileReader("ArchivosTP/Atraccion.csv");
			br = new BufferedReader(fr);
			String linea = br.readLine();
			
			while (linea != null) {
				try {
					atracciones.add(crearAtraccion(linea));
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
		return atracciones;
	
	}
	
	
	private Atraccion crearAtraccion(String linea) throws Exception {
		String[] lin = linea.split(",");
		
		if (lin.length != 5) {
			throw new Exception("Linea con distinto Parámetro");
		}
		return new Atraccion(TipoAtraccion.valueOf(lin[0]), lin[1], Double.parseDouble(lin[2]), 
				Double.parseDouble(lin[3]), Integer.parseInt(lin[4]));
		
	}
		
}
