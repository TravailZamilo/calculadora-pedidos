package com.ejemplo;

public class PedidoService {

    private DescuentoRepository descuentoRepository;

    // Constructor que recibe el repositorio
    public PedidoService(DescuentoRepository descuentoRepository) {
        this.descuentoRepository = descuentoRepository;
    }

    public double calcularTotal(double subtotal, String codigoDescuento, boolean envioExpress) {
        double descuento = descuentoRepository.obtenerPorcentaje(codigoDescuento);
        double envio = envioExpress ? 20.0 : 10.0;
        return (subtotal * (1 - descuento)) + envio;
    }
}
