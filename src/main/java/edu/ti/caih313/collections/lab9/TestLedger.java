package edu.ti.caih313.collections.lab9;

import edu.ti.caih313.collections.lab9.Ledger;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestLedger {

    @Test
    public void testaddSales(){
        Ledger ledger = new Ledger();
        ledger.addSales(5.7);
        ledger.addSales(4.3);
        ledger.addSales(6.8);
        assertEquals(ledger.get(0), (Double)5.7);
        assertEquals(ledger.get(1), (Double)4.3);
        assertEquals(ledger.get(2), (Double)6.8);
    }

    @Test
    public void testgetNumberSales(){
        Ledger ledger = new Ledger();
        ledger.addSales(5.7);
        ledger.addSales(4.3);
        ledger.addSales(6.8);
        assertEquals(ledger.getNumberOfSales(), 3);
    }

    @Test
    public void testGetTotalSales(){
        Ledger ledger = new Ledger();
        ledger.addSales(5.7);
        ledger.addSales(4.3);
        ledger.addSales(6.8);
        Double total = 5.7 + 4.3 + 6.8;
        assertEquals(ledger.getTotalSales(), total);
    }

    @Test
    public void testGetAverageSale(){
        Ledger ledger = new Ledger();
        ledger.addSales(5.7);
        ledger.addSales(4.3);
        ledger.addSales(6.8);
        Double average = (5.7 + 4.3 + 6.8)/3;
        assertEquals(ledger.getAverageSale(), average);
    }

    @Test
    public void testGetCountAbove(){
        Ledger ledger = new Ledger();
        ledger.addSales(5.7);
        ledger.addSales(4.3);
        ledger.addSales(6.8);
        assertEquals(ledger.getCountAbove(5.00), 2);
    }
}