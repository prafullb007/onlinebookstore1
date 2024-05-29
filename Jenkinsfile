@Library('my-shared-library') _
pipeline{
    agent any
        tools {
        maven "Maven_Home"
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
                        url: "https://github.com/prafullb007/onlinebookstore1.git"
                    )

                    

                }

            }
        }
        stage('Unit Test Maven'){
              steps{
                script{
                    mvnintegrationTest()
                    }

                }

            }
        }
    }
