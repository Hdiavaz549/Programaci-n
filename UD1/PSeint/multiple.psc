Algoritmo multiple
	Definir numero1 Como real
	definir numero2 Como real
	definir numero3 Como real
	definir operacion como entero
	Escribir "Escribe el primer numero"
	Leer numero1
	Escribir "Escribe el segundo numero"
	Leer numero2
	Escribir "suma (+) resta (-) multiplicacion (*) division (/)"
	Leer opcionmenu
	Segun opcionmenu Hacer
		caso 1:
			operacion = numero1 + numero2
			Escribir numero1, " + ", numero2, " = ", operacion
		Caso 2:
			operacion = numero1 - numero2
			Escribir numero1, " - ", numero2, " = ", operacion
		
	    Caso 3:
			operacion = numero1 * numero2
			Escribir numero1, " * ", numero2, " = ", operacion
		Caso 4:
			operacion = numero1 / numero2
			Escribir numero1, " / ", numero2, " = ", operacion
		De Otro Modo:
			escribir "Opcion no valida"
	FinSegun
FinAlgoritmo
