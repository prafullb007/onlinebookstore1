def call(String sonarqubeCredentialsId) {
    withSonarQubeEnv('MySonarQubeServer') {
        withCredentials([string(credentialsId: sonarqubeCredentialsId, variable: 'SONAR_API_TOKEN')]) {
            // Increase the SonarQube web service timeout
            sh 'mvn sonar:sonar -Dsonar.ws.timeout=120 -Dsonar.login=$SONAR_API_TOKEN'
        }
    }
}