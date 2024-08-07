package org.example.states

import org.example.State
import org.example.contexts.CheckBinary

class BinaryStartValState(private val checkBinary: CheckBinary) : State {

    override fun handle(char: Char) {
        if (char == '1') {
            checkBinary.setState(checkBinary.binaryOneState)
            checkBinary.valid = true
        } else {
            checkBinary.setState(checkBinary.failState)
            checkBinary.valid = false
        }
    }
}