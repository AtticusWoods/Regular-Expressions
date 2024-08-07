package org.example.states

import org.example.State
import org.example.contexts.CheckEmail

class EmailPartTwoFirstState(private val checkEmail: CheckEmail) : State {
    override fun handle(char: Char) {
        if (char != '@' && char != ' ' && char != '.') {
            checkEmail.setState(checkEmail.emailPartTwoBodyState)
        } else {
            checkEmail.setState(checkEmail.failState)
        }
    }
}
