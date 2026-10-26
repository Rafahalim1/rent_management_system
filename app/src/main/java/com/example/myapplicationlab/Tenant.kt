package com.example.myapplicationlab

import java.io.Serializable

//class Tenantpackage com.example.myapplicationlab

data class Tenant(
    val name: String,
    val phone: String,
    val rent: String
) : Serializable {
    fun summary(): String {
        return "Tenant: $name\nPhone: $phone\nRent: KES $rent"
    }
}
