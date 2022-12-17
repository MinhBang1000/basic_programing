/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runners.JUnit4;
import problems.Dinglemouse;

/**
 *
 * @author Administrator
 */
public class DinglemouseTest {
  @Test
  public void one() {
    assertArrayEquals(new int[]{1,15,15}, Dinglemouse.humanYearsCatYearsDogYears(1)); 
  }
  
  @Test
  public void two() {
    assertArrayEquals(new int[]{2,24,24}, Dinglemouse.humanYearsCatYearsDogYears(2)); 
  }

  @Test
  public void ten() {
    assertArrayEquals(new int[]{10,64,56}, Dinglemouse.humanYearsCatYearsDogYears(10)); 
  }
    
}
