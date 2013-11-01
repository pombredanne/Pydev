/**
 * Copyright (c) 2005-2011 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the license.txt included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */
package com.python.pydev.runalltests2;

//reference: http://www.eclipsezone.com/eclipse/forums/t65337.html
import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

    public static Test suite() {

        BundleTestCollector testCollector = new BundleTestCollector();
        TestSuite suite = new TestSuite(AllTests.class.getName());
        testCollector.collectTests(suite, "org.python", "org.python", "*Test");
        testCollector.collectTests(suite, "com.python", "com.python", "*Test");
        testCollector.collectTests(suite, "com.aptana.interactive_console", "com.aptana.interactive_console", "*Test");
        testCollector.collectTests(suite, "com.aptana.js.interactive_console", "com.aptana.js.interactive_console", "*Test");
        // add more lines collectTests(...) calls if necessary
        if (suite.countTestCases() == 0) {
            throw new Error("There are no test cases to run");
        } else {
            return suite;
        }
    }
}