pipeline {
    agent any
    stages {
        stage('Jenkins Inscricao') {
            steps {
                echo 'Jenkins Inscricao'
            }
        }
        stage('Build') { 
            steps {
                sh 'mvn clean install'
            }
        }      
    }
}