package org.example.states
import org.example.State


class Integer19State : State {
    override fun handle(char: Char): State?{
        if (char in '1'..'9') {
            return Integer09State()
        }
        return null
    }

    override fun isValid(): Boolean {
        return false
    }

}