pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/VirendrKumarYadav/cucumber_project.git'
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
                sh './deploy.sh'  
            }
        }
    }
}
