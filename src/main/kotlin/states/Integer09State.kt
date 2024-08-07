package org.example.states
import org.example.State
import org.example.contexts.CheckInteger

class Integer09State(private val checkInteger: CheckInteger) : State {
    override var valid : Boolean = true
    override fun handle(char: Char){
        if (char in '0'..'9') {
            checkInteger.setState(this)
            valid = true
        } else {
            checkInteger.setState(checkInteger.failState)
            valid = false
        }
    }
}