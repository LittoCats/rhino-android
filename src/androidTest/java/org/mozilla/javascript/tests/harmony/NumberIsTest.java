/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

 package org.mozilla.javascript.tests.harmony;

import org.junit.Ignore;
import org.mozilla.javascript.drivers.RhinoTest;
import org.mozilla.javascript.drivers.ScriptTestsBase;

@RhinoTest(
    value = "testsrc/jstests/harmony/number-is.js"
)
@Ignore
public class NumberIsTest
    extends ScriptTestsBase
{
}
