package com.meteoro.testecibitrise.validator

import java.util.regex.Pattern

class EmailValidator : Validator {

    companion object {
        const val EMAIL_PATERN = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$"
    }

    override fun validate(input: String): Boolean {
        val pattern = Pattern.compile(EMAIL_PATERN, Pattern.CASE_INSENSITIVE)
        val matcher = pattern.matcher(input)
        return matcher.find() && input.isNotEmpty()
    }
}