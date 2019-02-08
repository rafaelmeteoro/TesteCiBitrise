package com.meteoro.testecibitrise.validator

import junit.framework.Assert.assertFalse
import junit.framework.Assert.assertTrue
import org.junit.Before
import org.junit.Test

class EmailValidatorTest {

    private lateinit var validator: Validator

    @Before
    fun setup() {
        validator = EmailValidator()
    }

    @Test
    fun validate() {
        assertTrue(validator.validate("faelanjelus@gmail.com"))
    }

    @Test
    fun validateUnderscore() {
        assertTrue(validator.validate("fael_anjelus@gmail.com"))
    }

    @Test
    fun validateDot() {
        assertTrue(validator.validate("fael.anjelus@gmail.com"))
    }

    @Test
    fun validateNotDot() {
        assertFalse(validator.validate("faelanjelus@gmailcom"))
    }

    @Test
    fun validateNoAt() {
        assertFalse(validator.validate("faelanjelusgmail.com"))
    }
}