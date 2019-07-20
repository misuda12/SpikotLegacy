package io.github.ReadyMadeProgrammer.Spikot.event

import org.bukkit.event.HandlerList
import org.bukkit.event.Listener

interface SelfCancellableEventListener : Listener {
    fun cancel() {
        HandlerList.unregisterAll(this)
    }
}