#Declarar Variables
pagohora:float
cantidadhora:int
ingresosemanal:float
#Datos de Entrada
pagohora=float(input("Ingrese el costo por hora:"))
cantidadhora=int(input("Ingrese cantidad horas trabajadas en la semana:"))
#Proceso y Datos de Salida
if cantidadhora>40:
  ingresosemanal=40*pagohora+2*((cantidadhora-40)*pagohora)
else:
  ingresosemanal=cantidadhora*pagohora
#Datos de Salida
print(f"El sueldo del trabajador es {ingresosemanal}")