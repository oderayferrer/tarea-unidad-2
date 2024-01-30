programa StockDeProductos
inicio
    stockDeProducto = 20

    mostrar: "El stock de este producto es:"
    mostrar: stockDeProducto

    mostrar: "Ingresar cantidad de productos vendidos"
    ingresar: cantidadVendidaDelProducto
    stockDeProducto = stockDeProducto - cantidadVendidaDelProducto

    mostrar: "El stock ha sido actualizado, tiene en existencia:"
    mostrar: stockDeProducto

fin