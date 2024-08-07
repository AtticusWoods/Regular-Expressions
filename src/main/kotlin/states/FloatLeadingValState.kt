package org.example.states
import org.example.State
import org.example.contexts.CheckFloat

class FloatLeadingValState(private val checkFloat: CheckFloat) : State {
    override var valid : Boolean = true

    override fun handle(char: Char){
        if (char in '1'..'9') {
            checkFloat.setState(checkFloat.floatLeadingValState)
        } else if (char == '.') {
            checkFloat.setState(checkFloat.floatFollowingValState)
        }
    }

    override fun isValid(): Boolean {
        return false
    }
}