package org.example.contexts

import org.example.Context
import org.example.State
import org.example.states.*

class CheckEmail  : Context {

    val emailPartOneState: State = EmailPartOneState(this)
    val emailPartTwoFirstState: State = EmailPartTwoFirstState(this)
    val emailPartTwoBodyState: State = EmailPartTwoBodyState(this)
    val emailPartThreeFirstState: State = EmailPartThreeFirstState(this)
    val emailPartThreeBodyState: State = EmailPartThreeBodyState(this)
    val failState: State = FailState(this)

    override val initialState: State = emailPartOneState
    override var currentState = initialState
    override var valid: Boolean = false
}