package com.meteoro.testecibitrise.validator

class CpfValidator : Validator {

    companion object {
        val PESO_CPF = intArrayOf(11, 10, 9, 8, 7, 6, 5, 4, 3, 2)
        const val REPLACE = "[^\\d.]"
    }

    override fun validate(input: String): Boolean {
        val newInput = input.replace(REPLACE, "")
        if (newInput.isEmpty()) return false
        if (newInput.length != 11) return false
        if (newInput.equals("00000000000")) return false

        val digito1 = ValidatorHelper().calculateDigit(newInput.substring(0, 9), PESO_CPF)
        val digito2 = ValidatorHelper().calculateDigit(newInput.substring(0, 9) + digito1, PESO_CPF)
        return newInput.equals(newInput.substring(0, 9) + digito1.toString() + digito2.toString())
    }
}