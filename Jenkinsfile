@Library('my-shared-library') _
pipeline{
    agent any
        tools {
        maven "Maven_Home"
    }
        environment {
        JAVA_HOME = "/usr/lib/jvm/java-21-openjdk-amd64"
        PATH = "${JAVA_HOME}/bin:${env.PATH}"
    }
    stages{
        stage('Clean Workspace') {
            steps {
                cleanWs()
            }
        }
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
                    mvnTest()
                    }

                }

            }
        }
    }
