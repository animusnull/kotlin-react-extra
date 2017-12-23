@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
package history

external interface BrowserHistoryBuildOptions {
    var basename: String? get() = definedExternally; set(value) = definedExternally
    var forceRefresh: Boolean? get() = definedExternally; set(value) = definedExternally
    var getUserConfirmation: dynamic /* "TypeQuery" kind unsupported yet here! (/home/seobrien/dev/DefinitelyTyped/types/history/createBrowserHistory.d.ts:7:24 to 7:47) */ get() = definedExternally; set(value) = definedExternally
    var keyLength: Number? get() = definedExternally; set(value) = definedExternally
}
