package ro.razvan.hellorealkoin

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import org.koin.android.ext.android.inject

@SuppressLint("Registered")
open class BaseActivity : AppCompatActivity() {

    val datastore: Datastore by inject()

}