package org.example.states
import org.example.State

class FloatFollowingValState : State {
    private var valid : Boolean = true
    override fun handle(char: Char): State?{
        if (char in '0'..'9') {
            return this
        }
        valid = false
        return null
    }

    override fun isValid(): Boolean {
        return valid
    }
}