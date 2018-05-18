/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.euclides;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author diegosaurio
 */
public class EuclidesTest {
    
    public EuclidesTest() {
    }

    /**
     * Test of Iterativo method, of class Euclides.
     */
    @Test
    public void testIterativo() {
        assertEquals(12,Euclides.Iterativo(1032,180));
    }
    
}
