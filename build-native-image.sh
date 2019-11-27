./gradlew assemble
native-image --no-server --no-fallback --static --class-path build/libs/function-graal-*-all.jar
