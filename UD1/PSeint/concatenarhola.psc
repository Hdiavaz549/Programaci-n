Algoritmo concatenarhola
	definir a como cadena
	definir b como cadena
	Escribir " Escribe dos cadenas "
	leer a
	Leer b;
	
	Escribir concatenaConEspacios(a , b)
FinAlgoritmo

Funcion salida <- concatenaConEspacios(a , b)
	espacio = " "
	salida = Concatenar(a,Concatenar(espacio,b))
	escribir salida
FinFuncion
