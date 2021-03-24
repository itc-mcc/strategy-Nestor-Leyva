package miTiendita.descuento;

import miTiendita.venta.LineaDeDetalle;
import miTiendita.venta.Venta;

public class EmbutidosLacteos implements IDesctoStrategy {

    @Override
    public double getDescto(Venta v)
    {
        double total = 0;

        for (LineaDeDetalle detline : v.getLinedet())
        {
            if(detline.getProducto().getClave()==4)
            {
                total+=(detline.getCtd()*detline.getProducto().getPunit())*.05;
            }else if(detline.getProducto().getClave()==(1) || detline.getProducto().getClave()==(2)
            || detline.getProducto().getClave()==(3) || detline.getProducto().getClave()==(5))
            {
                total+=(detline.getCtd()*detline.getProducto().getPunit())*.15;
            }
        }
        return total;
    }
}
