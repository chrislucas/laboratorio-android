package br.xplorer.studynavcom.views.fragments

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.view.*
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions

import br.xplorer.studynavcom.R



/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [HomeFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class HomeFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        setHasOptionsMenu(true)
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val options = navOptions {
            anim {
                enter = R.anim.slide_in_r
                exit = R.anim.slide_out_l
                popEnter = R.anim.slide_in_l
                popExit = R.anim.slide_out_r
            }
        }

        view.findViewById<Button>(R.id.navigate_destination_button).setOnClickListener {
            findNavController().navigate(R.id.flow_step_one_dest, null, options)
        }

        view.findViewById<Button>(R.id.navigate_action_button).setOnClickListener {
            Navigation.createNavigateOnClickListener(R.id.next_action, null)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.main_menu, menu)
    }

    companion object {

        @JvmStatic
        fun newInstance() {}

    }
}
