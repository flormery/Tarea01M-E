#Definir variable
descuento :float=0.20
igv : float
pbase: float
pcd : float
#Datos d entrada 
pbase=float (input("Ingrese el precio base del articulo"))
#Proceso
pcd=pbase-(pbase*descuento)
igv=pcd*0.18
pf=pcd+igv
#Dtos de salida 
print(f"El precio con descuento es:{pcd}")
print(f"El precio final es:{pf}")