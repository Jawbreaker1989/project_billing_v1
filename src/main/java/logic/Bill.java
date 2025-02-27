package logic;

import java.time.LocalDate;
import java.util.List;

/**
 * Representa una factura con su número, fecha y método de pago.
 */
public class Bill {
    // Atributos
    private String number;
    private LocalDate dateBill;
    private ETypePay typePay;
    private List<Detail> details;

    /**
     * Constructor de la clase Bill
     * @param number número de factura
     * @param dateBill fecha de la factura
     * @param typePay tipo de pago
     */
    public Bill(String number, LocalDate dateBill, ETypePay typePay) {
        this.number = number;
        this.dateBill = dateBill;
        this.typePay = typePay;
    }

    // Métodos set
    public void setNumber(String number) { }

    public void setDateBill(LocalDate dateBill) { }

    public void setTypePay(ETypePay typePay) { }

    // Métodos get
    public String getNumber() { 
        return null; 
    }

    public LocalDate getDateBill() { 
        return null; 
    }

    public ETypePay getTypePay() { 
        return null; 
    }

    public List<Detail> getDetails() {
        return details;
    }

    // Métodos de negocio
    /**
     * Agrega un nuevo detalle a la factura
     * @param detail detalle a agregar
     * @return verdadero si el detalle fue agregado exitosamente
     */
    public boolean addDetail(Detail detail) {
        return false;
    }

    /**
     * Calcula los días transcurridos desde la creación de la factura
     * @return número de días
     */
    public int getDays() { 
        return 0; 
    }

    /**
     * Calcula el monto total de la factura
     * @return monto total
     */
    public double getTotal() { 
        return 0.0; 
    }
}
