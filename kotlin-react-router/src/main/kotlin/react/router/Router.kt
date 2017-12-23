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

external interface Params {
    @nativeGetter
    operator fun get(key: String): String?
    @nativeSetter
    operator fun set(key: String, value: String)
}
external interface RouteComponents {
    @nativeGetter
    operator fun get(name: String): RouteComponent?
    @nativeSetter
    operator fun set(name: String, value: RouteComponent)
}
external interface RedirectFunction {
    @nativeInvoke
    operator fun invoke(location: LocationDescriptor)
    @nativeInvoke
    operator fun invoke(state: LocationState, pathname: Pathname, query: Query? = definedExternally /* null */)
    @nativeInvoke
    operator fun invoke(state: LocationState, pathname: Path, query: Query? = definedExternally /* null */)
}
external interface RouterState {
    var location: Location
    var routes: Array<PlainRoute>
    var params: Params
    var components: Array<RouteComponent>
}
external interface InjectedRouter {
    var push: (location: LocationDescriptor) -> Unit
    var replace: (location: LocationDescriptor) -> Unit
    var go: (n: Number) -> Unit
    var goBack: () -> Unit
    var goForward: () -> Unit
    var setRouteLeaveHook: (route: Any, callback: (nextLocation: Location? /*= null*/) -> Any) -> Unit
    var createPath: (path: Path, query: Any? /*= null*/) -> Any
    var createHref: (path: Path, query: Any? /*= null*/) -> Any
    var isActive: (location: LocationDescriptor, indexOnly: Boolean? /*= null*/) -> Boolean
}
external interface RouteComponentProps<P, R> {
    var location: Location
    var params: P /* P & R */
    var route: PlainRoute
    var router: InjectedRouter
    var routes: Array<PlainRoute>
    var routeParams: R
}
external interface RouterProps : ClassAttributes<Any> {
    var routes: RouteConfig? get() = definedExternally; set(value) = definedExternally
    var history: History? get() = definedExternally; set(value) = definedExternally
    val createElement: ((component: RouteComponent, props: Any) -> Any)? get() = definedExternally
    val onError: ((error: Any) -> Any)? get() = definedExternally
    val onUpdate: (() -> Any)? get() = definedExternally
    val render: ((props: Any) -> ReactNode)? get() = definedExternally
}
@JsName("default")
external var Router: Router = definedExternally
