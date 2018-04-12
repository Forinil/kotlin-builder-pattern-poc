package com.github.forinil.builderpoc.message

import com.github.forinil.builderpoc.message.abstract.Message

open class TextMessage protected constructor(protected val message: String, type: Type): Message(type) {
    open class Builder<B: Builder<B>>: Message.Builder<B>() {
        protected var message = ""

        @Suppress("UNCHECKED_CAST")
        override fun self(): B {
            return this as B
        }

        override fun build(): TextMessage {
            return TextMessage(message, type)
        }

        fun message(value: String): B {
            message = value
            return self()
        }
    }

    class ConcreteBuilder private constructor(): Builder<ConcreteBuilder>() {
        companion object {
            fun new() =  ConcreteBuilder()
        }
    }

    override fun toString(): String {
        return "TextMessage{message: $message, type: $type}"
    }

    companion object {
        fun newBuilder(): ConcreteBuilder {
            return ConcreteBuilder.new()
        }
    }
}