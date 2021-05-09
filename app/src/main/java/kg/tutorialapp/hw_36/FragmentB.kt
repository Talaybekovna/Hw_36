package kg.tutorialapp.hw_36

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class FragmentB : Fragment(R.layout.fragment_b) {

    lateinit var tv_text : TextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tv_text = view.findViewById(R.id.tv_text)
        tv_text.text = getString(R.string.blank_fragment_B)
    }

    companion object {
        const val TAG = "fragment B"
    }
}