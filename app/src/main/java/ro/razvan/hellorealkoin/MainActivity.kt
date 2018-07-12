package ro.razvan.hellorealkoin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        datastore.display()
    }

    fun newOne(view: View) {
        startActivity(Intent(this, HelloActivity::class.java))
    }
}
