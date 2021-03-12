package com.github.kunugiya.kyokotanbot.Event

import net.dv8tion.jda.api.events.ReadyEvent
import net.dv8tion.jda.api.hooks.ListenerAdapter

object ReadyListener: ListenerAdapter() {

    override fun onReady(event: ReadyEvent) {
        println("Bot is ready!!")
    }
}