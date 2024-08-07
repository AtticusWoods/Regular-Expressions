package org.example.states
import org.example.State
import org.example.contexts.CheckFloat

class FloatFollowingValState(private val checkFloat: CheckFloat) : State {
    override var valid : Boolean = true
    override fun handle(char: Char){
        if (char in '0'..'9') {
            checkFloat.setState(checkFloat.floatFollowingValState)
        }
        valid = false
    }

    override fun isValid(): Boolean {
        return valid
    }
}