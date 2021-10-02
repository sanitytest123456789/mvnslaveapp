package com.mymuveapp.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import sun.font.TrueTypeFont;

public class muveapptest extends TestCase {

    public muveapptest( String testName){ super(testName);}

public static Test suite() {return new TestSuite(muveapptest.class);
}
public void testApp() { assertTrue(true);}
}
