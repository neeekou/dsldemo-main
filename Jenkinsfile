pipeline {
    agent any
    triggers {
        cron('* * * * *')
    }
    environment {
    DOT_NET="C:\\Program Files\\dotnet\\dotnet.exe"
    DOT_NET_COMPILER="dotnet"
    }
    stages {
        stage('Build') {
            steps {
                echo 'Building..'
            }
        }
        stage('Test') {
            steps {
                bat """$DOT_NET_COMPILER --version"""
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}