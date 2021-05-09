package kg.tutorialapp.hw_36

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ActivityC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)
        setup()
    }

    private fun setup() {
        val text = getString(R.string.blank_fragment_C)
        supportFragmentManager
            .beginTransaction()
            .add(R.id.fragment_container_C, FragmentC.newInstance(text), FragmentC.TAG)
            .commit()
    }
}