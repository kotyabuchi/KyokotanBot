package com.github.kunugiya.kyokotanbot.Event

import com.github.kunugiya.kyokotanbot.Command.Command
import net.dv8tion.jda.api.entities.ChannelType
import net.dv8tion.jda.api.events.message.MessageReceivedEvent
import net.dv8tion.jda.api.hooks.ListenerAdapter

object MessageListener: ListenerAdapter() {

    private val commandPrefix = ""

    override fun onMessageReceived(event: MessageReceivedEvent) {
        if (event.isFromType(ChannelType.PRIVATE)) {

        } else {
            var message = event.message.contentRaw
            if (!message.startsWith(commandPrefix)) return
            message = message.removePrefix(commandPrefix)
            val args = message.split(" ")
            val commandName = args[0]
            val command = Command.valueOf(commandName.toUpperCase())

        }
    }
}