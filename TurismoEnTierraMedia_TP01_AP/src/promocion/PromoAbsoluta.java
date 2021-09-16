package promocion;

import java.util.ArrayList;
import turismoTierraMedia.Atraccion;

public abstract class PromoAbsoluta extends Promocion{

	public PromoAbsoluta(ArrayList<Atraccion> misPromo, double duracionPromedio, Atraccion tipoDePromocion, double costoDePromo) {
		super(misPromo, tipoDePromocion);
	}
	
	@Override
	protected double setCosto() {
		double costo = 0;
		
		for (Atraccion atraccion : this.misPromo) {
			costo+= atraccion.cuantoCuesta();
		}
		
		return costo;
	}
	
	@Override
	public boolean esPromo() {

		return true;
	}
	
}
