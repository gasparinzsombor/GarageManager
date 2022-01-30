package io

interface IO {
    var onMessageReceived: ((Message) -> Unit)?
}