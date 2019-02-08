package com.meteoro.testecibitrise.validator

import junit.framework.Assert.assertFalse
import junit.framework.Assert.assertTrue
import org.junit.Before
import org.junit.Test

class CpfValidatorTest {

    private lateinit var validator: Validator

    @Before
    fun setup() {
        validator = CpfValidator()
    }

    @Test
    fun validateEmpty() {
        assertFalse(validator.validate(""))
    }

    @Test
    fun validateLengthDifferEleven() {
        assertFalse(validator.validate("1111111111"))
    }

    @Test
    fun validateDifferZeros() {
        assertFalse(validator.validate("00000000000"))
    }

    @Test
    fun validateValidCpf() {
        assertTrue(validator.validate("72498248056"))
    }
}