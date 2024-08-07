package org.example.states

import org.example.State
import org.example.contexts.CheckEmail

private var passedOnce = false
class EmailPartOneState(private val checkEmail: CheckEmail) : State {
    override fun handle(char: Char) {
        if (char == '@') {
            if (passedOnce) {
                checkEmail.setState(checkEmail.emailPartTwoFirstState)
                passedOnce = false
            } else {
                checkEmail.setState(checkEmail.failState)
                passedOnce = false
            }
        } else if (char != ' ') {
            checkEmail.setState(this)
            passedOnce = true
        } else {
            checkEmail.setState(checkEmail.failState)
            passedOnce = false
        }
    }
}
