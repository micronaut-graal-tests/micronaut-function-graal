./gradlew assemble
native-image --no-server --class-path build/libs/function-graal-*.jar
