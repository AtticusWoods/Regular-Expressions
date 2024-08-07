package org.example.contexts
import org.example.Context
import org.example.State
import org.example.states.FailState
import org.example.states.Integer09State
import org.example.states.Integer19State

class CheckInteger : Context {

    val integer19State: State = Integer19State(this)
    val integer09State: State = Integer09State(this)
    val failState: State = FailState(this)

    override val initialState: State = integer19State
    override var currentState = initialState

}