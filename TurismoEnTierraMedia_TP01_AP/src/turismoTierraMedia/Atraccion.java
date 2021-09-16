package turismoTierraMedia;

import enumeracion.TipoAtraccion;

public class Atraccion{

	private TipoAtraccion tipoAtraccion;
	private String nombreAtraccion;
	private double costo;
	private double tiempoDuracion;
	private int cupoDisponible;
	
	public Atraccion(TipoAtraccion tipoAtraccion, String nombreAtraccion, double costo, double tiempoDuracion, int cupoDisponible) {
		this.tipoAtraccion = tipoAtraccion;
		this.nombreAtraccion = nombreAtraccion;
		this.costo = costo;
		this.tiempoDuracion = tiempoDuracion;
		this.cupoDisponible = cupoDisponible;
	}
	
	public TipoAtraccion getTipoAtraccion() {
		return this.tipoAtraccion;
	}
	
	public double getTiempoDuracion() {
		return this.tiempoDuracion;
	}
	
	public Integer getCupoDisponible() {
		return this.getCupoDisponible();
	}
	
		public void ocuparCupoAtraccion() {
		this.cupoDisponible--;
	}
	
	public TipoAtraccion tipoAtraccion() {
		return this.tipoAtraccion;
	} 
	
	public double cuantoCuesta() {
		return this.costo;
	}
	
	public double duracionAtraccion() {
		return this.tiempoDuracion;
	}
	
	public boolean hayCupo() {
		return this.cupoDisponible > 0;
	}
	
	public String nombreAtraccion() {
		return this.nombreAtraccion;
	}

	public boolean esPromo() {
		return false;
	}
	
	@Override
	public String toString() {
		return "Atraccion [nombreAtraccion=" + nombreAtraccion + ", costo=" + costo + ", tipoAtraccion=" + tipoAtraccion
				+ ", tiempoDuracion=" + tiempoDuracion + ", cupoDisponible=" + cupoDisponible + "]";
	}
	
	
	
}
