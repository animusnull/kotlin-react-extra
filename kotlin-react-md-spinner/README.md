# Summary

Kotlin bindings for the react material design spinner.

[Upstream link](https://github.com/tsuyoshiwada/react-md-spinner#props)

## Library XML

Create a file in the following location.

> $PROJECT_DIR$/.idea/libraries

```xml
<component name="libraryTable">
  <library name="kotlin-react-dom" type="kotlin.js">
    <CLASSES>
      <root url="file://$PROJECT_DIR$/node_modules/kotlin-react-md-spinner/build/classes/main" />
    </CLASSES>
    <JAVADOC />
    <SOURCES />
  </library>
</component>
```

## Project IML

At the root of your project you should see a *XYZ.iml* file.

Open that and inside the file place the following line

```xml
    <orderEntry type="library" name="kotlin-react-md-spinner" level="project" />
```
 
This goes in the following section

```xml
<module type="WEB_MODULE" version="4">
  <component name="NewModuleRootManager" inherit-compiler-output="true">
    ...
  </component>
</module>
```

You should now have auto completion support for the module in your IDE.