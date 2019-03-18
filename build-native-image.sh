./gradlew assemble
native-image --no-server --class-path build/libs/function-graal-0.1-all.jar
