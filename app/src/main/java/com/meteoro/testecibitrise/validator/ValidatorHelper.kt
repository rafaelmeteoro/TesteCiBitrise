package com.meteoro.testecibitrise.validator

class ValidatorHelper {

    fun calculateDigit(str: String, peso: IntArray): Int {
        var soma = 0
        val size = str.length - 1
        for (indice in size downTo 0) {
            val digito = str.substring(indice, indice + 1).toInt()
            soma += digito * peso[peso.size - str.length + indice]
        }
        soma = 11 - soma % 11
        return if (soma > 9) 0 else soma
    }
}