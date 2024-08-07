package org.example.states
import org.example.State
import org.example.contexts.CheckFloat

class FloatFollowingValState(private val checkFloat: CheckFloat) : State {
    override var valid : Boolean = false
    override fun handle(char: Char){
        if (char in '0'..'9') {
            checkFloat.setState(checkFloat.floatFollowingValState)
            valid = true
        } else{
            checkFloat.setState(checkFloat.failState)
            valid = false
        }
    }
}