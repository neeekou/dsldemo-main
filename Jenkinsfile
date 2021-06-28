pipeline {
    agent any
    triggers {
        cron('* * * * *')
    }
    environment {
    DOT_NET="'C:\\Program Files\\dotnet'"
    }
    stages {
        stage('Build') {
            steps {
                echo 'Building..'
            }
        }
        stage('Test') {
            steps {
                bat "$DOT_NET\\dotnet.exe --version"
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