@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
package history

external interface History {
    var length: Number
    var action: dynamic /* String /* "PUSH" */ | String /* "POP" */ | String /* "REPLACE" */ */
    var location: Location
    fun push(path: String, state: LocationState? = definedExternally /* null */)
    fun push(location: LocationDescriptorObject)
    fun replace(path: String, state: LocationState? = definedExternally /* null */)
    fun replace(location: LocationDescriptorObject)
    fun go(n: Number)
    fun goBack()
    fun goForward()
    fun block(prompt: String? = definedExternally /* null */): () -> Unit
    fun block(prompt: Boolean? = definedExternally /* null */): () -> Unit
    fun block(prompt: ((location: Location, action: dynamic /* String /* "PUSH" */ | String /* "POP" */ | String /* "REPLACE" */ */) -> dynamic /* String | Boolean | Unit */)? = definedExternally /* null */): () -> Unit
    fun listen(listener: (location: Location, action: dynamic /* String /* "PUSH" */ | String /* "POP" */ | String /* "REPLACE" */ */) -> Unit): () -> Unit
    fun createHref(location: LocationDescriptorObject): String
    fun block(): () -> Unit
}

/**
 * [This is pulled from upstream History NameSpace](https://github.com/DefinitelyTyped/DefinitelyTyped/blob/master/types/history/index.d.ts#L42)
 * There are a number of discriminated unions in the type definition.
 *
 * I am casting these to Any but am open to other recommendations.
 * 
 */
typealias Action = String
typealias  LocationDescriptor = Any
typealias  LocationKey = String
typealias  LocationListener = Any
typealias  LocationState = Any
typealias  Path = String
typealias  Pathname = String
typealias  Search = String
typealias  TransitionHook = Any
typealias  TransitionPromptHook = (location: Location, action: Action) -> Any
typealias  Hash = String
typealias  Href = String
typealias UnregisterCallback = Any


external interface Location {
    var pathname: String
    var search: String
    var state: LocationState
    var hash: String
    var key: String? get() = definedExternally; set(value) = definedExternally
}

external interface LocationDescriptorObject {
    var pathname: String? get() = definedExternally; set(value) = definedExternally
    var search: String? get() = definedExternally; set(value) = definedExternally
    var state: LocationState? get() = definedExternally; set(value) = definedExternally
    var hash: String? get() = definedExternally; set(value) = definedExternally
    var key: String? get() = definedExternally; set(value) = definedExternally
}
