package org.example.states
import org.example.State
import org.example.contexts.CheckFloat

class FloatLeadingValState(private val checkFloat: CheckFloat) : State {

    override fun handle(char: Char){
        if (char in '1'..'9') {
            //checkFloat.setState(this)
        } else if (char == '.') {
            checkFloat.setState(checkFloat.floatFollowingValState)
        }
    }
}