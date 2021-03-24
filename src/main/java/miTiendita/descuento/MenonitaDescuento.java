package miTiendita.descuento;

import miTiendita.venta.LineaDeDetalle;
import miTiendita.venta.Venta;

public class MenonitaDescuento implements IDesctoStrategy {

    @Override
    public double getDescto(Venta v)
    {
        double total = 0;

        for (LineaDeDetalle a : v.getLinedet())
        {
            if(a.getProducto().getClave()==(1) || a.getProducto().getClave()==(2) ||
                    a.getProducto().getClave()==(3) || a.getProducto().getClave()==(5))
            {
                total+=(a.getCtd()*a.getProducto().getPunit())*.10;
            }
        }
        return total;
    }
}
