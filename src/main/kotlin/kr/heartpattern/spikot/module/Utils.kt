package kr.heartpattern.spikot.module

import kr.heartpattern.spikot.spikot
import kotlin.reflect.KClass
import kotlin.reflect.full.findAnnotation

internal fun KClass<*>.canLoad(): Boolean {
    val feature = findAnnotation<Feature>()
    val disable = findAnnotation<Disable>()
    if (disable != null) return false
    if (feature == null) return true
    return spikot.enabled.contains(feature.value)
}

fun isFeatureEnabled(feature: String): Boolean {
    return spikot.enabled.contains(feature)
}

inline fun onEnabled(feature: String, runnable: () -> Unit) {
    if (isFeatureEnabled(feature)) {
        runnable()
    }
}

inline fun onDebug(runnable: () -> Unit) {
    onEnabled("Debug", runnable)
}