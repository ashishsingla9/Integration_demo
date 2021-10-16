pipeline {
    agent any

    stages {
        stage('clean') {
            steps {
               
                echo 'cleaning'
                
            }
        }
        stage('build') {
            steps {
               
                bat 'mvn package'
            }
        }
        
        
    }
}
