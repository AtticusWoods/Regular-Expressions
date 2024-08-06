package org.example.states
import org.example.State

class FloatCheckPeriodState : State {
    override fun handle(char: Char): State?{
        if (char == '.') {
            return FloatFollowingValState()
        }
        return null
    }

    override fun isValid(): Boolean {
        return false
    }
}