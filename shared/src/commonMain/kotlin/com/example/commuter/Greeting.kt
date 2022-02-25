package com.example.commuter

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}