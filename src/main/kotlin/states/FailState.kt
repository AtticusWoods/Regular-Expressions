package org.example.states
import org.example.State
import org.example.Context

class FailState(private val context: Context): State {

    override fun handle(char: Char){
        context.valid = false
    }

}