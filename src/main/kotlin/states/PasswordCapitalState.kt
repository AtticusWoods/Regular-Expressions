package org.example.states

import org.example.State
import org.example.contexts.CheckPassword

class PasswordCapitalState(private val checkPassword: CheckPassword) : State {
    override fun handle(char: Char) {

        if (char in "!@#$%&*") {
            checkPassword.setState(checkPassword.passwordSpecialState)
            checkPassword.characters += 1
            checkPassword.specials += 1
        } else if(!char.isUpperCase()){
            checkPassword.setState(checkPassword.passwordNormalState)
            checkPassword.characters += 1
        } else if(char == ' '){
            checkPassword.setState(checkPassword.failState)
            //check for space
        } else {
            checkPassword.characters += 1
            checkPassword.capitals += 1
        }
    }
}