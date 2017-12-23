@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
package history

external interface MemoryHistoryBuildOptions {
    var getUserConfirmation: dynamic /* "TypeQuery" kind unsupported yet here! (/home/seobrien/dev/DefinitelyTyped/types/history/createMemoryHistory.d.ts:5:24 to 5:47) */ get() = definedExternally; set(value) = definedExternally
    var initialEntries: Array<String>? get() = definedExternally; set(value) = definedExternally
    var initialIndex: Number? get() = definedExternally; set(value) = definedExternally
    var keyLength: Number? get() = definedExternally; set(value) = definedExternally
}

external interface MemoryHistory : History {
    var index: Number
    var entries: Array<Location>
    fun canGo(n: Number): Boolean
}
