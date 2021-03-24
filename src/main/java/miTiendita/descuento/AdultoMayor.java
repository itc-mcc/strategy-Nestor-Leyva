package miTiendita.descuento;

import miTiendita.venta.LineaDeDetalle;
import miTiendita.venta.Venta;

public class AdultoMayor implements IDesctoStrategy {
    @Override
    public double getDescto(Venta v)
    {
        double total = 0;

        for (LineaDeDetalle detline : v.getLinedet())
        {
            total+=(detline.getCtd()*detline.getProducto().getPunit())*.05;
        }
        return total;
    }    
}