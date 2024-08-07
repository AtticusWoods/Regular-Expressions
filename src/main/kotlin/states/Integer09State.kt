package org.example.states
import org.example.State
import org.example.contexts.CheckInteger

class Integer09State(private val checkInteger: CheckInteger) : State {
    override fun handle(char: Char){
        if (char in '0'..'9') {
            //checkInteger.setState(this)
            checkInteger.valid = true
        } else {
            checkInteger.setState(checkInteger.failState)
            checkInteger.valid = false
        }
    }
}