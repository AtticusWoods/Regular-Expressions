package org.example

interface State {
    var valid : Boolean
    fun handle(char: Char)

    fun isValid(): Boolean {
        return valid
    }
}
