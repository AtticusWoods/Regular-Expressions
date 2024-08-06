package org.example.contexts

import org.example.Context
import org.example.State
import org.example.states.Integer19State

class CheckInteger : Context {
    override val initialState: State = Integer19State()
    override var currentState = initialState
}