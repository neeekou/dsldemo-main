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
                INSTANCE = "TEST"
            }
            steps {
                bat "echo $INSTANCE"
            }
        }
        stage('Pre-Build') {
                parallel {
                    stage('Pre-build 1') {
                        steps {
                            echo 'Deploying....'
                        }
                    }
                    stage('Pre-build 2') {
                        steps {
                        echo 'Deploying....'
                        }
                    }
                }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}