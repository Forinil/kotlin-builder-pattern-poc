package com.github.forinil.builderpoc.builder.abstract

abstract class AbstractBuilder<B: AbstractBuilder<B>> {
    protected abstract fun self(): B

    abstract fun build(): Any
}