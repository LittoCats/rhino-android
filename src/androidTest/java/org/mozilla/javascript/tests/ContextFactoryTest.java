/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

/**
 *
 */
package org.mozilla.javascript.tests;

import com.faendir.rhino_android.RhinoAndroidHelper;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.mozilla.javascript.Context;

@Ignore
@RunWith(BlockJUnit4ClassRunner.class)
public class ContextFactoryTest {

    private static Context CTX;
    private static int LV;

    @BeforeClass
    public static void setUpClass() throws Exception {
        CTX = RhinoAndroidHelper.prepareContext();
        LV = CTX.getLanguageVersion();
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        CTX.setLanguageVersion(LV);
        CTX.exit();
    }

    /*@Test
    public void whenVersionLessEq17ThenOldUndefNullThis() throws Exception {
        CTX.setLanguageVersion(Context.VERSION_1_7);
        assertTrue(CTX.hasFeature(Context.FEATURE_OLD_UNDEF_NULL_THIS));

        CTX.setLanguageVersion(Context.VERSION_1_6);
        assertTrue(CTX.hasFeature(Context.FEATURE_OLD_UNDEF_NULL_THIS));
    }*/

    /*@Test
    public void whenVersionGt17ThenNewUndefNullThis() throws Exception {
        CTX.setLanguageVersion(Context.VERSION_1_8);
        assertFalse(CTX.hasFeature(Context.FEATURE_OLD_UNDEF_NULL_THIS));

        CTX.setLanguageVersion(Context.VERSION_ES6);
        assertFalse(CTX.hasFeature(Context.FEATURE_OLD_UNDEF_NULL_THIS));
    }*/

}
