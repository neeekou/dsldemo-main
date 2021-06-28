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
                        script {
                            for(x in 1..5){
                                println x
                            }
                        }
                    }
                }
                stage('Pre-build 2') {
                    steps {
                        script {
                            class Student {
                               private int StudentID;
                               private String StudentName;
	
                               void setStudentID(int pID) {
                                  StudentID = pID;
                               }
	
                               void setStudentName(String pName) {
                                  StudentName = pName;
                               }
	
                               int getStudentID() {
                                  return this.StudentID;
                               }
	
                               String getStudentName() {
                                  return this.StudentName;
                               }
	
                               static void main(String[] args) {
                                  Student st = new Student();
                                  st.setStudentID(1);
                                  st.setStudentName("Joe");
		
                                  println(st.getStudentID());
                                  println(st.getStudentName());
                               } 
                            }
                        }
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