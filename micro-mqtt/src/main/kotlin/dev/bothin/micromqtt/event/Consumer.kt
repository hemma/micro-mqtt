package dev.bothin.micromqtt.event

import java.lang.reflect.Method

data class Producer(val topic: String)

data class Consumer(val topic: String, val payloadType: Class<*>? = null)

data class Event(val instanceType: Class<*>, val instance: Any? = null, val method: Method, val consumer: Consumer, val producer: Producer)