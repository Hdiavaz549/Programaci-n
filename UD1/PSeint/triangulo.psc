Algoritmo triangulo
	Definir a Como Real
	definir b Como real
	definir c Como real
	Escribir " Introduzca primer lado "
	Leer a
	Escribir " Introduzca segundo lado "
	Leer b
	Escribir " Introduzca tercer lado "
	Leer c
	Si a + b > c y b + c > a y a + c > b Entonces
		Escribir " Es un triangulo "
		Si a = b y a = c y b = c Entonces
			Escribir " El triangulo es: equilatero "
		SiNo
			Si a = b o a = c Entonces
				Escribir " El triangulo es: isosceles "
			Sino
				Escribir " El triangulo es: escaleno "
			FinSi
		FinSi
	Sino
		Escribir " Las longitudes no forman un triangulo "
	FinSi
FinAlgoritmo
