package org.example.contexts

import org.example.Context
import org.example.State
import org.example.states.FloatStartValState

class CheckFloat : Context {
    override val initialState: State = FloatStartValState()
    override var currentState = initialState






}