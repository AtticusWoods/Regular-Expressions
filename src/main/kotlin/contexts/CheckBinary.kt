package org.example.contexts

import org.example.Context
import org.example.State
import org.example.states.BinaryOneState
import org.example.states.BinaryStartValState
import org.example.states.BinaryZeroState
import org.example.states.FailState

class CheckBinary  : Context {

    val binaryStartValState: State = BinaryStartValState(this)
    val binaryOneState: State = BinaryOneState(this)
    val binaryZeroState: State = BinaryZeroState(this)
    val failState: State = FailState(this)

    override val initialState: State = binaryStartValState
    override var currentState = initialState
    override var valid: Boolean = false
}