package com.github.kunugiya.kyokotanbot

import com.github.kunugiya.kyokotanbot.Event.MessageListener
import com.github.kunugiya.kyokotanbot.Event.ReadyListener
import net.dv8tion.jda.api.JDABuilder
import net.dv8tion.jda.api.requests.GatewayIntent
import net.dv8tion.jda.api.utils.Compression
import net.dv8tion.jda.api.utils.cache.CacheFlag

fun main(args: Array<String>) {
    println("Run")

    val token = "NzY3NDM3MTY4ODI1NTk3OTUz.X4x5jw.Bupa12uFAopsSZGH7M7onzagFf0"
    val builder = JDABuilder.createDefault(token).apply {
        disableCache(CacheFlag.MEMBER_OVERRIDES, CacheFlag.VOICE_STATE)
        setBulkDeleteSplittingEnabled(false)
        setCompression(Compression.NONE)
        disableIntents(GatewayIntent.GUILD_PRESENCES, GatewayIntent.GUILD_MESSAGE_TYPING)

        addEventListeners(ReadyListener)
        addEventListeners(MessageListener)
    }
    builder.build()
}

class Main {

}