package org.example.states
import org.example.State
import org.example.contexts.CheckInteger


class Integer19State(private val checkInteger: CheckInteger): State {
    override var valid : Boolean = false
    override fun handle(char: Char){
        if (char in '1'..'9') {
            checkInteger.setState(checkInteger.integer09State)
            valid = true
        } else {
            checkInteger.setState(checkInteger.failState)
            valid = false
        }

    }
}