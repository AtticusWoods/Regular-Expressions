package org.example

interface Context {
    var currentState: State

    fun validate(input: String): Boolean {
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