package com.arvgord

import java.util.*

enum class Role(val permissions: Set<Permission>) {
    USER(Collections.unmodifiableSet(EnumSet.allOf(Permission::class.java))),
    ADMIN(Collections.unmodifiableSet(EnumSet.of(Permission.VIEW)));
}