package com.github.forinil.builderpoc

import com.github.forinil.builderpoc.message.AuthorAwareTextMessage
import com.github.forinil.builderpoc.message.TextMessage
import com.github.forinil.builderpoc.message.abstract.Message

fun main(args: Array<String>) {
    val message = TextMessage.newBuilder().type(Message.Type.TEXT).message("Hello, World").build()
    println(message)

    val message2 = AuthorAwareTextMessage.newBuilder().type(Message.Type.TEXT).author("Konrad").message("Hello, World").build()
    println(message2)
}

