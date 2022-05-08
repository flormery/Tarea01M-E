#Datos de salida 
#Definir variables
tarjeta: float
chocolate: float
flores : float 
anillo : float
escribir :str
#Datos de entrada
cantidad= float(input("Ingresa una cantidad de dinero"))
#Proceso
if cantidad <=10: 
  escribir= "Puede relagar una tarjeta :"
if cantidad >=251:
  escribir ="Puedes regalar un anillo :"
if  cantidad  >=101 and cantidad  <=250:
  escribir = "Puedes regalar flores :"
if cantidad >=11 and cantidad  <=100:
  escribir ="Puedes regalar chocolates :"
print(escribir)