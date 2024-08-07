package org.example.states

import org.example.State
import org.example.contexts.CheckEmail

class EmailPartTwoBodyState(private val checkEmail: CheckEmail) : State {
    override fun handle(char: Char) {
        if (char == '.') {
            checkEmail.setState(checkEmail.emailPartThreeFirstState)
        } else if (char == '@' || char == ' ') {
            checkEmail.setState(checkEmail.failState)
        }
    }
}
