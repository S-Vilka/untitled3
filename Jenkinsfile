pipeline {
    agent any
    tools {
        maven 'Maven3'
    }
    stages {
        stage('Checkout Code') {
            steps {
                git branch: 'main', url: 'https://github.com/S-Vilka/untitled3.git'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('Test & Coverage') {
            steps {
                sh 'mvn test jacoco:report' // Runs tests & generates Jacoco coverage report
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml' // Publish JUnit test results
                    jacoco execPattern: '**/target/jacoco.exec',
                           classPattern: '**/target/classes',
                           sourcePattern: '**/src/main/java',
                           exclusionPattern: '**/test/**'
                }
            }
        }
    }
    post {
        failure {
            echo 'Build failed! Check logs for errors.'
        }
        success {
            echo 'Build completed successfully!'
        }
    }
}