package lector;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import enumeracion.TipoAtraccion;
import promocion.PromoAbsoluta;
import promocion.PromoAporB;
import promocion.PromoPorcentual;
import promocion.Promocion;
import turismoTierraMedia.Atraccion;

public class LectorPromo {

	private FileReader fr = null;
	private BufferedReader br = null;
	
	public List<Promocion> crearPromociones() {
		List<Promocion> promociones = new ArrayList<Promocion>();
		List<Atraccion> misAtracciones = new ArrayList<Atraccion>();
		
		try {
			fr = new FileReader("ArchivosTP/Promocion.csv");
			br = new BufferedReader(fr);
			String linea = br.readLine();
			while (linea != null) {
				String[] temp =linea.split(";");
				String[] strAtrac = temp[0].split(",");
				ArrayList<Atraccion> atraccionesPromo = new ArrayList<Atraccion>();
				
				for (Atraccion atr : misAtracciones) {
					for (int i = 0; i < strAtrac.length; i++)  {
						if (strAtrac[i].equals(atr.nombreAtraccion())) {
							atraccionesPromo.add(atr);
						}
					}
				}
				
				if (temp[1].equals("PromoAbsoluta")) {
					PromoAbsoluta promo = new PromoAbsoluta(atraccionesPromo, TipoAtraccion.valueOf(temp[2]), Double.parseDouble(temp[3]));
					promociones.add(promo);
				}else if(temp[1].equals("PromoPorcentual")) {
					PromoPorcentual promo = new PromoPorcentual(atraccionesPromo, TipoAtraccion.valueOf(temp[2]), Double.parseDouble(temp[3]));
					promociones.add(promo);
				}else {
					PromoAporB promo = new PromoAporB(atraccionesPromo, TipoAtraccion.valueOf(temp[2]));
					promociones.add(promo);
				}
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
		return promociones;
		
	}
	
	
	private Promocion crearPromocion(String linea) throws Exception{
		String[] lin = linea.split(";");
		
		if(lin.length != 5) {
			throw new Exception("Linea con distinto Parámeytro");
		}
		return new Promocion(TipoAtraccion.valueOf(lin[0]), lin[1], lin[2], Double.parseDouble(lin[3]), lin[4]);
	}
		
	
}
