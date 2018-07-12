package ro.razvan.hellorealkoin

import android.content.Context
import android.widget.Toast

class Datastore(private val context: Context) {

    fun display() {
        Toast.makeText(context, "Injected!", Toast.LENGTH_SHORT).show()
    }
}