package org.example.states

import org.example.State
import org.example.contexts.CheckPassword

class PasswordNormalState(private val checkPassword: CheckPassword) : State {
    override fun handle(char: Char) {

        if (char.isUpperCase()) {
            checkPassword.setState(checkPassword.passwordCapitalState)
            //checks and sets if char is uppercase
            checkPassword.characters += 1
            checkPassword.capitals += 1
        } else if(char in "!@#$%&*"){
            checkPassword.setState(checkPassword.passwordSpecialState)
            //check for special characters
            checkPassword.characters += 1
            checkPassword.specials += 1
        } else if(char == ' '){
            checkPassword.setState(checkPassword.failState)
            //check for space
        } else {
            checkPassword.characters += 1
        }
    }
}

