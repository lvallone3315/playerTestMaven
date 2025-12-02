/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playertest;

import org.junit.jupiter.api.Test;             // for @Test
import static org.junit.jupiter.api.Assertions.*; // all assert methods

/**
 *
 * @author User
 */
public class TestDefaultName_Test {
    

    @Test
    public void testDefaultPlayerName() {
        
        PlayerTest defaultPlayerName = new PlayerTest();
        
        System.out.println("Test: Create player without name specified in constructor - expect default name applied\n");
        assertEquals("?", defaultPlayerName.getPlayerName(), "Default name not equal to ?");
    }
}
