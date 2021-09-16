package promocion;

import java.util.ArrayList;
import java.util.List;

import turismoTierraMedia.Atraccion;

public abstract class PromoAporB extends Promocion {
	
	private Atraccion atraccionGratis;
	
	public PromoAporB(ArrayList<Atraccion> misPromos, Atraccion tipoDePromocion) {
		super(misPromos, tipoDePromocion);
		this.atraccionGratis = atraccionGratis;
	}
	
	@Override
	public double getDuracionPromedio() {
		return super.getDuracionPromedio() + this.atraccionGratis.duracionAtraccion();		
	}
	
	@Override
	public List<Atraccion> getmisPromos() {
		List<Atraccion> misPromos = super.getmisPromos();
		misPromos.add(tipoAtraccion());
				
		return misPromo;
	}
	
	@Override
	public double cuantoCuesta() {
		double costoUltimaAtraccion = this.getmisPromos().get(getmisPromos().size()-1).cuantoCuesta();
		return super.cuantoCuesta() - costoUltimaAtraccion;
		
	}

	@Override
	public boolean esPromo() {

		return true;
	}
	
	@Override
	public abstract void calcularDescuento(int a, int b);
	
}