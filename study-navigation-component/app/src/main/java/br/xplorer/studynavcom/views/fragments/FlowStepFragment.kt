package br.xplorer.studynavcom.views.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation

import br.xplorer.studynavcom.R


class FlowStepFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        setHasOptionsMenu(true)
        val flowStepNumer = arguments?.getInt("flowStepNumber")
        val layout = if (flowStepNumer == 1) {
            R.layout.fragment_flow_step_one
        } else {
            R.layout.fragment_flow_step_two
        }

        return inflater.inflate(layout, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<View>(R.id.next_button).setOnClickListener {
            Navigation.createNavigateOnClickListener(R.id.next_action)
        }
    }


    companion object {
        @JvmStatic
        fun newInstance() {}
    }
}
