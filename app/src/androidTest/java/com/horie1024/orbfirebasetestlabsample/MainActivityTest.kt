package com.horie1024.orbfirebasetestlabsample

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class MainActivityTest {

    @Rule
    @JvmField
    val mActivityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun isShowHelloWorldText() {
        onView(withId(R.id.login)).perform(click())
        onView(withText(R.string.hello_world)).check(matches(isDisplayed()))
    }
}