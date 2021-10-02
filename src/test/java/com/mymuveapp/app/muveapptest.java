package com.mymuveapp.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import static org.junit.Assert.*;

public class muveapptest extends TestCase {

    public muveapptest( String testName){ super(testName);}

    public static Test suite() {return new TestSuite(com.mymuveapp.app.muveapptest.class);
    }
@org.junit.Test
public void testApp() {
        //assertTrue(false);
        muveapp test = new muveapp();
        String output = test.toString();
        assertNotSame("Hello World",output);
    }
}
