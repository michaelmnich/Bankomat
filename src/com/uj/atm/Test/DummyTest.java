package com.uj.atm.Test;

import com.uj.atm.common.DummySample;
import com.uj.atm.interfaces.IDummySample;
import org.junit.Assert;
import org.junit.Test;

public class DummyTest {

    @Test
    public void test01(){
        IDummySample dummyNWD = new DummySample();
        Assert.assertTrue(dummyNWD.NWD(15,876) == 3);
        Long l1 = dummyNWD.NWD(15,876);
        Long l2 = 3L;
        Assert.assertTrue(l1.equals(l2));
    }

    @Test
    public void test02(){
        IDummySample dummyNWD = new DummySample();
        Assert.assertTrue(dummyNWD.NWD(0,-42) == 0);
        Long l1 = dummyNWD.NWD(0,-42);
        Long l2 = 0L;
        Assert.assertTrue(l1.equals(l2));
    }

    @Test
    public void test03(){
        IDummySample dummyNWD = new DummySample();
        Assert.assertTrue(dummyNWD.NWD(12547,1563130354) == 12547);
        Long l1 = dummyNWD.NWD(12547,1563130354);
        Long l2 = 12547L;
        Assert.assertTrue(l1.equals(l2));
    }
}
