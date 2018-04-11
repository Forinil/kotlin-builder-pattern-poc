package com.github.forinil.builderpoc

import com.github.forinil.builderpoc.message.AuthorAwareTextMessage
import com.github.forinil.builderpoc.message.TextMessage
import com.github.forinil.builderpoc.message.abstract.Message

fun main(args: Array<String>) {
    val message = TextMessage.newBuilder().message("Hello, World").type(Message.Type.TEXT).build()
    println(message)

    val message2 = AuthorAwareTextMessage.newBuilder().author("Konrad").message("Hello, World").type(Message.Type.TEXT).build()
    println(message2)
}

