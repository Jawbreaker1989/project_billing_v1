package logic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DetailTest {
    private Detail detail;
    private Product rice;

    void setup(){
        rice = new Product(3455, "Arroz", 3_500, (short) 356);

        detail = new Detail((short) 10, rice);
    }

    @Test
    void getSubtotal() {
        setup();
        assertEquals(35_000, detail.getSubtotal());
        detail.setUnits((short) 20);
        assertEquals(70_000, detail.getSubtotal());
    }
    @Test
    void testStock(){
        setup();
        assertEquals(346,detail.getProduct().getStock());

}}