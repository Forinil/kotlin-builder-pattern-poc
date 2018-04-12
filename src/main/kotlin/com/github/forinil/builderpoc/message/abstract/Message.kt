package com.github.forinil.builderpoc.message.abstract

import com.github.forinil.builderpoc.builder.abstract.AbstractBuilder

abstract class Message protected constructor(val type: Type) {
    @Suppress("UNCHECKED_CAST")
    abstract class Builder<B: Builder<B>>: AbstractBuilder<Builder<B>>() {
        protected var type = Type.UNKNOWN

        fun type(value: Type): B {
            type = value
            return self() as B
        }
    }

    enum class Type {
        TEXT,
        UNKNOWN
    }
}