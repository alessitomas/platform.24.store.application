pipeline {
    agent any
    stages {
        stage('Jenkins Candidatura') {
            steps {
                echo 'Jenkins Candidatura'
            }
        }
        stage('Build') { 
            steps {
                sh 'mvn clean install'
            }
        }      
    }
}