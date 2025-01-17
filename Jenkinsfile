pipeline {
    agent any
    tools {
        maven 'Maven' 
        jdk 'JDK'     
    }
    environment {
        REPORT_DIR = 'target/test-output' 
    }
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/VirendrKumarYadav/cucumber_project.git'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Deploy') {
            steps {
                sh './deploy.sh' // Replace with your deployment script/command
            }
        }
    }
    post {
        always {
            // Publish TestNG results
            publishTestNGResults testResultsPattern: '**/target/test-output/testng-results.xml', 
                                  unstableSkips: true
            
            // Archive the entire test-output directory
            archiveArtifacts artifacts: '**/target/test-output/**/*', fingerprint: true
        }
        success {
            emailext(
                subject: "Build SUCCESS: ${env.JOB_NAME} #${env.BUILD_NUMBER}",
                body: """
                <h3>The build succeeded!</h3>
                <p>Build Details:</p>
                <ul>
                    <li>Job: ${env.JOB_NAME}</li>
                    <li>Build Number: ${env.BUILD_NUMBER}</li>
                    <li>View Reports: <a href="${env.BUILD_URL}">${env.BUILD_URL}</a></li>
                </ul>
                <p>TestNG reports are available under the 'Test Result' tab in Jenkins.</p>
                """,
                recipientProviders: [[$class: 'DevelopersRecipientProvider']],
                mimeType: 'text/html'
            )
        }
        failure {
            emailext(
                subject: "Build FAILURE: ${env.JOB_NAME} #${env.BUILD_NUMBER}",
                body: """
                <h3>The build failed!</h3>
                <p>Build Details:</p>
                <ul>
                    <li>Job: ${env.JOB_NAME}</li>
                    <li>Build Number: ${env.BUILD_NUMBER}</li>
                    <li>View Logs: <a href="${env.BUILD_URL}">${env.BUILD_URL}</a></li>
                </ul>
                <p>Check logs and TestNG reports to identify issues.</p>
                """,
                recipientProviders: [[$class: 'DevelopersRecipientProvider']],
                mimeType: 'text/html'
            )
        }
    }
}
