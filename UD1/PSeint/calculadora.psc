Algoritmo calculadora
	Definir opcion_1 como cadena
	Definir a Como Entero
	Definir b como entero
	Escribir "Seleccione una opcion"
	Escribir "Opcion 1: suma"
	Escribir "Opcion 2: resta"
	Escribir "Opcion 3: multiplicacion"
	Escribir "Opcion 4: division"
	Escribir "Opción 5: raiz"
	Leer opcion_1
	
	Si opcion_1 = "+" o opcion_1 = "1" Entonces
		escribir "Introduce el primer numero"
		leer a
		Escribir "Introduce el segundo numero"
		leer b
		Escribir "El resultado es: ", a + b
	FinSi
	Si opcion_1 = "-" o opcion_1 = "2" Entonces
		escribir "Introduce el primer numero"
		leer a
		Escribir "Introduce el segundo numero"
		leer b
		Escribir "El resultado es: ", a - b
	FinSi
	Si opcion_1 = "*" o opcion_1 = "3" Entonces
		escribir "Introduce el primer numero"
		leer a
		Escribir "Introduce el segundo numero"
		leer b
			Escribir "El resultado es: ", a * b
		FinSi
	Si opcion_1 = "/" o opcion_1 = "4" Entonces
		escribir "Introduce el primer numero"
		leer a
		Escribir "Introduce el segundo numero"
		leer b
		Escribir "El resultado es: ", a / b
	FinSi
	Si opcion_1 = "5" o "raiz"
		Entonces
		escribir "Introduce el primer numero"
		leer a
		escribir "El resultado es: ", aritmetica(a)
	FinSi
	
FinAlgoritmo

Funcion operacion <- aritmetica(a)
	Escribir RAIZ(a) 
FinFuncion
	