package com.github.forinil.builderpoc.builder.abstract

abstract class AbstractBuilder<B: AbstractBuilder<B, T>, T> {
    private var self: B = this.self()

    protected abstract fun self(): B

    abstract fun build(): T
}