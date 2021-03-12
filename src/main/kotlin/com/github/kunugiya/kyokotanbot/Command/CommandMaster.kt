package com.github.kunugiya.kyokotanbot.Command

import net.dv8tion.jda.api.events.message.MessageReceivedEvent

interface CommandMaster {
    val name: String

    fun run(event: MessageReceivedEvent)
}