package at.shockbytes.corey.ui.fragment

import android.os.Bundle
import at.shockbytes.corey.R
import at.shockbytes.corey.dagger.WearAppComponent

class RunningFragment : WearableBaseFragment() {

    override val layoutId = R.layout.fragment_running

    override fun setupViews() {
        // Setup views
    }

    override fun injectToGraph(appComponent: WearAppComponent) {
        appComponent.inject(this)
    }

    companion object {

        fun newInstance(): RunningFragment {
            return RunningFragment().apply {
                arguments = Bundle().apply {
                }
            }
        }
    }
}
