package org.example.states

import org.example.State

class Integer09State : State {
    override fun handle(char: Char): State?{
        if (char in '0'..'9') {
            return Integer09State()
        }
        return null
    }

    override fun isValid(): Boolean {
        return true
    }
}