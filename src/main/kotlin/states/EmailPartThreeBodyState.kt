package org.example.states

import org.example.State
import org.example.contexts.CheckEmail

class EmailPartThreeBodyState(private val checkEmail: CheckEmail) : State {
    override fun handle(char: Char) {
        if (char != '@' && char != ' ' && char != '.') {
            //checkEmail.setState(this)
            checkEmail.valid = true
        } else {
            checkEmail.setState(checkEmail.failState)
        }
    }
}
