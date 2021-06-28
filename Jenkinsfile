pipeline {
    agent any
    triggers {
        cron('5 * * * *')
    }
    environment {
    DOT_NET="C:\\Program Files\\dotnet\\dotnet.exe"
    DOT_NET_COMPILER="dotnet"
    }
    stages {
        stage('Check Compiler') {
            steps {
                echo 'Checking env...'
                bat """$DOT_NET_COMPILER --version"""
            }
        }
        stage('Check env') {
            when { not {branch 'main'} }
            environment { 
                INSTANCE = "test
            }
            steps {
                echo $test
            }
        }
        stage('Build') {
            steps {
                echo 'Building..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}