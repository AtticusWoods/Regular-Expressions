package org.example.contexts

import org.example.Context
import org.example.State
import org.example.states.FloatCheckPeriodState
import org.example.states.FloatFollowingValState
import org.example.states.FloatLeadingValState
import org.example.states.FloatStartValState

class CheckFloat : Context {

    val floatStartValState: State = FloatStartValState(this)
    val floatFollowingValState: State = FloatFollowingValState(this)
    val floatLeadingValState: State = FloatLeadingValState(this)
    val floatCheckPeriodState: State = FloatCheckPeriodState(this)

    override val initialState: State = floatStartValState
    override var currentState = initialState
}