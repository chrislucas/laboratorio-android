package br.xplorer.studynavcom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration

/**
 * Esse projeto tem como base o tutorial do link abaixo
 * https://codelabs.developers.google.com/codelabs/android-navigation/#0
 *
 * "The navigation graph" ou grafo de navegacao é um recurso que define
 * todas as possibilidades de caminho que um usuairo pode tomar atraves
 * do app. Através do Android Studio podemos visualizar todos os destinos
 * alcancaveis
 *
 * Navigation graph: https://codelabs.developers.google.com/codelabs/android-navigation/#4
 *
 * O componente de navegcao segue o principio guia do princiio de navegacao que
 * recomenda que as activities sejam "entry-points" (pontos de acesso) para o app. Elas contem um
 * componente que auxilia na navegacao compartilhado por toda a aplicacao (global),
 * como os componentes bottom navigation e toolbar
 *
 * Principio de navegacao: https://developer.android.com/guide/navigation/navigation-principles
 *
 * "Em comparacao, fragments serao os layouts de destino (pontos de destino)"
 *
 * */


class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration : AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        /**
         * {@link }
         * https://developer.android.com/reference/androidx/navigation/fragment/NavHostFragment
         * */

        val host : NavHostFragment = supportFragmentManager
            .findFragmentById(R.id.my_nav_host_fragment) as NavHostFragment

        /**
         *
         *
         */
        val navController = host.navController

        val appBarConfiguration = AppBarConfiguration(navController.graph)

        setupActionBar(navController, appBarConfiguration)

        setupNavigationMenu(navController)

        setupBottomNavMenu(navController)

        navController.addOnDestinationChangedListener { controller, destination, arguments ->
           
        }

    }

    private fun setupBottomNavMenu(navController: NavController) {
        // TODO STEP 9.3 - Use NavigationUI to set up Bottom Nav
//        val bottomNav = findViewById<BottomNavigationView>(R.id.bottom_nav_view)
//        bottomNav?.setupWithNavController(navController)
        // TODO END STEP 9.3
    }

    private fun setupNavigationMenu(navController: NavController) {
        // TODO STEP 9.4 - Use NavigationUI to set up a Navigation View
//        // In split screen mode, you can drag this view out from the left
//        // This does NOT modify the actionbar
//        val sideNavView = findViewById<NavigationView>(R.id.nav_view)
//        sideNavView?.setupWithNavController(navController)
        // TODO END STEP 9.4
    }

    private fun setupActionBar(navController: NavController, appBarConfig : AppBarConfiguration) {
        // TODO STEP 9.6 - Have NavigationUI handle what your ActionBar displays
//        // This allows NavigationUI to decide what label to show in the action bar
//        // By using appBarConfig, it will also determine whether to
//        // show the up arrow or drawer menu icon
//        setupActionBarWithNavController(navController, appBarConfig)
        // TODO END STEP 9.6
    }
}
