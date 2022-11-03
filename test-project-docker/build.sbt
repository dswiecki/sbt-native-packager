enablePlugins(JavaAppPackaging, AshScriptPlugin)

name := "docker-test"
version := "0.1.0"

maintainer := "Gary Coady <gary@lyranthe.org>"
dockerBaseImage := "openjdk:8-jre-alpine"
dockerUpdateLatest := true
dockerBuildxPlatforms := Seq("linux/arm64/v8", "linux/amd64")
dockerUsername := Some("dswiecki")
