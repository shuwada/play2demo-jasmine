name := "AngularJSTest"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
)

play.Project.playScalaSettings

seq(jasmineSettings : _*)

appJsDir <+= baseDirectory { src => src / "app" / "assets" / "javascripts" }

appJsLibDir <+= baseDirectory { src => src / "public" / "javascripts" / "lib" }

jasmineTestDir <+= baseDirectory { src => src / "test" / "assets" }

jasmineConfFile <+= baseDirectory { src => src / "test" / "assets" / "test.dependencies.js" }

//jasmineRequireJsFile <+= baseDirectory { src => src / "main" / "webapp" / "static" / "js" / "lib" / "require" / "require-2.0.6.js" }

//jasmineRequireConfFile <+= baseDirectory { src => src / "test" / "webapp" / "static" / "js" / "require.conf.js" }

(test in Test) <<= (test in Test) dependsOn (jasmine)
