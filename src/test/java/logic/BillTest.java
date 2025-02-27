package logic;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

class BillTest {
    private Bill bill;
    private Product soap;
    private Product milk;
    private Product bread;
    private Detail detailRice;
    private Detail detailSoap;
    private Detail detailMilk;
    private Detail detailBread;

    void setup() {
        bill = new Bill("3245345", LocalDate.of(2025, Month.JANUARY, 24), ETypePay.CASH);
        detailRice = new Detail((short) 10, new Product(123234, "Arroz", 3500.0, (short) 10));
        soap = new Product(34242, "Jabon Rey", 2800, (short) 345);
        detailSoap = new Detail((short) 5, soap);
        milk = new Product(55432, "Leche x 6", 33500, (short) 12);
        detailMilk = new Detail((short) 10, milk);
        bread = new Product(65532, "Pan Fino", 2000, (short) 30);
        detailBread = new Detail((short) 4, bread);
    }

    void setupOne() {
        setup();
        bill.addDetail(detailRice);
        bill.addDetail(detailMilk);
        bill.addDetail(detailSoap);
        bill.addDetail(detailBread);
    }

    @Test
    void addDetail() {
        setup();
        assertFalse(bill.addDetail(detailRice));
        assertEquals(10, detailRice.getProduct().getStock());
        assertTrue(bill.addDetail(detailSoap));
        assertEquals(340, detailSoap.getProduct().getStock());
        assertEquals(340, soap.getStock());
        assertFalse(bill.addDetail(detailMilk));
        assertEquals(12, milk.getStock());
        assertTrue(bill.addDetail(detailBread));
        assertEquals(26, bread.getStock());
    }
    @Test
    void getDetails() {
        assertEquals(0,bill.getDetails().size());
        setupOne();
        assertEquals(2,bill.getDetails().size());
    }

    @Test
    void getDays() {
        setup();
        assertEquals(31,bill.getDays());
        bill.setDateBill( LocalDate.of(2024,Month.FEBRUARY,25) );
        assertEquals(366,bill.getDays());
    }

    @Test
    void getTotal() {
        setupOne();
        assertEquals(22_000,bill.getTotal());
        //TODO agregar otros detalles y aserciones correpondientes
    }

}