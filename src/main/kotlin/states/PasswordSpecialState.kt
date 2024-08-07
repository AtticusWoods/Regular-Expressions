package org.example.states

import org.example.State
import org.example.contexts.CheckPassword

class PasswordSpecialState(private val checkPassword: CheckPassword) : State {
    override fun handle(char: Char) {

        if (char.isUpperCase()) {
            checkPassword.setState(checkPassword.passwordCapitalState)
            //checks and sets if char is uppercase
            checkPassword.characters += 1
            checkPassword.capitals += 1
        } else if(char !in "!@#$%&*"){
            checkPassword.setState(checkPassword.passwordNormalState)
            //check for special characters
            checkPassword.characters += 1
        } else if(char == ' '){
            checkPassword.setState(checkPassword.failState)
            //check for space
        } else {
            checkPassword.characters += 1
            checkPassword.specials += 1
        }
    }
}