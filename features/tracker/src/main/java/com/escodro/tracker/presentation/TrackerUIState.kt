package com.escodro.tracker.presentation

import com.escodro.tracker.model.Tracker

/**
 * Represents the possible UI States of [TrackerFragment].
 */
sealed class TrackerUIState {

    /**
     * Represents the state where they are [Tracker.Info] to be shown on the screen.
     */
    data class ShowDataState(val trackerInfo: Tracker.Info) : TrackerUIState()

    /**
     * Represents the state where they are no information to be shown.
     */
    object EmptyChartState : TrackerUIState()
}
