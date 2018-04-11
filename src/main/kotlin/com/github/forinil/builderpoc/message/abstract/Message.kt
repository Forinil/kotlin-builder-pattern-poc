package com.github.forinil.builderpoc.message.abstract

import com.github.forinil.builderpoc.builder.abstract.AbstractBuilder

abstract class Message protected constructor(val type: Type) {
    abstract class Builder<B: Builder<B, T>, T: Message>: AbstractBuilder<Builder<B, T>, T>() {
        protected var type = Type.UNKNOWN

        fun type(value: Type): Builder<B, T> {
            type = value
            return self()
        }
    }

    enum class Type {
        TEXT,
        UNKNOWN
    }
}