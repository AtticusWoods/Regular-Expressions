package org.example.states
import org.example.State
import org.example.contexts.CheckFloat

class FloatCheckPeriodState(private val checkFloat: CheckFloat) : State {
    override var valid : Boolean = true

    override fun handle(char: Char){
        if (char == '.') {
            checkFloat.setState(checkFloat.floatFollowingValState)
        }
    }

    override fun isValid(): Boolean {
        return false
    }
}