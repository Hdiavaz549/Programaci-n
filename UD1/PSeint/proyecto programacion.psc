Algoritmo sin_titulo
	
	Definir num1, num2, num3, suma, resta, multi  Como Entero
	Definir dividir, raizcuadrada Como Real
	
	Escribir "Calculadora"
	Escribir "1 .Suma"
	Escribir "2 .Resta"
	Escribir "3 .Multi"
	Escribir "4 .Dividir"
	Escribir "5 .Raiz cuadrada"
	
	Leer num1
	mientras num1 <> k hacer
		//operacion de suma
		si num1 = 1 Entonces
			Escribir "Suma"
			Escribir "Primer número: "
			Leer num2
			Escribir "Segundo número: "
			leer num3
			suma = num2 + num3
			Escribir "El resultado es: " suma  
		FinSi
		//operacion de resta
		si num1 = 2 Entonces
			Escribir "Resta"
			Escribir "Primer número: "
			Leer num2
			Escribir "Segundo número: "
			leer num3
			resta = num2 - num3
			Escribir "El resultado es: " resta 
		FinSi
		//operacion de multiplicacion
		si num1 = 3 Entonces
			Escribir "Multiplica"
			Escribir "Primer número: "
			Leer num2
			Escribir "Segundo número: "
			leer num3
			multi = num2 * num3
			Escribir "El resultado es: " multi 
		FinSi
		//operacion de division
		si num1 = 4 Entonces
			Escribir "Dividir"
			Escribir "Primer número: "
			Leer num2
			Escribir "Segundo número: "
			leer num3
			dividir = num2 / num3
			Escribir "El resultado es: " dividir  
		FinSi
		//funcion raiz cuadrada
		raizcuadrada1(num1)
	finmientras
	
FinAlgoritmo
funcion raizcuadrada1(num1)
	si num1 = 5 Entonces
		Escribir "Raiz cuadrada"
		Escribir "Pon un número: "
		Leer num2
		raizcuadrada = RAIZ(num2)
		Escribir "El resultado es: " raizcuadrada 
	FinSi
FinFuncion
