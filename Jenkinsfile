@Library('my-shared-library') _
pipeline{
    agent any
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
                    mvnTest()
                }

            }
        }
    }
}