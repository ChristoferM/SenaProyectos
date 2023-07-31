/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizzeriaproject.modelos;

public class CarritoCompras {

    private Integer idCarritoCompras;
    private Integer codigo;
    private String nombre;
    private String detalle;
    private Integer cantidad;
    private Integer costoUnd;
    private Integer costoTotal;
    private String metodoPago;

    //constructor
    public CarritoCompras() {
    }

    public Integer getIdCarritoCompras() {
        return idCarritoCompras;
    }

    public void setIdCarritoCompras(Integer idCarritoCompras) {
        this.idCarritoCompras = idCarritoCompras;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    //metodos
    public void agregarProducto() {

    }

    public void retirarProducto() {

    }

    public void confirmar() {

    }

    public void cancelar() {

    }

    //Get
    public Integer getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getCostoUnd() {
        return costoUnd;
    }

    public Integer getCostoTotal() {
        return costoTotal;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    //Set
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCostoUnd(Integer costoUnd) {
        this.costoUnd = costoUnd;
    }

    public void setCostoTotal(Integer costoTotal) {
        this.costoTotal = costoTotal;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

}
