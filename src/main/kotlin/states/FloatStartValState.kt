package org.example.states
import org.example.State
import org.example.contexts.CheckFloat

class FloatStartValState(private val checkFloat: CheckFloat) : State {
    override var valid : Boolean = false

    override fun handle(char: Char){
        if (char in '1'..'9') {
            checkFloat.setState(checkFloat.floatLeadingValState)
        } else if (char == '0') {
            checkFloat.setState(checkFloat.floatCheckPeriodState)
        } else if (char == '.') {
            checkFloat.setState(checkFloat.floatFollowingValState)
        }
    }
}