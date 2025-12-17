pipeline {
    agent any

    tools {
        maven 'Maven3'   // match this with Jenkins tool name
    }

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build & Test') {
            steps {
                sh 'mvn clean test'
            }
        }
    }

    post {
        always {
            publishHTML(target: [
                reportDir: '.',              // root folder
                reportFiles: '*_ExtentReport.html',
                reportName: 'Automation Test Report',
                keepAll: true,
                alwaysLinkToLastBuild: true,
                allowMissing: false
            ])
        }
    }
}
