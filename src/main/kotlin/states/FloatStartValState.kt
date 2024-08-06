package org.example.states
import org.example.State

class FloatStartValState : State {
    override fun handle(char: Char): State?{
        if (char in '1'..'9') {
            return FloatLeadingValState()
        } else if (char == '0') {
            return FloatCheckPeriodState()
        } else if (char == '.') {
            return FloatFollowingValState()
        }
        return null
    }

    override fun isValid(): Boolean {
        return false
    }
}