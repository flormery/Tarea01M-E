package pe.edu.upeu.modelo;

import lombok.Data;

@Data

public class VentaTO {
   //IdVenta dni descuento subprecio ivg Preciototal
   public String idVenta, dni;
   public double descuento,subprecio,igv,precioTotal; 
   
}
