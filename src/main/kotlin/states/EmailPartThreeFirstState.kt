package org.example.states

import org.example.State
import org.example.contexts.CheckEmail

class EmailPartThreeFirstState(private val checkEmail: CheckEmail) : State {
    override fun handle(char: Char) {
        if (char != '@' && char != ' ' && char != '.') {
            checkEmail.setState(checkEmail.emailPartThreeBodyState)
            checkEmail.valid = true
        } else {
            checkEmail.setState(checkEmail.failState)
        }
    }
}
