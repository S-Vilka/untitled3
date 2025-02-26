pipeline {
    agent any 
    stages {
        stage('Checking') { 
            steps {
                git branch: 'main', url: 'https://github.com/S-Vilka/untitled3.git'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }
    }
}
