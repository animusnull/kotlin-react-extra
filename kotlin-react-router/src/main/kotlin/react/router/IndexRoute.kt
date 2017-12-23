@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")

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

external interface IndexRouteProps {
    var component: RouteComponent? get() = definedExternally; set(value) = definedExternally
    var components: RouteComponents? get() = definedExternally; set(value) = definedExternally
    val getComponent: ((nextState: RouterState, callback: (err: Any, component: RouteComponent) -> Any) -> Unit)? get() = definedExternally
    val getComponents: ((nextState: RouterState, callback: (err: Any, components: RouteComponents) -> Any) -> Unit)? get() = definedExternally
    var onEnter: EnterHook? get() = definedExternally; set(value) = definedExternally
    var onChange: ChangeHook? get() = definedExternally; set(value) = definedExternally
    var onLeave: LeaveHook? get() = definedExternally; set(value) = definedExternally
}
@JsName("default")
external var IndexRoute: IndexRoute = definedExternally
