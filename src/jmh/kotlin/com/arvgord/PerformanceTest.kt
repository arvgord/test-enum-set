package com.arvgord

import org.openjdk.jmh.annotations.*
import java.util.*

@BenchmarkMode(Mode.All)
@Warmup(iterations = 1, time = 5)
@Measurement(iterations = 1, time = 5)
open class PerformanceTest {

    @Benchmark
    fun testEnumSet() {
        val enumSet = EnumSet.of(Permission.VIEW, Permission.CREATE, Permission.UPDATE, Permission.DELETE)
        enumSet.contains(Permission.VIEW)
    }

    @Benchmark
    fun testRegularSet() {
        val regularSet = setOf(Permission.VIEW, Permission.CREATE, Permission.UPDATE, Permission.DELETE)
        regularSet.contains(Permission.VIEW)
    }
}