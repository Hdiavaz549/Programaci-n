Algoritmo escribepseudocodigo
	definir a, b Como Entero
	Escribir "Introduzca dos numeros mayores que 0"
	Leer a, b
	Mientras b <> 0 Hacer
		Si a>b Entonces
			a <- a-b
		SiNo
			b <- b-a
		FinSi
	FinMientras
	Escribir a
FinAlgoritmo
