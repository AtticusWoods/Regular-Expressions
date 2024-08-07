package org.example

interface Context {
    val initialState: State
    var currentState: State

    fun validate(input: String): Boolean {
        for (char in input) {
            val nextState = currentState.handle(char)
            if (nextState == null) {
                return false
            }
        }
        return currentState.isValid()
    }

    fun setState(newState: State){
        currentState = newState
    }

    fun reset() {
        currentState = initialState
    }

}