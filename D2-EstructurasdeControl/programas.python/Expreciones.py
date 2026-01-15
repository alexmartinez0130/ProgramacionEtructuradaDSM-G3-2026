#En esta parte del codigose van a 
#declarar varios tipos de variables

#Expresiones aritmeticassuma =3+5; 
suma = 3+5
resta = 10-12
multi=24*23
div=10 /2
divEntera = 12// 5 # division entera
mod = 10 % 2
potencia = 2**4  #Potencia 

#
salida= f"Hola soy la suma:" + str(suma)
print(salida)
salida= f"Hola soy la suma:"
print(salida, suma)
salida= f"Hola soy la suma: {suma}"
print(salida)
salida= f"Hola soy la suma: {suma}"
print(salida)

#interpolacion de strings


salida = f"""
===== Exception aritmeticas =====
La suma es : {suma}
La resta es : {resta}
La multiplicacion es : {multi}
La divicion es : {div}
La modulo es : {mod}
La potencia  es : {potencia}
"""
print(salida)