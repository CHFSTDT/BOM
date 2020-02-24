package com.hofstadtchristopher.basal_o_mat


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.hofstadtchristopher.basal_o_mat.viewModel.FProtocolViewModel

/**
 * A simple [Fragment] subclass.
 */
class FragmentProtocol : Fragment() {

    private lateinit var vMdl: FProtocolViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        vMdl = ViewModelProvider(this).get(FProtocolViewModel::class.java)
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_protocol, container, false)
        return view
    }

}
