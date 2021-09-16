package promocion;

import java.util.ArrayList;
import turismoTierraMedia.Atraccion;

public abstract class PromoPorcentual extends Promocion{

	private final double porcentajeDescuento;
	
	public PromoPorcentual(ArrayList<Atraccion> misPromos, double duracionPromedio, Atraccion tipoDePromocion, double costoDePromo, double porcentajeDescuento) {
		super(misPromos, tipoDePromocion);
		this.porcentajeDescuento = porcentajeDescuento;
	}
	
	
	@Override
	public double cuantoCuesta() {
		double costo = super.cuantoCuesta();
				
		return (costo - costo * this.porcentajeDescuento);
	}
	
	@Override
	public boolean esPromo() {

		return true;
	}
}

