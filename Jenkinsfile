pipeline {
    agent any
    triggers {
        cron('* * * * *')
    }
    environment {
    DOT_NET="'C:\\Program Files\\dotnet\\dotnet.exe'"
    }
    stages {
        stage('Build') {
            steps {
                echo 'Building..'
            }
        }
        stage('Test') {
            steps {
                sh "$DOT_NET --version"
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