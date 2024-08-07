package org.example

interface Context {
    val initialState: State
    var currentState: State
    var valid: Boolean

    fun validate(input: String): Boolean {
        valid = false
        for (char in input) {
            val nextState = currentState.handle(char)
            if (nextState == null) {
                return false
            }
        }
        reset() //To reset init state for next validation
        return valid
    }

    fun setState(newState: State){
        currentState = newState
    }

    fun reset() {
        currentState = initialState
    }

}