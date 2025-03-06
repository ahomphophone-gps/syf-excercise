package com.syf.exercise

import org.json.JSONObject

fun JSONObject.getStringOrNull(key: String): String? {
    val string = this.getString(key)
    return if (string == "null") null else string
}