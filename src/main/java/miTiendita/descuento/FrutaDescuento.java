package miTiendita.descuento;

import miTiendita.venta.LineaDeDetalle;
import miTiendita.venta.Venta;

public class FrutaDescuento implements IDesctoStrategy {

    @Override
    public double getDescto(Venta v)
    {
        double total = 0;

        for (LineaDeDetalle a : v.getLinedet())
        {
            if(a.getProducto().getClave()==(6) || a.getProducto().getClave()==(7))
            {
                total+=(a.getCtd()*a.getProducto().getPunit())*.15;
            }
        }
        return total;
    }
}
