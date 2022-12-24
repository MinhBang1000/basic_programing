/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import basic.Bracket;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrator
 */
public class BracketTest {

    @Test
    public void sampleTest() {
      assertEquals(true,Bracket.validParentheses("()" ));  
      assertEquals(false,Bracket.validParentheses("())" ));
      assertEquals(true,Bracket.validParentheses("32423(sgsdg)"));  
      assertEquals(false,Bracket.validParentheses("(dsgdsg))2432"));
      assertEquals(true,Bracket.validParentheses("()"));
    }
}
