programa IncrementoDeSueldo
inicio
    mostrar: "Ingrese el monto del sueldo"
    ingresar: montoSueldo

    porcentajeDeAumento = 20
    aumento = montoSueldo * (porcentajeDeAumento / 100)
    montoSueldo = montoSueldo + aumento
    mostrar: "El total del sueldo luego de un aumento del 20% es de" + montoSueldo

fin