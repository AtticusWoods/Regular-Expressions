package org.example.states
import org.example.State
import org.example.contexts.CheckFloat

class FloatFollowingValState(private val checkFloat: CheckFloat) : State {
    override fun handle(char: Char){
        if (char in '0'..'9') {
            checkFloat.setState(checkFloat.floatFollowingValState)
            checkFloat.valid = true
        } else{
            checkFloat.setState(checkFloat.failState)
            checkFloat.valid = false
        }
    }
}