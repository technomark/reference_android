package com.abnamro.apps.referenceandroid

import android.support.test.InstrumentationRegistry
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Rule

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class UserExploringAppFunctionalityTest {

    @get:Rule
    val activityRule = ActivityTestRule(MainActivity::class.java)

    /*
    Customer Journey:

    After launching app the customer performs:
    - Read title
    - Read message
    - Open overflow menu to view options
    - Select option and confirm option dismisses
    - Tap button and read message in time frame
     */

    @Test
    fun iWantToReadEverythingAndTapEverywhere() {

    }
}