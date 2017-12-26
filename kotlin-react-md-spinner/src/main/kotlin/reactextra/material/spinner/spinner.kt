package reactextra.material.spinner

import kotlinext.js.Object
import react.RClass
import react.RProps

@JsModule("react-md-spinner")
external val reactMDSpinner: dynamic

external interface MDSPinnerProps : RProps {
    var className: String
    var style: Object
    var size: Number
    var duration: Number
    var color1: String
    var color2: String
    var color3: String
    var color4: String
    var singleColor: String
    var userAgent: String
}

val MDSpinner: RClass<MDSPinnerProps> = reactMDSpinner.MDSpinner
