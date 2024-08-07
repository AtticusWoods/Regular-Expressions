package org.example.states

import org.example.State
import org.example.contexts.CheckBinary

class BinaryOneState(private val checkBinary: CheckBinary) : State {

    override fun handle(char: Char) {
        if (char == '1') {
            checkBinary.setState(this)
            checkBinary.valid =  true
        } else if (char == '0') {
            checkBinary.setState(checkBinary.binaryZeroState)
            checkBinary.valid =  false
        } else {
            checkBinary.setState(checkBinary.failState)
            checkBinary.valid =  false
        }
    }
}