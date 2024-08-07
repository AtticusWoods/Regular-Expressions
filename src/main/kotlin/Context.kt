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
        val valid = currentState.isValid()
        reset() //To reset Check init state for next validation
        return valid
    }

    fun setState(newState: State){
        currentState = newState
    }

    fun reset() {
        currentState = initialState
    }

}