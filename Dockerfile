FROM oracle/graalvm-ce:1.0.0-rc13 as graalvm
COPY . /home/app/function-graal
WORKDIR /home/app/function-graal
RUN native-image --no-server -cp build/libs/function-graal-*.jar

FROM frolvlad/alpine-glibc
EXPOSE 8080
COPY --from=graalvm /home/app/function-graal .
ENTRYPOINT ["./function-graal"]
