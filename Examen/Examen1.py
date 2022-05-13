def ejercicio1 ():
    #Definir variables
    excon:float()
    test:float()
    entrevista:float()
    vexcon:float()
    vtest:float()
    ventrevista:float()
    notafinal:()
    mensaje:str()
    #Datos de entrada
    excon=float(input("Ingrese la nota del examen de conocimiento: "))
    test=float(input("Ingrese el exmane de psicologico: "))
    entrevista=float(input("Ingrese la nota de la intrevista: "))
    #Proceso
    vexcon=excon*0.40
    vtest=test*0.25
    ventrevista=entrevista*0.30
    notafinal=excon+test+entrevista
    if notafinal>=17:
        mensaje=("Su nivel es 4")
    elif notafinal>=14 and notafinal<17:
        mensaje=("Su nivel es 3")
    elif notafinal>=11 and notafinal<14:
        mensaje=("Su nivel es 2")
    else:
        mensaje=("Su nivel es 1 ya no puede obtener la vacante: ")

    #Datos de salida
    print(f"La nota final es:{notafinal}")
    print(mensaje)
def ejercicio2 ():
    #Definir variable
    descuento:float
    igv:float
    pbase:float
    monto:float
    pff:float
    #Datos de entrada
    pbase=float(input("Ingrese el precio base: "))
    #Proceso
    if pbase>=2000:
        descuento=pbase*0.10
    elif pbase>=1000 and pbase<=2000:
        descuento=pbase*0.5
    elif pbase>=500 and pbase<1000:
        descuento=pbase*0.2
    else:
        descuento=pbase*0
    pfinal=pbase-descuento
    igv=pfinal*0.18
    pff=pfinal+igv
    #Datos de salida
    print(f"El descuento es:{descuento}")
    print(f"El igv es:{igv}")
    print(f"El precio es:{pff}")   
def ejercicio3 ():
    #Definir variables
    numerouno:float
    numerodos:float
    signo:str 
    total:float
    #Datos de entrada
    numerouno=float(input("Ingrese el primer numero: "))
    numerodos=float(input("Ingrese el segundo numero: "))
    signo=str(input("Ingrese el signo: "))
    #Proceso
    if signo=="+":
        total=numerouno+numerodos
    elif signo=="-":
        total=numerouno-numerodos
    elif signo=="/":
        total=numerouno/numerodos
    elif signo=="*":
        total=numerouno*numerodos
    elif signo=="^":
        total=numerouno**numerodos
    elif signo=="R":
        total=numerouno**(dato2**-1)
    else:
        total=9
    #Datos de salida
    print(f"El resultado es:{total}") 
def ejercicio4():
    #Definir variable
    edad:float
    sexo:str
    mensaje:str
    vacuna:float
    #Datos de entrada
    edad=float(input("Ingrese la edad: "))
    sexo=str(input("ingrese su sexo(masculino o femenino): "))
    #Proceso
    if edad>=70:
        mensaje=("C")
    elif edad>=16 and edad<=69 and sexo=="masculino" :
        mensaje=("A")
    elif edad>=16 and edad<=69 and sexo=="femenino" :
        mensaje=("B")
    else:
        mensaje:("A")
    #datos de salida
    print(f"El tipo de vacuna es:{mensaje}")

   #Definir variables
#examenMEFLL
#Definir variables
numero=float
#Datos de entrada
numero=float(input("Ingrese el numero del ejercicio: "))
#proceso
if numero==1:
    ejercicio1()
elif numero==2:
    ejercicio2()
elif numero==3:
    ejercicio3()
else:
    ejercicio4()
#Datos de salida 
print(f"gracias por verlo")