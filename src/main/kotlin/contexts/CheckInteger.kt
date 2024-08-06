package org.example.contexts

import org.example.Context
import org.example.State
import org.example.states.Integer19State

class CheckInteger : Context {
    override var currentState: State = Integer19State()

    override fun validate(input: String): Boolean {
        for (char in input) {
            val nextState = currentState.handle(char)
            if (nextState == null) {
                return false
            }
            currentState = nextState
        }
        return currentState.isValid()
    }

}