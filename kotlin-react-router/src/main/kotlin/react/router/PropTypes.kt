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

external interface RouterShape : Validator<Any> {
    var push: Requireable<Any>
    var replace: Requireable<Any>
    var go: Requireable<Any>
    var goBack: Requireable<Any>
    var goForward: Requireable<Any>
    var setRouteLeaveHook: Requireable<Any>
    var isActive: Requireable<Any>
}
external interface LocationShape : Validator<Any> {
    var pathname: Requireable<Any>
    var search: Requireable<Any>
    var state: Any
    var action: Requireable<Any>
    var key: Any
}
