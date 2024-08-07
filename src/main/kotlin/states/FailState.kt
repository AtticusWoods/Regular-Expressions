package org.example.states
import org.example.State
import org.example.Context

class FailState(private val context: Context): State {
    override var valid : Boolean = false
    override fun handle(char: Char){
        //None
    }

    override fun isValid(): Boolean {
        return valid
    }

}