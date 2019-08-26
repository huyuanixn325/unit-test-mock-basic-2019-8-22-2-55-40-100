package cashregister;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class CashRegisterTest {

    private static   MockPrinter mockPrinter;
    private static CashRegister cashRegister;

    @BeforeAll
    public static void setup(){
        mockPrinter = new MockPrinter();
        cashRegister = new CashRegister(mockPrinter);
    }

    @BeforeEach
    public void cleanPrintText(){
        mockPrinter.setPrintText("");
    }
    @Test
    public void should_print_the_real_purchase_when_call_process() {
        //given
        Item[] items = {new Item("egg",1)};
        Purchase purchase = new Purchase(items);

        //when
        cashRegister.process(purchase);
        //then
        assertEquals("egg\t1.0\n",mockPrinter.getPrintText());
    }

    @Test
    public void should_print_the_stub_purchase_when_call_process() {
        //given
        StuPurchase stuPurchase = new StuPurchase();
        //when
        cashRegister.process(stuPurchase);
        //then
        assertEquals("egg\t1.0\n",mockPrinter.getPrintText());
    }

    @Test
    public void should_verify_with_process_call_with_mockito() {
        //given

        //when
        //then
    }

}
