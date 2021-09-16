package promocion;

import java.util.ArrayList;
import java.util.List;

import turismoTierraMedia.Atraccion;
import turismoTierraMedia.Sugerible;

public abstract class Promocion implements Sugerible{

	protected ArrayList<Atraccion> misPromo;
	protected final double duracionPromedio;
	protected final Atraccion tipoDePromocion;
	protected final double costoDePromo;
	
	public Promocion(ArrayList<Atraccion> misPromo, Atraccion tipoDePromocion) {
		super();
		this.misPromo = misPromo;
		this.duracionPromedio = this.setDuracion();
		this.tipoDePromocion = tipoDePromocion;
		this.costoDePromo = this.setCosto();
	}

	protected double setDuracion() {
		double duracionTotal = 0.0;
		
		for (Atraccion atraccion : this.misPromo) {
			duracionTotal+= atraccion.duracionAtraccion();
		}
		
		return duracionTotal;
	}
	
	protected double setCosto() {
		double costo = 0;
		
		for (Atraccion atraccion : this.misPromo) {
			costo+= atraccion.cuantoCuesta();
		}
		
		return costo;
	}
	
	
	public List<Atraccion> getmisPromos() {
		List<Atraccion> misPromos = new ArrayList<Atraccion>();
		for (Atraccion atraccion : misPromos) {
			misPromos.add(atraccion);
		}
		
		return misPromo;
	}
	
	
	public double getDuracionPromedio() {
		return this.setDuracion();
	}
		
	public double cuantoCuesta() {
		
		
		return costoDePromo;
	}
	
	
	public abstract void calcularDescuento(int a, int b);
	
	
	public boolean esPromo() {
		
		return false;
	}

	@Override
	public String toString() {
		return "Promocion [misPromo=" + misPromo + ", duracionPromedio=" + duracionPromedio + ", tipoDePromocion="
				+ tipoDePromocion + ", costoDePromo=" + costoDePromo + "]";
	} 
	
	
}
