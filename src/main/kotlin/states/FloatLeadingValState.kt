package org.example.states
import org.example.State

class FloatLeadingValState : State {
    override fun handle(char: Char): State?{
        if (char in '0'..'9') {
            return this
        } else if (char == '.') {
            return FloatFollowingValState()
        }
        return null
    }

    override fun isValid(): Boolean {
        return false
    }
}