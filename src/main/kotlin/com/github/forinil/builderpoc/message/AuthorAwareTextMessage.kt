package com.github.forinil.builderpoc.message

class AuthorAwareTextMessage private constructor(val author: String, message: String, type: Type): TextMessage(message, type) {
    open class Builder<B: Builder<B>>: TextMessage.Builder<B>() {
        private var author = ""

        @Suppress("UNCHECKED_CAST")
        override fun self(): B {
            return this as B
        }

        override fun build(): AuthorAwareTextMessage {
            return AuthorAwareTextMessage(author, message, type)
        }

        fun author(value: String): B {
            author = value
            return self()
        }
    }

    class ConcreteBuilder private constructor(): Builder<ConcreteBuilder>() {
        companion object {
            fun new() =  ConcreteBuilder()
        }
    }

    override fun toString(): String {
        return "AuthorAwareTextMessage{message: $message, author: $author, type: $type}"
    }

    companion object {
        fun newBuilder(): ConcreteBuilder {
            return ConcreteBuilder.new()
        }
    }
}