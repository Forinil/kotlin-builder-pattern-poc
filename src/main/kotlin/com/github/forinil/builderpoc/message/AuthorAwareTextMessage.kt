package com.github.forinil.builderpoc.message

class AuthorAwareTextMessage private constructor(val author: String, message: String, type: Type): TextMessage(message, type) {
    class Builder: TextMessage.Builder() {
        private var author = ""

        override fun self(): Builder {
            return this
        }

        override fun build(): AuthorAwareTextMessage {
            return AuthorAwareTextMessage(author, message, type)
        }

        fun author(value: String): Builder {
            author = value
            return self()
        }
    }

    override fun toString(): String {
        return "AuthorAwareTextMessage{message: $message, author: $author, type: $type}"
    }

    companion object {
        fun newBuilder(): Builder {
            return Builder()
        }
    }
}