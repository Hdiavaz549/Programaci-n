Algoritmo funcionparimpar
	Leer n1
	resultado = esPar (n1)
	si resultado = verdadero
		Escribir " Es un numero par "
	SiNo
		Escribir " Es un numero impar "
	FinSi
	escribir resultado
FinAlgoritmo

Funcion resultado = esPar (n1)
	Si n1 mod 2 = 0 Entonces
		resultado = Verdadero
	SiNo
		resultado = Falso
	FinSi
FinFuncion