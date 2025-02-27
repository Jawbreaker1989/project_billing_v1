package logic;

/**
 * Representa un producto con sus características principales.
 * Esta clase gestiona la información básica de un producto incluyendo
 * su identificador, descripción, valor, stock y stock mínimo.
 */
public class Product {
    // Atributos
    private Integer id;
    private String description;
    private double value;
    private short stock;
    private final byte stockMin = 5;

    // Constructores
    /**
     * Constructor por defecto
     */
    public Product() { }

    /**
     * Constructor con parámetros
     * @param id Identificador único del producto
     * @param description Descripción del producto
     * @param value Valor del producto
     * @param stock Cantidad en inventario
     */
    public Product(Integer id, String description, double value, short stock) {
        this.id = id;
        this.description = description;
        this.value = value;
        this.stock = stock;
    }

    // Métodos setter
    public void setId(Integer id) { }
    public void setDescription(String description) { }
    public void setValue(double value) { }
    public void setStock(short stock) { }

    // Métodos getter
    public Integer getId() { return null; }
    public String getDescription() { return null; }
    public double getValue() { return 0.0; }
    public short getStock() { return 0; }
    public byte getStockMin() { return stockMin; }
}
