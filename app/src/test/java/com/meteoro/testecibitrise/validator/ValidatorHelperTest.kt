package com.meteoro.testecibitrise.validator

import junit.framework.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class ValidatorHelperTest {

    companion object {
        val PESO_CPF = intArrayOf(11, 10, 9, 8, 7, 6, 5, 4, 3, 2)
    }

    private lateinit var validatorHelper: ValidatorHelper

    @Before
    fun setup() {
        validatorHelper = ValidatorHelper()
    }

    @Test
    fun validate() {
        assertEquals(validatorHelper.calculateDigit("72498248056".substring(0, 9), PESO_CPF), 5)
    }

    @Test
    fun validateExpected2() {
        assertEquals(validatorHelper.calculateDigit("27057848021".substring(0, 9), PESO_CPF), 2)
    }
}