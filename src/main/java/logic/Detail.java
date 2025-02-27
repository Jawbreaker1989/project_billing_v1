package logic;

/**
 * Representa el detalle de una factura con la cantidad de productos.
 */
public class Detail {
    private short units;
    private Product product;

    /**
     * Constructor que inicializa un detalle de factura
     * @param units cantidad de unidades del producto
     * @param product producto asociado al detalle
     */
    public Detail(short units, Product product) {
        this.units = units;
        this.product = product;
    }

    /**
     * Establece la cantidad de unidades
     * @param units cantidad de unidades
     */
    public void setUnits(short units) {
        this.units = units;
    }

    /**
     * Obtiene la cantidad de unidades
     * @return cantidad de unidades
     */
    public short getUnits() {
        return units;
    }

    /**
     * Establece el producto
     * @param product producto a asignar
     */
    public void setProduct(Product product) {
        this.product = product;
    }

    /**
     * Obtiene el producto
     * @return producto asociado al detalle
     */
    public Product getProduct() {
        return product;
    }

    /**
     * Calcula el subtotal multiplicando las unidades por el precio del producto
     * @return subtotal del detalle
     */
    public double getSubtotal() {
        return units * product.getValue();
    }
}
