package ro.razvan.hellorealkoin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class HelloActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello)

        datastore.display()
    }
}
