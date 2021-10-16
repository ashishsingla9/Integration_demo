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
               
                bat 'mvn -B -DskipTests clean'
                
            
                  }
                       }
    }

}

