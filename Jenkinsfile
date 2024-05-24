@Library('my-shared-library') _
pipeline{
    agent any
        environment {
        MAVEN_OPTS = "--add-exports jdk.compiler/com.sun.tools.javac.processing=ALL-UNNAMED"
        JAVA_HOME = "/usr"
        PATH = "${JAVA_HOME}/bin:${env.PATH}"
    }
    stages{
        stage('Git Checkout'){
              steps{
                script{
                    gitCheckout(
                        branch: "main",
                        url: "https://github.com/prafullb007/mrdevopps_java_apps.git"
                    )

                    

                }

            }
        }
        stage('Unit Test Maven'){
              steps{
                script{
                    withEnv(["MAVEN_OPTS=--add-exports jdk.compiler/com.sun.tools.javac.processing=ALL-UNNAMED"]) {
                        sh 'mvn clean install -e -X'
                    }

                }

            }
        }
    }
}
