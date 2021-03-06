package kg.tutorialapp.hw_36

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ActivityB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)
        setup()
    }

    private fun setup() {
        supportFragmentManager
            .beginTransaction()
            .add(R.id.fragment_container_B, FragmentB(), FragmentB.TAG)
            .commit()
    }
}