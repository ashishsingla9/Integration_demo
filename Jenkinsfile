pipeline {
    agent any
    tools {
        maven "MAVEN"
        jdk "JDK"
    }
    stages {
        stage('Initialize'){
            steps{
                echo "PATH = ${M2_HOME}/bin:${PATH}"
                 }
           }
        stage('clean') {
            steps {
                dir("C:\Windows\System32\config\systemprofile\AppData\Local\Jenkins\.jenkins\workspace\TestPipeline") {
                sh 'mvn -B -DskipTests clean'
                }
            
                  }
                       }
    }

}

