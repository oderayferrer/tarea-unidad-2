programa PrecioConIVA
inicio
    mostrar: "Ingrese el precio del producto"
    ingresar: precioDelProducto

    mostrar: "Ingrese el porcentaje de IVA"
    ingresar: porcentajeDeIva

    iva = precioDelProducto * (porcentajeDeIva / 100)
    mostrar: "El I.V.A es: " + iva

    precioFinal = precioDelProducto + iva
    mostrar: "El precio final es: " + precioFinal
fin
