package kg.tutorialapp.hw_36

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ActivityA : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)
        setup()
    }

    private fun setup() {
        val fragmentA = FragmentA()
        val args = Bundle()
        args.putString("String", "Fragment A")
        fragmentA.arguments = args
        supportFragmentManager
            .beginTransaction()
            .add(R.id.fragment_container_A, fragmentA, FragmentA.TAG)
            .commit()
    }
}