@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
package history

external interface HashHistoryBuildOptions {
    var basename: String? get() = definedExternally; set(value) = definedExternally
    var hashType: dynamic /* String /* "hashbang" */ | String /* "noslash" */ | String /* "slash" */ */ get() = definedExternally; set(value) = definedExternally
    var getUserConfirmation: dynamic /* "TypeQuery" kind unsupported yet here! (/home/seobrien/dev/DefinitelyTyped/types/history/createHashHistory.d.ts:9:24 to 9:47) */ get() = definedExternally; set(value) = definedExternally
}
