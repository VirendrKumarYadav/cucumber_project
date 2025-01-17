pipeline {
    agent any

    stages {

      stage('Pre-check') {
        steps {
            sh 'mvn -version'
            sh 'java -version'
          }
       }          
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/VirendrKumarYadav/cucumber_project.git'
            }
        }
        stage('Build') {
            steps {
                sh './build.sh' 
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
