#Declarar Variables
puntos : int
bono : flotar = 0
sueldomin : float
#Datos de Entrada
puntos = int ( input ( "Ingrese la puntuacion del docente:" ))
sueldomin = float ( input ( "Ingrese el sueldo minimo:" ))
#Proceso y Datos de Salida
si  puntos >= 0  y  puntos <= 100 :
  bono = salario mínimo
elif  puntos >= 101  y  puntos <= 150 :
  bono = 2 * sueldoMin
elif  puntos >= 151 :
  bono = 3 * sueldoMin
#Datos de Salida  
print ( f"El Bono que obtuvo el profesor es: { bono } " )