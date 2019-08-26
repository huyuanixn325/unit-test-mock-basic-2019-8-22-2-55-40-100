package cashregister;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class CashRegisterTest {


    @Test
    public void should_print_the_real_purchase_when_call_process() {
        //given
        Item[] items = {new Item("egg",1)};
        Purchase purchase = new Purchase(items);
        MockPrinter mockPrinter = new MockPrinter();
        CashRegister cashRegister = new CashRegister(mockPrinter);
        //when
        cashRegister.process(purchase);
        //then
        assertEquals("egg\t1.0\n",mockPrinter.getPrintText());
    }

    @Test
    public void should_print_the_stub_purchase_when_call_process() {
        //given

        //when
        //then
    }

    @Test
    public void should_verify_with_process_call_with_mockito() {
        //given

        //when
        //then
    }

}
