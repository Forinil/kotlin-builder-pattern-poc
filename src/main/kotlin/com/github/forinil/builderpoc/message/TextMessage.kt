package com.github.forinil.builderpoc.message

import com.github.forinil.builderpoc.message.abstract.Message

open class TextMessage protected constructor(protected val message: String, type: Type): Message(type) {
    open class Builder: Message.Builder<Builder, TextMessage>() {
        protected var message = ""

        override fun self(): Builder {
            return this
        }

        override fun build(): TextMessage {
            return TextMessage(message, type)
        }

        fun message(value: String): Builder {
            message = value
            return self()
        }
    }

    override fun toString(): String {
        return "TextMessage{message: $message, type: $type}"
    }

    companion object {
        fun newBuilder(): Builder {
            return Builder()
        }
    }
}