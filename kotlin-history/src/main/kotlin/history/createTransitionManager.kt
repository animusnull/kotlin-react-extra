@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")

package history

import kotlin.js.*
import kotlin.js.Json
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*

external interface TransitionManager {
    fun setPrompt(nextPrompt: Boolean? = definedExternally /* null */): UnregisterCallback
    fun setPrompt(nextPrompt: ((location: Location, action: Action) -> Any)? = definedExternally /* null */): UnregisterCallback
    fun appendListener(listener: LocationListener): UnregisterCallback
    fun notifyListeners(location: Location, action: Action)
    fun confirmTransitionTo(location: Location, action: Action, getUserConfirmation: dynamic /* "TypeQuery" kind unsupported yet here! (/home/seobrien/dev/DefinitelyTyped/types/history/createTransitionManager.d.ts:12:79 to 12:102) */, callback: (result: Boolean) -> Unit)
    fun setPrompt(): UnregisterCallback
}
