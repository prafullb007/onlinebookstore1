@Library('my-shared-library') _
pipeline {
    agent any

    parameters {
        choice(name: 'action', choices: ['create', 'delete'], description: 'Choose create/destroy')
    }

    tools {
        maven "Maven_Home"
    }

    stages {
        stage('Clean Workspace') {
            when { expression { params.action == 'create' } }
            steps {
                cleanWs()
            }
        }

        stage('Git Checkout') {
            when { expression { params.action == 'create' } }
            steps {
                script {
                    gitCheckout(
                        branch: "main",
                        url: "https://github.com/prafullb007/onlinebookstore1.git"
                    )
                }
            }
        }

        stage('Unit Test Maven') {
            when { expression { params.action == 'create' } }
            steps {
                script {
                    mvnTest()
                }
            }
        }

        stage('Integration Test Maven') {
            when { expression { params.action == 'create' } }
            steps {
                script {
                    mvnintegrationTest()
                }
            }
        }
        stage('Sonar Static Code Analysis') {
            when { expression { params.action == 'create' } }
            steps {
                script {
                    staticCodeAnalysis('sonar-api')
                }
            }
        }
    }
}
