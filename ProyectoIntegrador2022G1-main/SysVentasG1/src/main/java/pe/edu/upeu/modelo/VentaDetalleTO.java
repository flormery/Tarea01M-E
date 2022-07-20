package pe.edu.upeu.modelo;

import lombok.Data;

@Data
public class VentaDetalleTO {
    //IdDetalle	IdVenta	IdProducto	cantidad	precioUnit	descuento	total
public String idDetalle, idventa, idProducto;
public double cantidad, precioUnit, descuento, total;
    
}
