package kg.tutorialapp.hw_36

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class FragmentC : Fragment(R.layout.fragment_c) {

    lateinit var tv_text : TextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tv_text = view.findViewById(R.id.tv_text)
        val textFromArgument = arguments?.getString("String")
        tv_text.text = textFromArgument
    }

    companion object {
        const val TAG ="fragment C"

        fun newInstance(text: String): FragmentC{
            val fragmentC = FragmentC()
            val args = Bundle()
            args.putString("String", text)
            fragmentC.arguments = args
            return fragmentC
        }
    }
}