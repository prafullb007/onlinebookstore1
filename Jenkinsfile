@Library('my-shared-library') _
pipeline{
    agent any

    parameters{
        choice(name: 'action', choices: 'create\ndelete',description:'choose create/destroy')
    }
        tools {
        maven "Maven_Home"
    }
    
    stages{
        when {expression {params.action=='create'}}  
        stage('Clean Workspace') {
            steps {
                cleanWs()
            }
        }
        
        stage('Git Checkout'){
            when {expression {params.action=='create'}} 
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
            when {expression {params.action=='create'}}
              steps{
                script{
                    mvnTest()
                    }

                }

            }
            stage('IntegrationTest Maven'){
            when {expression {params.action=='create'}}
              steps{
                script{
                    mvnintegrationTest()
                    }

                }

            }
 
        }
    }
