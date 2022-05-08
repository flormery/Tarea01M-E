#definir variable
promedio:float
edad:float
beca:float
#datos de entrada
edad=int(input("ingrese edad"))
promedio=int(input("ingrese promedio"))
#proceso
edad>=18
#proceso y datos de salida
if promedio>=9:
   beca=2000
elif promedio>=8:
   beca=1000
elif promedio>=6:
   beca=500
   mensaje=(f"estudia mas para el proximo ciclo escolar")
elif promedio>=9:
   beca=3000
elif promedio>=8:
   beca=2000
elif promedio>=6:
   beca=1000
   mensaje=(f"estudia mas para el proximo ciclo escolar")
#datos de salida
print(f"te corresponde la beca {beca}")
print(f"{mensaje}")