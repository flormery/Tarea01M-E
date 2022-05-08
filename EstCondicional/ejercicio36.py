#Definir variables
n: float 
precio:float
descuento:float
total:float
escrbir:str
#Datos de entrada 
precio=float(input("Ingresa el total de articulo: "))
#Proceso
escribir="Ingrese el articulo", 
if precio >=200:
  descuento=precio *.15
if precio >100:
  descuento=precio * .12
  descuento=precio * .10
escribir="El precio del articulo con descuento es: soles",precio - descuento
escribir="El descuento aplicado es: soles ",descuento
#Datos de salida 
print (f"El costo total es: {descuento}")
