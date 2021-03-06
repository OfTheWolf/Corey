package at.shockbytes.corey.navigation

import androidx.fragment.app.Fragment
import at.shockbytes.corey.ui.fragment.tab.BodyFragment
import at.shockbytes.corey.ui.fragment.tab.GoalsFragment
import at.shockbytes.corey.ui.fragment.tab.ScheduleFragment
import at.shockbytes.corey.ui.fragment.tab.WorkoutOverviewFragment
import at.shockbytes.corey.ui.fragment.tab.RunningFragment

object CoreyPageFragmentResolver {

    /*
    private val workoutOverviewFragment by lazy {
        WorkoutOverviewFragment.newInstance()
    }

    private val scheduleFragment by lazy {
        ScheduleFragment.newInstance()
    }

    private val bodyFragment by lazy {
        BodyFragment.newInstance()
    }

    private val goalsFragment by lazy {
        GoalsFragment.newInstance()
    }
    */

    // TODO Improve caching of Fragments
    fun createFragmentForPosition(position: Int): Fragment {
        return when (position) {
            0 -> RunningFragment.newInstance()
            1 -> WorkoutOverviewFragment.newInstance()
            2 -> ScheduleFragment.newInstance()
            3 -> BodyFragment.newInstance()
            4 -> GoalsFragment.newInstance()
            else -> throw IllegalStateException("Cannot resolve fragment in CoreyPagerAdapter for position $position") // Never the case
        }
    }
}