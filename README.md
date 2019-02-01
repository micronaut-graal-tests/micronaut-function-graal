# Micronaut Function #

Test application for Micronaut Function and GraalVM:

- Function that receives a String and return a message.
- Function that received a POJO and return another one.

To execute it after building the native-image:
```bash
$ export MICRONAUT_FUNCTION_NAME=greeting
$ echo 'Micronaut' | ./function-graal

$ export MICRONAUT_FUNCTION_NAME=greeting-pojo
$ echo '{"name":"Micronaut"}' | ./function-graal
```
