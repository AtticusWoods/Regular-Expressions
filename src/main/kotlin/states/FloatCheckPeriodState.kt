package org.example.states
import org.example.State
import org.example.contexts.CheckFloat

class FloatCheckPeriodState(private val checkFloat: CheckFloat) : State {

    override fun handle(char: Char){
        if (char == '.') {
            checkFloat.setState(checkFloat.floatFollowingValState)
        } else checkFloat.setState(checkFloat.failState)
    }
}