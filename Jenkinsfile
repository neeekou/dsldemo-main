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
            steps {
                parallel (
                "Taskone" : {
                    for(x in 1...5){
                    println x
                    }
                }
                "Tasktwo" : {
                    for(x in 6...10){
                    println x
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