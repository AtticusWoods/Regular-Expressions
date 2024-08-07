package org.example.contexts

import org.example.Context
import org.example.State
import org.example.states.*

class CheckPassword  : Context {

    val passwordCapitalState: State = PasswordCapitalState(this)
    val passwordSpecialState: State = PasswordSpecialState(this)
    val passwordNormalState: State = PasswordNormalState(this)
    val failState: State = FailState(this)


    var characters: Int = 0
    var capitals: Int = 0
    var specials: Int = 0

    override val initialState: State = passwordNormalState
    override var currentState = initialState
    override var valid: Boolean = (currentState == passwordSpecialState && characters >= 8 && capitals >= 1 && specials >= 1)
    // Checks all requirements before returning valid

    override fun validate(input: String): Boolean {
        valid = false
        for (char in input) {
            val nextState = currentState.handle(char)
            if (nextState == null) {
                return false
            }
        }
        checkValidity()
        reset() //To reset init state for next validation
        return valid
    }

    override fun reset() {
        currentState = initialState
        characters = 0
        capitals = 0
        specials = 0
    }

    private fun checkValidity() {
        if(currentState == passwordSpecialState) {
            valid = false
        } else if (characters >= 8 && capitals >= 1 && specials >= 1) {
            valid = true
        }
    }
}